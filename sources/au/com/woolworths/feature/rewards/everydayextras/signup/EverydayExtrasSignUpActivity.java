package au.com.woolworths.feature.rewards.everydayextras.signup;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryFragment;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.SignUpQueryParams;
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
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/base/wallet/ocr/CameraPermissionRationaleDialogHandler;", "<init>", "()V", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EverydayExtrasSignUpActivity extends Hilt_EverydayExtrasSignUpActivity implements CameraPermissionRationaleDialogHandler {
    public static final /* synthetic */ int z = 0;
    public FeatureToggleManager x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(EverydayExtrasSignUpViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpActivity$Companion;", "", "", "EXTRA_ONBOARDING_ITEM", "Ljava/lang/String;", "Extras", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpActivity$Companion$Extras;", "Landroid/os/Parcelable;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final EverydayExtrasOnBoarding d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(EverydayExtrasOnBoarding.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(EverydayExtrasOnBoarding onBoardingItem) {
                Intrinsics.h(onBoardingItem, "onBoardingItem");
                this.d = onBoardingItem;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "Extras(onBoardingItem=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                this.d.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity$onCreate$1", f = "EverydayExtrasSignUpActivity.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01351 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ EverydayExtrasSignUpActivity d;

            public C01351(EverydayExtrasSignUpActivity everydayExtrasSignUpActivity) {
                this.d = everydayExtrasSignUpActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, EverydayExtrasSignUpActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                int i = EverydayExtrasSignUpActivity.z;
                this.d.O4((EverydayExtrasSignUpContract.Action) obj);
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
            return EverydayExtrasSignUpActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = EverydayExtrasSignUpActivity.z;
                EverydayExtrasSignUpActivity everydayExtrasSignUpActivity = EverydayExtrasSignUpActivity.this;
                Flow flowA = FlowExtKt.a(((EverydayExtrasSignUpViewModel) everydayExtrasSignUpActivity.y.getD()).h, everydayExtrasSignUpActivity.getD(), Lifecycle.State.g);
                C01351 c01351 = new C01351(everydayExtrasSignUpActivity);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(c01351, this) == coroutineSingletons) {
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

    public final void O4(EverydayExtrasSignUpContract.Action action) {
        if (Intrinsics.c(action, EverydayExtrasSignUpContract.Action.NavigateToLanding.f5929a)) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.g(com.woolworths.R.id.fragment_container_view, new EverydayExtraLandingFragment(), null, 1);
            fragmentTransactionE.d();
            return;
        }
        if (Intrinsics.c(action, EverydayExtrasSignUpContract.Action.NavigateToChoosePlan.f5927a)) {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager2, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE2 = supportFragmentManager2.e();
            EverydayExtraChoosePlanFragment everydayExtraChoosePlanFragment = new EverydayExtraChoosePlanFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KeyIsShowNavigationCloseButton", true);
            everydayExtraChoosePlanFragment.setArguments(bundle);
            fragmentTransactionE2.j(com.woolworths.R.id.fragment_container_view, everydayExtraChoosePlanFragment, null);
            fragmentTransactionE2.c(null);
            fragmentTransactionE2.d();
            return;
        }
        if (Intrinsics.c(action, EverydayExtrasSignUpContract.Action.NavigateToChoosePlanAsInitialScreen.f5928a)) {
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager3, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE3 = supportFragmentManager3.e();
            EverydayExtraChoosePlanFragment everydayExtraChoosePlanFragment2 = new EverydayExtraChoosePlanFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("KeyIsShowNavigationCloseButton", false);
            everydayExtraChoosePlanFragment2.setArguments(bundle2);
            fragmentTransactionE3.g(com.woolworths.R.id.fragment_container_view, everydayExtraChoosePlanFragment2, null, 1);
            fragmentTransactionE3.d();
            return;
        }
        if (action instanceof EverydayExtrasSignUpContract.Action.NavigateToSummary) {
            String str = ((EverydayExtrasSignUpContract.Action.NavigateToSummary) action).f5931a;
            FragmentManager supportFragmentManager4 = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager4, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE4 = supportFragmentManager4.e();
            EverydayExtraSummaryFragment everydayExtraSummaryFragment = new EverydayExtraSummaryFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putString("KEY_PLAN_IDENTIFIER", str);
            everydayExtraSummaryFragment.setArguments(bundle3);
            fragmentTransactionE4.j(com.woolworths.R.id.fragment_container_view, everydayExtraSummaryFragment, "EverydayExtraSummaryFragment");
            fragmentTransactionE4.c(null);
            fragmentTransactionE4.d();
            return;
        }
        if (action instanceof EverydayExtrasSignUpContract.Action.NavigateToOnBoarding) {
            EverydayExtrasOnBoarding everydayExtrasOnBoarding = ((EverydayExtrasSignUpContract.Action.NavigateToOnBoarding) action).f5930a;
            getSupportFragmentManager().Z(null);
            FragmentManager supportFragmentManager5 = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager5, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE5 = supportFragmentManager5.e();
            EverydayExtraOnboardingFragment everydayExtraOnboardingFragment = new EverydayExtraOnboardingFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("KEY_ON_BOARDING_ITEM", everydayExtrasOnBoarding);
            everydayExtraOnboardingFragment.setArguments(bundle4);
            fragmentTransactionE5.j(com.woolworths.R.id.fragment_container_view, everydayExtraOnboardingFragment, "EverydayExtraOnboardingFragment");
            fragmentTransactionE5.d();
            return;
        }
        if (action instanceof EverydayExtrasSignUpContract.Action.OpenUrl) {
            ContextExtKt.e(this, ((EverydayExtrasSignUpContract.Action.OpenUrl) action).f5932a);
            return;
        }
        if (Intrinsics.c(action, EverydayExtrasSignUpContract.Action.PerformSignUpBackAction.f5933a)) {
            if (getSupportFragmentManager().J() == 0) {
                finish();
                return;
            } else {
                getSupportFragmentManager().X();
                return;
            }
        }
        if (!Intrinsics.c(action, EverydayExtrasSignUpContract.Action.PerformSignUpCloseAction.f5934a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (isTaskRoot()) {
            startActivity(ActivityNavigatorKt.a(Activities.RewardsHomepageLegacy.f4518a, ApplicationType.d));
        }
        finish();
    }

    public final void P4(Intent intent, Bundle bundle) {
        EverydayExtrasSignUpContract.Action navigateToOnBoarding;
        Activities.EverydayExtraNativeSignUpActivity.InitialInfo initialInfo = (Activities.EverydayExtraNativeSignUpActivity.InitialInfo) intent.getParcelableExtra("EXTRA_INITIAL_INFO");
        EverydayExtrasOnBoarding everydayExtrasOnBoarding = (EverydayExtrasOnBoarding) intent.getParcelableExtra("onboardingItem");
        EverydayExtrasSignUpViewModel everydayExtrasSignUpViewModel = (EverydayExtrasSignUpViewModel) this.y.getD();
        SignUpQueryParamsManager signUpQueryParamsManager = everydayExtrasSignUpViewModel.f;
        String str = initialInfo != null ? initialInfo.h : null;
        SignUpQueryParams signUpQueryParams = signUpQueryParamsManager.b;
        if (str == null) {
            str = signUpQueryParams.f6144a;
        }
        signUpQueryParamsManager.b = new SignUpQueryParams(str);
        BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$requestInitialAction$1(everydayExtrasSignUpViewModel, null), 3);
        Activities.EverydayExtraNativeSignUpActivity.InitialScreen initialScreen = initialInfo != null ? initialInfo.g : null;
        int i = initialScreen == null ? -1 : EverydayExtrasSignUpViewModel.WhenMappings.f5942a[initialScreen.ordinal()];
        if (i != 1) {
            navigateToOnBoarding = EverydayExtrasSignUpContract.Action.NavigateToLanding.f5929a;
            if (i == 2 && everydayExtrasOnBoarding != null) {
                navigateToOnBoarding = new EverydayExtrasSignUpContract.Action.NavigateToOnBoarding(everydayExtrasOnBoarding);
            }
        } else {
            navigateToOnBoarding = EverydayExtrasSignUpContract.Action.NavigateToChoosePlanAsInitialScreen.f5928a;
        }
        setContentView(com.woolworths.R.layout.activity_everyday_extras_signup);
        if (bundle == null) {
            O4(navigateToOnBoarding);
        }
    }

    @Override // au.com.woolworths.feature.rewards.everydayextras.signup.Hilt_EverydayExtrasSignUpActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        P4(intent, bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.core.app.ComponentActivity, au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void onDismiss() {
        Fragment fragmentG = getSupportFragmentManager().G("EverydayExtraSummaryFragment");
        EverydayExtraSummaryFragment everydayExtraSummaryFragment = fragmentG instanceof EverydayExtraSummaryFragment ? (EverydayExtraSummaryFragment) fragmentG : null;
        if (everydayExtraSummaryFragment != null) {
            everydayExtraSummaryFragment.onDismiss();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        P4(intent, null);
    }

    @Override // androidx.core.app.ComponentActivity, au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void s4() {
        Fragment fragmentG = getSupportFragmentManager().G("EverydayExtraSummaryFragment");
        EverydayExtraSummaryFragment everydayExtraSummaryFragment = fragmentG instanceof EverydayExtraSummaryFragment ? (EverydayExtraSummaryFragment) fragmentG : null;
        if (everydayExtraSummaryFragment != null) {
            everydayExtraSummaryFragment.s4();
        }
    }

    @Override // androidx.core.app.ComponentActivity, au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void w0() {
        Fragment fragmentG = getSupportFragmentManager().G("EverydayExtraSummaryFragment");
        EverydayExtraSummaryFragment everydayExtraSummaryFragment = fragmentG instanceof EverydayExtraSummaryFragment ? (EverydayExtraSummaryFragment) fragmentG : null;
        if (everydayExtraSummaryFragment != null) {
            everydayExtraSummaryFragment.w0();
        }
    }

    @Override // au.com.woolworths.base.wallet.ocr.CameraPermissionRationaleDialogHandler
    public final void x4() {
        Fragment fragmentG = getSupportFragmentManager().G("EverydayExtraSummaryFragment");
        EverydayExtraSummaryFragment everydayExtraSummaryFragment = fragmentG instanceof EverydayExtraSummaryFragment ? (EverydayExtraSummaryFragment) fragmentG : null;
        if (everydayExtraSummaryFragment != null) {
            everydayExtraSummaryFragment.x4();
        }
    }
}
