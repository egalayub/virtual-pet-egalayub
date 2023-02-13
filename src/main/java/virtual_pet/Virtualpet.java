package virtual_pet;

public class  Virtualpet implements Pets {

    public String petName;
    public String petType;

    public Virtualpet(String petName,String petType) {
        this.petName = petName;
        this.petType = petType;
    }


@Override
    public void walkOrganicPet() {

    }
}

