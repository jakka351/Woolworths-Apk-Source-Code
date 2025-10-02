package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.animation.graphics.res.AnimatedVectorPainterResources_androidKt;
import androidx.compose.animation.graphics.res.AnimatedVectorResources_androidKt;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TintableTextKt {
    public static final void a(final TintableTextSpec tintableTextSpec, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-226667953);
        int i2 = (composerImplV.n(tintableTextSpec) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.a(modifier, null, Color.b(tintableTextSpec.c, 0.1f), 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(357601675, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.offers.ui.TintableTextKt$TintableText$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierG = PaddingKt.g(companion, 12, 6);
                    TintableTextSpec tintableTextSpec2 = tintableTextSpec;
                    int i3 = tintableTextSpec2.d;
                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Center$1, Alignment.Companion.k, composer2, 54);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierG);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    Painter painterA = null;
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
                    Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    composer2.o(-965759183);
                    int i4 = tintableTextSpec2.e;
                    if (i3 != 0) {
                        composer2.o(-373826824);
                        painterA = PainterResources_androidKt.a(i3, 0, composer2);
                        composer2.l();
                    } else if (i4 != 0) {
                        composer2.o(-373709985);
                        composer2.o(-1012284749);
                        AnimatedImageVector animatedImageVector = AnimatedVectorResources_androidKt.a(i4, 6, composer2);
                        Intrinsics.h(animatedImageVector, "animatedImageVector");
                        composer2.o(542884129);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = SnapshotStateKt.f(Boolean.FALSE);
                            composer2.A(objG);
                        }
                        MutableState mutableState = (MutableState) objG;
                        composer2.l();
                        long j = animatedImageVector.c;
                        composer2.o(-1633490746);
                        boolean zS = composer2.s(j);
                        Object objG2 = composer2.G();
                        if (zS || objG2 == composer$Companion$Empty$1) {
                            objG2 = new LoopingAnimatedVectorKt$rememberLoopingAnimatedVectorPainter$1$1(j, mutableState, null);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        EffectsKt.e(composer2, unit, (Function2) objG2);
                        painterA = AnimatedVectorPainterResources_androidKt.a(animatedImageVector, ((Boolean) mutableState.getD()).booleanValue(), composer2);
                        composer2.l();
                        composer2.l();
                        composer2.l();
                    } else {
                        composer2.o(-373605392);
                        composer2.l();
                    }
                    Painter painter = painterA;
                    composer2.l();
                    composer2.o(-717049542);
                    if (painter != null) {
                        ImageKt.a(painter, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 124);
                    }
                    composer2.l();
                    TextKt.b(tintableTextSpec2.f8629a, PaddingKt.j(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, tintableTextSpec2.f, 1), painter == null ? 0 : 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), tintableTextSpec2.c, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, tintableTextSpec2.b, composer2, 0, 3120, 55288);
                    composer2.f();
                    return unit;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 1572864, 58);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(tintableTextSpec, i, 3, modifier);
        }
    }
}
