// Private data members/attributes for each field of a record read from the provided file:
    // firstName, lastName, age, sex, maritalStatus, occupation, streetAddress, city, state, zipCode
    // The provided input file is a Comma Separated Values (CSV) file specifically designed to separate data fields. Don’t submit
    // something where the fields have not been separated.
// Functions/methods
    // DemographicInfo(string record): ctor that accepts a single record that was pulled from the provided file. This constructor calls
    // setAll().
    // setAll(string record): This is where the record is parsed into its components and stored in the object data members/attributes.
    // printInfoShort(): The data members / attributes are output directly from here (as opposed to returning the data for output
    // elsewhere. This is also where the data is rearranged to match the example output.

package project9;

public class DemographicInfo {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String maritalStatus;
    private String occupation;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    

    public DemographicInfo(String record) {
        setAll(record);
    }

    public void setAll(String record) {
        String[] splits = new String[10];
        splits = record.split(",");
        
        firstName = splits[0];
        lastName = splits[1];
        age = Integer.parseInt(splits[2]);
        sex = splits[3];
        maritalStatus = splits[4];
        occupation = splits[5];
        streetAddress = splits[6];
        city = splits[7];
        state = splits[8];
        zipCode = Integer.parseInt(splits[9]);
    }

    public void printInfoShort() {
        //                        ln    fn  age sex ms  occ  addr city state zip
        System.out.printf("%10s %10s %4d %8s %8s %22s %20s %15s %5s %6d %n",
        lastName, firstName, age, sex, maritalStatus, occupation ,streetAddress, city, state, zipCode);
    }
}
