public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
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

    public void setZ(float z) {
        this.z = z;
    }
    
}
