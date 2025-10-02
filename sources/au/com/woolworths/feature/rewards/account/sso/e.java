package au.com.woolworths.feature.rewards.account.sso;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                RewardsMagicLinkActivity rewardsMagicLinkActivity = (RewardsMagicLinkActivity) obj2;
                Intent intent = (Intent) obj;
                int i2 = RewardsMagicLinkActivity$initWebView$1$2.b;
                if (intent == null) {
                    rewardsMagicLinkActivity.O4().d();
                    break;
                } else {
                    rewardsMagicLinkActivity.startActivityForResult(intent, 1011);
                    break;
                }
            case 1:
                RewardsMagicLinkActivity rewardsMagicLinkActivity2 = (RewardsMagicLinkActivity) obj2;
                Intent intent2 = (Intent) obj;
                int i3 = RewardsMagicLinkActivity$initWebView$1$2.b;
                rewardsMagicLinkActivity2.B = intent2;
                if (intent2 != null) {
                    if (rewardsMagicLinkActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
                        ActivityResultLauncher activityResultLauncher = rewardsMagicLinkActivity2.C;
                        Intrinsics.h(activityResultLauncher, "<this>");
                        activityResultLauncher.a(unit, null);
                        break;
                    } else {
                        rewardsMagicLinkActivity2.startActivityForResult(intent2, 1010);
                        break;
                    }
                }
                break;
            default:
                ((RewardsMagicLinkViewModel) obj2).o = null;
                break;
        }
        return unit;
    }
}
