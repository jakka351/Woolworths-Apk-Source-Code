package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeVariantState;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeVariantState {
    public static final Companion e;
    public static final EnumType f;
    public static final ShoppingModeVariantState g;
    public static final /* synthetic */ ShoppingModeVariantState[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeVariantState$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ShoppingModeVariantState shoppingModeVariantState = new ShoppingModeVariantState("AVAILABLE", 0, "AVAILABLE");
        ShoppingModeVariantState shoppingModeVariantState2 = new ShoppingModeVariantState("DISABLED", 1, "DISABLED");
        ShoppingModeVariantState shoppingModeVariantState3 = new ShoppingModeVariantState("SELECTED", 2, "SELECTED");
        ShoppingModeVariantState shoppingModeVariantState4 = new ShoppingModeVariantState("UNKNOWN__", 3, "UNKNOWN__");
        g = shoppingModeVariantState4;
        ShoppingModeVariantState[] shoppingModeVariantStateArr = {shoppingModeVariantState, shoppingModeVariantState2, shoppingModeVariantState3, shoppingModeVariantState4};
        h = shoppingModeVariantStateArr;
        i = EnumEntriesKt.a(shoppingModeVariantStateArr);
        e = new Companion();
        f = new EnumType("ShoppingModeVariantState", CollectionsKt.R("AVAILABLE", "DISABLED", "SELECTED"));
    }

    public ShoppingModeVariantState(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ShoppingModeVariantState valueOf(String str) {
        return (ShoppingModeVariantState) Enum.valueOf(ShoppingModeVariantState.class, str);
    }

    public static ShoppingModeVariantState[] values() {
        return (ShoppingModeVariantState[]) h.clone();
    }
}
