package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.e;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/FinalGlanceBottomSheetActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FinalGlanceBottomSheetActivity extends Hilt_FinalGlanceBottomSheetActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(EverydayExtraFinalGlanceBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final boolean y = true;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity$onCreate$2", f = "FinalGlanceBottomSheetActivity.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ FinalGlanceBottomSheetActivity d;

            public AnonymousClass1(FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity) {
                this.d = finalGlanceBottomSheetActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, FinalGlanceBottomSheetActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                EverydayExtraFinalGlanceContract.Actions actions = (EverydayExtraFinalGlanceContract.Actions) obj;
                int i = FinalGlanceBottomSheetActivity.z;
                FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity = this.d;
                if (finalGlanceBottomSheetActivity.getD().getD().compareTo(Lifecycle.State.h) >= 0) {
                    if (actions instanceof EverydayExtraFinalGlanceContract.Actions.Finish) {
                        finalGlanceBottomSheetActivity.finish();
                    } else if (actions instanceof EverydayExtraFinalGlanceContract.Actions.ShowError) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(finalGlanceBottomSheetActivity);
                        EverydayExtraFinalGlanceContract.Actions.ShowError showError = (EverydayExtraFinalGlanceContract.Actions.ShowError) actions;
                        int i2 = showError.f6084a;
                        builder.setTitle(finalGlanceBottomSheetActivity.getString(i2)).setMessage(finalGlanceBottomSheetActivity.getString(showError.b)).setPositiveButton(R.string.ok, new au.com.woolworths.base.wallet.digipay.framesview.a(finalGlanceBottomSheetActivity, 2)).show();
                        EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModelO4 = finalGlanceBottomSheetActivity.O4();
                        String string = finalGlanceBottomSheetActivity.getString(i2);
                        Intrinsics.g(string, "getString(...)");
                        everydayExtraFinalGlanceBottomSheetViewModelO4.v6(string, null, null);
                    } else if (actions instanceof EverydayExtraFinalGlanceContract.Actions.ShowOnboarding) {
                        EverydayExtraFinalGlanceContract.Actions.ShowOnboarding showOnboarding = (EverydayExtraFinalGlanceContract.Actions.ShowOnboarding) actions;
                        String str = showOnboarding.f6085a;
                        EverydayExtrasOnBoarding everydayExtrasOnBoarding = showOnboarding.b;
                        Intent intent = new Intent(finalGlanceBottomSheetActivity, (Class<?>) EverydayExtrasSignUpActivity.class);
                        intent.putExtra("onboardingItem", everydayExtrasOnBoarding);
                        intent.putExtra("EXTRA_INITIAL_INFO", new Activities.EverydayExtraNativeSignUpActivity.InitialInfo(null, Activities.MagicLinkActivity.PreferredLaunchMode.e, true, Activities.EverydayExtraNativeSignUpActivity.InitialScreen.e, str));
                        intent.setFlags(536870912);
                        finalGlanceBottomSheetActivity.startActivity(intent);
                        finalGlanceBottomSheetActivity.finish();
                    } else {
                        if (!(actions instanceof EverydayExtraFinalGlanceContract.Actions.ShowAlertDialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(finalGlanceBottomSheetActivity);
                        EverydayExtraSubscribeAlertDialog everydayExtraSubscribeAlertDialog = ((EverydayExtraFinalGlanceContract.Actions.ShowAlertDialog) actions).f6083a;
                        builder2.setTitle(everydayExtraSubscribeAlertDialog.d).setMessage(everydayExtraSubscribeAlertDialog.e).setPositiveButton(everydayExtraSubscribeAlertDialog.f.getLabel(), new a(finalGlanceBottomSheetActivity, actions, 0)).show();
                    }
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

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FinalGlanceBottomSheetActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = FinalGlanceBottomSheetActivity.z;
                FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity = FinalGlanceBottomSheetActivity.this;
                Flow flowA = FlowExtKt.a(finalGlanceBottomSheetActivity.O4().j, finalGlanceBottomSheetActivity.getD(), Lifecycle.State.h);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(finalGlanceBottomSheetActivity);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public final EverydayExtraFinalGlanceBottomSheetViewModel O4() {
        return (EverydayExtraFinalGlanceBottomSheetViewModel) this.x.getD();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.y) {
            overridePendingTransition(0, com.woolworths.R.anim.fade_out);
        }
    }

    @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.Hilt_FinalGlanceBottomSheetActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-1);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.e(false);
        windowInsetsControllerCompat.d(true);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        Activities.FinalGlanceBottomSheet.Extras extras = (Activities.FinalGlanceBottomSheet.Extras) IntentCompat.a(getIntent(), "EXTRA_DATA", Activities.FinalGlanceBottomSheet.Extras.class);
        O4().q6(extras != null ? extras.d : null);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity.onCreate.3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity = FinalGlanceBottomSheetActivity.this;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(584771600, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity.onCreate.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.e;
                                composer2.o(5004770);
                                FinalGlanceBottomSheetActivity finalGlanceBottomSheetActivity2 = finalGlanceBottomSheetActivity;
                                boolean zI = composer2.I(finalGlanceBottomSheetActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new e(finalGlanceBottomSheetActivity2, 28);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(modalBottomSheetValue, (Function1) objG, composer2, 3078, 2);
                                int i = FinalGlanceBottomSheetActivity.z;
                                FinalGlanceModalBottomSheetKt.b(finalGlanceBottomSheetActivity2.O4(), modalBottomSheetStateC, composer2, 64);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1377075709));
    }
}
