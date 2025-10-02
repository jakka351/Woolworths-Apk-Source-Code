package au.com.woolworths.shop.productcard.ui;

import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.sdui.common.corecolortheme.Background;
import au.com.woolworths.sdui.common.corecolortheme.CompatibleColorData;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.corecolortheme.Foreground;
import au.com.woolworths.sdui.common.corecolortheme.Highlight;
import au.com.woolworths.sdui.common.corecolortheme.Primary;
import au.com.woolworths.sdui.common.corecolortheme.Secondary;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.data.ProductMainImage;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import au.com.woolworths.shop.productcard.data.ProductStatus;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.data.RoundelImage;
import au.com.woolworths.shop.productcard.data.RoundelImagePriority;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardDataKt {
    public static ProductTile a() {
        ProductMainImage productMainImage = new ProductMainImage();
        RoundelImage roundelImage = new RoundelImage("", "alt text", RoundelImagePriority.d);
        ProductPriceInfo productPriceInfo = new ProductPriceInfo("", 55, "/4kg", CollectionsKt.R(new TextWithAltData("$7.00 / 1kg", "Unit price 7 dollars per kilo"), new TextWithAltData("$13.35 / tray approx", "Approximately $13.35 per tray")), new TextWithAltData("$12.50", "Was $12.50"), new TextWithAltData("Save $5.50", "Save $5.50"), new TextWithAltData("Min $12.60 – Max $17.50", "Min $12.60 – Max $17.50"));
        List listQ = CollectionsKt.Q(new CoreTagModel("", new CoreColorTheme(new Background(new CompatibleColorData("")), new Foreground(new Primary(new CompatibleColorData("")), new Secondary(new CompatibleColorData("")), new Highlight(new CompatibleColorData("")))), false, null));
        List listQ2 = CollectionsKt.Q(new ProductStatus(new TextWithAltData("Status 1", ""), null));
        ProductShoppingList productShoppingList = new ProductShoppingList(33.3d, 55.5d, 44.5d, 44.0d, null, 16, null);
        MarketplaceInfo marketplaceInfo = new MarketplaceInfo("", new TextWithAltData("Marketplace partner", "Marketplace partner alternative text"));
        EmptyList emptyList = EmptyList.d;
        return new ProductTile("productId123", "Alfa One Rice Bran Oil 1l", roundelImage, productMainImage, listQ, productPriceInfo, listQ2, null, null, null, productShoppingList, emptyList, null, null, emptyList, null, null, null, marketplaceInfo, null);
    }
}
