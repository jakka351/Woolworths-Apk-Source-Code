package au.com.woolworths.feature.rewards.account.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.customviews.loadingdialog.FullPageLoadingDialogFragment;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsAccountDynamicBinding;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsContractOld;
import au.com.woolworths.rewards.base.DeferredIntentHelper;
import au.com.woolworths.rewards.base.RewardsAccountNavigation;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import au.com.woolworths.rewards.tooltip.Tooltip;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsFragmentOld;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsFragmentOld extends Hilt_AccountSettingsFragmentOld {
    public static final /* synthetic */ KProperty[] r = {Reflection.f24268a.e(new MutablePropertyReference1Impl(AccountSettingsFragmentOld.class, "binding", "getBinding()Lau/com/woolworths/feature/rewards/account/databinding/FragmentRewardsAccountDynamicBinding;", 0))};
    public AnalyticsManager i;
    public FeatureToggleManager j;
    public RewardsBannerInteractor k;
    public Auth0AuthManager l;
    public final ViewModelLazy m;
    public final AutoClearedValue n;
    public AccountSettingsControllerOld o;
    public final ActivityResultLauncher p;
    public final Lazy q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsFragmentOld$Companion;", "", "", "LOADING_DIALOG_TAG", "Ljava/lang/String;", "PLAY_STORE_APPLICATION_ID", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$onCreate$1", f = "AccountSettingsFragmentOld.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01301 extends AdaptedFunctionReference implements Function2<AccountSettingsContractOld.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AccountSettingsContractOld.Actions actions = (AccountSettingsContractOld.Actions) obj;
                AccountSettingsFragmentOld accountSettingsFragmentOld = (AccountSettingsFragmentOld) this.d;
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                if (accountSettingsFragmentOld.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
                    if (actions instanceof AccountSettingsContractOld.Actions.ShowPointsBalanceTooltip) {
                        new Tooltip.BalanceIndicator(null);
                        throw null;
                    }
                    if (actions instanceof AccountSettingsContractOld.Actions.OpenInAppBrowser) {
                        Context contextRequireContext = accountSettingsFragmentOld.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        ContextExtKt.j(contextRequireContext, ((AccountSettingsContractOld.Actions.OpenInAppBrowser) actions).f5759a, null, null, null, 62);
                    } else if (actions instanceof AccountSettingsContractOld.Actions.OpenUrl) {
                        Context contextRequireContext2 = accountSettingsFragmentOld.requireContext();
                        Intrinsics.g(contextRequireContext2, "requireContext(...)");
                        ContextExtKt.e(contextRequireContext2, ((AccountSettingsContractOld.Actions.OpenUrl) actions).f5762a);
                    } else if (actions instanceof AccountSettingsContractOld.Actions.OpenMagicLink) {
                        AccountSettingsContractOld.Actions.OpenMagicLink openMagicLink = (AccountSettingsContractOld.Actions.OpenMagicLink) actions;
                        accountSettingsFragmentOld.startActivity(Activities.MagicLinkActivity.b(openMagicLink.f5760a, openMagicLink.b, null));
                    } else if (actions instanceof AccountSettingsContractOld.Actions.OpenMagicLinkInChromeTab) {
                        AccountSettingsContractOld.Actions.OpenMagicLinkInChromeTab openMagicLinkInChromeTab = (AccountSettingsContractOld.Actions.OpenMagicLinkInChromeTab) actions;
                        accountSettingsFragmentOld.startActivity(Activities.MagicLinkActivity.b(openMagicLinkInChromeTab.f5761a, openMagicLinkInChromeTab.b, Activities.MagicLinkActivity.PreferredLaunchMode.e));
                    } else if (actions instanceof AccountSettingsContractOld.Actions.OpenCallbackUrl) {
                        ActivityResultLauncher activityResultLauncher = accountSettingsFragmentOld.p;
                        Activities.RewardsCallbackUrlActivity.Extras extras = ((AccountSettingsContractOld.Actions.OpenCallbackUrl) actions).f5758a;
                        Intent intentA = ActivityNavigatorKt.a(Activities.RewardsCallbackUrlActivity.f4516a, ApplicationType.d);
                        intentA.putExtra("EXTRAS", extras);
                        activityResultLauncher.a(intentA, null);
                    } else if (actions instanceof AccountSettingsContractOld.Actions.ShowChangeCountryConfirmation) {
                        accountSettingsFragmentOld.b2(R.string.change_country_dialog_title, R.string.change_country_dialog_message, R.string.change_country_dialog_confirm, true);
                    } else if (actions instanceof AccountSettingsContractOld.Actions.ShowLogoutConfirmation) {
                        accountSettingsFragmentOld.b2(R.string.rewards_logout_confirmation_title, R.string.rewards_logout_confirmation_message, R.string.rewards_account_log_out_title, false);
                    } else if (actions instanceof AccountSettingsContractOld.Actions.ShowLogoutConnectionError) {
                        ((FullPageLoadingDialogFragment) accountSettingsFragmentOld.q.getD()).dismiss();
                        Snackbar.i(accountSettingsFragmentOld.I1().z, R.string.rewards_logout_internet_error, 0).l();
                    } else if (actions instanceof AccountSettingsContractOld.Actions.CompleteLogout) {
                        accountSettingsFragmentOld.R1(((AccountSettingsContractOld.Actions.CompleteLogout) actions).f5754a);
                    } else if (actions instanceof AccountSettingsContractOld.Actions.ShowDeveloperOptions) {
                        KeyEventDispatcher.Component activity = accountSettingsFragmentOld.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.rewards.base.RewardsAccountNavigation");
                        ((RewardsAccountNavigation) activity).A3();
                    } else if (actions instanceof AccountSettingsContractOld.Actions.OpenAndroidReviewLink) {
                        Context contextRequireContext3 = accountSettingsFragmentOld.requireContext();
                        Intrinsics.g(contextRequireContext3, "requireContext(...)");
                        ContextExtKt.h(contextRequireContext3, ((AccountSettingsContractOld.Actions.OpenAndroidReviewLink) actions).f5757a);
                    } else if (Intrinsics.c(actions, AccountSettingsContractOld.Actions.ShowGenericError.f5765a)) {
                        Snackbar.i(accountSettingsFragmentOld.I1().h, R.string.generic_server_error_subtitle, 0).l();
                    } else if (Intrinsics.c(actions, AccountSettingsContractOld.Actions.LaunchAppUpdate.f5755a)) {
                        Context contextRequireContext4 = accountSettingsFragmentOld.requireContext();
                        Intrinsics.g(contextRequireContext4, "requireContext(...)");
                        ContextExtKt.g(contextRequireContext4, "com.woolworths.rewards");
                    } else {
                        if (!Intrinsics.c(actions, AccountSettingsContractOld.Actions.LaunchOsUpdate.f5756a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Context contextRequireContext5 = accountSettingsFragmentOld.requireContext();
                        Intrinsics.g(contextRequireContext5, "requireContext(...)");
                        ContextExtKt.i(contextRequireContext5);
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AccountSettingsFragmentOld.this.new AnonymousClass1(continuation);
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
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                AccountSettingsFragmentOld accountSettingsFragmentOld = AccountSettingsFragmentOld.this;
                Flow flow = accountSettingsFragmentOld.Q1().q;
                Lifecycle d = accountSettingsFragmentOld.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01301(2, accountSettingsFragmentOld, AccountSettingsFragmentOld.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;)V", 4), FlowExtKt.a(flow, d, Lifecycle.State.g));
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$onResume$1", f = "AccountSettingsFragmentOld.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$onResume$1, reason: invalid class name and case insensitive filesystem */
    final class C04681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public C04681(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AccountSettingsFragmentOld.this.new C04681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            C04681 c04681 = (C04681) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            c04681.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bundle extras;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
            AccountSettingsFragmentOld accountSettingsFragmentOld = AccountSettingsFragmentOld.this;
            Intent intent = accountSettingsFragmentOld.requireActivity().getIntent();
            Intrinsics.g(intent, "getIntent(...)");
            String stringExtra = intent.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.AUTO_OPEN_ACCOUNT_ITEM_ID");
            String str = null;
            if (stringExtra != null) {
                intent.removeExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.AUTO_OPEN_ACCOUNT_ITEM_ID");
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                accountSettingsFragmentOld.Q1().r6(stringExtra);
            }
            Intent intent2 = accountSettingsFragmentOld.requireActivity().getIntent();
            Intrinsics.g(intent2, "getIntent(...)");
            Intent intentA = DeferredIntentHelper.a(intent2);
            if (intentA != null) {
                String stringExtra2 = intentA.getStringExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.AUTO_OPEN_ACCOUNT_ITEM_ID");
                if (stringExtra2 != null) {
                    intentA.removeExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.AUTO_OPEN_ACCOUNT_ITEM_ID");
                    str = stringExtra2;
                }
                if (str != null) {
                    accountSettingsFragmentOld.Q1().r6(str);
                    Intent intent3 = accountSettingsFragmentOld.requireActivity().getIntent();
                    Intrinsics.g(intent3, "getIntent(...)");
                    if (Build.VERSION.SDK_INT < 33 && (extras = intentA.getExtras()) != null) {
                        Set<String> setKeySet = extras.keySet();
                        if (setKeySet != null) {
                            Iterator<T> it = setKeySet.iterator();
                            while (it.hasNext()) {
                                intentA.removeExtra((String) it.next());
                            }
                        }
                        intent3.putExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.DEFERRED_BUNDLE", extras);
                    }
                    intent3.putExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.DEFERRED_INTENT", intentA);
                }
            }
            return Unit.f24250a;
        }
    }

    public AccountSettingsFragmentOld() {
        final AccountSettingsFragmentOld$special$$inlined$viewModels$default$1 accountSettingsFragmentOld$special$$inlined$viewModels$default$1 = new AccountSettingsFragmentOld$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) accountSettingsFragmentOld$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.m = new ViewModelLazy(Reflection.f24268a.b(AccountSettingsViewModelOld.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.n = new AutoClearedValue(this);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 4));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.p = activityResultLauncherRegisterForActivityResult;
        this.q = LazyKt.b(new h(27));
    }

    public final FragmentRewardsAccountDynamicBinding I1() {
        return (FragmentRewardsAccountDynamicBinding) this.n.getValue(this, r[0]);
    }

    public final AccountSettingsViewModelOld Q1() {
        return (AccountSettingsViewModelOld) this.m.getD();
    }

    public final void R1(boolean z) {
        Q1().l.b();
        Lazy lazy = this.q;
        if (((FullPageLoadingDialogFragment) lazy.getD()).isAdded()) {
            ((FullPageLoadingDialogFragment) lazy.getD()).dismiss();
        }
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.rewards.base.RewardsAccountNavigation");
        ((RewardsAccountNavigation) activity).R1(z);
    }

    public final void b2(int i, int i2, int i3, final boolean z) {
        new AlertDialog.Builder(requireContext()).setTitle(i).setMessage(i2).setPositiveButton(i3, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.rewards.account.settings.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                AccountSettingsFragmentOld accountSettingsFragmentOld = this.d;
                ((FullPageLoadingDialogFragment) accountSettingsFragmentOld.q.getD()).show(accountSettingsFragmentOld.getParentFragmentManager(), "full_page_loading_view");
                FeatureToggleManager featureToggleManager = accountSettingsFragmentOld.j;
                if (featureToggleManager == null) {
                    Intrinsics.p("featureToggleManager");
                    throw null;
                }
                boolean zC = featureToggleManager.c(BaseFeature.j);
                boolean z2 = z;
                if (zC) {
                    BuildersKt.c(LifecycleOwnerKt.a(accountSettingsFragmentOld), null, null, new AccountSettingsFragmentOld$logoutUser$1(accountSettingsFragmentOld, z2, null), 3);
                } else {
                    AccountSettingsViewModelOld accountSettingsViewModelOldQ1 = accountSettingsFragmentOld.Q1();
                    BuildersKt.c(ViewModelKt.a(accountSettingsViewModelOldQ1), null, null, new AccountSettingsViewModelOld$onLogoutConfirmed$1(accountSettingsViewModelOldQ1, z2, null), 3);
                }
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        AccountSettingsViewModelOld accountSettingsViewModelOldQ1 = Q1();
        AnalyticsManager analyticsManager = this.i;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        FeatureToggleManager featureToggleManager = this.j;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        RewardsBannerInteractor rewardsBannerInteractor = this.k;
        if (rewardsBannerInteractor != null) {
            this.o = new AccountSettingsControllerOld(accountSettingsViewModelOldQ1, analyticsManager, featureToggleManager, rewardsBannerInteractor);
        } else {
            Intrinsics.p("rewardsBannerInteractor");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentRewardsAccountDynamicBinding.E;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        final FragmentRewardsAccountDynamicBinding fragmentRewardsAccountDynamicBinding = (FragmentRewardsAccountDynamicBinding) ViewDataBinding.q(inflater, R.layout.fragment_rewards_account_dynamic, viewGroup, false, null);
        Intrinsics.g(fragmentRewardsAccountDynamicBinding, "inflate(...)");
        fragmentRewardsAccountDynamicBinding.D(getViewLifecycleOwner());
        fragmentRewardsAccountDynamicBinding.L(Q1());
        Toolbar toolbar = fragmentRewardsAccountDynamicBinding.B;
        Intrinsics.g(toolbar, "toolbar");
        TypedValue typedValue = new TypedValue();
        toolbar.getContext().getTheme().resolveAttribute(android.R.attr.homeAsUpIndicator, typedValue, true);
        toolbar.setNavigationIcon(typedValue.resourceId);
        toolbar.setNavigationContentDescription(R.string.abc_action_bar_up_description);
        toolbar.setNavigationOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 2));
        SwipeRefreshLayout swipeRefreshLayout = fragmentRewardsAccountDynamicBinding.A;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        swipeRefreshLayout.setColorSchemeColors(Extensions.a(R.attr.colorPrimary, contextRequireContext));
        EpoxyRecyclerView recyclerView = fragmentRewardsAccountDynamicBinding.z;
        Intrinsics.g(recyclerView, "recyclerView");
        ViewExtKt.a(recyclerView);
        AccountSettingsControllerOld accountSettingsControllerOld = this.o;
        if (accountSettingsControllerOld == null) {
            Intrinsics.p("controller");
            throw null;
        }
        recyclerView.setController(accountSettingsControllerOld);
        Context contextRequireContext2 = requireContext();
        Intrinsics.g(contextRequireContext2, "requireContext(...)");
        AccountSettingsItemDecoratorOld accountSettingsItemDecoratorOld = new AccountSettingsItemDecoratorOld(contextRequireContext2);
        Drawable drawable = requireContext().getDrawable(R.drawable.account_settings_divider);
        Intrinsics.e(drawable);
        accountSettingsItemDecoratorOld.f3664a = drawable;
        accountSettingsItemDecoratorOld.f = drawable;
        recyclerView.i(accountSettingsItemDecoratorOld);
        AccountSettingsControllerOld accountSettingsControllerOld2 = this.o;
        if (accountSettingsControllerOld2 == null) {
            Intrinsics.p("controller");
            throw null;
        }
        accountSettingsControllerOld2.getAdapter().D(new RecyclerView.AdapterDataObserver() { // from class: au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld$onCreateView$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void d(int i2, int i3) {
                if (i2 == 0) {
                    fragmentRewardsAccountDynamicBinding.z.o0(0);
                }
            }
        });
        this.n.b(this, r[0], fragmentRewardsAccountDynamicBinding);
        Q1().p.f(getViewLifecycleOwner(), new AccountSettingsFragmentOld$sam$androidx_lifecycle_Observer$0(new androidx.navigation.fragment.e(this, 24)));
        View view = I1().h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q1().h.a(Screens.D);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.a(viewLifecycleOwner).c(new C04681(null));
        FeatureToggleManager featureToggleManager = this.j;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(RewardsBaseFeature.o)) {
            AccountSettingsViewModelOld accountSettingsViewModelOldQ1 = Q1();
            BuildersKt.c(ViewModelKt.a(accountSettingsViewModelOldQ1), null, null, new AccountSettingsViewModelOld$markSoftUpgradeAlertBannerAsSeen$1(accountSettingsViewModelOldQ1, null), 3);
        }
    }
}
