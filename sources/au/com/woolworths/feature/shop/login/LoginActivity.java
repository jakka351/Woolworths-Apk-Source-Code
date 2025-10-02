package au.com.woolworths.feature.shop.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.login.LoginAnalytics;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.login.LoginContract;
import au.com.woolworths.feature.shop.login.ui.LoginScreenKt;
import au.com.woolworths.shop.auth.ShopAuthManager;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LoginActivity extends Hilt_LoginActivity {
    public static final /* synthetic */ int C = 0;
    public final ActivityResultLauncher A;
    public final ActivityResultLauncher B;
    public ShopAuthManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(LoginViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.login.LoginActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.login.LoginActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.login.LoginActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy y = LazyKt.b(new a(this, 0));
    public boolean z;

    public LoginActivity() {
        final int i = 1;
        this.A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.login.b
            public final /* synthetic */ LoginActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i2 = i;
                LoginActivity loginActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        int i3 = LoginActivity.C;
                        Intrinsics.h(result, "result");
                        int i4 = result.d;
                        if (i4 == -1) {
                            loginActivity.setResult(-1);
                            loginActivity.finish();
                            break;
                        } else if (i4 == 0) {
                            loginActivity.setResult(0);
                            loginActivity.finish();
                            break;
                        } else if (i4 == 2) {
                            loginActivity.setIntent(result.e);
                            BuildersKt.c(LifecycleOwnerKt.a(loginActivity), null, null, new LoginActivity$launchLoginForm$1(loginActivity, Boolean.FALSE, null), 3);
                            break;
                        }
                        break;
                    default:
                        int i5 = LoginActivity.C;
                        Intrinsics.h(result, "result");
                        loginActivity.setResult(result.d);
                        loginActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 0;
        this.B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.login.b
            public final /* synthetic */ LoginActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i22 = i2;
                LoginActivity loginActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        int i3 = LoginActivity.C;
                        Intrinsics.h(result, "result");
                        int i4 = result.d;
                        if (i4 == -1) {
                            loginActivity.setResult(-1);
                            loginActivity.finish();
                            break;
                        } else if (i4 == 0) {
                            loginActivity.setResult(0);
                            loginActivity.finish();
                            break;
                        } else if (i4 == 2) {
                            loginActivity.setIntent(result.e);
                            BuildersKt.c(LifecycleOwnerKt.a(loginActivity), null, null, new LoginActivity$launchLoginForm$1(loginActivity, Boolean.FALSE, null), 3);
                            break;
                        }
                        break;
                    default:
                        int i5 = LoginActivity.C;
                        Intrinsics.h(result, "result");
                        loginActivity.setResult(result.d);
                        loginActivity.finish();
                        break;
                }
            }
        });
    }

    public final LoginViewModel N4() {
        return (LoginViewModel) this.x.getD();
    }

    public final void O4() {
        Activities.LogIn.Extras extras = (Activities.LogIn.Extras) this.y.getD();
        if (extras instanceof Activities.LogIn.Extras.LoginActivityExtras) {
            String str = ((Activities.LogIn.Extras.LoginActivityExtras) extras).d;
            if (str != null) {
                startActivity(ShopAppDeepLink.b(str, LoginAnalytics.LoginWebview.d));
            }
            setResult(-1);
            return;
        }
        if (!(extras instanceof Activities.LogIn.Extras.ParentActivityExtras)) {
            setResult(-1);
            return;
        }
        Intent intent = new Intent();
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            intent.putExtras(extras2);
        }
        setResult(-1, intent);
    }

    @Override // au.com.woolworths.feature.shop.login.Hilt_LoginActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.LogIn.Extras extras = (Activities.LogIn.Extras) this.y.getD();
        Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = extras instanceof Activities.LogIn.Extras.ParentActivityExtras ? (Activities.LogIn.Extras.ParentActivityExtras) extras : null;
        this.z = parentActivityExtras != null ? parentActivityExtras.e : false;
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.login.LoginActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final LoginActivity loginActivity = LoginActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1199956364, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.login.LoginActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                LoginActivity loginActivity2 = loginActivity;
                                boolean zI = composer2.I(loginActivity2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new LoginActivity$onCreate$1$1$1$1(0, loginActivity2, LoginActivity.class, "finish", "finish()V", 0);
                                    composer2.A(objG);
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                int i = LoginActivity.C;
                                LoginViewModel loginViewModelN4 = loginActivity2.N4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(loginActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    Object loginActivity$onCreate$1$1$2$1 = new LoginActivity$onCreate$1$1$2$1(0, loginActivity2, LoginActivity.class, "onErrorTryAgain", "onErrorTryAgain()V", 0);
                                    composer2.A(loginActivity$onCreate$1$1$2$1);
                                    objG2 = loginActivity$onCreate$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(loginActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj5) {
                                    Object loginActivity$onCreate$1$1$3$1 = new LoginActivity$onCreate$1$1$3$1(0, loginActivity2, LoginActivity.class, "launchPickUpLocator", "launchPickUpLocator()V", 0);
                                    composer2.A(loginActivity$onCreate$1$1$3$1);
                                    objG3 = loginActivity$onCreate$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(loginActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj5) {
                                    Object loginActivity$onCreate$1$1$4$1 = new LoginActivity$onCreate$1$1$4$1(0, loginActivity2, LoginActivity.class, "launchNzAddressPickerAndCloseLogin", "launchNzAddressPickerAndCloseLogin()V", 0);
                                    composer2.A(loginActivity$onCreate$1$1$4$1);
                                    objG4 = loginActivity$onCreate$1$1$4$1;
                                }
                                KFunction kFunction4 = (KFunction) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(loginActivity2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == obj5) {
                                    Object loginActivity$onCreate$1$1$5$1 = new LoginActivity$onCreate$1$1$5$1(0, loginActivity2, LoginActivity.class, "handleSignUpClicked", "handleSignUpClicked()V", 0);
                                    composer2.A(loginActivity$onCreate$1$1$5$1);
                                    objG5 = loginActivity$onCreate$1$1$5$1;
                                }
                                KFunction kFunction5 = (KFunction) objG5;
                                composer2.l();
                                Function0 function0 = (Function0) kFunction;
                                Function0 function02 = (Function0) kFunction2;
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(loginActivity2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == obj5) {
                                    objG6 = new a(loginActivity2, 1);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                LoginScreenKt.b(function0, function02, (Function0) objG6, (Function0) kFunction3, (Function0) kFunction4, (Function0) kFunction5, loginViewModelN4, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 999861804));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new LoginActivity$launchLoginForm$1(this, Boolean.FALSE, null), 3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        LoginViewModel loginViewModelN4 = N4();
        Uri data = intent.getData();
        if (data == null) {
            loginViewModelN4.q6(false, new LoginErrorState(new ResText(com.woolworths.R.string.login_generic_error_message)));
            return;
        }
        String encodedPath = data.getEncodedPath();
        if (encodedPath == null || !StringsKt.v(encodedPath, "/signup", false)) {
            loginViewModelN4.q6(false, new LoginErrorState(new ResText(com.woolworths.R.string.login_generic_error_message)));
        } else {
            loginViewModelN4.o.f(LoginContract.Action.LaunchSignUp.f7450a);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
