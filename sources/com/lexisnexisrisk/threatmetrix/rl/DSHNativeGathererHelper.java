package com.lexisnexisrisk.threatmetrix.rl;

import android.content.Context;
import androidx.annotation.Keep;
import javax.annotation.Nullable;

@Keep
/* loaded from: classes6.dex */
public class DSHNativeGathererHelper {
    public native int cancel();

    @Nullable
    public native String[] checkPackageURLs(String[] strArr);

    @Nullable
    public native Object findAllProcs(Context context, Class cls, int i);

    @Nullable
    public native Object findInstalledProcs(Context context, Class cls, int i);

    public native void findPackages(String[] strArr, int i, int i2);

    @Nullable
    public native String[] findPermissions(short[] sArr);

    @Nullable
    public native short[] findPermissions(String[] strArr);

    @Nullable
    public native Object findRunningProcs(Context context, Class cls, int i);

    public native void finit();

    public native long getTamperCode(int i);

    public boolean hhhhhh0068(String str, String str2, boolean z, boolean z2) throws UnsatisfiedLinkError {
        System.loadLibrary(str2);
        return init(46, str, z, z2);
    }

    public native boolean init(int i, String str, boolean z, boolean z2);

    public native void initPackageManager();

    public native int waitUntilCancelled();
}
