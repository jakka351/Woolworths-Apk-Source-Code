package au.com.woolworths.base.wallet.ocr;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsWalletOcrScreens implements Screen {
    public static final RewardsWalletOcrScreens d;
    public static final /* synthetic */ RewardsWalletOcrScreens[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        RewardsWalletOcrScreens rewardsWalletOcrScreens = new RewardsWalletOcrScreens() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrScreens.REWARDS_WALLET_SCAN_CARD
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Pay";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "scanbankcard_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Scan bank card";
            }
        };
        d = rewardsWalletOcrScreens;
        RewardsWalletOcrScreens[] rewardsWalletOcrScreensArr = {rewardsWalletOcrScreens};
        e = rewardsWalletOcrScreensArr;
        f = EnumEntriesKt.a(rewardsWalletOcrScreensArr);
    }

    public static RewardsWalletOcrScreens valueOf(String str) {
        return (RewardsWalletOcrScreens) Enum.valueOf(RewardsWalletOcrScreens.class, str);
    }

    public static RewardsWalletOcrScreens[] values() {
        return (RewardsWalletOcrScreens[]) e.clone();
    }
}
