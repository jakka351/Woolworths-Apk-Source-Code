package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ButtonState;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonState {
    public static final Companion e;
    public static final ButtonState f;
    public static final /* synthetic */ ButtonState[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ButtonState$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ButtonState buttonState = new ButtonState("ENABLED", 0, "ENABLED");
        ButtonState buttonState2 = new ButtonState("DISABLED", 1, "DISABLED");
        ButtonState buttonState3 = new ButtonState("UNKNOWN__", 2, "UNKNOWN__");
        f = buttonState3;
        ButtonState[] buttonStateArr = {buttonState, buttonState2, buttonState3};
        g = buttonStateArr;
        h = EnumEntriesKt.a(buttonStateArr);
        e = new Companion();
        CollectionsKt.R("ENABLED", "DISABLED");
    }

    public ButtonState(String str, int i, String str2) {
        this.d = str2;
    }

    public static ButtonState valueOf(String str) {
        return (ButtonState) Enum.valueOf(ButtonState.class, str);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) g.clone();
    }
}
