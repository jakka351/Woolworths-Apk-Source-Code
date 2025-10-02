package androidx.compose.foundation.lazy.grid;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridKt {
    public static final void a(final Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, final OverscrollEffect overscrollEffect, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        int i5;
        LazyGridState lazyGridState2;
        Modifier modifierA;
        final LazyGridState lazyGridState3 = lazyGridState;
        ComposerImpl composerImplV = composer.v(708740370);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(lazyGridState3) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? composerImplV.n(lazyGridSlotsProvider) : composerImplV.I(lazyGridSlotsProvider) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.p(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= composerImplV.p(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.n(flingBehavior) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.p(z3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.n(overscrollEffect) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.n(vertical) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.n(horizontal) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.I(function1) ? 32 : 16;
        }
        if (composerImplV.z(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            int i6 = i3 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            final MutableState mutableStateL = SnapshotStateKt.l(function1, composerImplV);
            int i9 = i3;
            boolean z4 = (((i8 & 14) ^ 6) > 4 && composerImplV.n(lazyGridState3)) || (i8 & 6) == 4;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z4 || objG == composer$Companion$Empty$1) {
                final State stateC = SnapshotStateKt.c(SnapshotStateKt.k(), new Function0<LazyGridIntervalContent>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new LazyGridIntervalContent((Function1) mutableStateL.getD());
                    }
                });
                objG = new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1(SnapshotStateKt.c(SnapshotStateKt.k(), new Function0<LazyGridItemProviderImpl>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) stateC.getD();
                        LazyGridState lazyGridState4 = lazyGridState3;
                        return new LazyGridItemProviderImpl(lazyGridState4, lazyGridIntervalContent, new NearestRangeKeyIndexMap((IntRange) lazyGridState4.d.e.getD(), lazyGridIntervalContent));
                    }
                }), State.class, "value", "getValue()Ljava/lang/Object;", 0);
                composerImplV.A(objG);
            }
            final KProperty0 kProperty0 = (KProperty0) objG;
            int i10 = i7 | ((i9 >> 9) & 112);
            boolean z5 = ((((i10 & 112) ^ 48) > 32 && composerImplV.p(z)) || (i10 & 48) == 32) | ((((i10 & 14) ^ 6) > 4 && composerImplV.n(lazyGridState3)) || (i10 & 6) == 4);
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == composer$Companion$Empty$1) {
                objG2 = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final int a() {
                        LazyGridState lazyGridState4 = lazyGridState3;
                        return lazyGridState4.i().getR() + lazyGridState4.i().c();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final Object b(int i11, Continuation continuation) {
                        Object objJ = LazyGridState.j(lazyGridState3, i11, (SuspendLambda) continuation);
                        return objJ == CoroutineSingletons.d ? objJ : Unit.f24250a;
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final float c() {
                        LazyGridState lazyGridState4 = lazyGridState3;
                        return (lazyGridState4.g() * 500) + lazyGridState4.h();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final float d() {
                        LazyGridState lazyGridState4 = lazyGridState3;
                        int iG = lazyGridState4.g();
                        int iH = lazyGridState4.h();
                        return lazyGridState4.b() ? (iG * 500) + iH + 100 : (iG * 500) + iH;
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final CollectionInfo e() {
                        return new CollectionInfo(-1, -1);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                    public final int f() {
                        LazyGridState lazyGridState4 = lazyGridState3;
                        return (int) (lazyGridState4.i().getQ() == Orientation.d ? lazyGridState4.i().a() & 4294967295L : lazyGridState4.i().a() >> 32);
                    }
                };
                composerImplV.A(objG2);
            }
            LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG3;
            final GraphicsContext graphicsContext = (GraphicsContext) composerImplV.x(CompositionLocalsKt.g);
            int i11 = (i9 & 524272) | ((i4 << 18) & 3670016) | ((i9 >> 6) & 29360128);
            final StickyItemsPlacement$Companion$StickToTopPlacement$1 stickyItemsPlacement$Companion$StickToTopPlacement$1 = !((Boolean) composerImplV.x(CompositionLocalsKt.v)).booleanValue() ? StickyItemsPlacement.Companion.f1065a : null;
            boolean zN = ((((i11 & 29360128) ^ 12582912) > 8388608 && composerImplV.n(vertical)) || (i11 & 12582912) == 8388608) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.n(lazyGridSlotsProvider)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | ((((i11 & 112) ^ 48) > 32 && composerImplV.n(lazyGridState3)) || (i11 & 48) == 32) | ((((i11 & 7168) ^ 3072) > 2048 && composerImplV.n(paddingValues)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && composerImplV.p(z)) || (i11 & 24576) == 16384) | ((((458752 & i11) ^ 196608) > 131072 && composerImplV.p(z2)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && composerImplV.n(horizontal)) || (i11 & 1572864) == 1048576) | composerImplV.n(graphicsContext);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == composer$Companion$Empty$1) {
                composerImpl2 = composerImplV;
                i5 = 4;
                Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:194:0x0455  */
                    /* JADX WARN: Removed duplicated region for block: B:205:0x049c  */
                    /* JADX WARN: Removed duplicated region for block: B:206:0x049f  */
                    /* JADX WARN: Removed duplicated region for block: B:251:0x057b  */
                    /* JADX WARN: Removed duplicated region for block: B:254:0x0586  */
                    /* JADX WARN: Removed duplicated region for block: B:257:0x058f  */
                    /* JADX WARN: Removed duplicated region for block: B:279:0x060f  */
                    /* JADX WARN: Removed duplicated region for block: B:280:0x0612  */
                    /* JADX WARN: Removed duplicated region for block: B:282:0x0616 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:285:0x061e  */
                    /* JADX WARN: Removed duplicated region for block: B:287:0x0629  */
                    /* JADX WARN: Removed duplicated region for block: B:295:0x064a  */
                    /* JADX WARN: Removed duplicated region for block: B:297:0x0650  */
                    /* JADX WARN: Removed duplicated region for block: B:299:0x0657  */
                    /* JADX WARN: Removed duplicated region for block: B:301:0x065d  */
                    /* JADX WARN: Removed duplicated region for block: B:305:0x0669  */
                    /* JADX WARN: Removed duplicated region for block: B:307:0x0671  */
                    /* JADX WARN: Removed duplicated region for block: B:308:0x0673  */
                    /* JADX WARN: Removed duplicated region for block: B:311:0x067a  */
                    /* JADX WARN: Removed duplicated region for block: B:312:0x067d  */
                    /* JADX WARN: Removed duplicated region for block: B:319:0x0690 A[LOOP:12: B:318:0x068e->B:319:0x0690, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:322:0x06ac  */
                    /* JADX WARN: Removed duplicated region for block: B:370:0x078d  */
                    /* JADX WARN: Removed duplicated region for block: B:389:0x0837  */
                    /* JADX WARN: Removed duplicated region for block: B:407:0x0894  */
                    /* JADX WARN: Removed duplicated region for block: B:411:0x08bd  */
                    /* JADX WARN: Removed duplicated region for block: B:415:0x08c4  */
                    /* JADX WARN: Removed duplicated region for block: B:418:0x08e4  */
                    /* JADX WARN: Removed duplicated region for block: B:420:0x08ea  */
                    /* JADX WARN: Removed duplicated region for block: B:444:0x0498 A[EDGE_INSN: B:444:0x0498->B:203:0x0498 BREAK  A[LOOP:4: B:192:0x0451->B:202:0x0491], SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Collection, java.util.List, kotlin.collections.ArrayDeque] */
                    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                    /* JADX WARN: Type inference failed for: r2v64, types: [kotlin.ranges.IntProgression] */
                    /* JADX WARN: Type inference failed for: r37v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider] */
                    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator] */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r64, java.lang.Object r65) {
                        /*
                            Method dump skipped, instructions count: 2344
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                lazyGridState2 = lazyGridState;
                composerImpl2.A(function2);
                objG4 = function2;
            } else {
                lazyGridState2 = lazyGridState;
                composerImpl2 = composerImplV;
                i5 = 4;
            }
            Function2 function22 = (Function2) objG4;
            Orientation orientation = z2 ? Orientation.d : Orientation.e;
            if (z3) {
                composerImpl2.o(-1614890700);
                boolean z6 = ((i7 ^ 6) > i5 && composerImpl2.n(lazyGridState2)) || (i6 & 6) == i5;
                Object objG5 = composerImpl2.G();
                if (z6 || objG5 == composer$Companion$Empty$1) {
                    objG5 = new LazyGridBeyondBoundsState(lazyGridState2);
                    composerImpl2.A(objG5);
                }
                modifierA = LazyLayoutBeyondBoundsModifierLocalKt.a((LazyGridBeyondBoundsState) objG5, lazyGridState2.n, z, orientation);
                composerImpl2.V(false);
            } else {
                composerImpl2.o(-1614595456);
                composerImpl2.V(false);
                modifierA = Modifier.Companion.d;
            }
            lazyGridState3 = lazyGridState2;
            composerImpl = composerImpl2;
            LazyLayoutKt.a(kProperty0, ScrollingContainerKt.a(LazyLayoutSemanticsKt.a(modifier.x0(lazyGridState2.k).x0(lazyGridState2.l), kProperty0, lazySemanticsKt$rememberLazyGridSemanticState$1$1, orientation, z3, z).x0(modifierA).x0(lazyGridState2.m.k), lazyGridState3, orientation, z3, z, flingBehavior, lazyGridState3.f, false, overscrollEffect, null), lazyGridState3.o, function22, composerImpl, 0);
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final LazyGridState lazyGridState4 = lazyGridState3;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    LazyGridKt.a(modifier, lazyGridState4, lazyGridSlotsProvider, paddingValues, z, z2, flingBehavior, z3, overscrollEffect, vertical, horizontal, function1, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
