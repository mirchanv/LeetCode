class ParkingSystem {
    int bigSpacesLeft;
    int mediumSpacesLeft;
    int smallSpacesLeft;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSpacesLeft = big;
        this.mediumSpacesLeft = medium;
        this.smallSpacesLeft = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && bigSpacesLeft > 0) {
            bigSpacesLeft--;
            return true;
        }

        if (carType == 2 && mediumSpacesLeft > 0) {
            mediumSpacesLeft--;
            return true;
        }

        if (carType == 3 && smallSpacesLeft > 0) {
            smallSpacesLeft--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */