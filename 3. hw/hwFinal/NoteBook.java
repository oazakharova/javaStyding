import java.util.Objects;

public class NoteBook {

    private int id;
    private String brand;
    private String model;
    private int ram;
    private int hardDiskCapacity;
    private String os;
    private String colour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof NoteBook))
            return false;
        NoteBook noteBook = (NoteBook) o;
        return getId() == noteBook.getId() && getRam() == noteBook.getRam()
                && getHardDiskCapacity() == noteBook.getHardDiskCapacity() && getBrand().equals(noteBook.getBrand())
                && getModel().equals(noteBook.getModel()) && getOs().equals(noteBook.getOs())
                && getColour().equals(noteBook.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBrand(), getModel(), getRam(), getHardDiskCapacity(), getOs(), getColour());
    }

    public NoteBook(int id, String brand, String model, int ram, int hardDiskCapacity, String os, String colour) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hardDiskCapacity = hardDiskCapacity;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
