
public abstract class Invert implements ByteGrayColor, Transform{
    @Override
    public void applyTo(GrayImage image) {
        for(int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                invert(image, x, y);
            }
        }
    }

    private void invert(GrayImage image, int x, int y) {
        int newGrayLevel = image.getMaximumGrayLevel(x, y) - image.getGraylevel(x,y);
        image.setGrayLevel(newGrayLevel,x,y);
    }
}