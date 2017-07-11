package com.example.simrandeepsingh.blah;



import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import org.w3c.dom.Document;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Client_details extends AppCompatActivity {


    Button b;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_details);
        b=(Button)findViewById(R.id.buttonclient);
        ed=(EditText)findViewById(R.id.editname);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
                String outPath= Environment.getExternalStorageDirectory()+"/mypdf.pdf";
                try{
                    PdfWriter.getInstance(doc,new FileOutputStream(outPath));
                    doc.open();
                    doc.add(new Paragraph(ed.getText().toString()));
                    doc.close();

                }
                catch (DocumentException e)
                {
                    e.printStackTrace();

                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
