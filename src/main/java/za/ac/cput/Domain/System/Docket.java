package za.ac.cput.Domain.System;

public class Docket {

    private String docketID;

    private Docket(){}

    private Docket(Builder builder){
        this.docketID = builder.docketID;
    }

    public String getDocketID(){
        return docketID;
    }

    public static class Builder{

        private String docketID;

        public Builder docketID(String docketID){
            this.docketID = docketID;
            return this;
        }

        public Builder copy(Docket docket){
            this.docketID = docket.docketID;
            return this;
        }

        public Docket build(){
            return new Docket(this);
        }
    }

    public String toString(){
        return "Docket ID: " + docketID;
    }
}
