package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/FulfilmentWindowsFooterIcon;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FulfilmentWindowsFooterIcon {
    public static final Companion e;
    public static final EnumType f;
    public static final FulfilmentWindowsFooterIcon g;
    public static final /* synthetic */ FulfilmentWindowsFooterIcon[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/FulfilmentWindowsFooterIcon$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIcon = new FulfilmentWindowsFooterIcon("GREEN_DELIVERY", 0, "GREEN_DELIVERY");
        FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIcon2 = new FulfilmentWindowsFooterIcon("PARTNER_DELIVERY", 1, "PARTNER_DELIVERY");
        FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIcon3 = new FulfilmentWindowsFooterIcon("NONE", 2, "NONE");
        FulfilmentWindowsFooterIcon fulfilmentWindowsFooterIcon4 = new FulfilmentWindowsFooterIcon("UNKNOWN__", 3, "UNKNOWN__");
        g = fulfilmentWindowsFooterIcon4;
        FulfilmentWindowsFooterIcon[] fulfilmentWindowsFooterIconArr = {fulfilmentWindowsFooterIcon, fulfilmentWindowsFooterIcon2, fulfilmentWindowsFooterIcon3, fulfilmentWindowsFooterIcon4};
        h = fulfilmentWindowsFooterIconArr;
        i = EnumEntriesKt.a(fulfilmentWindowsFooterIconArr);
        e = new Companion();
        f = new EnumType("FulfilmentWindowsFooterIcon", CollectionsKt.R("GREEN_DELIVERY", "PARTNER_DELIVERY", "NONE"));
    }

    public FulfilmentWindowsFooterIcon(String str, int i2, String str2) {
        this.d = str2;
    }

    public static FulfilmentWindowsFooterIcon valueOf(String str) {
        return (FulfilmentWindowsFooterIcon) Enum.valueOf(FulfilmentWindowsFooterIcon.class, str);
    }

    public static FulfilmentWindowsFooterIcon[] values() {
        return (FulfilmentWindowsFooterIcon[]) h.clone();
    }
}
