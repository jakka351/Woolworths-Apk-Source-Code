package au.com.woolworths.product.models;

import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$BoostButton;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardBoostButtonExtKt {
    @NotNull
    public static final ButtonApiData toUiModel(@NotNull ProductCard.BoostButton boostButton) {
        Intrinsics.h(boostButton, "<this>");
        String str = boostButton.f8951a;
        ButtonStyle buttonStyle = boostButton.b;
        return new ButtonApiData(str, null, buttonStyle != null ? ButtonStyleExtKt.toUiModel(buttonStyle) : null, boostButton.c, null, null, null, null, null, 498, null);
    }
}
