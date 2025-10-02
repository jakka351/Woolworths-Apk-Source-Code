package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonStyle {
    public static final Companion e;
    public static final EnumType f;
    public static final ButtonStyle g;
    public static final /* synthetic */ ButtonStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ButtonStyle$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return ButtonStyle.f;
        }
    }

    static {
        ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0, "PRIMARY");
        ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1, "SECONDARY");
        ButtonStyle buttonStyle3 = new ButtonStyle("TERTIARY", 2, "TERTIARY");
        ButtonStyle buttonStyle4 = new ButtonStyle("DESTRUCTIVE", 3, "DESTRUCTIVE");
        ButtonStyle buttonStyle5 = new ButtonStyle("INFO", 4, "INFO");
        ButtonStyle buttonStyle6 = new ButtonStyle("INSTOCK", 5, "INSTOCK");
        ButtonStyle buttonStyle7 = new ButtonStyle("UNKNOWN__", 6, "UNKNOWN__");
        g = buttonStyle7;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4, buttonStyle5, buttonStyle6, buttonStyle7};
        h = buttonStyleArr;
        i = EnumEntriesKt.a(buttonStyleArr);
        e = new Companion();
        f = new EnumType("ButtonStyle", CollectionsKt.R("PRIMARY", "SECONDARY", "TERTIARY", "DESTRUCTIVE", "INFO", "INSTOCK"));
    }

    public ButtonStyle(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) h.clone();
    }
}
