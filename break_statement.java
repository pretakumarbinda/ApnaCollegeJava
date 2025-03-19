// public class break_statement{
//     public static void main(String[] args){
//         int i =0;
//        while(i<5){
//         i=i+1;
//         System.out.println(i);
//        }
//     }
// }


//                                  uses of break

public class break_statement{
    public static void main(String[] args) {
        int i=1;
        while(true){
            if(i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if(i>5){
                break;
            }
        }
    }}
