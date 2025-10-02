package au.com.woolworths.feature.shop.marketplace.data.models;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplacePersonalised;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceSection;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplacePersonalised implements MarketplaceSection {

    /* renamed from: a, reason: collision with root package name */
    public final MarketplaceLandingPageName f7473a;
    public final String b;
    public final List c;

    public MarketplacePersonalised(MarketplaceLandingPageName pageName, String str, List list) {
        Intrinsics.h(pageName, "pageName");
        this.f7473a = pageName;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplacePersonalised)) {
            return false;
        }
        MarketplacePersonalised marketplacePersonalised = (MarketplacePersonalised) obj;
        return this.f7473a == marketplacePersonalised.f7473a && Intrinsics.c(this.b, marketplacePersonalised.b) && Intrinsics.c(this.c, marketplacePersonalised.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f7473a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketplacePersonalised(pageName=");
        sb.append(this.f7473a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", items=");
        return a.t(sb, this.c, ")");
    }
}
