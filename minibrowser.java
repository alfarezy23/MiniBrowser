import java.util.Scanner;
import java.util.Stack;

public class minibrowser {
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner(System.in);
        String answer = "1";
        Stack<String>urls=new Stack<>();
        System.out.println("\n1. Enter the url \n2. Back to the previous \n3. Show the current url \n4. Show the history of the urls visited \n5. Exit the program");
        do{
            System.out.println("\nEnter your choice (1-5): ");
            answer= inputx.nextLine();
if (answer.equals("1")) {
    System.out.println("Enter url");
    String url=inputx.nextLine();
    urls.push(url);
}else if(answer.equals("2")){
    if (urls.size()>1){
        urls.pop();
        System.out.println("Current url"+ urls.peek());
    }else{
        System.out.println("No way back to previous url\n");
    }
}else if (answer.equals("3")){
    System.out.println("Current url"+ urls.peek());
}else if (answer.equals("4")){
    System.out.println(urls);
}
        }while(!answer.equals("5"));
        inputx.close();
    }
}
