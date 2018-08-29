/*
 * This file is generated by jOOQ.
 */
package test.generated;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import test.generated.tables.Author;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Library extends SchemaImpl {

    private static final long serialVersionUID = -1598389450;

    /**
     * The reference instance of <code>library</code>
     */
    public static final Library LIBRARY = new Library();

    /**
     * The table <code>library.author</code>.
     */
    public final Author AUTHOR = test.generated.tables.Author.AUTHOR;

    /**
     * No further instances allowed
     */
    private Library() {
        super("library", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR);
    }
}
