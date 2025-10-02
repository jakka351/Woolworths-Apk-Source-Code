package androidx.room.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: androidx.room.paging.LimitOffsetDataSource$1, reason: invalid class name */
    class AnonymousClass1 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set set) {
            throw null;
        }
    }

    @Override // androidx.paging.DataSource
    public final boolean d() {
        throw null;
    }

    @Override // androidx.paging.PositionalDataSource
    public final void g(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback loadInitialCallback) {
        throw null;
    }

    @Override // androidx.paging.PositionalDataSource
    public final void h(PositionalDataSource.LoadRangeParams loadRangeParams, PositionalDataSource.LoadRangeCallback loadRangeCallback) {
        throw null;
    }
}
