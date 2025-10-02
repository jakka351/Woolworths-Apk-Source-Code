package com.scandit.datacapture.core.internal.sdk.area;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeRadiusLocationSelection {

    @DjinniGenerated
    public static final class CppProxy extends NativeRadiusLocationSelection {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18651a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeLocationSelection native_asLocationSelection(long j);

        private native FloatWithUnit native_getRadius(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection
        public NativeLocationSelection asLocationSelection() {
            return native_asLocationSelection(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection
        public FloatWithUnit getRadius() {
            return native_getRadius(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public static native NativeRadiusLocationSelection create(FloatWithUnit floatWithUnit);

    public abstract NativeLocationSelection asLocationSelection();

    public abstract FloatWithUnit getRadius();

    public abstract String toJson();
}
