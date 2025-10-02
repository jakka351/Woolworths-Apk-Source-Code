package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class l {
    private static final String d = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String e = "^|^";
    private static final String f = "\\^\\|\\^";
    private static Boolean i;

    /* renamed from: a, reason: collision with root package name */
    public static final Locale f17084a = Locale.US;
    public static final Charset b = Charset.forName("UTF-8");
    static final String c = com.salesforce.marketingcloud.g.a("Utils");
    private static final char[] g = "0123456789ABCDEF".toCharArray();
    private static final TimeZone h = TimeZone.getTimeZone("UTC");

    private l() {
    }

    public static int a(int i2) {
        return Build.VERSION.SDK_INT >= 31 ? i2 | 67108864 : i2;
    }

    public static int b(int i2) {
        return Build.VERSION.SDK_INT >= 31 ? i2 | 33554432 : i2;
    }

    public static boolean c() {
        return true;
    }

    public static Set<String> d(String str) {
        TreeSet treeSet = new TreeSet();
        if (str != null && !TextUtils.isEmpty(str)) {
            for (String str2 : str.split(f)) {
                if (str2 != null && !str2.isEmpty()) {
                    treeSet.add(str2);
                }
            }
        }
        return treeSet;
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(b);
            messageDigest.update(bytes, 0, bytes.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Throwable th) {
            com.salesforce.marketingcloud.g.b(c, th, "md5 failed", new Object[0]);
            return "";
        }
    }

    public static Date f(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d, f17084a);
        simpleDateFormat.setTimeZone(h);
        return simpleDateFormat.parse(str);
    }

    public static String g(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes(b))).toString(16));
            while (sb.length() < 64) {
                sb.insert(0, '0');
            }
            return sb.toString();
        } catch (Throwable th) {
            com.salesforce.marketingcloud.g.b(c, th, "sha-256 failed", new Object[0]);
            return "";
        }
    }

    private static void a(StringBuilder sb, String str, String str2) {
        androidx.constraintlayout.core.state.a.B(sb, str, e, str2, e);
    }

    @RestrictTo
    public static String b(String str) {
        return a(str, "SHA-256", "UTF-8");
    }

    public static Map<String, String> c(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(f);
            for (int i2 = 0; i2 < strArrSplit.length; i2 += 2) {
                int i3 = i2 + 1;
                map.put(strArrSplit[i2], i3 < strArrSplit.length ? strArrSplit[i3] : "");
            }
        }
        return map;
    }

    public static int b() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
    }

    private static boolean c(@NonNull Context context) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            Class<?> cls = Class.forName(context.getApplicationContext().getClass().getName().replace(".".concat(context.getApplicationContext().getClass().getSimpleName()), "") + ".BuildConfig");
            Field field = cls.getField("DEBUG");
            field.setAccessible(true);
            boolean z = field.getBoolean(null);
            com.salesforce.marketingcloud.g.c(c, "isDebugBuild set to %s for clazz %s", Boolean.valueOf(z), cls.getCanonicalName());
            return z;
        } catch (Exception e2) {
            boolean zB = b(context);
            com.salesforce.marketingcloud.g.a(c, "isDebugBuild determination failed with Exception [%s].  isDebugBuild set to: %s", e2.getMessage(), Boolean.valueOf(zB));
            return zB;
        }
    }

    private static boolean b(@NonNull Context context) {
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            com.salesforce.marketingcloud.g.e(c, "Failed to determine if app was in debug mode.", new Object[0]);
        }
        return (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 2) != 0;
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = g;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    private static boolean a() {
        return MarketingCloudSdk.isReady() || MarketingCloudSdk.isInitializing();
    }

    public static String a(String str) {
        return a(str, "SHA-256", "UTF-8");
    }

    private static String a(@NonNull String str, @NonNull String str2, @NonNull String str3) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes(str3);
            messageDigest.update(bytes, 0, bytes.length);
            return a(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d, f17084a);
        simpleDateFormat.setTimeZone(h);
        return simpleDateFormat.format(date);
    }

    public static boolean a(@NonNull Context context) {
        if (i == null) {
            i = Boolean.valueOf(c(context));
        }
        return i.booleanValue();
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        HashMap map2 = new HashMap(map);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            a(sb, (String) entry.getKey(), (String) entry.getValue());
        }
        return sb.toString();
    }

    public static synchronized String a(Set<String> set) {
        if (set == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(e);
            }
            return sb.toString();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean a(long j, long j2) throws InterruptedException {
        if (j > 0) {
            long jMin = Math.min(j2, j);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = jCurrentTimeMillis;
            boolean z = false;
            while (true) {
                long j3 = jCurrentTimeMillis + j;
                if (j3 <= jCurrentTimeMillis2 || z || a()) {
                    break;
                }
                long j4 = jCurrentTimeMillis2 + jMin > j3 ? j3 - jCurrentTimeMillis2 : jMin;
                try {
                    com.salesforce.marketingcloud.g.d(c, "Marketing Cloud SDK is not yet initializing.  Trying again in %sms. %s", Long.valueOf(j4), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                    Thread.sleep(j4);
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(c, e2, "Encountered exception while waiting for SDK initialization to be triggered by the application.", new Object[0]);
                    z = true;
                }
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
        }
        return a();
    }
}
