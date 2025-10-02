package androidx.recyclerview.widget;

import androidx.recyclerview.widget.DiffUtil;
import com.airbnb.epoxy.paging3.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class AsyncDifferConfig<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3649a;
    public final Executor b;
    public final DiffUtil.ItemCallback c;

    public static final class Builder<T> {
        public static final Object d = new Object();
        public static ExecutorService e;

        /* renamed from: a, reason: collision with root package name */
        public a f3650a;
        public Executor b;
        public final DiffUtil.ItemCallback c;

        public Builder(DiffUtil.ItemCallback itemCallback) {
            this.c = itemCallback;
        }

        public final AsyncDifferConfig a() {
            if (this.b == null) {
                synchronized (d) {
                    try {
                        if (e == null) {
                            e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b = e;
            }
            return new AsyncDifferConfig(this.f3650a, this.b, this.c);
        }
    }

    public AsyncDifferConfig(a aVar, Executor executor, DiffUtil.ItemCallback itemCallback) {
        this.f3649a = aVar;
        this.b = executor;
        this.c = itemCallback;
    }
}
