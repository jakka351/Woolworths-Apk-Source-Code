package au.com.woolworths.shop.receipts.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/data/ReceiptListItem;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReceiptListItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f12869a;
    public final String b;
    public final String c;

    public ReceiptListItem(String str, String str2, String str3) {
        this.f12869a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptListItem)) {
            return false;
        }
        ReceiptListItem receiptListItem = (ReceiptListItem) obj;
        return Intrinsics.c(this.f12869a, receiptListItem.f12869a) && Intrinsics.c(this.b, receiptListItem.b) && Intrinsics.c(this.c, receiptListItem.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f12869a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("ReceiptListItem(id=", this.f12869a, ", displayDate=", this.b, ", displayValue="), this.c, ")");
    }
}
