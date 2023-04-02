import java.util.Scanner;

public class LinearQueueDemo {
public static void main(String[] args) {
	int choice,element;
	Queue q=new Queue();
	Scanner sc=new Scanner(System.in);
;	do
	{
		System.out.println("*****QUEUE MENU*****");
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Display");
		System.out.println("4. Exit");
		
		System.out.println("Please Enter Your Choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
				System.out.println("Enter Element to Insert");
				element=sc.nextInt();
				q.insert(element);
				break;
		case 2:
				element=q.remove();
				System.out.println(element +" Removed");
				
				break;
		case 3: 
				q.display();
				break;
		case 4:
				System.exit(0);
		default :
			   System.out.println("Enter Valid Input");
		}
	}while(true);
}
}
