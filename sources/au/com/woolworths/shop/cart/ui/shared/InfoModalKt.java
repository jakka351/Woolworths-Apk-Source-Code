package au.com.woolworths.shop.cart.ui.shared;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.cart.ui.cart.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InfoModalKt {
    public static final void a(final String str, final String str2, final String str3, final Function0 onButtonClicked, Function0 onDismissRequest, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onButtonClicked, "onButtonClicked");
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        ComposerImpl composerImplV = composer.v(892263024);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128) | (composerImplV.I(onButtonClicked) ? 2048 : 1024) | (composerImplV.I(onDismissRequest) ? 16384 : 8192) | 196608;
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            final SheetState sheetStateA = SheetStateKt.a(0, 1, composerImplV);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            Modifier.Companion companion = Modifier.Companion.d;
            ModalBottomSheetKt.a(onDismissRequest, companion, sheetStateA, null, DragHandleBehaviour.f, 0L, 0L, ComposableLambdaKt.c(-1535713563, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.shared.InfoModalKt$InfoModal$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        float f2 = 32;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierI = PaddingKt.i(companion2, f, f2, f, f2);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        TextKt.b(str, PaddingKt.h(companion2, f, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composer2).e.d.d, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).d.c.b, composer2, 48, 0, 65016);
                        TextStyle textStyle = CoreTheme.f(composer2).f5120a.b.f5123a;
                        long j = CoreTheme.b(composer2).e.d.b;
                        TextKt.b(str2, PaddingKt.j(SizeKt.e(companion2, 1.0f), f, 8, f, BitmapDescriptorFactory.HUE_RED, 8), j, 0L, null, 0L, null, new TextAlign(3), TextUnitKt.c(20), 0, false, 0, 0, null, textStyle, composer2, 48, 6, 63992);
                        composer2.o(-1746271574);
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        boolean zI = composer2.I(coroutineScope2);
                        final SheetState sheetState = sheetStateA;
                        boolean zI2 = zI | composer2.I(sheetState);
                        final Function0 function02 = onButtonClicked;
                        boolean zN = zI2 | composer2.n(function02);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new Function0() { // from class: au.com.woolworths.shop.cart.ui.shared.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    SheetState sheetState2 = sheetState;
                                    ((JobSupport) BuildersKt.c(coroutineScope2, null, null, new InfoModalKt$InfoModal$1$1$1$1$1(sheetState2, null), 3)).invokeOnCompletion(new l(3, sheetState2, function02));
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        composer2.l();
                        PrimaryButtonKt.a(str3, (Function0) objG2, PaddingKt.j(SizeKt.e(companion2, 1.0f), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 248);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 12) & 14) | 12607536, 104);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(str, str2, str3, onButtonClicked, onDismissRequest, modifier2, i);
        }
    }
}
