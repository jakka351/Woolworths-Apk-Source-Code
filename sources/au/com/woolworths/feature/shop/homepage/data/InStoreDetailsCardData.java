package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/InStoreDetailsCardData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InStoreDetailsCardData {

    /* renamed from: a, reason: collision with root package name */
    public final TextWithLinkApiData f7198a;
    public final TextWithLinkApiData b;
    public final Boolean c;

    public InStoreDetailsCardData(TextWithLinkApiData textWithLinkApiData, TextWithLinkApiData textWithLinkApiData2, Boolean bool) {
        this.f7198a = textWithLinkApiData;
        this.b = textWithLinkApiData2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InStoreDetailsCardData)) {
            return false;
        }
        InStoreDetailsCardData inStoreDetailsCardData = (InStoreDetailsCardData) obj;
        return Intrinsics.c(this.f7198a, inStoreDetailsCardData.f7198a) && Intrinsics.c(this.b, inStoreDetailsCardData.b) && Intrinsics.c(this.c, inStoreDetailsCardData.c);
    }

    public final int hashCode() {
        TextWithLinkApiData textWithLinkApiData = this.f7198a;
        int iHashCode = (textWithLinkApiData == null ? 0 : textWithLinkApiData.hashCode()) * 31;
        TextWithLinkApiData textWithLinkApiData2 = this.b;
        int iHashCode2 = (iHashCode + (textWithLinkApiData2 == null ? 0 : textWithLinkApiData2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InStoreDetailsCardData(storeName=");
        sb.append(this.f7198a);
        sb.append(", storeTime=");
        sb.append(this.b);
        sb.append(", isLocationMapped=");
        return a.o(sb, this.c, ")");
    }
}
