package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class ActiveResources {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f13793a;
    public final HashMap b;
    public final ReferenceQueue c;
    public Engine d;

    /* renamed from: com.bumptech.glide.load.engine.ActiveResources$1, reason: invalid class name */
    class AnonymousClass1 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.1.1
                @Override // java.lang.Runnable
                public final void run() throws SecurityException, IllegalArgumentException {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }, "glide-active-resources");
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public interface DequeuedResourceCallback {
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class ResourceWeakReference extends WeakReference<EngineResource<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final Key f13794a;
        public final boolean b;
        public Resource c;

        public ResourceWeakReference(Key key, EngineResource engineResource, ReferenceQueue referenceQueue) {
            super(engineResource, referenceQueue);
            Preconditions.c(key, "Argument must not be null");
            this.f13794a = key;
            boolean z = engineResource.d;
            this.c = null;
            this.b = z;
        }

        public final void a() {
            this.c = null;
            clear();
        }
    }

    public ActiveResources() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new AnonymousClass1());
        this.b = new HashMap();
        this.c = new ReferenceQueue();
        this.f13793a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.2
            @Override // java.lang.Runnable
            public final void run() {
                ActiveResources activeResources = ActiveResources.this;
                activeResources.getClass();
                while (true) {
                    try {
                        activeResources.b((ResourceWeakReference) activeResources.c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    public final synchronized void a(Key key, EngineResource engineResource) {
        ResourceWeakReference resourceWeakReference = (ResourceWeakReference) this.b.put(key, new ResourceWeakReference(key, engineResource, this.c));
        if (resourceWeakReference != null) {
            resourceWeakReference.a();
        }
    }

    public final void b(ResourceWeakReference resourceWeakReference) {
        Resource resource;
        synchronized (this) {
            this.b.remove(resourceWeakReference.f13794a);
            if (resourceWeakReference.b && (resource = resourceWeakReference.c) != null) {
                this.d.c(resourceWeakReference.f13794a, new EngineResource(resource, true, false, resourceWeakReference.f13794a, this.d));
            }
        }
    }
}
