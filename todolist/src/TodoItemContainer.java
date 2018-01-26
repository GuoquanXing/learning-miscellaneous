import java.util.ArrayList;
import java.util.Scanner;

public class TodoItemContainer {

    public ArrayList<TodoItemAgent> al_todoItemAgent;

    public TodoItemContainer(){
        al_todoItemAgent = new ArrayList<TodoItemAgent>();
    }

    public static void main(String[] args){
        String name;
        int n = 5;
        int tmp = 1;

        TodoItemContainer tic = new TodoItemContainer();
        while (tmp < n){
            TodoItemAgent tig = new TodoItemAgent(new TodoItem(tmp,"Clean desk No. + " + tmp));
            tic.al_todoItemAgent.add(tig);
            tmp++;
        }
        tic.printTodoItems(tic.al_todoItemAgent);

        Scanner scanner = new Scanner(System.in);
        while(true){

            name = scanner.nextLine();
            tic.checkInput(name);
            tic.printTodoItems(tic.al_todoItemAgent);
        }

    }

    void printTodoItems(ArrayList<TodoItemAgent> alti){
        for (TodoItemAgent todoItemAgent:alti) {
            System.out.print("ID:" + todoItemAgent.getTodoItem().getId() + " ");
            System.out.print("Ticked:" + todoItemAgent.getTodoItem().isTicked() + " ");
            System.out.print("Desc:" + todoItemAgent.getTodoItem().getDesc());
            System.out.println();
        }
    }
    void checkInput(String str){
        boolean isValidInput = false;
        for (TodoItemAgent todoItemAgent:this.al_todoItemAgent) {
            String tmp_str = Long.toString(todoItemAgent.getTodoItem().getId());
            if (str.equals(tmp_str)){
                this.al_todoItemAgent.remove(todoItemAgent);
                isValidInput = true;
            }
        }
        if(!isValidInput){
            System.out.println("Invalid Input");
        }
    }


}
