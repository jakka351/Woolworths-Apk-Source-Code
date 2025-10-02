package au.com.woolworths.feature.shop.onboarding.sdui;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import au.com.woolworths.feature.shop.signup.SignUpActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComponentActivity e;

    public /* synthetic */ a(ComponentActivity componentActivity, int i) {
        this.d = i;
        this.e = componentActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        int i = this.d;
        ComponentActivity componentActivity = this.e;
        switch (i) {
            case 0:
                OnboardingSduiActivity onboardingSduiActivity = (OnboardingSduiActivity) componentActivity;
                ActivityResult result = (ActivityResult) obj;
                int i2 = OnboardingSduiActivity.B;
                Intrinsics.h(result, "result");
                if (result.d == -1) {
                    ((OnboardingSduiViewModel) onboardingSduiActivity.y.getD()).r6();
                    break;
                }
                break;
            case 1:
                OnboardingSduiActivity onboardingSduiActivity2 = (OnboardingSduiActivity) componentActivity;
                ActivityResult result2 = (ActivityResult) obj;
                int i3 = OnboardingSduiActivity.B;
                Intrinsics.h(result2, "result");
                if (result2.d == -1) {
                    ((OnboardingSduiViewModel) onboardingSduiActivity2.y.getD()).r6();
                    break;
                }
                break;
            default:
                SignUpActivity signUpActivity = (SignUpActivity) componentActivity;
                ActivityResult result3 = (ActivityResult) obj;
                int i4 = SignUpActivity.C;
                Intrinsics.h(result3, "result");
                int i5 = result3.d;
                if (i5 == -1) {
                    signUpActivity.setResult(-1);
                    signUpActivity.finish();
                    break;
                } else if (i5 == 0) {
                    signUpActivity.setResult(0);
                    signUpActivity.finish();
                    break;
                } else if (i5 == 2) {
                    signUpActivity.P4();
                    break;
                }
                break;
        }
    }
}
