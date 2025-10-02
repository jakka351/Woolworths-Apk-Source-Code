package au.com.woolworths.shop.product.details.ui;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.ImageUtilKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsHealthierOptionsAccordianKt {
    public static final void a(String label, IconAsset iconAsset, boolean z, Function0 onClick, String str, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        String str2;
        ImageVector imageVector;
        String strL;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1089343150);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(iconAsset) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= composerImplV.n(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (z) {
                composerImplV.o(-150824576);
                imageVector = CoreTheme.e(composerImplV).e.o;
                composerImplV.V(false);
            } else {
                composerImplV.o(-150766978);
                imageVector = CoreTheme.e(composerImplV).e.l;
                composerImplV.V(false);
            }
            if (z) {
                composerImplV.o(-150665453);
                strL = ((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).getString(R.string.expanded);
                composerImplV.V(false);
            } else {
                strL = au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -1113236577, R.string.collapsed, composerImplV, false);
            }
            Intrinsics.e(strL);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CoreRowSpec.Image.LocalImage localImage = new CoreRowSpec.Image.LocalImage(imageVector, null, BitmapDescriptorFactory.HUE_RED, 6);
            composerImplV.o(1543526127);
            CoreRowSpec.Image imageA = iconAsset != null ? ImageUtilKt.a(iconAsset, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6) : null;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strL);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shared.ui.compose.a(strL, 20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i4 = (i2 & 14) | ((i2 >> 6) & 112);
            int i5 = i2 >> 3;
            SimpleRowKt.a(label, onClick, SemanticsModifierKt.b(companion, true, (Function1) objG), str2, null, imageA, localImage, null, null, composerImplV, i4 | (i5 & 7168), 400);
            AnimatedVisibilityKt.c(ColumnScopeInstance.f948a, z, null, null, null, null, ComposableLambdaKt.c(984489376, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.ProductDetailsHealthierOptionsAccordianKt$ProductDetailsHealthierOptionsAccordion$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    composableLambdaImpl.invoke((Composer) obj2, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572870 | (i5 & 112), 30);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.d(label, iconAsset, z, onClick, str, composableLambdaImpl, i);
        }
    }
}
