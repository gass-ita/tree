public class App {
    public static void main(String[] args) throws Exception {
        Tree t = new Tree();
        t.insert(5);
        t.insert(3);
        t.insert(7);
        t.insert(2);
        t.insert(4);
        t.insert(6);
        t.insert(8);
        t.insert(1);
        t.insert(9);
        

        System.out.println(t.toString());

    }
}
