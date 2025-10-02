package com.google.androidbrowserhelper.trusted;

import android.app.Activity;
import android.app.NotificationChannel;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;

/* loaded from: classes6.dex */
public class NotificationPermissionRequestActivity extends Activity {
    public static final /* synthetic */ int f = 0;
    public String d;
    public Messenger e;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getIntent().getStringExtra("notificationChannelName");
        Messenger messenger = (Messenger) getIntent().getParcelableExtra("messenger");
        this.e = messenger;
        if (this.d == null || messenger == null) {
            Log.w("Notifications", "Finishing because no channel name or messenger for returning the result was provided.");
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && getApplicationContext().getApplicationInfo().targetSdkVersion < 33) {
            String str = this.d;
            new NotificationManagerCompat(this).a(new NotificationChannel(NotificationUtils.b(str), str, 3));
        }
        ActivityCompat.j(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws RemoteException {
        boolean zA = 0;
        zA = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= strArr.length) {
                break;
            }
            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0).edit().putBoolean("HAS_REQUESTED_NOTIFICATION_PERMISSION", true).apply();
                if (iArr[i2] == 0) {
                    zA = 1;
                }
            } else {
                i2++;
            }
        }
        if (zA == 0) {
            zA = NotificationUtils.a(this, this.d);
        }
        Messenger messenger = this.e;
        Bundle bundle = new Bundle();
        bundle.putInt("permissionStatus", !zA);
        Message messageObtain = Message.obtain();
        messageObtain.setData(bundle);
        try {
            messenger.send(messageObtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        finish();
    }
}
