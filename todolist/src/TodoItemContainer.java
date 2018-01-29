import java.util.ArrayList;

public class TodoItemContainer {

    private  ArrayList<TodoItemAgent> al_todoItemAgents;

    public TodoItemContainer(){
        al_todoItemAgents = new ArrayList<TodoItemAgent>();
    }

    ArrayList<TodoItemAgent> getAl_todoItemAgents() {
        return al_todoItemAgents;
    }

    void add(TodoItemAgent todoItemAgent){
        al_todoItemAgents.add(todoItemAgent);
    }

    void remove(TodoItemAgent todoItemAgent) {
        al_todoItemAgents.remove(todoItemAgent);
    }

    void removeTickedTodoItem(){
        for (int i = 0; i < al_todoItemAgents.size(); i++ ){
            if (al_todoItemAgents.get(i).getTodoItem().isTicked()){
                al_todoItemAgents.remove(i);
            }
        }
    }

}
