public class SaveableTestDrive{
    public static void main(String[] args){
        Player player = new Player("name", "axe", 67, 9);
        System.out.println(player.write().toString());
    }
}