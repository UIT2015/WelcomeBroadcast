package com.smart_f.welcomebroadcast;

import android.content.Context;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * 语音合成模块
 * Created by chenxi on 2018/1/27.
 */

public class WelcomeBroadcast {

    public static final int COME = 0;
    public static final int BACK = 1;
    private static String[] message;
    private static Context context;
    private ISpeechProcessing speechProcessing= null;

    private static WelcomeBroadcast welcomeBroadcast;

    public static synchronized WelcomeBroadcast getInstance(Context context){
        if (welcomeBroadcast == null){
            welcomeBroadcast = new WelcomeBroadcast(context);
        }
        if(WelcomeBroadcast.context != context){
            WelcomeBroadcast.context = context;
        }
        return welcomeBroadcast;
    }

    private WelcomeBroadcast(Context context){
        WelcomeBroadcast.context = context;
        message =new String[2];
        message[0]="小朋友，早上好";
        message[1]="小朋友，再见";
        StringBuilder param = new StringBuilder();
        param.append("appid=5a668c2f");
        param.append(",");
        param.append(SpeechConstant.ENGINE_MODE + "=" + SpeechConstant.MODE_MSC);
        SpeechUtility.createUtility(context, param.toString());
        speechProcessing = new IFLYTEKSpeechProcessing(context);
    }

    public void welcomeBroadcast(String name, int type){
        String sentence;
        sentence=textProcessing(name, type);
        speechProcessing.speechSynthesisByString(sentence);

    }

    private String textProcessing(String name , int type){
        StringBuilder text=new StringBuilder()
                .append(name)
                .append(message[type]);
        return text.toString();
    }



}
