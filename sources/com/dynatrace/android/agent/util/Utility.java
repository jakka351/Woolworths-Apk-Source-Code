package com.dynatrace.android.agent.util;

import android.annotation.SuppressLint;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@SuppressLint
/* loaded from: classes.dex */
public class Utility {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14137a;
    public static final AtomicInteger b;
    public static final AtomicLong c;

    static {
        boolean z = Global.f14077a;
        f14137a = "dtxUtility";
        b = new AtomicInteger(1);
        c = new AtomicLong(0L);
    }

    public static String a() {
        return String.format("#%d.", Long.valueOf(Thread.currentThread().getId()));
    }

    public static String b(String str) {
        String[] strArrSplit;
        String str2;
        String str3;
        if (str != null && (strArrSplit = str.split(":")) != null && strArrSplit.length > 1 && (str2 = strArrSplit[0]) != null) {
            if (str2.startsWith("Processor")) {
                String str4 = strArrSplit[1];
                if (str4 == null) {
                    return null;
                }
                return str4.replaceAll(" Processor ", " ").trim();
            }
            if (!strArrSplit[0].startsWith("vendor_id") || (str3 = strArrSplit[1]) == null) {
                return null;
            }
            return str3.trim();
        }
        return null;
    }

    public static int c(int i, int i2, int i3, String str, String str2, boolean z) throws NumberFormatException {
        String str3 = f14137a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                int i4 = Integer.parseInt(str2);
                if (i4 < i) {
                    if (Global.f14077a) {
                        h(str3, str + " value of " + str2 + " is not within the range of " + i + " and " + i2);
                    }
                    if (!z) {
                        return i;
                    }
                } else {
                    if (i4 <= i2) {
                        return i4;
                    }
                    if (Global.f14077a) {
                        h(str3, str + " value of " + str2 + " is not within the range of " + i + " and " + i2);
                    }
                    if (!z) {
                        return i2;
                    }
                }
            } catch (NumberFormatException e) {
                if (Global.f14077a) {
                    j(str3, str, e);
                }
            }
        }
        return i3;
    }

    public static byte[] d(FilterInputStream filterInputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = filterInputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static String e(int i, String str) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            if (Global.f14077a) {
                i(f14137a, e.toString());
            }
            return str.replaceAll("&", "%26").replaceAll("=", "%3D");
        }
    }

    public static void g(Exception exc, String str, String str2) {
        Log.d(str, a() + str2, exc);
    }

    public static void h(String str, String str2) {
        String str3 = a() + str2;
        int length = (str3.length() - 1) / 4000;
        int i = 0;
        while (i < length) {
            int i2 = i * 4000;
            i++;
            Log.d(str, str3.substring(i2, i * 4000));
        }
        Log.d(str, str3.substring(i * 4000));
    }

    public static void i(String str, String str2) {
        Log.e(str, a() + str2);
    }

    public static void j(String str, String str2, Throwable th) {
        Log.e(str, a() + str2, th);
    }

    public static void k(String str, String str2) {
        Log.i(str, a() + str2);
    }

    public static void l(String str, String str2) {
        Log.w(str, a() + str2);
    }
}
