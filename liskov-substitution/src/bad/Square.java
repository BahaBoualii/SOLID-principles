package bad;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = this.width = height;
    }
}
