package org.example.Adapter;

public class OldSystemAdapter extends OldSystemLog{
    @Override
    public void SaveLog() {
        super.SaveLog();

        String content = getSystemInfor();
        NewSMSSystem system = new NewSMSSystem();
        system.setContent(content);

        system.SendSMS();
    }
}
