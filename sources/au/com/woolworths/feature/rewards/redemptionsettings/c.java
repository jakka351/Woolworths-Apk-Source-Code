package au.com.woolworths.feature.rewards.redemptionsettings;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ c(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.d;
        Function0 function0 = this.e;
        switch (i2) {
            case 0:
                int i3 = RewardsRedemptionSettingsBottomSheetActivity.B;
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
