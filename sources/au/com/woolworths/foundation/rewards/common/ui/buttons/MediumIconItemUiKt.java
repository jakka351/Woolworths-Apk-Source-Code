package au.com.woolworths.foundation.rewards.common.ui.buttons;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MediumIconItemUiKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void a(String str, String str2, String description, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        ?? r13;
        Modifier modifier2;
        ComposerImpl composerImpl2;
        Intrinsics.h(description, "description");
        ComposerImpl composerImplV = composer.v(-423025346);
        int i3 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str2) ? 32 : 16;
        }
        int i4 = i3 | (composerImplV.n(description) ? 256 : 128) | 3072;
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl2 = composerImplV;
        } else {
            float f = 16;
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(companion2, f, 12);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.recipes.recipes.list.b(28);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierG, true, (Function1) objG);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            SingletonAsyncImageKt.a(str, null, SizeKt.q(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 40), null, null, composerImplV, (i4 & 14) | 432, 2040);
            ComposerImpl composerImpl3 = composerImplV;
            Modifier modifierJ = PaddingKt.j(companion2, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            composerImpl3.o(-1746271574);
            boolean zI = composerImpl3.I(context) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objG2 = composerImpl3.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new androidx.lifecycle.compose.b(27, str2, context, description);
                composerImpl3.A(objG2);
            }
            composerImpl3.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierJ, (Function1) objG2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImpl3, 0);
            int i6 = composerImpl3.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl3.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImpl3, modifierA);
            composerImpl3.i();
            if (composerImpl3.O) {
                composerImpl3.K(function0);
            } else {
                composerImpl3.e();
            }
            Updater.b(composerImpl3, columnMeasurePolicyA, function2);
            Updater.b(composerImpl3, persistentCompositionLocalMapQ2, function22);
            if (composerImpl3.O || !Intrinsics.c(composerImpl3.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImpl3, i6, function23);
            }
            Updater.b(composerImpl3, modifierD2, function24);
            composerImpl3.o(-180278362);
            if (str2 == null) {
                i2 = i4;
                companion = companion2;
                r13 = 0;
                composerImpl = composerImpl3;
            } else {
                i2 = i4;
                companion = companion2;
                TextKt.b(str2, SizeKt.e(companion2, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl3).m, composerImpl3, ((i4 >> 3) & 14) | 48, 0, 65532);
                composerImpl = composerImpl3;
                r13 = 0;
            }
            composerImpl.V(r13);
            Modifier.Companion companion3 = companion;
            MarkdownCompatKt.a(description, PaddingKt.j(SizeKt.e(companion3, 1.0f), BitmapDescriptorFactory.HUE_RED, str2 != null ? 4 : (float) r13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), new MarkdownTextViewStyle((Density) composerImpl.x(CompositionLocalsKt.h), WxTheme.a(composerImpl).c(), WxTheme.b(composerImpl).l, (TextAlign) null, 8), null, false, null, null, false, null, null, composerImpl, (i2 >> 6) & 14, 1016);
            composerImpl.V(true);
            composerImpl.V(true);
            modifier2 = companion3;
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(str, str2, description, modifier2, i, 28);
        }
    }
}
