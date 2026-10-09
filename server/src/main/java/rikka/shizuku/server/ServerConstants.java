package rikka.shizuku.server;

public class ServerConstants {

    public static final int MANAGER_APP_NOT_FOUND = 50;

    public static final String MANAGER_APPLICATION_ID = System.getProperty("arctrl.shizuku.manager", "com.taowen.arctrl");
    // Discover existing SDK clients without declaring or mutating upstream's
    // trademarked permissions. Modern clients authorize through Binder records.
    public static final String CLIENT_PERMISSION = "moe.shizuku.manager.permission.API_V23";
    public static final String PERMISSION = MANAGER_APPLICATION_ID + ".shizuku.permission.API_V23";
    public static final String REQUEST_PERMISSION_ACTION = MANAGER_APPLICATION_ID + ".intent.action.REQUEST_PERMISSION";

    public static final int BINDER_TRANSACTION_getApplications = 10001;
}
