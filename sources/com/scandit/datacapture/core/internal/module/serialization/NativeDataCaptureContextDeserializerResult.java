package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeDataCaptureContextDeserializerResult {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureContextDeserializerResult {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18557a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native ArrayList<NativeDataCaptureComponent> native_getComponents(long j);

        private native NativeDataCaptureContext native_getContext(long j);

        private native NativeDataCaptureView native_getView(long j);

        private native ArrayList<String> native_getWarnings(long j);

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult
        public ArrayList<NativeDataCaptureComponent> getComponents() {
            return native_getComponents(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult
        public NativeDataCaptureContext getContext() {
            return native_getContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult
        public NativeDataCaptureView getView() {
            return native_getView(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }
    }

    public abstract ArrayList<NativeDataCaptureComponent> getComponents();

    public abstract NativeDataCaptureContext getContext();

    public abstract NativeDataCaptureView getView();

    public abstract ArrayList<String> getWarnings();
}
