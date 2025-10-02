package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/InsetBannerDisplayType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetBannerDisplayType {
    public static final Companion e;
    public static final EnumType f;
    public static final InsetBannerDisplayType g;
    public static final /* synthetic */ InsetBannerDisplayType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/InsetBannerDisplayType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        InsetBannerDisplayType insetBannerDisplayType = new InsetBannerDisplayType("INFO", 0, "INFO");
        InsetBannerDisplayType insetBannerDisplayType2 = new InsetBannerDisplayType("WARNING", 1, "WARNING");
        InsetBannerDisplayType insetBannerDisplayType3 = new InsetBannerDisplayType("ERROR", 2, "ERROR");
        InsetBannerDisplayType insetBannerDisplayType4 = new InsetBannerDisplayType("REWARDS", 3, "REWARDS");
        InsetBannerDisplayType insetBannerDisplayType5 = new InsetBannerDisplayType("GREEN", 4, "GREEN");
        InsetBannerDisplayType insetBannerDisplayType6 = new InsetBannerDisplayType("UNKNOWN__", 5, "UNKNOWN__");
        g = insetBannerDisplayType6;
        InsetBannerDisplayType[] insetBannerDisplayTypeArr = {insetBannerDisplayType, insetBannerDisplayType2, insetBannerDisplayType3, insetBannerDisplayType4, insetBannerDisplayType5, insetBannerDisplayType6};
        h = insetBannerDisplayTypeArr;
        i = EnumEntriesKt.a(insetBannerDisplayTypeArr);
        e = new Companion();
        f = new EnumType("InsetBannerDisplayType", CollectionsKt.R("INFO", "WARNING", "ERROR", "REWARDS", "GREEN"));
    }

    public InsetBannerDisplayType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static InsetBannerDisplayType valueOf(String str) {
        return (InsetBannerDisplayType) Enum.valueOf(InsetBannerDisplayType.class, str);
    }

    public static InsetBannerDisplayType[] values() {
        return (InsetBannerDisplayType[]) h.clone();
    }
}
