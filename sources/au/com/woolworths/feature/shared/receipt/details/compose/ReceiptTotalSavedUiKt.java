package au.com.woolworths.feature.shared.receipt.details.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptSavings;
import au.com.woolworths.foundation.rewards.model.receipt.ReceiptDetailsLineItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"receipt-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ReceiptTotalSavedUiKt {
    public static final void a(final EReceiptSavings eReceiptSavings, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1953217443);
        int i4 = i | (composerImplV.I(eReceiptSavings) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (composerImplV.n(modifier) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            CardKt.a(SizeKt.e(modifier, 1.0f), RoundedCornerShapeKt.b(12), 0L, 0L, null, 2, ComposableLambdaKt.c(1545098458, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.receipt.details.compose.ReceiptTotalSavedUiKt$ReceiptTotalSavedUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = PaddingKt.e(companion, paddingValuesImpl);
                        BiasAlignment biasAlignment = Alignment.Companion.e;
                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
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
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierE2);
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
                        Updater.b(composer2, measurePolicyD2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        EReceiptSavings eReceiptSavings2 = eReceiptSavings;
                        TextKt.b(eReceiptSavings2.getSavings(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).g, composer2, 0, 0, 65534);
                        composer2.f();
                        List summaryItems = eReceiptSavings2.getSummaryItems();
                        composer2.o(-714276169);
                        if (summaryItems != null) {
                            int size = summaryItems.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ReceiptDetailsLineItem receiptDetailsLineItem = (ReceiptDetailsLineItem) summaryItems.get(i6);
                                SpacerKt.a(composer2, SizeKt.g(companion, 8));
                                ReceiptDetailsLineItemUiKt.a(receiptDetailsLineItem, null, composer2, 0);
                            }
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 28);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(eReceiptSavings, modifier2, i, i2, 16);
        }
    }
}
