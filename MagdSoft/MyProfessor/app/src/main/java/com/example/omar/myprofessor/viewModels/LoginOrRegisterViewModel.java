package com.example.omar.myprofessor.viewModels;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.view.View;

import com.example.omar.myprofessor.activities.ProfessorLoginActivity;
import com.example.omar.myprofessor.activities.ProfessorLoginOrRegisterActivity;
import com.example.omar.myprofessor.activities.ProfessorRegisterActivity;
import com.example.omar.myprofessor.activities.StudentLoginActivity;
import com.example.omar.myprofessor.activities.StudentLoginOrRegisterActivity;
import com.example.omar.myprofessor.activities.StudentRegisterActivity;

/**
 * Created by Omar on 01/07/2017.
 */

public class LoginOrRegisterViewModel extends BaseObservable{
    public Context context;

    public LoginOrRegisterViewModel(Context context){this.context = context;}

    public void clickProfessorLoginScreen(View view){
        Intent intent = new Intent(context, ProfessorLoginActivity.class);
        context.startActivity(intent);
        ((Activity)context).finish();
    }

    public void clickProfessorRegisterScreen(View view){
        Intent intent = new Intent(context, ProfessorRegisterActivity.class);
        context.startActivity(intent);
        ((Activity)context).finish();
    }

    public void clickStudentRegisterScreen(View view){
        Intent intent = new Intent(context, StudentRegisterActivity.class);
        context.startActivity(intent);
        ((Activity)context).finish();
    }

    public void clickStudentLoginScreen(View view){
        Intent intent = new Intent(context, StudentLoginActivity.class);
        context.startActivity(intent);
        ((Activity)context).finish();
    }
}
