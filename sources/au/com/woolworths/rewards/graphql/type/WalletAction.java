package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/WalletAction;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WalletAction {
    public static final Companion e;
    public static final EnumType f;
    public static final WalletAction g;
    public static final /* synthetic */ WalletAction[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/WalletAction$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        WalletAction walletAction = new WalletAction("ADD_CARD", 0, "ADD_CARD");
        WalletAction walletAction2 = new WalletAction("SCAN", 1, "SCAN");
        WalletAction walletAction3 = new WalletAction("HIDE", 2, "HIDE");
        WalletAction walletAction4 = new WalletAction("UNKNOWN__", 3, "UNKNOWN__");
        g = walletAction4;
        WalletAction[] walletActionArr = {walletAction, walletAction2, walletAction3, walletAction4};
        h = walletActionArr;
        i = EnumEntriesKt.a(walletActionArr);
        e = new Companion();
        f = new EnumType("WalletAction", CollectionsKt.R("ADD_CARD", "SCAN", "HIDE"));
    }

    public WalletAction(String str, int i2, String str2) {
        this.d = str2;
    }

    public static WalletAction valueOf(String str) {
        return (WalletAction) Enum.valueOf(WalletAction.class, str);
    }

    public static WalletAction[] values() {
        return (WalletAction[]) h.clone();
    }
}
