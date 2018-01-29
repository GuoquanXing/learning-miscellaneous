public class TodoItemAgent {

    private TodoItem todoItem;

    private TodoItemAgent(){
    }

    public static TodoItemAgent createNewTodoItemAgent(){
        return new TodoItemAgent();
    }

    public TodoItemAgent newTodoItem(int id, String desc){
         todoItem = new TodoItem(id, desc);
         return this;
    }

    void tickTodoItem(){
        if(!this.todoItem.isTicked()){
            this.todoItem.setTicked(true);
        }
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }
    class TodoItem {

        private long id;
        private String desc;
        private boolean ticked = false;

        public TodoItem(int id, String desc){
            this.setId(id);
            this.setDesc(desc);
            this.setTicked(false);
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public boolean isTicked() {
            return ticked;
        }

        public void setTicked(boolean ticked) {
            this.ticked = ticked;
        }
    }
}
