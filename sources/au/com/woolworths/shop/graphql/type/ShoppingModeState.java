package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeState;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeState {
    public static final Companion e;
    public static final ShoppingModeState f;
    public static final /* synthetic */ ShoppingModeState[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeState$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ShoppingModeState shoppingModeState = new ShoppingModeState("AVAILABLE", 0, "AVAILABLE");
        ShoppingModeState shoppingModeState2 = new ShoppingModeState("SELECTED", 1, "SELECTED");
        ShoppingModeState shoppingModeState3 = new ShoppingModeState("UNKNOWN__", 2, "UNKNOWN__");
        f = shoppingModeState3;
        ShoppingModeState[] shoppingModeStateArr = {shoppingModeState, shoppingModeState2, shoppingModeState3};
        g = shoppingModeStateArr;
        h = EnumEntriesKt.a(shoppingModeStateArr);
        e = new Companion();
        CollectionsKt.R("AVAILABLE", "SELECTED");
    }

    public ShoppingModeState(String str, int i, String str2) {
        this.d = str2;
    }

    public static ShoppingModeState valueOf(String str) {
        return (ShoppingModeState) Enum.valueOf(ShoppingModeState.class, str);
    }

    public static ShoppingModeState[] values() {
        return (ShoppingModeState[]) g.clone();
    }
}
