package au.com.woolworths.base.wallet.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/wallet/data/WalletHomePageAction;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_CARD", "SCAN", "HIDE", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletHomePageAction {

    @SerializedName("ADD_CARD")
    public static final WalletHomePageAction ADD_CARD;

    @SerializedName("HIDE")
    public static final WalletHomePageAction HIDE;

    @SerializedName("SCAN")
    public static final WalletHomePageAction SCAN;
    public static final /* synthetic */ WalletHomePageAction[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        WalletHomePageAction walletHomePageAction = new WalletHomePageAction("ADD_CARD", 0);
        ADD_CARD = walletHomePageAction;
        WalletHomePageAction walletHomePageAction2 = new WalletHomePageAction("SCAN", 1);
        SCAN = walletHomePageAction2;
        WalletHomePageAction walletHomePageAction3 = new WalletHomePageAction("HIDE", 2);
        HIDE = walletHomePageAction3;
        WalletHomePageAction[] walletHomePageActionArr = {walletHomePageAction, walletHomePageAction2, walletHomePageAction3, new WalletHomePageAction("UNKNOWN", 3)};
        d = walletHomePageActionArr;
        e = EnumEntriesKt.a(walletHomePageActionArr);
    }

    private WalletHomePageAction(String str, int i) {
    }

    public static WalletHomePageAction valueOf(String str) {
        return (WalletHomePageAction) Enum.valueOf(WalletHomePageAction.class, str);
    }

    public static WalletHomePageAction[] values() {
        return (WalletHomePageAction[]) d.clone();
    }
}
