package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BoxKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableScatterMap f941a = c(true);
    public static final MutableScatterMap b = c(false);
    public static final MeasurePolicy c = null;
    public static final MeasurePolicy d;

    static {
        new BoxMeasurePolicy(Alignment.Companion.f1719a, false);
        d = BoxKt$EmptyBoxMeasurePolicy$1.f942a;
    }

    public static final void a(final Modifier modifier, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-211209833);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerImplV.z(i2 & 1, (i2 & 3) != 2)) {
            int i3 = composerImplV.P;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, d, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$Box$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    BoxKt.a(modifier, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment alignment2;
        Object objI = measurable.getA();
        BoxChildDataNode boxChildDataNode = objI instanceof BoxChildDataNode ? (BoxChildDataNode) objI : null;
        Placeable.PlacementScope.g(placementScope, placeable, ((boxChildDataNode == null || (alignment2 = boxChildDataNode.r) == null) ? alignment : alignment2).a((placeable.d << 32) | (placeable.e & 4294967295L), (i << 32) | (i2 & 4294967295L), layoutDirection));
    }

    public static final MutableScatterMap c(boolean z) {
        MutableScatterMap mutableScatterMap = new MutableScatterMap(9);
        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
        mutableScatterMap.m(biasAlignment, new BoxMeasurePolicy(biasAlignment, z));
        BiasAlignment biasAlignment2 = Alignment.Companion.b;
        mutableScatterMap.m(biasAlignment2, new BoxMeasurePolicy(biasAlignment2, z));
        BiasAlignment biasAlignment3 = Alignment.Companion.c;
        mutableScatterMap.m(biasAlignment3, new BoxMeasurePolicy(biasAlignment3, z));
        BiasAlignment biasAlignment4 = Alignment.Companion.d;
        mutableScatterMap.m(biasAlignment4, new BoxMeasurePolicy(biasAlignment4, z));
        BiasAlignment biasAlignment5 = Alignment.Companion.e;
        mutableScatterMap.m(biasAlignment5, new BoxMeasurePolicy(biasAlignment5, z));
        BiasAlignment biasAlignment6 = Alignment.Companion.f;
        mutableScatterMap.m(biasAlignment6, new BoxMeasurePolicy(biasAlignment6, z));
        BiasAlignment biasAlignment7 = Alignment.Companion.g;
        mutableScatterMap.m(biasAlignment7, new BoxMeasurePolicy(biasAlignment7, z));
        BiasAlignment biasAlignment8 = Alignment.Companion.h;
        mutableScatterMap.m(biasAlignment8, new BoxMeasurePolicy(biasAlignment8, z));
        BiasAlignment biasAlignment9 = Alignment.Companion.i;
        mutableScatterMap.m(biasAlignment9, new BoxMeasurePolicy(biasAlignment9, z));
        return mutableScatterMap;
    }

    public static final MeasurePolicy d(Alignment alignment, boolean z) {
        MeasurePolicy measurePolicy = (MeasurePolicy) (z ? f941a : b).e(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z) : measurePolicy;
    }
}
