package au.com.woolworths.feature.rewards.redemptionsettings;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingMessage;
import au.com.woolworths.base.rewards.account.utils.RewardsAuthNavigator;
import au.com.woolworths.base.rewards.account.utils.TwoFactorAuthStepUpHelper;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionBottomSheetContentKt;
import au.com.woolworths.rewards.base.extensions.ActivityExtKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsBottomSheetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/base/rewards/account/utils/RewardsAuthNavigator;", "<init>", "()V", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsBottomSheetActivity extends Hilt_RewardsRedemptionSettingsBottomSheetActivity implements RewardsAuthNavigator {
    public static final /* synthetic */ int B = 0;
    public AnalyticsManager y;
    public FeatureToggleManager z;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(RewardsRedemptionSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final TwoFactorAuthStepUpHelper A = new TwoFactorAuthStepUpHelper(this);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsBottomSheetActivity$Companion;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RewardsRedemptionSettingsContract.SoftErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsRedemptionSettingsContract.SoftErrorType softErrorType = RewardsRedemptionSettingsContract.SoftErrorType.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsRedemptionSettingsContract.SoftErrorType softErrorType2 = RewardsRedemptionSettingsContract.SoftErrorType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$onCreate$1", f = "RewardsRedemptionSettingsBottomSheetActivity.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01421 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ RewardsRedemptionSettingsBottomSheetActivity d;

            public C01421(RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity) {
                this.d = rewardsRedemptionSettingsBottomSheetActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, RewardsRedemptionSettingsBottomSheetActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                View decorView;
                int i;
                RewardsRedemptionSettingsContract.Actions actions = (RewardsRedemptionSettingsContract.Actions) obj;
                int i2 = RewardsRedemptionSettingsBottomSheetActivity.B;
                boolean z = actions instanceof RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages;
                RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity = this.d;
                if (z) {
                    RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages showChangeConfirmationMessages = (RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages) actions;
                    rewardsRedemptionSettingsBottomSheetActivity.P4(showChangeConfirmationMessages.f6430a, showChangeConfirmationMessages.b, 0);
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication) {
                    RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication launchStepUpAuthentication = (RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication) actions;
                    rewardsRedemptionSettingsBottomSheetActivity.open2FAStepUpFlow(launchStepUpAuthentication.f6427a, launchStepUpAuthentication.b);
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.ShowSoftErrorMessage) {
                    RewardsRedemptionSettingsContract.SoftErrorType softErrorType = ((RewardsRedemptionSettingsContract.Actions.ShowSoftErrorMessage) actions).f6431a;
                    Window window = rewardsRedemptionSettingsBottomSheetActivity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        int iOrdinal = softErrorType.ordinal();
                        if (iOrdinal == 0) {
                            i = com.woolworths.R.string.rewards_change_redemption_authentication_failed;
                        } else if (iOrdinal == 1) {
                            i = com.woolworths.R.string.rewards_change_redemption_server_error;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = com.woolworths.R.string.rewards_change_redemption_network_error;
                        }
                        Snackbar.i(decorView, i, -1).l();
                    }
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings) {
                    RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings launchRedemptionSettings = (RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings) actions;
                    new AlertDialog.Builder(rewardsRedemptionSettingsBottomSheetActivity).setTitle(com.woolworths.R.string.rewards_redemption_settings_change_dialog_title).setMessage(com.woolworths.R.string.rewards_redemption_settings_change_dialog_message).setPositiveButton(com.woolworths.R.string.continue_text, new b(rewardsRedemptionSettingsBottomSheetActivity, launchRedemptionSettings.f6426a, launchRedemptionSettings.b, 0)).setNegativeButton(com.woolworths.R.string.cancel, new au.com.woolworths.base.wallet.digipay.framesview.a(rewardsRedemptionSettingsBottomSheetActivity, 3)).show();
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.OpenUrl) {
                    ContextExtKt.e(rewardsRedemptionSettingsBottomSheetActivity, ((RewardsRedemptionSettingsContract.Actions.OpenUrl) actions).f6429a);
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings) {
                    ContextExtKt.j(rewardsRedemptionSettingsBottomSheetActivity, ((RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings) actions).f6428a, null, null, null, 62);
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsRedemptionSettingsBottomSheetActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = RewardsRedemptionSettingsBottomSheetActivity.B;
                RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity = RewardsRedemptionSettingsBottomSheetActivity.this;
                SharedFlow sharedFlow = rewardsRedemptionSettingsBottomSheetActivity.O4().k;
                C01421 c01421 = new C01421(rewardsRedemptionSettingsBottomSheetActivity);
                this.p = 1;
                if (sharedFlow.collect(c01421, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final RewardsRedemptionSettingsViewModel O4() {
        return (RewardsRedemptionSettingsViewModel) this.x.getD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.feature.rewards.redemptionsettings.a] */
    public final void P4(List list, au.com.woolworths.feature.rewards.card.overlay.ui.b bVar, int i) {
        List list2;
        int i2;
        if (i > list.size() - 1) {
            return;
        }
        if (i < list.size() - 1) {
            list2 = list;
            i2 = i;
            bVar = new a(this, list2, bVar, i2, 0);
        } else {
            list2 = list;
            i2 = i;
        }
        RewardsRedemptionSettingMessage rewardsRedemptionSettingMessage = (RewardsRedemptionSettingMessage) list2.get(i2);
        new AlertDialog.Builder(this).setTitle(rewardsRedemptionSettingMessage.getTitle()).setMessage(rewardsRedemptionSettingMessage.getMessage()).setPositiveButton(rewardsRedemptionSettingMessage.getButtonLabel(), new c(0, bVar)).setNegativeButton(com.woolworths.R.string.rewards_redemption_settings_confirm_change_cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, com.woolworths.R.anim.fade_out_quickly);
        } else {
            overridePendingTransition(0, com.woolworths.R.anim.fade_out_quickly);
        }
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.Hilt_RewardsRedemptionSettingsBottomSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityExtKt.a(this);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$setupUI$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = RewardsRedemptionSettingsBottomSheetActivity.B;
                    final RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity = this.d;
                    final RewardsRedemptionSettingsContract.ViewState viewState = (RewardsRedemptionSettingsContract.ViewState) LiveDataAdapterKt.b(rewardsRedemptionSettingsBottomSheetActivity.O4().l, new RewardsRedemptionSettingsContract.ViewState(false), composer).getD();
                    final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer, 3078, 6);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = android.support.v4.media.session.a.i(composer.y(), composer);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objG;
                    composer.o(-1746271574);
                    boolean zI = composer.I(coroutineScope) | composer.I(modalBottomSheetStateC) | composer.I(rewardsRedemptionSettingsBottomSheetActivity);
                    Object objG2 = composer.G();
                    if (zI || objG2 == composer$Companion$Empty$1) {
                        objG2 = new Function0() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                BuildersKt.c(coroutineScope, null, null, new RewardsRedemptionSettingsBottomSheetActivity$setupUI$1$1$1$1(modalBottomSheetStateC, rewardsRedemptionSettingsBottomSheetActivity, null), 3);
                                return Unit.f24250a;
                            }
                        };
                        composer.A(objG2);
                    }
                    composer.l();
                    BackHandlerKt.a(false, (Function0) objG2, composer, 0, 1);
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(-1793711188, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity$setupUI$1.2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final RewardsRedemptionSettingsContract.ViewState viewState2 = viewState;
                                final RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity2 = rewardsRedemptionSettingsBottomSheetActivity;
                                ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(665022782, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetActivity.setupUI.1.2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        ColumnScope ModalBottomSheetLayout = (ColumnScope) obj5;
                                        Composer composer3 = (Composer) obj6;
                                        int iIntValue = ((Number) obj7).intValue();
                                        Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            RewardsRedemptionSettingsContract.ViewState viewState3 = viewState2;
                                            Intrinsics.e(viewState3);
                                            composer3.o(5004770);
                                            RewardsRedemptionSettingsBottomSheetActivity rewardsRedemptionSettingsBottomSheetActivity3 = rewardsRedemptionSettingsBottomSheetActivity2;
                                            boolean zI2 = composer3.I(rewardsRedemptionSettingsBottomSheetActivity3);
                                            Object objG3 = composer3.G();
                                            if (zI2 || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new f(rewardsRedemptionSettingsBottomSheetActivity3, 5);
                                                composer3.A(objG3);
                                            }
                                            composer3.l();
                                            int i2 = RewardsRedemptionSettingsBottomSheetActivity.B;
                                            RedemptionBottomSheetContentKt.b(viewState3, (Function0) objG3, rewardsRedemptionSettingsBottomSheetActivity3.O4(), composer3, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), null, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableSingletons$RewardsRedemptionSettingsBottomSheetActivityKt.f6421a, composer2, 14156294, 58);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                    composer.o(5004770);
                    boolean zI2 = composer.I(modalBottomSheetStateC);
                    Object objG3 = composer.G();
                    if (zI2 || objG3 == composer$Companion$Empty$1) {
                        objG3 = new RewardsRedemptionSettingsBottomSheetActivity$setupUI$1$3$1(modalBottomSheetStateC, null);
                        composer.A(objG3);
                    }
                    composer.l();
                    EffectsKt.e(composer, modalBottomSheetStateC, (Function2) objG3);
                    composer.o(-1633490746);
                    boolean zI3 = composer.I(modalBottomSheetStateC) | composer.I(rewardsRedemptionSettingsBottomSheetActivity);
                    Object objG4 = composer.G();
                    if (zI3 || objG4 == composer$Companion$Empty$1) {
                        objG4 = new RewardsRedemptionSettingsBottomSheetActivity$setupUI$1$4$1(modalBottomSheetStateC, rewardsRedemptionSettingsBottomSheetActivity, null);
                        composer.A(objG4);
                    }
                    composer.l();
                    EffectsKt.e(composer, modalBottomSheetStateC, (Function2) objG4);
                }
                return Unit.f24250a;
            }
        }, true, 1462344287));
        O4().q6();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModelO4 = O4();
        RewardsRedemptionSettingsContract.AnalyticsImpressionType analyticsImpressionType = RewardsRedemptionSettingsContract.AnalyticsImpressionType.e;
        Intrinsics.h(analyticsImpressionType, "<set-?>");
        rewardsRedemptionSettingsViewModelO4.m = analyticsImpressionType;
        AnalyticsManager analyticsManager = this.y;
        if (analyticsManager != null) {
            analyticsManager.a(Screens.A);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }

    @Override // au.com.woolworths.base.rewards.account.utils.RewardsAuthNavigator
    public final void open2FAStepUpFlow(String url, Function1 onResult) {
        Intrinsics.h(url, "url");
        Intrinsics.h(onResult, "onResult");
        this.A.launchRewardsAuthentication(url, onResult);
    }
}
