package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOfferTile;", "", "DataTile", "EmptyTile", "Lau/com/woolworths/feature/rewards/offers/ProductOfferTile$DataTile;", "Lau/com/woolworths/feature/rewards/offers/ProductOfferTile$EmptyTile;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductOfferTile {

    /* renamed from: a, reason: collision with root package name */
    public final String f6230a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOfferTile$DataTile;", "Lau/com/woolworths/feature/rewards/offers/ProductOfferTile;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DataTile extends ProductOfferTile {
        public final String b;
        public final OfferViewItem c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataTile(String str, OfferViewItem offer) {
            super(str);
            Intrinsics.h(offer, "offer");
            this.b = str;
            this.c = offer;
        }

        @Override // au.com.woolworths.feature.rewards.offers.ProductOfferTile
        /* renamed from: a, reason: from getter */
        public final String getF6230a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataTile)) {
                return false;
            }
            DataTile dataTile = (DataTile) obj;
            return Intrinsics.c(this.b, dataTile.b) && Intrinsics.c(this.c, dataTile.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "DataTile(groupTitle=" + this.b + ", offer=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOfferTile$EmptyTile;", "Lau/com/woolworths/feature/rewards/offers/ProductOfferTile;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmptyTile extends ProductOfferTile {
        public final String b;

        public EmptyTile(String str) {
            super(str);
            this.b = str;
        }

        @Override // au.com.woolworths.feature.rewards.offers.ProductOfferTile
        /* renamed from: a, reason: from getter */
        public final String getF6230a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmptyTile) && Intrinsics.c(this.b, ((EmptyTile) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return YU.a.h("EmptyTile(groupTitle=", this.b, ")");
        }
    }

    public ProductOfferTile(String str) {
        this.f6230a = str;
    }

    /* renamed from: a, reason: from getter */
    public String getF6230a() {
        return this.f6230a;
    }
}
