package au.com.woolworths.feature.rewards.account.closeaccount;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.a;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.CloseAccountScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountContract$ViewState;", "viewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CloseAccountActivity extends Hilt_CloseAccountActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(CloseAccountViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.feature.rewards.account.closeaccount.Hilt_CloseAccountActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                final CloseAccountActivity closeAccountActivity = CloseAccountActivity.this;
                ViewModelLazy viewModelLazy = closeAccountActivity.x;
                if ((iIntValue & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final MutableState mutableStateA = FlowExtKt.a(((CloseAccountViewModel) viewModelLazy.getD()).g, composer);
                    final ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composer, 3);
                    Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = a.i(composer.y(), composer);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objG;
                    Flow flow = ((CloseAccountViewModel) viewModelLazy.getD()).i;
                    composer.o(-1224400529);
                    boolean zI = composer.I(closeAccountActivity) | composer.I(context) | composer.I(coroutineScope) | composer.n(scaffoldStateD);
                    Object objG2 = composer.G();
                    if (zI || objG2 == composer$Companion$Empty$1) {
                        CloseAccountActivity$onCreate$1$1$1 closeAccountActivity$onCreate$1$1$1 = new CloseAccountActivity$onCreate$1$1$1(closeAccountActivity, context, coroutineScope, scaffoldStateD, null);
                        composer.A(closeAccountActivity$onCreate$1$1$1);
                        objG2 = closeAccountActivity$onCreate$1$1$1;
                    }
                    composer.l();
                    EffectsKt.e(composer, flow, (Function2) objG2);
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(1235204496, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity.onCreate.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Number) obj4).intValue();
                            CloseAccountActivity closeAccountActivity2 = closeAccountActivity;
                            ViewModelLazy viewModelLazy2 = closeAccountActivity2.x;
                            if ((iIntValue2 & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CloseAccountContract.ViewState viewState = (CloseAccountContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(closeAccountActivity2);
                                Object objG3 = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                if (zI2 || objG3 == composer$Companion$Empty$12) {
                                    CloseAccountActivity$onCreate$1$2$1$1 closeAccountActivity$onCreate$1$2$1$1 = new CloseAccountActivity$onCreate$1$2$1$1(0, closeAccountActivity2, CloseAccountActivity.class, "finish", "finish()V", 0);
                                    composer2.A(closeAccountActivity$onCreate$1$2$1$1);
                                    objG3 = closeAccountActivity$onCreate$1$2$1$1;
                                }
                                KFunction kFunction = (KFunction) objG3;
                                composer2.l();
                                CloseAccountViewModel closeAccountViewModel = (CloseAccountViewModel) viewModelLazy2.getD();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(closeAccountViewModel);
                                Object objG4 = composer2.G();
                                if (zI3 || objG4 == composer$Companion$Empty$12) {
                                    CloseAccountActivity$onCreate$1$2$2$1 closeAccountActivity$onCreate$1$2$2$1 = new CloseAccountActivity$onCreate$1$2$2$1(1, closeAccountViewModel, CloseAccountViewModel.class, "onConsentCheckedChange", "onConsentCheckedChange(Z)V", 0);
                                    composer2.A(closeAccountActivity$onCreate$1$2$2$1);
                                    objG4 = closeAccountActivity$onCreate$1$2$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG4;
                                composer2.l();
                                CloseAccountViewModel closeAccountViewModel2 = (CloseAccountViewModel) viewModelLazy2.getD();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(closeAccountViewModel2);
                                Object objG5 = composer2.G();
                                if (zI4 || objG5 == composer$Companion$Empty$12) {
                                    objG5 = new CloseAccountActivity$onCreate$1$2$3$1(1, closeAccountViewModel2, CloseAccountViewModel.class, "onCtaClick", "onCtaClick(Lau/com/woolworths/android/onesite/data/ContentCta;)V", 0);
                                    composer2.A(objG5);
                                }
                                KFunction kFunction3 = (KFunction) objG5;
                                composer2.l();
                                CloseAccountViewModel closeAccountViewModel3 = (CloseAccountViewModel) viewModelLazy2.getD();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(closeAccountViewModel3);
                                Object objG6 = composer2.G();
                                if (zI5 || objG6 == composer$Companion$Empty$12) {
                                    objG6 = new CloseAccountActivity$onCreate$1$2$4$1(0, closeAccountViewModel3, CloseAccountViewModel.class, "fetchConsentPage", "fetchConsentPage()V", 0);
                                    composer2.A(objG6);
                                }
                                KFunction kFunction4 = (KFunction) objG6;
                                composer2.l();
                                CloseAccountViewModel closeAccountViewModel4 = (CloseAccountViewModel) viewModelLazy2.getD();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(closeAccountViewModel4);
                                Object objG7 = composer2.G();
                                if (zI6 || objG7 == composer$Companion$Empty$12) {
                                    CloseAccountActivity$onCreate$1$2$5$1 closeAccountActivity$onCreate$1$2$5$1 = new CloseAccountActivity$onCreate$1$2$5$1(0, closeAccountViewModel4, CloseAccountViewModel.class, "logout", "logout()V", 0);
                                    composer2.A(closeAccountActivity$onCreate$1$2$5$1);
                                    objG7 = closeAccountActivity$onCreate$1$2$5$1;
                                }
                                composer2.l();
                                CloseAccountScreenKt.a(viewState, (Function0) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function0) kFunction4, (Function0) ((KFunction) objG7), scaffoldStateD, composer2, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2051934781));
    }
}
