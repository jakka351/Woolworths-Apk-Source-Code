package com.woolworths.shop.product.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/product/ui/ProductCardProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/product/models/ProductCard;", "Companion", "product-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductCardProvider implements PreviewParameterProvider<ProductCard> {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductCard f23627a = ProductCardPreviewDataKt.b("12345678", "Woolworths Creamy Pasta 250g", 720, "$0.72 per 100g", true, null, null, new ProductShoppingList(0.0d, 35.0d, 1.0d, 1.0d, null, 16, null), null, null, null, null, null, null, new MultiBuyPriceInfo("3 for $10", "0.72 per 100g"), null, null, -538117908, 3);
    public static final ProductCard b = ProductCardPreviewDataKt.b("12345678", "Woolworths Creamy Pasta 250g", 720, "$0.72 per 100g", true, null, null, new ProductShoppingList(0.0d, 35.0d, 1.0d, 1.0d, null, 16, null), null, null, null, null, null, null, new MultiBuyPriceInfo("3 for $10", "0.72 per 100g"), null, null, -538117940, 1);
    public static final ProductCard c = ProductCardPreviewDataKt.b("12345678", "Woolworths Creamy Pasta 250g", 720, "$0.72 per 100g", true, null, null, new ProductShoppingList(0.0d, 35.0d, 1.0d, 1.0d, null, 16, null), null, null, null, null, null, null, new MultiBuyPriceInfo("3 for $10", "0.72 per 100g"), null, null, -537069332, 3);
    public static final ProductCard d = ProductCardPreviewDataKt.b("12345678", "Woolworths Creamy Pasta 250g", 720, "$0.72 per 100g", true, null, null, new ProductShoppingList(0.0d, 35.0d, 1.0d, 1.0d, null, 16, null), new InstoreDetailsData("Aisle 3", InStoreLocationType.AVAILABLE), null, null, null, null, null, null, null, null, -1246996, 3);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/ui/ProductCardProvider$Companion;", "", "product-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return ArraysKt.g(new ProductCard[]{f23627a, b, c, d});
    }
}
