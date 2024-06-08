package zooanimals;

public interface iAnimal extends Comparable<iAnimal>{

	String getAnimalType();

	int getIdTag();

	void setIdTag(int anIdTag);

	int getMinTemperature();

	int getMaxTemperature();

	int compareTo(Dolphin otherDolphin);

	int compareTo(Hawk otherHawk);
}