//package it.intersistemi.elezioni.elezionirsu.mailsender;
//
//import java.util.ArrayList;
//
//public class EmailMessage {
//
//    private String subject;
//    private String txtMessage;
//    private ArrayList<String> toAddress;
//    private ArrayList<String> ccAddress;
//    private ArrayList<String> bccAddress;
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getTxtMessage() {
//        return txtMessage;
//    }
//
//    public void setTxtMessage(String txtMessage) {
//        this.txtMessage = txtMessage;
//    }
//
//    public ArrayList<String> getToAddress() {
//        if (toAddress == null) {
//            toAddress = new ArrayList<>();
//        }
//        return toAddress;
//    }
//
//    public void setToAddress(ArrayList<String> toAddress) {
//        this.toAddress = toAddress;
//    }
//
//    public ArrayList<String> getCcAddress() {
//        if (ccAddress == null) {
//            ccAddress = new ArrayList<>();
//        }
//        return ccAddress;
//    }
//
//    public void setCcAddress(ArrayList<String> ccAddress) {
//        this.ccAddress = ccAddress;
//    }
//
//    public ArrayList<String> getBccAddress() {
//        if (bccAddress == null) {
//            bccAddress = new ArrayList<>();
//        }
//        return bccAddress;
//    }
//
//    public void setBccAddress(ArrayList<String> bccAddress) {
//        this.bccAddress = bccAddress;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("MessaggioMail [subject=");
//        builder.append(subject);
//        builder.append(", txtMessage=");
//        builder.append(txtMessage);
//        builder.append(", toAddress=");
//        builder.append(toAddress);
//        builder.append(", ccAddress=");
//        builder.append(ccAddress);
//        builder.append(", bccAddress=");
//        builder.append(bccAddress);
//        return builder.toString();
//    }
//
//
//}
