package au.com.woolworths.design.wx.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.TextUnit;
import au.com.woolworths.compose.utils.modifier.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MeasureInlineContentPlaceholderKt {
    public static final void a(final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(505088686);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            composerImplV.o(-1633490746);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function2() { // from class: au.com.woolworths.design.wx.utils.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        SubcomposeMeasureScope SubcomposeLayout = (SubcomposeMeasureScope) obj;
                        Intrinsics.h(SubcomposeLayout, "$this$SubcomposeLayout");
                        Placeable placeableC0 = ((Measurable) SubcomposeLayout.X0("viewToMeasure", composableLambdaImpl).get(0)).c0(ConstraintsKt.b(0, 0, 15));
                        final long jT = SubcomposeLayout.t(placeableC0.d);
                        final long jT2 = SubcomposeLayout.t(placeableC0.e);
                        final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                        Placeable placeableC02 = ((Measurable) SubcomposeLayout.X0("content", new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.utils.MeasureInlineContentPlaceholderKt$MeasureInlineContentPlaceholder$1$1$contentPlaceable$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    composableLambdaImpl3.invoke(new TextUnit(jT), new TextUnit(jT2), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 641123244)).get(0)).c0(((Constraints) obj2).f2197a);
                        return SubcomposeLayout.L0(placeableC02.d, placeableC02.e, EmptyMap.d, new h(placeableC02, 2));
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SubcomposeLayoutKt.a(modifier, (Function2) objG, composerImplV, (i3 >> 3) & 14, 0);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(composableLambdaImpl, modifier2, composableLambdaImpl2, i, i2, 1);
        }
    }
}
