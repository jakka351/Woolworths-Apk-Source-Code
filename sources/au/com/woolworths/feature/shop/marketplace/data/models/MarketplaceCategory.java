package au.com.woolworths.feature.shop.marketplace.data.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceCategory;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceCategory {

    /* renamed from: a, reason: collision with root package name */
    public final String f7472a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public MarketplaceCategory(String str, String str2, String str3, String str4, boolean z) {
        this.f7472a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceCategory)) {
            return false;
        }
        MarketplaceCategory marketplaceCategory = (MarketplaceCategory) obj;
        return Intrinsics.c(this.f7472a, marketplaceCategory.f7472a) && Intrinsics.c(this.b, marketplaceCategory.b) && Intrinsics.c(this.c, marketplaceCategory.c) && this.d == marketplaceCategory.d && Intrinsics.c(this.e, marketplaceCategory.e);
    }

    public final int hashCode() {
        int iE = b.e(b.c(b.c(this.f7472a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("MarketplaceCategory(id=", this.f7472a, ", title=", this.b, ", imageUrl=");
        d.A(this.c, ", isFinalLevel=", ", source=", sbV, this.d);
        return a.o(sbV, this.e, ")");
    }
}
