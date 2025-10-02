package au.com.woolworths.feature.rewards.redemptionsettings;

import android.content.DialogInterface;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsRedemptionSettingsItem e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(Object obj, RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, String str, int i) {
        this.d = i;
        this.g = obj;
        this.e = rewardsRedemptionSettingsItem;
        this.f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.d;
        String str = this.f;
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.e;
        Object obj = this.g;
        switch (i2) {
            case 0:
                int i3 = RewardsRedemptionSettingsBottomSheetActivity.B;
                ((RewardsRedemptionSettingsBottomSheetActivity) obj).O4().r6(rewardsRedemptionSettingsItem, str);
                break;
            default:
                ((RewardsRedemptionSettingsFragment) obj).I1().r6(rewardsRedemptionSettingsItem, str);
                break;
        }
    }
}
