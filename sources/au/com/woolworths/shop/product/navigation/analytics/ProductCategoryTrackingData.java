package au.com.woolworths.shop.product.navigation.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData;", "", "Products", "Specials", "Marketplace", "Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData$Marketplace;", "Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData$Products;", "Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData$Specials;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductCategoryTrackingData {

    /* renamed from: a, reason: collision with root package name */
    public final Enum f12639a;
    public final Action b;
    public final Action c;
    public final Action d;
    public final Action e;
    public final Action f;
    public final Action g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData$Marketplace;", "Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Marketplace extends ProductCategoryTrackingData {
        public static final Marketplace h = new Marketplace(Screens.m, MarketplaceSubCategoryActionData.j, MarketplaceSubCategoryActionData.g, MarketplaceSubCategoryActionData.f, MarketplaceSubCategoryActionData.e, MarketplaceSubCategoryActionData.i, MarketplaceSubCategoryActionData.h);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData$Products;", "Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Products extends ProductCategoryTrackingData {
        public static final Products h = new Products(ProductCategoryScreens.d, ProductSubCategoryActionData.j, ProductSubCategoryActionData.g, ProductSubCategoryActionData.f, ProductSubCategoryActionData.e, ProductSubCategoryActionData.i, ProductSubCategoryActionData.h);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData$Specials;", "Lau/com/woolworths/shop/product/navigation/analytics/ProductCategoryTrackingData;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Specials extends ProductCategoryTrackingData {
        public static final Specials h = new Specials(ProductCategoryScreens.f, SpecialsSubCategoryActionData.j, SpecialsSubCategoryActionData.g, SpecialsSubCategoryActionData.f, SpecialsSubCategoryActionData.e, SpecialsSubCategoryActionData.i, SpecialsSubCategoryActionData.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCategoryTrackingData(Screen screen, Action action, Action action2, Action action3, Action action4, Action action5, Action action6) {
        this.f12639a = (Enum) screen;
        this.b = action;
        this.c = action2;
        this.d = action3;
        this.e = action4;
        this.f = action5;
        this.g = action6;
    }
}
