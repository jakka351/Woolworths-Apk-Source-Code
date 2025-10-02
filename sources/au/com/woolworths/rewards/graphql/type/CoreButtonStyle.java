package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CoreButtonStyle;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreButtonStyle {
    public static final Companion e;
    public static final CoreButtonStyle f;
    public static final /* synthetic */ CoreButtonStyle[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CoreButtonStyle$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CoreButtonStyle coreButtonStyle = new CoreButtonStyle("PRIMARY", 0, "PRIMARY");
        CoreButtonStyle coreButtonStyle2 = new CoreButtonStyle("SECONDARY", 1, "SECONDARY");
        CoreButtonStyle coreButtonStyle3 = new CoreButtonStyle("TERTIARY", 2, "TERTIARY");
        CoreButtonStyle coreButtonStyle4 = new CoreButtonStyle("DESTRUCTIVE", 3, "DESTRUCTIVE");
        CoreButtonStyle coreButtonStyle5 = new CoreButtonStyle("UNKNOWN__", 4, "UNKNOWN__");
        f = coreButtonStyle5;
        CoreButtonStyle[] coreButtonStyleArr = {coreButtonStyle, coreButtonStyle2, coreButtonStyle3, coreButtonStyle4, coreButtonStyle5};
        g = coreButtonStyleArr;
        h = EnumEntriesKt.a(coreButtonStyleArr);
        e = new Companion();
        CollectionsKt.R("PRIMARY", "SECONDARY", "TERTIARY", "DESTRUCTIVE");
    }

    public CoreButtonStyle(String str, int i, String str2) {
        this.d = str2;
    }

    public static CoreButtonStyle valueOf(String str) {
        return (CoreButtonStyle) Enum.valueOf(CoreButtonStyle.class, str);
    }

    public static CoreButtonStyle[] values() {
        return (CoreButtonStyle[]) g.clone();
    }
}
