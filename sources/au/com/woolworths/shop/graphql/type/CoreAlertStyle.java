package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CoreAlertStyle;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreAlertStyle {
    public static final Companion e;
    public static final EnumType f;
    public static final CoreAlertStyle g;
    public static final /* synthetic */ CoreAlertStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CoreAlertStyle$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CoreAlertStyle coreAlertStyle = new CoreAlertStyle("INFO", 0, "INFO");
        CoreAlertStyle coreAlertStyle2 = new CoreAlertStyle("WARNING", 1, "WARNING");
        CoreAlertStyle coreAlertStyle3 = new CoreAlertStyle("ERROR", 2, "ERROR");
        CoreAlertStyle coreAlertStyle4 = new CoreAlertStyle("SUCCESS", 3, "SUCCESS");
        CoreAlertStyle coreAlertStyle5 = new CoreAlertStyle("UNKNOWN__", 4, "UNKNOWN__");
        g = coreAlertStyle5;
        CoreAlertStyle[] coreAlertStyleArr = {coreAlertStyle, coreAlertStyle2, coreAlertStyle3, coreAlertStyle4, coreAlertStyle5};
        h = coreAlertStyleArr;
        i = EnumEntriesKt.a(coreAlertStyleArr);
        e = new Companion();
        f = new EnumType("CoreAlertStyle", CollectionsKt.R("INFO", "WARNING", "ERROR", "SUCCESS"));
    }

    public CoreAlertStyle(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CoreAlertStyle valueOf(String str) {
        return (CoreAlertStyle) Enum.valueOf(CoreAlertStyle.class, str);
    }

    public static CoreAlertStyle[] values() {
        return (CoreAlertStyle[]) h.clone();
    }
}
