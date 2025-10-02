package au.com.woolworths.product.tile;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PromotionCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/tile/PromotionClickInterceptor;", "Lau/com/woolworths/product/tile/ProductClickListener;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromotionClickInterceptor implements ProductClickListener {
    public final PromotionCard d;
    public final PromotionClickListener e;

    public PromotionClickInterceptor(PromotionCard promotionCard, PromotionClickListener promotionClickListener) {
        Intrinsics.h(promotionClickListener, "promotionClickListener");
        this.d = promotionCard;
        this.e = promotionClickListener;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.e.v2(this.d, containerTitle);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        this.e.Q4(this.d, containerTitle);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.e.S3(this.d, containerTitle);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void Q2(String containerTitle, String priceFamilyId) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        this.e.x3(this.d, containerTitle);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.e.C1(this.d, containerTitle);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.e.r2(this.d, containerTitle);
    }
}
