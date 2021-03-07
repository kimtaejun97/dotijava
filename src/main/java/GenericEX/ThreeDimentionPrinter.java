package GenericEX;

public class ThreeDimentionPrinter<T extends Material>{
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;

    }
}
