package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract;", "", "ViewState", "Tab", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MarketplaceContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab;", "", "Personalised", "Category", "Brand", "Seller", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Brand;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Category;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Personalised;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Seller;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Tab {

        /* renamed from: a, reason: collision with root package name */
        public final String f7492a;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Brand;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Brand extends Tab {
            public final String b;

            public Brand(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Brand) && Intrinsics.c(this.b, ((Brand) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return a.h("Brand(title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Category;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Category extends Tab {
            public final String b;

            public Category(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Category) && Intrinsics.c(this.b, ((Category) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return a.h("Category(title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Personalised;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Personalised extends Tab {
            public final String b;

            public Personalised(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Personalised) && Intrinsics.c(this.b, ((Personalised) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return a.h("Personalised(title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab$Seller;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$Tab;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Seller extends Tab {
            public final String b;

            public Seller(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Seller) && Intrinsics.c(this.b, ((Seller) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return a.h("Seller(title=", this.b, ")");
            }
        }

        public Tab(String str) {
            this.f7492a = str;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$ViewState;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Marketplace f7493a;
        public final List b;
        public final boolean c;
        public final MarketplaceErrorState d;

        public ViewState(Marketplace marketplace, List list, boolean z, MarketplaceErrorState marketplaceErrorState) {
            this.f7493a = marketplace;
            this.b = list;
            this.c = z;
            this.d = marketplaceErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f7493a, viewState.f7493a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            Marketplace marketplace = this.f7493a;
            int iHashCode = (marketplace == null ? 0 : marketplace.hashCode()) * 31;
            List list = this.b;
            int iE = b.e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c);
            MarketplaceErrorState marketplaceErrorState = this.d;
            return iE + (marketplaceErrorState != null ? marketplaceErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(marketplace=" + this.f7493a + ", tabs=" + this.b + ", isLoading=" + this.c + ", errorState=" + this.d + ")";
        }
    }
}
