public class TodoItemAgent {

    private  TodoItem todoItem;

    public TodoItemAgent(TodoItem todoItem){
        this.todoItem = todoItem;
    }

    void tickTodoItem(){
        if(!this.todoItem.isTicked()){
            this.todoItem.setTicked(true);
        }
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }
}
