package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeBarcodeFindSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17728a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native HashSet<NativeBarcodeFindItem> native_getAllFoundItems(long j);

        private native HashSet<NativeBarcodeFindItem> native_getFoundItemsInLastProcessedFrame(long j);

        private native HashMap<Integer, NativeTrackedBarcode> native_getFoundTrackedBarcodes(long j);

        private native HashMap<Integer, NativeTrackedBarcode> native_getTrackedBarcodes(long j);

        private native String native_getTransformedDataForData(long j, String str);

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashSet<NativeBarcodeFindItem> getAllFoundItems() {
            return native_getAllFoundItems(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashSet<NativeBarcodeFindItem> getFoundItemsInLastProcessedFrame() {
            return native_getFoundItemsInLastProcessedFrame(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashMap<Integer, NativeTrackedBarcode> getFoundTrackedBarcodes() {
            return native_getFoundTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes() {
            return native_getTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public String getTransformedDataForData(String str) {
            return native_getTransformedDataForData(this.nativeRef, str);
        }
    }

    public abstract HashSet<NativeBarcodeFindItem> getAllFoundItems();

    public abstract HashSet<NativeBarcodeFindItem> getFoundItemsInLastProcessedFrame();

    public abstract HashMap<Integer, NativeTrackedBarcode> getFoundTrackedBarcodes();

    public abstract HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes();

    public abstract String getTransformedDataForData(String str);
}
