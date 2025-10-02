package au.com.woolworths.feature.rewards.account.authentication;

import android.content.Intent;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, int i) {
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
                ((RewardsAuthenticationViewModel) obj2).m.m(new RewardsAuthenticationContract.ViewState(true, null));
                break;
            case 1:
                ((RewardsAuthenticationViewModel) obj2).m.m(new RewardsAuthenticationContract.ViewState(true, null));
                break;
            default:
                Intent it = (Intent) obj;
                int i2 = RewardsAuthenticationActivity.J;
                Intrinsics.h(it, "it");
                ((RewardsAuthenticationActivity) obj2).I.a(it, null);
                break;
        }
        return unit;
    }
}
