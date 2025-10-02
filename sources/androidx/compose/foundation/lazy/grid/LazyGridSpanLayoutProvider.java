package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyGridSpanLayoutProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridIntervalContent f1021a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public Object h;
    public int i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Bucket {

        /* renamed from: a, reason: collision with root package name */
        public final int f1022a;
        public final int b;

        public Bucket(int i, int i2) {
            this.f1022a = i;
            this.b = i2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        /* renamed from: a, reason: collision with root package name */
        public static final LazyGridItemSpanScopeImpl f1023a = new LazyGridItemSpanScopeImpl();
        public static int b;

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public final int a() {
            return b;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public final int f1024a;
        public final List b;

        public LineConfiguration(int i, List list) {
            this.f1024a = i;
            this.b = list;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.f1021a = lazyGridIntervalContent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Bucket(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = EmptyList.d;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.i)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration b(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.b(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int c(final int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            InlineClassHelperKt.a("ItemIndex > total count");
        }
        if (!this.f1021a.c) {
            return i / this.i;
        }
        Function1<Bucket, Integer> function1 = new Function1<Bucket, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(((LazyGridSpanLayoutProvider.Bucket) obj).f1022a - i);
            }
        };
        ArrayList arrayList = this.b;
        int iO = CollectionsKt.o(arrayList.size(), arrayList, function1);
        if (iO < 0) {
            iO = (-iO) - 2;
        }
        int iA = a() * iO;
        int i2 = ((Bucket) arrayList.get(iO)).f1022a;
        if (i2 > i) {
            InlineClassHelperKt.a("currentItemIndex > itemIndex");
        }
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            int iE = e(i2);
            i3 += iE;
            int i5 = this.i;
            if (i3 >= i5) {
                if (i3 == i5) {
                    iA++;
                    i3 = 0;
                } else {
                    iA++;
                    i3 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new Bucket(i4 - (i3 <= 0 ? 0 : 1), 0));
            }
            i2 = i4;
        }
        return e(i) + i3 > this.i ? iA + 1 : iA;
    }

    public final int d() {
        return this.f1021a.b.b;
    }

    public final int e(int i) {
        LazyGridItemSpanScopeImpl.b = this.i;
        IntervalList.Interval intervalB = this.f1021a.b.b(i);
        int i2 = i - intervalB.f1033a;
        return (int) ((GridItemSpan) ((LazyGridInterval) intervalB.c).b.invoke(LazyGridItemSpanScopeImpl.f1023a, Integer.valueOf(i2))).f1007a;
    }
}
