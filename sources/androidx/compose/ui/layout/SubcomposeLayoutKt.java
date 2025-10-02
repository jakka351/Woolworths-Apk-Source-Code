package androidx.compose.ui.layout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SubcomposeLayoutKt$ReusedSlotId$1 f1895a = new SubcomposeLayoutKt$ReusedSlotId$1();

    public static final void a(final Modifier modifier, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if (composerImplV.z(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new SubcomposeLayoutState(NoOpSubcomposeSlotReusePolicy.f1890a);
                composerImplV.A(objG);
            }
            b((SubcomposeLayoutState) objG, modifier, function2, composerImplV, (i3 << 3) & 1008);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int i5 = i2;
                    SubcomposeLayoutKt.a(modifier, function2, (Composer) obj, iA, i5);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final SubcomposeLayoutState subcomposeLayoutState, final Modifier modifier, final Function2 function2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-511989831);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(subcomposeLayoutState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function2) ? 256 : 128;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            int i3 = composerImplV.P;
            ComposerImpl.CompositionContextImpl compositionContextImplM = composerImplV.m();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            Function0 function0A = LayoutNode.Companion.a();
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0A);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, subcomposeLayoutState, subcomposeLayoutState.c);
            Updater.b(composerImplV, compositionContextImplM, subcomposeLayoutState.d);
            Updater.b(composerImplV, function2, subcomposeLayoutState.e);
            ComposeUiNode.e3.getClass();
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function22);
            }
            composerImplV.V(true);
            if (composerImplV.c()) {
                composerImplV.o(-26267397);
                composerImplV.V(false);
            } else {
                composerImplV.o(-26326018);
                boolean zI = composerImplV.I(subcomposeLayoutState);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new Function0<Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r17 = this;
                                r0 = r17
                                androidx.compose.ui.layout.SubcomposeLayoutState r1 = r1
                                androidx.compose.ui.layout.LayoutNodeSubcompositionsState r1 = r1.a()
                                androidx.compose.ui.node.LayoutNode r2 = r1.d
                                java.util.List r3 = r2.E()
                                int r3 = r3.size()
                                int r4 = r1.q
                                if (r4 == r3) goto L66
                                androidx.collection.MutableScatterMap r1 = r1.i
                                java.lang.Object[] r3 = r1.c
                                long[] r1 = r1.f698a
                                int r4 = r1.length
                                int r4 = r4 + (-2)
                                r5 = 7
                                r6 = 0
                                if (r4 < 0) goto L5d
                                r7 = r6
                            L24:
                                r8 = r1[r7]
                                long r10 = ~r8
                                long r10 = r10 << r5
                                long r10 = r10 & r8
                                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                                long r10 = r10 & r12
                                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                                if (r10 == 0) goto L58
                                int r10 = r7 - r4
                                int r10 = ~r10
                                int r10 = r10 >>> 31
                                r11 = 8
                                int r10 = 8 - r10
                                r12 = r6
                            L3d:
                                if (r12 >= r10) goto L56
                                r13 = 255(0xff, double:1.26E-321)
                                long r13 = r13 & r8
                                r15 = 128(0x80, double:6.32E-322)
                                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                                if (r13 >= 0) goto L52
                                int r13 = r7 << 3
                                int r13 = r13 + r12
                                r13 = r3[r13]
                                androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r13 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r13
                                r14 = 1
                                r13.d = r14
                            L52:
                                long r8 = r8 >> r11
                                int r12 = r12 + 1
                                goto L3d
                            L56:
                                if (r10 != r11) goto L5d
                            L58:
                                if (r7 == r4) goto L5d
                                int r7 = r7 + 1
                                goto L24
                            L5d:
                                boolean r1 = r2.G()
                                if (r1 != 0) goto L66
                                androidx.compose.ui.node.LayoutNode.m0(r2, r6, r5)
                            L66:
                                kotlin.Unit r1 = kotlin.Unit.f24250a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1.invoke():java.lang.Object");
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.g((Function0) objG);
                composerImplV.V(false);
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    SubcomposeLayoutKt.b(subcomposeLayoutState, modifier, function2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
