package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements AsyncFunction, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k0(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.d = 2;
        this.e = synchronizedCaptureSessionImpl;
        this.g = cameraDevice;
        this.f = sessionConfigurationCompat;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        OutputSurface outputSurfaceA;
        DeferrableSurface deferrableSurfaceF;
        int i;
        switch (this.d) {
            case 0:
                final ProcessingCaptureSession processingCaptureSession = (ProcessingCaptureSession) this.e;
                SessionConfig sessionConfig = (SessionConfig) this.f;
                CameraDevice cameraDevice = (CameraDevice) this.g;
                SynchronizedCaptureSession.Opener opener = (SynchronizedCaptureSession.Opener) this.h;
                List list = (List) obj;
                Executor executor = processingCaptureSession.b;
                StringBuilder sb = new StringBuilder("-- getSurfaces done, start init (id=");
                int i2 = processingCaptureSession.m;
                sb.append(i2);
                sb.append(")");
                Logger.a("ProcessingCaptureSession", sb.toString());
                if (processingCaptureSession.i == ProcessingCaptureSession.ProcessorState.h) {
                    return Futures.e(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                if (list.contains(null)) {
                    return Futures.e(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) sessionConfig.b().get(list.indexOf(null))));
                }
                OutputSurface outputSurfaceA2 = null;
                OutputSurface outputSurfaceA3 = null;
                OutputSurface outputSurfaceA4 = null;
                int i3 = 0;
                while (i3 < sessionConfig.b().size()) {
                    DeferrableSurface deferrableSurface = (DeferrableSurface) sessionConfig.b().get(i3);
                    boolean zEquals = Objects.equals(deferrableSurface.j, Preview.class);
                    int i4 = deferrableSurface.i;
                    Size size = deferrableSurface.h;
                    if (zEquals) {
                        i = i3;
                    } else {
                        i = i3;
                        if (!Objects.equals(deferrableSurface.j, StreamSharing.class)) {
                            if (Objects.equals(deferrableSurface.j, ImageCapture.class)) {
                                outputSurfaceA3 = OutputSurface.a((Surface) deferrableSurface.c().get(), size, i4);
                            } else if (Objects.equals(deferrableSurface.j, ImageAnalysis.class)) {
                                outputSurfaceA4 = OutputSurface.a((Surface) deferrableSurface.c().get(), size, i4);
                            }
                        }
                        i3 = i + 1;
                    }
                    outputSurfaceA2 = OutputSurface.a((Surface) deferrableSurface.c().get(), size, i4);
                    i3 = i + 1;
                }
                SessionConfig.OutputConfig outputConfig = sessionConfig.b;
                if (outputConfig != null) {
                    deferrableSurfaceF = outputConfig.f();
                    outputSurfaceA = OutputSurface.a((Surface) deferrableSurfaceF.c().get(), deferrableSurfaceF.h, deferrableSurfaceF.i);
                } else {
                    outputSurfaceA = null;
                    deferrableSurfaceF = null;
                }
                processingCaptureSession.i = ProcessingCaptureSession.ProcessorState.e;
                try {
                    ArrayList arrayList = new ArrayList(processingCaptureSession.e);
                    if (deferrableSurfaceF != null) {
                        arrayList.add(deferrableSurfaceF);
                    }
                    DeferrableSurfaces.b(arrayList);
                    Logger.e("ProcessingCaptureSession", "== initSession (id=" + i2 + ")");
                    try {
                        SessionProcessor sessionProcessor = processingCaptureSession.f279a;
                        OutputSurfaceConfiguration.a(outputSurfaceA2, outputSurfaceA3, outputSurfaceA4, outputSurfaceA);
                        SessionConfig sessionConfigD = sessionProcessor.d();
                        processingCaptureSession.h = sessionConfigD;
                        boolean z = false;
                        Futures.h(((DeferrableSurface) sessionConfigD.b().get(0)).e).addListener(new b(6, processingCaptureSession, deferrableSurfaceF), CameraXExecutors.a());
                        for (DeferrableSurface deferrableSurface2 : processingCaptureSession.h.b()) {
                            ProcessingCaptureSession.n.add(deferrableSurface2);
                            Futures.h(deferrableSurface2.e).addListener(new m(deferrableSurface2, 6), executor);
                        }
                        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                        validatingBuilder.a(sessionConfig);
                        validatingBuilder.c();
                        validatingBuilder.a(processingCaptureSession.h);
                        if (validatingBuilder.k && validatingBuilder.j) {
                            z = true;
                        }
                        Preconditions.a("Cannot transform the SessionConfig", z);
                        SessionConfig sessionConfigB = validatingBuilder.b();
                        CaptureSession captureSession = processingCaptureSession.d;
                        cameraDevice.getClass();
                        ListenableFuture listenableFutureA = captureSession.a(sessionConfigB, cameraDevice, opener);
                        Futures.a(listenableFutureA, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession.1
                            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                            public final void onFailure(Throwable th) {
                                Logger.c("ProcessingCaptureSession", "open session failed ", th);
                                ProcessingCaptureSession processingCaptureSession2 = ProcessingCaptureSession.this;
                                processingCaptureSession2.close();
                                processingCaptureSession2.release();
                            }

                            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                            }
                        }, executor);
                        return listenableFutureA;
                    } catch (Throwable th) {
                        Logger.c("ProcessingCaptureSession", "initSession failed", th);
                        DeferrableSurfaces.a(processingCaptureSession.e);
                        if (deferrableSurfaceF != null) {
                            deferrableSurfaceF.b();
                        }
                        throw th;
                    }
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    return Futures.e(e);
                }
            default:
                return SynchronizedCaptureSessionImpl.x((SynchronizedCaptureSessionImpl) this.e, (CameraDevice) this.g, (SessionConfigurationCompat) this.f, (List) this.h);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        String str;
        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = (SynchronizedCaptureSessionBaseImpl) this.e;
        List list = (List) this.f;
        CameraDeviceCompat cameraDeviceCompat = (CameraDeviceCompat) this.g;
        SessionConfigurationCompat sessionConfigurationCompat = (SessionConfigurationCompat) this.h;
        synchronized (synchronizedCaptureSessionBaseImpl.f284a) {
            synchronized (synchronizedCaptureSessionBaseImpl.f284a) {
                synchronizedCaptureSessionBaseImpl.u();
                DeferrableSurfaces.b(list);
                synchronizedCaptureSessionBaseImpl.j = list;
            }
            Preconditions.f("The openCaptureSessionCompleter can only set once!", synchronizedCaptureSessionBaseImpl.h == null);
            synchronizedCaptureSessionBaseImpl.h = completer;
            cameraDeviceCompat.a(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + synchronizedCaptureSessionBaseImpl + "]";
        }
        return str;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
