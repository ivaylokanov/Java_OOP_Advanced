package pr06_birthdayCelebrations;


public class Robot implements Identifiable{
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }


    @Override
    public boolean getDetained(String detainedId) {
        if (this.id.endsWith(detainedId)){
            return true;
        }
        return false;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
