package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public final class SharedResourceHolder {
    public static final SharedResourceHolder d = new SharedResourceHolder(new AnonymousClass1());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f24104a = new IdentityHashMap();
    public final AnonymousClass1 b;
    public ScheduledExecutorService c;

    /* renamed from: io.grpc.internal.SharedResourceHolder$1, reason: invalid class name */
    public class AnonymousClass1 implements ScheduledExecutorFactory {
    }

    public static class Instance {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24105a;
        public int b;
        public ScheduledFuture c;

        public Instance(Object obj) {
            this.f24105a = obj;
        }
    }

    public interface Resource<T> {
        void b(Object obj);

        Object create();
    }

    public interface ScheduledExecutorFactory {
    }

    public SharedResourceHolder(AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static Object a(Resource resource) {
        Object obj;
        SharedResourceHolder sharedResourceHolder = d;
        synchronized (sharedResourceHolder) {
            try {
                Instance instance = (Instance) sharedResourceHolder.f24104a.get(resource);
                if (instance == null) {
                    instance = new Instance(resource.create());
                    sharedResourceHolder.f24104a.put(resource, instance);
                }
                ScheduledFuture scheduledFuture = instance.c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    instance.c = null;
                }
                instance.b++;
                obj = instance.f24105a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(final Resource resource, final Object obj) {
        SharedResourceHolder sharedResourceHolder = d;
        synchronized (sharedResourceHolder) {
            try {
                final Instance instance = (Instance) sharedResourceHolder.f24104a.get(resource);
                if (instance == null) {
                    throw new IllegalArgumentException("No cached instance found for " + resource);
                }
                Preconditions.f("Releasing the wrong instance", obj == instance.f24105a);
                Preconditions.q("Refcount has already reached zero", instance.b > 0);
                int i = instance.b - 1;
                instance.b = i;
                if (i == 0) {
                    Preconditions.q("Destroy task already scheduled", instance.c == null);
                    if (sharedResourceHolder.c == null) {
                        sharedResourceHolder.b.getClass();
                        sharedResourceHolder.c = Executors.newSingleThreadScheduledExecutor(GrpcUtil.e("grpc-shared-destroyer-%d"));
                    }
                    instance.c = sharedResourceHolder.c.schedule(new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.SharedResourceHolder.2
                        /* JADX WARN: Finally extract failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            synchronized (SharedResourceHolder.this) {
                                try {
                                    if (instance.b == 0) {
                                        try {
                                            resource.b(obj);
                                            SharedResourceHolder.this.f24104a.remove(resource);
                                            if (SharedResourceHolder.this.f24104a.isEmpty()) {
                                                SharedResourceHolder.this.c.shutdown();
                                                SharedResourceHolder.this.c = null;
                                            }
                                        } catch (Throwable th) {
                                            SharedResourceHolder.this.f24104a.remove(resource);
                                            if (SharedResourceHolder.this.f24104a.isEmpty()) {
                                                SharedResourceHolder.this.c.shutdown();
                                                SharedResourceHolder.this.c = null;
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
