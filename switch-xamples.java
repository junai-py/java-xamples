public class Switch {
    public static void main(String[] args){
        int svar=4;
        switch(svar){
            case 1:
                System.out.println("this is one");
                break;
            case 2:
                System.out.println("this os two");
                break;
            case 3: case 4: case 5:
                System.out.println("this is may be 3 or 4 or 5");
                break;

            default:
                System.out.println("this is default");
                break;

        }
        char schar= 'a';
        switch (schar){
            case 'a':
                System.out.println("This ia a");
                break;
            case 'c' :
                System.out.println("this is c");
                break;
            default:
                System.out.println("this is default");
        }
        String name="ABCD";
        switch (name.toLowerCase()){
            case "abcd":
                System.out.println("this is abcd");
                break;
            default:
                System.out.println("trhis is default");
        }
    }

}

