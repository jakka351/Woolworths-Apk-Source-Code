package androidx.compose.ui.layout;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {

    /* renamed from: a, reason: collision with root package name */
    public final SubcomposeSlotReusePolicy f1896a;
    public LayoutNodeSubcompositionsState b;
    public final Function2 c = new Function2<LayoutNode, SubcomposeLayoutState, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            LayoutNode layoutNode = (LayoutNode) obj;
            SubcomposeLayoutState subcomposeLayoutState = this.h;
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = subcomposeLayoutState.f1896a;
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNode.M;
            if (layoutNodeSubcompositionsState == null) {
                layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy);
                layoutNode.M = layoutNodeSubcompositionsState;
            }
            subcomposeLayoutState.b = layoutNodeSubcompositionsState;
            subcomposeLayoutState.a().d();
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsStateA = subcomposeLayoutState.a();
            if (layoutNodeSubcompositionsStateA.f != subcomposeSlotReusePolicy) {
                layoutNodeSubcompositionsStateA.f = subcomposeSlotReusePolicy;
                layoutNodeSubcompositionsStateA.e(false);
                LayoutNode.m0(layoutNodeSubcompositionsStateA.d, false, 7);
            }
            return Unit.f24250a;
        }
    };
    public final Function2 d = new Function2<LayoutNode, CompositionContext, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            this.h.a().e = (CompositionContext) obj2;
            return Unit.f24250a;
        }
    };
    public final Function2 e = new Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            final Function2 function2 = (Function2) obj2;
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsStateA = this.h.a();
            ((LayoutNode) obj).f(new LayoutNode.NoIntrinsicsMeasurePolicy(layoutNodeSubcompositionsStateA.s) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final MeasureResult c(MeasureScope measureScope, List list, long j) {
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNodeSubcompositionsStateA;
                    LayoutNodeSubcompositionsState.Scope scope = layoutNodeSubcompositionsState.k;
                    scope.d = measureScope.getD();
                    scope.e = measureScope.getE();
                    scope.f = measureScope.getF();
                    boolean zL1 = measureScope.l1();
                    Function2 function22 = function2;
                    if (zL1 || layoutNodeSubcompositionsState.d.m == null) {
                        layoutNodeSubcompositionsState.g = 0;
                        final MeasureResult measureResult = (MeasureResult) function22.invoke(scope, new Constraints(j));
                        final int i = layoutNodeSubcompositionsState.g;
                        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                            @Override // androidx.compose.ui.layout.MeasureResult
                            /* renamed from: getHeight */
                            public final int getB() {
                                return measureResult.getB();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            /* renamed from: getWidth */
                            public final int getF1885a() {
                                return measureResult.getF1885a();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            /* renamed from: o */
                            public final Map getC() {
                                return measureResult.getC();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            public final Function1 p() {
                                return measureResult.p();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            public final void q() {
                                int i2 = i;
                                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                                layoutNodeSubcompositionsState2.g = i2;
                                measureResult.q();
                                layoutNodeSubcompositionsState2.b(layoutNodeSubcompositionsState2.g);
                            }
                        };
                    }
                    layoutNodeSubcompositionsState.h = 0;
                    final MeasureResult measureResult2 = (MeasureResult) function22.invoke(layoutNodeSubcompositionsState.l, new Constraints(j));
                    final int i2 = layoutNodeSubcompositionsState.h;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* renamed from: getHeight */
                        public final int getB() {
                            return measureResult2.getB();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* renamed from: getWidth */
                        public final int getF1885a() {
                            return measureResult2.getF1885a();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* renamed from: o */
                        public final Map getC() {
                            return measureResult2.getC();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final Function1 p() {
                            return measureResult2.p();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final void q() {
                            int i3 = i2;
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.h = i3;
                            measureResult2.q();
                            MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState2.o;
                            long[] jArr = mutableScatterMap.f698a;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                return;
                            }
                            int i4 = 0;
                            while (true) {
                                long j2 = jArr[i4];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j2) < 128) {
                                            int i7 = (i4 << 3) + i6;
                                            Object obj3 = mutableScatterMap.b[i7];
                                            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.c[i7];
                                            int iJ = layoutNodeSubcompositionsState2.p.j(obj3);
                                            if (iJ < 0 || iJ >= layoutNodeSubcompositionsState2.h) {
                                                precomposedSlotHandle.dispose();
                                                mutableScatterMap.l(i7);
                                            }
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i5 != 8) {
                                        return;
                                    }
                                }
                                if (i4 == length) {
                                    return;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    };
                }
            });
            return Unit.f24250a;
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface PrecomposedSlotHandle {
        default void a(Function1 function1) {
        }

        default int b() {
            return 0;
        }

        default void c(int i, long j) {
        }

        void dispose();
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.f1896a = subcomposeSlotReusePolicy;
    }

    public final LayoutNodeSubcompositionsState a() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
