package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import com.woolworths.product.list.ProductsByCategoryQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/sdui/shop/actionablecard/ActionableCard;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$OnActionableCard;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByCategoryQueryOnActionableCardExtKt {
    @NotNull
    public static final ActionableCard toUiModel(@NotNull ProductsByCategoryQuery.OnActionableCard onActionableCard) {
        Intrinsics.h(onActionableCard, "<this>");
        return new ActionableCard(onActionableCard.getImage(), onActionableCard.getAltText(), CardHeightExtKt.toUiModel(onActionableCard.getCardHeight()), onActionableCard.getLink(), onActionableCard.getAnalytics(), null, null);
    }
}
