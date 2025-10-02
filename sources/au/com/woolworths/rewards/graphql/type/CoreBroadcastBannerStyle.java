package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CoreBroadcastBannerStyle;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreBroadcastBannerStyle {
    public static final Companion e;
    public static final EnumType f;
    public static final CoreBroadcastBannerStyle g;
    public static final /* synthetic */ CoreBroadcastBannerStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CoreBroadcastBannerStyle$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CoreBroadcastBannerStyle coreBroadcastBannerStyle = new CoreBroadcastBannerStyle("STANDARD", 0, "STANDARD");
        CoreBroadcastBannerStyle coreBroadcastBannerStyle2 = new CoreBroadcastBannerStyle("ON_CONTRAST", 1, "ON_CONTRAST");
        CoreBroadcastBannerStyle coreBroadcastBannerStyle3 = new CoreBroadcastBannerStyle("WOOLWORTHS", 2, "WOOLWORTHS");
        CoreBroadcastBannerStyle coreBroadcastBannerStyle4 = new CoreBroadcastBannerStyle("EVERYDAY", 3, "EVERYDAY");
        CoreBroadcastBannerStyle coreBroadcastBannerStyle5 = new CoreBroadcastBannerStyle("BIG_W", 4, "BIG_W");
        CoreBroadcastBannerStyle coreBroadcastBannerStyle6 = new CoreBroadcastBannerStyle("UNKNOWN__", 5, "UNKNOWN__");
        g = coreBroadcastBannerStyle6;
        CoreBroadcastBannerStyle[] coreBroadcastBannerStyleArr = {coreBroadcastBannerStyle, coreBroadcastBannerStyle2, coreBroadcastBannerStyle3, coreBroadcastBannerStyle4, coreBroadcastBannerStyle5, coreBroadcastBannerStyle6};
        h = coreBroadcastBannerStyleArr;
        i = EnumEntriesKt.a(coreBroadcastBannerStyleArr);
        e = new Companion();
        f = new EnumType("CoreBroadcastBannerStyle", CollectionsKt.R("STANDARD", "ON_CONTRAST", "WOOLWORTHS", "EVERYDAY", "BIG_W"));
    }

    public CoreBroadcastBannerStyle(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CoreBroadcastBannerStyle valueOf(String str) {
        return (CoreBroadcastBannerStyle) Enum.valueOf(CoreBroadcastBannerStyle.class, str);
    }

    public static CoreBroadcastBannerStyle[] values() {
        return (CoreBroadcastBannerStyle[]) h.clone();
    }
}
