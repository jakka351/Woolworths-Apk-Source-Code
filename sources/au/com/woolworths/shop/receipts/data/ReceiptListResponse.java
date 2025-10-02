package au.com.woolworths.shop.receipts.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/data/ReceiptListResponse;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReceiptListResponse {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12871a;
    public final ReceiptListPageInfo b;

    public ReceiptListResponse(ArrayList arrayList, ReceiptListPageInfo receiptListPageInfo) {
        this.f12871a = arrayList;
        this.b = receiptListPageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptListResponse)) {
            return false;
        }
        ReceiptListResponse receiptListResponse = (ReceiptListResponse) obj;
        return this.f12871a.equals(receiptListResponse.f12871a) && this.b.equals(receiptListResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12871a.hashCode() * 31);
    }

    public final String toString() {
        return "ReceiptListResponse(items=" + this.f12871a + ", pageInfo=" + this.b + ")";
    }
}
