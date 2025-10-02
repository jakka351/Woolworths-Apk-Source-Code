package au.com.woolworths.base.wallet.ocr;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsWalletOcrActionData implements Action {
    public static final RewardsWalletOcrActionData e;
    public static final RewardsWalletOcrActionData f;
    public static final RewardsWalletOcrActionData g;
    public static final /* synthetic */ RewardsWalletOcrActionData[] h;
    public static final /* synthetic */ EnumEntries i;
    public final RewardsWalletOcrScreens d = RewardsWalletOcrScreens.d;

    static {
        RewardsWalletOcrActionData rewardsWalletOcrActionData = new RewardsWalletOcrActionData() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActionData.ADD_MANUALLY_CLICK
            public final Category j = Category.m;
            public final String k = "Add details manually";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.j;
            }
        };
        e = rewardsWalletOcrActionData;
        RewardsWalletOcrActionData rewardsWalletOcrActionData2 = new RewardsWalletOcrActionData() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActionData.CLOSE_CLICK
            public final Category j = Category.m;
            public final String k = "close";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.j;
            }
        };
        f = rewardsWalletOcrActionData2;
        RewardsWalletOcrActionData rewardsWalletOcrActionData3 = new RewardsWalletOcrActionData() { // from class: au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActionData.SCAN_CARD_SUCCESSFUL
            public final Category j = Category.B;
            public final String k = "scan bank card success";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getI() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getH() {
                return this.j;
            }
        };
        g = rewardsWalletOcrActionData3;
        RewardsWalletOcrActionData[] rewardsWalletOcrActionDataArr = {rewardsWalletOcrActionData, rewardsWalletOcrActionData2, rewardsWalletOcrActionData3};
        h = rewardsWalletOcrActionDataArr;
        i = EnumEntriesKt.a(rewardsWalletOcrActionDataArr);
    }

    public RewardsWalletOcrActionData(String str, int i2) {
    }

    public static RewardsWalletOcrActionData valueOf(String str) {
        return (RewardsWalletOcrActionData) Enum.valueOf(RewardsWalletOcrActionData.class, str);
    }

    public static RewardsWalletOcrActionData[] values() {
        return (RewardsWalletOcrActionData[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
