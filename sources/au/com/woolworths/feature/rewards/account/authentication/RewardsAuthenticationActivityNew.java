package au.com.woolworths.feature.rewards.account.authentication;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt;
import au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationActivityNew;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "isSignUp", "isLiteModeSignup", "isDigiLiteSignupEnabled", "isAuth0SignupEnabled", "showRegisterMultiSignup", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsAuthenticationActivityNew extends Hilt_RewardsAuthenticationActivityNew {
    public static final /* synthetic */ int D = 0;
    public FeatureToggleManager A;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(RewardsAuthenticationViewModelNew.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy C = LazyKt.b(new d(this, 1));
    public Auth0AuthManager w;
    public BranchDeepLinkInteractorImpl x;
    public RewardsAccountInteractor y;
    public ReleaseSettingsInteractorImpl z;

    public final FeatureToggleManager N4() {
        FeatureToggleManager featureToggleManager = this.A;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    public final RewardsAuthenticationViewModelNew O4() {
        return (RewardsAuthenticationViewModelNew) this.B.getD();
    }

    @Override // au.com.woolworths.feature.rewards.account.authentication.Hilt_RewardsAuthenticationActivityNew, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        Object value2;
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                final RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew = RewardsAuthenticationActivityNew.this;
                Lazy lazy = rewardsAuthenticationActivityNew.C;
                if ((iIntValue & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    composer.o(1849434622);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        Activities.RewardsAuthenticationNew.Extras extras = (Activities.RewardsAuthenticationNew.Extras) lazy.getD();
                        objG = SnapshotStateKt.f(Boolean.valueOf(extras != null ? Intrinsics.c(extras.e, Boolean.TRUE) : false));
                        composer.A(objG);
                    }
                    final MutableState mutableState = (MutableState) objG;
                    Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
                    if (objE == composer$Companion$Empty$1) {
                        Activities.RewardsAuthenticationNew.Extras extras2 = (Activities.RewardsAuthenticationNew.Extras) lazy.getD();
                        objE = SnapshotStateKt.f(Boolean.valueOf(extras2 != null ? Intrinsics.c(extras2.f, Boolean.TRUE) : false));
                        composer.A(objE);
                    }
                    MutableState mutableState2 = (MutableState) objE;
                    Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
                    if (objE2 == composer$Companion$Empty$1) {
                        objE2 = SnapshotStateKt.f(Boolean.valueOf(rewardsAuthenticationActivityNew.N4().c(RewardsBaseFeature.p)));
                        composer.A(objE2);
                    }
                    MutableState mutableState3 = (MutableState) objE2;
                    Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
                    if (objE3 == composer$Companion$Empty$1) {
                        objE3 = SnapshotStateKt.f(Boolean.valueOf(rewardsAuthenticationActivityNew.N4().c(RewardsBaseFeature.q)));
                        composer.A(objE3);
                    }
                    MutableState mutableState4 = (MutableState) objE3;
                    Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
                    if (objE4 == composer$Companion$Empty$1) {
                        objE4 = SnapshotStateKt.d(new androidx.work.impl.utils.b(mutableState, mutableState4, mutableState2, mutableState3, 4));
                        composer.A(objE4);
                    }
                    final State state = (State) objE4;
                    composer.l();
                    CoreThemeKt.b(6, composer, ComposableLambdaKt.c(1039941495, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                boolean zBooleanValue = ((Boolean) state.getD()).booleanValue();
                                RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew2 = rewardsAuthenticationActivityNew;
                                Object obj5 = Composer.Companion.f1624a;
                                if (zBooleanValue) {
                                    composer2.o(1298141596);
                                    if (rewardsAuthenticationActivityNew2.z == null) {
                                        Intrinsics.p("settingsInteractor");
                                        throw null;
                                    }
                                    AppEnvironment.Production production = AppEnvironment.Production.INSTANCE;
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(rewardsAuthenticationActivityNew2);
                                    Object objG2 = composer2.G();
                                    if (zI || objG2 == obj5) {
                                        Object rewardsAuthenticationActivityNew$onCreate$1$1$1$1 = new RewardsAuthenticationActivityNew$onCreate$1$1$1$1(0, rewardsAuthenticationActivityNew2, RewardsAuthenticationActivityNew.class, "finish", "finish()V", 0);
                                        composer2.A(rewardsAuthenticationActivityNew$onCreate$1$1$1$1);
                                        objG2 = rewardsAuthenticationActivityNew$onCreate$1$1$1$1;
                                    }
                                    KFunction kFunction = (KFunction) objG2;
                                    composer2.l();
                                    RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNewO4 = rewardsAuthenticationActivityNew2.O4();
                                    Object objO4 = rewardsAuthenticationActivityNew2.O4();
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(objO4);
                                    Object objG3 = composer2.G();
                                    if (zI2 || objG3 == obj5) {
                                        Object rewardsAuthenticationActivityNew$onCreate$1$1$2$1 = new RewardsAuthenticationActivityNew$onCreate$1$1$2$1(3, objO4, RewardsAuthenticationViewModelNew.class, "reloadSignUp", "reloadSignUp$account_release(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                                        composer2.A(rewardsAuthenticationActivityNew$onCreate$1$1$2$1);
                                        objG3 = rewardsAuthenticationActivityNew$onCreate$1$1$2$1;
                                    }
                                    KFunction kFunction2 = (KFunction) objG3;
                                    composer2.l();
                                    Object objO42 = rewardsAuthenticationActivityNew2.O4();
                                    composer2.o(5004770);
                                    boolean zI3 = composer2.I(objO42);
                                    Object objG4 = composer2.G();
                                    if (zI3 || objG4 == obj5) {
                                        Object rewardsAuthenticationActivityNew$onCreate$1$1$3$1 = new RewardsAuthenticationActivityNew$onCreate$1$1$3$1(0, objO42, RewardsAuthenticationViewModelNew.class, "handleWebViewError", "handleWebViewError$account_release()V", 0);
                                        composer2.A(rewardsAuthenticationActivityNew$onCreate$1$1$3$1);
                                        objG4 = rewardsAuthenticationActivityNew$onCreate$1$1$3$1;
                                    }
                                    composer2.l();
                                    Function0 function0 = (Function0) kFunction;
                                    Function3 function3 = (Function3) kFunction2;
                                    Function0 function02 = (Function0) ((KFunction) objG4);
                                    composer2.o(-1633490746);
                                    boolean zI4 = composer2.I(rewardsAuthenticationActivityNew2);
                                    Object objG5 = composer2.G();
                                    if (zI4 || objG5 == obj5) {
                                        objG5 = new g(0, rewardsAuthenticationActivityNew2, mutableState);
                                        composer2.A(objG5);
                                    }
                                    composer2.l();
                                    RewardsSignUpScreenKt.a(production, function0, function3, rewardsAuthenticationViewModelNewO4, function02, (Function1) objG5, composer2, 0);
                                    composer2.l();
                                } else {
                                    composer2.o(1298854348);
                                    composer2.o(5004770);
                                    boolean zI5 = composer2.I(rewardsAuthenticationActivityNew2);
                                    Object objG6 = composer2.G();
                                    if (zI5 || objG6 == obj5) {
                                        Object rewardsAuthenticationActivityNew$onCreate$1$1$5$1 = new RewardsAuthenticationActivityNew$onCreate$1$1$5$1(0, rewardsAuthenticationActivityNew2, RewardsAuthenticationActivityNew.class, "finish", "finish()V", 0);
                                        composer2.A(rewardsAuthenticationActivityNew$onCreate$1$1$5$1);
                                        objG6 = rewardsAuthenticationActivityNew$onCreate$1$1$5$1;
                                    }
                                    KFunction kFunction3 = (KFunction) objG6;
                                    composer2.l();
                                    int i = RewardsAuthenticationActivityNew.D;
                                    RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNewO42 = rewardsAuthenticationActivityNew2.O4();
                                    Object objO43 = rewardsAuthenticationActivityNew2.O4();
                                    composer2.o(5004770);
                                    boolean zI6 = composer2.I(objO43);
                                    Object objG7 = composer2.G();
                                    if (zI6 || objG7 == obj5) {
                                        Object rewardsAuthenticationActivityNew$onCreate$1$1$6$1 = new RewardsAuthenticationActivityNew$onCreate$1$1$6$1(0, objO43, RewardsAuthenticationViewModelNew.class, "onLoginError", "onLoginError$account_release()V", 0);
                                        composer2.A(rewardsAuthenticationActivityNew$onCreate$1$1$6$1);
                                        objG7 = rewardsAuthenticationActivityNew$onCreate$1$1$6$1;
                                    }
                                    KFunction kFunction4 = (KFunction) objG7;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI7 = composer2.I(rewardsAuthenticationActivityNew2);
                                    Object objG8 = composer2.G();
                                    if (zI7 || objG8 == obj5) {
                                        objG8 = new RewardsAuthenticationActivityNew$onCreate$1$1$7$1(0, rewardsAuthenticationActivityNew2, RewardsAuthenticationActivityNew.class, "showRewardsHomePage", "showRewardsHomePage()V", 0);
                                        composer2.A(objG8);
                                    }
                                    KFunction kFunction5 = (KFunction) objG8;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI8 = composer2.I(rewardsAuthenticationActivityNew2);
                                    Object objG9 = composer2.G();
                                    if (zI8 || objG9 == obj5) {
                                        Object rewardsAuthenticationActivityNew$onCreate$1$1$8$1 = new RewardsAuthenticationActivityNew$onCreate$1$1$8$1(3, rewardsAuthenticationActivityNew2, RewardsAuthenticationActivityNew.class, "launchAuth0Form", "launchAuth0Form(ZLjava/lang/Boolean;Ljava/lang/String;)V", 0);
                                        composer2.A(rewardsAuthenticationActivityNew$onCreate$1$1$8$1);
                                        objG9 = rewardsAuthenticationActivityNew$onCreate$1$1$8$1;
                                    }
                                    KFunction kFunction6 = (KFunction) objG9;
                                    composer2.l();
                                    Object objO44 = rewardsAuthenticationActivityNew2.O4();
                                    composer2.o(5004770);
                                    boolean zI9 = composer2.I(objO44);
                                    Object objG10 = composer2.G();
                                    if (zI9 || objG10 == obj5) {
                                        objG10 = new RewardsAuthenticationActivityNew$onCreate$1$1$9$1(0, objO44, RewardsAuthenticationViewModelNew.class, "onForceLogoutDialogDismiss", "onForceLogoutDialogDismiss$account_release()V", 0);
                                        composer2.A(objG10);
                                    }
                                    KFunction kFunction7 = (KFunction) objG10;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI10 = composer2.I(rewardsAuthenticationActivityNew2);
                                    Object objG11 = composer2.G();
                                    if (zI10 || objG11 == obj5) {
                                        objG11 = new RewardsAuthenticationActivityNew$onCreate$1$1$10$1(0, rewardsAuthenticationActivityNew2, RewardsAuthenticationActivityNew.class, "onContactUs", "onContactUs()V", 0);
                                        composer2.A(objG11);
                                    }
                                    composer2.l();
                                    RewardsLoginScreenKt.c((Function0) kFunction3, (Function0) kFunction4, (Function0) kFunction5, (Function0) ((KFunction) objG11), (Function3) kFunction6, (Function0) kFunction7, rewardsAuthenticationViewModelNewO42, composer2, 0);
                                    composer2.l();
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 948260666));
        RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNewO4 = O4();
        Activities.RewardsAuthenticationNew.Extras extras = (Activities.RewardsAuthenticationNew.Extras) this.C.getD();
        MutableStateFlow mutableStateFlow = rewardsAuthenticationViewModelNewO4.h;
        FeatureToggleManager featureToggleManager = rewardsAuthenticationViewModelNewO4.f;
        rewardsAuthenticationViewModelNewO4.g = extras != null ? Intrinsics.c(extras.e, Boolean.TRUE) : false;
        boolean zC = featureToggleManager.c(RewardsBaseFeature.q);
        boolean z = (extras != null ? Intrinsics.c(extras.f, Boolean.TRUE) : false) && !featureToggleManager.c(RewardsBaseFeature.p);
        if (extras != null && extras.d) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, RewardsAuthenticationContractNew.ViewState.ForcedLoggedOut.f5660a));
            return;
        }
        boolean z2 = rewardsAuthenticationViewModelNewO4.g;
        if (!z2 || (zC && !z)) {
            rewardsAuthenticationViewModelNewO4.j.f(new RewardsAuthenticationContractNew.Action.LaunchAuth0Form(z2, 6));
            return;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, RewardsAuthenticationContractNew.ViewState.Loading.f5661a));
        BuildersKt.c(ViewModelKt.a(rewardsAuthenticationViewModelNewO4), null, null, new RewardsAuthenticationViewModelNew$fetchSignUpDetails$2(rewardsAuthenticationViewModelNewO4, null), 3);
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
