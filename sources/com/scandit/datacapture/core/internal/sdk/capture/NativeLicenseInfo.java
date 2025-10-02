package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.internal.module.common.date.NativeDate;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeLicenseInfo {

    @DjinniGenerated
    public static final class CppProxy extends NativeLicenseInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18674a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeDate native_getExpirationDate(long j);

        private native NativeExpirationDateStatus native_getExpirationDateStatus(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo
        public NativeDate getExpirationDate() {
            return native_getExpirationDate(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo
        public NativeExpirationDateStatus getExpirationDateStatus() {
            return native_getExpirationDateStatus(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract NativeDate getExpirationDate();

    public abstract NativeExpirationDateStatus getExpirationDateStatus();

    public abstract String toJson();
}
