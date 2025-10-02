package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class ListFuture<V> implements ListenableFuture<List<V>> {
    public ArrayList d;
    public ArrayList e;
    public final boolean f;
    public final AtomicInteger g;
    public final ListenableFuture h = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver<List<Object>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
            ListFuture listFuture = ListFuture.this;
            Preconditions.f("The result can only set once!", listFuture.i == null);
            listFuture.i = completer;
            return "ListFuture[" + this + "]";
        }
    });
    public CallbackToFutureAdapter.Completer i;

    public ListFuture(ArrayList arrayList, boolean z, Executor executor) {
        this.d = arrayList;
        this.e = new ArrayList(arrayList.size());
        this.f = z;
        this.g = new AtomicInteger(arrayList.size());
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public final void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.e = null;
                listFuture.d = null;
            }
        }, CameraXExecutors.a());
        if (this.d.isEmpty()) {
            this.i.b(new ArrayList(this.e));
            return;
        }
        for (int i = 0; i < this.d.size(); i++) {
            this.e.add(null);
        }
        ArrayList arrayList2 = this.d;
        for (final int i2 = 0; i2 < arrayList2.size(); i2++) {
            final ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public final void run() {
                    CallbackToFutureAdapter.Completer completer;
                    ArrayList arrayList3;
                    int i3 = i2;
                    ListenableFuture listenableFuture2 = listenableFuture;
                    ListFuture listFuture = ListFuture.this;
                    boolean z2 = listFuture.f;
                    AtomicInteger atomicInteger = listFuture.g;
                    ArrayList arrayList4 = listFuture.e;
                    ListenableFuture listenableFuture3 = listFuture.h;
                    if (listenableFuture3.isDone() || arrayList4 == null) {
                        Preconditions.f("Future was done before all dependencies completed", z2);
                        return;
                    }
                    try {
                        try {
                            try {
                                try {
                                    Preconditions.f("Tried to set value from future which is not done", listenableFuture2.isDone());
                                    arrayList4.set(i3, Futures.d(listenableFuture2));
                                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                                    Preconditions.f("Less than 0 remaining futures", iDecrementAndGet >= 0);
                                    if (iDecrementAndGet == 0) {
                                        ArrayList arrayList5 = listFuture.e;
                                        if (arrayList5 != null) {
                                            listFuture.i.b(new ArrayList(arrayList5));
                                        } else {
                                            Preconditions.f(null, listenableFuture3.isDone());
                                        }
                                    }
                                } catch (RuntimeException e) {
                                    if (z2) {
                                        listFuture.i.d(e);
                                    }
                                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                    Preconditions.f("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                    if (iDecrementAndGet2 == 0) {
                                        ArrayList arrayList6 = listFuture.e;
                                        if (arrayList6 != null) {
                                            completer = listFuture.i;
                                            arrayList3 = new ArrayList(arrayList6);
                                            completer.b(arrayList3);
                                            return;
                                        }
                                        Preconditions.f(null, listenableFuture3.isDone());
                                    }
                                } catch (ExecutionException e2) {
                                    if (z2) {
                                        listFuture.i.d(e2.getCause());
                                    }
                                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                                    Preconditions.f("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                                    if (iDecrementAndGet3 == 0) {
                                        ArrayList arrayList7 = listFuture.e;
                                        if (arrayList7 != null) {
                                            completer = listFuture.i;
                                            arrayList3 = new ArrayList(arrayList7);
                                            completer.b(arrayList3);
                                            return;
                                        }
                                        Preconditions.f(null, listenableFuture3.isDone());
                                    }
                                }
                            } catch (Error e3) {
                                listFuture.i.d(e3);
                                int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                                Preconditions.f("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                                if (iDecrementAndGet4 == 0) {
                                    ArrayList arrayList8 = listFuture.e;
                                    if (arrayList8 != null) {
                                        completer = listFuture.i;
                                        arrayList3 = new ArrayList(arrayList8);
                                        completer.b(arrayList3);
                                        return;
                                    }
                                    Preconditions.f(null, listenableFuture3.isDone());
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z2) {
                                listFuture.cancel(false);
                            }
                            int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                            Preconditions.f("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                            if (iDecrementAndGet5 == 0) {
                                ArrayList arrayList9 = listFuture.e;
                                if (arrayList9 != null) {
                                    completer = listFuture.i;
                                    arrayList3 = new ArrayList(arrayList9);
                                    completer.b(arrayList3);
                                    return;
                                }
                                Preconditions.f(null, listenableFuture3.isDone());
                            }
                        }
                    } catch (Throwable th) {
                        int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                        Preconditions.f("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                        if (iDecrementAndGet6 == 0) {
                            ArrayList arrayList10 = listFuture.e;
                            if (arrayList10 != null) {
                                listFuture.i.b(new ArrayList(arrayList10));
                            } else {
                                Preconditions.f(null, listenableFuture3.isDone());
                            }
                        }
                        throw th;
                    }
                }
            }, executor);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.h.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z);
            }
        }
        return this.h.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.h.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList arrayList = this.d;
        ListenableFuture listenableFuture = this.h;
        if (arrayList != null && !listenableFuture.isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                ListenableFuture listenableFuture2 = (ListenableFuture) it.next();
                while (!listenableFuture2.isDone()) {
                    try {
                        listenableFuture2.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) listenableFuture.get();
    }
}
