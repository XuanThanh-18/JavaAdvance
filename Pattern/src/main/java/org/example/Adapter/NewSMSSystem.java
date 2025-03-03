package org.example.Adapter;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Getter
@Setter
public class NewSMSSystem {
    private String content;


    public void SendSMS(){
        System.out.println("SMS content" + content);
    }
}
