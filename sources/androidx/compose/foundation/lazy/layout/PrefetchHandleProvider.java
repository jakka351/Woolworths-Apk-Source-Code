package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.NestedPrefetchScopeImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.LongSaturatedMathKt;
import kotlin.time.MonotonicTimeSource;

@StabilityInferred
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "", "HandleAndRequestImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrefetchHandleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutItemContentFactory f1060a;
    public final SubcomposeLayoutState b;
    public final PrefetchScheduler c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "NestedPrefetchController", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalFoundationApi
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {

        /* renamed from: a, reason: collision with root package name */
        public final int f1061a;
        public final long b;
        public final PrefetchMetrics c;
        public SubcomposeLayoutState.PrecomposedSlotHandle d;
        public boolean e;
        public boolean f;
        public boolean g;
        public NestedPrefetchController h;
        public boolean i;
        public long j;
        public long k;
        public long l = MonotonicTimeSource.a();

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public final class NestedPrefetchController {

            /* renamed from: a, reason: collision with root package name */
            public final List f1062a;
            public final List[] b;
            public int c;
            public int d;

            public NestedPrefetchController(List list) {
                this.f1062a = list;
                this.b = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        public HandleAndRequestImpl(int i, long j, PrefetchMetrics prefetchMetrics) {
            this.f1061a = i;
            this.b = j;
            this.c = prefetchMetrics;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public final boolean a(AndroidPrefetchScheduler.PrefetchRequestScopeImpl prefetchRequestScopeImpl) {
            long j;
            long j2;
            long j3;
            Object obj;
            long j4;
            List list;
            PrefetchHandleProvider prefetchHandleProvider = PrefetchHandleProvider.this;
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) prefetchHandleProvider.f1060a.b).invoke();
            if (this.f) {
                return false;
            }
            int iA = lazyLayoutItemProvider.a();
            int i = this.f1061a;
            if (i < 0 || i >= iA) {
                return false;
            }
            Object objE = lazyLayoutItemProvider.e(i);
            this.j = prefetchRequestScopeImpl.a();
            this.l = MonotonicTimeSource.a();
            this.k = 0L;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            PrefetchMetrics prefetchMetrics = this.c;
            if (precomposedSlotHandle != null) {
                j = 0;
            } else {
                long j5 = this.j;
                j = 0;
                long j6 = prefetchMetrics.a(objE).f1031a;
                if ((!this.i || j5 <= 0) && j6 >= j5) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    if (this.d != null) {
                        InlineClassHelperKt.a("Request was already composed!");
                    }
                    Object objF = lazyLayoutItemProvider.f(i);
                    this.d = prefetchHandleProvider.b.a().f(objF, prefetchHandleProvider.f1060a.a(i, objF, objE));
                    Trace.endSection();
                    e();
                    long j7 = this.k;
                    Averages averages = prefetchMetrics.f1063a;
                    long j8 = averages.f1031a;
                    if (j8 == 0) {
                        j2 = j7;
                    } else {
                        long j9 = 4;
                        j2 = j7;
                        j7 = (j2 / j9) + ((j8 / j9) * 3);
                    }
                    averages.f1031a = j7;
                    Averages averagesA = prefetchMetrics.a(objE);
                    long j10 = averagesA.f1031a;
                    if (j10 == 0) {
                        j3 = j2;
                    } else {
                        long j11 = 4;
                        j3 = (j2 / j11) + ((j10 / j11) * 3);
                    }
                    averagesA.f1031a = j3;
                } finally {
                }
            }
            if (!this.i) {
                if (!this.g) {
                    if (this.j <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.h = d();
                        this.g = true;
                    } finally {
                    }
                }
                NestedPrefetchController nestedPrefetchController = this.h;
                if (nestedPrefetchController != null) {
                    List[] listArr = nestedPrefetchController.b;
                    int i2 = nestedPrefetchController.c;
                    List list2 = nestedPrefetchController.f1062a;
                    if (i2 < list2.size()) {
                        if (HandleAndRequestImpl.this.f) {
                            InlineClassHelperKt.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (nestedPrefetchController.c < list2.size()) {
                            try {
                                if (listArr[nestedPrefetchController.c] == null) {
                                    if (prefetchRequestScopeImpl.a() <= j) {
                                        return true;
                                    }
                                    int i3 = nestedPrefetchController.c;
                                    LazyLayoutPrefetchState lazyLayoutPrefetchState = (LazyLayoutPrefetchState) list2.get(i3);
                                    Function1 function1 = lazyLayoutPrefetchState.b;
                                    if (function1 == null) {
                                        list = EmptyList.d;
                                    } else {
                                        LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = lazyLayoutPrefetchState.new NestedPrefetchScopeImpl();
                                        function1.invoke(nestedPrefetchScopeImpl);
                                        list = nestedPrefetchScopeImpl.f1051a;
                                    }
                                    listArr[i3] = list;
                                }
                                List list3 = listArr[nestedPrefetchController.c];
                                Intrinsics.e(list3);
                                while (nestedPrefetchController.d < list3.size()) {
                                    if (((PrefetchRequest) list3.get(nestedPrefetchController.d)).a(prefetchRequestScopeImpl)) {
                                        return true;
                                    }
                                    nestedPrefetchController.d++;
                                }
                                nestedPrefetchController.d = 0;
                                nestedPrefetchController.c++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                e();
            }
            if (this.e) {
                return false;
            }
            long j12 = this.b;
            if (Constraints.k(j12)) {
                return false;
            }
            long j13 = this.j;
            long j14 = prefetchMetrics.a(objE).b;
            if ((!this.i || j13 <= j) && j14 >= j13) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:measure");
            try {
                c(j12);
                Trace.endSection();
                e();
                long j15 = this.k;
                Averages averages2 = prefetchMetrics.f1063a;
                long j16 = averages2.b;
                if (j16 == j) {
                    obj = objE;
                    j4 = j15;
                } else {
                    long j17 = 4;
                    obj = objE;
                    j4 = (j15 / j17) + ((j16 / j17) * 3);
                }
                averages2.b = j4;
                Averages averagesA2 = prefetchMetrics.a(obj);
                long j18 = averagesA2.b;
                if (j18 != j) {
                    long j19 = 4;
                    j15 = (j15 / j19) + ((j18 / j19) * 3);
                }
                averagesA2.b = j15;
                return false;
            } finally {
            }
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void b() {
            this.i = true;
        }

        public final void c(long j) {
            if (this.f) {
                InlineClassHelperKt.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.e) {
                InlineClassHelperKt.a("Request was already measured!");
            }
            this.e = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.b("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iB = precomposedSlotHandle.b();
            for (int i = 0; i < iB; i++) {
                precomposedSlotHandle.c(i, j);
            }
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void cancel() {
            if (this.f) {
                return;
            }
            this.f = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.d = null;
        }

        public final NestedPrefetchController d() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.b("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            precomposedSlotHandle.a(new Function1<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TraversableNode traversableNode = (TraversableNode) obj;
                    Intrinsics.f(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    LazyLayoutPrefetchState lazyLayoutPrefetchState = ((TraversablePrefetchStateNode) traversableNode).r;
                    Ref.ObjectRef objectRef2 = objectRef;
                    List listZ = (List) objectRef2.d;
                    if (listZ != null) {
                        listZ.add(lazyLayoutPrefetchState);
                    } else {
                        listZ = CollectionsKt.Z(lazyLayoutPrefetchState);
                    }
                    objectRef2.d = listZ;
                    return TraversableNode.Companion.TraverseDescendantsAction.e;
                }
            });
            List list = (List) objectRef.d;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        public final void e() {
            long jA;
            long jA2 = MonotonicTimeSource.a();
            long j = this.l;
            DurationUnit unit = DurationUnit.e;
            Intrinsics.h(unit, "unit");
            long j2 = Long.MAX_VALUE;
            if (((j - 1) | 1) != Long.MAX_VALUE) {
                jA = (1 | (jA2 - 1)) == Long.MAX_VALUE ? LongSaturatedMathKt.a(jA2) : LongSaturatedMathKt.b(jA2, j, unit);
            } else if (jA2 == j) {
                int i = Duration.g;
                jA = 0;
            } else {
                jA = Duration.o(LongSaturatedMathKt.a(j));
            }
            long j3 = jA >> 1;
            int i2 = Duration.g;
            if ((((int) jA) & 1) == 0) {
                j2 = j3;
            } else if (j3 <= 9223372036854L) {
                j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
            }
            this.k = j2;
            this.j -= j2;
            this.l = jA2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.f1061a);
            sb.append(", constraints = ");
            sb.append((Object) Constraints.l(this.b));
            sb.append(", isComposed = ");
            sb.append(this.d != null);
            sb.append(", isMeasured = ");
            sb.append(this.e);
            sb.append(", isCanceled = ");
            return YU.a.k(" }", sb, this.f);
        }
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.f1060a = lazyLayoutItemContentFactory;
        this.b = subcomposeLayoutState;
        this.c = prefetchScheduler;
    }
}
