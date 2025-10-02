package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.tag.d;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroid/webkit/WebView;", "webView", "", "saveCreditCard", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardContract$ViewState;", "viewState", "wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddCreditCardModalKt {
    public static final void a(final ModalBottomSheetData.AddCreditCard bottomSheetData, SheetState sheetState, final Function1 onDismissModal, PaymentFlowTypeData paymentFlowTypeData, Modifier modifier, AddCreditCardViewModel addCreditCardViewModel, Composer composer, int i) {
        int i2;
        final AddCreditCardViewModel addCreditCardViewModel2;
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        AddCreditCardViewModel addCreditCardViewModel3;
        Intrinsics.h(bottomSheetData, "bottomSheetData");
        Intrinsics.h(sheetState, "sheetState");
        Intrinsics.h(onDismissModal, "onDismissModal");
        ComposerImpl composerImplV = composer.v(-1171932658);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(bottomSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(sheetState) : composerImplV.I(sheetState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDismissModal) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.r(paymentFlowTypeData.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i2;
        }
        if ((74899 & i4) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            addCreditCardViewModel3 = addCreditCardViewModel;
        } else {
            composerImplV.u0();
            int i5 = i & 1;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i5 == 0 || composerImplV.c0()) {
                composerImplV.o(5004770);
                boolean z = (i4 & 7168) == 2048;
                Object objG = composerImplV.G();
                if (z || objG == composer$Companion$Empty$1) {
                    objG = new a(paymentFlowTypeData, 0);
                    composerImplV.A(objG);
                }
                Function1 function1 = (Function1) objG;
                composerImplV.V(false);
                composerImplV.F(-83599083);
                ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composerImplV);
                if (viewModelStoreOwnerA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                HiltViewModelFactory hiltViewModelFactoryA = HiltViewModelKt.a(viewModelStoreOwnerA, composerImplV);
                MutableCreationExtras mutableCreationExtrasA = viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? HiltViewModelExtensions.a(((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras(), function1) : HiltViewModelExtensions.a(CreationExtras.Empty.b, function1);
                composerImplV.F(1729797275);
                ViewModel viewModelB = ViewModelKt.b(AddCreditCardViewModel.class, viewModelStoreOwnerA, hiltViewModelFactoryA, mutableCreationExtrasA, composerImplV);
                composerImplV.V(false);
                composerImplV.V(false);
                int i6 = i4 & (-458753);
                addCreditCardViewModel2 = (AddCreditCardViewModel) viewModelB;
                modifier2 = Modifier.Companion.d;
                i3 = i6;
            } else {
                composerImplV.j();
                int i7 = i4 & (-458753);
                addCreditCardViewModel2 = addCreditCardViewModel;
                i3 = i7;
                modifier2 = modifier;
            }
            composerImplV.W();
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG2;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(addCreditCardViewModel2);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new AddCreditCardModalKt$AddCreditCardModal$2$1(addCreditCardViewModel2, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG3);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(addCreditCardViewModel2);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new AddCreditCardModalKt$AddCreditCardModal$3$1(0, addCreditCardViewModel2, AddCreditCardViewModel.class, "onDismiss", "onDismiss()V", 0);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            ModalBottomSheetKt.a((Function0) ((KFunction) objG4), modifier2, sheetState, null, DragHandleBehaviour.e, 0L, 0L, ComposableLambdaKt.c(-718034237, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th;
                    final MutableState mutableState;
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    int i8 = iIntValue & 17;
                    Unit unit = Unit.f24250a;
                    if (i8 == 16 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    composer2.o(1849434622);
                    Object objG5 = composer2.G();
                    Object obj4 = Composer.Companion.f1624a;
                    if (objG5 == obj4) {
                        objG5 = SnapshotStateKt.f(null);
                        composer2.A(objG5);
                    }
                    MutableState mutableState2 = (MutableState) objG5;
                    Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                    if (objE == obj4) {
                        objE = SnapshotStateKt.f(Boolean.TRUE);
                        composer2.A(objE);
                    }
                    final MutableState mutableState3 = (MutableState) objE;
                    composer2.l();
                    final AddCreditCardViewModel addCreditCardViewModel4 = addCreditCardViewModel2;
                    final MutableState mutableStateA = FlowExtKt.a(addCreditCardViewModel4.n, composer2);
                    String strC = StringResources_androidKt.c(composer2, R.string.connection_error_msg);
                    String strC2 = StringResources_androidKt.c(composer2, R.string.add_credit_card_snackbar_server_error_message);
                    LoadingState loadingState = ((AddCreditCardContract.ViewState) mutableStateA.getD()).f8328a;
                    composer2.o(-1633490746);
                    boolean zN = composer2.n(mutableStateA);
                    Object objG6 = composer2.G();
                    final SnackbarHostState snackbarHostState2 = snackbarHostState;
                    if (zN || objG6 == obj4) {
                        objG6 = new AddCreditCardModalKt$AddCreditCardModal$4$1$1(snackbarHostState2, mutableStateA, null);
                        composer2.A(objG6);
                    }
                    composer2.l();
                    EffectsKt.e(composer2, loadingState, (Function2) objG6);
                    Flow flow = addCreditCardViewModel4.o;
                    composer2.o(-1224400529);
                    boolean zI3 = composer2.I(addCreditCardViewModel4) | composer2.n(onDismissModal) | composer2.n(strC) | composer2.n(strC2);
                    Object objG7 = composer2.G();
                    if (zI3 || objG7 == obj4) {
                        th = null;
                        Object addCreditCardModalKt$AddCreditCardModal$4$2$1 = new AddCreditCardModalKt$AddCreditCardModal$4$2$1(addCreditCardViewModel2, onDismissModal, snackbarHostState, strC, strC2, mutableState2, null);
                        mutableState = mutableState2;
                        composer2.A(addCreditCardModalKt$AddCreditCardModal$4$2$1);
                        objG7 = addCreditCardModalKt$AddCreditCardModal$4$2$1;
                    } else {
                        th = null;
                        mutableState = mutableState2;
                    }
                    composer2.l();
                    EffectsKt.e(composer2, flow, (Function2) objG7);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierD = ComposedModifierKt.d(composer2, companion);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    if (composer2.w() == null) {
                        ComposablesKt.b();
                        throw th;
                    }
                    composer2.i();
                    if (composer2.getO()) {
                        composer2.K(function0);
                    } else {
                        composer2.e();
                    }
                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    final ModalBottomSheetData.AddCreditCard addCreditCard = bottomSheetData;
                    MutableState mutableState4 = mutableState;
                    ScaffoldKt.a(null, ComposableLambdaKt.c(-1213627975, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            Composer composer3 = (Composer) obj5;
                            if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else {
                                float f = 0;
                                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                                String str = addCreditCard.f8367a;
                                final AddCreditCardViewModel addCreditCardViewModel5 = addCreditCardViewModel4;
                                TopNavBarKt.a(str, null, 0L, 0L, 0L, paddingValuesImpl, null, ComposableLambdaKt.c(-300130681, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$3$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj7, Object obj8) {
                                        Composer composer4 = (Composer) obj7;
                                        if ((((Number) obj8).intValue() & 3) == 2 && composer4.c()) {
                                            composer4.j();
                                        } else {
                                            ImageVector imageVector = CoreTheme.e(composer4).f4879a.G;
                                            String strC3 = StringResources_androidKt.c(composer4, R.string.add_credit_card_modal_close_caption);
                                            composer4.o(5004770);
                                            AddCreditCardViewModel addCreditCardViewModel6 = addCreditCardViewModel5;
                                            boolean zI4 = composer4.I(addCreditCardViewModel6);
                                            Object objG8 = composer4.G();
                                            if (zI4 || objG8 == Composer.Companion.f1624a) {
                                                AddCreditCardModalKt$AddCreditCardModal$4$3$1$1$1$1 addCreditCardModalKt$AddCreditCardModal$4$3$1$1$1$1 = new AddCreditCardModalKt$AddCreditCardModal$4$3$1$1$1$1(0, addCreditCardViewModel6, AddCreditCardViewModel.class, "onDismiss", "onDismiss()V", 0);
                                                composer4.A(addCreditCardModalKt$AddCreditCardModal$4$3$1$1$1$1);
                                                objG8 = addCreditCardModalKt$AddCreditCardModal$4$3$1$1$1$1;
                                            }
                                            composer4.l();
                                            IconButtonKt.c(imageVector, strC3, (Function0) ((KFunction) objG8), null, false, null, 0L, composer4, 0, 120);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer3), null, composer3, 102236160, 702);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), ComposableLambdaKt.c(1209477592, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            Composer composer3 = (Composer) obj5;
                            if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else if (((AddCreditCardContract.ViewState) mutableStateA.getD()).d) {
                                String str = addCreditCard.f8367a;
                                composer3.o(5004770);
                                final AddCreditCardViewModel addCreditCardViewModel5 = addCreditCardViewModel4;
                                boolean zI4 = composer3.I(addCreditCardViewModel5);
                                Object objG8 = composer3.G();
                                if (zI4 || objG8 == Composer.Companion.f1624a) {
                                    objG8 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.b
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Object value;
                                            Object value2;
                                            AddCreditCardViewModel addCreditCardViewModel6 = addCreditCardViewModel5;
                                            BufferedChannel bufferedChannel = addCreditCardViewModel6.m;
                                            PaymentFlowTypeData flowType = addCreditCardViewModel6.e;
                                            AddCreditCardAnalyticsTracker addCreditCardAnalyticsTracker = addCreditCardViewModel6.i;
                                            addCreditCardViewModel6.k = AddCreditCardViewModel.WebOperation.e;
                                            MutableStateFlow mutableStateFlow = addCreditCardViewModel6.l;
                                            PageResult pageResult = ((AddCreditCardContract.ViewState) mutableStateFlow.getValue()).b;
                                            PageResult.Success success = pageResult instanceof PageResult.Success ? (PageResult.Success) pageResult : null;
                                            if (success != null) {
                                                AnalyticsData analyticsData = ((AddCreditCardResponse) success.f8285a).e;
                                                addCreditCardAnalyticsTracker.getClass();
                                                AnalyticsManager analyticsManager = addCreditCardAnalyticsTracker.f8322a;
                                                Intrinsics.h(flowType, "flowType");
                                                Intrinsics.h(analyticsData, "analyticsData");
                                                analyticsManager.g(AnalyticsDataKt.b(AddCreditCardAnalyticsTracker.a(flowType), analyticsData));
                                                do {
                                                    value = mutableStateFlow.getValue();
                                                } while (!mutableStateFlow.d(value, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value, LoadingState.f, null, null, false, 14)));
                                                if (addCreditCardViewModel6.h.isConnected()) {
                                                    bufferedChannel.k(AddCreditCardContract.Action.SubmitForm.f8326a);
                                                } else {
                                                    bufferedChannel.k(AddCreditCardContract.Action.SnackBarConnectionError.f8324a);
                                                    do {
                                                        value2 = mutableStateFlow.getValue();
                                                    } while (!mutableStateFlow.d(value2, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value2, LoadingState.d, null, null, false, 14)));
                                                    analyticsManager.g((Event) AddCreditCardAnalyticsTracker.a(flowType).h.f.getD());
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer3.A(objG8);
                                }
                                composer3.l();
                                float f = 16;
                                PrimaryButtonKt.a(str, (Function0) objG8, PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), f, BitmapDescriptorFactory.HUE_RED, f, f, 2), false, null, null, null, null, composer3, KyberEngine.KyberPolyBytes, 248);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), ComposableLambdaKt.c(-662384137, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$3$3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            Composer composer3 = (Composer) obj5;
                            if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else {
                                SnackbarHostKt.b(snackbarHostState2, null, composer3, 6, 2);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), 0L, null, ComposableLambdaKt.c(-1753514480, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$3$4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            PaddingValues it = (PaddingValues) obj5;
                            Composer composer3 = (Composer) obj6;
                            int iIntValue2 = ((Number) obj7).intValue();
                            Intrinsics.h(it, "it");
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= composer3.n(it) ? 4 : 2;
                            }
                            if ((iIntValue2 & 19) == 18 && composer3.c()) {
                                composer3.j();
                            } else {
                                AddCreditCardContract.ViewState viewState = (AddCreditCardContract.ViewState) mutableStateA.getD();
                                MutableState mutableState5 = mutableState3;
                                boolean zBooleanValue = ((Boolean) mutableState5.getD()).booleanValue();
                                composer3.o(-1633490746);
                                AddCreditCardViewModel addCreditCardViewModel5 = addCreditCardViewModel4;
                                boolean zI4 = composer3.I(addCreditCardViewModel5);
                                Object objG8 = composer3.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                if (zI4 || objG8 == composer$Companion$Empty$12) {
                                    objG8 = new c(1, addCreditCardViewModel5, mutableState5);
                                    composer3.A(objG8);
                                }
                                Function1 function12 = (Function1) objG8;
                                composer3.l();
                                composer3.o(-1746271574);
                                boolean zI5 = composer3.I(addCreditCardViewModel5);
                                Object objG9 = composer3.G();
                                if (zI5 || objG9 == composer$Companion$Empty$12) {
                                    objG9 = new androidx.lifecycle.compose.b(25, addCreditCardViewModel5, mutableState5, mutableState);
                                    composer3.A(objG9);
                                }
                                Function1 function13 = (Function1) objG9;
                                composer3.l();
                                composer3.o(5004770);
                                AddCreditCardViewModel addCreditCardViewModel6 = addCreditCardViewModel4;
                                boolean zI6 = composer3.I(addCreditCardViewModel6);
                                Object objG10 = composer3.G();
                                if (zI6 || objG10 == composer$Companion$Empty$12) {
                                    AddCreditCardModalKt$AddCreditCardModal$4$3$4$3$1 addCreditCardModalKt$AddCreditCardModal$4$3$4$3$1 = new AddCreditCardModalKt$AddCreditCardModal$4$3$4$3$1(0, addCreditCardViewModel6, AddCreditCardViewModel.class, "onPageLoadFinished", "onPageLoadFinished()V", 0);
                                    composer3.A(addCreditCardModalKt$AddCreditCardModal$4$3$4$3$1);
                                    objG10 = addCreditCardModalKt$AddCreditCardModal$4$3$4$3$1;
                                }
                                composer3.l();
                                Function0 function02 = (Function0) ((KFunction) objG10);
                                composer3.o(5004770);
                                AddCreditCardViewModel addCreditCardViewModel7 = addCreditCardViewModel4;
                                boolean zI7 = composer3.I(addCreditCardViewModel7);
                                Object objG11 = composer3.G();
                                if (zI7 || objG11 == composer$Companion$Empty$12) {
                                    AddCreditCardModalKt$AddCreditCardModal$4$3$4$4$1 addCreditCardModalKt$AddCreditCardModal$4$3$4$4$1 = new AddCreditCardModalKt$AddCreditCardModal$4$3$4$4$1(2, addCreditCardViewModel7, AddCreditCardViewModel.class, "onPageLoadConnectionError", "onPageLoadConnectionError(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                    composer3.A(addCreditCardModalKt$AddCreditCardModal$4$3$4$4$1);
                                    objG11 = addCreditCardModalKt$AddCreditCardModal$4$3$4$4$1;
                                }
                                composer3.l();
                                Function2 function22 = (Function2) ((KFunction) objG11);
                                composer3.o(5004770);
                                AddCreditCardViewModel addCreditCardViewModel8 = addCreditCardViewModel4;
                                boolean zI8 = composer3.I(addCreditCardViewModel8);
                                Object objG12 = composer3.G();
                                if (zI8 || objG12 == composer$Companion$Empty$12) {
                                    objG12 = new AddCreditCardModalKt$AddCreditCardModal$4$3$4$5$1(2, addCreditCardViewModel8, AddCreditCardViewModel.class, "onPageLoadServerError", "onPageLoadServerError(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                    composer3.A(objG12);
                                }
                                composer3.l();
                                Function2 function23 = (Function2) ((KFunction) objG12);
                                composer3.o(5004770);
                                AddCreditCardViewModel addCreditCardViewModel9 = addCreditCardViewModel4;
                                boolean zI9 = composer3.I(addCreditCardViewModel9);
                                Object objG13 = composer3.G();
                                if (zI9 || objG13 == composer$Companion$Empty$12) {
                                    AddCreditCardModalKt$AddCreditCardModal$4$3$4$6$1 addCreditCardModalKt$AddCreditCardModal$4$3$4$6$1 = new AddCreditCardModalKt$AddCreditCardModal$4$3$4$6$1(0, addCreditCardViewModel9, AddCreditCardViewModel.class, "fetchPage", "fetchPage()V", 0);
                                    composer3.A(addCreditCardModalKt$AddCreditCardModal$4$3$4$6$1);
                                    objG13 = addCreditCardModalKt$AddCreditCardModal$4$3$4$6$1;
                                }
                                composer3.l();
                                AddCreditCardContentKt.a(viewState, zBooleanValue, function12, function13, function02, function22, function23, (Function0) ((KFunction) objG13), PaddingKt.e(Modifier.Companion.d, it), composer3, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), composer2, 12586416, 113);
                    composer2.o(-1547336916);
                    if (((AddCreditCardContract.ViewState) mutableStateA.getD()).f8328a == LoadingState.f) {
                        composer2.o(1849434622);
                        Object objG8 = composer2.G();
                        if (objG8 == obj4) {
                            objG8 = new h(20);
                            composer2.A(objG8);
                        }
                        composer2.l();
                        WappleLoadingScreenKt.a(0, 0, composer2, ClickableKt.d(companion, false, null, null, (Function0) objG8, 7));
                    }
                    composer2.l();
                    composer2.f();
                    composer2.o(5004770);
                    Object objG9 = composer2.G();
                    if (objG9 == obj4) {
                        objG9 = new a(mutableState4, 1);
                        composer2.A(objG9);
                    }
                    composer2.l();
                    EffectsKt.c(unit, (Function1) objG9, composer2);
                    return unit;
                }
            }, composerImplV), composerImplV, ((i3 >> 9) & 112) | 12607488 | ((i3 << 3) & 896), 104);
            modifier3 = modifier2;
            addCreditCardViewModel3 = addCreditCardViewModel2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(bottomSheetData, sheetState, onDismissModal, paymentFlowTypeData, modifier3, addCreditCardViewModel3, i);
        }
    }
}
