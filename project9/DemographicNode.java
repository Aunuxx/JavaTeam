// Private data members/attributes (as mentioned previous, there are only 3):
    // previousNodeRef: contains a pointer/reference to the previous Node. The head node will point to NULL
    // demographic: This will contain one DemographicInfo object.
    // nextNodeRef: contains a pointer/reference to the next Node. The tail node will point to NULL
// Functions/methods
    // DemographicNode(string aRecord): ctor
    // printNodeData(): Calls the print function for the DemographicInfo object
// getters (accessors)/setters(mutators)
    // getPrev()
    // setPrev(prevNode)
    // getNext()
    // setNext(nextNode)

package project9;

public class DemographicNode {
    private DemographicNode previousNodeRef;
    private DemographicInfo demographic;
    private DemographicNode nextNodeRef;


    public DemographicNode(String aRecord) {
        demographic = new DemographicInfo(aRecord);
    }
    public DemographicNode(String aRecord, DemographicNode prev) { // I added this because I thought it might be usefull.
        demographic = new DemographicInfo(aRecord);
        previousNodeRef = prev;
    }

    public void printNodeData() {
        demographic.printInfoShort();
    }

    public DemographicNode getPrev() {
        return previousNodeRef;
    }
    public DemographicNode getnext() {
        return nextNodeRef;
    }
    public void setPrev(DemographicNode prev) {
        previousNodeRef = prev;
    }
    public void setNext(DemographicNode next) {
        previousNodeRef = next;
    }
    
}
