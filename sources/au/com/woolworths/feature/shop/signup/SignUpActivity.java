package au.com.woolworths.feature.shop.signup;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import au.com.woolworths.feature.shop.signup.SignUpContract;
import au.com.woolworths.feature.shop.signup.api.SignUpConfig;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import com.google.android.gms.common.Scopes;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/signup/SignUpActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "signup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SignUpActivity extends Hilt_SignUpActivity {
    public static final /* synthetic */ int C = 0;
    public SignUpConfig w;
    public ShopAppRegionInteractor x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(SignUpViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.signup.SignUpActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.signup.SignUpActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.signup.SignUpActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new a(this, 0));
    public boolean A = true;
    public final ActivityResultLauncher B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new au.com.woolworths.feature.shop.onboarding.sdui.a(this, 2));

    public final SignUpViewModel N4() {
        return (SignUpViewModel) this.y.getD();
    }

    public final void O4(String str) {
        Boolean d;
        Activities.SignUp.Extras extras = (Activities.SignUp.Extras) this.z.getD();
        Activities.SignUp.Extras.SignUpActivityExtras signUpActivityExtras = extras instanceof Activities.SignUp.Extras.SignUpActivityExtras ? (Activities.SignUp.Extras.SignUpActivityExtras) extras : null;
        if ((signUpActivityExtras == null || (d = signUpActivityExtras.getD()) == null) ? false : d.booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("login_extras", new Activities.LogIn.Extras.LoginActivityExtras(null, str, 1));
            setResult(2, intent);
            finish();
            return;
        }
        Activities.LogIn logIn = Activities.LogIn.f4485a;
        ActivityResultLauncher activityResultLauncher = this.B;
        if (str != null) {
            Intent intentA = ActivityNavigatorKt.a(logIn, ApplicationType.e);
            intentA.putExtra("login_extras", new Activities.LogIn.Extras.LoginActivityExtras(null, str, 1));
            activityResultLauncher.a(intentA, null);
        } else {
            Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = new Activities.LogIn.Extras.ParentActivityExtras(null, 5);
            Intent intentA2 = ActivityNavigatorKt.a(logIn, ApplicationType.e);
            intentA2.putExtra("login_extras", parentActivityExtras);
            activityResultLauncher.a(intentA2, null);
        }
    }

    public final void P4() {
        Object value;
        ShopAppRegionInteractor shopAppRegionInteractor = this.x;
        if (shopAppRegionInteractor == null) {
            Intrinsics.p("shopAppRegionInteractor");
            throw null;
        }
        if (shopAppRegionInteractor.b() == Region.j) {
            Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = new Activities.LogIn.Extras.ParentActivityExtras(null, 3);
            Intent intentA = ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e);
            intentA.putExtra("login_extras", parentActivityExtras);
            this.B.a(intentA, null);
            return;
        }
        try {
            this.A = false;
            CustomTabsIntent customTabsIntentA = new CustomTabsIntent.Builder().a();
            customTabsIntentA.f208a.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + getPackageName()));
            SignUpConfig signUpConfig = this.w;
            if (signUpConfig == null) {
                Intrinsics.p("signUpConfig");
                throw null;
            }
            String strA = signUpConfig.a();
            if (strA == null) {
                strA = "";
            }
            customTabsIntentA.b(this, Uri.parse(strA));
        } catch (ActivityNotFoundException unused) {
            MutableStateFlow mutableStateFlow = N4().h;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new SignUpContract.ViewState.Failed(SignUpError.NoBrowserInstalled.f8113a)));
        }
    }

    @Override // au.com.woolworths.feature.shop.signup.Hilt_SignUpActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.signup.SignUpActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SignUpActivity signUpActivity = SignUpActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-674685237, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.signup.SignUpActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                SignUpActivity signUpActivity2 = signUpActivity;
                                boolean zI = composer2.I(signUpActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    SignUpActivity$onCreate$1$1$1$1 signUpActivity$onCreate$1$1$1$1 = new SignUpActivity$onCreate$1$1$1$1(0, signUpActivity2, SignUpActivity.class, "finish", "finish()V", 0);
                                    composer2.A(signUpActivity$onCreate$1$1$1$1);
                                    objG = signUpActivity$onCreate$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(signUpActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    SignUpActivity$onCreate$1$1$2$1 signUpActivity$onCreate$1$1$2$1 = new SignUpActivity$onCreate$1$1$2$1(1, signUpActivity2, SignUpActivity.class, "handleSignUpSuccess", "handleSignUpSuccess(Ljava/lang/String;)V", 0);
                                    composer2.A(signUpActivity$onCreate$1$1$2$1);
                                    objG2 = signUpActivity$onCreate$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(signUpActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    SignUpActivity$onCreate$1$1$3$1 signUpActivity$onCreate$1$1$3$1 = new SignUpActivity$onCreate$1$1$3$1(0, signUpActivity2, SignUpActivity.class, "handleLoginClicked", "handleLoginClicked()V", 0);
                                    composer2.A(signUpActivity$onCreate$1$1$3$1);
                                    objG3 = signUpActivity$onCreate$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                int i = SignUpActivity.C;
                                SignUpViewModel signUpViewModelN4 = signUpActivity2.N4();
                                Function0 function0 = (Function0) kFunction;
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(signUpActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new a(signUpActivity2, 1);
                                    composer2.A(objG4);
                                }
                                Function0 function02 = (Function0) objG4;
                                composer2.l();
                                Function1 function1 = (Function1) kFunction2;
                                Function0 function03 = (Function0) kFunction3;
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(signUpActivity2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    objG5 = new d(signUpActivity2, 2);
                                    composer2.A(objG5);
                                }
                                composer2.l();
                                SignUpScreenKt.b(function0, function02, function1, function03, (Function1) objG5, signUpViewModelN4, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1658190993));
        P4();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Object value;
        Object value2;
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        SignUpViewModel signUpViewModelN4 = N4();
        Uri data = intent.getData();
        MutableStateFlow mutableStateFlow = signUpViewModelN4.h;
        SharedFlowImpl sharedFlowImpl = signUpViewModelN4.f;
        if (data != null) {
            boolean zC = Intrinsics.c(data.getQueryParameter("login"), "true");
            boolean zC2 = Intrinsics.c(data.getQueryParameter("cancelled"), "true");
            String queryParameter = data.getQueryParameter(Scopes.EMAIL);
            if (zC) {
                sharedFlowImpl.f(new SignUpContract.Action.LaunchLogin());
            } else if (zC2) {
                sharedFlowImpl.f(SignUpContract.Action.CloseSignup.f8107a);
            } else if (queryParameter != null) {
                sharedFlowImpl.f(new SignUpContract.Action.LaunchLogin(queryParameter));
            } else {
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, new SignUpContract.ViewState.Failed(new SignUpError.Failed())));
            }
        } else {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new SignUpContract.ViewState.Failed(new SignUpError.Failed())));
        }
        this.A = false;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.A) {
            setResult(0);
            finish();
        }
        this.A = true;
    }
}
