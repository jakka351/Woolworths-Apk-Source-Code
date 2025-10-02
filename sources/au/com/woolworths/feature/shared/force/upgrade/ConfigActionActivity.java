package au.com.woolworths.feature.shared.force.upgrade;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import au.com.woolworths.feature.shared.force.upgrade.UpdateDialogType;
import au.com.woolworths.feature.shared.force.upgrade.UpdateFullScreenType;
import au.com.woolworths.feature.shared.force.upgrade.ui.ConfigActionScreenKt;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeType;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/shared/force/upgrade/ConfigActionContract$ViewState;", "viewState", "force-upgrade_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConfigActionActivity extends Hilt_ConfigActionActivity {
    public static final /* synthetic */ int A = 0;
    public ApplicationType x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(ConfigActionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new f(this, 9));

    public final Activities.AppConfigAction.ConfigExtras O4() {
        return (Activities.AppConfigAction.ConfigExtras) this.z.getD();
    }

    public final ConfigActionViewModel P4() {
        return (ConfigActionViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.feature.shared.force.upgrade.Hilt_ConfigActionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity$setViewContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = ConfigActionActivity.A;
                    final ConfigActionActivity configActionActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(configActionActivity.P4().h, composer);
                    CoreThemeKt.a(configActionActivity.P4().k, ComposableLambdaKt.c(-1794712718, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity$setViewContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ConfigActionContract.ViewState viewState = (ConfigActionContract.ViewState) mutableStateA.getD();
                                ConfigActionActivity configActionActivity2 = configActionActivity;
                                ApplicationType applicationType = configActionActivity2.x;
                                if (applicationType == null) {
                                    Intrinsics.p("applicationType");
                                    throw null;
                                }
                                composer2.o(5004770);
                                boolean zI = composer2.I(configActionActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    ConfigActionActivity$setViewContent$1$1$1$1 configActionActivity$setViewContent$1$1$1$1 = new ConfigActionActivity$setViewContent$1$1$1$1(1, configActionActivity2, ConfigActionActivity.class, "handleUpgradeComponentShown", "handleUpgradeComponentShown(Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType;)V", 0);
                                    composer2.A(configActionActivity$setViewContent$1$1$1$1);
                                    objG = configActionActivity$setViewContent$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(configActionActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ConfigActionActivity$setViewContent$1$1$2$1 configActionActivity$setViewContent$1$1$2$1 = new ConfigActionActivity$setViewContent$1$1$2$1(2, configActionActivity2, ConfigActionActivity.class, "handleAppVersionUpdateClick", "handleAppVersionUpdateClick(ZLjava/lang/String;)V", 0);
                                    composer2.A(configActionActivity$setViewContent$1$1$2$1);
                                    objG2 = configActionActivity$setViewContent$1$1$2$1;
                                }
                                composer2.l();
                                Function2 function2 = (Function2) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(configActionActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    ConfigActionActivity$setViewContent$1$1$3$1 configActionActivity$setViewContent$1$1$3$1 = new ConfigActionActivity$setViewContent$1$1$3$1(2, configActionActivity2, ConfigActionActivity.class, "handleAppVersionUpdateIgnored", "handleAppVersionUpdateIgnored(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                    composer2.A(configActionActivity$setViewContent$1$1$3$1);
                                    objG3 = configActionActivity$setViewContent$1$1$3$1;
                                }
                                composer2.l();
                                Function2 function22 = (Function2) ((KFunction) objG3);
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(configActionActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    ConfigActionActivity$setViewContent$1$1$4$1 configActionActivity$setViewContent$1$1$4$1 = new ConfigActionActivity$setViewContent$1$1$4$1(2, configActionActivity2, ConfigActionActivity.class, "handleOsVersionUpdateClick", "handleOsVersionUpdateClick(ZLjava/lang/String;)V", 0);
                                    composer2.A(configActionActivity$setViewContent$1$1$4$1);
                                    objG4 = configActionActivity$setViewContent$1$1$4$1;
                                }
                                composer2.l();
                                Function2 function23 = (Function2) ((KFunction) objG4);
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(configActionActivity2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    ConfigActionActivity$setViewContent$1$1$5$1 configActionActivity$setViewContent$1$1$5$1 = new ConfigActionActivity$setViewContent$1$1$5$1(1, configActionActivity2, ConfigActionActivity.class, "handleOsVersionUpdateIgnored", "handleOsVersionUpdateIgnored(Ljava/lang/String;)V", 0);
                                    composer2.A(configActionActivity$setViewContent$1$1$5$1);
                                    objG5 = configActionActivity$setViewContent$1$1$5$1;
                                }
                                composer2.l();
                                Function1 function12 = (Function1) ((KFunction) objG5);
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(configActionActivity2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    ConfigActionActivity$setViewContent$1$1$6$1 configActionActivity$setViewContent$1$1$6$1 = new ConfigActionActivity$setViewContent$1$1$6$1(2, configActionActivity2, ConfigActionActivity.class, "handleShowRewardsCardClick", "handleShowRewardsCardClick(Lau/com/woolworths/feature/shared/force/upgrade/UpdateFullScreenType;Ljava/lang/String;)V", 0);
                                    composer2.A(configActionActivity$setViewContent$1$1$6$1);
                                    objG6 = configActionActivity$setViewContent$1$1$6$1;
                                }
                                composer2.l();
                                ConfigActionScreenKt.a(viewState, applicationType, function1, function2, function22, function23, function12, (Function2) ((KFunction) objG6), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer), composer, 48);
                }
                return Unit.f24250a;
            }
        }, true, -1439179692));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ConfigActionActivity$observeActions$1(this, null), 3);
        ConfigActionViewModel configActionViewModelP4 = P4();
        Activities.AppConfigAction.ConfigExtras extras = O4();
        MutableStateFlow mutableStateFlow = configActionViewModelP4.g;
        Intrinsics.h(extras, "extras");
        String str = extras.j;
        String str2 = extras.i;
        String str3 = extras.h;
        String str4 = extras.g;
        UpgradeType upgradeTypeValueOf = UpgradeType.valueOf(extras.e);
        UpgradePromptType upgradePromptTypeValueOf = UpgradePromptType.valueOf(extras.f);
        UpgradeType upgradeType = UpgradeType.e;
        if (upgradeTypeValueOf == upgradeType && upgradePromptTypeValueOf == UpgradePromptType.e) {
            mutableStateFlow.setValue(new ConfigActionContract.ViewState.Content(new UpdateDialogType.AppFlexibleUpdate(extras.g, extras.h, extras.i, extras.j, extras.l)));
            return;
        }
        if (upgradeTypeValueOf == upgradeType && upgradePromptTypeValueOf == UpgradePromptType.f) {
            mutableStateFlow.setValue(new ConfigActionContract.ViewState.Content(new UpdateDialogType.AppForceUpdate(str4, str3, str2)));
            return;
        }
        UpgradeType upgradeType2 = UpgradeType.f;
        if (upgradeTypeValueOf == upgradeType2 && upgradePromptTypeValueOf == UpgradePromptType.e) {
            mutableStateFlow.setValue(new ConfigActionContract.ViewState.Content(new UpdateDialogType.OsFlexibleUpdate(str4, str3, str2, str)));
            return;
        }
        if (upgradeTypeValueOf == upgradeType2 && upgradePromptTypeValueOf == UpgradePromptType.f) {
            mutableStateFlow.setValue(new ConfigActionContract.ViewState.Content(new UpdateDialogType.OsForceUpdate(str4, str3, str2)));
            return;
        }
        if (upgradeTypeValueOf == upgradeType && upgradePromptTypeValueOf == UpgradePromptType.g) {
            mutableStateFlow.setValue(new ConfigActionContract.ViewState.FullScreenContent(new UpdateFullScreenType.AppForceUpdate(str4, str3, str2, str)));
        } else if (upgradeTypeValueOf == upgradeType2 && upgradePromptTypeValueOf == UpgradePromptType.g) {
            mutableStateFlow.setValue(new ConfigActionContract.ViewState.FullScreenContent(new UpdateFullScreenType.OsForceUpdate(str4, str3, str2, str)));
        } else {
            configActionViewModelP4.i.f(ConfigActionContract.Action.LaunchNextScreen.f6499a);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            if (Build.VERSION.SDK_INT >= 34) {
                overrideActivityTransition(1, 0, android.R.anim.fade_out);
            } else {
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        }
    }
}
