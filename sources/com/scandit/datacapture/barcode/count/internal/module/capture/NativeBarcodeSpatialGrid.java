package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeSpatialGrid {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSpatialGrid {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17520a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeBarcode native_barcodeAt(long j, int i, int i2);

        private native ArrayList<NativeBarcode> native_column(long j, int i);

        private native int native_columns(long j);

        private native ArrayList<Coordinate2d> native_coordinatesForBarcode(long j, NativeBarcode nativeBarcode);

        private native ArrayList<NativeBarcode> native_row(long j, int i);

        private native int native_rows(long j);

        private native String native_toJson(long j);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public NativeBarcode barcodeAt(int i, int i2) {
            return native_barcodeAt(this.nativeRef, i, i2);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ArrayList<NativeBarcode> column(int i) {
            return native_column(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public int columns() {
            return native_columns(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ArrayList<Coordinate2d> coordinatesForBarcode(NativeBarcode nativeBarcode) {
            return native_coordinatesForBarcode(this.nativeRef, nativeBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ArrayList<NativeBarcode> row(int i) {
            return native_row(this.nativeRef, i);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public int rows() {
            return native_rows(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public abstract NativeBarcode barcodeAt(int i, int i2);

    public abstract ArrayList<NativeBarcode> column(int i);

    public abstract int columns();

    public abstract ArrayList<Coordinate2d> coordinatesForBarcode(NativeBarcode nativeBarcode);

    public abstract ArrayList<NativeBarcode> row(int i);

    public abstract int rows();

    public abstract String toJson();
}
