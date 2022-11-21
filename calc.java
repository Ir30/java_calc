import java.util.Scanner;

class calc{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number: ");
        float first=sc.nextFloat();

        System.out.println("enter the second number: ");
        float second=sc.nextFloat();

        System.out.println("Choose the operation");
        System.out.println("---------------------");
        System.out.println("1:Addition");
        System.out.println("2:Substraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division"); 
        System.out.println("5:exit");

        System.out.println("---------------------");
        System.out.println();
        
        int choice= sc.nextInt();
        float result=0;
        switch(choice){
            case 1:{
                result=first+second;
                break;
            }
            case 2:{
                result=first-second;
                break;
            }
            case 3:{
                result=first*second;
                break;
            }
            case 4:{
                result=first/second;
                break;
            }
            case 5:
            break;
            

        }
        
        System.out.println("answer: "+result);
    }
}