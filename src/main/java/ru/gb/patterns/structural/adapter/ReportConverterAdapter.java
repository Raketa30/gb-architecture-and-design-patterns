package ru.gb.patterns.structural.adapter;

public class ReportConverterAdapter implements Converter{
    private final Converter converter;

    public ReportConverterAdapter() {
        this.converter = new ReportService();
    }

    @Override
    public void convertToXML() {
        converter.convertToXML();
    }

    @Override
    public void convertToCSV() {
        converter.convertToCSV();
    }

    @Override
    public void convertToJSON() {
        converter.convertToJSON();
    }
}
