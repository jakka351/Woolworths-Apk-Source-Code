package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/FooterData;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FooterData {

    /* renamed from: a, reason: collision with root package name */
    public final FooterMessageData f12600a;
    public final ArrayList b;

    public FooterData(FooterMessageData footerMessageData, ArrayList arrayList) {
        this.f12600a = footerMessageData;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterData)) {
            return false;
        }
        FooterData footerData = (FooterData) obj;
        return Intrinsics.c(this.f12600a, footerData.f12600a) && this.b.equals(footerData.b);
    }

    public final int hashCode() {
        FooterMessageData footerMessageData = this.f12600a;
        return this.b.hashCode() + ((footerMessageData == null ? 0 : footerMessageData.hashCode()) * 31);
    }

    public final String toString() {
        return "FooterData(footerMessage=" + this.f12600a + ", productDetailsActions=" + this.b + ")";
    }
}
