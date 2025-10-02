package io.grpc;

import io.grpc.PersistentHashArrayMappedTrie;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

@CheckReturnValue
/* loaded from: classes7.dex */
public class Context {
    public static final Logger f = Logger.getLogger(Context.class.getName());
    public static final Context g = new Context();
    public final CancellableContext d = null;
    public final PersistentHashArrayMappedTrie.Node e = null;

    /* renamed from: io.grpc.Context$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.Context$1CurrentContextExecutor, reason: invalid class name */
    final class C1CurrentContextExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Context.d().getClass();
            throw null;
        }
    }

    /* renamed from: io.grpc.Context$1FixedContextExecutor, reason: invalid class name */
    final class C1FixedContextExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            throw null;
        }
    }

    /* renamed from: io.grpc.Context$2, reason: invalid class name */
    class AnonymousClass2 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public @interface CanIgnoreReturnValue {
    }

    public static final class CancellableContext extends Context implements Closeable {
        public ArrayList h;
        public CancellationListener i;
        public Throwable j;
        public ScheduledFuture k;
        public boolean l;

        /* renamed from: io.grpc.Context$CancellableContext$1CancelOnExpiration, reason: invalid class name */
        final class C1CancelOnExpiration implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new TimeoutException("context timed out");
                    throw null;
                } catch (Throwable th) {
                    Context.f.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th);
                }
            }
        }

        @Override // io.grpc.Context
        public final void a(CancellationListener cancellationListener, Executor executor) {
            i(new ExecutableListener(executor, cancellationListener, this));
        }

        @Override // io.grpc.Context
        public final Context b() {
            throw null;
        }

        @Override // io.grpc.Context
        public final Throwable c() {
            if (g()) {
                return this.j;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            j(null);
        }

        @Override // io.grpc.Context
        public final void e(Context context) {
            throw null;
        }

        @Override // io.grpc.Context
        public final Deadline f() {
            return null;
        }

        @Override // io.grpc.Context
        public final boolean g() {
            synchronized (this) {
                try {
                    if (this.l) {
                        return true;
                    }
                    if (!super.g()) {
                        return false;
                    }
                    j(super.c());
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.Context
        public final void h(CancellationListener cancellationListener) {
            k(cancellationListener, this);
        }

        public final void i(ExecutableListener executableListener) {
            synchronized (this) {
                try {
                    if (g()) {
                        executableListener.a();
                    } else {
                        ArrayList arrayList = this.h;
                        if (arrayList == null) {
                            ArrayList arrayList2 = new ArrayList();
                            this.h = arrayList2;
                            arrayList2.add(executableListener);
                            CancellableContext cancellableContext = this.d;
                            if (cancellableContext != null) {
                                CancellationListener cancellationListener = new CancellationListener() { // from class: io.grpc.Context.CancellableContext.1
                                    @Override // io.grpc.Context.CancellationListener
                                    public final void a(Context context) {
                                        CancellableContext.this.j(context.c());
                                    }
                                };
                                this.i = cancellationListener;
                                cancellableContext.i(new ExecutableListener(DirectExecutor.d, cancellationListener, this));
                            }
                        } else {
                            arrayList.add(executableListener);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void j(Throwable th) {
            boolean z;
            ScheduledFuture scheduledFuture;
            synchronized (this) {
                try {
                    if (this.l) {
                        z = false;
                        scheduledFuture = null;
                    } else {
                        z = true;
                        this.l = true;
                        scheduledFuture = this.k;
                        if (scheduledFuture != null) {
                            this.k = null;
                        } else {
                            scheduledFuture = null;
                        }
                        this.j = th;
                    }
                } finally {
                }
            }
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (z) {
                synchronized (this) {
                    try {
                        ArrayList arrayList = this.h;
                        if (arrayList == null) {
                            return;
                        }
                        CancellationListener cancellationListener = this.i;
                        this.i = null;
                        this.h = null;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ExecutableListener executableListener = (ExecutableListener) it.next();
                            if (executableListener.f == this) {
                                executableListener.a();
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ExecutableListener executableListener2 = (ExecutableListener) it2.next();
                            if (executableListener2.f != this) {
                                executableListener2.a();
                            }
                        }
                        CancellableContext cancellableContext = this.d;
                        if (cancellableContext != null) {
                            cancellableContext.k(cancellationListener, cancellableContext);
                        }
                    } finally {
                    }
                }
            }
        }

        public final void k(CancellationListener cancellationListener, Context context) {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.h;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            ExecutableListener executableListener = (ExecutableListener) this.h.get(size);
                            if (executableListener.e == cancellationListener && executableListener.f == context) {
                                this.h.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.h.isEmpty()) {
                            CancellableContext cancellableContext = this.d;
                            if (cancellableContext != null) {
                                cancellableContext.h(this.i);
                            }
                            this.i = null;
                            this.h = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface CancellationListener {
        void a(Context context);
    }

    public @interface CheckReturnValue {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DirectExecutor implements Executor {
        public static final DirectExecutor d;
        public static final /* synthetic */ DirectExecutor[] e;

        static {
            DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
            d = directExecutor;
            e = new DirectExecutor[]{directExecutor};
        }

        public static DirectExecutor valueOf(String str) {
            return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
        }

        public static DirectExecutor[] values() {
            return (DirectExecutor[]) e.clone();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Context.DirectExecutor";
        }
    }

    public static final class ExecutableListener implements Runnable {
        public final Enum d;
        public final CancellationListener e;
        public final Context f;

        /* JADX WARN: Multi-variable type inference failed */
        public ExecutableListener(Executor executor, CancellationListener cancellationListener, Context context) {
            this.d = (Enum) executor;
            this.e = cancellationListener;
            this.f = context;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, java.util.concurrent.Executor] */
        public final void a() {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                Context.f.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.e.a(this.f);
        }
    }

    public static final class Key<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f23932a;

        public Key() {
            Logger logger = Context.f;
            this.f23932a = "io.grpc.Server";
        }

        public final String toString() {
            return this.f23932a;
        }
    }

    public static final class LazyStorage {

        /* renamed from: a, reason: collision with root package name */
        public static final Storage f23933a;

        static {
            Storage threadLocalContextStorage;
            AtomicReference atomicReference = new AtomicReference();
            try {
                threadLocalContextStorage = (Storage) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(Storage.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                threadLocalContextStorage = new ThreadLocalContextStorage();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
            f23933a = threadLocalContextStorage;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                Context.f.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    public static abstract class Storage {
        public abstract Context a();

        public abstract void b(Context context, Context context2);

        public abstract Context c(Context context);
    }

    public static Context d() {
        Context contextA = LazyStorage.f23933a.a();
        return contextA == null ? g : contextA;
    }

    public void a(CancellationListener cancellationListener, Executor executor) {
        CancellableContext cancellableContext = this.d;
        if (cancellableContext == null) {
            return;
        }
        cancellableContext.i(new ExecutableListener(executor, cancellationListener, this));
    }

    public Context b() {
        Context contextC = LazyStorage.f23933a.c(this);
        return contextC == null ? g : contextC;
    }

    public Throwable c() {
        CancellableContext cancellableContext = this.d;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.c();
    }

    public void e(Context context) {
        if (context == null) {
            throw new NullPointerException("toAttach");
        }
        LazyStorage.f23933a.b(this, context);
    }

    public Deadline f() {
        return null;
    }

    public boolean g() {
        CancellableContext cancellableContext = this.d;
        if (cancellableContext == null) {
            return false;
        }
        return cancellableContext.g();
    }

    public void h(CancellationListener cancellationListener) {
        CancellableContext cancellableContext = this.d;
        if (cancellableContext == null) {
            return;
        }
        cancellableContext.k(cancellationListener, this);
    }
}
