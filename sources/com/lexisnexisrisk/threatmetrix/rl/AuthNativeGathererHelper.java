package com.lexisnexisrisk.threatmetrix.rl;

import android.content.ContentResolver;
import android.content.Context;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class AuthNativeGathererHelper {
    public static int a006100610061aa0061 = 2;
    public static int a0061a0061aa0061 = 24;
    public static int aa00610061aa0061 = 1;

    @Nonnull
    public native String[] attestStrongID(String str, String str2, Context context, int i);

    public boolean b00620062b0062b0062(String str, String str2) throws UnsatisfiedLinkError {
        int i = a0061a0061aa0061;
        if (((aa00610061aa0061 + i) * i) % a006100610061aa0061 != 0) {
            a0061a0061aa0061 = 29;
            aa00610061aa0061 = 25;
        }
        System.loadLibrary(str);
        return init(str2);
    }

    public native int cancel();

    public native long getTamperCode(int i);

    public native boolean init(String str);

    @Nullable
    public native String sha256HexEncode(byte[] bArr);

    @Nullable
    public native byte[] sign(byte[] bArr, ContentResolver contentResolver);
}
