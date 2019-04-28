package za.ac.cput.Domain;

public class Convict {

    private String convictID, convictName, convictSurname, natureOfConviction;

    private Convict(){}

    private Convict(Builder builder){
        this.convictID = builder.convictID;
        this.convictName = builder.convictName;
        this.convictSurname = builder.convictSurname;
        this.natureOfConviction = builder.natureOfConviction;
    }

    public String getConvictID() {
        return convictID;
    }

    public String getConvictName() {
        return convictName;
    }

    public String getConvictSurname() {
        return convictSurname;
    }

    public String getNatureOfConviction() {
        return natureOfConviction;
    }

    public static class Builder{

        private String convictID, convictName, convictSurname, natureOfConviction;

        public Builder convictID(String convictID){
            this.convictID = convictID;
            return this;
        }

        public Builder convictName(String convictName){
            this.convictName = convictName;
            return this;
        }

        public Builder convictSurname(String convictSurname){
            this.convictSurname = convictSurname;
            return this;
        }

        public Builder natureOfConviction(String natureOfConviction){
            this.natureOfConviction = natureOfConviction;
            return this;
        }

        public Convict build(){
            return new Convict(this);
        }
    }

    public String toString(){
        return "Details of convicted suspect" + "\n" + "ID: " + convictID + "\n" + "Name: " + convictName + "\n" + "Surname: " + convictSurname + "\n" + "Convicted of: " + natureOfConviction;
    }
}
