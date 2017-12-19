package com.guoquan.usage_json_view;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.monitorjbl.json.JsonView;
import com.monitorjbl.json.JsonViewModule;
import static com.monitorjbl.json.Match.match;

public class SampleUsage {

	// initialize jackson
	ObjectMapper mapper = null;
	// list of the objects
	List<MyObject> list = null;

	public static void main(String[] args) {

		SampleUsage su = new SampleUsage();

		su.mapper = new ObjectMapper().registerModule(new JsonViewModule());
		su.list = MyObjectFactory.createMyObjectList(10);

		System.out.println(su.getJSONStringOriginal());
		System.out.println(su.getJSONStringTrimed());

	}

	String getJSONStringTrimed() {
		String jsonAft = null;

		// exclude expensive field
		try {
			jsonAft = mapper
					.writeValueAsString(JsonView.with(list).onClass(MyObject.class, match().exclude("contains")));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonAft;
	}

	String getJSONStringOriginal() {
		String jsonPre = null;
		try {
			jsonPre = mapper.writeValueAsString(JsonView.with(list).onClass(MyObject.class, match()));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonPre;
	}

}
