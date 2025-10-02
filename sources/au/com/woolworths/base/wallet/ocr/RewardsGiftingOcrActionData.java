package au.com.woolworths.base.wallet.ocr;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsGiftingOcrActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RewardsGiftingOcrActionData implements Action {
    public static final RewardsGiftingOcrActionData e;
    public static final RewardsGiftingOcrActionData f;
    public static final RewardsGiftingOcrActionData g;
    public static final /* synthetic */ RewardsGiftingOcrActionData[] h;
    public static final /* synthetic */ EnumEntries i;
    public final RewardsGiftingOcrScreens d = RewardsGiftingOcrScreens.d;

    static {
        RewardsGiftingOcrActionData rewardsGiftingOcrActionData = new RewardsGiftingOcrActionData() { // from class: au.com.woolworths.base.wallet.ocr.RewardsGiftingOcrActionData.ADD_MANUALLY_CLICK
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
        e = rewardsGiftingOcrActionData;
        RewardsGiftingOcrActionData rewardsGiftingOcrActionData2 = new RewardsGiftingOcrActionData() { // from class: au.com.woolworths.base.wallet.ocr.RewardsGiftingOcrActionData.CLOSE_CLICK
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
        f = rewardsGiftingOcrActionData2;
        RewardsGiftingOcrActionData rewardsGiftingOcrActionData3 = new RewardsGiftingOcrActionData() { // from class: au.com.woolworths.base.wallet.ocr.RewardsGiftingOcrActionData.SCAN_CARD_SUCCESSFUL
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
        g = rewardsGiftingOcrActionData3;
        RewardsGiftingOcrActionData[] rewardsGiftingOcrActionDataArr = {rewardsGiftingOcrActionData, rewardsGiftingOcrActionData2, rewardsGiftingOcrActionData3};
        h = rewardsGiftingOcrActionDataArr;
        i = EnumEntriesKt.a(rewardsGiftingOcrActionDataArr);
    }

    public RewardsGiftingOcrActionData(String str, int i2) {
    }

    public static RewardsGiftingOcrActionData valueOf(String str) {
        return (RewardsGiftingOcrActionData) Enum.valueOf(RewardsGiftingOcrActionData.class, str);
    }

    public static RewardsGiftingOcrActionData[] values() {
        return (RewardsGiftingOcrActionData[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
