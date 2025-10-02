package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/LiveData;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes.dex */
public final class RoomTrackingLiveData<T> extends LiveData<T> {
    public final RoomDatabase l;
    public final InvalidationLiveDataContainer m;
    public final boolean n;
    public final Callable o;
    public final RoomTrackingLiveData$observer$1 p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final a t;
    public final a u;

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.room.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.room.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.room.RoomTrackingLiveData$observer$1] */
    public RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer container, Callable callable, final String[] strArr) {
        Intrinsics.h(container, "container");
        this.l = roomDatabase;
        this.m = container;
        this.n = true;
        this.o = callable;
        this.p = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public final void a(Set tables) {
                Intrinsics.h(tables, "tables");
                ArchTaskExecutor.d().a(this.u);
            }
        };
        this.q = new AtomicBoolean(true);
        final int i = 0;
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new Runnable(this) { // from class: androidx.room.a
            public final /* synthetic */ RoomTrackingLiveData e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Executor executorI;
                switch (i) {
                    case 0:
                        RoomTrackingLiveData roomTrackingLiveData = this.e;
                        AtomicBoolean atomicBoolean = roomTrackingLiveData.q;
                        AtomicBoolean atomicBoolean2 = roomTrackingLiveData.r;
                        if (roomTrackingLiveData.s.compareAndSet(false, true)) {
                            InvalidationTracker invalidationTracker = roomTrackingLiveData.l.e;
                            RoomTrackingLiveData$observer$1 observer = roomTrackingLiveData.p;
                            invalidationTracker.getClass();
                            Intrinsics.h(observer, "observer");
                            invalidationTracker.a(new InvalidationTracker.WeakObserver(invalidationTracker, observer));
                        }
                        do {
                            if (atomicBoolean2.compareAndSet(false, true)) {
                                Object objCall = null;
                                z = false;
                                while (atomicBoolean.compareAndSet(true, false)) {
                                    try {
                                        try {
                                            objCall = roomTrackingLiveData.o.call();
                                            z = true;
                                        } catch (Exception e) {
                                            throw new RuntimeException("Exception while computing database live data.", e);
                                        }
                                    } finally {
                                        atomicBoolean2.set(false);
                                    }
                                }
                                if (z) {
                                    roomTrackingLiveData.j(objCall);
                                }
                            } else {
                                z = false;
                            }
                            if (!z) {
                                return;
                            }
                        } while (atomicBoolean.get());
                        return;
                    default:
                        RoomTrackingLiveData roomTrackingLiveData2 = this.e;
                        boolean z2 = roomTrackingLiveData2.c > 0;
                        if (roomTrackingLiveData2.q.compareAndSet(false, true) && z2) {
                            RoomDatabase roomDatabase2 = roomTrackingLiveData2.l;
                            if (roomTrackingLiveData2.n) {
                                executorI = roomDatabase2.c;
                                if (executorI == null) {
                                    Intrinsics.p("internalTransactionExecutor");
                                    throw null;
                                }
                            } else {
                                executorI = roomDatabase2.i();
                            }
                            executorI.execute(roomTrackingLiveData2.t);
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        this.u = new Runnable(this) { // from class: androidx.room.a
            public final /* synthetic */ RoomTrackingLiveData e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Executor executorI;
                switch (i2) {
                    case 0:
                        RoomTrackingLiveData roomTrackingLiveData = this.e;
                        AtomicBoolean atomicBoolean = roomTrackingLiveData.q;
                        AtomicBoolean atomicBoolean2 = roomTrackingLiveData.r;
                        if (roomTrackingLiveData.s.compareAndSet(false, true)) {
                            InvalidationTracker invalidationTracker = roomTrackingLiveData.l.e;
                            RoomTrackingLiveData$observer$1 observer = roomTrackingLiveData.p;
                            invalidationTracker.getClass();
                            Intrinsics.h(observer, "observer");
                            invalidationTracker.a(new InvalidationTracker.WeakObserver(invalidationTracker, observer));
                        }
                        do {
                            if (atomicBoolean2.compareAndSet(false, true)) {
                                Object objCall = null;
                                z = false;
                                while (atomicBoolean.compareAndSet(true, false)) {
                                    try {
                                        try {
                                            objCall = roomTrackingLiveData.o.call();
                                            z = true;
                                        } catch (Exception e) {
                                            throw new RuntimeException("Exception while computing database live data.", e);
                                        }
                                    } finally {
                                        atomicBoolean2.set(false);
                                    }
                                }
                                if (z) {
                                    roomTrackingLiveData.j(objCall);
                                }
                            } else {
                                z = false;
                            }
                            if (!z) {
                                return;
                            }
                        } while (atomicBoolean.get());
                        return;
                    default:
                        RoomTrackingLiveData roomTrackingLiveData2 = this.e;
                        boolean z2 = roomTrackingLiveData2.c > 0;
                        if (roomTrackingLiveData2.q.compareAndSet(false, true) && z2) {
                            RoomDatabase roomDatabase2 = roomTrackingLiveData2.l;
                            if (roomTrackingLiveData2.n) {
                                executorI = roomDatabase2.c;
                                if (executorI == null) {
                                    Intrinsics.p("internalTransactionExecutor");
                                    throw null;
                                }
                            } else {
                                executorI = roomDatabase2.i();
                            }
                            executorI.execute(roomTrackingLiveData2.t);
                            return;
                        }
                        return;
                }
            }
        };
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        Executor executorI;
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.m;
        invalidationLiveDataContainer.getClass();
        invalidationLiveDataContainer.b.add(this);
        boolean z = this.n;
        RoomDatabase roomDatabase = this.l;
        if (z) {
            executorI = roomDatabase.c;
            if (executorI == null) {
                Intrinsics.p("internalTransactionExecutor");
                throw null;
            }
        } else {
            executorI = roomDatabase.i();
        }
        executorI.execute(this.t);
    }

    @Override // androidx.lifecycle.LiveData
    public final void i() {
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.m;
        invalidationLiveDataContainer.getClass();
        invalidationLiveDataContainer.b.remove(this);
    }
}
