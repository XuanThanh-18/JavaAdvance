package org.example.Adapter;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OldSystemLog {
    public String getSystemInfor(){
        return "System Infor old";
    }

    public void SaveLog(){
        System.out.println("Save log");
        System.out.println(getSystemInfor());
    }
}
