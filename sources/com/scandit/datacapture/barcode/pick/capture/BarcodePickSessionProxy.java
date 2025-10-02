package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxy;", "", "addedItems", "", "", "getAddedItems", "()Ljava/util/Set;", "trackedItems", "getTrackedItems", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickPublicSession.class)
/* loaded from: classes6.dex */
public interface BarcodePickSessionProxy {
    @ProxyFunction(nativeName = "getAddedObjects", property = "addedItems")
    @NotNull
    Set<String> getAddedItems();

    @ProxyFunction(nativeName = "getTrackedObjects", property = "trackedItems")
    @NotNull
    Set<String> getTrackedItems();
}
