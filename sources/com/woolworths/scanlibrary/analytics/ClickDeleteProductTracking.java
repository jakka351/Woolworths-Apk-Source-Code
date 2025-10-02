package com.woolworths.scanlibrary.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/ClickDeleteProductTracking;", "Lcom/woolworths/scanlibrary/analytics/ActionTracking;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClickDeleteProductTracking extends ActionTracking {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickDeleteProductTracking(String productLineNumber) {
        super("Delete Item - PS");
        Intrinsics.h(productLineNumber, "productLineNumber");
        a("productionInformation.lineNumber", productLineNumber);
    }
}
