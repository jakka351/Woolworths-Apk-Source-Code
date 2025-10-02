package au.com.woolworths.shop.checkout.ui.summary.rewards;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.feature.product.list.compose.productsearch.c;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isRemoveLoading", "isLoading", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsQuantitySelectorModalKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0267 A[LOOP:0: B:50:0x0263->B:52:0x0267, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData.RewardsQuantitySelector r32, final au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener r33, final kotlin.jvm.functions.Function3 r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt.a(au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData$RewardsQuantitySelector, au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(final ModalBottomSheetData.RewardsQuantitySelector bottomSheetData, final HorizontalSelectorViewListener horizontalSelectorViewListener, Function0 onDismissRequest, Modifier modifier, SheetState sheetState, final Function3 onUpdateAmountClick, Composer composer, int i) {
        SheetState sheetStateA;
        int i2;
        Modifier modifier2;
        Intrinsics.h(bottomSheetData, "bottomSheetData");
        Intrinsics.h(horizontalSelectorViewListener, "horizontalSelectorViewListener");
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        Intrinsics.h(onUpdateAmountClick, "onUpdateAmountClick");
        ComposerImpl composerImplV = composer.v(-20035447);
        int i3 = i | (composerImplV.I(bottomSheetData) ? 4 : 2) | (composerImplV.I(horizontalSelectorViewListener) ? 32 : 16) | (composerImplV.I(onDismissRequest) ? 256 : 128) | 11264 | (composerImplV.I(onUpdateAmountClick) ? 131072 : 65536);
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            sheetStateA = sheetState;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                sheetStateA = SheetStateKt.a(0, 1, composerImplV);
                i2 = i3 & (-57345);
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                sheetStateA = sheetState;
                i2 = i3 & (-57345);
                modifier2 = modifier;
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(-2074176767);
            if (bottomSheetData.e) {
                composerImplV.o(-1746271574);
                boolean zI = composerImplV.I(coroutineScope) | composerImplV.I(sheetStateA) | ((i2 & 896) == 256);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1(coroutineScope, sheetStateA, onDismissRequest, null);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, bottomSheetData, (Function2) objG2);
            }
            composerImplV.V(false);
            ModalBottomSheetKt.a(onDismissRequest, modifier2, sheetStateA, null, null, 0L, 0L, ComposableLambdaKt.c(-1180626690, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        RewardsQuantitySelectorModalKt.a(bottomSheetData, horizontalSelectorViewListener, onUpdateAmountClick, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 6) & 14) | 12582960, 120);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(bottomSheetData, horizontalSelectorViewListener, onDismissRequest, modifier2, sheetStateA, onUpdateAmountClick, i);
        }
    }
}
