public class PatientImpl implements Patient {

    public Integer age;
    public String name;

    public PatientImpl(String name, Integer age){

        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("age is out of range");
        }
        this.name = name;
        this.age = age;

    }

    public Integer getAge(){

        return this.age;

    }

    public String getName(){

        return this.name;

    }


}
