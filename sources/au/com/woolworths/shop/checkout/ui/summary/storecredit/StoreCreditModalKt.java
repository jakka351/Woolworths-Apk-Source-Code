package au.com.woolworths.shop.checkout.ui.summary.storecredit;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StoreCreditModalKt {
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final void a(final ModalBottomSheetData.StoreCredit storeCredit, final Function0 onDismissRequest, final Function0 onReloadButtonClick, final Function1 onApplyStoreCredit, final Function1 onRemoveStoreCredit, Function0 onSnackbarMessageShown, Modifier modifier, SheetState sheetState, Composer composer, int i) {
        int i2;
        final SheetState sheetStateA;
        Modifier modifier2;
        ?? r12;
        boolean z;
        Modifier modifier3;
        SheetState sheetState2;
        Intrinsics.h(storeCredit, "storeCredit");
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        Intrinsics.h(onReloadButtonClick, "onReloadButtonClick");
        Intrinsics.h(onApplyStoreCredit, "onApplyStoreCredit");
        Intrinsics.h(onRemoveStoreCredit, "onRemoveStoreCredit");
        Intrinsics.h(onSnackbarMessageShown, "onSnackbarMessageShown");
        ComposerImpl composerImplV = composer.v(-1457520066);
        int i3 = i | (composerImplV.I(storeCredit) ? 4 : 2) | (composerImplV.I(onDismissRequest) ? 32 : 16) | (composerImplV.I(onReloadButtonClick) ? 256 : 128) | (composerImplV.I(onApplyStoreCredit) ? 2048 : 1024) | (composerImplV.I(onRemoveStoreCredit) ? 16384 : 8192) | (composerImplV.I(onSnackbarMessageShown) ? 131072 : 65536) | 5767168;
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            sheetState2 = sheetState;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                i2 = i3 & (-29360129);
                sheetStateA = SheetStateKt.a(6, 0, composerImplV);
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                i2 = i3 & (-29360129);
                sheetStateA = sheetState;
            }
            composerImplV.W();
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG2;
            composerImplV.V(false);
            Text text = storeCredit.b;
            CharSequence text2 = text != null ? text.getText(context) : null;
            composerImplV.o(-517422461);
            if (text2 == null) {
                z = false;
            } else {
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(text2);
                Object objG3 = composerImplV.G();
                if (zI || objG3 == composer$Companion$Empty$1) {
                    r12 = 0;
                    objG3 = new StoreCreditModalKt$StoreCreditModal$1$1$1(snackbarHostState, text2, null);
                    composerImplV.A(objG3);
                } else {
                    r12 = 0;
                }
                z = false;
                composerImplV.V(false);
                BuildersKt.c(coroutineScope, r12, r12, (Function2) objG3, 3);
                onSnackbarMessageShown.invoke();
            }
            composerImplV.V(z);
            Modifier modifier4 = modifier2;
            ModalBottomSheetKt.a(onDismissRequest, modifier4, null, RectangleShapeKt.f1779a, DragHandleBehaviour.e, 0L, 0L, ComposableLambdaKt.c(-1220656343, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt$StoreCreditModal$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        final SheetState sheetState3 = sheetStateA;
                        final Function0 function0 = onDismissRequest;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(940136941, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt$StoreCreditModal$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String strC = StringResources_androidKt.c(composer3, R.string.checkout_store_credit_title);
                                    final SheetState sheetState4 = sheetState3;
                                    final Function0 function02 = function0;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-1621843873, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt.StoreCreditModal.2.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).f4879a.G;
                                                String strC2 = StringResources_androidKt.c(composer4, R.string.checkout_store_credit_modal_close_caption);
                                                composer4.o(-1746271574);
                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                boolean zI2 = composer4.I(coroutineScope4);
                                                final SheetState sheetState5 = sheetState4;
                                                boolean zI3 = zI2 | composer4.I(sheetState5);
                                                final Function0 function03 = function02;
                                                boolean zN = zI3 | composer4.n(function03);
                                                Object objG4 = composer4.G();
                                                if (zN || objG4 == Composer.Companion.f1624a) {
                                                    objG4 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.c
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            ((JobSupport) BuildersKt.c(coroutineScope4, null, null, new StoreCreditModalKt$StoreCreditModal$2$1$1$1$1$1(sheetState5, null), 3)).invokeOnCompletion(new j(16, function03));
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer4.A(objG4);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC2, (Function0) objG4, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 100663296, 766);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final SnackbarHostState snackbarHostState2 = snackbarHostState;
                        ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(-1972689169, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt$StoreCreditModal$2.2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    SnackbarHostKt.b(snackbarHostState2, null, composer3, 6, 2);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function1 function1 = onApplyStoreCredit;
                        final Function1 function12 = onRemoveStoreCredit;
                        final ModalBottomSheetData.StoreCredit storeCredit2 = storeCredit;
                        final Function0 function02 = onReloadButtonClick;
                        ScaffoldKt.a(null, composableLambdaImplC, null, composableLambdaImplC2, 0L, null, ComposableLambdaKt.c(-6301386, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt$StoreCreditModal$2.3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                PaddingValues it = (PaddingValues) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue2 = ((Number) obj6).intValue();
                                Intrinsics.h(it, "it");
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= composer3.n(it) ? 4 : 2;
                                }
                                if ((iIntValue2 & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    StoreCreditContentUiKt.a(storeCredit2, function02, function1, function12, PaddingKt.e(Modifier.Companion.d, it), composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12586032, 117);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 12610608, 100);
            modifier3 = modifier4;
            sheetState2 = sheetStateA;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.detail.composable.b(storeCredit, onDismissRequest, onReloadButtonClick, onApplyStoreCredit, onRemoveStoreCredit, onSnackbarMessageShown, modifier3, sheetState2, i);
        }
    }
}
