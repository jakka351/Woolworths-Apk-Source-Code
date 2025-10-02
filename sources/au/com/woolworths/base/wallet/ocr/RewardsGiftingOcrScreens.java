package au.com.woolworths.base.wallet.ocr;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsGiftingOcrScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsGiftingOcrScreens implements Screen {
    public static final RewardsGiftingOcrScreens d;
    public static final /* synthetic */ RewardsGiftingOcrScreens[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        RewardsGiftingOcrScreens rewardsGiftingOcrScreens = new RewardsGiftingOcrScreens() { // from class: au.com.woolworths.base.wallet.ocr.RewardsGiftingOcrScreens.REWARDS_GIFTING_SCAN_CARD
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Everyday Gifting";
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
        d = rewardsGiftingOcrScreens;
        RewardsGiftingOcrScreens[] rewardsGiftingOcrScreensArr = {rewardsGiftingOcrScreens};
        e = rewardsGiftingOcrScreensArr;
        f = EnumEntriesKt.a(rewardsGiftingOcrScreensArr);
    }

    public static RewardsGiftingOcrScreens valueOf(String str) {
        return (RewardsGiftingOcrScreens) Enum.valueOf(RewardsGiftingOcrScreens.class, str);
    }

    public static RewardsGiftingOcrScreens[] values() {
        return (RewardsGiftingOcrScreens[]) e.clone();
    }
}
