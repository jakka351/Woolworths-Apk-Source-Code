package au.com.woolworths.feature.shop.marketplace.data.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceBrand;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceFacet;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceBrand implements MarketplaceFacet {

    /* renamed from: a, reason: collision with root package name */
    public final String f7469a;
    public final String b;
    public final String c;

    public MarketplaceBrand(String str, String str2, String str3) {
        this.f7469a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceBrand)) {
            return false;
        }
        MarketplaceBrand marketplaceBrand = (MarketplaceBrand) obj;
        return Intrinsics.c(this.f7469a, marketplaceBrand.f7469a) && Intrinsics.c(this.b, marketplaceBrand.b) && Intrinsics.c(this.c, marketplaceBrand.c);
    }

    @Override // au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceFacet
    /* renamed from: getImageUrl, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceFacet
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iC = b.c(this.f7469a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(a.v("MarketplaceBrand(logoUrl=", this.f7469a, ", title=", this.b, ", imageUrl="), this.c, ")");
    }
}
