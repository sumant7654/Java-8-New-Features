package dev.sumantakumar.functionalinterface.function;

public class StudentGrade {
    private String name;
    private Integer mark;

    public StudentGrade(String name, Integer mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
