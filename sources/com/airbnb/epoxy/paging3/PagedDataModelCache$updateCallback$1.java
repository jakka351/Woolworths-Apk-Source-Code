package com.airbnb.epoxy.paging3;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.airbnb.epoxy.EpoxyModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/airbnb/epoxy/paging3/PagedDataModelCache$updateCallback$1", "Landroidx/recyclerview/widget/ListUpdateCallback;", "epoxy-paging3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PagedDataModelCache$updateCallback$1 implements ListUpdateCallback {
    public final /* synthetic */ PagedDataModelCache d;

    public PagedDataModelCache$updateCallback$1(PagedDataModelCache pagedDataModelCache) {
        this.d = pagedDataModelCache;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void a(final int i, final int i2, Object obj) {
        final PagedDataModelCache pagedDataModelCache = this.d;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedDataModelCache$updateCallback$1$onChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagedDataModelCache pagedDataModelCache2 = pagedDataModelCache;
                PagedDataModelCache.a(pagedDataModelCache2);
                int i3 = i2;
                int i4 = i;
                IntProgressionIterator it = RangesKt.o(i4, i3 + i4).iterator();
                while (it.f) {
                    pagedDataModelCache2.d.set(it.nextInt(), null);
                }
                ((PagingDataEpoxyController$modelCache$2) pagedDataModelCache2.b).invoke();
                return Unit.f24250a;
            }
        };
        synchronized (pagedDataModelCache) {
            function0.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void b(final int i, final int i2) {
        final PagedDataModelCache pagedDataModelCache = this.d;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedDataModelCache$updateCallback$1$onRemoved$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagedDataModelCache pagedDataModelCache2 = pagedDataModelCache;
                PagedDataModelCache.a(pagedDataModelCache2);
                for (int i3 = 0; i3 < i2; i3++) {
                    pagedDataModelCache2.d.remove(i);
                }
                pagedDataModelCache2.b.invoke();
                return Unit.f24250a;
            }
        };
        synchronized (pagedDataModelCache) {
            function0.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void c(final int i, final int i2) {
        final PagedDataModelCache pagedDataModelCache = this.d;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedDataModelCache$updateCallback$1$onMoved$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagedDataModelCache pagedDataModelCache2 = pagedDataModelCache;
                PagedDataModelCache.a(pagedDataModelCache2);
                ArrayList arrayList = pagedDataModelCache2.d;
                arrayList.add(i2, (EpoxyModel) arrayList.remove(i));
                pagedDataModelCache2.b.invoke();
                return Unit.f24250a;
            }
        };
        synchronized (pagedDataModelCache) {
            function0.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public final void d(final int i, final int i2) {
        final PagedDataModelCache pagedDataModelCache = this.d;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedDataModelCache$updateCallback$1$onInserted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagedDataModelCache pagedDataModelCache2 = pagedDataModelCache;
                PagedDataModelCache.a(pagedDataModelCache2);
                for (int i3 = 0; i3 < i2; i3++) {
                    pagedDataModelCache2.d.add(i, null);
                }
                pagedDataModelCache2.b.invoke();
                return Unit.f24250a;
            }
        };
        synchronized (pagedDataModelCache) {
            function0.invoke();
        }
    }
}
