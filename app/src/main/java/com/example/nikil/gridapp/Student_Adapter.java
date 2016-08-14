package com.example.nikil.gridapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nikil on 8/10/2016.
 */
public class Student_Adapter extends ArrayAdapter<Student> {

    public Context context;
    public List<Student> studentList;
    int resourceId;

    public Student_Adapter(Context context, int resourceId, List<Student> studentList) {
        super(context,resourceId,studentList);
        this.context = context;
        this.studentList = studentList;
        this.resourceId=resourceId;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Student getItem(int position) {
        return studentList.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= View.inflate(context,resourceId,null);
        TextView tv_Name= (TextView)v.findViewById(R.id.tv_Name);
        TextView tv_position= (TextView)v.findViewById(R.id.tv_Subject);
        TextView tv_address= (TextView)v.findViewById(R.id.tv_Course);
        TextView tv_email= (TextView)v.findViewById(R.id.tv_Address);

        tv_Name.setText(studentList.get(position).getName());
        tv_position.setText(studentList.get(position).getSubject());
        tv_email.setText(studentList.get(position).getCourse());
        tv_address.setText(studentList.get(position).getAddrss());
        return v;
    }
}
