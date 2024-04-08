package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double point;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.point = 0.0; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double Point) {
        this.point = Point;
    }
    
    public void addPoint(double add) {
        this.point += add;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.print("Point: ");
        if (point < 4.0) {
            System.out.println("Yếu");
        } else if (point < 6.0) {
            System.out.println("Trung bình");
        } else if (point < 8.0) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}
