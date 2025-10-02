package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.bundles.data.BundleDetails;
import au.com.woolworths.feature.shop.bundles.data.BundlePricingData;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.TitleTagData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductInlineTypeApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.sdui.common.corecolortheme.Background;
import au.com.woolworths.sdui.common.corecolortheme.CompatibleColorData;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.corecolortheme.Foreground;
import au.com.woolworths.sdui.common.corecolortheme.Highlight;
import au.com.woolworths.sdui.common.corecolortheme.Primary;
import au.com.woolworths.sdui.common.corecolortheme.Secondary;
import au.com.woolworths.sdui.common.corecolortheme.TextColor;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/ui/BundlesSampleData;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesSampleData {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductCard f6772a;
    public static final ProductCard b;
    public static final BundleProductCard c;
    public static final BundleProductCard d;
    public static final BundleDetails e;
    public static final BundleDetails f;

    static {
        PurchaseRestriction purchaseRestriction = PurchaseRestriction.NO_RESTRICTION;
        ProductInlineTypeApiData productInlineTypeApiData = ProductInlineTypeApiData.NEW;
        List listQ = CollectionsKt.Q(new ProductInlineLabelApiData(productInlineTypeApiData, "NEW", 0));
        ProductTileButtonType productTileButtonType = ProductTileButtonType.ADD;
        ProductCard productCard = new ProductCard("000000000000239598", "Woolworths Pork & Beef Mince 500g", "https://uat-assets.woolworths.com.au/images/1005/239598.jpg?impolicy=wowsmmobeac&w=260&h=260", null, 650, null, null, null, "$13.00 per 1kg", true, true, null, null, null, null, new ProductTrolleyData(1.0d, 16.0d, 1.0d, 1.0d, null, null, productTileButtonType, "Add", null, null), null, new ProductShoppingList(1.0d, 16.0d, 1.0d, 1.0d, null), null, purchaseRestriction, listQ, null, null, null, null, null, null, null, null, null, CollectionsKt.R(new ProductCategory("Meat, Seafood & Deli", 1), new ProductCategory("Meat", 2), new ProductCategory("Mince", 3)), false, null, null, null, null, null, null, null, null, 478228704, 248, null);
        f6772a = productCard;
        b = new ProductCard("000000000000157649", "Eat Later Cavendish Bananas Each", "https://uat-assets.woolworths.com.au/images/1005/157649.jpg?impolicy=wowsmmobeac&w=260&h=260", null, 76, null, null, null, "$0.76 each", true, true, null, null, null, null, new ProductTrolleyData(1.0d, 29.0d, 1.0d, 1.0d, null, null, productTileButtonType, "Add", null, null), null, new ProductShoppingList(1.0d, 29.0d, 1.0d, 1.0d, null), null, purchaseRestriction, CollectionsKt.Q(new ProductInlineLabelApiData(productInlineTypeApiData, "NEW", 0)), null, null, null, null, null, null, null, null, null, CollectionsKt.R(new ProductCategory("Fruit & Veg", 1), new ProductCategory("Fruit", 2), new ProductCategory("Mince", 3)), false, null, null, null, null, null, null, null, null, 478228704, 248, null);
        c = new BundleProductCard(productCard, null);
        d = new BundleProductCard(productCard, "Qty 2");
        BundlePricingData.BundleStandardPricingData bundleStandardPricingData = new BundlePricingData.BundleStandardPricingData("3 products for", "$30.20", new CoreTagModel("Save $5.00", new CoreColorTheme(new Background(new CompatibleColorData("#FFDA00")), new Foreground(new Primary(new CompatibleColorData("#171C1F")), new Secondary(new CompatibleColorData("#171C1F")), new Highlight(new CompatibleColorData("#171C1F")))), false, null));
        e = new BundleDetails(new TitleTagData("Online only", new TextColor(new CompatibleColorData("#178841"))), "Old El Paso Taco", "All all N products to redeem Bundle offer. Office-price applied in cart", bundleStandardPricingData);
        f = new BundleDetails(new TitleTagData("Online only", new TextColor(new CompatibleColorData("#178841"))), "Old El Paso Taco Night, Hard Taco Mince Bundle and three line title", "All all N products to redeem Bundle offer. Office-price applied in cart", bundleStandardPricingData);
    }
}
