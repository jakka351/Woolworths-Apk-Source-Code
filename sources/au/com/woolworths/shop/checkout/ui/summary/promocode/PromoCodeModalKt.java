package au.com.woolworths.shop.checkout.ui.summary.promocode;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
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
public final class PromoCodeModalKt {
    public static final void a(final boolean z, final ModalBottomSheetData.PromoCode bottomSheetData, final Function1 onValueChange, final Function0 onApplyPromoCode, final Function1 onRemovePromoCode, final Function0 onSnackBarMessageShown, final Function0 onDismissRequest, final Function1 onInsetBannerActionClick, Modifier modifier, SheetState sheetState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        final SheetState sheetState2;
        Modifier modifier3;
        ComposerImpl composerImpl;
        SheetState sheetState3;
        Intrinsics.h(bottomSheetData, "bottomSheetData");
        Intrinsics.h(onValueChange, "onValueChange");
        Intrinsics.h(onApplyPromoCode, "onApplyPromoCode");
        Intrinsics.h(onRemovePromoCode, "onRemovePromoCode");
        Intrinsics.h(onSnackBarMessageShown, "onSnackBarMessageShown");
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        Intrinsics.h(onInsetBannerActionClick, "onInsetBannerActionClick");
        ComposerImpl composerImplV = composer.v(-1378748235);
        int i3 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(bottomSheetData) ? 32 : 16) | (composerImplV.I(onValueChange) ? 256 : 128) | (composerImplV.I(onApplyPromoCode) ? 2048 : 1024) | (composerImplV.I(onRemovePromoCode) ? 16384 : 8192) | (composerImplV.I(onSnackBarMessageShown) ? 131072 : 65536) | (composerImplV.I(onDismissRequest) ? 1048576 : 524288) | (composerImplV.I(onInsetBannerActionClick) ? 8388608 : 4194304) | 369098752;
        if ((306783379 & i3) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            sheetState3 = sheetState;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                SheetState sheetStateA = SheetStateKt.a(6, 0, composerImplV);
                i2 = i3 & (-1879048193);
                modifier2 = Modifier.Companion.d;
                sheetState2 = sheetStateA;
            } else {
                composerImplV.j();
                i2 = i3 & (-1879048193);
                modifier2 = modifier;
                sheetState2 = sheetState;
            }
            int i4 = i2;
            composerImplV.W();
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            Modifier modifier4 = modifier2;
            ModalBottomSheetKt.a(onDismissRequest, modifier4, sheetState2, RectangleShapeKt.f1779a, DragHandleBehaviour.e, 0L, 0L, ComposableLambdaKt.c(152063968, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeModalKt$PromoCodeModal$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        final SheetState sheetState4 = sheetState2;
                        final Function0 function0 = onDismissRequest;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-292503132, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeModalKt$PromoCodeModal$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String strC = StringResources_androidKt.c(composer3, R.string.checkout_promo_code_title);
                                    final SheetState sheetState5 = sheetState4;
                                    final Function0 function02 = function0;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-892067434, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeModalKt.PromoCodeModal.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).f4879a.G;
                                                String strC2 = StringResources_androidKt.c(composer4, R.string.checkout_promo_code_modal_close_caption);
                                                composer4.o(-1746271574);
                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                boolean zI = composer4.I(coroutineScope4);
                                                final SheetState sheetState6 = sheetState5;
                                                boolean zI2 = zI | composer4.I(sheetState6);
                                                final Function0 function03 = function02;
                                                boolean zN = zI2 | composer4.n(function03);
                                                Object objG2 = composer4.G();
                                                if (zN || objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.c
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            ((JobSupport) BuildersKt.c(coroutineScope4, null, null, new PromoCodeModalKt$PromoCodeModal$1$1$1$1$1$1(sheetState6, null), 3)).invokeOnCompletion(new j(14, function03));
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer4.A(objG2);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC2, (Function0) objG2, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), null, composer3, 100663296, 766);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function0 function02 = onSnackBarMessageShown;
                        final Function1 function1 = onInsetBannerActionClick;
                        final boolean z2 = z;
                        final ModalBottomSheetData.PromoCode promoCode = bottomSheetData;
                        final Function1 function12 = onValueChange;
                        final Function0 function03 = onApplyPromoCode;
                        final Function1 function13 = onRemovePromoCode;
                        ScaffoldKt.a(null, composableLambdaImplC, null, null, 0L, null, ComposableLambdaKt.c(-1668580947, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeModalKt$PromoCodeModal$1.2
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
                                    PromoCodeUiKt.a(z2, promoCode, function12, function03, function13, function02, function1, PaddingKt.e(Modifier.Companion.d, it), composer3, 0, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12582960, 125);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i4 >> 18) & 14) | 12610608, 96);
            modifier3 = modifier4;
            composerImpl = composerImplV;
            sheetState3 = sheetState2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(z, bottomSheetData, onValueChange, onApplyPromoCode, onRemovePromoCode, onSnackBarMessageShown, onDismissRequest, onInsetBannerActionClick, modifier3, sheetState3, i);
        }
    }
}
