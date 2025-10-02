package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.SessionResetPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    public final ScheduledExecutorService n;
    public final Object o;
    public ArrayList p;
    public ListenableFuture q;
    public final ForceCloseDeferrableSurface r;
    public final ForceCloseCaptureSession s;
    public final RequestMonitor t;
    public final SessionResetPolicy u;
    public final AtomicBoolean v;

    public SynchronizedCaptureSessionImpl(Handler handler, CaptureSessionRepository captureSessionRepository, Quirks quirks, Quirks quirks2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.o = new Object();
        this.v = new AtomicBoolean(false);
        this.r = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.t = new RequestMonitor(quirks.a(CaptureSessionStuckQuirk.class) || quirks.a(IncorrectCaptureStateQuirk.class));
        this.s = new ForceCloseCaptureSession(quirks2);
        this.u = new SessionResetPolicy(quirks2);
        this.n = scheduledExecutorService;
    }

    public static ListenableFuture x(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        if (synchronizedCaptureSessionImpl.u.f363a) {
            Iterator it = synchronizedCaptureSessionImpl.b.a().iterator();
            while (it.hasNext()) {
                ((SynchronizedCaptureSession) it.next()).close();
            }
        }
        synchronizedCaptureSessionImpl.z("start openCaptureSession");
        return super.t(cameraDevice, sessionConfigurationCompat, list);
    }

    public static /* synthetic */ void y(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        synchronizedCaptureSessionImpl.z("Session call super.close()");
        super.close();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void b(int i) {
        if (i == 5) {
            synchronized (this.o) {
                try {
                    if (s() && this.p != null) {
                        z("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.p.iterator();
                        while (it.hasNext()) {
                            ((DeferrableSurface) it.next()).a();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void close() throws CameraAccessException {
        if (!this.v.compareAndSet(false, true)) {
            z("close() has been called. Skip this invocation.");
            return;
        }
        if (this.u.f363a) {
            try {
                z("Call abortCaptures() before closing session.");
                Preconditions.e(this.f, "Need to call openCaptureSession before using this API.");
                this.f.c().abortCaptures();
            } catch (Exception e) {
                z(android.support.v4.media.session.a.n(e, "Exception when calling abortCaptures()"));
            }
        }
        z("Session call close()");
        this.t.b().addListener(new m(this, 8), this.c);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final ListenableFuture f() {
        return CallbackToFutureAdapter.a(new androidx.camera.core.impl.utils.futures.b(this.t.b(), this.n, 1500L, 0));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void g() {
        u();
        this.t.c();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int h(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.h(arrayList, this.t.a(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.i(captureRequest, this.t.a(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void l(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.o) {
            this.r.a(this.p);
        }
        z("onClosed()");
        super.l(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void n(SynchronizedCaptureSession synchronizedCaptureSession) {
        ArrayList arrayList;
        SynchronizedCaptureSession synchronizedCaptureSession2;
        SynchronizedCaptureSession synchronizedCaptureSession3;
        z("Session onConfigured()");
        ForceCloseCaptureSession forceCloseCaptureSession = this.s;
        CaptureSessionRepository captureSessionRepository = this.b;
        synchronized (captureSessionRepository.b) {
            arrayList = new ArrayList(captureSessionRepository.e);
        }
        ArrayList arrayListA = captureSessionRepository.a();
        if (forceCloseCaptureSession.f353a != null) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (synchronizedCaptureSession3 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(synchronizedCaptureSession3);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession4 : linkedHashSet) {
                synchronizedCaptureSession4.e().m(synchronizedCaptureSession4);
            }
        }
        super.n(synchronizedCaptureSession);
        if (forceCloseCaptureSession.f353a != null) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayListA.iterator();
            while (it2.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it2.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(synchronizedCaptureSession2);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession5 : linkedHashSet2) {
                synchronizedCaptureSession5.e().l(synchronizedCaptureSession5);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl
    public final ListenableFuture t(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        ListenableFuture listenableFutureH;
        synchronized (this.o) {
            try {
                ArrayList arrayListA = this.b.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SynchronizedCaptureSession) it.next()).f());
                }
                ListenableFuture listenableFutureK = Futures.k(arrayList);
                this.q = listenableFutureK;
                listenableFutureH = Futures.h((FutureChain) Futures.m(FutureChain.a(listenableFutureK), new k0(this, cameraDevice, sessionConfigurationCompat, list), this.c));
            } catch (Throwable th) {
                throw th;
            }
        }
        return listenableFutureH;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl
    public final ListenableFuture v(ArrayList arrayList) {
        ListenableFuture listenableFutureV;
        synchronized (this.o) {
            this.p = arrayList;
            listenableFutureV = super.v(arrayList);
        }
        return listenableFutureV;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl
    public final boolean w() {
        boolean zW;
        synchronized (this.o) {
            try {
                if (s()) {
                    this.r.a(this.p);
                } else {
                    ListenableFuture listenableFuture = this.q;
                    if (listenableFuture != null) {
                        listenableFuture.cancel(true);
                    }
                }
                zW = super.w();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zW;
    }

    public final void z(String str) {
        Logger.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }
}
