package ru.gb.patterns.structural.adapter;

public class Test {
    public static void main(String[] args) {
        Converter conv = new ReportConverterAdapter();

        conv.convertToJSON();
    }
}
