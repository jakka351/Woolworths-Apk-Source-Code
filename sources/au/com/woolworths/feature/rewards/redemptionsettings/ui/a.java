package au.com.woolworths.feature.rewards.redemptionsettings.ui;

import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RedemptionItemClickListener e;
    public final /* synthetic */ RewardsRedemptionSettingsItem f;

    public /* synthetic */ a(RedemptionItemClickListener redemptionItemClickListener, RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, int i) {
        this.d = i;
        this.e = redemptionItemClickListener;
        this.f = rewardsRedemptionSettingsItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.e5(this.f);
                break;
            default:
                this.e.e5(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
