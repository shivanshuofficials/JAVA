package Strings;

public class shortest_Path {
    public static float paths(String Path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < Path.length(); i++) {
            char dir = Path.charAt(i);
            // south 
            if (dir == 'S'){
                y--;
            }
            // north
            else if (dir == 'N'){
                y++;
            }
            // east
            else if (dir == 'E'){
                x++;
            }
            // west
            else if (dir == 'W'){
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println( "Shortest Path is : " + paths(Path));
    }
}
