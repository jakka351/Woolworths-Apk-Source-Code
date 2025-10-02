package com.cyberfend.cyfsecurity;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class SensorDataBuilder {

    /* renamed from: a, reason: collision with root package name */
    public static final SensorDataBuilder f14060a = new SensorDataBuilder();
    public static final boolean b;

    static {
        try {
            System.loadLibrary(CircleProgressBar.a("xn~bL@NFR"));
        } catch (Exception | UnsatisfiedLinkError unused) {
            b = true;
        }
    }

    public native synchronized String buildN(ArrayList<Pair<String, String>> arrayList);

    public native synchronized void decryptN();

    public native synchronized void encryptKeyN();

    public native synchronized void initializeKeyN();
}
