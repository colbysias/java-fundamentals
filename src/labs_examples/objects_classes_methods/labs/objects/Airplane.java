package labs_examples.objects_classes_methods.labs.objects;

class mainMethod{

public static void main(String[] args) {

        Model myModel = new Model("Boeing");
        Company myCompany = new Company("Boeing");
        Passengers myPassengers = new Passengers(33);
        Year myYear = new Year(1999);

        Airplane myAirplane = new Airplane(myModel, myCompany, myPassengers, myYear, 900.00, 50.00);

        System.out.println("The Airplane model is " + myModel + " by " + myCompany + " with total passengers of " +
                myPassengers + " and was built in the year " + myYear + " with a fuel capacity of " + myAirplane.fuelCapacity +
                " gallons and the current fuel level is about " + myAirplane.currentFuelLevel + "%.");

        }
}
class Airplane {
    Model model;
    Company company;
    Passengers passengers;
    Year year;

    Double fuelCapacity;
    Double  currentFuelLevel;

    public Airplane(Model model, Company company, Passengers passengers, Year year, Double fuelCapacity, Double currentFuelLevel){

        this.model = model;
        this.company= company;
        this.passengers = passengers;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
        public String toString(){
        return "Airplane{" +
                "Model=" + model.toString() +
                ",\n Company =" + company.toString() +
                ",\n Passengers=" + passengers.toString() +
                ",\n Year=" + year.toString() +
                ",\n Fuel Capacity=" + fuelCapacity + "\'" +
                ",\n Current Fuel Level=" + currentFuelLevel + '\'' +
                "}";
    }






}



class Model {

   private String modelType;

    public Model(String modelType){
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + modelType + '\'' +
                '}';
    }

    public String getModelType(){
        return modelType;
    }
    public void setModelType(String newModelType){
        this.modelType = newModelType;
    }
}

class Company{
    private String companyName;

    public Company(String companyName){
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + companyName + '\'' +
                '}';
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String newCompanyName){
        this.companyName = newCompanyName;
    }
}

class Passengers{
   private int passengerCapacity;

    public Passengers(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public String toString() {
        return "Passengers{" +
                "Passengers='" + passengerCapacity + '\'' +
                '}';
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public void setPassengerCapacity(int newPassengerCapacity){
        this.passengerCapacity = newPassengerCapacity;
    }
}

class Year{
   private int year;

    public Year(int year){
        this.year = year;
    }
    @Override
    public String toString() {
        return "Year{" +
                "Year='" + year + '\'' +
                '}';
    }
    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }
}