package com.woolworths.scanlibrary.util.barcode;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/barcode/TransactionBarcode;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TransactionBarcode {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/barcode/TransactionBarcode$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransactionBarcode) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbV = a.v("TransactionBarcode(prefix=", null, ", storeNumber=", null, ", posNumber=");
        androidx.constraintlayout.core.state.a.B(sbV, null, ", transactionNumber=", null, ", transactionDate=");
        return a.o(sbV, null, ")");
    }
}
