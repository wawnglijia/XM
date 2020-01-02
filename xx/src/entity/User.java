package entity;

public class User {
    static int Uid;
    static String Uname;
    static String Upaw;

    public static int getUid() {
        return Uid;
    }

    public static void setUid(int uid) {
        Uid = uid;
    }

    public static String getUname() {
        return Uname;
    }

    public static void setUname(String uname) {
        Uname = uname;
    }

    public static String getUpaw() {
        return Upaw;
    }

    public static void setUpaw(String upaw) {
        Upaw = upaw;
    }
}
