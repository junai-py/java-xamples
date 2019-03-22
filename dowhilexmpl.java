public class dowhilexmpl {
    public static void main(String[] args){
        int i=1;
        int count=0;
        do{

            System.out.println(i);
            System.out.println("loop count" +count);
            count++;
            i++;
            System.out.println("i value is"+i);

        }while (i<=10);
    }
}
