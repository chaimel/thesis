package com.example.outeam2.Utils;


import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class Tools {

    public static boolean isEmpty(EditText editText){
        if(val(editText).length()>0){
            return false;
        }
        return true;
    }
    public static String val(EditText editText){
        return editText.getText().toString();
    }
    public static void toast(Context context, String msg, int length){
        Toast.makeText(context,msg,(length==1)?Toast.LENGTH_LONG:Toast.LENGTH_SHORT).show();
    }

    //ACTIVITY SHOWING
    //START ACTIVITY
    public static void open(Context context, Class targetActivity){
        if(targetActivity!=null){
            Intent intent = new Intent(context,targetActivity);
            startAct(context,intent);
        }
    }
    //START ACTIVITY WITH EXTRA
    public static void openXtra(Context context,Class targetActivity,Intent extras){
        if(targetActivity!=null){
            Intent intent = new Intent(context,targetActivity);
            intent.putExtras(extras.getExtras());
            startAct(context,intent);
        }
    }
    //AVOID MULTIPLE ACTIVTY TO SHOWN
    public static void startAct(Context context,Intent intent){
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    //END'



    //LOAD IMAGE
    public static void loadPic(Context context,ImageView imageView , String url){
        if(url.length()<=0) url="nopic";
        Picasso.get()
                .load(url)
//                .placeholder(R.)
//                .error()
                .into(imageView);
    }



}
