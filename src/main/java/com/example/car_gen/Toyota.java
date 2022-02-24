package com.example.car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;
    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }
    public boolean getGreatGasMileage(){
        return greatGasMileage;
    }
    public void setGreatGasMileage(boolean greatGasMileage){
        this.greatGasMileage = greatGasMileage;
    }
}
