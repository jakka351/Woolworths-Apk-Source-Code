package au.com.woolworths.feature.shop.wpay.ui.wpay;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddPayPalAlert;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardResult;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardModalKt;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardResult;
import au.com.woolworths.feature.shop.wpay.ui.common.component.LoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import com.woolworths.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$ViewState;", "viewState", "Landroid/webkit/WebView;", "webView", "wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WPayForOrderScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LoadingState loadingState = LoadingState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LoadingState loadingState2 = LoadingState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(WPayForOrderContract.ViewState viewState, final SheetState sheetState, final WPayForOrderViewModel wPayForOrderViewModel, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-168859199);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(sheetState) : composerImplV.I(sheetState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(wPayForOrderViewModel) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            ModalBottomSheetData modalBottomSheetData = viewState.d;
            boolean z = true;
            if (modalBottomSheetData instanceof ModalBottomSheetData.AddCreditCard) {
                composerImplV.o(-1077298386);
                ModalBottomSheetData.AddCreditCard addCreditCard = (ModalBottomSheetData.AddCreditCard) modalBottomSheetData;
                PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.d;
                composerImplV.o(-1746271574);
                boolean zI = composerImplV.I(coroutineScope);
                int i3 = i2 & 112;
                if (i3 != 32 && ((i2 & 64) == 0 || !composerImplV.I(sheetState))) {
                    z = false;
                }
                boolean zI2 = zI | z | composerImplV.I(wPayForOrderViewModel);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == obj) {
                    final int i4 = 0;
                    objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i4) {
                                case 0:
                                    final AddCreditCardResult result = (AddCreditCardResult) obj2;
                                    Intrinsics.h(result, "result");
                                    Job jobC = BuildersKt.c(coroutineScope, null, null, new WPayForOrderScreenKt$WPayForOrderBottomSheet$1$1$1(sheetState, null), 3);
                                    final int i5 = 0;
                                    final WPayForOrderViewModel wPayForOrderViewModel2 = wPayForOrderViewModel;
                                    ((JobSupport) jobC).invokeOnCompletion(new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.k
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            Object value;
                                            WPayForOrderContract.ViewState viewState2;
                                            String str;
                                            Object value2;
                                            WPayForOrderContract.ViewState viewState3;
                                            LinkedHashMap linkedHashMapS;
                                            LinkedHashMap linkedHashMapS2;
                                            switch (i5) {
                                                case 0:
                                                    AddCreditCardResult result2 = (AddCreditCardResult) result;
                                                    WPayForOrderViewModel wPayForOrderViewModel3 = wPayForOrderViewModel2;
                                                    wPayForOrderViewModel3.getClass();
                                                    Intrinsics.h(result2, "result");
                                                    MutableStateFlow mutableStateFlow = wPayForOrderViewModel3.r;
                                                    do {
                                                        value = mutableStateFlow.getValue();
                                                        viewState2 = (WPayForOrderContract.ViewState) value;
                                                        if (result2 instanceof AddCreditCardResult.LinkedCard) {
                                                            str = ((AddCreditCardResult.LinkedCard) result2).f8330a;
                                                        } else if (result2 instanceof AddCreditCardResult.UnlinkedCard) {
                                                            str = ((AddCreditCardResult.UnlinkedCard) result2).f8332a;
                                                        } else {
                                                            if (!result2.equals(AddCreditCardResult.None.f8331a)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            str = viewState2.m;
                                                        }
                                                    } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, result2 instanceof AddCreditCardResult.UnlinkedCard ? SetsKt.h(viewState2.e, ((AddCreditCardResult.UnlinkedCard) result2).f8332a) : viewState2.e, null, null, null, false, null, null, null, str, 4071)));
                                                    if (!(result2 instanceof AddCreditCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel3, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                                default:
                                                    AddGiftCardResult result3 = (AddGiftCardResult) result;
                                                    WPayForOrderViewModel wPayForOrderViewModel4 = wPayForOrderViewModel2;
                                                    wPayForOrderViewModel4.getClass();
                                                    Intrinsics.h(result3, "result");
                                                    MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel4.r;
                                                    do {
                                                        value2 = mutableStateFlow2.getValue();
                                                        viewState3 = (WPayForOrderContract.ViewState) value2;
                                                        linkedHashMapS = MapsKt.s(viewState3.f);
                                                        if (result3 instanceof AddGiftCardResult.LinkedCard) {
                                                            String str2 = ((AddGiftCardResult.LinkedCard) result3).f8341a;
                                                            linkedHashMapS.put(str2, new GiftCardEdit.Linked(str2, "", true, false));
                                                        }
                                                        linkedHashMapS2 = MapsKt.s(viewState3.g);
                                                        if (result3 instanceof AddGiftCardResult.UnlinkedCard) {
                                                            AddGiftCardResult.UnlinkedCard unlinkedCard = (AddGiftCardResult.UnlinkedCard) result3;
                                                            String str3 = unlinkedCard.f8343a;
                                                            linkedHashMapS2.put(str3, new GiftCardEdit.Unlinked(str3, unlinkedCard.b, "", true, false));
                                                        }
                                                    } while (!mutableStateFlow2.d(value2, WPayForOrderContract.ViewState.a(viewState3, null, null, null, null, null, linkedHashMapS, linkedHashMapS2, null, false, null, null, null, null, 8087)));
                                                    if (!(result3 instanceof AddGiftCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel4, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final AddGiftCardResult addGiftCardResult = (AddGiftCardResult) obj2;
                                    Intrinsics.h(addGiftCardResult, "addGiftCardResult");
                                    Job jobC2 = BuildersKt.c(coroutineScope, null, null, new WPayForOrderScreenKt$WPayForOrderBottomSheet$2$1$1(sheetState, null), 3);
                                    final int i6 = 1;
                                    final WPayForOrderViewModel wPayForOrderViewModel3 = wPayForOrderViewModel;
                                    ((JobSupport) jobC2).invokeOnCompletion(new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.k
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            Object value;
                                            WPayForOrderContract.ViewState viewState2;
                                            String str;
                                            Object value2;
                                            WPayForOrderContract.ViewState viewState3;
                                            LinkedHashMap linkedHashMapS;
                                            LinkedHashMap linkedHashMapS2;
                                            switch (i6) {
                                                case 0:
                                                    AddCreditCardResult result2 = (AddCreditCardResult) addGiftCardResult;
                                                    WPayForOrderViewModel wPayForOrderViewModel32 = wPayForOrderViewModel3;
                                                    wPayForOrderViewModel32.getClass();
                                                    Intrinsics.h(result2, "result");
                                                    MutableStateFlow mutableStateFlow = wPayForOrderViewModel32.r;
                                                    do {
                                                        value = mutableStateFlow.getValue();
                                                        viewState2 = (WPayForOrderContract.ViewState) value;
                                                        if (result2 instanceof AddCreditCardResult.LinkedCard) {
                                                            str = ((AddCreditCardResult.LinkedCard) result2).f8330a;
                                                        } else if (result2 instanceof AddCreditCardResult.UnlinkedCard) {
                                                            str = ((AddCreditCardResult.UnlinkedCard) result2).f8332a;
                                                        } else {
                                                            if (!result2.equals(AddCreditCardResult.None.f8331a)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            str = viewState2.m;
                                                        }
                                                    } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, result2 instanceof AddCreditCardResult.UnlinkedCard ? SetsKt.h(viewState2.e, ((AddCreditCardResult.UnlinkedCard) result2).f8332a) : viewState2.e, null, null, null, false, null, null, null, str, 4071)));
                                                    if (!(result2 instanceof AddCreditCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel32, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                                default:
                                                    AddGiftCardResult result3 = (AddGiftCardResult) addGiftCardResult;
                                                    WPayForOrderViewModel wPayForOrderViewModel4 = wPayForOrderViewModel3;
                                                    wPayForOrderViewModel4.getClass();
                                                    Intrinsics.h(result3, "result");
                                                    MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel4.r;
                                                    do {
                                                        value2 = mutableStateFlow2.getValue();
                                                        viewState3 = (WPayForOrderContract.ViewState) value2;
                                                        linkedHashMapS = MapsKt.s(viewState3.f);
                                                        if (result3 instanceof AddGiftCardResult.LinkedCard) {
                                                            String str2 = ((AddGiftCardResult.LinkedCard) result3).f8341a;
                                                            linkedHashMapS.put(str2, new GiftCardEdit.Linked(str2, "", true, false));
                                                        }
                                                        linkedHashMapS2 = MapsKt.s(viewState3.g);
                                                        if (result3 instanceof AddGiftCardResult.UnlinkedCard) {
                                                            AddGiftCardResult.UnlinkedCard unlinkedCard = (AddGiftCardResult.UnlinkedCard) result3;
                                                            String str3 = unlinkedCard.f8343a;
                                                            linkedHashMapS2.put(str3, new GiftCardEdit.Unlinked(str3, unlinkedCard.b, "", true, false));
                                                        }
                                                    } while (!mutableStateFlow2.d(value2, WPayForOrderContract.ViewState.a(viewState3, null, null, null, null, null, linkedHashMapS, linkedHashMapS2, null, false, null, null, null, null, 8087)));
                                                    if (!(result3 instanceof AddGiftCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel4, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                            }
                                        }
                                    });
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                AddCreditCardModalKt.a(addCreditCard, sheetState, (Function1) objG2, paymentFlowTypeData, null, null, composerImplV, 3072 | i3);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (modalBottomSheetData instanceof ModalBottomSheetData.AddGiftCard) {
                composerImplV.o(-1076775478);
                ModalBottomSheetData.AddGiftCard addGiftCard = (ModalBottomSheetData.AddGiftCard) modalBottomSheetData;
                composerImplV.o(-1746271574);
                boolean zI3 = composerImplV.I(coroutineScope);
                if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !composerImplV.I(sheetState))) {
                    z = false;
                }
                boolean zI4 = zI3 | z | composerImplV.I(wPayForOrderViewModel);
                Object objG3 = composerImplV.G();
                if (zI4 || objG3 == obj) {
                    final int i5 = 1;
                    objG3 = new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i5) {
                                case 0:
                                    final Object result = (AddCreditCardResult) obj2;
                                    Intrinsics.h(result, "result");
                                    Job jobC = BuildersKt.c(coroutineScope, null, null, new WPayForOrderScreenKt$WPayForOrderBottomSheet$1$1$1(sheetState, null), 3);
                                    final int i52 = 0;
                                    final WPayForOrderViewModel wPayForOrderViewModel2 = wPayForOrderViewModel;
                                    ((JobSupport) jobC).invokeOnCompletion(new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.k
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            Object value;
                                            WPayForOrderContract.ViewState viewState2;
                                            String str;
                                            Object value2;
                                            WPayForOrderContract.ViewState viewState3;
                                            LinkedHashMap linkedHashMapS;
                                            LinkedHashMap linkedHashMapS2;
                                            switch (i52) {
                                                case 0:
                                                    AddCreditCardResult result2 = (AddCreditCardResult) result;
                                                    WPayForOrderViewModel wPayForOrderViewModel32 = wPayForOrderViewModel2;
                                                    wPayForOrderViewModel32.getClass();
                                                    Intrinsics.h(result2, "result");
                                                    MutableStateFlow mutableStateFlow = wPayForOrderViewModel32.r;
                                                    do {
                                                        value = mutableStateFlow.getValue();
                                                        viewState2 = (WPayForOrderContract.ViewState) value;
                                                        if (result2 instanceof AddCreditCardResult.LinkedCard) {
                                                            str = ((AddCreditCardResult.LinkedCard) result2).f8330a;
                                                        } else if (result2 instanceof AddCreditCardResult.UnlinkedCard) {
                                                            str = ((AddCreditCardResult.UnlinkedCard) result2).f8332a;
                                                        } else {
                                                            if (!result2.equals(AddCreditCardResult.None.f8331a)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            str = viewState2.m;
                                                        }
                                                    } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, result2 instanceof AddCreditCardResult.UnlinkedCard ? SetsKt.h(viewState2.e, ((AddCreditCardResult.UnlinkedCard) result2).f8332a) : viewState2.e, null, null, null, false, null, null, null, str, 4071)));
                                                    if (!(result2 instanceof AddCreditCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel32, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                                default:
                                                    AddGiftCardResult result3 = (AddGiftCardResult) result;
                                                    WPayForOrderViewModel wPayForOrderViewModel4 = wPayForOrderViewModel2;
                                                    wPayForOrderViewModel4.getClass();
                                                    Intrinsics.h(result3, "result");
                                                    MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel4.r;
                                                    do {
                                                        value2 = mutableStateFlow2.getValue();
                                                        viewState3 = (WPayForOrderContract.ViewState) value2;
                                                        linkedHashMapS = MapsKt.s(viewState3.f);
                                                        if (result3 instanceof AddGiftCardResult.LinkedCard) {
                                                            String str2 = ((AddGiftCardResult.LinkedCard) result3).f8341a;
                                                            linkedHashMapS.put(str2, new GiftCardEdit.Linked(str2, "", true, false));
                                                        }
                                                        linkedHashMapS2 = MapsKt.s(viewState3.g);
                                                        if (result3 instanceof AddGiftCardResult.UnlinkedCard) {
                                                            AddGiftCardResult.UnlinkedCard unlinkedCard = (AddGiftCardResult.UnlinkedCard) result3;
                                                            String str3 = unlinkedCard.f8343a;
                                                            linkedHashMapS2.put(str3, new GiftCardEdit.Unlinked(str3, unlinkedCard.b, "", true, false));
                                                        }
                                                    } while (!mutableStateFlow2.d(value2, WPayForOrderContract.ViewState.a(viewState3, null, null, null, null, null, linkedHashMapS, linkedHashMapS2, null, false, null, null, null, null, 8087)));
                                                    if (!(result3 instanceof AddGiftCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel4, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final Object addGiftCardResult = (AddGiftCardResult) obj2;
                                    Intrinsics.h(addGiftCardResult, "addGiftCardResult");
                                    Job jobC2 = BuildersKt.c(coroutineScope, null, null, new WPayForOrderScreenKt$WPayForOrderBottomSheet$2$1$1(sheetState, null), 3);
                                    final int i6 = 1;
                                    final WPayForOrderViewModel wPayForOrderViewModel3 = wPayForOrderViewModel;
                                    ((JobSupport) jobC2).invokeOnCompletion(new Function1() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.k
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            Object value;
                                            WPayForOrderContract.ViewState viewState2;
                                            String str;
                                            Object value2;
                                            WPayForOrderContract.ViewState viewState3;
                                            LinkedHashMap linkedHashMapS;
                                            LinkedHashMap linkedHashMapS2;
                                            switch (i6) {
                                                case 0:
                                                    AddCreditCardResult result2 = (AddCreditCardResult) addGiftCardResult;
                                                    WPayForOrderViewModel wPayForOrderViewModel32 = wPayForOrderViewModel3;
                                                    wPayForOrderViewModel32.getClass();
                                                    Intrinsics.h(result2, "result");
                                                    MutableStateFlow mutableStateFlow = wPayForOrderViewModel32.r;
                                                    do {
                                                        value = mutableStateFlow.getValue();
                                                        viewState2 = (WPayForOrderContract.ViewState) value;
                                                        if (result2 instanceof AddCreditCardResult.LinkedCard) {
                                                            str = ((AddCreditCardResult.LinkedCard) result2).f8330a;
                                                        } else if (result2 instanceof AddCreditCardResult.UnlinkedCard) {
                                                            str = ((AddCreditCardResult.UnlinkedCard) result2).f8332a;
                                                        } else {
                                                            if (!result2.equals(AddCreditCardResult.None.f8331a)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            str = viewState2.m;
                                                        }
                                                    } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, result2 instanceof AddCreditCardResult.UnlinkedCard ? SetsKt.h(viewState2.e, ((AddCreditCardResult.UnlinkedCard) result2).f8332a) : viewState2.e, null, null, null, false, null, null, null, str, 4071)));
                                                    if (!(result2 instanceof AddCreditCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel32, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                                default:
                                                    AddGiftCardResult result3 = (AddGiftCardResult) addGiftCardResult;
                                                    WPayForOrderViewModel wPayForOrderViewModel4 = wPayForOrderViewModel3;
                                                    wPayForOrderViewModel4.getClass();
                                                    Intrinsics.h(result3, "result");
                                                    MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel4.r;
                                                    do {
                                                        value2 = mutableStateFlow2.getValue();
                                                        viewState3 = (WPayForOrderContract.ViewState) value2;
                                                        linkedHashMapS = MapsKt.s(viewState3.f);
                                                        if (result3 instanceof AddGiftCardResult.LinkedCard) {
                                                            String str2 = ((AddGiftCardResult.LinkedCard) result3).f8341a;
                                                            linkedHashMapS.put(str2, new GiftCardEdit.Linked(str2, "", true, false));
                                                        }
                                                        linkedHashMapS2 = MapsKt.s(viewState3.g);
                                                        if (result3 instanceof AddGiftCardResult.UnlinkedCard) {
                                                            AddGiftCardResult.UnlinkedCard unlinkedCard = (AddGiftCardResult.UnlinkedCard) result3;
                                                            String str3 = unlinkedCard.f8343a;
                                                            linkedHashMapS2.put(str3, new GiftCardEdit.Unlinked(str3, unlinkedCard.b, "", true, false));
                                                        }
                                                    } while (!mutableStateFlow2.d(value2, WPayForOrderContract.ViewState.a(viewState3, null, null, null, null, null, linkedHashMapS, linkedHashMapS2, null, false, null, null, null, null, 8087)));
                                                    if (!(result3 instanceof AddGiftCardResult.None)) {
                                                        WPayForOrderViewModel.s6(wPayForOrderViewModel4, null, 15);
                                                    }
                                                    return Unit.f24250a;
                                            }
                                        }
                                    });
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                AddGiftCardModalKt.a(addGiftCard, (Function1) objG3, null, null, sheetState, composerImplV, (i2 << 9) & 57344);
                composerImplV.V(false);
            } else {
                if (modalBottomSheetData != null) {
                    throw au.com.woolworths.android.onesite.a.w(935076477, composerImplV, false);
                }
                composerImplV.o(-1076335681);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(viewState, sheetState, wPayForOrderViewModel, i, 3);
        }
    }

    public static final void b(WPayForOrderViewModel wPayForOrderViewModel, final Function0 launchCheckoutDetails, Function1 launchGooglePay, Modifier modifier, Composer composer, final int i) {
        Object wPayForOrderScreenKt$WPayForOrderScreen$2$1;
        MutableState mutableState;
        Map map;
        GooglePayUiState googlePayUiState;
        Map map2;
        Map map3;
        MutableState mutableState2;
        final SnackbarHostState snackbarHostState;
        String str;
        PageResult pageResult;
        SheetState sheetState;
        String str2;
        int i2;
        final Function1 function1;
        boolean z;
        String str3;
        int i3;
        MutableState mutableState3;
        Object wPayForOrderScreenKt$WPayForOrderScreen$3$9$1;
        WPayForOrderViewModel wPayForOrderViewModel2;
        final WPayForOrderViewModel wPayForOrderViewModel3;
        int i4;
        Object obj;
        ComposerImpl composerImpl;
        boolean z2;
        boolean z3;
        ComposerImpl composerImpl2;
        boolean z4;
        boolean z5;
        Modifier modifier2;
        String str4;
        String str5;
        String str6;
        String str7;
        Object obj2;
        final WPayForOrderViewModel viewModel = wPayForOrderViewModel;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(launchCheckoutDetails, "launchCheckoutDetails");
        Intrinsics.h(launchGooglePay, "launchGooglePay");
        ComposerImpl composerImplV = composer.v(2102205129);
        int i5 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(launchCheckoutDetails) ? 32 : 16) | (composerImplV.I(launchGooglePay) ? 256 : 128) | 3072;
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            function1 = launchGooglePay;
            composerImpl2 = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj3 = Composer.Companion.f1624a;
            if (objG == obj3) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objG;
            composerImplV.V(false);
            SheetState sheetStateA = SheetStateKt.a(6, 0, composerImplV);
            MutableState mutableStateA = FlowExtKt.a(viewModel.t, composerImplV);
            final String strC = StringResources_androidKt.c(composerImplV, R.string.checkout_payment_unable_to_retrieve_cvv);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj3) {
                objG2 = SnapshotStateKt.f(null);
                composerImplV.A(objG2);
            }
            MutableState mutableState4 = (MutableState) objG2;
            composerImplV.V(false);
            LoadingState loadingState = ((WPayForOrderContract.ViewState) mutableStateA.getD()).f8389a;
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(mutableStateA);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj3) {
                objG3 = new WPayForOrderScreenKt$WPayForOrderScreen$1$1(snackbarHostState2, mutableStateA, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, loadingState, (Function2) objG3);
            Flow flow = viewModel.u;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(viewModel) | composerImplV.I(context) | ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == obj3) {
                mutableState = mutableState4;
                wPayForOrderScreenKt$WPayForOrderScreen$2$1 = new WPayForOrderScreenKt$WPayForOrderScreen$2$1(viewModel, snackbarHostState2, context, launchCheckoutDetails, launchGooglePay, mutableState, null);
                viewModel = viewModel;
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$2$1);
            } else {
                wPayForOrderScreenKt$WPayForOrderScreen$2$1 = objG4;
                mutableState = mutableState4;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) wPayForOrderScreenKt$WPayForOrderScreen$2$1);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            PageResult pageResult2 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).c;
            String str8 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).b;
            String str9 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).m;
            Map map4 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).f;
            Map map5 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).g;
            Map map6 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).h;
            boolean z6 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).i;
            String str10 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).j;
            GooglePayUiState googlePayUiState2 = ((WPayForOrderContract.ViewState) mutableStateA.getD()).k;
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewModel);
            Object objG5 = composerImplV.G();
            if (zI2 || objG5 == obj3) {
                map = map6;
                googlePayUiState = googlePayUiState2;
                map2 = map4;
                map3 = map5;
                mutableState2 = mutableStateA;
                snackbarHostState = snackbarHostState2;
                str = str9;
                pageResult = pageResult2;
                sheetState = sheetStateA;
                str2 = str10;
                i2 = 5004770;
                function1 = launchGooglePay;
                z = z6;
                str3 = str8;
                i3 = i5;
                mutableState3 = mutableState;
                Object wPayForOrderScreenKt$WPayForOrderScreen$3$1$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$1$1(0, viewModel, WPayForOrderViewModel.class, "fetchPaymentInstruments", "fetchPaymentInstruments(Lau/com/woolworths/feature/shop/wpay/ui/common/model/LoadingState;Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", 0);
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$1$1);
                objG5 = wPayForOrderScreenKt$WPayForOrderScreen$3$1$1;
            } else {
                mutableState2 = mutableStateA;
                snackbarHostState = snackbarHostState2;
                str = str9;
                googlePayUiState = googlePayUiState2;
                map2 = map4;
                map3 = map5;
                map = map6;
                pageResult = pageResult2;
                sheetState = sheetStateA;
                str2 = str10;
                i2 = 5004770;
                function1 = launchGooglePay;
                z = z6;
                str3 = str8;
                i3 = i5;
                mutableState3 = mutableState;
            }
            Function0 function02 = (Function0) objG5;
            composerImplV.V(false);
            composerImplV.o(i2);
            boolean zI3 = composerImplV.I(viewModel);
            Object objG6 = composerImplV.G();
            if (zI3 || objG6 == obj3) {
                Object wPayForOrderScreenKt$WPayForOrderScreen$3$2$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$2$1(1, viewModel, WPayForOrderViewModel.class, "onSubmitPayment", "onSubmitPayment(Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PlaceOrderButton;)V", 0);
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$2$1);
                objG6 = wPayForOrderScreenKt$WPayForOrderScreen$3$2$1;
            }
            KFunction kFunction = (KFunction) objG6;
            Object objD = au.com.woolworths.android.onesite.a.d(i2, composerImplV, false);
            if (objD == obj3) {
                objD = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState3, 19);
                composerImplV.A(objD);
            }
            Function1 function12 = (Function1) objD;
            composerImplV.V(false);
            composerImplV.o(i2);
            boolean zI4 = composerImplV.I(viewModel);
            Object objG7 = composerImplV.G();
            if (zI4 || objG7 == obj3) {
                Object wPayForOrderScreenKt$WPayForOrderScreen$3$4$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$4$1(0, viewModel, WPayForOrderViewModel.class, "onCvvLoaded", "onCvvLoaded()V", 0);
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$4$1);
                objG7 = wPayForOrderScreenKt$WPayForOrderScreen$3$4$1;
            }
            composerImplV.V(false);
            Function0 function03 = (Function0) ((KFunction) objG7);
            composerImplV.o(-1633490746);
            boolean zI5 = composerImplV.I(viewModel) | composerImplV.n(strC);
            Object objG8 = composerImplV.G();
            if (zI5 || objG8 == obj3) {
                objG8 = new Function2() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        viewModel.u6((String) obj4, (String) obj5, strC);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG8);
            }
            Function2 function22 = (Function2) objG8;
            composerImplV.V(false);
            composerImplV.o(i2);
            boolean zI6 = composerImplV.I(viewModel);
            Object objG9 = composerImplV.G();
            if (zI6 || objG9 == obj3) {
                Object wPayForOrderScreenKt$WPayForOrderScreen$3$6$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$6$1(0, viewModel, WPayForOrderViewModel.class, "onCvvLoadTryAgain", "onCvvLoadTryAgain()V", 0);
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$6$1);
                objG9 = wPayForOrderScreenKt$WPayForOrderScreen$3$6$1;
            }
            composerImplV.V(false);
            Function0 function04 = (Function0) ((KFunction) objG9);
            composerImplV.o(i2);
            boolean zI7 = composerImplV.I(viewModel);
            Object objG10 = composerImplV.G();
            if (zI7 || objG10 == obj3) {
                Object wPayForOrderScreenKt$WPayForOrderScreen$3$7$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$7$1(2, viewModel, WPayForOrderViewModel.class, "onCvvPostMessage", "onCvvPostMessage(Ljava/lang/String;I)V", 0);
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$7$1);
                objG10 = wPayForOrderScreenKt$WPayForOrderScreen$3$7$1;
            }
            composerImplV.V(false);
            CvvActions cvvActions = new CvvActions(function12, function03, function22, function04, (Function2) ((KFunction) objG10));
            composerImplV.o(i2);
            boolean zI8 = composerImplV.I(viewModel);
            Object objG11 = composerImplV.G();
            if (zI8 || objG11 == obj3) {
                Object wPayForOrderScreenKt$WPayForOrderScreen$3$8$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$8$1(1, viewModel, WPayForOrderViewModel.class, "onUiEvent", "onUiEvent(Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$UiEvent;)V", 0);
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$8$1);
                objG11 = wPayForOrderScreenKt$WPayForOrderScreen$3$8$1;
            }
            KFunction kFunction2 = (KFunction) objG11;
            composerImplV.V(false);
            composerImplV.o(i2);
            boolean zI9 = composerImplV.I(viewModel);
            Object objG12 = composerImplV.G();
            if (zI9 || objG12 == obj3) {
                wPayForOrderScreenKt$WPayForOrderScreen$3$9$1 = new WPayForOrderScreenKt$WPayForOrderScreen$3$9$1(1, viewModel, WPayForOrderViewModel.class, "onValidationFail", "onValidationFail(Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentsResponse$ValidationFailure;)V", 0);
                wPayForOrderViewModel2 = viewModel;
                composerImplV.A(wPayForOrderScreenKt$WPayForOrderScreen$3$9$1);
            } else {
                wPayForOrderScreenKt$WPayForOrderScreen$3$9$1 = objG12;
                wPayForOrderViewModel2 = viewModel;
            }
            composerImplV.V(false);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-651112084, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderScreenKt$WPayForOrderScreen$3$10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.h), composer2, 6, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            String str11 = str3;
            String str12 = str;
            Map map7 = map2;
            MutableState mutableState5 = mutableState2;
            PageResult pageResult3 = pageResult;
            WPayForOrderContentKt.i(pageResult3, str11, str12, map7, map3, z, str2, map, googlePayUiState, function02, (Function1) kFunction, cvvActions, (Function1) kFunction2, (Function1) ((KFunction) wPayForOrderScreenKt$WPayForOrderScreen$3$9$1), composableLambdaImplC, composerImplV, 0, 221184);
            composerImplV.V(true);
            a((WPayForOrderContract.ViewState) mutableState5.getD(), sheetState, wPayForOrderViewModel2, composerImplV, (i3 << 6) & 896);
            int iOrdinal = ((WPayForOrderContract.ViewState) mutableState5.getD()).f8389a.ordinal();
            if (iOrdinal == 0) {
                wPayForOrderViewModel3 = wPayForOrderViewModel2;
                i4 = -1633490746;
                obj = obj3;
                composerImpl = composerImplV;
                z2 = false;
                composerImpl.o(1879029463);
                composerImpl.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(1584636130);
                long jB = Color.b(CoreTheme.b(composerImplV).e.f4848a.d, 0.5f);
                obj = obj3;
                i4 = -1633490746;
                z2 = false;
                wPayForOrderViewModel3 = wPayForOrderViewModel;
                LoadingScreenKt.a(null, jB, composerImplV, 0, 1);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw au.com.woolworths.android.onesite.a.w(1584632811, composerImplV, false);
                }
                composerImplV.o(1584639966);
                WappleLoadingScreenKt.a(0, 1, composerImplV, null);
                composerImplV.V(false);
                wPayForOrderViewModel3 = wPayForOrderViewModel2;
                i4 = -1633490746;
                obj = obj3;
                composerImpl = composerImplV;
                z2 = false;
            }
            final AlertDialogData alertDialogData = ((WPayForOrderContract.ViewState) mutableState5.getD()).l;
            if (alertDialogData == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new Function2(launchCheckoutDetails, function1, i) { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.m
                        public final /* synthetic */ Function0 e;
                        public final /* synthetic */ Function1 f;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            int iA = RecomposeScopeImplKt.a(1);
                            WPayForOrderScreenKt.b(this.d, this.e, this.f, Modifier.Companion.d, (Composer) obj4, iA);
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            if (alertDialogData instanceof AlertDialogData.AddPayPal) {
                composerImpl.o(1879374927);
                AddPayPalAlert addPayPalAlert = ((AlertDialogData.AddPayPal) alertDialogData).f8351a;
                String str13 = addPayPalAlert.f8289a;
                String str14 = addPayPalAlert.b;
                String str15 = addPayPalAlert.c;
                String str16 = addPayPalAlert.d;
                composerImpl.o(i2);
                boolean zI10 = composerImpl.I(wPayForOrderViewModel3);
                Object objG13 = composerImpl.G();
                if (zI10 || objG13 == obj) {
                    str4 = str13;
                    str5 = str16;
                    str6 = str15;
                    str7 = str14;
                    obj2 = wPayForOrderViewModel;
                    Object wPayForOrderScreenKt$WPayForOrderScreen$4$1$1 = new WPayForOrderScreenKt$WPayForOrderScreen$4$1$1(0, obj2, WPayForOrderViewModel.class, "onDismissAlertDialog", "onDismissAlertDialog()V", 0);
                    composerImpl.A(wPayForOrderScreenKt$WPayForOrderScreen$4$1$1);
                    objG13 = wPayForOrderScreenKt$WPayForOrderScreen$4$1$1;
                } else {
                    str4 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    obj2 = wPayForOrderViewModel3;
                }
                KFunction kFunction3 = (KFunction) objG13;
                composerImpl.V(z2);
                composerImpl.o(i4);
                boolean zI11 = composerImpl.I(obj2) | composerImpl.I(addPayPalAlert);
                Object objG14 = composerImpl.G();
                if (zI11 || objG14 == obj) {
                    objG14 = new n(0, obj2, addPayPalAlert);
                    composerImpl.A(objG14);
                }
                composerImpl.V(z2);
                boolean z7 = z2;
                String str17 = str7;
                ComposerImpl composerImpl3 = composerImpl;
                AlertDialogKt.a(str17, str5, null, str4, str6, (Function0) objG14, (Function0) kFunction3, composerImpl3, 0, 4);
                composerImpl2 = composerImpl3;
                composerImpl2.V(z7);
            } else {
                final WPayForOrderViewModel wPayForOrderViewModel4 = wPayForOrderViewModel3;
                boolean z8 = z2;
                if (alertDialogData instanceof AlertDialogData.DeleteCreditCard) {
                    composerImpl.o(1879894983);
                    String strC2 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_credit_card_dialog_title);
                    String strC3 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_credit_card_dialog_msg);
                    String strC4 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_credit_card_dialog_button_confirm);
                    String strC5 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_credit_card_dialog_button_dismiss);
                    composerImpl.o(i2);
                    boolean zI12 = composerImpl.I(wPayForOrderViewModel4);
                    Object objG15 = composerImpl.G();
                    if (zI12 || objG15 == obj) {
                        z5 = z8;
                        Object wPayForOrderScreenKt$WPayForOrderScreen$5$1 = new WPayForOrderScreenKt$WPayForOrderScreen$5$1(0, wPayForOrderViewModel4, WPayForOrderViewModel.class, "onDismissAlertDialog", "onDismissAlertDialog()V", 0);
                        composerImpl.A(wPayForOrderScreenKt$WPayForOrderScreen$5$1);
                        objG15 = wPayForOrderScreenKt$WPayForOrderScreen$5$1;
                    } else {
                        z5 = z8;
                    }
                    KFunction kFunction4 = (KFunction) objG15;
                    composerImpl.V(z5);
                    composerImpl.o(i4);
                    boolean zI13 = composerImpl.I(wPayForOrderViewModel4) | composerImpl.I(alertDialogData);
                    Object objG16 = composerImpl.G();
                    if (zI13 || objG16 == obj) {
                        final int i7 = 0;
                        objG16 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                WPayForOrderContract.ViewState viewState;
                                String str18;
                                Object value4;
                                Object value5;
                                WPayForOrderContract.ViewState viewState2;
                                LinkedHashMap linkedHashMapS;
                                Object value6;
                                int i8 = i7;
                                Unit unit = Unit.f24250a;
                                AlertDialogData alertDialogData2 = alertDialogData;
                                WPayForOrderViewModel wPayForOrderViewModel5 = wPayForOrderViewModel4;
                                switch (i8) {
                                    case 0:
                                        AlertDialogData.DeleteCreditCard deleteCreditCard = (AlertDialogData.DeleteCreditCard) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deleteCreditCard, "deleteCreditCard");
                                        String str19 = deleteCreditCard.f8352a;
                                        wPayForOrderViewModel5.p.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.d).d.getD());
                                        MutableStateFlow mutableStateFlow = wPayForOrderViewModel5.r;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
                                        if (!deleteCreditCard.b) {
                                            do {
                                                value3 = mutableStateFlow.getValue();
                                                viewState = (WPayForOrderContract.ViewState) value3;
                                                str18 = viewState.m;
                                            } while (!mutableStateFlow.d(value3, WPayForOrderContract.ViewState.a(viewState, null, null, null, null, SetsKt.d(viewState.e, str19), null, null, null, false, null, null, null, !Intrinsics.c(str18, str19) ? str18 : null, 4079)));
                                            LoadingState loadingState2 = LoadingState.d;
                                            WPayForOrderViewModel.s6(wPayForOrderViewModel5, null, 14);
                                            break;
                                        } else {
                                            do {
                                                value2 = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                                            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$deleteLinkedCreditCard$2(wPayForOrderViewModel5, str19, null), 3);
                                            break;
                                        }
                                    case 1:
                                        AlertDialogData.DeleteGiftCard deleteGiftCard = (AlertDialogData.DeleteGiftCard) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deleteGiftCard, "deleteGiftCard");
                                        String str20 = deleteGiftCard.f8353a;
                                        wPayForOrderViewModel5.p.f8369a.g(PaymentAnalytics.Payment.Action.g);
                                        MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel5.r;
                                        do {
                                            value4 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.d(value4, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value4, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
                                        if (!deleteGiftCard.b) {
                                            do {
                                                value5 = mutableStateFlow2.getValue();
                                                viewState2 = (WPayForOrderContract.ViewState) value5;
                                                linkedHashMapS = MapsKt.s(viewState2.g);
                                                linkedHashMapS.remove(str20);
                                            } while (!mutableStateFlow2.d(value5, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, null, null, linkedHashMapS, null, false, null, null, null, null, 8127)));
                                            LoadingState loadingState3 = LoadingState.d;
                                            WPayForOrderViewModel.s6(wPayForOrderViewModel5, null, 14);
                                            break;
                                        } else {
                                            do {
                                                value6 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.d(value6, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value6, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                                            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$deleteLinkedGiftCard$2(wPayForOrderViewModel5, str20, null), 3);
                                            break;
                                        }
                                    default:
                                        AlertDialogData.DeletePayPal deletePayPal = (AlertDialogData.DeletePayPal) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deletePayPal, "deletePayPal");
                                        wPayForOrderViewModel5.p.f8369a.g(PaymentAnalytics.Payment.Action.m);
                                        BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$onConfirmDeletePayPal$1(wPayForOrderViewModel5, deletePayPal, null), 3);
                                        break;
                                }
                                return unit;
                            }
                        };
                        composerImpl.A(objG16);
                    }
                    composerImpl.V(z5);
                    ComposerImpl composerImpl4 = composerImpl;
                    AlertDialogKt.a(strC3, strC5, null, strC2, strC4, (Function0) objG16, (Function0) kFunction4, composerImpl4, 0, 4);
                    composerImpl2 = composerImpl4;
                    composerImpl2.V(z5);
                } else if (alertDialogData instanceof AlertDialogData.DeleteGiftCard) {
                    composerImpl.o(1880563002);
                    String strC6 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_gift_card_dialog_title);
                    String strC7 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_gift_card_dialog_msg);
                    String strC8 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_gift_card_dialog_button_confirm);
                    String strC9 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_gift_card_dialog_buton_dismiss);
                    composerImpl.o(i2);
                    boolean zI14 = composerImpl.I(wPayForOrderViewModel4);
                    Object objG17 = composerImpl.G();
                    if (zI14 || objG17 == obj) {
                        Object wPayForOrderScreenKt$WPayForOrderScreen$7$1 = new WPayForOrderScreenKt$WPayForOrderScreen$7$1(0, wPayForOrderViewModel4, WPayForOrderViewModel.class, "onDismissAlertDialog", "onDismissAlertDialog()V", 0);
                        composerImpl.A(wPayForOrderScreenKt$WPayForOrderScreen$7$1);
                        objG17 = wPayForOrderScreenKt$WPayForOrderScreen$7$1;
                    }
                    KFunction kFunction5 = (KFunction) objG17;
                    composerImpl.V(z8);
                    composerImpl.o(i4);
                    boolean zI15 = composerImpl.I(wPayForOrderViewModel4) | composerImpl.I(alertDialogData);
                    Object objG18 = composerImpl.G();
                    if (zI15 || objG18 == obj) {
                        final int i8 = 1;
                        objG18 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                WPayForOrderContract.ViewState viewState;
                                String str18;
                                Object value4;
                                Object value5;
                                WPayForOrderContract.ViewState viewState2;
                                LinkedHashMap linkedHashMapS;
                                Object value6;
                                int i82 = i8;
                                Unit unit = Unit.f24250a;
                                AlertDialogData alertDialogData2 = alertDialogData;
                                WPayForOrderViewModel wPayForOrderViewModel5 = wPayForOrderViewModel4;
                                switch (i82) {
                                    case 0:
                                        AlertDialogData.DeleteCreditCard deleteCreditCard = (AlertDialogData.DeleteCreditCard) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deleteCreditCard, "deleteCreditCard");
                                        String str19 = deleteCreditCard.f8352a;
                                        wPayForOrderViewModel5.p.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.d).d.getD());
                                        MutableStateFlow mutableStateFlow = wPayForOrderViewModel5.r;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
                                        if (!deleteCreditCard.b) {
                                            do {
                                                value3 = mutableStateFlow.getValue();
                                                viewState = (WPayForOrderContract.ViewState) value3;
                                                str18 = viewState.m;
                                            } while (!mutableStateFlow.d(value3, WPayForOrderContract.ViewState.a(viewState, null, null, null, null, SetsKt.d(viewState.e, str19), null, null, null, false, null, null, null, !Intrinsics.c(str18, str19) ? str18 : null, 4079)));
                                            LoadingState loadingState2 = LoadingState.d;
                                            WPayForOrderViewModel.s6(wPayForOrderViewModel5, null, 14);
                                            break;
                                        } else {
                                            do {
                                                value2 = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                                            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$deleteLinkedCreditCard$2(wPayForOrderViewModel5, str19, null), 3);
                                            break;
                                        }
                                    case 1:
                                        AlertDialogData.DeleteGiftCard deleteGiftCard = (AlertDialogData.DeleteGiftCard) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deleteGiftCard, "deleteGiftCard");
                                        String str20 = deleteGiftCard.f8353a;
                                        wPayForOrderViewModel5.p.f8369a.g(PaymentAnalytics.Payment.Action.g);
                                        MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel5.r;
                                        do {
                                            value4 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.d(value4, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value4, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
                                        if (!deleteGiftCard.b) {
                                            do {
                                                value5 = mutableStateFlow2.getValue();
                                                viewState2 = (WPayForOrderContract.ViewState) value5;
                                                linkedHashMapS = MapsKt.s(viewState2.g);
                                                linkedHashMapS.remove(str20);
                                            } while (!mutableStateFlow2.d(value5, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, null, null, linkedHashMapS, null, false, null, null, null, null, 8127)));
                                            LoadingState loadingState3 = LoadingState.d;
                                            WPayForOrderViewModel.s6(wPayForOrderViewModel5, null, 14);
                                            break;
                                        } else {
                                            do {
                                                value6 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.d(value6, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value6, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                                            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$deleteLinkedGiftCard$2(wPayForOrderViewModel5, str20, null), 3);
                                            break;
                                        }
                                    default:
                                        AlertDialogData.DeletePayPal deletePayPal = (AlertDialogData.DeletePayPal) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deletePayPal, "deletePayPal");
                                        wPayForOrderViewModel5.p.f8369a.g(PaymentAnalytics.Payment.Action.m);
                                        BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$onConfirmDeletePayPal$1(wPayForOrderViewModel5, deletePayPal, null), 3);
                                        break;
                                }
                                return unit;
                            }
                        };
                        composerImpl.A(objG18);
                    }
                    composerImpl.V(z8);
                    ComposerImpl composerImpl5 = composerImpl;
                    AlertDialogKt.a(strC7, strC9, null, strC6, strC8, (Function0) objG18, (Function0) kFunction5, composerImpl5, 0, 4);
                    composerImpl2 = composerImpl5;
                    composerImpl2.V(z8);
                } else if (alertDialogData instanceof AlertDialogData.DeletePayPal) {
                    composerImpl.o(1881252287);
                    String strC10 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_paypal_dialog_title);
                    String strC11 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_paypal_dialog_msg);
                    String strC12 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_paypal_dialog_button_confirm);
                    String strC13 = StringResources_androidKt.c(composerImpl, R.string.checkout_payment_delete_paypal_dialog_button_dismiss);
                    composerImpl.o(i2);
                    boolean zI16 = composerImpl.I(wPayForOrderViewModel4);
                    Object objG19 = composerImpl.G();
                    if (zI16 || objG19 == obj) {
                        z4 = z8;
                        Object wPayForOrderScreenKt$WPayForOrderScreen$9$1 = new WPayForOrderScreenKt$WPayForOrderScreen$9$1(0, wPayForOrderViewModel4, WPayForOrderViewModel.class, "onDismissAlertDialog", "onDismissAlertDialog()V", 0);
                        composerImpl.A(wPayForOrderScreenKt$WPayForOrderScreen$9$1);
                        objG19 = wPayForOrderScreenKt$WPayForOrderScreen$9$1;
                    } else {
                        z4 = z8;
                    }
                    KFunction kFunction6 = (KFunction) objG19;
                    composerImpl.V(z4);
                    composerImpl.o(i4);
                    boolean zI17 = composerImpl.I(wPayForOrderViewModel4) | composerImpl.I(alertDialogData);
                    Object objG20 = composerImpl.G();
                    if (zI17 || objG20 == obj) {
                        final int i9 = 2;
                        objG20 = new Function0() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                WPayForOrderContract.ViewState viewState;
                                String str18;
                                Object value4;
                                Object value5;
                                WPayForOrderContract.ViewState viewState2;
                                LinkedHashMap linkedHashMapS;
                                Object value6;
                                int i82 = i9;
                                Unit unit = Unit.f24250a;
                                AlertDialogData alertDialogData2 = alertDialogData;
                                WPayForOrderViewModel wPayForOrderViewModel5 = wPayForOrderViewModel4;
                                switch (i82) {
                                    case 0:
                                        AlertDialogData.DeleteCreditCard deleteCreditCard = (AlertDialogData.DeleteCreditCard) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deleteCreditCard, "deleteCreditCard");
                                        String str19 = deleteCreditCard.f8352a;
                                        wPayForOrderViewModel5.p.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.d).d.getD());
                                        MutableStateFlow mutableStateFlow = wPayForOrderViewModel5.r;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
                                        if (!deleteCreditCard.b) {
                                            do {
                                                value3 = mutableStateFlow.getValue();
                                                viewState = (WPayForOrderContract.ViewState) value3;
                                                str18 = viewState.m;
                                            } while (!mutableStateFlow.d(value3, WPayForOrderContract.ViewState.a(viewState, null, null, null, null, SetsKt.d(viewState.e, str19), null, null, null, false, null, null, null, !Intrinsics.c(str18, str19) ? str18 : null, 4079)));
                                            LoadingState loadingState2 = LoadingState.d;
                                            WPayForOrderViewModel.s6(wPayForOrderViewModel5, null, 14);
                                            break;
                                        } else {
                                            do {
                                                value2 = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                                            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$deleteLinkedCreditCard$2(wPayForOrderViewModel5, str19, null), 3);
                                            break;
                                        }
                                    case 1:
                                        AlertDialogData.DeleteGiftCard deleteGiftCard = (AlertDialogData.DeleteGiftCard) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deleteGiftCard, "deleteGiftCard");
                                        String str20 = deleteGiftCard.f8353a;
                                        wPayForOrderViewModel5.p.f8369a.g(PaymentAnalytics.Payment.Action.g);
                                        MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel5.r;
                                        do {
                                            value4 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.d(value4, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value4, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
                                        if (!deleteGiftCard.b) {
                                            do {
                                                value5 = mutableStateFlow2.getValue();
                                                viewState2 = (WPayForOrderContract.ViewState) value5;
                                                linkedHashMapS = MapsKt.s(viewState2.g);
                                                linkedHashMapS.remove(str20);
                                            } while (!mutableStateFlow2.d(value5, WPayForOrderContract.ViewState.a(viewState2, null, null, null, null, null, null, linkedHashMapS, null, false, null, null, null, null, 8127)));
                                            LoadingState loadingState3 = LoadingState.d;
                                            WPayForOrderViewModel.s6(wPayForOrderViewModel5, null, 14);
                                            break;
                                        } else {
                                            do {
                                                value6 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.d(value6, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value6, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                                            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$deleteLinkedGiftCard$2(wPayForOrderViewModel5, str20, null), 3);
                                            break;
                                        }
                                    default:
                                        AlertDialogData.DeletePayPal deletePayPal = (AlertDialogData.DeletePayPal) alertDialogData2;
                                        wPayForOrderViewModel5.getClass();
                                        Intrinsics.h(deletePayPal, "deletePayPal");
                                        wPayForOrderViewModel5.p.f8369a.g(PaymentAnalytics.Payment.Action.m);
                                        BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel5), null, null, new WPayForOrderViewModel$onConfirmDeletePayPal$1(wPayForOrderViewModel5, deletePayPal, null), 3);
                                        break;
                                }
                                return unit;
                            }
                        };
                        composerImpl.A(objG20);
                    }
                    composerImpl.V(z4);
                    ComposerImpl composerImpl6 = composerImpl;
                    AlertDialogKt.a(strC11, strC13, null, strC10, strC12, (Function0) objG20, (Function0) kFunction6, composerImpl6, 0, 4);
                    composerImpl2 = composerImpl6;
                    composerImpl2.V(z4);
                } else if (alertDialogData instanceof AlertDialogData.ValidationFailure) {
                    composerImpl.o(1881902388);
                    AlertDialogData.ValidationFailure validationFailure = (AlertDialogData.ValidationFailure) alertDialogData;
                    String str18 = validationFailure.f8356a;
                    String str19 = validationFailure.b;
                    composerImpl.o(i2);
                    boolean zI18 = composerImpl.I(wPayForOrderViewModel4);
                    Object objG21 = composerImpl.G();
                    if (zI18 || objG21 == obj) {
                        Object wPayForOrderScreenKt$WPayForOrderScreen$11$1 = new WPayForOrderScreenKt$WPayForOrderScreen$11$1(0, wPayForOrderViewModel4, WPayForOrderViewModel.class, "onDismissValidationFailureAlertDialog", "onDismissValidationFailureAlertDialog()V", 0);
                        composerImpl.A(wPayForOrderScreenKt$WPayForOrderScreen$11$1);
                        objG21 = wPayForOrderScreenKt$WPayForOrderScreen$11$1;
                    }
                    composerImpl.V(z8);
                    ComposerImpl composerImpl7 = composerImpl;
                    AlertDialogKt.a(str19, StringResources_androidKt.c(composerImpl, R.string.checkout_payment_validation_error_dialog_button_ok), null, str18, null, null, (Function0) ((KFunction) objG21), composerImpl7, 0, 52);
                    composerImpl2 = composerImpl7;
                    composerImpl2.V(z8);
                } else {
                    if (!(alertDialogData instanceof AlertDialogData.UnlinkCardFailure)) {
                        throw au.com.woolworths.android.onesite.a.w(1584646245, composerImpl, z8);
                    }
                    composerImpl.o(1882287687);
                    AlertDialogData.UnlinkCardFailure unlinkCardFailure = (AlertDialogData.UnlinkCardFailure) alertDialogData;
                    String str20 = unlinkCardFailure.f8355a;
                    String str21 = unlinkCardFailure.b;
                    composerImpl.o(i2);
                    boolean zI19 = composerImpl.I(wPayForOrderViewModel4);
                    Object objG22 = composerImpl.G();
                    if (zI19 || objG22 == obj) {
                        z3 = z8;
                        Object wPayForOrderScreenKt$WPayForOrderScreen$12$1 = new WPayForOrderScreenKt$WPayForOrderScreen$12$1(0, wPayForOrderViewModel4, WPayForOrderViewModel.class, "onDismissUnlinkCardAlertDialog", "onDismissUnlinkCardAlertDialog()V", 0);
                        composerImpl.A(wPayForOrderScreenKt$WPayForOrderScreen$12$1);
                        objG22 = wPayForOrderScreenKt$WPayForOrderScreen$12$1;
                    } else {
                        z3 = z8;
                    }
                    composerImpl.V(z3);
                    String str22 = unlinkCardFailure.c;
                    composerImpl.o(1584746664);
                    composerImpl.V(z3);
                    ComposerImpl composerImpl8 = composerImpl;
                    AlertDialogKt.a(str21, str22, null, str20, null, null, (Function0) ((KFunction) objG22), composerImpl8, 0, 52);
                    composerImpl2 = composerImpl8;
                    composerImpl2.V(z3);
                }
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImpl2.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) wPayForOrderViewModel, (Object) launchCheckoutDetails, (Object) function1, modifier2, i, 22);
        }
    }
}
