package exercise3.models;

import java.util.ArrayList;
import java.util.List;

public class ExaminationBlock {
    private String name;
    private List<Subject> subjectList = new ArrayList<>();

    public ExaminationBlock(String name, List<Subject> subjectList) {
        this.name = name;
        this.subjectList = subjectList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExaminationBlock{" +
                "name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
