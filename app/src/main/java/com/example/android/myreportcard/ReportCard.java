package com.example.android.myreportcard;

/**
 * Created by Eleonore on 22/06/2017.
 */

public class ReportCard {

    //Variables for year, studentname and grades for the subjects
    private Integer year;
    private String studentName;
    private Integer biology;
    private Integer math;
    private Integer english;
    private Integer geography;
    private Integer music;

    /**
     * Constructs a new ReportCard with initial values for the year, student name & grades for this student
     *
     * @param Year        The year of study
     * @param StudentName The name of the student
     * @param Biology     The grade for Biology
     * @param Math        The grade for Math
     * @param English     The grade for English
     * @param Geography   The grade for Geography
     * @param Music       The grade for Music
     */

    public ReportCard(Integer Year, String StudentName, Integer Biology, Integer Math, Integer English, Integer Geography, Integer Music) {
        year = Year;
        studentName = StudentName;
        biology = Biology;
        math = Math;
        english = English;
        geography = Geography;
        music = Music;
    }

    //getter methods for the year, student name & grades for this student
    public Integer getYear() {
        return year;
    }

    //setter methods for the year, student name & grades for this student
    public void setYear(Integer Year) {
        this.year = Year;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String StudentName) {
        this.studentName = StudentName;
    }

    public Integer getBiology() {
        return biology;
    }

    public void setBiology(Integer Biology) {
        this.biology = Biology;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer Math) {
        this.math = Math;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer English) {
        this.english = English;
    }

    public Integer getGeography() {
        return geography;
    }

    public void setGeography(Integer Geography) {
        this.geography = Geography;
    }

    public Integer getMusic() {
        return music;
    }

    public void setMusic(Integer Music) {
        this.music = Music;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Year: ").append(year)
                .append("\nStudent: ").append(studentName)
                .append("\nBiology: ").append(biology)
                .append("\nMath: ").append(math)
                .append("\nEnglish: ").append(english)
                .append("\nGeography: ").append(geography)
                .append("\nMusic: ").append(music)
                .toString();
    }
}
