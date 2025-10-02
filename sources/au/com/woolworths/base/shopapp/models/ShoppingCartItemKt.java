package au.com.woolworths.base.shopapp.models;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toShoppingCartItem", "Lau/com/woolworths/base/shopapp/models/ShoppingCartItem;", "Lau/com/woolworths/android/onesite/models/TrolleyResult$TrolleyItem;", "base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingCartItemKt {
    @NotNull
    public static final ShoppingCartItem toShoppingCartItem(@NotNull TrolleyResult.TrolleyItem trolleyItem) {
        Intrinsics.h(trolleyItem, "<this>");
        return new ShoppingCartItem(trolleyItem.getArticle(), trolleyItem.getItemQuantityInTrolley());
    }
}
