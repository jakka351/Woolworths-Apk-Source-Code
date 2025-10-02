package androidx.camera.lifecycle;

import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.auto.value.AutoValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
final class LifecycleCameraRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Object f573a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public CameraCoordinator e;

    @AutoValue
    public static abstract class Key {
        public abstract CameraUseCaseAdapter.CameraId a();

        public abstract LifecycleOwner b();
    }

    public static class LifecycleCameraRepositoryObserver implements LifecycleObserver {
        public final LifecycleCameraRepository d;
        public final LifecycleOwner e;

        public LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.e = lifecycleOwner;
            this.d = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            LifecycleCameraRepository lifecycleCameraRepository = this.d;
            synchronized (lifecycleCameraRepository.f573a) {
                try {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverC = lifecycleCameraRepository.c(lifecycleOwner);
                    if (lifecycleCameraRepositoryObserverC == null) {
                        return;
                    }
                    lifecycleCameraRepository.h(lifecycleOwner);
                    Iterator it = ((Set) lifecycleCameraRepository.c.get(lifecycleCameraRepositoryObserverC)).iterator();
                    while (it.hasNext()) {
                        lifecycleCameraRepository.b.remove((Key) it.next());
                    }
                    lifecycleCameraRepository.c.remove(lifecycleCameraRepositoryObserverC);
                    lifecycleCameraRepositoryObserverC.e.getD().c(lifecycleCameraRepositoryObserverC);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.d.g(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.d.h(lifecycleOwner);
        }
    }

    public final void a(LifecycleCamera lifecycleCamera, ViewPort viewPort, List list, Collection collection, CameraCoordinator cameraCoordinator) {
        synchronized (this.f573a) {
            try {
                boolean z = true;
                Preconditions.b(!collection.isEmpty());
                this.e = cameraCoordinator;
                LifecycleOwner lifecycleOwnerC = lifecycleCamera.c();
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverC = c(lifecycleOwnerC);
                if (lifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                Set set = (Set) this.c.get(lifecycleCameraRepositoryObserverC);
                CameraCoordinator cameraCoordinator2 = this.e;
                if (cameraCoordinator2 == null || cameraCoordinator2.b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.b.get((Key) it.next());
                        lifecycleCamera2.getClass();
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.j().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f;
                    synchronized (cameraUseCaseAdapter.o) {
                        cameraUseCaseAdapter.l = viewPort;
                    }
                    CameraUseCaseAdapter cameraUseCaseAdapter2 = lifecycleCamera.f;
                    synchronized (cameraUseCaseAdapter2.o) {
                        cameraUseCaseAdapter2.m = list;
                    }
                    synchronized (lifecycleCamera.d) {
                        lifecycleCamera.f.c(collection);
                    }
                    if (lifecycleOwnerC.getD().getD().compareTo(Lifecycle.State.g) < 0) {
                        z = false;
                    }
                    if (z) {
                        g(lifecycleOwnerC);
                    }
                } catch (CameraUseCaseAdapter.CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } finally {
            }
        }
    }

    public final LifecycleCamera b(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.f573a) {
            try {
                Preconditions.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraUseCaseAdapter.h)) == null);
                LifecycleCamera lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
                if (((ArrayList) cameraUseCaseAdapter.z()).isEmpty()) {
                    lifecycleCamera.q();
                }
                if (lifecycleOwner.getD().getD() == Lifecycle.State.d) {
                    return lifecycleCamera;
                }
                f(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCameraRepositoryObserver c(LifecycleOwner lifecycleOwner) {
        synchronized (this.f573a) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.c.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.e)) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection d() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f573a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean e(LifecycleOwner lifecycleOwner) {
        synchronized (this.f573a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverC = c(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(lifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((Key) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.j().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(LifecycleCamera lifecycleCamera) {
        synchronized (this.f573a) {
            try {
                LifecycleOwner lifecycleOwnerC = lifecycleCamera.c();
                CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f;
                AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key = new AutoValue_LifecycleCameraRepository_Key(lifecycleOwnerC, CameraUseCaseAdapter.v(cameraUseCaseAdapter.u, cameraUseCaseAdapter.v));
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverC = c(lifecycleOwnerC);
                Set hashSet = lifecycleCameraRepositoryObserverC != null ? (Set) this.c.get(lifecycleCameraRepositoryObserverC) : new HashSet();
                hashSet.add(autoValue_LifecycleCameraRepository_Key);
                this.b.put(autoValue_LifecycleCameraRepository_Key, lifecycleCamera);
                if (lifecycleCameraRepositoryObserverC == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(lifecycleOwnerC, this);
                    this.c.put(lifecycleCameraRepositoryObserver, hashSet);
                    lifecycleOwnerC.getD().a(lifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(LifecycleOwner lifecycleOwner) {
        synchronized (this.f573a) {
            try {
                if (e(lifecycleOwner)) {
                    if (this.d.isEmpty()) {
                        this.d.push(lifecycleOwner);
                    } else {
                        CameraCoordinator cameraCoordinator = this.e;
                        if (cameraCoordinator == null || cameraCoordinator.b() != 2) {
                            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.d.peek();
                            if (!lifecycleOwner.equals(lifecycleOwner2)) {
                                i(lifecycleOwner2);
                                this.d.remove(lifecycleOwner);
                                this.d.push(lifecycleOwner);
                            }
                        }
                    }
                    l(lifecycleOwner);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f573a) {
            try {
                this.d.remove(lifecycleOwner);
                i(lifecycleOwner);
                if (!this.d.isEmpty()) {
                    l((LifecycleOwner) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f573a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverC = c(lifecycleOwner);
                if (lifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(lifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((Key) it.next());
                    lifecycleCamera.getClass();
                    lifecycleCamera.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Collection collection) {
        synchronized (this.f573a) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((Key) it.next());
                boolean zIsEmpty = lifecycleCamera.j().isEmpty();
                synchronized (lifecycleCamera.d) {
                    ArrayList arrayList = new ArrayList(collection);
                    arrayList.retainAll(lifecycleCamera.f.z());
                    lifecycleCamera.f.E(arrayList);
                }
                if (!zIsEmpty && lifecycleCamera.j().isEmpty()) {
                    h(lifecycleCamera.c());
                }
            }
        }
    }

    public final void k() {
        synchronized (this.f573a) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((Key) it.next());
                synchronized (lifecycleCamera.d) {
                    CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f;
                    cameraUseCaseAdapter.E((ArrayList) cameraUseCaseAdapter.z());
                }
                h(lifecycleCamera.c());
            }
        }
    }

    public final void l(LifecycleOwner lifecycleOwner) {
        synchronized (this.f573a) {
            try {
                Iterator it = ((Set) this.c.get(c(lifecycleOwner))).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.b.get((Key) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.j().isEmpty()) {
                        lifecycleCamera.s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
