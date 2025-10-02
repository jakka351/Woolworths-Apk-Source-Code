package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PeekLazyRowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7548a = 0;

    static {
        ArrayList arrayList = new ArrayList(150);
        for (int i = 0; i < 150; i++) {
            arrayList.add("Item " + i);
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, String str) {
        String str2;
        int i2;
        ComposerImpl composerImplV = composer.v(-726665193);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (composerImplV.n(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImplV, i2 & 14, 0, 131070);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(str, modifier, i, 2, (byte) 0);
        }
    }

    public static final void b(final List list, final float f, final Modifier modifier, final double d, LazyListState lazyListState, final PaddingValuesImpl paddingValuesImpl, final Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        FlingBehavior flingBehaviorA;
        Alignment.Vertical vertical2;
        boolean z2;
        LazyListState lazyListState2;
        final LazyListState lazyListState3;
        final FlingBehavior flingBehavior2;
        final boolean z3;
        final Alignment.Vertical vertical3;
        ComposerImpl composerImplV = composer.v(-118803730);
        if (((i | (composerImplV.I(list) ? 4 : 2) | 370679808) & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            lazyListState3 = lazyListState;
            vertical3 = vertical;
            flingBehavior2 = flingBehavior;
            z3 = z;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
                flingBehaviorA = ScrollableDefaults.a(composerImplV);
                vertical2 = Alignment.Companion.j;
                z2 = true;
                lazyListState2 = lazyListStateA;
            } else {
                composerImplV.j();
                lazyListState2 = lazyListState;
                vertical2 = vertical;
                flingBehaviorA = flingBehavior;
                z2 = z;
            }
            composerImplV.W();
            final double dA = RangesKt.a(d, 0.1d, 0.9d);
            final float e = ((Density) composerImplV.x(CompositionLocalsKt.h)).getE();
            final int iB = MathKt.b(f * e);
            final int size = list.size() * iB;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                final LazyListState lazyListState4 = lazyListState2;
                objG = SnapshotStateKt.d(new Function0() { // from class: au.com.woolworths.feature.shop.modeselector.ui.f
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke() {
                        /*
                            r15 = this;
                            int r0 = au.com.woolworths.feature.shop.modeselector.ui.PeekLazyRowKt.f7548a
                            androidx.compose.foundation.lazy.LazyListState r0 = r1
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r1 = r0.j()
                            int r1 = r1.getM()
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r0 = r0.j()
                            int r0 = r0.getM()
                            int r2 = r2
                            if (r2 > r0) goto L1b
                            androidx.compose.foundation.layout.Arrangement$Horizontal r0 = r3
                            return r0
                        L1b:
                            int r0 = r4
                            int r2 = r1 / r0
                            r3 = 1
                            int r2 = java.lang.Math.max(r3, r2)
                            int r4 = r1 % r0
                            double r5 = (double) r0
                            double r7 = r5
                            double r9 = r7 * r5
                            int r9 = kotlin.math.MathKt.a(r9)
                            r10 = 0
                            if (r0 < r1) goto L34
                        L32:
                            r4 = r10
                            goto L4a
                        L34:
                            if (r4 <= r9) goto L39
                            int r4 = r4 - r9
                            int r4 = r4 / r2
                            goto L4a
                        L39:
                            if (r2 != r3) goto L3c
                            goto L32
                        L3c:
                            double r0 = (double) r1
                            double r11 = (double) r2
                            double r13 = (double) r3
                            double r13 = r13 - r7
                            double r11 = r11 - r13
                            double r11 = r11 * r5
                            double r0 = r0 - r11
                            int r2 = r2 - r3
                            double r2 = (double) r2
                            double r0 = r0 / r2
                            int r4 = kotlin.math.MathKt.a(r0)
                        L4a:
                            int r0 = java.lang.Math.max(r10, r4)
                            androidx.compose.foundation.layout.Arrangement$Start$1 r1 = androidx.compose.foundation.layout.Arrangement.f934a
                            float r0 = (float) r0
                            float r1 = r7
                            float r0 = r0 / r1
                            androidx.compose.foundation.layout.Arrangement$SpacedAligned r0 = androidx.compose.foundation.layout.Arrangement.g(r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ui.f.invoke():java.lang.Object");
                    }
                });
                composerImplV.A(objG);
            }
            State state = (State) objG;
            composerImplV.V(false);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Arrangement.Horizontal horizontal2 = (Arrangement.Horizontal) state.getD();
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(list);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(10, list, composableLambdaImpl);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyDslKt.d(modifier, lazyListState2, paddingValuesImpl, false, horizontal2, vertical2, flingBehaviorA, z2, null, (Function1) objG2, composerImplV, 12782982, 256);
            composerImplV.V(true);
            lazyListState3 = lazyListState2;
            flingBehavior2 = flingBehaviorA;
            z3 = z2;
            vertical3 = vertical2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(list, f, modifier, d, lazyListState3, paddingValuesImpl, horizontal, vertical3, flingBehavior2, z3, composableLambdaImpl, i) { // from class: au.com.woolworths.feature.shop.modeselector.ui.g
                public final /* synthetic */ List d;
                public final /* synthetic */ float e;
                public final /* synthetic */ Modifier f;
                public final /* synthetic */ double g;
                public final /* synthetic */ LazyListState h;
                public final /* synthetic */ PaddingValuesImpl i;
                public final /* synthetic */ Arrangement.Horizontal j;
                public final /* synthetic */ Alignment.Vertical k;
                public final /* synthetic */ FlingBehavior l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ ComposableLambdaImpl n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PeekLazyRowKt.b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, RecomposeScopeImplKt.a(12783025));
                    return Unit.f24250a;
                }
            };
        }
    }
}
