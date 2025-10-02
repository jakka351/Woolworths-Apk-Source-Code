package au.com.woolworths.feature.shop.login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LoginActivity e;

    public /* synthetic */ a(LoginActivity loginActivity, int i) {
        this.d = i;
        this.e = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        LoginActivity loginActivity = this.e;
        switch (i) {
            case 0:
                int i2 = LoginActivity.C;
                Intent intent = loginActivity.getIntent();
                Intrinsics.g(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        parcelable = (Parcelable) extras.getParcelable("login_extras", Activities.LogIn.Extras.class);
                    }
                } else {
                    Bundle extras2 = intent.getExtras();
                    Parcelable parcelable = extras2 != null ? extras2.getParcelable("login_extras") : null;
                    parcelable = (Activities.LogIn.Extras) (parcelable instanceof Activities.LogIn.Extras ? parcelable : null);
                }
                return (Activities.LogIn.Extras) parcelable;
            default:
                int i3 = LoginActivity.C;
                loginActivity.O4();
                loginActivity.finish();
                return Unit.f24250a;
        }
    }
}
