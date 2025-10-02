package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeQuadrilateralUtils {

    @DjinniGenerated
    public static final class CppProxy extends NativeQuadrilateralUtils {
        private final long nativeRef;

        private CppProxy(long j) {
            new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);
    }

    public static native boolean quadContains(Quadrilateral quadrilateral, Point point);

    public static native float quadDistance(Quadrilateral quadrilateral, Point point);

    public static native Point quadGetCenter(Quadrilateral quadrilateral);

    public static native float quadGetHeight(Quadrilateral quadrilateral);

    public static native float quadGetWidth(Quadrilateral quadrilateral);
}
