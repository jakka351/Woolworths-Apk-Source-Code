package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShoppingModeTypeDataKt {
    public static final ShoppingModeType a(CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "<this>");
        if (collectionMode instanceof CollectionMode.PickUp) {
            return ShoppingModeType.h;
        }
        if (collectionMode instanceof CollectionMode.Delivery) {
            return ShoppingModeType.g;
        }
        if (collectionMode instanceof CollectionMode.InStore) {
            return ShoppingModeType.i;
        }
        if (collectionMode instanceof CollectionMode.NotSet) {
            return ShoppingModeType.j;
        }
        throw new NoWhenBranchMatchedException();
    }
}
