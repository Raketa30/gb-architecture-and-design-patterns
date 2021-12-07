package ru.gb.patterns.structural.adapter;

public class ReportService implements Converter {

    @Override
    public void convertToXML() {
        System.out.println("xml");
    }

    @Override
    public void convertToCSV() {
        System.out.println("csv");
    }

    @Override
    public void convertToJSON() {
        System.out.println("json");
    }
}
