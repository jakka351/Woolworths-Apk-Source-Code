package au.com.woolworths.foundation.shop.cart.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantityAction;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductQuantityAction {
    public static final CartProductQuantityAction d;
    public static final CartProductQuantityAction e;
    public static final CartProductQuantityAction f;
    public static final CartProductQuantityAction g;
    public static final CartProductQuantityAction h;
    public static final /* synthetic */ CartProductQuantityAction[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        CartProductQuantityAction cartProductQuantityAction = new CartProductQuantityAction("ADD", 0);
        d = cartProductQuantityAction;
        CartProductQuantityAction cartProductQuantityAction2 = new CartProductQuantityAction("REMOVE", 1);
        e = cartProductQuantityAction2;
        CartProductQuantityAction cartProductQuantityAction3 = new CartProductQuantityAction("UPDATE_INCREASE", 2);
        f = cartProductQuantityAction3;
        CartProductQuantityAction cartProductQuantityAction4 = new CartProductQuantityAction("UPDATE_DECREASE", 3);
        g = cartProductQuantityAction4;
        CartProductQuantityAction cartProductQuantityAction5 = new CartProductQuantityAction("INVALID", 4);
        h = cartProductQuantityAction5;
        CartProductQuantityAction[] cartProductQuantityActionArr = {cartProductQuantityAction, cartProductQuantityAction2, cartProductQuantityAction3, cartProductQuantityAction4, cartProductQuantityAction5};
        i = cartProductQuantityActionArr;
        j = EnumEntriesKt.a(cartProductQuantityActionArr);
    }

    public static CartProductQuantityAction valueOf(String str) {
        return (CartProductQuantityAction) Enum.valueOf(CartProductQuantityAction.class, str);
    }

    public static CartProductQuantityAction[] values() {
        return (CartProductQuantityAction[]) i.clone();
    }
}
