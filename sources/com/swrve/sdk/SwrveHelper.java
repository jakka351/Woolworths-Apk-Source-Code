package com.swrve.sdk;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Base64;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import com.swrve.sdk.ISwrveCommon;
import java.io.File;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class SwrveHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19056a = Build.MODEL;
    public static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd", Locale.US);
    public static String c;

    /* renamed from: com.swrve.sdk.SwrveHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19057a;

        static {
            int[] iArr = new int[ISwrveCommon.SupportedUIMode.values().length];
            f19057a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19057a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.getString(next));
        }
        return map;
    }

    public static Date b(Date date, int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i2, i);
        return calendar.getTime();
    }

    public static String c(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(new SecretKeySpec(str2.getBytes(), mac.getAlgorithm()));
        return Base64.encodeToString(mac.doFinal(str.getBytes()), 0);
    }

    public static String d(HashMap map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb2.append("=");
            sb2.append(entry.getValue() == null ? "null" : URLEncoder.encode((String) entry.getValue(), "UTF-8"));
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public static String e(int i, String str, String str2) {
        String string = Long.toString(new Date().getTime() / 1000);
        String strS = s(str2 + string + str);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("=");
        sb.append(str2);
        sb.append("=");
        sb.append(string);
        return YU.a.o(sb, "=", strS);
    }

    public static int f(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            SwrveLogger.e("Current device does not have a Window Service active", new Object[0]);
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().height();
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static int g(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            SwrveLogger.e("Current device does not have a Window Service active", new Object[0]);
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().width();
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static String h(String str) {
        return YU.a.A("permission_answered_times_", str);
    }

    public static String i(int i) {
        return i == 0 ? "granted" : i == -1 ? "denied" : com.salesforce.marketingcloud.messages.iam.j.h;
    }

    public static String j(Context context) {
        return l(context).ordinal() != 1 ? "mobile" : "tv";
    }

    public static String k(Context context) {
        return l(context).ordinal() != 1 ? "android" : "android-tv";
    }

    public static ISwrveCommon.SupportedUIMode l(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4 ? ISwrveCommon.SupportedUIMode.e : ISwrveCommon.SupportedUIMode.d;
    }

    public static float m(Paint paint, String str, int i, int i2) {
        paint.setTextSize(200.0f);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        return Math.min((200.0f / r1.width()) * i, (200.0f / r1.height()) * i2);
    }

    public static boolean n(String str) {
        if (new File(str).canRead()) {
            return true;
        }
        for (Map.Entry entry : SwrveAssetsTypes.f19041a.entrySet()) {
            StringBuilder sbS = YU.a.s(str);
            sbS.append((String) entry.getValue());
            if (new File(sbS.toString()).canRead()) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(String str) {
        return !p(str);
    }

    public static boolean p(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean q(Map map) {
        return map == null || map.isEmpty();
    }

    public static void r(String str) {
        SwrveLogger.d(str, new Object[0]);
        throw new IllegalArgumentException(str);
    }

    public static String s(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            Object[] objArr = {e};
            if (!SwrveLogger.b) {
                return "";
            }
            SwrveLogger.a();
            Timber.a();
            Timber.f27013a.q("Couldn't find MD5 - what a strange JVM", objArr);
            return "";
        }
    }

    public static void t(View view, float f, float f2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(100L);
        view.startAnimation(scaleAnimation);
    }

    public static String u(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            Object[] objArr = {e};
            if (!SwrveLogger.b) {
                return "";
            }
            SwrveLogger.a();
            Timber.a();
            Timber.f27013a.q("Couldn't find SHA1 - what a strange JVM", objArr);
            return "";
        }
    }

    public static boolean v(int i) {
        return i >= 200 && i < 300;
    }
}
