package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser {
    public static void main(String[] args) {


        final String fileName = "src/main/java/students.xml";

        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler defaultHandler = new DefaultHandler() {
                boolean flag = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    if (qName.equals("name")) {
                        flag = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) {
                    if (flag) {
                        System.out.println("name: " + new String(ch, start, length));
                        flag = false;
                    }
                }
            };
            saxParser.parse(fileName, defaultHandler);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
