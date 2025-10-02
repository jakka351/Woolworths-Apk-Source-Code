package com.scandit.datacapture.core.internal.sdk.analytics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativePropertySubscriber {

    @DjinniGenerated
    public static final class CppProxy extends NativePropertySubscriber {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18649a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_onPropertyChanged(long j, JSONObject jSONObject);

        @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertySubscriber
        public void onPropertyChanged(JSONObject jSONObject) {
            native_onPropertyChanged(this.nativeRef, jSONObject);
        }
    }

    public abstract void onPropertyChanged(JSONObject jSONObject);
}
