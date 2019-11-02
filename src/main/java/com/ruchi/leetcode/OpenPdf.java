package com.ruchi.leetcode;

import com.itextpdf.text.exceptions.BadPasswordException;
import com.itextpdf.text.pdf.PdfReader;

import java.io.IOException;

public class OpenPdf {
    public static void main(String[] args) throws IOException {




            resolve(100);

//            PdfEncryptor.encrypt(reader, new FileOutputStream("unlocked.pdf"), null,
//                    null,
//                    PdfWriter.AllowDegradedPrinting | PdfWriter.AllowFillIn
//                            | PdfWriter.AllowModifyAnnotations | PdfWriter.AllowModifyContents
//                            | PdfWriter.AllowPrinting | PdfWriter.AllowScreenReaders, false);


    }

    private static void resolve(int pass2) throws IOException {
        String pass1 = "00370";
        String pass3 = "5658";
        String password = pass1 + "pass2" + pass3;
        if(pass2 > 999){
            return;
        }
        try {
            PdfReader reader = new PdfReader("/tmp/516696029_APR2009.pdf", password.getBytes());
            Process p =
                    Runtime.getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler locked.pdf");

            System.out.println("#################" +password);
        } catch (BadPasswordException ex) {
            System.out.println(pass2);
            resolve(pass2+1);
        }


    }
}
