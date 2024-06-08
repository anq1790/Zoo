package zooanimals;

public class Dolphin implements iAnimal{

    private String animalType;
    private int idTag;
    private int minTemperature; // in celsius
    private int maxTemperature; // in celsius

    public Dolphin(int idTag)
    {
        this.animalType = "Dolphin";
        this.idTag = idTag;
        this.minTemperature = -20;
        this.maxTemperature = 40;
    }

    @Override
    public String getAnimalType()
    {
        return this.animalType;
    }

    @Override
    public int getIdTag()
    {
        return this.idTag;
    }

    @Override
    public void setIdTag(int anIdTag)
    {
        this.idTag = anIdTag;
    }

    @Override
    public int getMinTemperature()
    {
        return this.minTemperature;
    }

    @Override
    public int getMaxTemperature()
    {
        return this.maxTemperature;
}
    @Override
    public int compareTo(Dolphin otherDolphin) {
        return Integer.compare(this.getIdTag(), otherDolphin.getIdTag());
    }
}
