package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Consumer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ c(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i = this.d;
        Function1 function1 = this.e;
        switch (i) {
            case 0:
                int i2 = RewardsAuthenticationActivity.J;
                ((RewardsAuthenticationActivity.AnonymousClass2) function1).invoke(obj);
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                function1.invoke(obj);
                break;
            case 3:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }
}
