package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class AsyncListDiffer<T> {
    public static final Executor h = new MainThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    public final ListUpdateCallback f3651a;
    public final AsyncDifferConfig b;
    public final Executor c;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;

    public interface ListListener<T> {
        void a();
    }

    public static class MainThreadExecutor implements Executor {
        public final Handler d = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.d.post(runnable);
        }
    }

    public AsyncListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig asyncDifferConfig) {
        this.f3651a = listUpdateCallback;
        this.b = asyncDifferConfig;
        Executor executor = asyncDifferConfig.f3649a;
        if (executor != null) {
            this.c = executor;
        } else {
            this.c = h;
        }
    }

    public final void a(List list) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ListListener) it.next()).a();
        }
    }

    public final void b(final List list) {
        final int i = this.g + 1;
        this.g = i;
        final List list2 = this.e;
        if (list == list2) {
            return;
        }
        List list3 = this.f;
        if (list2 != null) {
            this.b.b.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1
                @Override // java.lang.Runnable
                public final void run() {
                    final DiffUtil.DiffResult diffResultA = DiffUtil.a(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final boolean a(int i2, int i3) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj != null && obj2 != null) {
                                return AsyncListDiffer.this.b.c.a(obj, obj2);
                            }
                            if (obj == null && obj2 == null) {
                                return true;
                            }
                            throw new AssertionError();
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final boolean b(int i2, int i3) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            return (obj == null || obj2 == null) ? obj == null && obj2 == null : AsyncListDiffer.this.b.c.b(obj, obj2);
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final Object c(int i2, int i3) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj == null || obj2 == null) {
                                throw new AssertionError();
                            }
                            return AsyncListDiffer.this.b.c.c(obj, obj2);
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final int d() {
                            return list.size();
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final int e() {
                            return list2.size();
                        }
                    }, true);
                    AsyncListDiffer.this.c.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                            if (asyncListDiffer.g == i) {
                                List list4 = list;
                                List list5 = asyncListDiffer.f;
                                asyncListDiffer.e = list4;
                                asyncListDiffer.f = Collections.unmodifiableList(list4);
                                diffResultA.b(asyncListDiffer.f3651a);
                                asyncListDiffer.a(list5);
                            }
                        }
                    });
                }
            });
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        this.f3651a.d(0, list.size());
        a(list3);
    }
}
