import java.util.Scanner;

public class TodoItemUsage {

    private TodoItemContainer todoItemContainer;

    public TodoItemUsage(){
        //By default we build a todoItemContainer with 5 initialized item
        int n = 5;
        int tmp = 1;

        todoItemContainer = new TodoItemContainer();
        while (tmp < n) {
            TodoItemAgent todoItemAgent = TodoItemAgent.createNewTodoItemAgent().newTodoItem(tmp, "Clean desk No. + " + tmp);
            todoItemContainer.add(todoItemAgent);
            tmp++;
        }
    }

    public static void main(String[] args) {

        TodoItemUsage todoItemUsage = new TodoItemUsage();
        TodoItemContainer todoItemContainer = todoItemUsage.getTodoItemContainer();
        todoItemContainer.removeTickedTodoItem();
        todoItemUsage.printTodoItems(todoItemContainer);

        Scanner scanner = new Scanner(System.in);
        String name;
        while (true){
            name = scanner.nextLine();
            todoItemUsage.checkAndParseInput(name, todoItemContainer);
            todoItemContainer.removeTickedTodoItem();
            todoItemUsage.printTodoItems(todoItemContainer);
        }
    }

    void printTodoItems(TodoItemContainer todoItemContainer){
        System.out.println("---{Printing TodoItems List---");
        System.out.println("Amount of agents in TodoItemContainer: " + todoItemContainer.getAl_todoItemAgents().size());
        for (TodoItemAgent todoItemAgent:todoItemContainer.getAl_todoItemAgents()) {
            if (! todoItemAgent.getTodoItem().isTicked()){
                System.out.print("ID:" + todoItemAgent.getTodoItem().getId() + " ");
                System.out.print("Ticked:" + todoItemAgent.getTodoItem().isTicked() + " ");
                System.out.print("Desc:" + todoItemAgent.getTodoItem().getDesc());
                System.out.println();
            }
        }
        System.out.println("---Printing TodoItems List}---");
    }

    /***
     * when you input the todoItem ID in console and press enter, the item with that ID would be removed
     * when you input "add 'Desc'", it will add a new todoItem
     * @param str
     * @param todoItemContainer
     */
    void checkAndParseInput(String str, TodoItemContainer todoItemContainer){
        TodoItemAgent todoItemAgent;
        try {
            if(str.startsWith("add") && str.substring(3,4).equals(" ")){    // the pattern is "add desc"
                todoItemAgent = TodoItemAgent.createNewTodoItemAgent().newTodoItem(todoItemContainer.getAl_todoItemAgents().size() + 1,str.substring(4));
                todoItemContainer.add(todoItemAgent);
            }else{
                todoItemAgent = todoItemContainer.getAl_todoItemAgents().get(Integer.parseInt(str)-1);
                todoItemAgent.tickTodoItem();
            }
        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }

    TodoItemContainer getTodoItemContainer() {
        return todoItemContainer;
    }

}
