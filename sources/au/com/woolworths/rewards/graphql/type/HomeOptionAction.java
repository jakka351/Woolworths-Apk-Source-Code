package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/HomeOptionAction;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeOptionAction {
    public static final Companion e;
    public static final EnumType f;
    public static final HomeOptionAction g;
    public static final /* synthetic */ HomeOptionAction[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/HomeOptionAction$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        HomeOptionAction homeOptionAction = new HomeOptionAction("WEB_LINK", 0, "WEB_LINK");
        HomeOptionAction homeOptionAction2 = new HomeOptionAction("DEEP_LINK", 1, "DEEP_LINK");
        HomeOptionAction homeOptionAction3 = new HomeOptionAction("UNKNOWN__", 2, "UNKNOWN__");
        g = homeOptionAction3;
        HomeOptionAction[] homeOptionActionArr = {homeOptionAction, homeOptionAction2, homeOptionAction3};
        h = homeOptionActionArr;
        i = EnumEntriesKt.a(homeOptionActionArr);
        e = new Companion();
        f = new EnumType("HomeOptionAction", CollectionsKt.R("WEB_LINK", "DEEP_LINK"));
    }

    public HomeOptionAction(String str, int i2, String str2) {
        this.d = str2;
    }

    public static HomeOptionAction valueOf(String str) {
        return (HomeOptionAction) Enum.valueOf(HomeOptionAction.class, str);
    }

    public static HomeOptionAction[] values() {
        return (HomeOptionAction[]) h.clone();
    }
}
