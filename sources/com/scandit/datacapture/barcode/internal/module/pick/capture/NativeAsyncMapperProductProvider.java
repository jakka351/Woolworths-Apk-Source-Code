package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeAsyncMapperProductProvider {

    @DjinniGenerated
    public static final class CppProxy extends NativeAsyncMapperProductProvider {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17740a = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);

        private native NativeProductProvider native_asProductProvider(long j);

        private native void native_productIdentifierForItems(long j, ArrayList<String> arrayList, NativeProductProviderCallback nativeProductProviderCallback);

        private native void native_updateProductList(long j, ArrayList<NativeBarcodePickProduct> arrayList);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProvider
        public NativeProductProvider asProductProvider() {
            return native_asProductProvider(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProvider
        public void productIdentifierForItems(ArrayList<String> arrayList, NativeProductProviderCallback nativeProductProviderCallback) {
            native_productIdentifierForItems(this.nativeRef, arrayList, nativeProductProviderCallback);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProvider
        public void updateProductList(ArrayList<NativeBarcodePickProduct> arrayList) {
            native_updateProductList(this.nativeRef, arrayList);
        }
    }

    public static native NativeAsyncMapperProductProvider create(ArrayList<NativeBarcodePickProduct> arrayList, NativeAsyncMapperProductProviderCallback nativeAsyncMapperProductProviderCallback);

    public abstract NativeProductProvider asProductProvider();

    public abstract void productIdentifierForItems(ArrayList<String> arrayList, NativeProductProviderCallback nativeProductProviderCallback);

    public abstract void updateProductList(ArrayList<NativeBarcodePickProduct> arrayList);
}
