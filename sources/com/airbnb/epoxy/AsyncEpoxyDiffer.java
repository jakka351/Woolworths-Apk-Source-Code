package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
class AsyncEpoxyDiffer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13304a;
    public final EpoxyControllerAdapter b;
    public final DiffUtil.ItemCallback c;
    public final GenerationTracker d;
    public volatile List e;
    public volatile List f;

    /* renamed from: com.airbnb.epoxy.AsyncEpoxyDiffer$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        public final /* synthetic */ List d;
        public final /* synthetic */ int e;
        public final /* synthetic */ DiffResult f;

        public AnonymousClass2(List list, int i, DiffResult diffResult) {
            this.d = list;
            this.e = i;
            this.f = diffResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List list = this.d;
            int i = this.e;
            AsyncEpoxyDiffer asyncEpoxyDiffer = AsyncEpoxyDiffer.this;
            boolean zB = asyncEpoxyDiffer.b(i, list);
            DiffResult diffResult = this.f;
            if (diffResult != null) {
                List list2 = diffResult.b;
                if (zB) {
                    EpoxyControllerAdapter epoxyControllerAdapter = asyncEpoxyDiffer.b;
                    ArrayList arrayList = epoxyControllerAdapter.p;
                    epoxyControllerAdapter.o = list2.size();
                    NotifyBlocker notifyBlocker = epoxyControllerAdapter.l;
                    notifyBlocker.f13324a = true;
                    AdapterListUpdateCallback adapterListUpdateCallback = new AdapterListUpdateCallback(epoxyControllerAdapter);
                    List list3 = diffResult.f13312a;
                    DiffUtil.DiffResult diffResult2 = diffResult.c;
                    if (diffResult2 != null) {
                        diffResult2.b(adapterListUpdateCallback);
                    } else if (list2.isEmpty() && !list3.isEmpty()) {
                        adapterListUpdateCallback.b(0, list3.size());
                    } else if (!list2.isEmpty() && list3.isEmpty()) {
                        adapterListUpdateCallback.d(0, list2.size());
                    }
                    notifyBlocker.f13324a = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((OnModelBuildFinishedListener) arrayList.get(size)).a(diffResult);
                    }
                }
            }
        }
    }

    public static class DiffCallback extends DiffUtil.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final List f13305a;
        public final List b;
        public final DiffUtil.ItemCallback c;

        public DiffCallback(List list, List list2, DiffUtil.ItemCallback itemCallback) {
            this.f13305a = list;
            this.b = list2;
            this.c = itemCallback;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean a(int i, int i2) {
            return this.c.a((EpoxyModel) this.f13305a.get(i), (EpoxyModel) this.b.get(i2));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean b(int i, int i2) {
            return this.c.b((EpoxyModel) this.f13305a.get(i), (EpoxyModel) this.b.get(i2));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final Object c(int i, int i2) {
            return this.c.c((EpoxyModel) this.f13305a.get(i), (EpoxyModel) this.b.get(i2));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: d */
        public final int getE() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        /* renamed from: e */
        public final int getD() {
            return this.f13305a.size();
        }
    }

    public static class GenerationTracker {

        /* renamed from: a, reason: collision with root package name */
        public volatile int f13306a;
        public volatile int b;
    }

    public interface ResultCallback {
    }

    public AsyncEpoxyDiffer(Handler handler, EpoxyControllerAdapter epoxyControllerAdapter) {
        DiffUtil.ItemCallback itemCallback = EpoxyControllerAdapter.q;
        this.d = new GenerationTracker();
        this.f = Collections.EMPTY_LIST;
        this.f13304a = new HandlerExecutor(handler);
        this.b = epoxyControllerAdapter;
        this.c = itemCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(java.util.ArrayList r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.airbnb.epoxy.AsyncEpoxyDiffer$GenerationTracker r0 = r4.d     // Catch: java.lang.Throwable -> L23
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L23
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L28
            int r1 = r0.f13306a     // Catch: java.lang.Throwable -> L2a
            int r2 = r0.b     // Catch: java.lang.Throwable -> L2a
            r3 = 1
            if (r1 <= r2) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = 0
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            int r2 = r0.f13306a     // Catch: java.lang.Throwable -> L28
            r0.b = r2     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            com.airbnb.epoxy.AsyncEpoxyDiffer$GenerationTracker r0 = r4.d     // Catch: java.lang.Throwable -> L23
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L23
            int r2 = r0.f13306a     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + r3
            r0.f13306a = r2     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            r4.b(r2, r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return r1
        L23:
            r5 = move-exception
            goto L2f
        L25:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L23
        L28:
            r5 = move-exception
            goto L2d
        L2a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L28
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L23
        L2f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.AsyncEpoxyDiffer.a(java.util.ArrayList):boolean");
    }

    public final synchronized boolean b(int i, List list) {
        boolean z;
        try {
            GenerationTracker generationTracker = this.d;
            synchronized (generationTracker) {
                try {
                    z = generationTracker.f13306a == i && i > generationTracker.b;
                    if (z) {
                        generationTracker.b = i;
                    }
                } finally {
                }
            }
            if (!z) {
                return false;
            }
            this.e = list;
            if (list == null) {
                this.f = Collections.EMPTY_LIST;
            } else {
                this.f = Collections.unmodifiableList(list);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
