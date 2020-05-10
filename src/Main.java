public class Main {

    public static void main(String[] args) {
        Wrapper<Integer> list = new Wrapper<Integer>();

        try{
            list.addItem(1);
            list.addItem(1);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("\nList all from inputted");
        for (int i=0 ; i< list.mylist.size(); i++){
            System.out.println(list.mylist.get(i));
        }
    }
}
