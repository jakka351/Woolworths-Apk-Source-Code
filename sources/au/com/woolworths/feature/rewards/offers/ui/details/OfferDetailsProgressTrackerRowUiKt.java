package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsProgressTrackerRowUiKt {
    public static final void a(String str, String str2, ProgressRing progressRing, Modifier modifier, Composer composer, int i) {
        Function2 function2;
        Modifier.Companion companion;
        Function2 function22;
        Function0 function0;
        Function2 function23;
        boolean z;
        ComposerImpl composerImplV = composer.v(119750676);
        if (((i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(progressRing) ? 256 : 128)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function24 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function24);
            Function2 function25 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function25);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function26);
            }
            Function2 function27 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function27);
            composerImplV.o(-1157269700);
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (progressRing == null) {
                function22 = function27;
                function2 = function26;
                companion = companion2;
                function0 = function02;
                function23 = function24;
            } else {
                function2 = function26;
                companion = companion2;
                function22 = function27;
                function0 = function02;
                function23 = function24;
                ProgressIndicatorKt.a(progressRing.f6412a, TestTagKt.a(SizeKt.q(companion2, 64), "offer_details_tracker_progress_row_ring"), CoreTheme.b(composerImplV).b.b.c, 8, CoreTheme.b(composerImplV).e.b.f4852a, 1, composerImplV, 3120, 0);
                SpacerKt.a(composerImplV, SizeKt.u(companion, 12));
            }
            composerImplV.V(false);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD2, function22);
            composerImplV.o(2008205055);
            if (str == null) {
                z = false;
            } else {
                TextKt.b(str, null, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.b.b, composerImplV, 0, 0, 65530);
                composerImplV = composerImplV;
                z = false;
            }
            composerImplV.V(z);
            composerImplV.o(2008213243);
            if (str2 != null) {
                ComposerImpl composerImpl = composerImplV;
                TextKt.b(str2, null, CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImpl, 0, 0, 65530);
                composerImplV = composerImpl;
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(str, str2, progressRing, modifier, i, 9);
        }
    }
}
