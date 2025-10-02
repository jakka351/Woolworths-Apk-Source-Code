package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartProductQuantityAction;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartProductQuantityAction {
    public static final Companion e;
    public static final EnumType f;
    public static final CartProductQuantityAction g;
    public static final /* synthetic */ CartProductQuantityAction[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CartProductQuantityAction$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CartProductQuantityAction cartProductQuantityAction = new CartProductQuantityAction("ADD", 0, "ADD");
        CartProductQuantityAction cartProductQuantityAction2 = new CartProductQuantityAction("REMOVE", 1, "REMOVE");
        CartProductQuantityAction cartProductQuantityAction3 = new CartProductQuantityAction("UPDATE_INCREASE", 2, "UPDATE_INCREASE");
        CartProductQuantityAction cartProductQuantityAction4 = new CartProductQuantityAction("UPDATE_DECREASE", 3, "UPDATE_DECREASE");
        CartProductQuantityAction cartProductQuantityAction5 = new CartProductQuantityAction("INVALID", 4, "INVALID");
        CartProductQuantityAction cartProductQuantityAction6 = new CartProductQuantityAction("UNKNOWN__", 5, "UNKNOWN__");
        g = cartProductQuantityAction6;
        CartProductQuantityAction[] cartProductQuantityActionArr = {cartProductQuantityAction, cartProductQuantityAction2, cartProductQuantityAction3, cartProductQuantityAction4, cartProductQuantityAction5, cartProductQuantityAction6};
        h = cartProductQuantityActionArr;
        i = EnumEntriesKt.a(cartProductQuantityActionArr);
        e = new Companion();
        f = new EnumType("CartProductQuantityAction", CollectionsKt.R("ADD", "REMOVE", "UPDATE_INCREASE", "UPDATE_DECREASE", "INVALID"));
    }

    public CartProductQuantityAction(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CartProductQuantityAction valueOf(String str) {
        return (CartProductQuantityAction) Enum.valueOf(CartProductQuantityAction.class, str);
    }

    public static CartProductQuantityAction[] values() {
        return (CartProductQuantityAction[]) h.clone();
    }
}
