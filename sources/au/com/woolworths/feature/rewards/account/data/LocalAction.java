package au.com.woolworths.feature.rewards.account.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/LocalAction;", "", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalAction {
    public static final Companion e;
    public static final /* synthetic */ LocalAction[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/LocalAction$Companion;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        LocalAction[] localActionArr = {new LocalAction("OPEN_APP_UPDATE", 0, "openAppUpdate"), new LocalAction("OPEN_OS_UPDATE", 1, "openOsUpdate")};
        f = localActionArr;
        g = EnumEntriesKt.a(localActionArr);
        e = new Companion();
    }

    public LocalAction(String str, int i, String str2) {
        this.d = str2;
    }

    public static LocalAction valueOf(String str) {
        return (LocalAction) Enum.valueOf(LocalAction.class, str);
    }

    public static LocalAction[] values() {
        return (LocalAction[]) f.clone();
    }
}
