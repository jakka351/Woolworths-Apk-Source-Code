package com.woolworths.scanlibrary.ui.receipt.adapter;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/Title;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptEntry;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Title extends ReceiptEntry {
    public final String b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Title(String storeName, String str) {
        super(1);
        Intrinsics.h(storeName, "storeName");
        this.b = storeName;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Title)) {
            return false;
        }
        Title title = (Title) obj;
        return Intrinsics.c(this.b, title.b) && Intrinsics.c(this.c, title.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("Title(storeName=", this.b, ", receiptMessage=", this.c, ")");
    }
}
