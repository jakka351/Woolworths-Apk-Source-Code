package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeSelectionSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSelectionSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18073a = new AtomicBoolean(false);
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

        private native int native_getCodeDuplicateFilterMilliseconds(long j);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j);

        private native int native_getProperty(long j, String str);

        private native NativeSelectionType native_getSelectionType(long j);

        private native boolean native_getSingleBarcodeAutoDetectionEnabled(long j);

        private native boolean native_getSwipeGesturesEnabled(long j);

        private native NativeSymbologySettings native_getSymbologySettings(long j, Symbology symbology);

        private native boolean native_getTapGestureForSelectionEnabled(long j);

        private native void native_setCodeDuplicateFilterMilliseconds(long j, int i);

        private native void native_setFloatProperty(long j, String str, float f);

        private native void native_setProperty(long j, String str, int i);

        private native void native_setSelectionType(long j, NativeSelectionType nativeSelectionType);

        private native void native_setSingleBarcodeAutoDetectionEnabled(long j, boolean z);

        private native void native_setStringProperty(long j, String str, String str2);

        private native void native_setSwipeGesturesEnabled(long j, boolean z);

        private native void native_setSymbologyEnabled(long j, Symbology symbology, boolean z);

        private native void native_setTapGestureForSelectionEnabled(long j, boolean z);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public int getCodeDuplicateFilterMilliseconds() {
            return native_getCodeDuplicateFilterMilliseconds(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public int getProperty(String str) {
            return native_getProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public NativeSelectionType getSelectionType() {
            return native_getSelectionType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public boolean getSingleBarcodeAutoDetectionEnabled() {
            return native_getSingleBarcodeAutoDetectionEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public boolean getSwipeGesturesEnabled() {
            return native_getSwipeGesturesEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public boolean getTapGestureForSelectionEnabled() {
            return native_getTapGestureForSelectionEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setCodeDuplicateFilterMilliseconds(int i) {
            native_setCodeDuplicateFilterMilliseconds(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setFloatProperty(String str, float f) {
            native_setFloatProperty(this.nativeRef, str, f);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setProperty(String str, int i) {
            native_setProperty(this.nativeRef, str, i);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSelectionType(NativeSelectionType nativeSelectionType) {
            native_setSelectionType(this.nativeRef, nativeSelectionType);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSingleBarcodeAutoDetectionEnabled(boolean z) {
            native_setSingleBarcodeAutoDetectionEnabled(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSwipeGesturesEnabled(boolean z) {
            native_setSwipeGesturesEnabled(this.nativeRef, z);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setTapGestureForSelectionEnabled(boolean z) {
            native_setTapGestureForSelectionEnabled(this.nativeRef, z);
        }
    }

    public static native NativeBarcodeSelectionSettings create();

    public static native NativeBarcodeSelectionSettings createWithPresets(HashSet<CapturePreset> hashSet);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract int getCodeDuplicateFilterMilliseconds();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract int getProperty(String str);

    public abstract NativeSelectionType getSelectionType();

    public abstract boolean getSingleBarcodeAutoDetectionEnabled();

    public abstract boolean getSwipeGesturesEnabled();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract boolean getTapGestureForSelectionEnabled();

    public abstract void setCodeDuplicateFilterMilliseconds(int i);

    public abstract void setFloatProperty(String str, float f);

    public abstract void setProperty(String str, int i);

    public abstract void setSelectionType(NativeSelectionType nativeSelectionType);

    public abstract void setSingleBarcodeAutoDetectionEnabled(boolean z);

    public abstract void setStringProperty(String str, String str2);

    public abstract void setSwipeGesturesEnabled(boolean z);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z);

    public abstract void setTapGestureForSelectionEnabled(boolean z);
}
