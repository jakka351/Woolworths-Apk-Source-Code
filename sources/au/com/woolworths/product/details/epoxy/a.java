package au.com.woolworths.product.details.epoxy;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import au.com.woolworths.android.onesite.epoxy.CirclePageIndicatorDecoration;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.databinding.EpoxyItemProductHeadingBinding;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsAdapter;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment;
import au.com.woolworths.shop.digipay.ItemDigipayAddNewCreditCardBindingModel_;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEpoxyController;
import au.com.woolworths.shop.lists.ui.lists.ListsContract;
import au.com.woolworths.shop.lists.ui.lists.ListsFragment;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.adobe.marketing.mobile.rulesengine.FunctionBlock;
import com.adobe.marketing.mobile.services.DataEntity;
import com.adobe.marketing.mobile.services.HitProcessingResult;
import com.adobe.marketing.mobile.services.PersistentHitQueue;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Executors;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Network;
import com.google.common.graph.ValueGraph;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;
import com.scandit.djinni.ResultOrError;
import com.swrve.sdk.messaging.SwrveInAppStoryButton;
import com.swrve.sdk.messaging.SwrveInAppStoryView;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.ClickedCancelShopMenu;
import com.woolworths.scanlibrary.analytics.ClickedContactUsInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedHelpAndFAQInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedMyAccountInSideMenuTracking;
import com.woolworths.scanlibrary.analytics.ClickedPrivacyCollectionNoticeInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedPrivacyPolicyInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedSettingsInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedTermsAndConditionInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedTransactionHistoryInSideMenu;
import com.woolworths.scanlibrary.analytics.ClickedTutorialInSideMenu;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsActivity;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountActivity;
import com.woolworths.scanlibrary.ui.menu.setting.UserSettingsActivity;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import com.woolworths.scanlibrary.ui.transaction.TransactionListActivity;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements OnModelBoundListener, OnModelVisibilityStateChangedListener, SimpleTooltip.OnDismissListener, Consumer, Function, TabLayoutMediator.TabConfigurationStrategy, KeyboardVisibilityEventListener, FunctionBlock, HitProcessingResult, SynchronizationGuard.CriticalSection, AccessibilityViewCommand, com.google.common.base.Function, Continuation, Deferred.DeferredHandler, SuccessContinuation, MarketingCloudSdk.WhenReadyListener, SFMCSdkReadyListener, ResultOrError.ErrorHandler, OnApplyWindowInsetsListener, NavigationView.OnNavigationItemSelectedListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(PersistentHitQueue persistentHitQueue, DataEntity dataEntity) {
        this.d = 11;
        this.e = persistentHitQueue;
    }

    @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
    public void a(MenuItem menuItem) {
        NavDrawerBaseActivity navDrawerBaseActivity = (NavDrawerBaseActivity) this.e;
        int i = NavDrawerBaseActivity.T;
        Intrinsics.h(menuItem, "menuItem");
        DrawerLayout drawerLayout = navDrawerBaseActivity.Q;
        if (drawerLayout == null) {
            Intrinsics.p("navigationDrawer");
            throw null;
        }
        drawerLayout.d(false);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_account) {
            ClickedMyAccountInSideMenuTracking clickedMyAccountInSideMenuTracking = new ClickedMyAccountInSideMenuTracking("My Account");
            Intent intent = new Intent(navDrawerBaseActivity, (Class<?>) MyAccountActivity.class);
            intent.addFlags(0);
            navDrawerBaseActivity.startActivity(intent);
            navDrawerBaseActivity.N4().b(clickedMyAccountInSideMenuTracking);
            return;
        }
        if (itemId == R.id.nav_settings) {
            ClickedSettingsInSideMenu clickedSettingsInSideMenu = new ClickedSettingsInSideMenu("Settings");
            Intent intent2 = new Intent(navDrawerBaseActivity, (Class<?>) UserSettingsActivity.class);
            intent2.addFlags(0);
            navDrawerBaseActivity.startActivity(intent2);
            navDrawerBaseActivity.N4().b(clickedSettingsInSideMenu);
            return;
        }
        if (itemId == R.id.nav_trans_history) {
            ClickedTransactionHistoryInSideMenu clickedTransactionHistoryInSideMenu = new ClickedTransactionHistoryInSideMenu("Transaction History");
            Intent intent3 = new Intent(navDrawerBaseActivity, (Class<?>) TransactionListActivity.class);
            intent3.addFlags(0);
            navDrawerBaseActivity.startActivity(intent3);
            navDrawerBaseActivity.N4().b(clickedTransactionHistoryInSideMenu);
            return;
        }
        if (itemId == R.id.nav_faq) {
            String str = navDrawerBaseActivity.K;
            if (str == null) {
                Intrinsics.p("faqUrl");
                throw null;
            }
            ClickedHelpAndFAQInSideMenu clickedHelpAndFAQInSideMenu = new ClickedHelpAndFAQInSideMenu("Help");
            ContextExtKt.e(navDrawerBaseActivity, str);
            navDrawerBaseActivity.N4().b(clickedHelpAndFAQInSideMenu);
            return;
        }
        if (itemId == R.id.nav_privacy_policy) {
            String str2 = navDrawerBaseActivity.M;
            if (str2 == null) {
                Intrinsics.p("privacyPolicyUrl");
                throw null;
            }
            ClickedPrivacyPolicyInSideMenu clickedPrivacyPolicyInSideMenu = new ClickedPrivacyPolicyInSideMenu("Privacy Policy");
            ContextExtKt.e(navDrawerBaseActivity, str2);
            navDrawerBaseActivity.N4().b(clickedPrivacyPolicyInSideMenu);
            return;
        }
        if (itemId == R.id.nav_privacy_notice) {
            String str3 = navDrawerBaseActivity.N;
            if (str3 == null) {
                Intrinsics.p("collectionUrl");
                throw null;
            }
            ClickedPrivacyCollectionNoticeInSideMenu clickedPrivacyCollectionNoticeInSideMenu = new ClickedPrivacyCollectionNoticeInSideMenu("Collection Notice");
            ContextExtKt.e(navDrawerBaseActivity, str3);
            navDrawerBaseActivity.N4().b(clickedPrivacyCollectionNoticeInSideMenu);
            return;
        }
        if (itemId == R.id.nav_terms_conditions) {
            String str4 = navDrawerBaseActivity.L;
            if (str4 == null) {
                Intrinsics.p("tncUrl");
                throw null;
            }
            ClickedTermsAndConditionInSideMenu clickedTermsAndConditionInSideMenu = new ClickedTermsAndConditionInSideMenu("Terms & Conditions");
            ContextExtKt.e(navDrawerBaseActivity, str4);
            navDrawerBaseActivity.N4().b(clickedTermsAndConditionInSideMenu);
            return;
        }
        if (itemId == R.id.nav_cancel_shop) {
            navDrawerBaseActivity.N4().b(new ClickedCancelShopMenu("Cancel Shop"));
            String string = navDrawerBaseActivity.getString(R.string.sng_msg_abandon_cart);
            Intrinsics.g(string, "getString(...)");
            String string2 = navDrawerBaseActivity.getString(R.string.sng_label_ok);
            Intrinsics.g(string2, "getString(...)");
            c cVar = new c(navDrawerBaseActivity, 9);
            String string3 = navDrawerBaseActivity.getString(R.string.sng_label_cancel);
            Intrinsics.g(string3, "getString(...)");
            AppCompatActivityExtKt.b(navDrawerBaseActivity, "", string, string2, cVar, string3, new d(27), true);
            return;
        }
        if (itemId == R.id.nav_contact_us) {
            ClickedContactUsInSideMenu clickedContactUsInSideMenu = new ClickedContactUsInSideMenu("Contact Us");
            Intent intent4 = new Intent(navDrawerBaseActivity, (Class<?>) ContactUsActivity.class);
            intent4.addFlags(0);
            navDrawerBaseActivity.startActivity(intent4);
            navDrawerBaseActivity.N4().b(clickedContactUsInSideMenu);
            return;
        }
        if (itemId != R.id.nav_tutorial) {
            if (itemId == R.id.nav_send_feedback) {
                navDrawerBaseActivity.f5();
            }
        } else {
            ClickedTutorialInSideMenu clickedTutorialInSideMenu = new ClickedTutorialInSideMenu("Tutorial - Menu");
            Intent intent5 = new Intent(navDrawerBaseActivity, (Class<?>) OnBoardingActivity.class);
            intent5.addFlags(0);
            navDrawerBaseActivity.startActivity(intent5);
            navDrawerBaseActivity.N4().b(clickedTutorialInSideMenu);
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ((au.com.woolworths.product.details.d) this.e).invoke(obj);
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 5:
                au.com.woolworths.foundation.shop.olive.voice.ui.search.a aVar = (au.com.woolworths.foundation.shop.olive.voice.ui.search.a) this.e;
                Intrinsics.h(p0, "p0");
                return (Token) aVar.invoke(p0);
            case 15:
                return ((Network) this.e).l(p0);
            case 16:
                EndpointPair endpointPair = (EndpointPair) p0;
                Object objJ = ((ValueGraph) this.e).j(endpointPair.d, endpointPair.e);
                Objects.requireNonNull(objJ);
                return objJ;
            case 25:
                return ResultOrError.a(this.e, p0);
            default:
                com.woolworths.scanlibrary.data.authentication.token.a aVar2 = (com.woolworths.scanlibrary.data.authentication.token.a) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) aVar2.invoke(p0);
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean b(View view) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.e;
        int i = BottomSheetDragHandleView.p;
        return bottomSheetDragHandleView.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void c(final TabLayout.Tab tab, int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 6:
                FulfilmentWindowsGroup fulfilmentWindowsGroup = (FulfilmentWindowsGroup) ((FulfilmentWindowsAdapter) ((FulfilmentWindowsFragment) obj).o.getD()).p.get(i);
                tab.b(fulfilmentWindowsGroup.f10613a);
                RequestBuilder requestBuilderL = Glide.e(tab.g).l(fulfilmentWindowsGroup.c);
                requestBuilderL.J(new CustomTarget<Drawable>() { // from class: au.com.woolworths.android.onesite.extensions.TabExtKt$setIconUrl$1
                    @Override // com.bumptech.glide.request.target.Target
                    public final void d(Drawable drawable) {
                        tab.a(drawable);
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    public final void e(Object obj2, Transition transition) {
                        tab.a((Drawable) obj2);
                    }
                }, null, requestBuilderL, Executors.f13983a);
                break;
            default:
                ListsFragment.Companion companion = ListsFragment.m;
                ResText resText = ((ListsContract.ListsTabsContent) ListsContract.ListsTabsContent.h.get(i)).d;
                Context contextRequireContext = ((ListsFragment) obj).requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                tab.b(resText.getText(contextRequireContext));
                break;
        }
    }

    public void d(boolean z) {
        PersistentHitQueue persistentHitQueue = (PersistentHitQueue) this.e;
        if (z) {
            persistentHitQueue.f13236a.remove();
            persistentHitQueue.e.set(false);
            persistentHitQueue.f();
        } else {
            persistentHitQueue.b.getClass();
            persistentHitQueue.d.schedule(new androidx.camera.camera2.interop.d(persistentHitQueue, 23), 30, TimeUnit.SECONDS);
        }
    }

    public void e(DataBindingEpoxyModel dataBindingEpoxyModel, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ProductDetailsClickHandler productDetailsClickHandler = (ProductDetailsClickHandler) this.e;
        if (i == 4) {
            productDetailsClickHandler.i5();
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.d) {
            case 12:
                return Integer.valueOf(((EventStore) this.e).m());
            default:
                WorkInitializer workInitializer = (WorkInitializer) this.e;
                Iterator it = workInitializer.b.j1().iterator();
                while (it.hasNext()) {
                    workInitializer.c.b((TransportContext) it.next(), 1);
                }
                return null;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void f(Provider provider) {
        switch (this.d) {
            case 19:
                FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider = (FirebaseAppCheckTokenProvider) this.e;
                synchronized (firebaseAppCheckTokenProvider) {
                    try {
                        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
                        firebaseAppCheckTokenProvider.b = interopAppCheckTokenProvider;
                        if (interopAppCheckTokenProvider != null) {
                            interopAppCheckTokenProvider.b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider = (FirebaseAuthCredentialsProvider) this.e;
                synchronized (firebaseAuthCredentialsProvider) {
                    firebaseAuthCredentialsProvider.b = (InternalAuthProvider) provider.get();
                    firebaseAuthCredentialsProvider.c();
                    firebaseAuthCredentialsProvider.b.b(firebaseAuthCredentialsProvider.f15435a);
                }
                return;
        }
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        ComposeView composeView;
        switch (this.d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.e;
                Carousel carousel = (Carousel) obj;
                EpoxyVisibilityTracker epoxyVisibilityTracker = HealthierHorizontalModelGroup.q;
                Intrinsics.e(carousel);
                epoxyVisibilityTracker.a(carousel);
                if (arrayList.size() > 1) {
                    Context context = carousel.getContext();
                    Intrinsics.g(context, "getContext(...)");
                    CirclePageIndicatorDecoration circlePageIndicatorDecoration = new CirclePageIndicatorDecoration(context, R.dimen.healthier_product_page_indicator_height, R.dimen.healthier_product_page_indicator_size);
                    carousel.i(circlePageIndicatorDecoration);
                    HealthierHorizontalModelGroup.p = circlePageIndicatorDecoration;
                    break;
                }
                break;
            case 1:
            default:
                CreditCardEpoxyController.buildAddCreditCardView$lambda$4$lambda$3((CreditCardEpoxyController) this.e, (ItemDigipayAddNewCreditCardBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 2:
                ProductCard productCard = (ProductCard) this.e;
                ViewDataBinding viewDataBinding = ((DataBindingEpoxyModel.DataBindingHolder) obj).f13309a;
                EpoxyItemProductHeadingBinding epoxyItemProductHeadingBinding = viewDataBinding instanceof EpoxyItemProductHeadingBinding ? (EpoxyItemProductHeadingBinding) viewDataBinding : null;
                if (epoxyItemProductHeadingBinding != null && (composeView = epoxyItemProductHeadingBinding.A) != null) {
                    ProductExtKt.a(composeView, productCard.getMemberPriceInfo(), ProductMemberPriceLabelStyling.f);
                    break;
                }
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 26:
                SwrveInAppStoryButton swrveInAppStoryButton = (SwrveInAppStoryButton) obj;
                int i2 = SwrveInAppStoryButton.t;
                Insets insetsE = windowInsetsCompat.e(647);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin += insetsE.b;
                marginLayoutParams.rightMargin += insetsE.c;
                marginLayoutParams.leftMargin += insetsE.f2430a;
                swrveInAppStoryButton.setLayoutParams(marginLayoutParams);
                ViewCompat.I(swrveInAppStoryButton, null);
                break;
            default:
                SwrveInAppStoryView swrveInAppStoryView = (SwrveInAppStoryView) obj;
                int i3 = SwrveInAppStoryView.t;
                Insets insetsE2 = windowInsetsCompat.e(647);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams2.topMargin += insetsE2.b;
                marginLayoutParams2.leftMargin += insetsE2.f2430a;
                marginLayoutParams2.rightMargin += insetsE2.c;
                swrveInAppStoryView.setLayoutParams(marginLayoutParams2);
                ViewCompat.I(swrveInAppStoryView, null);
                break;
        }
        return WindowInsetsCompat.b;
    }

    @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
    public void ready(MarketingCloudSdk marketingCloudSdk) {
        Event.track$lambda$0((Event) this.e, marketingCloudSdk);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) this.e;
        int[] iArr = ConfigFetchHandler.k;
        return Tasks.forResult(fetchResponse);
    }

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener
    public void ready(SFMCSdk sFMCSdk) {
        SFMCSdk.Companion.m259track$lambda16((com.salesforce.marketingcloud.sfmcsdk.components.events.Event[]) this.e, sFMCSdk);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.d) {
            case 17:
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                ExecutorService executorService = Utils.f15282a;
                countDownLatch.countDown();
                return null;
            case 18:
                return (Task) ((Callable) this.e).call();
            default:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) this.e;
                boolean z = false;
                byte b = 0;
                if (task.isSuccessful()) {
                    ConfigCacheClient configCacheClient = firebaseRemoteConfig.c;
                    synchronized (configCacheClient) {
                        configCacheClient.c = Tasks.forResult(null);
                    }
                    ConfigStorageClient configStorageClient = configCacheClient.b;
                    synchronized (configStorageClient) {
                        configStorageClient.f15773a.deleteFile(configStorageClient.b);
                    }
                    ConfigContainer configContainer = (ConfigContainer) task.getResult();
                    if (configContainer != null) {
                        JSONArray jSONArray = configContainer.d;
                        FirebaseABTesting firebaseABTesting = firebaseRemoteConfig.f15755a;
                        if (firebaseABTesting != null) {
                            try {
                                firebaseABTesting.b(FirebaseRemoteConfig.f(jSONArray));
                            } catch (AbtException e) {
                                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                            } catch (JSONException e2) {
                                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                            }
                        }
                        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = firebaseRemoteConfig.k;
                        try {
                            RolloutsState rolloutsStateA = rolloutsStateSubscriptionsHandler.b.a(configContainer);
                            Iterator it = rolloutsStateSubscriptionsHandler.d.iterator();
                            while (it.hasNext()) {
                                rolloutsStateSubscriptionsHandler.c.execute(new com.google.firebase.remoteconfig.internal.rollouts.a((RolloutsStateSubscriber) it.next(), rolloutsStateA, b == true ? 1 : 0));
                            }
                        } catch (FirebaseRemoteConfigException e3) {
                            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                        }
                    } else {
                        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
