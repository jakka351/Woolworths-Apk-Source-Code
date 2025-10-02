package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProviderCallback;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallback;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asNative", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeAsyncMapperProductProviderCallback;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderCallback;", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodePickAsyncMapperProductProviderCallbackKt {
    @NotNull
    public static final NativeAsyncMapperProductProviderCallback asNative(@NotNull final BarcodePickAsyncMapperProductProviderCallback barcodePickAsyncMapperProductProviderCallback) {
        Intrinsics.h(barcodePickAsyncMapperProductProviderCallback, "<this>");
        return new NativeAsyncMapperProductProviderCallback() { // from class: com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderCallbackKt.asNative.1
            @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProviderCallback
            public void productIdentifierForItems(@NotNull ArrayList<String> itemsData, @NotNull NativeProductProviderCallback providerCallback) {
                Intrinsics.h(itemsData, "itemsData");
                Intrinsics.h(providerCallback, "providerCallback");
                barcodePickAsyncMapperProductProviderCallback.productIdentifierForItems(itemsData, new BarcodePickProductProviderCallback(providerCallback));
            }
        };
    }
}
