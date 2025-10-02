package au.com.woolworths.feature.shop.login;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class LoginActivity$onCreate$1$1$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoginActivity loginActivity = (LoginActivity) this.receiver;
        if (loginActivity.z) {
            loginActivity.setResult(2);
            loginActivity.finish();
        } else {
            ActivityResultLauncher activityResultLauncher = loginActivity.B;
            Intent intentA = ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e);
            intentA.putExtra("signup_extras", new Activities.SignUp.Extras.SignUpActivityExtras(Boolean.TRUE));
            activityResultLauncher.a(intentA, null);
        }
        return Unit.f24250a;
    }
}
