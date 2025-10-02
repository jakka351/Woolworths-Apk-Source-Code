package au.com.woolworths.feature.shop.login;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LoginActivity$onCreate$1$1$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoginActivity loginActivity = (LoginActivity) this.receiver;
        int i = LoginActivity.C;
        loginActivity.getClass();
        loginActivity.startActivity(Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(false, true, false, true)));
        loginActivity.O4();
        loginActivity.finish();
        return Unit.f24250a;
    }
}
