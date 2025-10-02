package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ActivityBreakdownStyle;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityBreakdownStyle {
    public static final Companion e;
    public static final ActivityBreakdownStyle f;
    public static final /* synthetic */ ActivityBreakdownStyle[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/ActivityBreakdownStyle$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        ActivityBreakdownStyle activityBreakdownStyle = new ActivityBreakdownStyle("HIGHLIGHT", 0, "HIGHLIGHT");
        ActivityBreakdownStyle activityBreakdownStyle2 = new ActivityBreakdownStyle("STANDARD", 1, "STANDARD");
        ActivityBreakdownStyle activityBreakdownStyle3 = new ActivityBreakdownStyle("UNKNOWN__", 2, "UNKNOWN__");
        f = activityBreakdownStyle3;
        ActivityBreakdownStyle[] activityBreakdownStyleArr = {activityBreakdownStyle, activityBreakdownStyle2, activityBreakdownStyle3};
        g = activityBreakdownStyleArr;
        h = EnumEntriesKt.a(activityBreakdownStyleArr);
        e = new Companion();
        CollectionsKt.R("HIGHLIGHT", "STANDARD");
    }

    public ActivityBreakdownStyle(String str, int i, String str2) {
        this.d = str2;
    }

    public static ActivityBreakdownStyle valueOf(String str) {
        return (ActivityBreakdownStyle) Enum.valueOf(ActivityBreakdownStyle.class, str);
    }

    public static ActivityBreakdownStyle[] values() {
        return (ActivityBreakdownStyle[]) g.clone();
    }
}
