package ru.mirea.prak_3_2;

public class Human {
    private double height;
    private double weight;
    private String name;
    private String surname;

    public Human(double height, double weight, String name, String surname) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public class Head {
        private String hairColor;
        private String eyeColor;
        private String shapeHead;

        public Head(String hairColor, String eyeColor, String shapeHead) {
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.shapeHead = shapeHead;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        public void setShapeHead(String shapeHead) {
            this.shapeHead = shapeHead;
        }

        public String getHairColor(){
            return hairColor;
        }

        public String getEyeColor(){
            return eyeColor;
        }

        public String getShapeHead() {
            return shapeHead;
        }

        public String toString() {
            return "Head{" +
                    "hairColor='" + hairColor + '\'' +
                    ", eyeColor='" + eyeColor + '\'' +
                    ", shapeHead='" + shapeHead + '\'' +
                    '}';
        }
    }

    public class Hand {
        private double armLength;
        private int numFingers;
        private double finLength;

        public Hand(double armLength, int numFingers, double finLength){
            this.armLength = armLength;
            this.numFingers = numFingers;
            this.finLength = finLength;
        }

        public double getArmLength() {
            return armLength;
        }

        public double getFinLength() {
            return finLength;
        }

        public double getNumFingers(){
            return numFingers;
        }

        public void setArmLength(double armLength) {
            this.armLength = armLength;
        }

        public void setFinLength(double finLength) {
            this.finLength = finLength;
        }

        public void setNumFingers(int numFingers) {
            this.numFingers = numFingers;
        }

        public String toString() {
            return "Hand{" +
                    "armLength=" + armLength +
                    ", numFingers=" + numFingers +
                    ", finLength=" + finLength +
                    '}';
        }
    }

    public class Leg {
        private double legLength;
        private double footSize;

        public Leg(double legLength, double footSize){
            this.legLength = legLength;
            this.footSize = footSize;
        }

        public void setFootSize(double footSize) {
            this.footSize = footSize;
        }

        public void setLegLength(double legLength) {
            this.legLength = legLength;
        }

        public double getLegLength(){
            return legLength;
        }

        public double getFootSize(){
            return footSize;
        }

        public String toString() {
            return "Leg{" +
                    "legLength=" + legLength +
                    ", footSize=" + footSize +
                    '}';
        }
    }
}
