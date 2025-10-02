package androidx.camera.core.impl.utils;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class SurfaceUtil {

    public static class SurfaceInfo {

        /* renamed from: a, reason: collision with root package name */
        public int f521a;
        public int b;
        public int c;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static SurfaceInfo a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.f521a = 0;
        surfaceInfo.b = 0;
        surfaceInfo.c = 0;
        surfaceInfo.f521a = iArrNativeGetSurfaceInfo[0];
        surfaceInfo.b = iArrNativeGetSurfaceInfo[1];
        surfaceInfo.c = iArrNativeGetSurfaceInfo[2];
        return surfaceInfo;
    }

    private static native int[] nativeGetSurfaceInfo(@Nullable Surface surface);
}
