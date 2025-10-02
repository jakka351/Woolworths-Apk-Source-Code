package au.com.woolworths.feature.shop.marketplace.data.models;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/Marketplace;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Marketplace {

    /* renamed from: a, reason: collision with root package name */
    public final InfoHeader f7468a;
    public final ArrayList b;

    public Marketplace(InfoHeader infoHeader, ArrayList arrayList) {
        this.f7468a = infoHeader;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marketplace)) {
            return false;
        }
        Marketplace marketplace = (Marketplace) obj;
        return this.f7468a.equals(marketplace.f7468a) && this.b.equals(marketplace.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7468a.hashCode() * 31);
    }

    public final String toString() {
        return "Marketplace(infoHeader=" + this.f7468a + ", sections=" + this.b + ")";
    }
}
