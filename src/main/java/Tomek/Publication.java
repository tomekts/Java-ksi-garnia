package Tomek;

public  class Publication {
     String title;
     String value;

    public Publication(String title, String value) {
        this.title = title;
        this.value = value;

    }
    public Publication() {

    }

    void gene(String title){

    }

    void gene(){}

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
