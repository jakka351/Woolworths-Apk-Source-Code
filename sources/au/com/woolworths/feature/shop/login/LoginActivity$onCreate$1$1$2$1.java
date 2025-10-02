package au.com.woolworths.feature.shop.login;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LoginActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoginActivity loginActivity = (LoginActivity) this.receiver;
        int i = LoginActivity.C;
        loginActivity.N4().q6(false, null);
        BuildersKt.c(LifecycleOwnerKt.a(loginActivity), null, null, new LoginActivity$launchLoginForm$1(loginActivity, Boolean.TRUE, null), 3);
        return Unit.f24250a;
    }
}
