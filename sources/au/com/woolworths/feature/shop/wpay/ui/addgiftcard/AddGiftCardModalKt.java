package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import android.content.Context;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContract;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardContract$ViewState;", "viewState", "", "saveGiftCard", "", "pin", "giftCardNumber", "wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddGiftCardModalKt {
    public static final void a(final ModalBottomSheetData.AddGiftCard bottomSheetData, final Function1 onDismissAddGiftCardModal, Modifier modifier, AddGiftCardViewModel addGiftCardViewModel, SheetState sheetState, Composer composer, int i) {
        int i2;
        AddGiftCardViewModel addGiftCardViewModel2;
        int i3;
        Modifier modifier2;
        final AddGiftCardViewModel addGiftCardViewModel3;
        Modifier modifier3;
        AddGiftCardViewModel addGiftCardViewModel4;
        Intrinsics.h(bottomSheetData, "bottomSheetData");
        Intrinsics.h(onDismissAddGiftCardModal, "onDismissAddGiftCardModal");
        ComposerImpl composerImplV = composer.v(-812097533);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(bottomSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onDismissAddGiftCardModal) ? 32 : 16;
        }
        int i4 = i2 | KyberEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? composerImplV.n(sheetState) : composerImplV.I(sheetState) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            addGiftCardViewModel4 = addGiftCardViewModel;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composerImplV);
                if (viewModelStoreOwnerA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                addGiftCardViewModel2 = (AddGiftCardViewModel) ViewModelKt.a(viewModelStoreOwnerA, Reflection.f24268a.b(AddGiftCardViewModel.class), null, viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b);
                i3 = i4 & (-7169);
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                i3 = i4 & (-7169);
                modifier2 = modifier;
                addGiftCardViewModel2 = addGiftCardViewModel;
            }
            composerImplV.W();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(addGiftCardViewModel2);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                AddGiftCardModalKt$AddGiftCardModal$1$1 addGiftCardModalKt$AddGiftCardModal$1$1 = new AddGiftCardModalKt$AddGiftCardModal$1$1(0, addGiftCardViewModel2, AddGiftCardViewModel.class, "onDismiss", "onDismiss()V", 0);
                addGiftCardViewModel3 = addGiftCardViewModel2;
                composerImplV.A(addGiftCardModalKt$AddGiftCardModal$1$1);
                objG2 = addGiftCardModalKt$AddGiftCardModal$1$1;
            } else {
                addGiftCardViewModel3 = addGiftCardViewModel2;
            }
            composerImplV.V(false);
            ModalBottomSheetKt.a((Function0) ((KFunction) objG2), modifier2, sheetState, null, DragHandleBehaviour.e, 0L, 0L, ComposableLambdaKt.c(482347896, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt$AddGiftCardModal$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        AddGiftCardViewModel addGiftCardViewModel5 = addGiftCardViewModel3;
                        final MutableState mutableStateA = FlowExtKt.a(addGiftCardViewModel5.j, composer2);
                        composer2.o(1849434622);
                        Object objG3 = composer2.G();
                        Object obj4 = Composer.Companion.f1624a;
                        if (objG3 == obj4) {
                            objG3 = SnapshotStateKt.f(Boolean.TRUE);
                            composer2.A(objG3);
                        }
                        final MutableState mutableState = (MutableState) objG3;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                        if (objE == obj4) {
                            objE = SnapshotStateKt.f("");
                            composer2.A(objE);
                        }
                        final MutableState mutableState2 = (MutableState) objE;
                        Object objE2 = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                        if (objE2 == obj4) {
                            objE2 = SnapshotStateKt.f("");
                            composer2.A(objE2);
                        }
                        final MutableState mutableState3 = (MutableState) objE2;
                        composer2.l();
                        String strC = StringResources_androidKt.c(composer2, R.string.connection_error_msg);
                        String strC2 = StringResources_androidKt.c(composer2, R.string.add_gift_card_snackbar_server_error_msg);
                        LoadingState loadingState = ((AddGiftCardContract.ViewState) mutableStateA.getD()).f8340a;
                        composer2.o(-1633490746);
                        boolean zN = composer2.n(mutableStateA);
                        Object objG4 = composer2.G();
                        final SnackbarHostState snackbarHostState2 = snackbarHostState;
                        if (zN || objG4 == obj4) {
                            objG4 = new AddGiftCardModalKt$AddGiftCardModal$2$1$1(snackbarHostState2, mutableStateA, null);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        EffectsKt.e(composer2, loadingState, (Function2) objG4);
                        Flow flow = addGiftCardViewModel5.k;
                        composer2.o(-1224400529);
                        boolean zI2 = composer2.I(addGiftCardViewModel5) | composer2.n(onDismissAddGiftCardModal) | composer2.n(strC) | composer2.n(strC2);
                        Object objG5 = composer2.G();
                        if (zI2 || objG5 == obj4) {
                            objG5 = new AddGiftCardModalKt$AddGiftCardModal$2$2$1(addGiftCardViewModel3, onDismissAddGiftCardModal, snackbarHostState, strC, strC2, null);
                            composer2.A(objG5);
                        }
                        composer2.l();
                        EffectsKt.e(composer2, flow, (Function2) objG5);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
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
                        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer2.x(CompositionLocalsKt.p);
                        final ModalBottomSheetData.AddGiftCard addGiftCard = bottomSheetData;
                        final AddGiftCardViewModel addGiftCardViewModel6 = addGiftCardViewModel3;
                        ScaffoldKt.a(null, ComposableLambdaKt.c(-1357949714, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt$AddGiftCardModal$2$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    float f = 0;
                                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                                    String str = addGiftCard.f8368a;
                                    final AddGiftCardViewModel addGiftCardViewModel7 = addGiftCardViewModel6;
                                    TopNavBarKt.a(str, null, 0L, 0L, 0L, paddingValuesImpl, null, ComposableLambdaKt.c(-383324612, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt$AddGiftCardModal$2$3$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj7, Object obj8) {
                                            Composer composer4 = (Composer) obj7;
                                            if ((((Number) obj8).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).f4879a.G;
                                                String strC3 = StringResources_androidKt.c(composer4, R.string.checkout_payment_add_gift_card_modal_close_caption);
                                                composer4.o(5004770);
                                                AddGiftCardViewModel addGiftCardViewModel8 = addGiftCardViewModel7;
                                                boolean zI3 = composer4.I(addGiftCardViewModel8);
                                                Object objG6 = composer4.G();
                                                if (zI3 || objG6 == Composer.Companion.f1624a) {
                                                    AddGiftCardModalKt$AddGiftCardModal$2$3$1$1$1$1 addGiftCardModalKt$AddGiftCardModal$2$3$1$1$1$1 = new AddGiftCardModalKt$AddGiftCardModal$2$3$1$1$1$1(0, addGiftCardViewModel8, AddGiftCardViewModel.class, "onDismiss", "onDismiss()V", 0);
                                                    composer4.A(addGiftCardModalKt$AddGiftCardModal$2$3$1$1$1$1);
                                                    objG6 = addGiftCardModalKt$AddGiftCardModal$2$3$1$1$1$1;
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC3, (Function0) ((KFunction) objG6), null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 102236160, 702);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), ComposableLambdaKt.c(319073613, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt$AddGiftCardModal$2$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String str = addGiftCard.f8368a;
                                    composer3.o(-1224400529);
                                    boolean zN2 = composer3.n(softwareKeyboardController) | composer3.I(addGiftCardViewModel6);
                                    Object objG6 = composer3.G();
                                    if (zN2 || objG6 == Composer.Companion.f1624a) {
                                        final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                                        final AddGiftCardViewModel addGiftCardViewModel7 = addGiftCardViewModel6;
                                        final MutableState mutableState4 = mutableState3;
                                        final MutableState mutableState5 = mutableState2;
                                        final MutableState mutableState6 = mutableState;
                                        Function0 function02 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.b
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                Object value4;
                                                LoadingState loadingState2;
                                                SoftwareKeyboardController softwareKeyboardController3 = softwareKeyboardController2;
                                                if (softwareKeyboardController3 != null) {
                                                    softwareKeyboardController3.b();
                                                }
                                                String cardNumber = (String) mutableState4.getD();
                                                String pin = (String) mutableState5.getD();
                                                boolean zBooleanValue = ((Boolean) mutableState6.getD()).booleanValue();
                                                AddGiftCardViewModel addGiftCardViewModel8 = addGiftCardViewModel7;
                                                MutableStateFlow mutableStateFlow = addGiftCardViewModel8.h;
                                                Intrinsics.h(cardNumber, "cardNumber");
                                                Intrinsics.h(pin, "pin");
                                                AddGiftCardAnalyticsTracker addGiftCardAnalyticsTracker = addGiftCardViewModel8.g;
                                                addGiftCardAnalyticsTracker.f8335a.g(zBooleanValue ? (Event) AddGiftCardAnalyticsTracker.a().g.e.getD() : (Event) AddGiftCardAnalyticsTracker.a().g.f.getD());
                                                if (cardNumber.length() == 0 || pin.length() == 0) {
                                                    Context context = addGiftCardViewModel8.e;
                                                    String description = context.getString(R.string.checkout_payment_add_gift_card_modal_card_number_error);
                                                    Intrinsics.g(description, "getString(...)");
                                                    String string = context.getString(R.string.checkout_payment_add_gift_card_modal_pin_error);
                                                    Intrinsics.g(string, "getString(...)");
                                                    if (cardNumber.length() == 0 && pin.length() == 0) {
                                                        do {
                                                            value3 = mutableStateFlow.getValue();
                                                        } while (!mutableStateFlow.d(value3, AddGiftCardContract.ViewState.a((AddGiftCardContract.ViewState) value3, null, true, true, 3)));
                                                        description = androidx.camera.core.impl.b.o(description, ",", string);
                                                    } else if (cardNumber.length() == 0) {
                                                        do {
                                                            value2 = mutableStateFlow.getValue();
                                                        } while (!mutableStateFlow.d(value2, AddGiftCardContract.ViewState.a((AddGiftCardContract.ViewState) value2, null, false, true, 7)));
                                                    } else {
                                                        do {
                                                            value = mutableStateFlow.getValue();
                                                        } while (!mutableStateFlow.d(value, AddGiftCardContract.ViewState.a((AddGiftCardContract.ViewState) value, null, true, false, 11)));
                                                        description = string;
                                                    }
                                                    Intrinsics.h(description, "description");
                                                    AnalyticsManager analyticsManager = addGiftCardAnalyticsTracker.f8335a;
                                                    AddGiftCardAnalytics.Payment.Action action = AddGiftCardAnalyticsTracker.a().g;
                                                    action.getClass();
                                                    analyticsManager.g(new Event(action, description) { // from class: au.com.woolworths.analytics.supers.payments.AddGiftCardAnalytics$Payment$Action$addGiftCardScreenInlineError$1
                                                        public final Object d;

                                                        {
                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                            spreadBuilder.b(action.f4042a.f);
                                                            spreadBuilder.a(new Pair("event.Category", "Add Gift Card"));
                                                            spreadBuilder.a(new Pair("event.Action", "inline_error"));
                                                            androidx.constraintlayout.core.state.a.z("event.Label", "Gift card empty field error", spreadBuilder, "event.Description", description);
                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                        }

                                                        @Override // au.com.woolworths.analytics.Event
                                                        /* renamed from: d */
                                                        public final String getE() {
                                                            return "add_gift_card_screen_inline_error";
                                                        }

                                                        public final boolean equals(Object obj7) {
                                                            if (!(obj7 instanceof Event)) {
                                                                return false;
                                                            }
                                                            Event event = (Event) obj7;
                                                            return "add_gift_card_screen_inline_error".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                        }

                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                        @Override // au.com.woolworths.analytics.Event
                                                        public final Map getData() {
                                                            return this.d;
                                                        }
                                                    });
                                                } else {
                                                    do {
                                                        value4 = mutableStateFlow.getValue();
                                                        loadingState2 = LoadingState.f;
                                                        ((AddGiftCardContract.ViewState) value4).getClass();
                                                    } while (!mutableStateFlow.d(value4, new AddGiftCardContract.ViewState(loadingState2, null, false, false)));
                                                    BuildersKt.c(androidx.lifecycle.ViewModelKt.a(addGiftCardViewModel8), null, null, new AddGiftCardViewModel$addGiftCardToAccount$2(addGiftCardViewModel8, cardNumber, pin, zBooleanValue, null), 3);
                                                }
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer3.A(function02);
                                        objG6 = function02;
                                    }
                                    composer3.l();
                                    float f = 16;
                                    PrimaryButtonKt.a(str, (Function0) objG6, PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), f, BitmapDescriptorFactory.HUE_RED, f, f, 2), false, null, null, null, null, composer3, KyberEngine.KyberPolyBytes, 248);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), ComposableLambdaKt.c(1996096940, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt$AddGiftCardModal$2$3$3
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
                        }, composer2), 0L, null, ComposableLambdaKt.c(1628156805, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt$AddGiftCardModal$2$3$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                PaddingValues it = (PaddingValues) obj5;
                                Composer composer3 = (Composer) obj6;
                                int iIntValue2 = ((Number) obj7).intValue();
                                Intrinsics.h(it, "it");
                                if ((iIntValue2 & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    AddGiftCardContract.ViewState viewState = (AddGiftCardContract.ViewState) mutableStateA.getD();
                                    MutableState mutableState4 = mutableState;
                                    boolean zBooleanValue = ((Boolean) mutableState4.getD()).booleanValue();
                                    MutableState mutableState5 = mutableState3;
                                    String str = (String) mutableState5.getD();
                                    MutableState mutableState6 = mutableState2;
                                    String str2 = (String) mutableState6.getD();
                                    composer3.o(5004770);
                                    Object objG6 = composer3.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                    if (objG6 == composer$Companion$Empty$12) {
                                        objG6 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState5, 16);
                                        composer3.A(objG6);
                                    }
                                    Function1 function1 = (Function1) objG6;
                                    Object objE3 = au.com.woolworths.android.onesite.a.e(composer3, 5004770);
                                    if (objE3 == composer$Companion$Empty$12) {
                                        objE3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState6, 17);
                                        composer3.A(objE3);
                                    }
                                    Function1 function12 = (Function1) objE3;
                                    composer3.l();
                                    composer3.o(5004770);
                                    AddGiftCardViewModel addGiftCardViewModel7 = addGiftCardViewModel6;
                                    boolean zI3 = composer3.I(addGiftCardViewModel7);
                                    Object objG7 = composer3.G();
                                    if (zI3 || objG7 == composer$Companion$Empty$12) {
                                        objG7 = new AddGiftCardModalKt$AddGiftCardModal$2$3$4$3$1(0, addGiftCardViewModel7, AddGiftCardViewModel.class, "onInputChange", "onInputChange()V", 0);
                                        composer3.A(objG7);
                                    }
                                    composer3.l();
                                    Function0 function02 = (Function0) ((KFunction) objG7);
                                    composer3.o(5004770);
                                    Object objG8 = composer3.G();
                                    if (objG8 == composer$Companion$Empty$12) {
                                        objG8 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState4, 18);
                                        composer3.A(objG8);
                                    }
                                    composer3.l();
                                    AddGiftCardContentKt.a(viewState, zBooleanValue, str, str2, function1, function12, function02, (Function1) objG8, null, composer3, 12804096);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12586416, 113);
                        composer2.o(-1485739270);
                        if (((AddGiftCardContract.ViewState) mutableStateA.getD()).f8340a == LoadingState.f) {
                            WappleLoadingScreenKt.a(0, 1, composer2, null);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 3) & 112) | 12607488 | ((i3 >> 6) & 896), 104);
            modifier3 = modifier2;
            addGiftCardViewModel4 = addGiftCardViewModel3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(bottomSheetData, onDismissAddGiftCardModal, modifier3, addGiftCardViewModel4, sheetState, i);
        }
    }
}
