package androidx.lifecycle.compose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebView;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import au.com.woolworths.analytics.supers.recipes.swapalternativeproducts.SwapAlternativeProductsAnalytics;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.authentication.LoginResult;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureOptions;
import au.com.woolworths.base.wallet.digipay.framesview.EpoxyCardCaptureFramesView;
import au.com.woolworths.base.wallet.digipay.framesview.FramesSDKConfig;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.cardcapture.FramesCardCaptureHtml;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.feature.product.list.ProductListInteractor;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonInterface;
import au.com.woolworths.feature.rewards.everydayextras.signup.databinding.LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayData;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WebViewAppInterface;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModel;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfigKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.compose.AsyncImagePainter;
import com.google.accompanist.permissions.MutablePermissionState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.f = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
        float f;
        Object objA;
        Object objA2;
        Object objA3;
        int i3 = this.d;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        Unit unit = Unit.f24250a;
        Object obj2 = this.f;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i3) {
            case 0:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final androidx.core.view.b bVar = new androidx.core.view.b(i6, (LifecycleResumePauseEffectScope) obj3, objectRef, (Function1) obj2);
                lifecycleOwner.getD().a(bVar);
                return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$34$lambda$33$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner.getD().c(bVar);
                        LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) objectRef.d;
                        if (lifecyclePauseOrDisposeEffectResult != null) {
                            lifecyclePauseOrDisposeEffectResult.a();
                        }
                    }
                };
            case 1:
                final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj4;
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                final androidx.core.view.b bVar2 = new androidx.core.view.b(i4, (LifecycleStartStopEffectScope) obj3, objectRef2, (Function1) obj2);
                lifecycleOwner2.getD().a(bVar2);
                return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner2.getD().c(bVar2);
                        LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef2.d;
                        if (lifecycleStopOrDisposeEffectResult != null) {
                            lifecycleStopOrDisposeEffectResult.a();
                        }
                    }
                };
            case 2:
                FragmentNavigator fragmentNavigator = (FragmentNavigator) obj4;
                Fragment fragment2 = (Fragment) obj3;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) obj;
                ArrayList arrayList = fragmentNavigator.g;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.c(((Pair) it.next()).d, fragment2.getTag())) {
                                i5 = 1;
                            }
                        }
                    }
                }
                if (lifecycleOwner3 != null && i5 == 0) {
                    Lifecycle d = fragment2.getViewLifecycleOwner().getD();
                    if (d.getD().compareTo(Lifecycle.State.f) >= 0) {
                        d.a((LifecycleObserver) fragmentNavigator.i.invoke(navBackStackEntry));
                    }
                }
                return unit;
            case 3:
                final AccessibilityManager accessibilityManager = (AccessibilityManager) obj4;
                final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = (AccessibilityManager.AccessibilityStateChangeListener) obj3;
                final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = (AccessibilityManager.TouchExplorationStateChangeListener) obj2;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperKt$observeTalkbackEnabled$lambda$40$lambda$39$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener2 = accessibilityStateChangeListener;
                        AccessibilityManager accessibilityManager2 = accessibilityManager;
                        accessibilityManager2.removeAccessibilityStateChangeListener(accessibilityStateChangeListener2);
                        accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    }
                };
            case 4:
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj3;
                Function0 function0 = (Function0) obj2;
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
                Intrinsics.h(KeyboardActions, "$this$KeyboardActions");
                if (StringsKt.k0(((TextFieldValue) obj4).f2127a.e).toString().length() != 0) {
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.b();
                    }
                    function0.invoke();
                }
                return unit;
            case 5:
                ProductListViewModel productListViewModel = (ProductListViewModel) obj3;
                ProductCard productCard = (ProductCard) obj;
                Intrinsics.h(productCard, "it");
                ((Function0) obj4).invoke();
                String ingredientName = ((IngredientCardApiData) obj2).getIngredientDetails();
                productListViewModel.getClass();
                Intrinsics.h(ingredientName, "ingredientName");
                Intrinsics.h(productCard, "productCard");
                ProductListInteractor productListInteractor = productListViewModel.e;
                List listA = productListInteractor.o;
                if (listA == null) {
                    listA = productListViewModel.I.a();
                }
                if (listA != null) {
                    ArrayList arrayListJ0 = CollectionsKt.J0(listA);
                    productListViewModel.h.g(SwapAlternativeProductsAnalytics.SwapAlternativeProducts.Action.d);
                    Iterator it2 = arrayListJ0.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            IngredientCardApiData ingredientCardApiData = next instanceof IngredientCardApiData ? (IngredientCardApiData) next : null;
                            if (Intrinsics.c(ingredientCardApiData != null ? ingredientCardApiData.getIngredientDetails() : null, ingredientName)) {
                                i = i5;
                            } else {
                                i5++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    int i7 = i + 1;
                    if (i7 < arrayListJ0.size() && (arrayListJ0.get(i7) instanceof ProductCard)) {
                        arrayListJ0.set(i7, productCard);
                        productListInteractor.o = CollectionsKt.G0(arrayListJ0);
                    }
                }
                return unit;
            case 6:
                au.com.woolworths.feature.product.list.legacy.ProductListViewModel productListViewModel2 = (au.com.woolworths.feature.product.list.legacy.ProductListViewModel) obj3;
                ProductCard productCard2 = (ProductCard) obj;
                Intrinsics.h(productCard2, "it");
                ((Function0) obj4).invoke();
                String ingredientName2 = ((au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) obj2).d;
                productListViewModel2.getClass();
                Intrinsics.h(ingredientName2, "ingredientName");
                Intrinsics.h(productCard2, "productCard");
                List listZ6 = productListViewModel2.z6();
                if (listZ6 != null) {
                    ArrayList arrayListJ02 = CollectionsKt.J0(listZ6);
                    productListViewModel2.g.g(SwapAlternativeProductsAnalytics.SwapAlternativeProducts.Action.d);
                    Iterator it3 = arrayListJ02.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next2 = it3.next();
                            au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData ingredientCardApiData2 = next2 instanceof au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData ? (au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData) next2 : null;
                            if (Intrinsics.c(ingredientCardApiData2 != null ? ingredientCardApiData2.d : null, ingredientName2)) {
                                i2 = i5;
                            } else {
                                i5++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    int i8 = i2 + 1;
                    if (i8 < arrayListJ02.size() && (arrayListJ02.get(i8) instanceof ProductCard)) {
                        arrayListJ02.set(i8, productCard2);
                        productListViewModel2.e.D(CollectionsKt.G0(arrayListJ02));
                    }
                }
                return unit;
            case 7:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                FaqsContentKt.b(LazyColumn, (EverydayExtrasTab.EverydayExtrasFaqsTab) obj4, (EverydayExtrasTermsAndConditions) obj3, (Function1) obj2);
                return unit;
            case 8:
                ((Function2) obj4).invoke((ContentCta) obj, ((EverydayExtrasAlertDialog) obj3).e);
                ((MutableState) obj2).setValue(Boolean.FALSE);
                return unit;
            case 9:
                EverydayExtraChoosePlanBottomSheetViewModel everydayExtraChoosePlanBottomSheetViewModel = (EverydayExtraChoosePlanBottomSheetViewModel) obj4;
                Function0 function02 = (Function0) obj3;
                Function1 function1 = (Function1) obj2;
                EverydayExtrasButtonInterface it4 = (EverydayExtrasButtonInterface) obj;
                Intrinsics.h(it4, "it");
                int iOrdinal = it4.getE().ordinal();
                if (iOrdinal == 0) {
                    everydayExtraChoosePlanBottomSheetViewModel.x6(it4.getD());
                    EverydayExtraChoosePlanContract.ViewState.Content contentB = ((EverydayExtraChoosePlanContract.ViewState) everydayExtraChoosePlanBottomSheetViewModel.i.getValue()).b();
                    EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = contentB != null ? contentB.d : null;
                    if (subscribePlan != null) {
                        function1.invoke(subscribePlan);
                    }
                    function02.invoke();
                } else if (iOrdinal == 1) {
                    function02.invoke();
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String f2 = it4.getF();
                    everydayExtraChoosePlanBottomSheetViewModel.w6(f2 != null ? f2 : "");
                }
                return unit;
            case 10:
                WPayLoadingState wPayLoadingState = (WPayLoadingState) obj4;
                WPayData wPayData = (WPayData) obj3;
                Function0 function03 = (Function0) obj2;
                View it5 = (View) obj;
                Intrinsics.h(it5, "it");
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = (LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding) ViewDataBinding.m(it5);
                if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null && !epoxyCardCaptureFramesView.q && wPayLoadingState == WPayLoadingState.f) {
                    if ((wPayData != null ? wPayData.f6220a : null) != null) {
                        CardCaptureOptions cardCaptureOptions = wPayData.b;
                        FramesSDKConfig framesSDKConfig = wPayData.f6220a;
                        WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1 wPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1 = new WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1(function03);
                        epoxyCardCaptureFramesView.j = framesSDKConfig;
                        epoxyCardCaptureFramesView.l = cardCaptureOptions;
                        ViewParent parent = epoxyCardCaptureFramesView.getParent();
                        Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        epoxyCardCaptureFramesView.k = (ViewGroup) parent;
                        FramesCardCaptureHtml framesCardCaptureHtml = epoxyCardCaptureFramesView.n;
                        Intrinsics.h(framesCardCaptureHtml, "<this>");
                        String str = framesCardCaptureHtml.f4693a;
                        if (str.length() == 0) {
                            throw new IllegalStateException("HTML Data must not be empty");
                        }
                        String str2 = framesCardCaptureHtml.b;
                        if (!StringsKt.o(str, "cardNumberElement", false) || !StringsKt.o(str, "cardExpiryElement", false) || !StringsKt.o(str, "cardCVVElement", false) || !StringsKt.o(str, str2, false) || !StringsKt.o(str2, "ocr-button", false) || !StringsKt.o(str, "<div id='cardNumberElement'></div>", false)) {
                            throw new IllegalStateException("Frames htmlData is invalid");
                        }
                        if (epoxyCardCaptureFramesView.m.length() == 0) {
                            throw new IllegalStateException("Frames Option CSS must not be empty");
                        }
                        epoxyCardCaptureFramesView.o = wPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1;
                        FramesCardCaptureHtml framesCardCaptureHtml2 = epoxyCardCaptureFramesView.n;
                        Intrinsics.h(framesCardCaptureHtml2, "<this>");
                        String str3 = framesCardCaptureHtml2.f4693a;
                        int iC = StringsKt.C(str3, "<div id='cardNumberElement'></div>", 0, false, 6);
                        if (iC == -1) {
                            throw new IllegalStateException("Could not inject OCR button. Ensure html format is correct.");
                        }
                        StringBuilder sb = new StringBuilder(str3);
                        sb.insert(34 + iC, " <input type='image' id='ocr-button' src='camera-icon.png' onclick='android.onOcrButtonClick()' alt='Scan card'/> ");
                        String string = sb.toString();
                        Intrinsics.e(string);
                        FramesWebView.Callback callback = cardCaptureOptions.b.f4673a;
                        epoxyCardCaptureFramesView.e = false;
                        epoxyCardCaptureFramesView.d = callback;
                        epoxyCardCaptureFramesView.g = false;
                        epoxyCardCaptureFramesView.h = false;
                        epoxyCardCaptureFramesView.loadDataWithBaseURL("https://assets/", string, "text/html; charset=utf-8", "utf8", null);
                        epoxyCardCaptureFramesView.q = true;
                    }
                }
                return unit;
            case 11:
                final LifecycleOwner lifecycleOwner4 = (LifecycleOwner) obj4;
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect2, "$this$DisposableEffect");
                final androidx.core.view.c cVar = new androidx.core.view.c(i4, (ConfigActionContract.ViewState) obj3, (Function1) obj2);
                lifecycleOwner4.getD().a(cVar);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.ConfigActionScreenKt$ConfigActionScreen$lambda$3$lambda$2$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner4.getD().c(cVar);
                    }
                };
            case 12:
                final LifecycleOwner lifecycleOwner5 = (LifecycleOwner) obj4;
                DisposableEffectScope DisposableEffect3 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect3, "$this$DisposableEffect");
                final androidx.core.view.c cVar2 = new androidx.core.view.c(3, (MutablePermissionState) obj3, (Function0) obj2);
                lifecycleOwner5.getD().a(cVar2);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivityKt$CameraPermissionScreen$lambda$3$lambda$2$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner5.getD().c(cVar2);
                    }
                };
            case 13:
                final List list = (List) obj4;
                final Function1 function12 = (Function1) obj2;
                final MutableState mutableState = (MutableState) obj3;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                Intrinsics.h(LazyVerticalGrid, "$this$LazyVerticalGrid");
                LazyVerticalGrid.d(list.size(), null, null, new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt$PromotionGrid$1$invoke$lambda$2$lambda$1$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        list.get(((Number) obj5).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt$PromotionGrid$1$invoke$lambda$2$lambda$1$$inlined$itemsIndexed$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i9;
                        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj5;
                        final int iIntValue = ((Number) obj6).intValue();
                        Composer composer = (Composer) obj7;
                        int iIntValue2 = ((Number) obj8).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i9 = (composer.n(lazyGridItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i9 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i9 |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i9 & 1, (i9 & 147) != 146)) {
                            final ProductCard productCard3 = (ProductCard) list.get(iIntValue);
                            composer.o(156009412);
                            ProvidedValue providedValueB = CompositionLocalsKt.n.b(LayoutDirection.d);
                            final Function1 function13 = function12;
                            final MutableState mutableState2 = mutableState;
                            final List list2 = list;
                            CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(-101780444, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt$PromotionGrid$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj9, Object obj10) {
                                    Composer composer2 = (Composer) obj9;
                                    if ((((Number) obj10).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        final List list3 = list2;
                                        if (list3.size() == 1) {
                                            composer2.o(105749933);
                                            PromotionHeroCardKt.a(productCard3, function13, null, composer2, ProductCard.$stable);
                                            composer2.l();
                                        } else {
                                            composer2.o(105889123);
                                            composer2.o(-1746271574);
                                            final MutableState mutableState3 = mutableState2;
                                            boolean zN = composer2.n(mutableState3);
                                            final int i10 = iIntValue;
                                            boolean zR = zN | composer2.r(i10) | composer2.I(list3);
                                            Object objG = composer2.G();
                                            if (zR || objG == Composer.Companion.f1624a) {
                                                objG = new Function1<LayoutCoordinates, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageKt$PromotionGrid$1$1$1$1$1$1$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj11) {
                                                        LayoutCoordinates coordinates = (LayoutCoordinates) obj11;
                                                        Intrinsics.h(coordinates, "coordinates");
                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (coordinates.G(0L) & 4294967295L));
                                                        MutableState mutableState4 = mutableState3;
                                                        if (fIntBitsToFloat < ((PromotionPageGridState) mutableState4.getD()).b) {
                                                            int i11 = i10;
                                                            if (i11 % 2 != 0) {
                                                                i11--;
                                                            }
                                                            mutableState4.setValue(PromotionPageGridState.a((PromotionPageGridState) mutableState4.getD(), CollectionsKt.x0(i11, list3), BitmapDescriptorFactory.HUE_RED, 2));
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG);
                                            }
                                            composer2.l();
                                            PromotionCardKt.a(productCard3, function13, OnGloballyPositionedModifierKt.a(Modifier.Companion.d, (Function1) objG), composer2, ProductCard.$stable, 0);
                                            composer2.l();
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), composer, 56);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, 1229287273));
                return unit;
            case 14:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                return ClickableKt.d(conditional, false, (String) obj4, null, new au.com.woolworths.feature.rewards.card.overlay.ui.b(26, (Function1) obj2, (VideoData) obj3), 5);
            case 15:
                State state = (State) obj4;
                Function1 function13 = (Function1) obj2;
                MutableFloatState mutableFloatState = (MutableFloatState) obj3;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Intrinsics.h(layoutCoordinates, "layoutCoordinates");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.y(0L) & 4294967295L));
                if (mutableFloatState.a() == fIntBitsToFloat) {
                    f = fIntBitsToFloat;
                } else {
                    VideoAdPlayerState videoAdPlayerStateA = VideoAdPlayerState.a(((ContentPageContract.ViewState) state.getD()).k, false, false, 0L, false, false, fIntBitsToFloat, 31);
                    f = fIntBitsToFloat;
                    if (function13 != null) {
                        function13.invoke(videoAdPlayerStateA);
                    }
                }
                mutableFloatState.p(f);
                return unit;
            case 16:
                Intrinsics.h((QuickLinkCard) obj, "it");
                ((Function2) obj4).invoke((HorizontalListData) obj3, (QuickLinkCard) obj2);
                return unit;
            case 17:
                Function2 function2 = (Function2) obj4;
                HorizontalListData horizontalListData = (HorizontalListData) obj3;
                MoreCardData moreCardData = (MoreCardData) obj2;
                Intrinsics.h((MoreCardData) obj, "it");
                if (function2 != null) {
                    function2.invoke(horizontalListData, moreCardData);
                }
                return unit;
            case 18:
                Function2 function22 = (Function2) obj4;
                VerticalListData verticalListData = (VerticalListData) obj3;
                FullWidthContentCardData fullWidthContentCardData = (FullWidthContentCardData) obj2;
                Intrinsics.h((FullWidthContentCardData) obj, "it");
                if (function22 != null) {
                    function22.invoke(verticalListData, fullWidthContentCardData);
                }
                return unit;
            case 19:
                Function2 function23 = (Function2) obj4;
                VerticalListData verticalListData2 = (VerticalListData) obj3;
                InfoTileData infoTileData = (InfoTileData) obj2;
                Intrinsics.h((ActionData) obj, "it");
                if (function23 != null) {
                    function23.invoke(verticalListData2, infoTileData);
                }
                return unit;
            case 20:
                final MutableState mutableState2 = (MutableState) obj4;
                final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) obj3;
                final ExoPlayer exoPlayer = (ExoPlayer) obj2;
                DisposableEffectScope DisposableEffect4 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect4, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.CalibrationProgressVideoPlayerKt$CalibrationProgressVideoPlayer$lambda$6$lambda$5$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        ((LifecycleOwner) mutableState2.getD()).getD().c(lifecycleEventObserver);
                        ExoPlayer exoPlayer2 = exoPlayer;
                        if (exoPlayer2.x()) {
                            exoPlayer2.pause();
                        }
                        exoPlayer2.release();
                    }
                };
            case 21:
                Function1 function14 = (Function1) obj2;
                GuestLoginInteractorImpl guestLoginInteractorImpl = (GuestLoginInteractorImpl) obj4;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                LoginResult loginResult = (LoginResult) obj;
                if (function14 != null) {
                    function14.invoke(loginResult);
                }
                guestLoginInteractorImpl.b(loginResult, linkedHashMap);
                return unit;
            case 22:
                OrderCollectionParkingDetails orderCollectionParkingDetails = (OrderCollectionParkingDetails) obj4;
                String str4 = (String) obj3;
                Function0 function04 = (Function0) obj2;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                if (orderCollectionParkingDetails != null) {
                    SemanticsPropertiesKt.h(semantics, YU.a.A("open ", str4), new au.com.woolworths.feature.shop.homepage.presentation.lists.b(27, function04));
                }
                return unit;
            case 23:
                final List list2 = (List) obj4;
                final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj3;
                final Function1 function15 = (Function1) obj2;
                LazyGridScope LazyVerticalGrid2 = (LazyGridScope) obj;
                Intrinsics.h(LazyVerticalGrid2, "$this$LazyVerticalGrid");
                final RecipeCardSummaryConfig recipeCardSummaryConfigA = RecipeCardSummaryConfigKt.a(list2);
                final au.com.woolworths.feature.shop.modeselector.ui.b bVar3 = new au.com.woolworths.feature.shop.modeselector.ui.b(18);
                LazyVerticalGrid2.d(list2.size(), new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesList$1$invoke$lambda$5$lambda$4$$inlined$itemsIndexed$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int iIntValue = ((Number) obj5).intValue();
                        return bVar3.invoke(Integer.valueOf(iIntValue), list2.get(iIntValue));
                    }
                }, null, new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesList$1$invoke$lambda$5$lambda$4$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        list2.get(((Number) obj5).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesList$1$invoke$lambda$5$lambda$4$$inlined$itemsIndexed$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int i9;
                        Object obj9 = (LazyGridItemScope) obj5;
                        int iIntValue = ((Number) obj6).intValue();
                        Composer composer = (Composer) obj7;
                        int iIntValue2 = ((Number) obj8).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i9 = (composer.n(obj9) ? 4 : 2) | iIntValue2;
                        } else {
                            i9 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i9 |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i9 & 1, (i9 & 147) != 146)) {
                            final RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) list2.get(iIntValue);
                            composer.o(1170603497);
                            Integer numValueOf = Integer.valueOf(iIntValue / 2);
                            SnapshotStateMap snapshotStateMap2 = snapshotStateMap;
                            Object sharedIntrinsicHeightState = snapshotStateMap2.get(numValueOf);
                            if (sharedIntrinsicHeightState == null) {
                                sharedIntrinsicHeightState = new SharedIntrinsicHeightState();
                                snapshotStateMap2.put(numValueOf, sharedIntrinsicHeightState);
                            }
                            SharedIntrinsicHeightState sharedIntrinsicHeightState2 = (SharedIntrinsicHeightState) sharedIntrinsicHeightState;
                            composer.o(-1633490746);
                            final Function1 function16 = function15;
                            boolean zN = composer.n(function16) | composer.I(recipeCardSummaryData);
                            Object objG = composer.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesScreenKt$SavedRecipesList$1$1$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function16.invoke(recipeCardSummaryData);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            composer.l();
                            RecipeCardKt.a(recipeCardSummaryData, recipeCardSummaryConfigA, (Function0) objG, null, false, sharedIntrinsicHeightState2, composer, 24584, 8);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, 1229287273));
                return unit;
            case 24:
                final LifecycleOwner lifecycleOwner6 = (LifecycleOwner) obj4;
                DisposableEffectScope DisposableEffect5 = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect5, "$this$DisposableEffect");
                final androidx.core.view.c cVar3 = new androidx.core.view.c(4, (Function1) obj2, (SignUpError) obj3);
                lifecycleOwner6.getD().a(cVar3);
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt$ContentErrorUI$lambda$5$lambda$4$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner6.getD().c(cVar3);
                    }
                };
            case 25:
                WebView it6 = (WebView) obj;
                Intrinsics.h(it6, "it");
                it6.addJavascriptInterface(new WebViewAppInterface(new au.com.woolworths.feature.shop.wpay.ui.addcreditcard.c(i5, (AddCreditCardViewModel) obj4, (MutableState) obj3)), "appInterface");
                ((MutableState) obj2).setValue(it6);
                return unit;
            case 26:
                Function1 function16 = (Function1) obj2;
                String str5 = (String) obj4;
                FocusState focus = (FocusState) obj;
                Intrinsics.h(focus, "focus");
                if (((Boolean) ((MutableState) obj3).getD()).booleanValue()) {
                    function16.invoke(new WPayForOrderContract.UiEvent.GiftCard.Focus(str5, focus.a()));
                }
                return unit;
            case 27:
                String str6 = (String) obj4;
                Context context = (Context) obj3;
                String str7 = (String) obj2;
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                String str8 = str6 != null ? str6 : "";
                SemanticsPropertiesKt.k(clearAndSetSemantics, str8 + "\n" + ((Object) Markwon.b(context).d(str7)));
                return unit;
            case 28:
                Context context2 = (Context) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                AsyncImagePainter.State.Success it7 = (AsyncImagePainter.State.Success) obj;
                Intrinsics.h(it7, "it");
                Image image = it7.b.f13146a;
                if (image.getWidth() <= image.getHeight()) {
                    mutableState3.setValue(ContentScale.Companion.b);
                }
                Resources resources = context2.getResources();
                Intrinsics.g(resources, "getResources(...)");
                Drawable drawableA = Image_androidKt.a(image, resources);
                Bitmap bitmap = drawableA instanceof BitmapDrawable ? ((BitmapDrawable) drawableA).getBitmap() : null;
                if (bitmap != null) {
                    try {
                        objA = Integer.valueOf(bitmap.getPixel(0, 0));
                    } catch (Throwable th) {
                        objA = ResultKt.a(th);
                    }
                } else {
                    objA = null;
                }
                if (objA instanceof Result.Failure) {
                    objA = null;
                }
                Integer num = (Integer) objA;
                if (bitmap != null) {
                    try {
                        objA2 = Integer.valueOf(bitmap.getPixel(10, 0));
                    } catch (Throwable th2) {
                        objA2 = ResultKt.a(th2);
                    }
                } else {
                    objA2 = null;
                }
                if (objA2 instanceof Result.Failure) {
                    objA2 = null;
                }
                Integer num2 = (Integer) objA2;
                if (bitmap != null) {
                    try {
                        objA3 = Integer.valueOf(bitmap.getPixel(0, 10));
                    } catch (Throwable th3) {
                        objA3 = ResultKt.a(th3);
                    }
                } else {
                    objA3 = null;
                }
                if (objA3 instanceof Result.Failure) {
                    objA3 = null;
                }
                Integer num3 = (Intrinsics.c(num, num2) && Intrinsics.c(num, (Integer) objA3)) ? num : null;
                if (num3 != null) {
                    mutableState4.setValue(new Color(ColorKt.b(num3.intValue())));
                }
                return unit;
            default:
                Context context3 = (Context) obj2;
                ContentCta cta = (ContentCta) obj;
                Intrinsics.h(cta, "cta");
                ((OnboardingCoachMarkViewModel) obj4).getB().b.invoke(((ProgressiveCoachMarkContent) obj3).d, cta);
                String url = cta.getUrl();
                if (url != null) {
                    ContextExtKt.e(context3, url);
                }
                return unit;
        }
    }

    public /* synthetic */ b(Object obj, Function1 function1, Object obj2, int i) {
        this.d = i;
        this.e = obj;
        this.f = function1;
        this.g = obj2;
    }

    public /* synthetic */ b(Function1 function1, Object obj, Object obj2, int i) {
        this.d = i;
        this.f = function1;
        this.e = obj;
        this.g = obj2;
    }
}
