package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.core.internal.sdk.engine.NativeProperty;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeFindSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17729a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native void native_enableSymbologies(long j, HashSet<Symbology> hashSet);

        private native HashMap<String, ArrayList<NativeProperty>> native_getAllProperties(long j);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j);

        private native int native_getProperty(long j, String str);

        private native NativeSymbologySettings native_getSymbologySettings(long j, Symbology symbology);

        private native void native_setProperty(long j, String str, int i);

        private native void native_setSymbologyEnabled(long j, Symbology symbology, boolean z);

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public int getProperty(String str) {
            return native_getProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public void setProperty(String str, int i) {
            native_setProperty(this.nativeRef, str, i);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z);
        }
    }

    public static native NativeBarcodeFindSettings clone(NativeBarcodeFindSettings nativeBarcodeFindSettings);

    public static native NativeBarcodeFindSettings create();

    public static native NativeBarcodeFindSettings fromJson(NativeJsonValue nativeJsonValue);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract int getProperty(String str);

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setProperty(String str, int i);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z);
}
