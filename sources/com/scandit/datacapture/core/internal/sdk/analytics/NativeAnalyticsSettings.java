package com.scandit.datacapture.core.internal.sdk.analytics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeAnalyticsSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeAnalyticsSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18648a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_setBoolProperty(long j, String str, boolean z);

        private native void native_setStringProperty(long j, String str, String str2);

        @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings
        public void setBoolProperty(String str, boolean z) {
            native_setBoolProperty(this.nativeRef, str, z);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
        }
    }

    public static native NativeAnalyticsSettings create();

    public abstract void setBoolProperty(String str, boolean z);

    public abstract void setStringProperty(String str, String str2);
}
