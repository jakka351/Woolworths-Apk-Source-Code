package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcodeProxy;", "", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;", "getData", "", "getQuantity", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeTargetBarcode.class)
/* loaded from: classes6.dex */
public interface TargetBarcodeProxy {
    @NativeImpl
    @NotNull
    NativeTargetBarcode _impl();

    @ProxyFunction
    @NotNull
    String getData();

    @ProxyFunction
    int getQuantity();
}
