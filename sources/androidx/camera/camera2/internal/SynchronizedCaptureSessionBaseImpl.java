package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
class SynchronizedCaptureSessionBaseImpl extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, SynchronizedCaptureSession.Opener {
    public final CaptureSessionRepository b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public SynchronizedCaptureSession.StateCallback e;
    public CameraCaptureSessionCompat f;
    public ListenableFuture g;
    public CallbackToFutureAdapter.Completer h;
    public FutureChain i;

    /* renamed from: a, reason: collision with root package name */
    public final Object f284a = new Object();
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    @RequiresApi
    public static class Api23Impl {
    }

    public SynchronizedCaptureSessionBaseImpl(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = captureSessionRepository;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void a() throws CameraAccessException {
        Preconditions.e(this.f, "Need to call openCaptureSession before using this API.");
        this.f.c().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void b(int i) {
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final CameraDevice c() {
        this.f.getClass();
        return this.f.c().getDevice();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        Preconditions.e(this.f, "Need to call openCaptureSession before using this API.");
        CaptureSessionRepository captureSessionRepository = this.b;
        synchronized (captureSessionRepository.b) {
            captureSessionRepository.d.add(this);
        }
        this.f.c().close();
        this.c.execute(new m(this, 7));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final CameraCaptureSessionCompat d() {
        this.f.getClass();
        return this.f;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final SynchronizedCaptureSession.StateCallback e() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public ListenableFuture f() {
        return Futures.g(null);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void g() {
        u();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int h(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.e(this.f, "Need to call openCaptureSession before using this API.");
        return this.f.a(arrayList, this.c, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.e(this.f, "Need to call openCaptureSession before using this API.");
        return this.f.b(captureRequest, this.c, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void j(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.e);
        this.e.j(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void k(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.e);
        this.e.k(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void l(SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture listenableFuture;
        synchronized (this.f284a) {
            try {
                if (this.k) {
                    listenableFuture = null;
                } else {
                    this.k = true;
                    Preconditions.e(this.g, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        if (listenableFuture != null) {
            listenableFuture.addListener(new m0(this, synchronizedCaptureSession, 0), CameraXExecutors.a());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void m(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Objects.requireNonNull(this.e);
        g();
        CaptureSessionRepository captureSessionRepository = this.b;
        Iterator it = captureSessionRepository.b().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != this) {
            synchronizedCaptureSession2.g();
        }
        synchronized (captureSessionRepository.b) {
            captureSessionRepository.e.remove(this);
        }
        this.e.m(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void n(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        Objects.requireNonNull(this.e);
        CaptureSessionRepository captureSessionRepository = this.b;
        synchronized (captureSessionRepository.b) {
            captureSessionRepository.c.add(this);
            captureSessionRepository.e.remove(this);
        }
        Iterator it = captureSessionRepository.b().iterator();
        while (it.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it.next()) != this) {
            synchronizedCaptureSession2.g();
        }
        this.e.n(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void o(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.e);
        this.e.o(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void p(SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture listenableFuture;
        synchronized (this.f284a) {
            try {
                if (this.m) {
                    listenableFuture = null;
                } else {
                    this.m = true;
                    Preconditions.e(this.g, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.addListener(new m0(this, synchronizedCaptureSession, 1), CameraXExecutors.a());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.q(synchronizedCaptureSession, surface);
    }

    public final void r(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            this.f = new CameraCaptureSessionCompat(cameraCaptureSession);
        }
    }

    public final boolean s() {
        boolean z;
        synchronized (this.f284a) {
            z = this.g != null;
        }
        return z;
    }

    public ListenableFuture t(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) throws Throwable {
        synchronized (this.f284a) {
            try {
                if (this.l) {
                    try {
                        return Futures.e(new CancellationException("Opener is disabled"));
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        throw th2;
                    }
                }
                CaptureSessionRepository captureSessionRepository = this.b;
                synchronized (captureSessionRepository.b) {
                    try {
                        try {
                            captureSessionRepository.e.add(this);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th2;
                        }
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th4 = th;
                            try {
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                }
                ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new k0(this, list, new CameraDeviceCompat(cameraDevice), sessionConfigurationCompat, 1));
                this.g = listenableFutureA;
                Futures.a(listenableFutureA, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onFailure(Throwable th6) {
                        SynchronizedCaptureSession synchronizedCaptureSession;
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                        synchronizedCaptureSessionBaseImpl.g();
                        CaptureSessionRepository captureSessionRepository2 = synchronizedCaptureSessionBaseImpl.b;
                        Iterator it = captureSessionRepository2.b().iterator();
                        while (it.hasNext() && (synchronizedCaptureSession = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSessionBaseImpl) {
                            synchronizedCaptureSession.g();
                        }
                        synchronized (captureSessionRepository2.b) {
                            captureSessionRepository2.e.remove(synchronizedCaptureSessionBaseImpl);
                        }
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    }
                }, CameraXExecutors.a());
                return Futures.h(this.g);
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public final void u() {
        synchronized (this.f284a) {
            try {
                List list = this.j;
                if (list != null) {
                    DeferrableSurfaces.a(list);
                    this.j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ListenableFuture v(ArrayList arrayList) {
        synchronized (this.f284a) {
            try {
                if (this.l) {
                    return Futures.e(new CancellationException("Opener is disabled"));
                }
                FutureChain futureChain = (FutureChain) Futures.m(FutureChain.a(DeferrableSurfaces.c(arrayList, this.c, this.d)), new l(4, this, arrayList), this.c);
                this.i = futureChain;
                return Futures.h(futureChain);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean w() {
        boolean z;
        try {
            synchronized (this.f284a) {
                try {
                    if (!this.l) {
                        FutureChain futureChain = this.i;
                        futureChain = futureChain != null ? futureChain : null;
                        this.l = true;
                    }
                    z = !s();
                } finally {
                }
            }
            return z;
        } finally {
            if (futureChain != null) {
                futureChain.cancel(true);
            }
        }
    }
}
