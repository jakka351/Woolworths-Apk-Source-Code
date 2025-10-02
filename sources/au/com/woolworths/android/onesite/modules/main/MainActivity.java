package au.com.woolworths.android.onesite.modules.main;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.databinding.ActivityMainBinding;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark;
import au.com.woolworths.android.onesite.modules.main.tooltip.CollectionModeHeaderCoachMark;
import au.com.woolworths.android.onesite.modules.main.tooltip.InstoreModeReminderCoachmark;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.notification.GenericNotificationRequestType;
import au.com.woolworths.android.onesite.notification.WowNotificationManager;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.android.onesite.utils.Logout;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.VoiceProductSearchEntryIconKt;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.NavigationAction;
import au.com.woolworths.feature.shop.homepage.presentation.OnboardingCoachMarksHandler;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePrompt;
import au.com.woolworths.foundation.force.upgrade.extension.UpgradeConfigExtensionKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.snackbar.Snackbar;
import com.medallia.digital.mobilesdk.l8;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageContract$MainAndHomeBridging;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageFragment$HomeCoachMarkHost;", "<init>", "()V", "AppLifecycleObserver", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MainActivity extends Hilt_MainActivity implements AddToListBottomSheetFragment.BottomSheetHost, HomePageContract.MainAndHomeBridging, HomePageFragment.HomeCoachMarkHost {
    public static final MainContract.MainPage R = MainContract.MainPage.e;
    public final ViewModelLazy B;
    public final ViewModelLazy C;
    public CollectionModeInteractor D;
    public TrolleyInteractor E;
    public ShopAccountInteractor F;
    public ShopAppNavigator G;
    public FeatureToggleManager H;
    public ListsUtils I;
    public OkHttpClient J;
    public MainContract.MainPage K;
    public ActivityMainBinding L;
    public BottomNavigationView M;
    public boolean N;
    public final int O;
    public final ActivityResultLauncher P;
    public final ActivityResultLauncher Q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainActivity$AppLifecycleObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AppLifecycleObserver implements LifecycleEventObserver {
        public boolean d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4340a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4340a = iArr;
            }
        }

        public AppLifecycleObserver() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i = WhenMappings.f4340a[event.ordinal()];
            if (i != 1) {
                if (i == 2 && this.d) {
                    this.d = false;
                    return;
                }
                return;
            }
            if (this.d) {
                return;
            }
            this.d = true;
            MainContract.MainPage mainPage = MainActivity.R;
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.R4().c(BaseShopAppFeature.Y)) {
                MainContract.ViewState viewState = (MainContract.ViewState) mainActivity.T4().w.e();
                if ((viewState != null ? viewState.i : null) == null) {
                    MainViewModel mainViewModelT4 = mainActivity.T4();
                    String strC = ContextExtKt.c(mainActivity);
                    String osVersion = Build.VERSION.RELEASE;
                    Intrinsics.g(osVersion, "RELEASE");
                    Intrinsics.h(osVersion, "osVersion");
                    BuildersKt.c(ViewModelKt.a(mainViewModelT4), null, null, new MainViewModel$checkForAppUpdates$1(mainViewModelT4, strC, null), 3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainActivity$Companion;", "", "", "STATE_SELECTED_TAB", "Ljava/lang/String;", "", "MANAGE_FULL_DELIVERY_ADDRESSES_REQUEST_CODE", "I", "NEW_BADGE_HORIZONTAL_OFFSET_IN_DP", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainActivity$onCreate$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<MainContract.ViewState, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object modeChipPickUp;
            MainContract.ViewState p0 = (MainContract.ViewState) obj;
            Intrinsics.h(p0, "p0");
            MainActivity mainActivity = (MainActivity) this.receiver;
            MainContract.MainPage mainPage = MainActivity.R;
            mainActivity.getClass();
            if (p0.f4364a) {
                Views.c(mainActivity, 0);
            } else {
                Views.b(mainActivity);
                BottomNavigationView bottomNavigationView = mainActivity.M;
                if (bottomNavigationView == null) {
                    Intrinsics.p("bottomNavigationView");
                    throw null;
                }
                BadgeDrawable badgeDrawableB = bottomNavigationView.b();
                boolean z = p0.c;
                BadgeState badgeState = badgeDrawableB.h;
                BadgeState.State state = badgeState.f14518a;
                BadgeState.State state2 = badgeState.b;
                state.w = Boolean.valueOf(z);
                state2.w = Boolean.valueOf(z);
                badgeDrawableB.setVisible(state2.w.booleanValue(), false);
                if (ContextExtKt.d(mainActivity)) {
                    mainActivity.T4().A.clear();
                } else if (p0.f) {
                    CoachMark coachMark = p0.b;
                    if (coachMark != null) {
                        if (coachMark instanceof CollectionModeHeaderCoachMark) {
                            ActivityMainBinding activityMainBinding = mainActivity.L;
                            if (activityMainBinding == null) {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                            modeChipPickUp = activityMainBinding.G.A;
                            Intrinsics.g(modeChipPickUp, "modeChipGroupContainer");
                        } else {
                            if (!(coachMark instanceof InstoreModeReminderCoachmark)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ActivityMainBinding activityMainBinding2 = mainActivity.L;
                            if (activityMainBinding2 == null) {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                            modeChipPickUp = activityMainBinding2.G.C;
                            Intrinsics.g(modeChipPickUp, "modeChipPickUp");
                        }
                        ActivityMainBinding activityMainBinding3 = mainActivity.L;
                        if (activityMainBinding3 == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        activityMainBinding3.h.post(new androidx.camera.core.processing.g(9, mainActivity, coachMark, modeChipPickUp));
                    }
                } else {
                    List<ActivityResultCaller> listN = mainActivity.getSupportFragmentManager().N();
                    Intrinsics.g(listN, "getFragments(...)");
                    for (ActivityResultCaller activityResultCaller : listN) {
                        OnboardingCoachMarksHandler onboardingCoachMarksHandler = activityResultCaller instanceof OnboardingCoachMarksHandler ? (OnboardingCoachMarksHandler) activityResultCaller : null;
                        if (onboardingCoachMarksHandler != null) {
                            onboardingCoachMarksHandler.D0();
                        }
                    }
                }
                ActivityMainBinding activityMainBinding4 = mainActivity.L;
                if (activityMainBinding4 == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                activityMainBinding4.G.B.setEnabled(mainActivity.T4().v6());
                mainActivity.invalidateOptionsMenu();
            }
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainActivity$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<MainContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MainContract.Actions p0 = (MainContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            final MainActivity mainActivity = (MainActivity) this.receiver;
            MainContract.MainPage mainPage = MainActivity.R;
            mainActivity.getClass();
            if (p0 instanceof MainContract.Actions.ShowLoginPrompt) {
                ShopAccountInteractor shopAccountInteractor = mainActivity.F;
                if (shopAccountInteractor == null) {
                    Intrinsics.p("accountInteractor");
                    throw null;
                }
                Logout.a(mainActivity, shopAccountInteractor);
            } else if (p0 instanceof MainContract.Actions.ShowCollectionModeSetup) {
                mainActivity.startActivity(ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e).putExtra("EXTRA_DATA", new Activities.CollectionModeSetup.CollectionModeSetupData(false)));
                mainActivity.finish();
            } else if (p0 instanceof MainContract.Actions.ShowStoreLocator) {
                mainActivity.b5();
            } else if (p0 instanceof MainContract.Actions.ShowManageDeliveryAddress) {
                Intent intent = new Intent(mainActivity, (Class<?>) ManageFullDeliveryAddressesActivity.class);
                intent.putExtra("EXTRA_DATA", new Activities.ManageFullDeliveryAddressesActivity.Extras(0, false, false));
                intent.addFlags(603979776);
                mainActivity.startActivityForResult(intent, 3412);
            } else if (p0 instanceof MainContract.Actions.ShowAddDeliveryAddress) {
                mainActivity.startActivity(Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(false, true, false, false)));
            } else if (p0 instanceof MainContract.Actions.ShowFailedMigration) {
                new AlertDialog.Builder(mainActivity).setCancelable(false).setTitle(R.string.pickup_migration_failed_title).setMessage(R.string.pickup_migration_failed_message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.android.onesite.modules.main.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        MainContract.MainPage mainPage2 = MainActivity.R;
                        MainActivity activity = mainActivity;
                        Intrinsics.h(activity, "activity");
                        activity.startActivityForResult(new Intent(activity, (Class<?>) CollectionModeSetupActivity.class), 5);
                        activity.finish();
                    }
                }).show();
            } else if (p0 instanceof MainContract.Actions.NotifyAlert) {
                NotificationResult.Notification notification = ((MainContract.Actions.NotifyAlert) p0).f4349a;
                new AlertDialog.Builder(mainActivity).setTitle(notification.getTitle()).setMessage(notification.getContent()).setPositiveButton(R.string.dialog_button_ok, (DialogInterface.OnClickListener) null).setCancelable(false).create().show();
            } else if (p0 instanceof MainContract.Actions.NotifyCampaign) {
                NotificationResult.Notification notification2 = ((MainContract.Actions.NotifyCampaign) p0).f4350a;
                String url = notification2.getUrl();
                Intrinsics.g(url, "getUrl(...)");
                String title = notification2.getTitle();
                Intrinsics.g(title, "getTitle(...)");
                mainActivity.startActivity(Activities.WebViewActivity.f4554a.b(new Activities.WebViewActivity.Extras(56, url, title, "Campaign screen")));
                LegacyShopAnalyticsManager legacyShopAnalyticsManager = mainActivity.w;
                if (legacyShopAnalyticsManager == null) {
                    Intrinsics.p("legacyShopAnalyticsManager");
                    throw null;
                }
                String title2 = notification2.getTitle();
                Intrinsics.g(title2, "getTitle(...)");
                legacyShopAnalyticsManager.c(title2);
            } else if (p0 instanceof MainContract.Actions.ShowCollectionModeSelectorScreen) {
                ListsUtils listsUtils = mainActivity.I;
                if (listsUtils == null) {
                    Intrinsics.p("listsUtils");
                    throw null;
                }
                ListsUtils.c(listsUtils, mainActivity, ((MainContract.Actions.ShowCollectionModeSelectorScreen) p0).f4353a, 12);
            } else if (p0.equals(MainContract.Actions.NavigateToSearchScreen.f4348a)) {
                mainActivity.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
            } else if (p0.equals(MainContract.Actions.NavigateToInboxScreen.f4347a)) {
                mainActivity.startActivity(ActivityNavigatorKt.a(Activities.Inbox.f4480a, ApplicationType.e));
            } else if (p0.equals(MainContract.Actions.NavigateToAskOliveScreen.f4345a)) {
                mainActivity.startActivity(Activities.AskOliveActivity.b(7, null, null, null));
            } else if (p0.equals(MainContract.Actions.NavigateToBarcodeScanner.f4346a)) {
                ShopAppNavigator shopAppNavigator = mainActivity.G;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.a();
            } else if (p0 instanceof MainContract.Actions.ShowSnackbarMessage) {
                mainActivity.a5(((MainContract.Actions.ShowSnackbarMessage) p0).f4357a.getText(mainActivity).toString());
            } else if (p0.equals(MainContract.Actions.RefreshCurrentFragment.f4351a)) {
                List<ActivityResultCaller> listN = mainActivity.getSupportFragmentManager().N();
                Intrinsics.g(listN, "getFragments(...)");
                for (ActivityResultCaller activityResultCaller : listN) {
                    NavigationAction navigationAction = activityResultCaller instanceof NavigationAction ? (NavigationAction) activityResultCaller : null;
                    if (navigationAction != null) {
                        navigationAction.s();
                    }
                }
            } else if (p0 instanceof MainContract.Actions.LaunchDeepLink) {
                String str = ((MainContract.Actions.LaunchDeepLink) p0).f4342a;
                MainContract.MainPage mainPage2 = mainActivity.K;
                if (mainPage2 == null) {
                    Intrinsics.p("currentPage");
                    throw null;
                }
                mainActivity.startActivity(ShopAppDeepLink.a(mainPage2.a(), str));
            } else if (p0 instanceof MainContract.Actions.LaunchFulfilmentWindowLogin) {
                mainActivity.P.a(Activities.LogIn.f4485a.b(new Activities.LogIn.Extras.ParentActivityExtras(((MainContract.Actions.LaunchFulfilmentWindowLogin) p0).f4343a, 6)), null);
            } else if (p0 instanceof MainContract.Actions.ShowInstoreReminderPopup) {
                String string = mainActivity.getString(R.string.check_correct_store);
                ActivityMainBinding activityMainBinding = mainActivity.L;
                if (activityMainBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                activityMainBinding.L(string);
            } else if (p0 instanceof MainContract.Actions.HideInstoreReminderPopup) {
                ActivityMainBinding activityMainBinding2 = mainActivity.L;
                if (activityMainBinding2 == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                activityMainBinding2.L(null);
            } else if (p0.equals(MainContract.Actions.ShowPickupLocator.f4356a)) {
                if (!mainActivity.R4().c(BaseShopAppFeature.b0)) {
                    Intent intent2 = new Intent();
                    intent2.setClassName(mainActivity, "au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity");
                    mainActivity.startActivity(intent2);
                } else {
                    if (mainActivity.G == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    ShopAppNavigator.e(mainActivity, new Activities.StoreLocator.ExtraStoreLocatorData(R.string.select_your_store, 33673, false, true, false, Activities.StoreLocator.StoreLocatorEntryPoint.e), 33673);
                }
            } else if (p0 instanceof MainContract.Actions.LaunchVoiceProductSearch) {
                mainActivity.startActivity(Activities.ComposeProductListLegacy.f4460a.c(Activities.ProductList.ProductListType.I));
            } else {
                if (!(p0 instanceof MainContract.Actions.ShowUpgradePrompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                UpgradeConfig upgradeConfig = ((MainContract.Actions.ShowUpgradePrompt) p0).f4359a;
                String strA = UpgradeConfigExtensionKt.a(upgradeConfig, "foreground");
                String strName = upgradeConfig.f8501a.name();
                String strName2 = upgradeConfig.b.name();
                UpgradePrompt upgradePrompt = upgradeConfig.c;
                Activities.AppConfigAction.ConfigExtras configExtras = new Activities.AppConfigAction.ConfigExtras(strA, strName, strName2, upgradePrompt.f8503a, upgradePrompt.b, upgradePrompt.c, upgradePrompt.d, (String) null, KyberEngine.KyberPolyBytes);
                ActivityOptionsCompat activityOptionsCompatA = ActivityOptionsCompat.a(mainActivity, android.R.anim.fade_in, android.R.anim.fade_out);
                ActivityResultLauncher activityResultLauncher = mainActivity.Q;
                Intent intentA = ActivityNavigatorKt.a(Activities.AppConfigAction.f4446a, ApplicationType.e);
                intentA.putExtra("EXTRA_CONFIG_ACTION_DETAILS", configExtras);
                activityResultLauncher.a(intentA, activityOptionsCompatA);
            }
            return Unit.f24250a;
        }
    }

    public MainActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.B = new ViewModelLazy(reflectionFactory.b(MainViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.C = new ViewModelLazy(reflectionFactory.b(HomePageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.u = true;
        this.O = R.layout.activity_main;
        final int i = 1;
        this.P = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.android.onesite.modules.main.c
            public final /* synthetic */ MainActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Bundle extras;
                int i2 = i;
                MainActivity mainActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        MainContract.MainPage mainPage = MainActivity.R;
                        Intrinsics.h(result, "<unused var>");
                        MutableLiveData mutableLiveData = mainActivity.T4().u;
                        MainContract.ViewState viewState = (MainContract.ViewState) mutableLiveData.e();
                        mutableLiveData.m(viewState != null ? MainContract.ViewState.a(viewState, null, false, null, 255) : null);
                        MainContract.ViewState viewState2 = (MainContract.ViewState) mainActivity.T4().w.e();
                        if ((viewState2 != null ? viewState2.i : null) == null) {
                            MainViewModel mainViewModelT4 = mainActivity.T4();
                            String strC = ContextExtKt.c(mainActivity);
                            String osVersion = Build.VERSION.RELEASE;
                            Intrinsics.g(osVersion, "RELEASE");
                            Intrinsics.h(osVersion, "osVersion");
                            BuildersKt.c(ViewModelKt.a(mainViewModelT4), null, null, new MainViewModel$checkForAppUpdates$1(mainViewModelT4, strC, null), 3);
                            return;
                        }
                        return;
                    default:
                        MainContract.MainPage mainPage2 = MainActivity.R;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            Intent intent = result.e;
                            Activities.LogIn.Extras extras2 = (intent == null || (extras = intent.getExtras()) == null) ? null : (Activities.LogIn.Extras) extras.getParcelable("login_extras");
                            Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = extras2 instanceof Activities.LogIn.Extras.ParentActivityExtras ? (Activities.LogIn.Extras.ParentActivityExtras) extras2 : null;
                            String str = parentActivityExtras != null ? parentActivityExtras.d : null;
                            if (str != null) {
                                MainContract.MainPage mainPage3 = mainActivity.K;
                                if (mainPage3 != null) {
                                    mainActivity.startActivity(ShopAppDeepLink.a(mainPage3.a(), str));
                                    return;
                                } else {
                                    Intrinsics.p("currentPage");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 0;
        this.Q = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.android.onesite.modules.main.c
            public final /* synthetic */ MainActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Bundle extras;
                int i22 = i2;
                MainActivity mainActivity = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        MainContract.MainPage mainPage = MainActivity.R;
                        Intrinsics.h(result, "<unused var>");
                        MutableLiveData mutableLiveData = mainActivity.T4().u;
                        MainContract.ViewState viewState = (MainContract.ViewState) mutableLiveData.e();
                        mutableLiveData.m(viewState != null ? MainContract.ViewState.a(viewState, null, false, null, 255) : null);
                        MainContract.ViewState viewState2 = (MainContract.ViewState) mainActivity.T4().w.e();
                        if ((viewState2 != null ? viewState2.i : null) == null) {
                            MainViewModel mainViewModelT4 = mainActivity.T4();
                            String strC = ContextExtKt.c(mainActivity);
                            String osVersion = Build.VERSION.RELEASE;
                            Intrinsics.g(osVersion, "RELEASE");
                            Intrinsics.h(osVersion, "osVersion");
                            BuildersKt.c(ViewModelKt.a(mainViewModelT4), null, null, new MainViewModel$checkForAppUpdates$1(mainViewModelT4, strC, null), 3);
                            return;
                        }
                        return;
                    default:
                        MainContract.MainPage mainPage2 = MainActivity.R;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            Intent intent = result.e;
                            Activities.LogIn.Extras extras2 = (intent == null || (extras = intent.getExtras()) == null) ? null : (Activities.LogIn.Extras) extras.getParcelable("login_extras");
                            Activities.LogIn.Extras.ParentActivityExtras parentActivityExtras = extras2 instanceof Activities.LogIn.Extras.ParentActivityExtras ? (Activities.LogIn.Extras.ParentActivityExtras) extras2 : null;
                            String str = parentActivityExtras != null ? parentActivityExtras.d : null;
                            if (str != null) {
                                MainContract.MainPage mainPage3 = mainActivity.K;
                                if (mainPage3 != null) {
                                    mainActivity.startActivity(ShopAppDeepLink.a(mainPage3.a(), str));
                                    return;
                                } else {
                                    Intrinsics.p("currentPage");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MainContract.MainPage S4(Intent intent, Bundle bundle) {
        int iOrdinal;
        MainContract.MainPage mainPage = R;
        if (bundle != null) {
            iOrdinal = bundle.getInt("STATE_SELECTED_TAB", mainPage.ordinal());
        } else {
            Activities.MainActivity.ExtraTargetTabWithMessage extraTargetTabWithMessage = (Activities.MainActivity.ExtraTargetTabWithMessage) intent.getParcelableExtra("EXTRA_TARGET_TAB_AND_MESSAGE");
            iOrdinal = extraTargetTabWithMessage != null ? extraTargetTabWithMessage.d.ordinal() : mainPage.ordinal();
        }
        return (MainContract.MainPage) MainContract.MainPage.h.get(iOrdinal);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(T4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            ActivityMainBinding activityMainBinding = this.L;
            if (activityMainBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            CoordinatorLayout wowCoordinatorLayout = activityMainBinding.I;
            Intrinsics.g(wowCoordinatorLayout, "wowCoordinatorLayout");
            ListChangeEventKt.a(addToListSuccessEvent, this, wowCoordinatorLayout, false, 28);
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getO() {
        return this.O;
    }

    public final FeatureToggleManager R4() {
        FeatureToggleManager featureToggleManager = this.H;
        if (featureToggleManager != null) {
            return featureToggleManager;
        }
        Intrinsics.p("featureToggleManager");
        throw null;
    }

    public final MainViewModel T4() {
        return (MainViewModel) this.B.getD();
    }

    public final void U4(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("ShopAppDeepLink.Extras.deferredIntent");
        if (intent2 != null) {
            ComponentName component = intent2.getComponent();
            if (!Intrinsics.c(component != null ? component.getClassName() : null, "au.com.woolworths.android.onesite.modules.main.MainActivity")) {
                startActivity(intent2);
                return;
            } else {
                X4(intent2);
                V4(intent2);
                return;
            }
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("ShopAppDeepLink.Extras.deferredIntents");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            return;
        }
        Object obj = parcelableArrayListExtra.get(0);
        Intrinsics.g(obj, "get(...)");
        Intent intent3 = (Intent) obj;
        ComponentName component2 = intent3.getComponent();
        if (!Intrinsics.c(component2 != null ? component2.getClassName() : null, "au.com.woolworths.android.onesite.modules.main.MainActivity")) {
            startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[0]));
            return;
        }
        X4(intent3);
        V4(intent3);
        parcelableArrayListExtra.remove(0);
        if (parcelableArrayListExtra.isEmpty()) {
            return;
        }
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[0]));
    }

    public final void V4(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("EXTRA_COLLECTION_MODE")) {
            return;
        }
        CollectionMode collectionMode = (CollectionMode) extras.getParcelable("EXTRA_COLLECTION_MODE");
        intent.removeExtra("EXTRA_COLLECTION_MODE");
        if (collectionMode != null) {
            CollectionMode.InStore inStore = CollectionMode.InStore.d;
            if (collectionMode.equals(inStore)) {
                CollectionModeInteractor collectionModeInteractor = T4().h;
                if (collectionModeInteractor.y() != null) {
                    collectionModeInteractor.i(inStore);
                } else {
                    b5();
                }
            }
        }
    }

    public final void W4(MainContract.MainPage mainPage) {
        BottomNavigationView bottomNavigationView = this.M;
        if (bottomNavigationView != null) {
            bottomNavigationView.setSelectedItemId(mainPage.b());
        } else {
            Intrinsics.p("bottomNavigationView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X4(Intent intent) {
        intent.setExtrasClassLoader(getApplication().getClassLoader());
        Activities.MainActivity.ExtraTargetTabWithMessage extraTargetTabWithMessage = (Activities.MainActivity.ExtraTargetTabWithMessage) intent.getParcelableExtra("EXTRA_TARGET_TAB_AND_MESSAGE");
        if (extraTargetTabWithMessage != null) {
            MainContract.MainPage mainPage = (MainContract.MainPage) MainContract.MainPage.h.get(extraTargetTabWithMessage.d.ordinal());
            BottomNavigationView bottomNavigationView = this.M;
            if (bottomNavigationView == null) {
                Intrinsics.p("bottomNavigationView");
                throw null;
            }
            if (bottomNavigationView.getSelectedItemId() == mainPage.b()) {
                Z4(mainPage);
            } else {
                W4(mainPage);
            }
        }
    }

    public final void Y4() {
        String str;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("EXTRA_MESSAGE")) {
                String string = extras.getString("EXTRA_MESSAGE", "");
                Intrinsics.e(string);
                if (!StringsKt.D(string)) {
                    a5(string);
                }
                getIntent().removeExtra("EXTRA_MESSAGE");
            }
            Activities.MainActivity.ExtraTargetTabWithMessage extraTargetTabWithMessage = (Activities.MainActivity.ExtraTargetTabWithMessage) getIntent().getParcelableExtra("EXTRA_TARGET_TAB_AND_MESSAGE");
            if (extraTargetTabWithMessage == null || (str = extraTargetTabWithMessage.e) == null) {
                return;
            }
            a5(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z4(au.com.woolworths.android.onesite.modules.main.MainContract.MainPage r12) {
        /*
            r11 = this;
            r11.K = r12
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r11.R4()
            androidx.fragment.app.Fragment r12 = r12.c(r0)
            androidx.fragment.app.FragmentManager r0 = r11.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.e()
            r1 = 2131362652(0x7f0a035c, float:1.834509E38)
            r2 = 0
            r0.j(r1, r12, r2)
            r0.f()
            au.com.woolworths.android.onesite.modules.main.MainViewModel r4 = r11.T4()
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r12 = r4.h
            au.com.woolworths.android.onesite.modules.main.MainContract$MainPage r5 = r11.K
            java.lang.String r0 = "currentPage"
            if (r5 == 0) goto La7
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r1 = r12.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$NotSet r3 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.NotSet.d
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r1, r3)
            if (r3 == 0) goto L36
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r1 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
        L36:
            au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel r1 = r12.q(r1)
            au.com.woolworths.android.onesite.modules.main.MainContract$SearchConfiguration r7 = r5.getK()
            au.com.woolworths.android.onesite.modules.main.MainContract$ModeSelectorInfo r6 = new au.com.woolworths.android.onesite.modules.main.MainContract$ModeSelectorInfo
            au.com.woolworths.android.onesite.models.text.PlainText r3 = new au.com.woolworths.android.onesite.models.text.PlainText
            java.lang.String r12 = r12.c()
            if (r12 != 0) goto L4a
            java.lang.String r12 = ""
        L4a:
            r3.<init>(r12)
            au.com.woolworths.android.onesite.modules.main.MainContract$ModeChipsConfiguration r12 = r5.getJ()
            r6.<init>(r1, r3, r12)
            androidx.lifecycle.MutableLiveData r12 = r4.w
            java.lang.Object r1 = r12.e()
            au.com.woolworths.android.onesite.modules.main.MainContract$ViewState r1 = (au.com.woolworths.android.onesite.modules.main.MainContract.ViewState) r1
            if (r1 == 0) goto L71
            au.com.woolworths.android.onesite.modules.main.MainContract$HeaderInfo r1 = r1.e
            au.com.woolworths.feature.shop.homepage.presentation.HomePageContract$DeliveryNowViewState r1 = r1.h
            if (r1 == 0) goto L71
            boolean r3 = r5.getL()
            if (r3 == 0) goto L6b
            goto L6c
        L6b:
            r1 = r2
        L6c:
            if (r1 != 0) goto L6f
            goto L71
        L6f:
            r8 = r1
            goto L74
        L71:
            au.com.woolworths.feature.shop.homepage.presentation.HomePageContract$DeliveryNowViewState r1 = au.com.woolworths.feature.shop.homepage.presentation.HomePageContract.DeliveryNowViewState.d
            goto L6f
        L74:
            java.lang.Object r12 = r12.e()
            au.com.woolworths.android.onesite.modules.main.MainContract$ViewState r12 = (au.com.woolworths.android.onesite.modules.main.MainContract.ViewState) r12
            if (r12 == 0) goto L82
            au.com.woolworths.android.onesite.modules.main.MainContract$HeaderInfo r12 = r12.e
            au.com.woolworths.feature.shop.homepage.data.DeliveryNow r12 = r12.i
            r9 = r12
            goto L83
        L82:
            r9 = r2
        L83:
            au.com.woolworths.android.onesite.analytics.Screen r12 = r5.a()
            au.com.woolworths.android.onesite.modules.main.f r3 = new au.com.woolworths.android.onesite.modules.main.f
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = 9
            r5 = 0
            au.com.woolworths.android.onesite.modules.main.MainViewModel.q6(r4, r5, r12, r3, r1)
            au.com.woolworths.android.onesite.modules.main.MainContract$MainPage r12 = r11.K
            if (r12 == 0) goto La3
            au.com.woolworths.android.onesite.modules.main.MainContract$MainPage r0 = au.com.woolworths.android.onesite.modules.main.MainContract.MainPage.e
            if (r12 != r0) goto La2
            au.com.woolworths.android.onesite.modules.main.MainViewModel r12 = r11.T4()
            r12.A6()
        La2:
            return
        La3:
            kotlin.jvm.internal.Intrinsics.p(r0)
            throw r2
        La7:
            kotlin.jvm.internal.Intrinsics.p(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.main.MainActivity.Z4(au.com.woolworths.android.onesite.modules.main.MainContract$MainPage):void");
    }

    public final void a5(String str) {
        ActivityMainBinding activityMainBinding = this.L;
        if (activityMainBinding != null) {
            Snackbar.j(null, activityMainBinding.I, str, 0).l();
        } else {
            Intrinsics.p("activityBinding");
            throw null;
        }
    }

    public final void b5() {
        if (R4().c(BaseShopAppFeature.b0)) {
            if (this.G != null) {
                ShopAppNavigator.e(this, new Activities.StoreLocator.ExtraStoreLocatorData(R.string.select_your_store, 33673, false, true, false, Activities.StoreLocator.StoreLocatorEntryPoint.e), 33673);
                return;
            } else {
                Intrinsics.p("shopAppNavigator");
                throw null;
            }
        }
        if (this.G != null) {
            ShopAppNavigator.b(this, new Activities.StoreLocatorLegacy.ExtraStoreLocatorData(R.string.select_your_store, 33673, false, true, false, Activities.StoreLocatorLegacy.StoreLocatorEntryPoint.e), 33673);
        } else {
            Intrinsics.p("shopAppNavigator");
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        ev.getAction();
        return super.dispatchTouchEvent(ev);
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment.HomeCoachMarkHost
    public final MenuItem m4() {
        ActivityMainBinding activityMainBinding = this.L;
        if (activityMainBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        Toolbar toolbar = activityMainBinding.G.F;
        Intrinsics.g(toolbar, "toolbar");
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            return menu.findItem(R.id.cart_item);
        }
        return null;
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.HomePageContract.MainAndHomeBridging
    public final MainViewModel o2() {
        return T4();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            if (i2 == 0) {
                finish();
                return;
            }
            return;
        }
        if ((i == 7777 || i == 8888) && i2 == -1) {
            OkHttpClient okHttpClient = this.J;
            if (okHttpClient == null) {
                Intrinsics.p("okHttpClient");
                throw null;
            }
            try {
                Cache cache = okHttpClient.k;
                Intrinsics.e(cache);
                cache.a();
            } catch (IOException unused) {
                Timber.f27013a.e("failed to evict all caches", new Object[0]);
            }
            TrolleyInteractor trolleyInteractor = this.E;
            if (trolleyInteractor != null) {
                trolleyInteractor.d();
            } else {
                Intrinsics.p("trolleyInteractor");
                throw null;
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.main.Hilt_MainActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        ProcessLifecycleOwner.l.i.a(new AppLifecycleObserver());
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        this.K = S4(intent, bundle);
        ActivityMainBinding activityMainBinding = (ActivityMainBinding) DataBindingUtil.d(this, this.O);
        this.L = activityMainBinding;
        if (activityMainBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityMainBinding.D(this);
        activityMainBinding.M(T4());
        activityMainBinding.H.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$onCreate$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final MainActivity mainActivity = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(405092668, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity$onCreate$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 44);
                                MainContract.MainPage mainPage = MainActivity.R;
                                MainViewModel mainViewModelT4 = mainActivity.T4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(mainViewModelT4);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new MainActivity$onCreate$1$1$1$1$1(0, mainViewModelT4, MainViewModel.class, "onVoiceProductSearchClicked", "onVoiceProductSearchClicked()V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                VoiceProductSearchEntryIconKt.a(48, 0, composer2, modifierQ, (Function0) ((KFunction) objG));
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 856620512));
        BottomNavigationView bottomNavigationView = activityMainBinding.y;
        Intrinsics.g(bottomNavigationView, "bottomNavigationView");
        bottomNavigationView.c(R.menu.bottom_navigation_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(new b(this, 1));
        bottomNavigationView.setOnNavigationItemReselectedListener(new androidx.media3.extractor.a(23));
        BadgeDrawable badgeDrawableB = bottomNavigationView.b();
        BadgeState badgeState = badgeDrawableB.h;
        BadgeState.State state = badgeState.f14518a;
        Boolean bool = Boolean.FALSE;
        state.w = bool;
        badgeState.b.w = bool;
        badgeDrawableB.setVisible(bool.booleanValue(), false);
        int color = getColor(R.color.color_brand_always);
        BadgeState.State state2 = badgeState.f14518a;
        BadgeState.State state3 = badgeState.b;
        state2.e = Integer.valueOf(color);
        state3.e = Integer.valueOf(color);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState.b.e.intValue());
        MaterialShapeDrawable materialShapeDrawable = badgeDrawableB.e;
        if (materialShapeDrawable.d.c != colorStateListValueOf) {
            materialShapeDrawable.m(colorStateListValueOf);
            badgeDrawableB.invalidateSelf();
        }
        int dimensionPixelOffset = bottomNavigationView.getResources().getDimensionPixelOffset(R.dimen.quarter_default_margin);
        state2.A = Integer.valueOf(dimensionPixelOffset);
        state3.A = Integer.valueOf(dimensionPixelOffset);
        badgeDrawableB.j();
        state2.C = Integer.valueOf(dimensionPixelOffset);
        state3.C = Integer.valueOf(dimensionPixelOffset);
        badgeDrawableB.j();
        int iA = ContextExtKt.a(6.0f, this);
        state2.z = Integer.valueOf(iA);
        state3.z = Integer.valueOf(iA);
        badgeDrawableB.j();
        state2.B = Integer.valueOf(iA);
        state3.B = Integer.valueOf(iA);
        badgeDrawableB.j();
        this.M = bottomNavigationView;
        MainContract.MainPage mainPage = this.K;
        if (mainPage == null) {
            Intrinsics.p("currentPage");
            throw null;
        }
        if (bottomNavigationView.getSelectedItemId() == mainPage.b()) {
            Z4(mainPage);
        } else {
            W4(mainPage);
        }
        Intent intent2 = getIntent();
        Intrinsics.g(intent2, "getIntent(...)");
        V4(intent2);
        Y4();
        T4().w.f(this, new MainActivity$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(1, this, MainActivity.class, "applyState", "applyState(Lau/com/woolworths/android/onesite/modules/main/MainContract$ViewState;)V", 0)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new MainActivity$collectHeaderDataFlow$1(this, null), 3);
        Intent intent3 = getIntent();
        Intrinsics.g(intent3, "getIntent(...)");
        if (intent3.getBooleanExtra("is_deep_link_flag", false)) {
            Intent intent4 = getIntent();
            Intrinsics.g(intent4, "getIntent(...)");
            U4(intent4);
        }
        getF().a(this, new OnBackPressedCallback() { // from class: au.com.woolworths.android.onesite.modules.main.MainActivity.onCreate.3
            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                MainContract.MainPage mainPage2 = MainActivity.R;
                MainActivity mainActivity = MainActivity.this;
                BottomNavigationView bottomNavigationView2 = mainActivity.M;
                if (bottomNavigationView2 == null) {
                    Intrinsics.p("bottomNavigationView");
                    throw null;
                }
                int selectedItemId = bottomNavigationView2.getSelectedItemId();
                MainContract.MainPage mainPage3 = MainActivity.R;
                ((MainContract.MainPage.HOME) mainPage3).getClass();
                if (selectedItemId != R.id.action_home) {
                    mainActivity.W4(mainPage3);
                } else {
                    Views.a(mainActivity);
                    mainActivity.finish();
                }
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        TrolleyInteractor trolleyInteractor = this.E;
        if (trolleyInteractor == null) {
            Intrinsics.p("trolleyInteractor");
            throw null;
        }
        if (trolleyInteractor.z()) {
            menuItemFindItem.setVisible(true);
            View actionView = menuItemFindItem.getActionView();
            Intrinsics.f(actionView, "null cannot be cast to non-null type au.com.woolworths.shop.cart.ui.CartBadgeActionView");
            CartBadgeActionView cartBadgeActionView = (CartBadgeActionView) actionView;
            MainContract.MainPage mainPage = this.K;
            if (mainPage == null) {
                Intrinsics.p("currentPage");
                throw null;
            }
            cartBadgeActionView.setAnalyticsScreen(mainPage.a());
        } else {
            menuItemFindItem.setVisible(false);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.notification_inbox);
        ShopAccountInteractor shopAccountInteractor = this.F;
        if (shopAccountInteractor != null) {
            menuItemFindItem2.setVisible(shopAccountInteractor.d());
            return super.onCreateOptionsMenu(menu);
        }
        Intrinsics.p("accountInteractor");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        MainContract.MainPage mainPageS4 = S4(intent, null);
        this.K = mainPageS4;
        if (mainPageS4 == null) {
            Intrinsics.p("currentPage");
            throw null;
        }
        W4(mainPageS4);
        if (intent.getBooleanExtra("EXTRA_LAUNCH_LOGIN_PAGE", false)) {
            Activities.LogIn.c(this);
        } else {
            MainViewModel mainViewModelT4 = T4();
            if (!mainViewModelT4.j.S()) {
                CompositeDisposable compositeDisposable = mainViewModelT4.y;
                MaybeFlatMapCompletable maybeFlatMapCompletableD = mainViewModelT4.i.d();
                MainViewModel$loginAsGuestIfNeeded$1 mainViewModel$loginAsGuestIfNeeded$1 = new MainViewModel$loginAsGuestIfNeeded$1();
                maybeFlatMapCompletableD.a(mainViewModel$loginAsGuestIfNeeded$1);
                DisposableKt.a(compositeDisposable, mainViewModel$loginAsGuestIfNeeded$1);
            }
        }
        if (intent.getBooleanExtra("is_deep_link_flag", false)) {
            setIntent(intent);
            U4(intent);
        }
        Y4();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == R.id.search) {
                T4().y6();
            } else if (itemId == R.id.notification_inbox) {
                T4().z6();
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

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        MainViewModel mainViewModelT4 = T4();
        WowNotificationManager wowNotificationManager = mainViewModelT4.g;
        synchronized (wowNotificationManager) {
            try {
                WeakHashMap weakHashMap = wowNotificationManager.b;
                if (weakHashMap != null) {
                    weakHashMap.remove(mainViewModelT4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        System.currentTimeMillis();
        mainViewModelT4.y.e();
        mainViewModelT4.B = false;
        super.onPause();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MainContract.SpeechBubbleInfo speechBubbleInfo;
        MainContract.SpeechBubbleInfo speechBubbleInfo2;
        Intrinsics.h(menu, "menu");
        MainContract.ViewState viewState = (MainContract.ViewState) T4().w.e();
        boolean z = false;
        boolean z2 = viewState == null || viewState.e.d == MainContract.SearchConfiguration.e;
        MenuItem menuItemFindItem = menu.findItem(R.id.search);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z2);
        }
        MainContract.MainPage mainPage = this.K;
        if (mainPage == null) {
            Intrinsics.p("currentPage");
            throw null;
        }
        boolean z3 = mainPage == MainContract.MainPage.e && viewState != null && (speechBubbleInfo2 = viewState.e.e) != null && speechBubbleInfo2.f4363a;
        if (viewState != null && (speechBubbleInfo = viewState.e.e) != null && speechBubbleInfo.b) {
            z = true;
        }
        boolean zC = R4().c(InboxFeature.d);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.notification_inbox);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(z3);
            if (!zC) {
                menuItemFindItem2.setIcon(z ? R.drawable.ic_notification_bell_alert : R.drawable.ic_notification_bell_default);
            } else if (z) {
                menuItemFindItem2.setIcon(R.drawable.ic_notification_speech_bubble_filled);
            } else {
                menuItemFindItem2.setIcon(R.drawable.ic_notification_speech_bubble);
            }
            menuItemFindItem2.setTitle(zC ? z ? R.string.inbox_menu_item_content_description : R.string.inbox_menu_item_content_description_empty : z ? R.string.notifications_menu_item_content_description : R.string.notifications_menu_item_content_description_empty);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        MainContract.ViewState viewState;
        UpgradeConfig upgradeConfig;
        super.onResume();
        ActivityMainBinding activityMainBinding = this.L;
        if (activityMainBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        Toolbar toolbar = activityMainBinding.G.F;
        Intrinsics.g(toolbar, "toolbar");
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(false);
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.u();
        PublishSubject publishSubject = T4().x;
        b bVar = new b(new AnonymousClass1(1, this, MainActivity.class, "handleAction", "handleAction(Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;)V", 0), 0);
        Consumer consumer = Functions.e;
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(bVar, consumer);
        publishSubject.a(lambdaObserver);
        N4(lambdaObserver);
        MainViewModel mainViewModelT4 = T4();
        WowNotificationManager wowNotificationManager = mainViewModelT4.g;
        synchronized (wowNotificationManager) {
            try {
                WeakHashMap weakHashMap = wowNotificationManager.b;
                if (weakHashMap != null) {
                    weakHashMap.put(mainViewModelT4, "MainViewModel");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        NotificationResult.Notification notification = wowNotificationManager.d;
        if (notification != null && !notification.isShown()) {
            mainViewModelT4.S4(notification);
            NotificationResult.Notification notification2 = wowNotificationManager.d;
            if (notification2 != null) {
                notification2.setShown(true);
            }
        }
        AppBuildConfig appBuildConfig = mainViewModelT4.s;
        GenericNotificationRequestType genericNotificationRequestType = new GenericNotificationRequestType();
        genericNotificationRequestType.b = l8.b.b;
        genericNotificationRequestType.f4580a = appBuildConfig.b() + "/notifications";
        wowNotificationManager.a(genericNotificationRequestType);
        CompositeDisposable compositeDisposable = mainViewModelT4.y;
        ObservableObserveOn observableObserveOnF = RxBus.a().c(ForcedLogoutEvent.class).f(AndroidSchedulers.a());
        LambdaObserver lambdaObserver2 = new LambdaObserver(new b(new g(mainViewModelT4, 1), 2), consumer);
        observableObserveOnF.a(lambdaObserver2);
        DisposableKt.a(compositeDisposable, lambdaObserver2);
        ObservableObserveOn observableObserveOnF2 = mainViewModelT4.h.k().f(AndroidSchedulers.a());
        LambdaObserver lambdaObserver3 = new LambdaObserver(new b(new g(mainViewModelT4, 2), 3), consumer);
        observableObserveOnF2.a(lambdaObserver3);
        compositeDisposable.d(lambdaObserver3);
        BehaviorSubject behaviorSubject = mainViewModelT4.j.i;
        behaviorSubject.getClass();
        ObservableDistinctUntilChanged observableDistinctUntilChanged = new ObservableDistinctUntilChanged(new ObservableDistinctUntilChanged(behaviorSubject).f(AndroidSchedulers.a()));
        LambdaObserver lambdaObserver4 = new LambdaObserver(new b(new g(mainViewModelT4, 0), 4), consumer);
        observableDistinctUntilChanged.a(lambdaObserver4);
        compositeDisposable.d(lambdaObserver4);
        MainViewModel.q6(mainViewModelT4, false, null, null, 15);
        BuildersKt.c(ViewModelKt.a(mainViewModelT4), null, null, new MainViewModel$refreshCartCount$1$1(mainViewModelT4.q, null), 3);
        mainViewModelT4.B = true;
        mainViewModelT4.v.onNext(MainContract.Actions.ShowLoginPrompt.f4355a);
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        V4(intent);
        MainContract.MainPage mainPage = this.K;
        if (mainPage == null) {
            Intrinsics.p("currentPage");
            throw null;
        }
        if (mainPage == MainContract.MainPage.e) {
            T4().A6();
        }
        if (!R4().c(BaseShopAppFeature.Y) || (viewState = (MainContract.ViewState) T4().w.e()) == null || (upgradeConfig = viewState.i) == null) {
            return;
        }
        T4().v.onNext(new MainContract.Actions.ShowUpgradePrompt(upgradeConfig));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        MainContract.MainPage mainPage = this.K;
        if (mainPage != null) {
            outState.putInt("STATE_SELECTED_TAB", mainPage.ordinal());
        } else {
            Intrinsics.p("currentPage");
            throw null;
        }
    }
}
