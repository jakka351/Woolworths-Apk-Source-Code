package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeSelectorOptionState;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeSelectorOptionState {
    public static final Companion e;
    public static final EnumType f;
    public static final ShoppingModeSelectorOptionState g;
    public static final /* synthetic */ ShoppingModeSelectorOptionState[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ShoppingModeSelectorOptionState$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ShoppingModeSelectorOptionState shoppingModeSelectorOptionState = new ShoppingModeSelectorOptionState("AVAILABLE", 0, "AVAILABLE");
        ShoppingModeSelectorOptionState shoppingModeSelectorOptionState2 = new ShoppingModeSelectorOptionState("DISABLED", 1, "DISABLED");
        ShoppingModeSelectorOptionState shoppingModeSelectorOptionState3 = new ShoppingModeSelectorOptionState("SELECTED", 2, "SELECTED");
        ShoppingModeSelectorOptionState shoppingModeSelectorOptionState4 = new ShoppingModeSelectorOptionState("UNKNOWN__", 3, "UNKNOWN__");
        g = shoppingModeSelectorOptionState4;
        ShoppingModeSelectorOptionState[] shoppingModeSelectorOptionStateArr = {shoppingModeSelectorOptionState, shoppingModeSelectorOptionState2, shoppingModeSelectorOptionState3, shoppingModeSelectorOptionState4};
        h = shoppingModeSelectorOptionStateArr;
        i = EnumEntriesKt.a(shoppingModeSelectorOptionStateArr);
        e = new Companion();
        f = new EnumType("ShoppingModeSelectorOptionState", CollectionsKt.R("AVAILABLE", "DISABLED", "SELECTED"));
    }

    public ShoppingModeSelectorOptionState(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ShoppingModeSelectorOptionState valueOf(String str) {
        return (ShoppingModeSelectorOptionState) Enum.valueOf(ShoppingModeSelectorOptionState.class, str);
    }

    public static ShoppingModeSelectorOptionState[] values() {
        return (ShoppingModeSelectorOptionState[]) h.clone();
    }
}
