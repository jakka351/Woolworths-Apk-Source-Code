package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CtaType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CtaType {
    public static final Companion e;
    public static final CtaType f;
    public static final /* synthetic */ CtaType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CtaType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CtaType ctaType = new CtaType("PRIMARY", 0, "PRIMARY");
        CtaType ctaType2 = new CtaType("SECONDARY", 1, "SECONDARY");
        CtaType ctaType3 = new CtaType("TERTIARY", 2, "TERTIARY");
        CtaType ctaType4 = new CtaType("UNKNOWN__", 3, "UNKNOWN__");
        f = ctaType4;
        CtaType[] ctaTypeArr = {ctaType, ctaType2, ctaType3, ctaType4};
        g = ctaTypeArr;
        h = EnumEntriesKt.a(ctaTypeArr);
        e = new Companion();
        CollectionsKt.R("PRIMARY", "SECONDARY", "TERTIARY");
    }

    public CtaType(String str, int i, String str2) {
        this.d = str2;
    }

    public static CtaType valueOf(String str) {
        return (CtaType) Enum.valueOf(CtaType.class, str);
    }

    public static CtaType[] values() {
        return (CtaType[]) g.clone();
    }
}
