package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShowRewardsCardActionKt {
    public static final void a(int i, Composer composer, Modifier modifier, final String str, Function0 onClick) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-924612103);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if (((i2 | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            SurfaceKt.a(onClick, SizeKt.r(companion, 139, 40), false, RoundedCornerShapeKt.b(8), CoreTheme.b(composerImplV).e.f4848a.c, 0L, null, BorderStrokeKt.a(CoreTheme.b(composerImplV).e.b.e, 1), ComposableLambdaKt.c(-1979618688, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.ShowRewardsCardActionKt$ShowRewardsCardAction$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierH = PaddingKt.h(SizeKt.c, 16, BitmapDescriptorFactory.HUE_RED, 2);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.h(8, Alignment.Companion.n), Alignment.Companion.k, composer2, 54);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.reward_card, 0, composer2), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 124);
                        TextKt.a(str, CoreTheme.f(composer2).f5120a.b.f5123a, null, CoreTheme.b(composer2).f4782a.d.e.b, null, 5, 0, false, 0, null, composer2, 0, 980);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 356);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.ui.d(str, onClick, modifier2, i, 1);
        }
    }
}
