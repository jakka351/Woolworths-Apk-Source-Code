package au.com.woolworths.feature.shop.wpay.ui.common.component;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LoadingScreenKt {
    public static final void a(Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        long j3;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(921279260);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
            j2 = j;
        } else {
            j2 = j;
            i3 = i4 | (composerImplV.s(j2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            j3 = j2;
        } else {
            long j4 = i5 != 0 ? Color.k : j2;
            Modifier modifierB = BackgroundKt.b(SizeKt.c, j4, RectangleShapeKt.f1779a);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = LoadingScreenKt$LoadingScreen$1$1.d;
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = SuspendingPointerInputFilterKt.d(modifierB, Unit.f24250a, (PointerInputEventHandler) objG);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
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
                b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            BiasAlignment biasAlignment = Alignment.Companion.e;
            Modifier.Companion companion = Modifier.Companion.d;
            CircularProgressIndicatorKt.b(boxScopeInstance.g(companion, biasAlignment), 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 14);
            composerImplV.V(true);
            j3 = j4;
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(modifier2, j3, i, i2);
        }
    }
}
