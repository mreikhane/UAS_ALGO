import java.util.ArrayList;
import java.util.Scanner;
public class UAS {
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getWhatYourPosts() {
        return WhatYourPosts;
    }

    public void setWhatYourPosts(String whatYourPosts) {
        WhatYourPosts = whatYourPosts;
    }

    private String UserID;
    private String UserName;
    private String WhatYourPosts;

    public UAS() {
    }

    static class Messages {
        public void setUserID(String userID) {
        }

        public void setUserName(String userName) {
        }

        public void setWhatYouPosts(String msg) {
        }
    }

    private void setMY_MESSAGES(ArrayList<Messages> xMsg) {
    }

    public static void main(String[] args) {
        UAS social = new UAS();
        social.setUserID("001");
        social.setUserName("@whitehat");
        System.out.println("USER ID : " + social.getUserID());
        System.out.println("USER NAME : " + social.getUserName());
        int jum_msg = 3;
        Scanner sc = new Scanner(System.in);
        ArrayList<UAS.Messages> xMsg = new ArrayList<>();
        for (int index = 0; index < jum_msg; index++) {
            Messages msg = new Messages();
            msg.setUserID(social.getUserID());
            msg.setUserName(social.getUserName());
            System.out.print("Post Message " + String.valueOf(index + 1) + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);

        social.ShowPosts(social);
    }

    public void ShowPosts(UAS profile) {
    }
}

