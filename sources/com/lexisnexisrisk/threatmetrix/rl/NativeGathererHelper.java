package com.lexisnexisrisk.threatmetrix.rl;

import android.content.Context;
import androidx.annotation.Keep;
import javax.annotation.Nullable;

@Keep
/* loaded from: classes6.dex */
public class NativeGathererHelper {
    public native int cancel();

    @Nullable
    public native String[] checkURLs(String[] strArr);

    public void finalize() throws Throwable {
        super.finalize();
        finit();
    }

    public native void finit();

    public native Object getAddresses(Class cls);

    public native long getAppTime(String str, boolean z);

    @Nullable
    public native String getBinaryArch();

    @Nullable
    public native String getConnections(Context context);

    public native int getCpuCores();

    @Nullable
    public native String[] getFontList(String str);

    @Nullable
    public native String[] getNetworkInfo();

    @Nullable
    public native String getRandomString(int i);

    @Nullable
    public native int getSelinuxMode();

    public native long getTamperCode(int i);

    public native String getTextSectionHash(String str);

    public boolean h006800680068h00680068(String str, boolean z, boolean z2) throws Throwable {
        System.loadLibrary(str);
        return init(46, z, z2);
    }

    @Nullable
    public native String hashFile(String str, int i);

    public native boolean init(int i, boolean z, boolean z2);

    public native int jniDetectedDebugStatus(String str);

    @Nullable
    public native String md5(String str);

    public native void setInfoLogging(int i);

    public native String sha1Base32Encode(byte[] bArr);

    @Nullable
    public native String sha1HexEncode(byte[] bArr);

    @Nullable
    public native String sha256HexEncode(byte[] bArr);

    @Nullable
    public native String urlEncode(String str);

    public native String validatePackage(String str);

    public native int waitUntilCancelled();

    @Nullable
    public native String xor(String str, String str2);
}
