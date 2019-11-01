public class Point2D {
    private float x = 3.0f;
    private float y = 1.0f;
    private float [] arr = {x, y};

    public Point2D(){

    }

    public  Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    public void getXY(){
        for (int i = 0; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public String toString(){
        return super.toString();
    }
}
