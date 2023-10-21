package com.example.budget_planner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private final static String FILE_NAME = ".products.txt";
    private final static String FILE_NAME1 = "hcs.txt";
    private final static String FILE_NAME2 = "health.txt";
    private final static String FILE_NAME3 = "cloth.txt";
    private final static String FILE_NAME4 = "entertainment.txt";
    private final static String FILE_NAME5 = "other.txt";
    private final static String FILE_NAME6 = "budget.txt";
    private int products;
    private int hcs;
    private int health;
    private int cloth;
    private int entertainment;
    private int other;
    private int budget;
    private int ost;
    private  boolean start = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView categoriesList = findViewById(R.id.categoriesList);
        String[] categories = getResources().getStringArray(R.array.categories);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,categories);
        categoriesList.setAdapter(adapter);

        Start();


    }

    private void Start() {
        openText();
        openText2();
        openText3();
        openText4();
        openText5();
        openText6();
        openText7();
        showOst();
        start=true;
    }

    public void showOst(){
        TextView textView  = findViewById(R.id.textView3);

     textView.setText(Integer.toString(budget-ost));

    }

    public void saveBudget(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber);
            String text = textBox.getText().toString();
            fos = openFileOutput(FILE_NAME6, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        budget = 0;
        ost=0;

        openText7();



    }

    public void saveText(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber2);
            String text = textBox.getText().toString();
            ost+=Integer.parseInt(text);
            products+=Integer.parseInt(text);
            text=Integer.toString(products);
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        showOst();
        openText();

    }

    public void saveText2(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber3);
            String text = textBox.getText().toString();
            ost+=Integer.parseInt(text);
            hcs+=Integer.parseInt(text);
            text= Integer.toString(hcs);
            fos = openFileOutput(FILE_NAME1, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        showOst();
        openText2();

    }

    public void saveText3(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber4);
            String text = textBox.getText().toString();
            ost+=Integer.parseInt(text);
            health+=Integer.parseInt(text);
            text= Integer.toString(health);
            fos = openFileOutput(FILE_NAME2, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        showOst();
        openText3();

    }

    public void saveText4(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber5);
            String text = textBox.getText().toString();
            ost+=Integer.parseInt(text);
            cloth+=Integer.parseInt(text);
            text= Integer.toString(cloth);
            fos = openFileOutput(FILE_NAME3, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        showOst();
        openText4();

    }

    public void saveText5(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber6);
            String text = textBox.getText().toString();
            ost+=Integer.parseInt(text);
            entertainment+=Integer.parseInt(text);
            text= Integer.toString(entertainment);
            fos = openFileOutput(FILE_NAME4, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        showOst();
        openText5();

    }

    public void saveText6(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber7);
            String text = textBox.getText().toString();
            ost+=Integer.parseInt(text);
            other+=Integer.parseInt(text);
            text= Integer.toString(other);
            fos = openFileOutput(FILE_NAME5, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        showOst();
        openText7();

    }

    public void openText7(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView11);
        try {
            fin = openFileInput(FILE_NAME6);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            budget=0;
            budget+=Integer.parseInt(text);

        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void openText(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView5);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            products=Integer.parseInt(text);
            if (!start)
            ost+=products;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void openText2(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView6);
        try {
            fin = openFileInput(FILE_NAME1);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            hcs=Integer.parseInt(text);
            if (!start)
            ost+=hcs;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void openText3(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView7);
        try {
            fin = openFileInput(FILE_NAME2);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            health=Integer.parseInt(text);
            if (!start)
            ost+=health;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void openText4(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView8);
        try {
            fin = openFileInput(FILE_NAME3);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            cloth=Integer.parseInt(text);
            if (!start)
            ost+=cloth;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void openText5(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView9);
        try {
            fin = openFileInput(FILE_NAME4);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            entertainment=Integer.parseInt(text);
            if (!start)
            ost+=entertainment;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void openText6(){

        FileInputStream fin = null;
        TextView textView = findViewById(R.id.textView10);
        try {
            fin = openFileInput(FILE_NAME5);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
            other=Integer.parseInt(text);
            if (!start)
            ost+=other;
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Clear(View view){

        FileOutputStream fos = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber2);
            String text = "0";
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        FileOutputStream fos2 = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber3);
            String text = "0";
            fos = openFileOutput(FILE_NAME1, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        FileOutputStream fos3 = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber3);
            String text = "0";
            fos = openFileOutput(FILE_NAME2, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        FileOutputStream fos4 = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber3);
            String text = "0";
            fos = openFileOutput(FILE_NAME3, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        FileOutputStream fos5 = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber4);
            String text = "0";
            fos = openFileOutput(FILE_NAME4, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        FileOutputStream fos6 = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber5);
            String text = "0";
            fos = openFileOutput(FILE_NAME5, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        FileOutputStream fos7 = null;
        try {
            EditText textBox = findViewById(R.id.editTextNumber);
            String text = "0";
            fos = openFileOutput(FILE_NAME6, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            textBox.getText().clear();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        openText7();
        Start();


    }


    }



