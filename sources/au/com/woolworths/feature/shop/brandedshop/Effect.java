package au.com.woolworths.feature.shop.brandedshop;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect;", "", "LaunchProductDetails", "LaunchListsBottomSheet", "LaunchAddToCartBottomSheet", "LaunchInStoreMap", "ViewShoppingList", "OpenLink", "Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchAddToCartBottomSheet;", "Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchInStoreMap;", "Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/brandedshop/Effect$OpenLink;", "Lau/com/woolworths/feature/shop/brandedshop/Effect$ViewShoppingList;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Effect {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchAddToCartBottomSheet;", "Lau/com/woolworths/feature/shop/brandedshop/Effect;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchAddToCartBottomSheet implements Effect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f6659a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchAddToCartBottomSheet(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f6659a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchAddToCartBottomSheet) && Intrinsics.c(this.f6659a, ((LaunchAddToCartBottomSheet) obj).f6659a);
        }

        public final int hashCode() {
            return this.f6659a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchAddToCartBottomSheet(productCard=", this.f6659a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchInStoreMap;", "Lau/com/woolworths/feature/shop/brandedshop/Effect;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchInStoreMap implements Effect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f6660a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchInStoreMap(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f6660a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchInStoreMap) && Intrinsics.c(this.f6660a, ((LaunchInStoreMap) obj).f6660a);
        }

        public final int hashCode() {
            return this.f6660a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchInStoreMap(productCard=", this.f6660a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchListsBottomSheet;", "Lau/com/woolworths/feature/shop/brandedshop/Effect;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchListsBottomSheet implements Effect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f6661a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchListsBottomSheet(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f6661a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchListsBottomSheet) && Intrinsics.c(this.f6661a, ((LaunchListsBottomSheet) obj).f6661a);
        }

        public final int hashCode() {
            return this.f6661a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchListsBottomSheet(productCard=", this.f6661a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/brandedshop/Effect;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchProductDetails implements Effect {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f6662a;

        static {
            int i = ProductCard.$stable;
        }

        public LaunchProductDetails(ProductCard productCard) {
            Intrinsics.h(productCard, "productCard");
            this.f6662a = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f6662a, ((LaunchProductDetails) obj).f6662a);
        }

        public final int hashCode() {
            return this.f6662a.hashCode();
        }

        public final String toString() {
            return d.n("LaunchProductDetails(productCard=", this.f6662a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect$OpenLink;", "Lau/com/woolworths/feature/shop/brandedshop/Effect;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenLink implements Effect {

        /* renamed from: a, reason: collision with root package name */
        public final String f6663a;

        public OpenLink(String link) {
            Intrinsics.h(link, "link");
            this.f6663a = link;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLink) && Intrinsics.c(this.f6663a, ((OpenLink) obj).f6663a);
        }

        public final int hashCode() {
            return this.f6663a.hashCode();
        }

        public final String toString() {
            return a.h("OpenLink(link=", this.f6663a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/Effect$ViewShoppingList;", "Lau/com/woolworths/feature/shop/brandedshop/Effect;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewShoppingList implements Effect {

        /* renamed from: a, reason: collision with root package name */
        public final String f6664a;

        public ViewShoppingList(String id) {
            Intrinsics.h(id, "id");
            this.f6664a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewShoppingList) && Intrinsics.c(this.f6664a, ((ViewShoppingList) obj).f6664a);
        }

        public final int hashCode() {
            return this.f6664a.hashCode();
        }

        public final String toString() {
            return a.h("ViewShoppingList(id=", this.f6664a, ")");
        }
    }
}
