package au.com.woolworths.shop.lists.ui.magicmatch.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.lists.ui.lottie.CircleAndLoaderLottieKt;
import au.com.woolworths.shop.lists.ui.lottie.GlowLottieKt;
import au.com.woolworths.shop.lists.ui.lottie.StarBurstLottieKt;
import au.com.woolworths.shop.lists.ui.utils.AnimationUtilsKt;
import au.com.woolworths.shop.lists.ui.utils.BitmapRenderer;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MagicMatchLoadingScreenKt {
    public static final void a(byte[] bitmapByteArray, Function0 function0, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Function0 onCancelClick = function0;
        Intrinsics.h(bitmapByteArray, "bitmapByteArray");
        Intrinsics.h(onCancelClick, "onCancelClick");
        ComposerImpl composerImplV = composer.v(977811939);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(bitmapByteArray) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onCancelClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final String strC = StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_loading_heading_description);
            final String strC2 = StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_loading_cta_description);
            List listR = CollectionsKt.R(StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_loading_heading_1), StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_loading_heading_2), StringResources_androidKt.c(composerImplV, R.string.shop_lists_magic_match_loading_heading_3));
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            BitmapRenderer.f12485a.a(bitmapByteArray, composerImplV, (i2 & 14) | 48);
            Modifier modifierB = BackgroundKt.b(fillElement, Color.b(Color.b, 0.7f), RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            int i5 = i2;
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            AnimationUtilsKt.a(listR, ComposableLambdaKt.c(378736761, new Function3<String, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.MagicMatchLoadingScreenKt$MagicMatchLoadingScreen$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String text = (String) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(text, "text");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(text) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextStyle textStyle = CoreTheme.f(composer2).f5120a.f5121a.b;
                        long j = CoreTheme.b(composer2).e.d.c.b;
                        composer2.o(5004770);
                        String str = strC;
                        boolean zN = composer2.n(str);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.shared.ui.compose.a(str, 13);
                            composer2.A(objG);
                        }
                        composer2.l();
                        TextKt.b(text, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, iIntValue & 14, 0, 65528);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3504);
            Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 250);
            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.e, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierQ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            GlowLottieKt.a(R.raw.ai_glow, 50, 48, composerImplV);
            StarBurstLottieKt.a(composerImplV, 0);
            CircleAndLoaderLottieKt.a(composerImplV, 0);
            MagicMatchLoopedLottieKt.a(composerImplV, 0);
            composerImplV.V(true);
            onCancelClick = function0;
            ButtonKt.c(onCancelClick, null, false, null, null, null, null, null, ComposableLambdaKt.c(873403146, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.ui.MagicMatchLoadingScreenKt$MagicMatchLoadingScreen$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope TextButton = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TextButton, "$this$TextButton");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC3 = StringResources_androidKt.c(composer2, R.string.shop_lists_snap_scanning_cancel);
                        long j = CoreTheme.b(composer2).e.d.c.b;
                        TextStyle textStyle = CoreTheme.f(composer2).e.b.b;
                        composer2.o(5004770);
                        String str = strC2;
                        boolean zN = composer2.n(str);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.shared.ui.compose.a(str, 14);
                            composer2.A(objG);
                        }
                        composer2.l();
                        TextKt.b(strC3, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65528);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i5 >> 3) & 14) | 805306368, 510);
            composerImpl = composerImplV;
            composerImpl.V(true);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(bitmapByteArray, i, 2, onCancelClick);
        }
    }
}
