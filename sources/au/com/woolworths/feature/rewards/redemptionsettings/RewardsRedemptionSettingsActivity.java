package au.com.woolworths.feature.rewards.redemptionsettings;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.ActivityRewardsRedemptionSettingsBinding;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsActivity extends Hilt_RewardsRedemptionSettingsActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(RewardsRedemptionSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsActivity$Companion;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsActivity$onCreate$2", f = "RewardsRedemptionSettingsActivity.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ RewardsRedemptionSettingsActivity d;

            public AnonymousClass1(RewardsRedemptionSettingsActivity rewardsRedemptionSettingsActivity) {
                this.d = rewardsRedemptionSettingsActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, RewardsRedemptionSettingsActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                int i = RewardsRedemptionSettingsActivity.y;
                if (((RewardsRedemptionSettingsContract.Actions) obj) instanceof RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings) {
                    this.d.finish();
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
            return RewardsRedemptionSettingsActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                RewardsRedemptionSettingsActivity rewardsRedemptionSettingsActivity = RewardsRedemptionSettingsActivity.this;
                SharedFlow sharedFlow = ((RewardsRedemptionSettingsViewModel) rewardsRedemptionSettingsActivity.x.getD()).k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(rewardsRedemptionSettingsActivity);
                this.p = 1;
                if (sharedFlow.collect(anonymousClass1, this) == coroutineSingletons) {
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

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.Hilt_RewardsRedemptionSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityRewardsRedemptionSettingsBinding activityRewardsRedemptionSettingsBinding = (ActivityRewardsRedemptionSettingsBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_rewards_redemption_settings);
        if (activityRewardsRedemptionSettingsBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityRewardsRedemptionSettingsBinding.z);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.g(com.woolworths.R.id.container, new RewardsRedemptionSettingsFragment(), null, 1);
            fragmentTransactionE.d();
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
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
