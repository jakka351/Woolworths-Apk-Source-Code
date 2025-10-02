package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/NavigationType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationType {
    public static final Companion e;
    public static final NavigationType f;
    public static final /* synthetic */ NavigationType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/NavigationType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        NavigationType navigationType = new NavigationType("EXTERNAL_WEB_LINK", 0, "EXTERNAL_WEB_LINK");
        NavigationType navigationType2 = new NavigationType("INTERNAL_WEB_LINK", 1, "INTERNAL_WEB_LINK");
        NavigationType navigationType3 = new NavigationType("DEEP_LINK", 2, "DEEP_LINK");
        NavigationType navigationType4 = new NavigationType("UNKNOWN__", 3, "UNKNOWN__");
        f = navigationType4;
        NavigationType[] navigationTypeArr = {navigationType, navigationType2, navigationType3, navigationType4};
        g = navigationTypeArr;
        h = EnumEntriesKt.a(navigationTypeArr);
        e = new Companion();
        CollectionsKt.R("EXTERNAL_WEB_LINK", "INTERNAL_WEB_LINK", "DEEP_LINK");
    }

    public NavigationType(String str, int i, String str2) {
        this.d = str2;
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) g.clone();
    }
}
