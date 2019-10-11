//package it.intersistemi.elezioni.elezionirsu;
//
//import javax.swing.text.Document;
//import java.io.FileOutputStream;
//import java.sql.*;
//
//public class PdfGenerator {
//
//    public static void generatePdfScore() throws SQLException, ClassNotFoundException {
//        Class.forName("org.h2.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:h2:~/elezioni", "root", "");
//        Statement stmt = connection.createStatement();
//        ResultSet findAll = stmt.executeQuery("SELECT * FROM SCORE");
//        Document generatedPdf = new Document();
//        PdfWriter.getInstance(generatedPdf, new FileOutputStream("scores_votazioni.pdf"));
//        generatedPdf.open();
//        PdfTable generatedPdfTable = new PdfTable(2);
//        PdfCell generatedPdfCells;
//        while(findAll.next()) {
//            String idScore = findAll.getString("ID_SCORE");
//            String candidateName = findAll.getString("CANDIDATE_NAME");
//            generatedPdfCells = new PdfCell(new Phrase(idScore, candidateName));
//            generatedPdfTable.add(generatedPdfCells);
//            generatedPdf.addCell(generatedPdfTable);
//        }
//        generatedPdf.add(generatedPdfTable);
//        generatedPdf.close();
//        findAll.close();
//        stmt.close();
//        connection.close();
//    }
//
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        generatePdfScore();
//    }
//
//}
