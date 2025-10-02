package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/data/BarcodeProxy;", "", "structuredAppendData", "Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "getStructuredAppendData", "()Lcom/scandit/datacapture/barcode/data/StructuredAppendData;", "_impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcode.class)
/* loaded from: classes6.dex */
public interface BarcodeProxy {
    @NativeImpl
    @NotNull
    NativeBarcode _impl();

    @ProxyFunction(nativeName = "getStructuredAppendData", property = "structuredAppendData")
    @Nullable
    StructuredAppendData getStructuredAppendData();

    @ProxyFunction(nativeName = "toJson")
    @NotNull
    String toJson();
}
