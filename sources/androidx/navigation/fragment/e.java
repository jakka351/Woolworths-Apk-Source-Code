package androidx.navigation.fragment;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.ActivityRequestCode;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.branch.BranchReferringParams;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractorImpl;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutPaymentState;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupContract;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupContract;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.ItemInfoSectionItemBindingModel_;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.base.shopapp.ui.infosection.dialog.InfoSectionDialog;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureFramesView;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureOptions;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureResponse;
import au.com.woolworths.base.wallet.digipay.framesview.ChallengeActionCompleteCommand;
import au.com.woolworths.base.wallet.digipay.framesview.ChallengeResponse;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.JavaScriptCommand;
import au.com.woolworths.base.wallet.digipay.framesview.ThreeDSChallengeResponse;
import au.com.woolworths.base.wallet.digipay.framesview.ThreeDSError;
import au.com.woolworths.base.wallet.ocr.RewardsGiftingOcrScreens;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrScreens;
import au.com.woolworths.base.wallet.ocr.RewardsWalletOcrViewModel;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkKt;
import au.com.woolworths.design.core.ui.component.experimental.coachmark.CoachMarkState;
import au.com.woolworths.dynamic.page.data.ContentListItemData;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import au.com.woolworths.feature.product.list.v2.ProductListActivity;
import au.com.woolworths.feature.product.list.v2.ProductListViewModel;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsAccountDynamicBinding;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsPreferenceDetailsBinding;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContractLegacy;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsController;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsData;
import au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsViewModelLegacy;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsContractOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsControllerOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(InfoSectionDialog infoSectionDialog, InfoSection infoSection) {
        this.d = 7;
        this.e = infoSection;
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Lifecycle d;
        ActivityResultLauncher activityResultLauncher;
        int i = this.d;
        Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
        int i2 = 0;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState = null;
        Unit unit = Unit.f24250a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                final FragmentNavigator fragmentNavigator = (FragmentNavigator) obj2;
                final NavBackStackEntry entry = (NavBackStackEntry) obj;
                Intrinsics.h(entry, "entry");
                return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.f
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        Lifecycle.Event event2 = Lifecycle.Event.ON_RESUME;
                        FragmentNavigator fragmentNavigator2 = fragmentNavigator;
                        NavBackStackEntry navBackStackEntry = entry;
                        if (event == event2 && ((List) fragmentNavigator2.b().e.getValue()).contains(navBackStackEntry)) {
                            if (FragmentNavigator.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching RESUMED");
                            }
                            fragmentNavigator2.b().b(navBackStackEntry);
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            if (FragmentNavigator.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching DESTROYED");
                            }
                            fragmentNavigator2.b().b(navBackStackEntry);
                        }
                    }
                };
            case 1:
                Bundle source = (Bundle) obj2;
                String key = (String) obj;
                Intrinsics.h(key, "key");
                Intrinsics.h(source, "source");
                return Boolean.valueOf(!source.containsKey(key));
            case 2:
                ((CheckoutInteractorImpl) obj2).e.onNext((CheckoutPaymentState) obj);
                return unit;
            case 3:
                CollectionModeSetupActivity collectionModeSetupActivity = (CollectionModeSetupActivity) obj2;
                CollectionModeSetupContract.Actions actions = (CollectionModeSetupContract.Actions) obj;
                int i3 = CollectionModeSetupActivity.I;
                if (actions instanceof CollectionModeSetupContract.Actions.LaunchAddDeliveryAddressBySearch) {
                    int i4 = DeliveryAddressSearchActivity.J;
                    DeliveryAddressSearchActivity.Companion.a(collectionModeSetupActivity, 4, false, true, false);
                } else if (actions instanceof CollectionModeSetupContract.Actions.LaunchStoreLocatorForInStore) {
                    FeatureToggleManager featureToggleManager = collectionModeSetupActivity.B;
                    if (featureToggleManager == null) {
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    }
                    if (featureToggleManager.c(BaseShopAppFeature.b0)) {
                        if (collectionModeSetupActivity.D == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        ShopAppNavigator.e(collectionModeSetupActivity, new Activities.StoreLocator.ExtraStoreLocatorData(com.woolworths.R.string.more_stores, 33673, false, true, false, Activities.StoreLocator.StoreLocatorEntryPoint.d), 33673);
                    } else {
                        if (collectionModeSetupActivity.D == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        ShopAppNavigator.b(collectionModeSetupActivity, new Activities.StoreLocatorLegacy.ExtraStoreLocatorData(com.woolworths.R.string.more_stores, 33673, false, true, false, Activities.StoreLocatorLegacy.StoreLocatorEntryPoint.d), 33673);
                    }
                } else if (actions instanceof CollectionModeSetupContract.Actions.LaunchStoreLocatorForPickUp) {
                    FeatureToggleManager featureToggleManager2 = collectionModeSetupActivity.B;
                    if (featureToggleManager2 == null) {
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    }
                    if (!featureToggleManager2.c(BaseShopAppFeature.b0)) {
                        ActivityRequestCode[] activityRequestCodeArr = ActivityRequestCode.d;
                        Intent intent = new Intent();
                        intent.setClassName(collectionModeSetupActivity, "au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity");
                        collectionModeSetupActivity.startActivityForResult(intent, 0, null);
                    } else {
                        if (collectionModeSetupActivity.D == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        ShopAppNavigator.e(collectionModeSetupActivity, new Activities.StoreLocator.ExtraStoreLocatorData(com.woolworths.R.string.more_stores, 33673, false, true, false, Activities.StoreLocator.StoreLocatorEntryPoint.d), 33673);
                    }
                } else {
                    if (!(actions instanceof CollectionModeSetupContract.Actions.LaunchHome)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = ((CollectionModeSetupContract.Actions.LaunchHome) actions).f4376a;
                    Intrinsics.h(message, "message");
                    BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = collectionModeSetupActivity.G;
                    if (branchDeepLinkInteractorImpl == null) {
                        Intrinsics.p("branchDeepLinkInteractor");
                        throw null;
                    }
                    BranchReferringParams branchReferringParamsB = branchDeepLinkInteractorImpl.b();
                    BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl2 = collectionModeSetupActivity.G;
                    if (branchDeepLinkInteractorImpl2 == null) {
                        Intrinsics.p("branchDeepLinkInteractor");
                        throw null;
                    }
                    if (branchDeepLinkInteractorImpl2.e(branchReferringParamsB)) {
                        Intrinsics.e(branchReferringParamsB);
                        Intent intentPutExtra = mainActivity.b().putExtra("EXTRA_MESSAGE", message);
                        Intrinsics.g(intentPutExtra, "putExtra(...)");
                        collectionModeSetupActivity.startActivity(intentPutExtra);
                        Views.a(collectionModeSetupActivity);
                        collectionModeSetupActivity.setResult(-1);
                        collectionModeSetupActivity.finish();
                        BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl3 = collectionModeSetupActivity.G;
                        if (branchDeepLinkInteractorImpl3 == null) {
                            Intrinsics.p("branchDeepLinkInteractor");
                            throw null;
                        }
                        branchDeepLinkInteractorImpl3.c(ApplicationType.e, collectionModeSetupActivity, branchReferringParamsB, "");
                    } else {
                        Intent intentPutExtra2 = mainActivity.b().putExtra("EXTRA_MESSAGE", message);
                        Intrinsics.g(intentPutExtra2, "putExtra(...)");
                        if (collectionModeSetupActivity.getIntent().getBooleanExtra("is_deep_link_flag", false)) {
                            intentPutExtra2.putExtras(collectionModeSetupActivity.getIntent());
                        }
                        collectionModeSetupActivity.startActivity(intentPutExtra2);
                        Views.a(collectionModeSetupActivity);
                        collectionModeSetupActivity.setResult(-1);
                        collectionModeSetupActivity.finish();
                    }
                }
                return unit;
            case 4:
                RewardsSetupFragment rewardsSetupFragment = (RewardsSetupFragment) obj2;
                RewardsSetupContract.Actions actions2 = (RewardsSetupContract.Actions) obj;
                if (actions2 instanceof RewardsSetupContract.Actions.LaunchShoppingModeSelector) {
                    boolean z = ((RewardsSetupContract.Actions.LaunchShoppingModeSelector) actions2).f4386a;
                    FragmentActivity activity = rewardsSetupFragment.getActivity();
                    if (activity != null) {
                        int i5 = CollectionModeSetupActivity.I;
                        activity.startActivityForResult(new Intent(activity, (Class<?>) CollectionModeSetupActivity.class), 3);
                        if (z) {
                            FragmentActivity activity2 = rewardsSetupFragment.getActivity();
                            if (activity2 != null) {
                                activity2.setResult(-1);
                            }
                            FragmentActivity activity3 = rewardsSetupFragment.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                        }
                    }
                } else if (actions2 instanceof RewardsSetupContract.Actions.LaunchRewardsLogin) {
                    int i6 = RewardsAuthenticationActivity.J;
                    FragmentActivity fragmentActivityRequireActivity = rewardsSetupFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    RewardsAuthenticationActivity.Companion.a(fragmentActivityRequireActivity);
                } else if (actions2 instanceof RewardsSetupContract.Actions.LaunchRewardsSignUp) {
                    Intent intentA = ActivityNavigatorKt.a(Activities.Authentication.f4448a, ApplicationType.e);
                    intentA.putExtra("EXTRA_AUTH_CONFIG", new Activities.Authentication.Extras(1));
                    rewardsSetupFragment.startActivityForResult(intentA, 10005);
                } else if (actions2 instanceof RewardsSetupContract.Actions.LaunchHome) {
                    rewardsSetupFragment.startActivity(mainActivity.b());
                    FragmentActivity activity4 = rewardsSetupFragment.getActivity();
                    if (activity4 != null) {
                        activity4.setResult(-1);
                    }
                    FragmentActivity activity5 = rewardsSetupFragment.getActivity();
                    if (activity5 != null) {
                        activity5.finish();
                    }
                } else if (actions2 instanceof RewardsSetupContract.Actions.FinishWithResultOnboardingCancel) {
                    FragmentActivity activity6 = rewardsSetupFragment.getActivity();
                    if (activity6 != null) {
                        activity6.setResult(33);
                    }
                    FragmentActivity activity7 = rewardsSetupFragment.getActivity();
                    if (activity7 != null) {
                        activity7.finish();
                    }
                } else if (!(actions2 instanceof RewardsSetupContract.Actions.SetShoppingModeStepComplete)) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
            case 5:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                int i7 = RewardsSetupMoreActivity.E;
                Intrinsics.h(addCallback, "$this$addCallback");
                ((RewardsSetupMoreActivity) obj2).S4();
                return unit;
            case 6:
                final AutoClearedValue autoClearedValue = (AutoClearedValue) obj2;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
                if (lifecycleOwner != null && (d = lifecycleOwner.getD()) != null) {
                    d.a(new DefaultLifecycleObserver() { // from class: au.com.woolworths.android.onesite.utils.AutoClearedValue$1$onCreate$1$1
                        @Override // androidx.lifecycle.DefaultLifecycleObserver
                        public final void onDestroy(LifecycleOwner lifecycleOwner2) {
                            autoClearedValue.b = null;
                        }
                    });
                }
                return unit;
            case 7:
                EpoxyController withModels = (EpoxyController) obj;
                Intrinsics.h(withModels, "$this$withModels");
                for (InfoSectionItem infoSectionItem : ((InfoSection) obj2).getItems()) {
                    ItemInfoSectionItemBindingModel_ itemInfoSectionItemBindingModel_ = new ItemInfoSectionItemBindingModel_();
                    itemInfoSectionItemBindingModel_.M("item_" + infoSectionItem.hashCode());
                    itemInfoSectionItemBindingModel_.t();
                    itemInfoSectionItemBindingModel_.n = infoSectionItem;
                    withModels.add(itemInfoSectionItemBindingModel_);
                }
                return unit;
            case 8:
                CardCaptureFramesView cardCaptureFramesView = (CardCaptureFramesView) obj2;
                ThreeDSChallengeResponse response = (ThreeDSChallengeResponse) obj;
                int i8 = CardCaptureFramesView.p;
                Intrinsics.h(response, "response");
                ChallengeResponse challengeResponse = response.f4689a;
                if (challengeResponse == null) {
                    CardCaptureOptions cardCaptureOptions = cardCaptureFramesView.l;
                    if (cardCaptureOptions == null) {
                        Intrinsics.p("options");
                        throw null;
                    }
                    FramesWebView.Callback callback = cardCaptureOptions.b.f4673a;
                    if (callback != null) {
                        ThreeDSError.Companion companion = ThreeDSError.INSTANCE;
                        callback.c(new CardCaptureResponse());
                    }
                } else {
                    if (cardCaptureFramesView.l == null) {
                        Intrinsics.p("options");
                        throw null;
                    }
                    JavaScriptCommand.a(new ChallengeActionCompleteCommand(StringsKt.n0("\n            frames.complete = async function() {\n                try {\n                    var response = await this.action.complete(true, [" + challengeResponse + "])\n                    android.handleOnComplete(JSON.stringify(response))\n                } catch (error) {\n                    android.handleUncaughtError(JSON.stringify(error))\n                }\n             }\n             \n            frames.complete();\n        ")), cardCaptureFramesView);
                }
                return unit;
            case 9:
                RewardsWalletOcrActivity rewardsWalletOcrActivity = (RewardsWalletOcrActivity) obj2;
                int i9 = RewardsWalletOcrActivity.E;
                PendingIntent paymentCardRecognitionPendingIntent = ((PaymentCardRecognitionIntentResponse) obj).getPaymentCardRecognitionPendingIntent();
                try {
                    activityResultLauncher = rewardsWalletOcrActivity.C;
                } catch (IntentSender.SendIntentException e) {
                    Timber.f27013a.b("RewardsWalletOcrActivity", "Failed to start payment card recognition.", e);
                    rewardsWalletOcrActivity.O4();
                }
                if (paymentCardRecognitionPendingIntent == null) {
                    Intrinsics.p("cardRecognitionPendingIntent");
                    throw null;
                }
                IntentSender intentSender = paymentCardRecognitionPendingIntent.getIntentSender();
                Intrinsics.g(intentSender, "getIntentSender(...)");
                activityResultLauncher.a(new IntentSenderRequest.Builder(intentSender).a(), null);
                RewardsWalletOcrViewModel rewardsWalletOcrViewModel = (RewardsWalletOcrViewModel) rewardsWalletOcrActivity.y.getD();
                Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) rewardsWalletOcrActivity.z.getD();
                AnalyticsManager analyticsManager = rewardsWalletOcrViewModel.e;
                int i10 = origin == null ? -1 : RewardsWalletOcrViewModel.WhenMappings.f4698a[origin.ordinal()];
                if (i10 != -1) {
                    if (i10 == 1) {
                        analyticsManager.a(RewardsWalletOcrScreens.d);
                    } else if (i10 == 2) {
                        analyticsManager.a(RewardsGiftingOcrScreens.d);
                    } else if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return unit;
            case 10:
                SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) obj2;
                int i11 = (int) (((IntSize) obj).f2202a & 4294967295L);
                if (i11 > ((SnapshotMutableIntStateImpl) sharedIntrinsicHeightState.f4713a).d()) {
                    ((SnapshotMutableIntStateImpl) sharedIntrinsicHeightState.f4713a).i(i11);
                }
                return unit;
            case 11:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Intrinsics.h(layoutCoordinates, "layoutCoordinates");
                ((SnapshotMutableStateImpl) ((CoachMarkState) obj2).c).setValue(CoachMarkKt.e(layoutCoordinates));
                return unit;
            case 12:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                if (((ContentListItemData) obj2).c == null) {
                    SemanticsPropertiesKt.g(semantics);
                }
                return unit;
            case 13:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                String str = ((DynamicPageFeedData) obj2).f5185a.c;
                if (str != null) {
                    SemanticsPropertiesKt.k(semantics2, str);
                }
                return unit;
            case 14:
                ProductCard productCard = (ProductCard) obj;
                Intrinsics.h(productCard, "productCard");
                ((ProductListViewModel) obj2).J1(productCard, "");
                return unit;
            case 15:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.k(semantics3, ((ProductListChip) obj2).getText().getAltText());
                return unit;
            case 16:
                ProductCard productCard2 = (ProductCard) obj;
                Intrinsics.h(productCard2, "productCard");
                ((au.com.woolworths.feature.product.list.legacy.ProductListViewModel) obj2).J1(productCard2, "");
                return unit;
            case 17:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.k(semantics4, ((au.com.woolworths.feature.product.list.legacy.data.ProductListChip) obj2).c.b);
                return unit;
            case 18:
                ProductListViewModel.Factory factory = (ProductListViewModel.Factory) obj;
                int i12 = ProductListActivity.z;
                Intrinsics.h(factory, "factory");
                Parcelable parcelableExtra = ((ProductListActivity) obj2).getIntent().getParcelableExtra("EXTRA_PRODUCT_LIST_INFO");
                if (parcelableExtra != null) {
                    return factory.a((Activities.ProductList.Extras) parcelableExtra);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                RewardsWebLink data = (RewardsWebLink) obj;
                Intrinsics.h(data, "data");
                ((RewardsPreferenceDetailsBottomSheetFragment) obj2).Q1().q.f(new RewardsPreferenceDetailsContract.Actions.OpenExternalLink(data.getUrl()));
                return unit;
            case 20:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                Context context = ((ComposeView) obj2).getContext();
                Intrinsics.g(context, "getContext(...)");
                ContextExtKt.e(context, it);
                return unit;
            case 21:
                final RewardsPreferenceDetailsFragmentLegacy rewardsPreferenceDetailsFragmentLegacy = (RewardsPreferenceDetailsFragmentLegacy) obj2;
                RewardsPreferenceDetailsContractLegacy.ViewState viewState = (RewardsPreferenceDetailsContractLegacy.ViewState) obj;
                RewardsPreferenceDetailsController rewardsPreferenceDetailsController = rewardsPreferenceDetailsFragmentLegacy.k;
                if (rewardsPreferenceDetailsController == null) {
                    Intrinsics.p("controller");
                    throw null;
                }
                rewardsPreferenceDetailsController.setData(viewState.b, Boolean.valueOf(viewState.e));
                FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding = rewardsPreferenceDetailsFragmentLegacy.i;
                if (fragmentRewardsPreferenceDetailsBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                final EpoxyRecyclerView epoxyRecyclerView = fragmentRewardsPreferenceDetailsBinding.D;
                Intrinsics.e(epoxyRecyclerView);
                epoxyRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$adjustOverScrollModeAndFragmentHeightDependingOnContent$lambda$10$$inlined$doOnNextLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                        view.removeOnLayoutChangeListener(this);
                        EpoxyRecyclerView epoxyRecyclerView2 = epoxyRecyclerView;
                        Intrinsics.e(epoxyRecyclerView2);
                        RecyclerView.LayoutManager layoutManager = epoxyRecyclerView2.getLayoutManager();
                        Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int iC1 = ((LinearLayoutManager) layoutManager).c1();
                        RecyclerView.Adapter adapter = epoxyRecyclerView2.getAdapter();
                        Intrinsics.e(adapter);
                        if (iC1 == adapter.i() - 1) {
                            epoxyRecyclerView2.setOverScrollMode(2);
                            return;
                        }
                        epoxyRecyclerView2.setOverScrollMode(1);
                        View viewRequireView = rewardsPreferenceDetailsFragmentLegacy.requireView();
                        if (viewRequireView.getLayoutParams().height != -1) {
                            ViewGroup.LayoutParams layoutParams = viewRequireView.getLayoutParams();
                            layoutParams.height = -1;
                            viewRequireView.setLayoutParams(layoutParams);
                        }
                    }
                });
                return unit;
            case 22:
                PreferenceDetailsData preferenceDetailsData = (PreferenceDetailsData) obj;
                ((RewardsPreferenceDetailsViewModel) obj2).p.setValue(new RewardsPreferenceDetailsContract.ViewState.Content(preferenceDetailsData.f5747a, false, preferenceDetailsData.b));
                return unit;
            case 23:
                PreferenceDetailsData preferenceDetailsData2 = (PreferenceDetailsData) obj;
                MutableLiveData mutableLiveData = ((RewardsPushPreferenceDetailsViewModelLegacy) obj2).l;
                String str2 = preferenceDetailsData2.f5747a;
                mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(str2 != null ? new PlainText(str2) : null, preferenceDetailsData2.b, rewardsPreferenceDetailsErrorState, 28));
                return unit;
            case 24:
                AccountSettingsFragmentOld accountSettingsFragmentOld = (AccountSettingsFragmentOld) obj2;
                AccountSettingsContractOld.ViewState viewState2 = (AccountSettingsContractOld.ViewState) obj;
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                AccountHomeFooter accountHomeFooter = viewState2.e;
                AccountSettingsAppVersionData accountSettingsAppVersionData = viewState2.d;
                List list = viewState2.c;
                List list2 = viewState2.b;
                ArrayList arrayListD0 = accountHomeFooter != null ? CollectionsKt.d0(accountSettingsAppVersionData, CollectionsKt.d0(accountHomeFooter, CollectionsKt.c0(list, list2))) : CollectionsKt.d0(accountSettingsAppVersionData, CollectionsKt.c0(list, list2));
                AccountSettingsControllerOld accountSettingsControllerOld = accountSettingsFragmentOld.o;
                if (accountSettingsControllerOld == null) {
                    Intrinsics.p("controller");
                    throw null;
                }
                accountSettingsControllerOld.setData(arrayListD0);
                FragmentRewardsAccountDynamicBinding fragmentRewardsAccountDynamicBindingI1 = accountSettingsFragmentOld.I1();
                fragmentRewardsAccountDynamicBindingI1.M(viewState2);
                EpoxyRecyclerView epoxyRecyclerView2 = fragmentRewardsAccountDynamicBindingI1.z;
                epoxyRecyclerView2.post(new au.com.woolworths.feature.rewards.account.settings.e(epoxyRecyclerView2, i2));
                return unit;
            case 25:
                AccountSettingsViewModelOld accountSettingsViewModelOld = (AccountSettingsViewModelOld) obj2;
                AccountSettingsViewModelOld.v6(accountSettingsViewModelOld, accountSettingsViewModelOld.n, (RewardsPointsBalance) obj, null, null, false, false, 126);
                return unit;
            case 26:
                UnlockChristmasFundsBottomSheetFragment unlockChristmasFundsBottomSheetFragment = (UnlockChristmasFundsBottomSheetFragment) obj2;
                UnlockChristmasFundsContract.ViewState viewState3 = (UnlockChristmasFundsContract.ViewState) obj;
                KProperty[] kPropertyArr2 = UnlockChristmasFundsBottomSheetFragment.m;
                boolean z2 = viewState3.f5840a == UnlockChristmasFundsContract.UnlockState.e;
                Dialog dialog = unlockChristmasFundsBottomSheetFragment.getDialog();
                if (dialog != null) {
                    dialog.setCancelable(!z2);
                }
                LottieAnimationView lottieAnimationView = unlockChristmasFundsBottomSheetFragment.j;
                if (lottieAnimationView != null) {
                    if (z2) {
                        lottieAnimationView.h();
                    } else {
                        lottieAnimationView.o = false;
                        lottieAnimationView.k.m();
                    }
                }
                if (viewState3.f5840a == UnlockChristmasFundsContract.UnlockState.f) {
                    unlockChristmasFundsBottomSheetFragment.Q1().D.sendAccessibilityEvent(8);
                }
                return unit;
            case 27:
                EverydayExtraChoosePlanViewModel everydayExtraChoosePlanViewModel = (EverydayExtraChoosePlanViewModel) obj2;
                EverydayExtrasButtonInterface button = (EverydayExtrasButtonInterface) obj;
                Intrinsics.h(button, "button");
                int iOrdinal = button.getE().ordinal();
                if (iOrdinal == 0) {
                    everydayExtraChoosePlanViewModel.s6();
                    everydayExtraChoosePlanViewModel.x6(button.getD());
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String f = button.getF();
                    everydayExtraChoosePlanViewModel.w6(f != null ? f : "");
                }
                return unit;
            case 28:
                Intrinsics.h((ModalBottomSheetValue) obj, "it");
                int i13 = FinalGlanceBottomSheetActivity.z;
                return Boolean.valueOf(((EverydayExtraFinalGlanceContract.ViewState) ((FinalGlanceBottomSheetActivity) obj2).O4().h.getValue()).a());
            default:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.k(clearAndSetSemantics, ((EverydayExtrasFinalGlanceContentItem.TimelineBreakdownItem) obj2).d);
                return unit;
        }
    }

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
