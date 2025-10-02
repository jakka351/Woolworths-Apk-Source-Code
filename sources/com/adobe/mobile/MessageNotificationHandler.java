package com.adobe.mobile;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.adobe.mobile.StaticMethods;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class MessageNotificationHandler extends BroadcastReceiver {
    public static String a() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = StaticMethods.A().getPackageManager();
            return (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(StaticMethods.A().getPackageName(), 0)) == null || packageManager.getApplicationLabel(applicationInfo) == null) ? "" : (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            StaticMethods.I("Messages - unable to retrieve app name for local notification (%s)", e.getMessage());
            return "";
        } catch (StaticMethods.NullContextException e2) {
            StaticMethods.I("Messages - unable to get app name (%s)", e2.getMessage());
            return "";
        }
    }

    public static Bitmap b() throws StaticMethods.NullContextException {
        Drawable applicationIcon;
        PackageManager packageManager;
        int i = Messages.d;
        if (i != -1) {
            Context contextA = StaticMethods.A();
            applicationIcon = (Drawable) Resources.class.getDeclaredMethod("getDrawable", Integer.TYPE, Resources.Theme.class).invoke(contextA.getResources(), Integer.valueOf(i), contextA.getTheme());
        } else {
            ApplicationInfo applicationInfo = StaticMethods.A().getApplicationInfo();
            applicationIcon = (applicationInfo == null || (packageManager = StaticMethods.A().getPackageManager()) == null) ? null : packageManager.getApplicationIcon(applicationInfo);
        }
        if (applicationIcon == null) {
            return null;
        }
        if (applicationIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) applicationIcon).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Activity activityQ;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            StaticMethods.I("Messages - unable to load extras from local notification intent", new Object[0]);
            return;
        }
        try {
            String string = extras.getString("alarm_message");
            int i = extras.getInt("adbMessageCode");
            int i2 = extras.getInt("requestCode");
            String string2 = extras.getString("adb_m_l_id");
            String string3 = extras.getString("adb_deeplink");
            String string4 = extras.getString("userData");
            if (i != 750183) {
                return;
            }
            if (string == null) {
                StaticMethods.I("Messages - local notification message was empty ", new Object[0]);
                return;
            }
            try {
                Activity activityQ2 = StaticMethods.q();
                try {
                    Context contextA = StaticMethods.A();
                    try {
                        activityQ = StaticMethods.q();
                    } catch (StaticMethods.NullActivityException unused) {
                        StaticMethods.J("Messages - unable to find activity for your notification, using default", new Object[0]);
                        activityQ = null;
                    }
                    if (string3 != null && !string3.isEmpty()) {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(string3));
                    } else if (activityQ != null) {
                        intent = activityQ.getIntent();
                    }
                    intent.setFlags(603979776);
                    intent.putExtra("adb_m_l_id", string2);
                    intent.putExtra("userData", string4);
                    try {
                        PendingIntent activity = PendingIntent.getActivity(contextA, i2, intent, 134217728);
                        if (activity == null) {
                            StaticMethods.I("Messages - could not retrieve sender from broadcast, unable to post notification", new Object[0]);
                            return;
                        }
                        Class<?> clsLoadClass = BroadcastReceiver.class.getClassLoader().loadClass("android.app.Notification$Builder");
                        Constructor<?> constructor = clsLoadClass.getConstructor(Context.class);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(StaticMethods.A());
                        Method declaredMethod = clsLoadClass.getDeclaredMethod("setSmallIcon", Integer.TYPE);
                        int i3 = Messages.c;
                        if (i3 == -1) {
                            i3 = R.drawable.sym_def_app_icon;
                        }
                        declaredMethod.invoke(objNewInstance, Integer.valueOf(i3));
                        Bitmap bitmapB = b();
                        if (bitmapB != null) {
                            clsLoadClass.getDeclaredMethod("setLargeIcon", Bitmap.class).invoke(objNewInstance, bitmapB);
                        }
                        clsLoadClass.getDeclaredMethod("setContentTitle", CharSequence.class).invoke(objNewInstance, a());
                        clsLoadClass.getDeclaredMethod("setContentText", CharSequence.class).invoke(objNewInstance, string);
                        clsLoadClass.getDeclaredMethod("setContentIntent", PendingIntent.class).invoke(objNewInstance, activity);
                        clsLoadClass.getDeclaredMethod("setAutoCancel", Boolean.TYPE).invoke(objNewInstance, Boolean.TRUE);
                        Object objInvoke = clsLoadClass.getDeclaredMethod("build", null).invoke(objNewInstance, null);
                        if (objInvoke == null) {
                            return;
                        }
                        ((NotificationManager) activityQ2.getSystemService("notification")).notify(new SecureRandom().nextInt(), (Notification) objInvoke);
                    } catch (StaticMethods.NullContextException e) {
                        StaticMethods.J("Messages - error posting notification (%s)", e.getMessage());
                    } catch (ClassNotFoundException e2) {
                        StaticMethods.J("Messages - error posting notification, class not found (%s)", e2.getMessage());
                    } catch (NoSuchMethodException e3) {
                        StaticMethods.J("Messages - error posting notification, method not found (%s)", e3.getMessage());
                    } catch (Exception e4) {
                        StaticMethods.J("Messages - unexpected error posting notification (%s)", e4.getMessage());
                    }
                } catch (StaticMethods.NullContextException e5) {
                    StaticMethods.J(e5.getMessage(), new Object[0]);
                }
            } catch (StaticMethods.NullActivityException e6) {
                StaticMethods.J(e6.getMessage(), new Object[0]);
            }
        } catch (Exception e7) {
            StaticMethods.I("Messages - unable to load message from local notification (%s)", e7.getMessage());
        }
    }
}
