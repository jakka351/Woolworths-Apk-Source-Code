package au.com.woolworths.feature.rewards.account.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/HomeOptionAction;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeOptionAction {
    public static final HomeOptionAction d;
    public static final HomeOptionAction e;
    public static final HomeOptionAction f;
    public static final /* synthetic */ HomeOptionAction[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        HomeOptionAction homeOptionAction = new HomeOptionAction("WEB_LINK", 0);
        d = homeOptionAction;
        HomeOptionAction homeOptionAction2 = new HomeOptionAction("DEEP_LINK", 1);
        e = homeOptionAction2;
        HomeOptionAction homeOptionAction3 = new HomeOptionAction("UNKNOWN", 2);
        f = homeOptionAction3;
        HomeOptionAction[] homeOptionActionArr = {homeOptionAction, homeOptionAction2, homeOptionAction3};
        g = homeOptionActionArr;
        h = EnumEntriesKt.a(homeOptionActionArr);
    }

    public static HomeOptionAction valueOf(String str) {
        return (HomeOptionAction) Enum.valueOf(HomeOptionAction.class, str);
    }

    public static HomeOptionAction[] values() {
        return (HomeOptionAction[]) g.clone();
    }
}
