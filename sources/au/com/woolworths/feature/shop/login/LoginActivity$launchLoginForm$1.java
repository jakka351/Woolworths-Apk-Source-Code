package au.com.woolworths.feature.shop.login;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.auth.api.AuthException;
import au.com.woolworths.auth.api.Identity;
import au.com.woolworths.shop.auth.ShopAuthManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.LoginActivity$launchLoginForm$1", f = "LoginActivity.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LoginActivity$launchLoginForm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LoginActivity q;
    public final /* synthetic */ Boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$launchLoginForm$1(LoginActivity loginActivity, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.q = loginActivity;
        this.r = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginActivity$launchLoginForm$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginActivity$launchLoginForm$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        LoginActivity loginActivity = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = LoginActivity.C;
                Activities.LogIn.Extras extras = (Activities.LogIn.Extras) loginActivity.y.getD();
                Boolean bool = this.r;
                this.p = 1;
                Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = extras instanceof Activities.LogIn.Extras.ParentActivityExtras ? (Activities.LogIn.Extras.ParentActivityExtras) extras : null;
                if (parentActivityExtras != null ? parentActivityExtras.f : false) {
                    ShopAuthManager shopAuthManager = loginActivity.w;
                    if (shopAuthManager == null) {
                        Intrinsics.p("authManager");
                        throw null;
                    }
                    obj = shopAuthManager.f(loginActivity, null, this);
                } else {
                    ShopAuthManager shopAuthManager2 = loginActivity.w;
                    if (shopAuthManager2 == null) {
                        Intrinsics.p("authManager");
                        throw null;
                    }
                    Activities.LogIn.Extras.LoginActivityExtras loginActivityExtras = extras instanceof Activities.LogIn.Extras.LoginActivityExtras ? (Activities.LogIn.Extras.LoginActivityExtras) extras : null;
                    obj = shopAuthManager2.d(loginActivity, loginActivityExtras != null ? loginActivityExtras.e : null, bool, null, this);
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            int i3 = LoginActivity.C;
            LoginViewModel loginViewModelN4 = loginActivity.N4();
            String accessToken = ((Identity) obj).a();
            Intrinsics.h(accessToken, "accessToken");
            loginViewModelN4.q6(true, null);
            BuildersKt.c(ViewModelKt.a(loginViewModelN4), null, null, new LoginViewModel$finalizeLogin$1(loginViewModelN4, accessToken, null), 3);
        } catch (AuthException e) {
            if (e.c()) {
                loginActivity.setResult(0);
                loginActivity.finish();
            } else {
                int i4 = LoginActivity.C;
                loginActivity.N4().q6(false, new LoginErrorState(e.b() ? new ResText(com.woolworths.R.string.no_browser_installed_message) : e.a() ? new ResText(com.woolworths.R.string.login_access_denied_error_message) : new ResText(com.woolworths.R.string.login_generic_error_message)));
            }
        }
        return Unit.f24250a;
    }
}
