package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.internal.compat.workaround.TorchStateReset;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
final class CaptureSession implements CaptureSessionInterface {

    /* renamed from: a, reason: collision with root package name */
    public final Object f264a;
    public final ArrayList b;
    public final StateCallback c;
    public SynchronizedCaptureSession.Opener d;
    public SynchronizedCaptureSession e;
    public SessionConfig f;
    public final HashMap g;
    public List h;
    public State i;
    public ListenableFuture j;
    public CallbackToFutureAdapter.Completer k;
    public HashMap l;
    public final StillCaptureFlow m;
    public final TorchStateReset n;
    public final RequestMonitor o;
    public final DynamicRangesCompat p;
    public final TemplateParamsOverride q;
    public final boolean r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final State j;
        public static final State k;
        public static final /* synthetic */ State[] l;

        static {
            State state = new State("UNINITIALIZED", 0);
            d = state;
            State state2 = new State("INITIALIZED", 1);
            e = state2;
            State state3 = new State("GET_SURFACE", 2);
            f = state3;
            State state4 = new State("OPENING", 3);
            g = state4;
            State state5 = new State("OPENED", 4);
            h = state5;
            State state6 = new State("CLOSED", 5);
            i = state6;
            State state7 = new State("RELEASING", 6);
            j = state7;
            State state8 = new State("RELEASED", 7);
            k = state8;
            l = new State[]{state, state2, state3, state4, state5, state6, state7, state8};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) l.clone();
        }
    }

    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void m(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f264a) {
                try {
                    switch (CaptureSession.this.i.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.i);
                        case 3:
                        case 5:
                        case 6:
                            CaptureSession.this.k();
                            break;
                        case 7:
                            Logger.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    Logger.b("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void n(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f264a) {
                try {
                    switch (CaptureSession.this.i.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.i);
                        case 3:
                            CaptureSession captureSession = CaptureSession.this;
                            captureSession.i = State.h;
                            captureSession.e = synchronizedCaptureSession;
                            Logger.a("CaptureSession", "Attempting to send capture request onConfigured");
                            CaptureSession captureSession2 = CaptureSession.this;
                            captureSession2.o(captureSession2.f);
                            CaptureSession captureSession3 = CaptureSession.this;
                            captureSession3.o.b().addListener(new m(captureSession3, 3), CameraXExecutors.a());
                            break;
                        case 5:
                            CaptureSession.this.e = synchronizedCaptureSession;
                            break;
                        case 6:
                            synchronizedCaptureSession.close();
                            break;
                    }
                    Logger.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void o(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f264a) {
                try {
                    if (CaptureSession.this.i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.i);
                    }
                    Logger.a("CaptureSession", "CameraCaptureSession.onReady() " + CaptureSession.this.i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public final void p(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f264a) {
                try {
                    if (CaptureSession.this.i == State.d) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.i);
                    }
                    Logger.a("CaptureSession", "onSessionFinished()");
                    CaptureSession.this.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, boolean z) {
        this(dynamicRangesCompat, new Quirks(Collections.EMPTY_LIST), z);
    }

    public static CameraCaptureSession.CaptureCallback i(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback comboSessionCaptureCallback;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
            if (cameraCaptureCallback == null) {
                comboSessionCaptureCallback = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                CaptureCallbackConverter.a(cameraCaptureCallback, arrayList2);
                comboSessionCaptureCallback = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new Camera2CaptureCallbacks.ComboSessionCaptureCallback(arrayList2);
            }
            arrayList.add(comboSessionCaptureCallback);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new Camera2CaptureCallbacks.ComboSessionCaptureCallback(arrayList);
    }

    public static HashMap j(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (SessionConfig.OutputConfig outputConfig : (List) map.get(num)) {
                SurfaceUtil.SurfaceInfo surfaceInfoA = SurfaceUtil.a((Surface) map2.get(outputConfig.f()));
                if (i == 0) {
                    i = surfaceInfoA.f521a;
                }
                z.s();
                int i2 = surfaceInfoA.b;
                int i3 = surfaceInfoA.c;
                String strD = outputConfig.d();
                Objects.requireNonNull(strD);
                arrayList.add(z.f(i2, i3, strD));
            }
            if (i == 0 || arrayList.isEmpty()) {
                StringBuilder sbR = YU.a.r(i, "Skips to create instances for multi-resolution output. imageFormat: ", ", streamInfos size: ");
                sbR.append(arrayList.size());
                Logger.b("CaptureSession", sbR.toString());
            } else {
                List list = null;
                try {
                    list = (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, arrayList, Integer.valueOf(i));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    Logger.b("CaptureSession", "Failed to create instances for multi-resolution output, " + e.getMessage());
                }
                if (list != null) {
                    for (SessionConfig.OutputConfig outputConfig2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) list.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(outputConfig2.f()));
                        map3.put(outputConfig2, new OutputConfigurationCompat(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static HashMap m(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) it.next();
            if (outputConfig.g() > 0 && outputConfig.e().isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(outputConfig.g()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(outputConfig.g()), arrayList2);
                }
                arrayList2.add(outputConfig);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture a(final SessionConfig sessionConfig, final CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        synchronized (this.f264a) {
            try {
                if (this.i.ordinal() != 1) {
                    Logger.b("CaptureSession", "Open not allowed in state: " + this.i);
                    return Futures.e(new IllegalStateException("open() should not allow the state: " + this.i));
                }
                this.i = State.f;
                ArrayList arrayList = new ArrayList(sessionConfig.b());
                this.h = arrayList;
                this.d = opener;
                FutureChain futureChain = (FutureChain) Futures.m(FutureChain.a(((SynchronizedCaptureSessionImpl) opener).v(arrayList)), new AsyncFunction() { // from class: androidx.camera.camera2.internal.b0
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        InputConfiguration inputConfiguration;
                        CaptureSession captureSession = this.d;
                        SessionConfig sessionConfig2 = sessionConfig;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (captureSession.f264a) {
                            try {
                                int iOrdinal = captureSession.i.ordinal();
                                if (iOrdinal != 0 && iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        captureSession.g.clear();
                                        for (int i = 0; i < list.size(); i++) {
                                            captureSession.g.put((DeferrableSurface) captureSession.h.get(i), (Surface) list.get(i));
                                        }
                                        captureSession.i = CaptureSession.State.g;
                                        Logger.a("CaptureSession", "Opening capture session.");
                                        SynchronizedCaptureSessionStateCallbacks synchronizedCaptureSessionStateCallbacks = new SynchronizedCaptureSessionStateCallbacks(Arrays.asList(captureSession.c, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig2.d)));
                                        CaptureConfig captureConfig = sessionConfig2.g;
                                        OptionsBundle optionsBundle = captureConfig.b;
                                        CaptureConfig.Builder builder = new CaptureConfig.Builder(captureConfig);
                                        HashMap map = new HashMap();
                                        int i2 = 35;
                                        if (captureSession.r && Build.VERSION.SDK_INT >= 35) {
                                            map = CaptureSession.j(CaptureSession.m(sessionConfig2.f498a), captureSession.g);
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        OutputConfigurationCompat outputConfigurationCompat = null;
                                        String str = (String) optionsBundle.c(Camera2ImplConfig.M, null);
                                        Iterator it = sessionConfig2.f498a.iterator();
                                        while (it.hasNext()) {
                                            SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) it.next();
                                            OutputConfigurationCompat outputConfigurationCompatL = (!captureSession.r || Build.VERSION.SDK_INT < i2) ? outputConfigurationCompat : (OutputConfigurationCompat) map.get(outputConfig);
                                            if (outputConfigurationCompatL == null) {
                                                outputConfigurationCompatL = captureSession.l(outputConfig, captureSession.g, str);
                                                if (captureSession.l.containsKey(outputConfig.f())) {
                                                    outputConfigurationCompatL.g(((Long) captureSession.l.get(outputConfig.f())).longValue());
                                                }
                                            }
                                            arrayList2.add(outputConfigurationCompatL);
                                            i2 = 35;
                                            outputConfigurationCompat = null;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        ArrayList arrayList4 = new ArrayList();
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            OutputConfigurationCompat outputConfigurationCompat2 = (OutputConfigurationCompat) it2.next();
                                            if (!arrayList3.contains(outputConfigurationCompat2.c())) {
                                                arrayList3.add(outputConfigurationCompat2.c());
                                                arrayList4.add(outputConfigurationCompat2);
                                            }
                                        }
                                        final SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = (SynchronizedCaptureSessionBaseImpl) captureSession.d;
                                        synchronizedCaptureSessionBaseImpl.e = synchronizedCaptureSessionStateCallbacks;
                                        SessionConfigurationCompat sessionConfigurationCompat = new SessionConfigurationCompat(arrayList4, synchronizedCaptureSessionBaseImpl.c, new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.2
                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onActive(CameraCaptureSession cameraCaptureSession) {
                                                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                synchronizedCaptureSessionBaseImpl2.r(cameraCaptureSession);
                                                synchronizedCaptureSessionBaseImpl2.j(synchronizedCaptureSessionBaseImpl2);
                                            }

                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                                                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                synchronizedCaptureSessionBaseImpl2.r(cameraCaptureSession);
                                                synchronizedCaptureSessionBaseImpl2.k(synchronizedCaptureSessionBaseImpl2);
                                            }

                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onClosed(CameraCaptureSession cameraCaptureSession) {
                                                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                synchronizedCaptureSessionBaseImpl2.r(cameraCaptureSession);
                                                synchronizedCaptureSessionBaseImpl2.l(synchronizedCaptureSessionBaseImpl2);
                                            }

                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                                                CallbackToFutureAdapter.Completer completer;
                                                try {
                                                    SynchronizedCaptureSessionBaseImpl.this.r(cameraCaptureSession);
                                                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                    synchronizedCaptureSessionBaseImpl2.m(synchronizedCaptureSessionBaseImpl2);
                                                    synchronized (SynchronizedCaptureSessionBaseImpl.this.f284a) {
                                                        Preconditions.e(SynchronizedCaptureSessionBaseImpl.this.h, "OpenCaptureSession completer should not null");
                                                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                                                        completer = synchronizedCaptureSessionBaseImpl3.h;
                                                        synchronizedCaptureSessionBaseImpl3.h = null;
                                                    }
                                                    completer.d(new IllegalStateException("onConfigureFailed"));
                                                } catch (Throwable th) {
                                                    synchronized (SynchronizedCaptureSessionBaseImpl.this.f284a) {
                                                        Preconditions.e(SynchronizedCaptureSessionBaseImpl.this.h, "OpenCaptureSession completer should not null");
                                                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl4 = SynchronizedCaptureSessionBaseImpl.this;
                                                        CallbackToFutureAdapter.Completer completer2 = synchronizedCaptureSessionBaseImpl4.h;
                                                        synchronizedCaptureSessionBaseImpl4.h = null;
                                                        completer2.d(new IllegalStateException("onConfigureFailed"));
                                                        throw th;
                                                    }
                                                }
                                            }

                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                                                CallbackToFutureAdapter.Completer completer;
                                                try {
                                                    SynchronizedCaptureSessionBaseImpl.this.r(cameraCaptureSession);
                                                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                    synchronizedCaptureSessionBaseImpl2.n(synchronizedCaptureSessionBaseImpl2);
                                                    synchronized (SynchronizedCaptureSessionBaseImpl.this.f284a) {
                                                        Preconditions.e(SynchronizedCaptureSessionBaseImpl.this.h, "OpenCaptureSession completer should not null");
                                                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                                                        completer = synchronizedCaptureSessionBaseImpl3.h;
                                                        synchronizedCaptureSessionBaseImpl3.h = null;
                                                    }
                                                    completer.b(null);
                                                } catch (Throwable th) {
                                                    synchronized (SynchronizedCaptureSessionBaseImpl.this.f284a) {
                                                        Preconditions.e(SynchronizedCaptureSessionBaseImpl.this.h, "OpenCaptureSession completer should not null");
                                                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl4 = SynchronizedCaptureSessionBaseImpl.this;
                                                        CallbackToFutureAdapter.Completer completer2 = synchronizedCaptureSessionBaseImpl4.h;
                                                        synchronizedCaptureSessionBaseImpl4.h = null;
                                                        completer2.b(null);
                                                        throw th;
                                                    }
                                                }
                                            }

                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onReady(CameraCaptureSession cameraCaptureSession) {
                                                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                synchronizedCaptureSessionBaseImpl2.r(cameraCaptureSession);
                                                synchronizedCaptureSessionBaseImpl2.o(synchronizedCaptureSessionBaseImpl2);
                                            }

                                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                                            public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                                                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                                                synchronizedCaptureSessionBaseImpl2.r(cameraCaptureSession);
                                                synchronizedCaptureSessionBaseImpl2.q(synchronizedCaptureSessionBaseImpl2, surface);
                                            }
                                        });
                                        if (sessionConfig2.g.c == 5 && (inputConfiguration = sessionConfig2.h) != null) {
                                            sessionConfigurationCompat.a(InputConfigurationCompat.a(inputConfiguration));
                                        }
                                        try {
                                            CaptureRequest captureRequestD = Camera2CaptureRequestBuilder.d(builder.d(), cameraDevice2, captureSession.q);
                                            if (captureRequestD != null) {
                                                sessionConfigurationCompat.b(captureRequestD);
                                            }
                                            return ((SynchronizedCaptureSessionImpl) captureSession.d).t(cameraDevice2, sessionConfigurationCompat, captureSession.h);
                                        } catch (CameraAccessException e) {
                                            return Futures.e(e);
                                        }
                                    }
                                    if (iOrdinal != 4) {
                                        return Futures.e(new CancellationException("openCaptureSession() not execute in state: " + captureSession.i));
                                    }
                                }
                                return Futures.e(new IllegalStateException("openCaptureSession() should not be possible in state: " + captureSession.i));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, ((SynchronizedCaptureSessionBaseImpl) this.d).c);
                Futures.a(futureChain, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onFailure(Throwable th) {
                        synchronized (CaptureSession.this.f264a) {
                            try {
                                ((SynchronizedCaptureSessionImpl) CaptureSession.this.d).w();
                                int iOrdinal = CaptureSession.this.i.ordinal();
                                if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                                    Logger.f("CaptureSession", "Opening session with fail " + CaptureSession.this.i, th);
                                    CaptureSession.this.k();
                                }
                            } finally {
                            }
                        }
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    }
                }, ((SynchronizedCaptureSessionBaseImpl) this.d).c);
                return Futures.h(futureChain);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void b(HashMap map) {
        synchronized (this.f264a) {
            this.l = map;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final SessionConfig c() {
        SessionConfig sessionConfig;
        synchronized (this.f264a) {
            sessionConfig = this.f;
        }
        return sessionConfig;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void close() {
        synchronized (this.f264a) {
            try {
                int iOrdinal = this.i.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.i);
                }
                if (iOrdinal == 1) {
                    this.i = State.k;
                } else if (iOrdinal == 2) {
                    Preconditions.e(this.d, "The Opener shouldn't null in state:" + this.i);
                    ((SynchronizedCaptureSessionImpl) this.d).w();
                    this.i = State.k;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    Preconditions.e(this.d, "The Opener shouldn't null in state:" + this.i);
                    ((SynchronizedCaptureSessionImpl) this.d).w();
                    this.i = State.i;
                    this.o.c();
                    this.f = null;
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void d(SessionConfig sessionConfig) {
        synchronized (this.f264a) {
            try {
                switch (this.i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.i);
                    case 1:
                    case 2:
                    case 3:
                        this.f = sessionConfig;
                        break;
                    case 4:
                        this.f = sessionConfig;
                        if (sessionConfig != null) {
                            if (!this.g.keySet().containsAll(sessionConfig.b())) {
                                Logger.b("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                Logger.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                o(this.f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void e(List list) {
        synchronized (this.f264a) {
            try {
                switch (this.i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.i);
                    case 1:
                    case 2:
                    case 3:
                        this.b.addAll(list);
                        break;
                    case 4:
                        this.b.addAll(list);
                        this.o.b().addListener(new m(this, 3), CameraXExecutors.a());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final boolean f() {
        boolean z;
        synchronized (this.f264a) {
            try {
                State state = this.i;
                z = state == State.h || state == State.g;
            } finally {
            }
        }
        return z;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void g() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.f264a) {
            try {
                if (this.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (CaptureConfig captureConfig : arrayList) {
                Iterator it = captureConfig.e.iterator();
                while (it.hasNext()) {
                    ((CameraCaptureCallback) it.next()).a(captureConfig.a());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final List h() {
        List listUnmodifiableList;
        synchronized (this.f264a) {
            listUnmodifiableList = Collections.unmodifiableList(this.b);
        }
        return listUnmodifiableList;
    }

    public final void k() {
        State state = this.i;
        State state2 = State.k;
        if (state == state2) {
            Logger.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.i = state2;
        this.e = null;
        CallbackToFutureAdapter.Completer completer = this.k;
        if (completer != null) {
            completer.b(null);
            this.k = null;
        }
    }

    public final OutputConfigurationCompat l(SessionConfig.OutputConfig outputConfig, HashMap map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = (Surface) map.get(outputConfig.f());
        Preconditions.e(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(outputConfig.g(), surface);
        if (str != null) {
            outputConfigurationCompat.f(str);
        } else {
            outputConfigurationCompat.f(outputConfig.d());
        }
        if (outputConfig.c() == 0) {
            outputConfigurationCompat.e(1);
        } else if (outputConfig.c() == 1) {
            outputConfigurationCompat.e(2);
        }
        if (!outputConfig.e().isEmpty()) {
            outputConfigurationCompat.b();
            Iterator it = outputConfig.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((DeferrableSurface) it.next());
                Preconditions.e(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                outputConfigurationCompat.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.p.d()) == null) {
            jLongValue = 1;
        } else {
            DynamicRange dynamicRangeB = outputConfig.b();
            Long lA = DynamicRangeConversions.a(dynamicRangeB, dynamicRangeProfilesD);
            if (lA == null) {
                Logger.b("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRangeB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        outputConfigurationCompat.d(jLongValue);
        return outputConfigurationCompat;
    }

    public final void n(ArrayList arrayList) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback;
        ArrayList arrayList2;
        boolean z;
        CameraCaptureResult cameraCaptureResult;
        synchronized (this.f264a) {
            try {
                if (this.i != State.h) {
                    Logger.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                    arrayList2 = new ArrayList();
                    Logger.a("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z = false;
                    while (it.hasNext()) {
                        CaptureConfig captureConfig = (CaptureConfig) it.next();
                        if (Collections.unmodifiableList(captureConfig.f482a).isEmpty()) {
                            Logger.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(captureConfig.f482a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    DeferrableSurface deferrableSurface = (DeferrableSurface) it2.next();
                                    if (!this.g.containsKey(deferrableSurface)) {
                                        Logger.a("CaptureSession", "Skipping capture request with invalid surface: " + deferrableSurface);
                                        break;
                                    }
                                } else {
                                    if (captureConfig.c == 2) {
                                        z = true;
                                    }
                                    CaptureConfig.Builder builder = new CaptureConfig.Builder(captureConfig);
                                    if (captureConfig.c == 5 && (cameraCaptureResult = captureConfig.h) != null) {
                                        builder.h = cameraCaptureResult;
                                    }
                                    SessionConfig sessionConfig = this.f;
                                    if (sessionConfig != null) {
                                        builder.c(sessionConfig.g.b);
                                    }
                                    builder.c(captureConfig.b);
                                    CaptureRequest captureRequestC = Camera2CaptureRequestBuilder.c(builder.d(), this.e.c(), this.g, false, this.q);
                                    if (captureRequestC == null) {
                                        Logger.a("CaptureSession", "Skipping issuing request without surface.");
                                        return;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = captureConfig.e.iterator();
                                    while (it3.hasNext()) {
                                        CaptureCallbackConverter.a((CameraCaptureCallback) it3.next(), arrayList3);
                                    }
                                    cameraBurstCaptureCallback.a(captureRequestC, arrayList3);
                                    arrayList2.add(captureRequestC);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e) {
                    Logger.b("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    Logger.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return;
                }
                if (this.m.a(arrayList2, z)) {
                    this.e.a();
                    cameraBurstCaptureCallback.b = new a0(this);
                }
                if (this.n.b(arrayList2, z)) {
                    cameraBurstCaptureCallback.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                            synchronized (CaptureSession.this.f264a) {
                                try {
                                    SessionConfig sessionConfig2 = CaptureSession.this.f;
                                    if (sessionConfig2 == null) {
                                        return;
                                    }
                                    CaptureConfig captureConfig2 = sessionConfig2.g;
                                    Logger.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                                    CaptureSession captureSession = CaptureSession.this;
                                    captureSession.n.getClass();
                                    captureSession.e(Collections.singletonList(TorchStateReset.a(captureConfig2)));
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }));
                }
                this.e.h(arrayList2, cameraBurstCaptureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(SessionConfig sessionConfig) {
        synchronized (this.f264a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (sessionConfig == null) {
                Logger.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.i != State.h) {
                Logger.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            CaptureConfig captureConfig = sessionConfig.g;
            if (Collections.unmodifiableList(captureConfig.f482a).isEmpty()) {
                Logger.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.e.a();
                } catch (CameraAccessException e) {
                    Logger.b("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                Logger.a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestC = Camera2CaptureRequestBuilder.c(captureConfig, this.e.c(), this.g, true, this.q);
                if (captureRequestC == null) {
                    Logger.a("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                } else {
                    this.e.i(captureRequestC, this.o.a(i(captureConfig.e, new CameraCaptureSession.CaptureCallback[0])));
                    return;
                }
            } catch (CameraAccessException e2) {
                Logger.b("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:23:0x0078, B:7:0x0013, B:9:0x0017, B:12:0x001d, B:14:0x0043, B:15:0x0047, B:17:0x004b, B:18:0x0056, B:19:0x0058, B:21:0x005a, B:22:0x0074, B:26:0x007f, B:27:0x0092), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:23:0x0078, B:7:0x0013, B:9:0x0017, B:12:0x001d, B:14:0x0043, B:15:0x0047, B:17:0x004b, B:18:0x0056, B:19:0x0058, B:21:0x005a, B:22:0x0074, B:26:0x007f, B:27:0x0092), top: B:30:0x0009 }] */
    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture release() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f264a
            monitor-enter(r3)
            androidx.camera.camera2.internal.CaptureSession$State r4 = r5.i     // Catch: java.lang.Throwable -> L1b
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L1b
            switch(r4) {
                case 0: goto L7f;
                case 1: goto L74;
                case 2: goto L5a;
                case 3: goto L1d;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L47;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L1b
        L12:
            goto L78
        L13:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r0 = r5.e     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L93
        L1d:
            androidx.camera.camera2.internal.CaptureSession$State r0 = androidx.camera.camera2.internal.CaptureSession.State.j     // Catch: java.lang.Throwable -> L1b
            r5.i = r0     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.compat.workaround.RequestMonitor r0 = r5.o     // Catch: java.lang.Throwable -> L1b
            r0.c()     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.CaptureSession$State r2 = r5.i     // Catch: java.lang.Throwable -> L1b
            r1.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            androidx.core.util.Preconditions.e(r0, r1)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r0 = (androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl) r0     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.w()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L47
            r5.k()     // Catch: java.lang.Throwable -> L1b
            goto L78
        L47:
            com.google.common.util.concurrent.ListenableFuture r0 = r5.j     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L56
            androidx.camera.camera2.internal.a0 r0 = new androidx.camera.camera2.internal.a0     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.a(r0)     // Catch: java.lang.Throwable -> L1b
            r5.j = r0     // Catch: java.lang.Throwable -> L1b
        L56:
            com.google.common.util.concurrent.ListenableFuture r0 = r5.j     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return r0
        L5a:
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.CaptureSession$State r1 = r5.i     // Catch: java.lang.Throwable -> L1b
            r2.append(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            androidx.core.util.Preconditions.e(r0, r1)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.SynchronizedCaptureSession$Opener r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r0 = (androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl) r0     // Catch: java.lang.Throwable -> L1b
            r0.w()     // Catch: java.lang.Throwable -> L1b
        L74:
            androidx.camera.camera2.internal.CaptureSession$State r0 = androidx.camera.camera2.internal.CaptureSession.State.k     // Catch: java.lang.Throwable -> L1b
            r5.i = r0     // Catch: java.lang.Throwable -> L1b
        L78:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.g(r0)
            return r0
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            androidx.camera.camera2.internal.CaptureSession$State r0 = r5.i     // Catch: java.lang.Throwable -> L1b
            r2.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L93:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.release():com.google.common.util.concurrent.ListenableFuture");
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks, boolean z) {
        this.f264a = new Object();
        this.b = new ArrayList();
        this.g = new HashMap();
        this.h = Collections.EMPTY_LIST;
        this.i = State.d;
        this.l = new HashMap();
        this.m = new StillCaptureFlow();
        this.n = new TorchStateReset();
        this.i = State.e;
        this.p = dynamicRangesCompat;
        this.c = new StateCallback();
        this.o = new RequestMonitor(quirks.a(CaptureNoResponseQuirk.class));
        this.q = new TemplateParamsOverride(quirks);
        this.r = z;
    }
}
