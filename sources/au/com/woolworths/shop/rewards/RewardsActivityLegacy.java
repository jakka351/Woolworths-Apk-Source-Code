package au.com.woolworths.shop.rewards;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
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
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsActivity;
import au.com.woolworths.shop.rewards.RewardsContractLegacy;
import au.com.woolworths.shop.rewards.databinding.ActivityRewardsBinding;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/rewards/RewardsActivityLegacy;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsActivityLegacy extends Hilt_RewardsActivityLegacy {
    public static final /* synthetic */ int z = 0;
    public RewardsAccountInteractor x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(RewardsViewModelLegacy.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.rewards.RewardsActivityLegacy$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.rewards.RewardsActivityLegacy$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.rewards.RewardsActivityLegacy$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.rewards.RewardsActivityLegacy$onCreate$2", f = "RewardsActivityLegacy.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.rewards.RewardsActivityLegacy$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.rewards.RewardsActivityLegacy$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<RewardsContractLegacy.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                RewardsActivityLegacy rewardsActivityLegacy = (RewardsActivityLegacy) this.d;
                int i = RewardsActivityLegacy.z;
                rewardsActivityLegacy.getClass();
                if (!Intrinsics.c((RewardsContractLegacy.Actions) obj, RewardsContractLegacy.Actions.ShowBoosters.f12887a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (rewardsActivityLegacy.getSupportFragmentManager().G("RewardsBoostersFragment") == null) {
                    FragmentManager supportFragmentManager = rewardsActivityLegacy.getSupportFragmentManager();
                    Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                    FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
                    RewardsBoostersFragmentLegacy.n.getClass();
                    RewardsBoostersFragmentLegacy rewardsBoostersFragmentLegacy = new RewardsBoostersFragmentLegacy();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("no_top_padding", true);
                    rewardsBoostersFragmentLegacy.setArguments(bundle);
                    fragmentTransactionE.j(com.woolworths.R.id.fragment_container, rewardsBoostersFragmentLegacy, "RewardsBoostersFragment");
                    fragmentTransactionE.f();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsActivityLegacy.this.new AnonymousClass2(continuation);
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
                int i2 = RewardsActivityLegacy.z;
                RewardsActivityLegacy rewardsActivityLegacy = RewardsActivityLegacy.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, rewardsActivityLegacy, RewardsActivityLegacy.class, "handleAction", "handleAction(Lau/com/woolworths/shop/rewards/RewardsContractLegacy$Actions;)V", 4), FlowExtKt.a(((RewardsViewModelLegacy) rewardsActivityLegacy.y.getD()).i, rewardsActivityLegacy.getD(), Lifecycle.State.g));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        RewardsAccountInteractor rewardsAccountInteractor = this.x;
        if (rewardsAccountInteractor != null) {
            rewardsAccountInteractor.setShouldIncludeUncachedVisitorIdInAnalytics(false);
        } else {
            Intrinsics.p("rewardsAccountInteractor");
            throw null;
        }
    }

    @Override // au.com.woolworths.shop.rewards.Hilt_RewardsActivityLegacy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityRewardsBinding activityRewardsBinding = (ActivityRewardsBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_rewards);
        activityRewardsBinding.D(this);
        activityRewardsBinding.L((RewardsViewModelLegacy) this.y.getD());
        setSupportActionBar(activityRewardsBinding.y);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(com.woolworths.R.menu.menu_rewards, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 16908332) {
                onBackPressed();
            } else if (itemId == com.woolworths.R.id.settings) {
                startActivity(new Intent(this, (Class<?>) RewardsSettingsActivity.class));
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        RewardsAccountInteractor rewardsAccountInteractor = this.x;
        if (rewardsAccountInteractor == null) {
            Intrinsics.p("rewardsAccountInteractor");
            throw null;
        }
        rewardsAccountInteractor.setShouldIncludeUncachedVisitorIdInAnalytics(true);
        RewardsViewModelLegacy rewardsViewModelLegacy = (RewardsViewModelLegacy) this.y.getD();
        if (rewardsViewModelLegacy.j) {
            return;
        }
        rewardsViewModelLegacy.j = true;
        if (rewardsViewModelLegacy.e.getUncachedVisitorId() != null) {
            rewardsViewModelLegacy.g.f(RewardsContractLegacy.Actions.ShowBoosters.f12887a);
        } else {
            rewardsViewModelLegacy.f.m(new RewardsContractLegacy.ViewState(true));
            BuildersKt.c(ViewModelKt.a(rewardsViewModelLegacy), null, null, new RewardsViewModelLegacy$fetchVisitorIdAndShowBoostersIfNeeded$1(rewardsViewModelLegacy, null), 3);
        }
    }
}
