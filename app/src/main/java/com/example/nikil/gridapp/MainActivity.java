package com.example.nikil.gridapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gvStudent;
    private Student_Adapter adapter;
    private List<Student> studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvStudent=(GridView)findViewById(R.id.gridview);
        studentList=new ArrayList<>();
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        studentList.add(new Student("Name:ram", "Subject:Math", "Course:B.sc IT", "Address:Thimi"));
        adapter=new Student_Adapter(this,R.layout.item_grridview_student,studentList);
        gvStudent.setAdapter(adapter);

        gvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Name of student", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
