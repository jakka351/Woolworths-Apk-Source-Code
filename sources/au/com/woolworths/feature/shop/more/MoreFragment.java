package au.com.woolworths.feature.shop.more;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.URLUtil;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.q;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.databinding.FragmentMoreBinding;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.shop.auth.ShopAuthManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import okhttp3.OkHttpClient;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreFragment extends Hilt_MoreFragment {
    public ShopAppNavigator i;
    public FeatureToggleManager j;
    public OkHttpClient k;
    public ShopAuthManager l;
    public ShopAppFlavorInteractor m;
    public final ViewModelLazy n;
    public final ViewModelLazy o;
    public MoreEpoxyController p;
    public FragmentMoreBinding q;
    public Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint r;
    public boolean s;
    public Job t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreFragment$Companion;", "", "", "PLAY_STORE_APPLICATION_ID", "Ljava/lang/String;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreFragment$onCreate$1", f = "MoreFragment.kt", l = {114}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.more.MoreFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.more.MoreFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01951 extends AdaptedFunctionReference implements Function2<MoreContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MoreContract.Actions actions = (MoreContract.Actions) obj;
                final MoreFragment moreFragment = (MoreFragment) this.d;
                moreFragment.getClass();
                if (Intrinsics.c(actions, MoreContract.Actions.LaunchLogin.f7565a)) {
                    moreFragment.startActivityForResult(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), com.salesforce.marketingcloud.analytics.b.s);
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchSignUp.f7572a)) {
                    if (moreFragment.i == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    moreFragment.startActivityForResult(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), 7777);
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchStoreLocator.f7574a)) {
                    FeatureToggleManager featureToggleManager = moreFragment.j;
                    if (featureToggleManager == null) {
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    }
                    if (featureToggleManager.c(BaseShopAppFeature.b0)) {
                        if (moreFragment.i == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity = moreFragment.requireActivity();
                        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                        ShopAppNavigator.e(fragmentActivityRequireActivity, new Activities.StoreLocator.ExtraStoreLocatorData(com.woolworths.R.string.more_stores, 31673, true, false, true, Activities.StoreLocator.StoreLocatorEntryPoint.e), 31673);
                    } else {
                        if (moreFragment.i == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity2 = moreFragment.requireActivity();
                        Intrinsics.g(fragmentActivityRequireActivity2, "requireActivity(...)");
                        ShopAppNavigator.b(fragmentActivityRequireActivity2, new Activities.StoreLocatorLegacy.ExtraStoreLocatorData(com.woolworths.R.string.more_stores, 31673, true, false, true, Activities.StoreLocatorLegacy.StoreLocatorEntryPoint.e), 31673);
                    }
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchShowBarcode.f7571a)) {
                    moreFragment.requireActivity().startActivity(ActivityNavigatorKt.a(Activities.RewardsCardOverlay.f4517a, ApplicationType.e));
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchRewards.f7570a)) {
                    FeatureToggleManager featureToggleManager2 = moreFragment.j;
                    if (featureToggleManager2 == null) {
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    }
                    if (featureToggleManager2.c(BaseShopAppFeature.Q)) {
                        Intent intentA = ActivityNavigatorKt.a(Activities.ShopRewardsActivity.f4534a, ApplicationType.e);
                        intentA.putExtra("EXTRA_OFFER_INFO", new Activities.ShopRewardsActivity.Extras(null));
                        moreFragment.startActivity(intentA);
                    } else {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.RewardsActivityLegacy.f4514a, ApplicationType.e));
                    }
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchMyOrders.f7567a)) {
                    moreFragment.startActivity(ActivityNavigatorKt.a(Activities.MyOrders.f4491a, ApplicationType.e));
                } else if (Intrinsics.c(actions, MoreContract.Actions.ShowLogoutConfirmation.f7579a)) {
                    final int i = 1;
                    new AlertDialog.Builder(moreFragment.requireContext()).setTitle(com.woolworths.R.string.logout_dialog_title).setMessage(com.woolworths.R.string.logout_dialog_message).setNegativeButton(com.woolworths.R.string.logout_dialog_negative, new q(5)).setPositiveButton(com.woolworths.R.string.logout_dialog_positive, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.more.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            switch (i) {
                                case 0:
                                    MoreViewModel moreViewModelQ1 = moreFragment.Q1();
                                    LegacyShopAnalyticsManager legacyShopAnalyticsManager = moreViewModelQ1.g;
                                    ActionData actionDataA = ActionData.Companion.a("Click on Remove Rewards Card");
                                    actionDataA.b(moreViewModelQ1.y);
                                    actionDataA.c = "1";
                                    legacyShopAnalyticsManager.d(actionDataA);
                                    moreViewModelQ1.r6(Boolean.TRUE);
                                    new CompletableFromSingle(moreViewModelQ1.e.unlinkRewardsCardOld().f(moreViewModelQ1.h.b())).a(new CallbackCompletableObserver(new j(0, new MoreViewModel$onRemoveRewardsCardConfirmed$2(1, moreViewModelQ1, MoreViewModel.class, "onUnlinkRewardsError", "onUnlinkRewardsError(Ljava/lang/Throwable;)V", 0)), new i(moreViewModelQ1, 0)));
                                    break;
                                default:
                                    MoreFragment moreFragment2 = moreFragment;
                                    moreFragment2.getClass();
                                    BuildersKt.c(LifecycleOwnerKt.a(moreFragment2), null, null, new MoreFragment$logoutUser$1(moreFragment2, null), 3);
                                    break;
                            }
                        }
                    }).show();
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchHomepage.f7563a)) {
                    FragmentActivity fragmentActivityRequireActivity3 = moreFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity3, "requireActivity(...)");
                    Activities.MainActivity.f4487a.d(fragmentActivityRequireActivity3, Activities.MainActivity.Tab.d);
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchChangeCountry.f7556a)) {
                    moreFragment.startActivity(Activities.CountrySelector.f4463a.b(Activities.CountrySelector.Source.e));
                } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchDevelopersOption.f7561a)) {
                    ShopAppFlavorInteractor shopAppFlavorInteractor = moreFragment.m;
                    if (shopAppFlavorInteractor == null) {
                        Intrinsics.p("shopAppFlavorInteractor");
                        throw null;
                    }
                    shopAppFlavorInteractor.a();
                    Region.Companion companion = Region.h;
                    moreFragment.startActivity(new Intent("au.com.woolworths.DEBUG_MENU"));
                } else {
                    final int i2 = 0;
                    if (Intrinsics.c(actions, MoreContract.Actions.UnlinkRewardsConfirmation.f7580a)) {
                        new AlertDialog.Builder(moreFragment.requireActivity()).setTitle(com.woolworths.R.string.remove_rewards_title).setMessage(com.woolworths.R.string.remove_rewards_message).setNegativeButton(com.woolworths.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(com.woolworths.R.string.remove, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.shop.more.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i22) {
                                switch (i2) {
                                    case 0:
                                        MoreViewModel moreViewModelQ1 = moreFragment.Q1();
                                        LegacyShopAnalyticsManager legacyShopAnalyticsManager = moreViewModelQ1.g;
                                        ActionData actionDataA = ActionData.Companion.a("Click on Remove Rewards Card");
                                        actionDataA.b(moreViewModelQ1.y);
                                        actionDataA.c = "1";
                                        legacyShopAnalyticsManager.d(actionDataA);
                                        moreViewModelQ1.r6(Boolean.TRUE);
                                        new CompletableFromSingle(moreViewModelQ1.e.unlinkRewardsCardOld().f(moreViewModelQ1.h.b())).a(new CallbackCompletableObserver(new j(0, new MoreViewModel$onRemoveRewardsCardConfirmed$2(1, moreViewModelQ1, MoreViewModel.class, "onUnlinkRewardsError", "onUnlinkRewardsError(Ljava/lang/Throwable;)V", 0)), new i(moreViewModelQ1, 0)));
                                        break;
                                    default:
                                        MoreFragment moreFragment2 = moreFragment;
                                        moreFragment2.getClass();
                                        BuildersKt.c(LifecycleOwnerKt.a(moreFragment2), null, null, new MoreFragment$logoutUser$1(moreFragment2, null), 3);
                                        break;
                                }
                            }
                        }).show();
                    } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchDeliveryUnlimitedSignUp.f7560a)) {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.DeliveryUnlimitedSignUpLanding.f4468a, ApplicationType.e));
                    } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchInstoreWifi.f7564a)) {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.InstoreWifiActivity.f4482a, ApplicationType.e));
                    } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchEReceipts.f7562a)) {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.ShopReceiptListActivity.f4533a, ApplicationType.e));
                    } else if (actions instanceof MoreContract.Actions.LaunchChatToUs) {
                        MoreContract.Actions.LaunchChatToUs launchChatToUs = (MoreContract.Actions.LaunchChatToUs) actions;
                        moreFragment.startActivity(Activities.AskOliveActivity.b(4, launchChatToUs.f7557a, launchChatToUs.b, null));
                    } else if (actions instanceof MoreContract.Actions.LaunchNotifications) {
                        moreFragment.startActivity(Activities.PreferencesDetails.f4501a.b());
                    } else if (actions instanceof MoreContract.Actions.LaunchWebView) {
                        MoreContract.Actions.LaunchWebView launchWebView = (MoreContract.Actions.LaunchWebView) actions;
                        String str = launchWebView.f7575a;
                        String string = moreFragment.getString(launchWebView.b);
                        Intrinsics.g(string, "getString(...)");
                        String str2 = launchWebView.c;
                        Intent intentB = Activities.WebViewActivity.f4554a.b(new Activities.WebViewActivity.Extras(56, str, string, str2));
                        moreFragment.Q1().v6(str2);
                        moreFragment.startActivity(intentB);
                    } else if (actions instanceof MoreContract.Actions.LaunchBrowser) {
                        MoreContract.Actions.LaunchBrowser launchBrowser = (MoreContract.Actions.LaunchBrowser) actions;
                        String str3 = launchBrowser.b;
                        MoreViewModel moreViewModelQ1 = moreFragment.Q1();
                        moreViewModelQ1.v6(str3);
                        moreViewModelQ1.g.c(str3);
                        FragmentActivity fragmentActivityRequireActivity4 = moreFragment.requireActivity();
                        Intrinsics.g(fragmentActivityRequireActivity4, "requireActivity(...)");
                        ContextExtKt.e(fragmentActivityRequireActivity4, launchBrowser.f7555a);
                    } else if (actions instanceof MoreContract.Actions.LinkRewards) {
                        Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint = ((MoreContract.Actions.LinkRewards) actions).f7576a;
                        FeatureToggleManager featureToggleManager3 = moreFragment.j;
                        if (featureToggleManager3 == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        moreFragment.startActivityForResult(Activities.RewardsSetupMoreActivity.f4522a.b(rewardsSetupEntryPoint, featureToggleManager3.c(BaseShopAppFeature.R)), 10006);
                    } else if (actions instanceof MoreContract.Actions.RewardsUnlinkMessage) {
                        Snackbar.i(moreFragment.I1().h, ((MoreContract.Actions.RewardsUnlinkMessage) actions).f7578a, 0).l();
                    } else if (actions instanceof MoreContract.Actions.LaunchSngWithNewOnboarding) {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.ScanAndGoEntryActivity.f4525a, ApplicationType.e));
                    } else if (actions instanceof MoreContract.Actions.OpenLink) {
                        MoreContract.Actions.OpenLink openLink = (MoreContract.Actions.OpenLink) actions;
                        String str4 = openLink.f7577a;
                        ArrayList<? extends Parcelable> arrayList = openLink.b;
                        if (URLUtil.isValidUrl(str4)) {
                            Context contextRequireContext = moreFragment.requireContext();
                            Intrinsics.g(contextRequireContext, "requireContext(...)");
                            ContextExtKt.j(contextRequireContext, str4, null, null, null, 62);
                        } else {
                            Intent intentB2 = Activities.WebLinkActivity.f4553a.b(str4);
                            if (arrayList != null) {
                                intentB2.putParcelableArrayListExtra("additionalCookies", arrayList);
                            }
                            moreFragment.startActivity(intentB2);
                        }
                    } else if (actions instanceof MoreContract.Actions.ShowSnackbarMessage) {
                        Snackbar.i(moreFragment.I1().h, com.woolworths.R.string.more_deliviery_unlimited_unavailable, 0).l();
                    } else if (actions instanceof MoreContract.Actions.LaunchDeepLink) {
                        moreFragment.startActivity(ShopAppDeepLink.a(Screens.l, ((MoreContract.Actions.LaunchDeepLink) actions).f7558a));
                    } else if (actions instanceof MoreContract.Actions.LaunchDeleteAccount) {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.DeleteAccountActivity.f4465a, ApplicationType.e));
                    } else if (actions instanceof MoreContract.Actions.LaunchMyAccount) {
                        moreFragment.startActivity(ActivityNavigatorKt.a(Activities.AccountDetailsActivity.f4445a, ApplicationType.e));
                    } else if (Intrinsics.c(actions, MoreContract.Actions.LaunchAppUpdate.f7554a)) {
                        Context contextRequireContext2 = moreFragment.requireContext();
                        Intrinsics.g(contextRequireContext2, "requireContext(...)");
                        ContextExtKt.g(contextRequireContext2, "com.woolworths");
                    } else {
                        if (!Intrinsics.c(actions, MoreContract.Actions.LaunchOsUpdate.f7569a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Context contextRequireContext3 = moreFragment.requireContext();
                        Intrinsics.g(contextRequireContext3, "requireContext(...)");
                        ContextExtKt.i(contextRequireContext3);
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
            return MoreFragment.this.new AnonymousClass1(continuation);
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
                MoreFragment moreFragment = MoreFragment.this;
                Flow flow = moreFragment.Q1().w;
                Lifecycle d = moreFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01951(2, moreFragment, MoreFragment.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/more/MoreContract$Actions;)V", 4), FlowExtKt.a(flow, d, Lifecycle.State.g));
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

    public MoreFragment() {
        final MoreFragment$special$$inlined$viewModels$default$1 moreFragment$special$$inlined$viewModels$default$1 = new MoreFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        final Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) moreFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.n = new ViewModelLazy(reflectionFactory.b(MoreViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$4
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
        final MoreFragment$special$$inlined$viewModels$default$6 moreFragment$special$$inlined$viewModels$default$6 = new MoreFragment$special$$inlined$viewModels$default$6(this);
        final Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) moreFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.o = new ViewModelLazy(reflectionFactory.b(ContentPageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA2.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
    }

    public final FragmentMoreBinding I1() {
        FragmentMoreBinding fragmentMoreBinding = this.q;
        if (fragmentMoreBinding != null) {
            return fragmentMoreBinding;
        }
        Intrinsics.p("binding");
        throw null;
    }

    public final MoreViewModel Q1() {
        return (MoreViewModel) this.n.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint extraSetupEntryPoint;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 7777 || i == 8888) {
                Q1().r6(Boolean.FALSE);
                return;
            }
            if (i != 10006 || intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            if (!extras.containsKey("EXTRA_SOURCE")) {
                extras = null;
            }
            if (extras == null || (extraSetupEntryPoint = (Activities.RewardsSetupMoreActivity.ExtraSetupEntryPoint) extras.getParcelable("EXTRA_SOURCE")) == null) {
                return;
            }
            this.r = extraSetupEntryPoint.d;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        MoreViewModel moreViewModelQ1 = Q1();
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        String strC = ContextExtKt.c(contextRequireContext);
        Context contextRequireContext2 = requireContext();
        Intrinsics.g(contextRequireContext2, "requireContext(...)");
        contextRequireContext2.getPackageManager().getPackageInfo(contextRequireContext2.getPackageName(), 0).getLongVersionCode();
        moreViewModelQ1.A = strC;
        moreViewModelQ1.B = "";
        moreViewModelQ1.r6(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        if (Q1().s6()) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$onCreateView$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final MoreFragment moreFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-1907041547, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$onCreateView$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    MoreFragment moreFragment2 = moreFragment;
                                    ContentPageViewModel contentPageViewModel = (ContentPageViewModel) moreFragment2.o.getD();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(moreFragment2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new e(moreFragment2, 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    MoreMenuScreenKt.a(contentPageViewModel, (Function0) objG, composer2, 8);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -323625923));
            return composeView;
        }
        FragmentMoreBinding fragmentMoreBinding = (FragmentMoreBinding) DataBindingUtil.c(inflater, com.woolworths.R.layout.fragment_more, viewGroup, false, null);
        Intrinsics.h(fragmentMoreBinding, "<set-?>");
        this.q = fragmentMoreBinding;
        this.p = new MoreEpoxyController(Q1());
        final FragmentMoreBinding fragmentMoreBindingI1 = I1();
        EpoxyRecyclerView epoxyRecyclerView = fragmentMoreBindingI1.z;
        fragmentMoreBindingI1.D(getViewLifecycleOwner());
        fragmentMoreBindingI1.L(Q1());
        MoreEpoxyController moreEpoxyController = this.p;
        if (moreEpoxyController == null) {
            Intrinsics.p("moreEpoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(moreEpoxyController);
        Context contextRequireContext2 = requireContext();
        Intrinsics.g(contextRequireContext2, "requireContext(...)");
        MoreDividerItemDecoration moreDividerItemDecoration = new MoreDividerItemDecoration(contextRequireContext2);
        Drawable drawable = requireContext().getDrawable(com.woolworths.R.drawable.more_item_divider);
        Intrinsics.e(drawable);
        moreDividerItemDecoration.f3664a = drawable;
        moreDividerItemDecoration.f = drawable;
        epoxyRecyclerView.i(moreDividerItemDecoration);
        epoxyRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.shop.more.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MoreFragment moreFragment = this.d;
                if (!moreFragment.Q1().p.d() || moreFragment.Q1().q.f8864a.f8865a.getBoolean("message_us_coach_mark_key", false)) {
                    return;
                }
                Job job = moreFragment.t;
                if (job != null) {
                    ((JobSupport) job).cancel((CancellationException) null);
                }
                moreFragment.t = BuildersKt.c(LifecycleOwnerKt.a(moreFragment), null, null, new MoreFragment$showMessageUsCoachMark$1(moreFragment, null), 3);
            }
        });
        MoreEpoxyController moreEpoxyController2 = this.p;
        if (moreEpoxyController2 == null) {
            Intrinsics.p("moreEpoxyController");
            throw null;
        }
        moreEpoxyController2.getAdapter().D(new RecyclerView.AdapterDataObserver() { // from class: au.com.woolworths.feature.shop.more.MoreFragment$onCreateView$2$3
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void d(int i, int i2) {
                if (i == 0) {
                    FragmentMoreBinding fragmentMoreBinding2 = fragmentMoreBindingI1;
                    if (fragmentMoreBinding2.z.computeVerticalScrollOffset() == 0) {
                        fragmentMoreBinding2.z.o0(0);
                    }
                }
            }
        });
        Q1().u.f(getViewLifecycleOwner(), new MoreFragment$sam$androidx_lifecycle_Observer$0(new c(this, 0)));
        View view = I1().h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Q1().s6()) {
            ((ContentPageViewModel) this.o.getD()).q6(new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.t, "", ""));
        } else {
            MoreViewModel moreViewModelQ1 = Q1();
            BuildersKt.c(ViewModelKt.a(moreViewModelQ1), null, null, new MoreViewModel$fetchMoreFeed$1(moreViewModelQ1, null), 3);
        }
        if (this.r != null) {
            MoreViewModel moreViewModelQ12 = Q1();
            Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint = this.r;
            Intrinsics.e(rewardsSetupEntryPoint);
            int iOrdinal = rewardsSetupEntryPoint.ordinal();
            if (iOrdinal == 0) {
                moreViewModelQ12.r6(Boolean.FALSE);
            } else if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                moreViewModelQ12.v.f(MoreContract.Actions.LaunchEReceipts.f7562a);
            }
            this.r = null;
        }
        FeatureToggleManager featureToggleManager = this.j;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.Y)) {
            MoreViewModel moreViewModelQ13 = Q1();
            BuildersKt.c(ViewModelKt.a(moreViewModelQ13), null, null, new MoreViewModel$markSoftUpgradeAlertBannerAsSeen$1(moreViewModelQ13, null), 3);
        }
    }
}
