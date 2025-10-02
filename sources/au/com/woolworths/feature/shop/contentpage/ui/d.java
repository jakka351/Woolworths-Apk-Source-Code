package au.com.woolworths.feature.shop.contentpage.ui;

import au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardUiKt;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplaceProductCarouselUiKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.tile.ProductClickListener;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductClickListener e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ProductCard g;

    public /* synthetic */ d(ProductClickListener productClickListener, String str, ProductCard productCard, int i) {
        this.d = i;
        this.e = productClickListener;
        this.f = str;
        this.g = productCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductCard productCard = this.g;
        String str = this.f;
        ProductClickListener productClickListener = this.e;
        switch (i) {
            case 0:
                productClickListener.J1(productCard, str != null ? str : "");
                break;
            case 1:
                productClickListener.g6(productCard, str != null ? str : "");
                break;
            case 2:
                productClickListener.Q2(str != null ? str : "", ProductCardExtKt.g(productCard));
                break;
            case 3:
                RewardsOfferInfo rewardsOfferInfo = ProductCardUiKt.f7246a;
                productClickListener.J1(productCard, str != null ? str : "");
                break;
            case 4:
                productClickListener.g6(productCard, str != null ? str : "");
                break;
            case 5:
                productClickListener.Q2(str != null ? str : "", ProductCardExtKt.g(productCard));
                break;
            case 6:
                ArrayList arrayList = MarketplaceProductCarouselUiKt.f7510a;
                productClickListener.J1(productCard, str);
                break;
            case 7:
                productClickListener.g5(productCard, str != null ? str : "");
                break;
            case 8:
                productClickListener.T4(productCard, str != null ? str : "");
                break;
            case 9:
                productClickListener.D4(productCard, str != null ? str : "");
                break;
            case 10:
                productClickListener.L0(productCard, str != null ? str : "");
                break;
            case 11:
                productClickListener.u3(productCard, str != null ? str : "");
                break;
            case 12:
                productClickListener.g5(productCard, str != null ? str : "");
                break;
            case 13:
                productClickListener.T4(productCard, str != null ? str : "");
                break;
            case 14:
                productClickListener.D4(productCard, str != null ? str : "");
                break;
            case 15:
                productClickListener.L0(productCard, str != null ? str : "");
                break;
            case 16:
                productClickListener.u3(productCard, str != null ? str : "");
                break;
            case 17:
                productClickListener.J1(productCard, str != null ? str : "");
                break;
            default:
                productClickListener.g6(productCard, str != null ? str : "");
                break;
        }
        return unit;
    }
}
