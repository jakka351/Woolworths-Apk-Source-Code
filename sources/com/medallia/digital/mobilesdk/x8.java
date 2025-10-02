package com.medallia.digital.mobilesdk;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class x8 {

    /* renamed from: a, reason: collision with root package name */
    static final int f16775a = 1024;

    public static ByteArrayOutputStream a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static boolean b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) i4.c().b().getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnectedOrConnecting();
                }
                return false;
            }
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
        return true;
    }

    public static boolean a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) i4.c().b().getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(0).isConnected();
            }
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
        return false;
    }
}
