package androidx.camera.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressLint
@RestrictTo
@VisibleForTesting
/* loaded from: classes2.dex */
public final class LifecycleCamera implements LifecycleObserver, Camera {
    public final LifecycleOwner e;
    public final CameraUseCaseAdapter f;
    public final Object d = new Object();
    public boolean g = false;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.e = lifecycleOwner;
        this.f = cameraUseCaseAdapter;
        if (lifecycleOwner.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
            cameraUseCaseAdapter.j();
        } else {
            cameraUseCaseAdapter.u();
        }
        lifecycleOwner.getD().a(this);
    }

    @Override // androidx.camera.core.Camera
    public final CameraControl a() {
        return this.f.t;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo b() {
        return this.f.u;
    }

    public final LifecycleOwner c() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.d) {
            lifecycleOwner = this.e;
        }
        return lifecycleOwner;
    }

    public final List j() {
        List listUnmodifiableList;
        synchronized (this.d) {
            listUnmodifiableList = Collections.unmodifiableList(this.f.z());
        }
        return listUnmodifiableList;
    }

    public final boolean n(UseCase useCase) {
        boolean zContains;
        synchronized (this.d) {
            zContains = ((ArrayList) this.f.z()).contains(useCase);
        }
        return zContains;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.d) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f;
            cameraUseCaseAdapter.E((ArrayList) cameraUseCaseAdapter.z());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        this.f.d.m(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        this.f.d.m(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.d) {
            try {
                if (!this.g) {
                    this.f.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.d) {
            try {
                if (!this.g) {
                    this.f.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        synchronized (this.d) {
            try {
                if (this.g) {
                    return;
                }
                onStop(this.e);
                this.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.d) {
            try {
                if (this.g) {
                    this.g = false;
                    if (this.e.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
                        onStart(this.e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
