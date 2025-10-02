package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.engine.NativeProperty;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeSparkScanSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18108a = new AtomicBoolean(false);
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

        private native int native_getCodeDuplicateFilterMilliseconds(long j);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j);

        private native NativeLocationSelection native_getLocationSelection(long j);

        private native int native_getProperty(long j, String str);

        private native ScanIntention native_getScanIntention(long j);

        private native NativeSymbologySettings native_getSymbologySettings(long j, Symbology symbology);

        private native void native_setCodeDuplicateFilterMilliseconds(long j, int i);

        private native void native_setFloatProperty(long j, String str, float f);

        private native void native_setLocationSelection(long j, NativeLocationSelection nativeLocationSelection);

        private native void native_setProperty(long j, String str, int i);

        private native void native_setScanIntention(long j, ScanIntention scanIntention);

        private native void native_setStringProperty(long j, String str, String str2);

        private native void native_setSymbologyEnabled(long j, Symbology symbology, boolean z);

        private native void native_updateForTargetModeEnabledAndZoomedIn(long j, boolean z, boolean z2, ScanIntention scanIntention);

        private native void native_updateFromJson(long j, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public int getCodeDuplicateFilterMilliseconds() {
            return native_getCodeDuplicateFilterMilliseconds(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public NativeLocationSelection getLocationSelection() {
            return native_getLocationSelection(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public int getProperty(String str) {
            return native_getProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public ScanIntention getScanIntention() {
            return native_getScanIntention(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setCodeDuplicateFilterMilliseconds(int i) {
            native_setCodeDuplicateFilterMilliseconds(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setFloatProperty(String str, float f) {
            native_setFloatProperty(this.nativeRef, str, f);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setLocationSelection(NativeLocationSelection nativeLocationSelection) {
            native_setLocationSelection(this.nativeRef, nativeLocationSelection);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setProperty(String str, int i) {
            native_setProperty(this.nativeRef, str, i);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setScanIntention(ScanIntention scanIntention) {
            native_setScanIntention(this.nativeRef, scanIntention);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void updateForTargetModeEnabledAndZoomedIn(boolean z, boolean z2, ScanIntention scanIntention) {
            native_updateForTargetModeEnabledAndZoomedIn(this.nativeRef, z, z2, scanIntention);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings
        public void updateFromJson(NativeJsonValue nativeJsonValue) {
            native_updateFromJson(this.nativeRef, nativeJsonValue);
        }
    }

    public static native NativeSparkScanSettings create();

    public static native NativeSparkScanSettings createWithPresets(HashSet<CapturePreset> hashSet);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract int getCodeDuplicateFilterMilliseconds();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract NativeLocationSelection getLocationSelection();

    public abstract int getProperty(String str);

    public abstract ScanIntention getScanIntention();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setCodeDuplicateFilterMilliseconds(int i);

    public abstract void setFloatProperty(String str, float f);

    public abstract void setLocationSelection(NativeLocationSelection nativeLocationSelection);

    public abstract void setProperty(String str, int i);

    public abstract void setScanIntention(ScanIntention scanIntention);

    public abstract void setStringProperty(String str, String str2);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z);

    public abstract void updateForTargetModeEnabledAndZoomedIn(boolean z, boolean z2, ScanIntention scanIntention);

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
