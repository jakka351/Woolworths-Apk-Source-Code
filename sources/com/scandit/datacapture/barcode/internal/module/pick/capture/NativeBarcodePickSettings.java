package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
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
public abstract class NativeBarcodePickSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17746a = new AtomicBoolean(false);
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

        private native NativeBarcodeFilterSettings native_getFilterSettings(long j);

        private native boolean native_getHapticEnabled(long j);

        private native int native_getProperty(long j, String str);

        private native boolean native_getShouldEnableCaching(long j);

        private native boolean native_getSoundEnabled(long j);

        private native NativeSymbologySettings native_getSymbologySettings(long j, Symbology symbology);

        private native void native_setArucoDictionary(long j, NativeArucoDictionary nativeArucoDictionary);

        private native void native_setFilterSettings(long j, NativeBarcodeFilterSettings nativeBarcodeFilterSettings);

        private native void native_setHapticEnabled(long j, boolean z);

        private native void native_setProperty(long j, String str, int i);

        private native void native_setShouldEnableCaching(long j, boolean z);

        private native void native_setSoundEnabled(long j, boolean z);

        private native void native_setSymbologyEnabled(long j, Symbology symbology, boolean z);

        private native void native_updateFromJson(long j, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public NativeBarcodeFilterSettings getFilterSettings() {
            return native_getFilterSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public boolean getHapticEnabled() {
            return native_getHapticEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public int getProperty(String str) {
            return native_getProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public boolean getShouldEnableCaching() {
            return native_getShouldEnableCaching(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public boolean getSoundEnabled() {
            return native_getSoundEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary) {
            native_setArucoDictionary(this.nativeRef, nativeArucoDictionary);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setFilterSettings(NativeBarcodeFilterSettings nativeBarcodeFilterSettings) {
            native_setFilterSettings(this.nativeRef, nativeBarcodeFilterSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setHapticEnabled(boolean z) {
            native_setHapticEnabled(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setProperty(String str, int i) {
            native_setProperty(this.nativeRef, str, i);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setShouldEnableCaching(boolean z) {
            native_setShouldEnableCaching(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setSoundEnabled(boolean z) {
            native_setSoundEnabled(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void updateFromJson(NativeJsonValue nativeJsonValue) {
            native_updateFromJson(this.nativeRef, nativeJsonValue);
        }
    }

    public static native NativeBarcodePickSettings create();

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract NativeBarcodeFilterSettings getFilterSettings();

    public abstract boolean getHapticEnabled();

    public abstract int getProperty(String str);

    public abstract boolean getShouldEnableCaching();

    public abstract boolean getSoundEnabled();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary);

    public abstract void setFilterSettings(NativeBarcodeFilterSettings nativeBarcodeFilterSettings);

    public abstract void setHapticEnabled(boolean z);

    public abstract void setProperty(String str, int i);

    public abstract void setShouldEnableCaching(boolean z);

    public abstract void setSoundEnabled(boolean z);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z);

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
