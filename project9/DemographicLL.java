package project9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemographicLL {
    private DemographicNode head;
    private DemographicNode tail;

    public DemographicLL() {
        head = null;
        tail = null;
        readDataFile();
    }

    private void readDataFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(".idea/demographicInfo.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                addNode(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNode(String aRecord) {
        DemographicNode newNode = new DemographicNode(aRecord);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void printList() {
        System.out.printf("%-15s %-15s %-5s %-5s %-10s %-25s %-15s %-10s %-5s %s%n",
                "Last", "First", "Age", "Sex", "Status", "Occupation",
                "Street", "City", "State", "Zip");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        DemographicNode currentNode = head;
        while (currentNode != null) {
            currentNode.printNodeData();
            currentNode = currentNode.getNext();
        }
    }
}

