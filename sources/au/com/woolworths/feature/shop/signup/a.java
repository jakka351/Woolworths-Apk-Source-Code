package au.com.woolworths.feature.shop.signup;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import au.com.woolworths.analytics.supers.signup.SignupAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SignUpActivity e;

    public /* synthetic */ a(SignUpActivity signUpActivity, int i) {
        this.d = i;
        this.e = signUpActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        SignUpActivity signUpActivity = this.e;
        switch (i) {
            case 0:
                int i2 = SignUpActivity.C;
                Intent intent = signUpActivity.getIntent();
                Intrinsics.g(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        parcelable = (Parcelable) extras.getParcelable("signup_extras", Activities.SignUp.Extras.class);
                    }
                } else {
                    Bundle extras2 = intent.getExtras();
                    Parcelable parcelable = extras2 != null ? extras2.getParcelable("signup_extras") : null;
                    parcelable = (Activities.SignUp.Extras) (parcelable instanceof Activities.SignUp.Extras ? parcelable : null);
                }
                return (Activities.SignUp.Extras) parcelable;
            default:
                int i3 = SignUpActivity.C;
                SignUpViewModel signUpViewModelN4 = signUpActivity.N4();
                SignupAnalytics.SignupWebview.Action action = SignupAnalytics.SignupWebview.Action.e;
                Intrinsics.h(action, "action");
                signUpViewModelN4.e.g(action);
                signUpActivity.P4();
                return Unit.f24250a;
        }
    }
}
