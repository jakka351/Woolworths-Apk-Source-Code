package au.com.woolworths.android.onesite.modules.checkout.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app-common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProgressStepItemKt {
    public static final void a(ProgressStep step, Modifier modifier, Composer composer, int i) {
        Modifier modifierA;
        int i2;
        boolean z;
        long j;
        Modifier.Companion companion;
        int i3;
        long j2;
        Modifier modifier2;
        Intrinsics.h(step, "step");
        boolean z2 = step.e;
        String str = step.b;
        ComposerImpl composerImplV = composer.v(-1923429824);
        int i4 = (composerImplV.n(step) ? 4 : 2) | i | 48;
        if ((i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7);
            composerImplV.o(5004770);
            boolean z3 = (i4 & 14) == 4;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new d(step, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierJ, true, (Function1) objG);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
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
            if (str.length() == 0) {
                composerImplV.o(1703984712);
                IconKt.b(CoreTheme.e(composerImplV).i.k, null, SizeKt.q(companion2, 24), Color.b(CoreTheme.b(composerImplV).e.c.f4854a, 0.8f), composerImplV, 432, 0);
                composerImplV.V(false);
                companion = companion2;
                z = false;
                i3 = 4;
            } else {
                composerImplV.o(1704312971);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
                }
                Updater.b(composerImplV, modifierD2, function24);
                if (z2) {
                    composerImplV.o(1948225108);
                    modifierA = BackgroundKt.b(SizeKt.q(PaddingKt.f(companion2, 2), 20), CoreTheme.b(composerImplV).e.c.f4854a, RoundedCornerShapeKt.f1100a);
                    i2 = 0;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1948583778);
                    Modifier modifierQ = SizeKt.q(PaddingKt.f(companion2, 2), 20);
                    long j3 = CoreTheme.b(composerImplV).e.c.c.b;
                    RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
                    modifierA = BorderKt.a(BackgroundKt.b(modifierQ, j3, roundedCornerShape), 1, CoreTheme.b(composerImplV).e.c.f4854a, roundedCornerShape);
                    i2 = 0;
                    composerImplV.V(false);
                }
                BoxKt.a(modifierA, composerImplV, i2);
                String str2 = step.b;
                TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.b.b;
                if (z2) {
                    composerImplV.o(1949345541);
                    j = CoreTheme.b(composerImplV).c.f4812a.f4813a.f4814a.f4815a;
                    z = false;
                    composerImplV.V(false);
                } else {
                    z = false;
                    composerImplV.o(1949457730);
                    j = CoreTheme.b(composerImplV).c.f4812a.b.f4817a.f4818a;
                    composerImplV.V(false);
                }
                companion = companion2;
                i3 = 4;
                TextKt.a(str2, textStyle, null, j, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
                composerImplV = composerImplV;
                composerImplV.V(true);
                composerImplV.V(z);
            }
            String str3 = step.c;
            TextStyle textStyle2 = CoreTheme.f(composerImplV).f5120a.c.f5124a;
            if (str.length() == 0) {
                composerImplV.o(1705976927);
                j2 = CoreTheme.b(composerImplV).e.d.b;
                composerImplV.V(z);
            } else {
                composerImplV.o(1706053311);
                j2 = CoreTheme.b(composerImplV).e.d.d;
                composerImplV.V(z);
            }
            ComposerImpl composerImpl = composerImplV;
            TextKt.a(str3, textStyle2, PaddingKt.j(companion, i3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), j2, null, 3, 0, false, 0, null, composerImpl, KyberEngine.KyberPolyBytes, 976);
            composerImplV = composerImpl;
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(step, i, 2, modifier2);
        }
    }
}
