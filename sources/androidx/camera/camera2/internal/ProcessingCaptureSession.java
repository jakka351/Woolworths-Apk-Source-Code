package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.OptIn;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@OptIn
/* loaded from: classes2.dex */
final class ProcessingCaptureSession implements CaptureSessionInterface {
    public static final ArrayList n = new ArrayList();
    public static int o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SessionProcessor f279a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final CaptureSession d;
    public SessionConfig f;
    public Camera2RequestProcessor g;
    public SessionConfig h;
    public ProcessorState i;
    public final int m;
    public List e = new ArrayList();
    public volatile List j = null;
    public CaptureRequestOptions k = new CaptureRequestOptions.Builder().a();
    public CaptureRequestOptions l = new CaptureRequestOptions.Builder().a();

    public static class CaptureCallbackAdapter implements SessionProcessor.CaptureCallback {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProcessorState {
        public static final ProcessorState d;
        public static final ProcessorState e;
        public static final ProcessorState f;
        public static final ProcessorState g;
        public static final ProcessorState h;
        public static final /* synthetic */ ProcessorState[] i;

        static {
            ProcessorState processorState = new ProcessorState("UNINITIALIZED", 0);
            d = processorState;
            ProcessorState processorState2 = new ProcessorState("SESSION_INITIALIZED", 1);
            e = processorState2;
            ProcessorState processorState3 = new ProcessorState("ON_CAPTURE_SESSION_STARTED", 2);
            f = processorState3;
            ProcessorState processorState4 = new ProcessorState("ON_CAPTURE_SESSION_ENDED", 3);
            g = processorState4;
            ProcessorState processorState5 = new ProcessorState("DE_INITIALIZED", 4);
            h = processorState5;
            i = new ProcessorState[]{processorState, processorState2, processorState3, processorState4, processorState5};
        }

        public static ProcessorState valueOf(String str) {
            return (ProcessorState) Enum.valueOf(ProcessorState.class, str);
        }

        public static ProcessorState[] values() {
            return (ProcessorState[]) i.clone();
        }
    }

    public static class SessionProcessorCaptureCallback implements SessionProcessor.CaptureCallback {
    }

    public ProcessingCaptureSession(SessionProcessor sessionProcessor, Camera2CameraInfoImpl camera2CameraInfoImpl, DynamicRangesCompat dynamicRangesCompat, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.m = 0;
        this.d = new CaptureSession(dynamicRangesCompat, DeviceQuirks.f327a.b(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.f279a = sessionProcessor;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.i = ProcessorState.d;
        int i = o;
        o = i + 1;
        this.m = i;
        Logger.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + i + ")");
    }

    public static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptureConfig captureConfig = (CaptureConfig) it.next();
            Iterator it2 = captureConfig.e.iterator();
            while (it2.hasNext()) {
                ((CameraCaptureCallback) it2.next()).a(captureConfig.a());
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture a(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        Preconditions.a("Invalid state state:" + this.i, this.i == ProcessorState.d);
        Preconditions.a("SessionConfig contains no surfaces", sessionConfig.b().isEmpty() ^ true);
        Logger.a("ProcessingCaptureSession", "open (id=" + this.m + ")");
        List listB = sessionConfig.b();
        this.e = listB;
        ScheduledExecutorService scheduledExecutorService = this.c;
        Executor executor = this.b;
        return (FutureChain) Futures.l((FutureChain) Futures.m(FutureChain.a(DeferrableSurfaces.c(listB, executor, scheduledExecutorService)), new k0(this, sessionConfig, cameraDevice, opener, 0), executor), new Function() { // from class: androidx.camera.camera2.internal.l0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                ProcessingCaptureSession processingCaptureSession = this.f376a;
                CaptureSession captureSession = processingCaptureSession.d;
                if (processingCaptureSession.i == ProcessingCaptureSession.ProcessorState.e) {
                    List<DeferrableSurface> listB2 = processingCaptureSession.h.b();
                    ArrayList arrayList = new ArrayList();
                    for (DeferrableSurface deferrableSurface : listB2) {
                        Preconditions.a("Surface must be SessionProcessorSurface", deferrableSurface instanceof SessionProcessorSurface);
                        arrayList.add((SessionProcessorSurface) deferrableSurface);
                    }
                    processingCaptureSession.g = new Camera2RequestProcessor(captureSession, arrayList);
                    Logger.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + processingCaptureSession.m + ")");
                    processingCaptureSession.f279a.g();
                    processingCaptureSession.i = ProcessingCaptureSession.ProcessorState.f;
                    SessionConfig sessionConfig2 = processingCaptureSession.f;
                    if (sessionConfig2 != null) {
                        processingCaptureSession.d(sessionConfig2);
                    }
                    if (processingCaptureSession.j != null) {
                        processingCaptureSession.e(processingCaptureSession.j);
                        processingCaptureSession.j = null;
                    }
                }
                return null;
            }
        }, executor);
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void b(HashMap map) {
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final SessionConfig c() {
        return this.f;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void close() {
        Logger.a("ProcessingCaptureSession", "close (id=" + this.m + ") state=" + this.i);
        if (this.i == ProcessorState.f) {
            Logger.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.m + ")");
            this.f279a.b();
            Camera2RequestProcessor camera2RequestProcessor = this.g;
            if (camera2RequestProcessor != null) {
                synchronized (camera2RequestProcessor.f255a) {
                    camera2RequestProcessor.b = null;
                }
            }
            this.i = ProcessorState.g;
        }
        this.d.close();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void d(SessionConfig sessionConfig) {
        Logger.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.m + ")");
        this.f = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        Camera2RequestProcessor camera2RequestProcessor = this.g;
        if (camera2RequestProcessor != null) {
            synchronized (camera2RequestProcessor.f255a) {
            }
        }
        if (this.i == ProcessorState.f) {
            CaptureRequestOptions captureRequestOptionsA = CaptureRequestOptions.Builder.c(sessionConfig.g.b).a();
            this.k = captureRequestOptionsA;
            CaptureRequestOptions captureRequestOptions = this.l;
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            MutableOptionsBundle mutableOptionsBundle = builder.f223a;
            Config.OptionPriority optionPriority = Config.OptionPriority.g;
            for (Config.Option option : captureRequestOptionsA.f()) {
                mutableOptionsBundle.X(option, optionPriority, captureRequestOptionsA.a(option));
            }
            for (Config.Option option2 : captureRequestOptions.f()) {
                mutableOptionsBundle.X(option2, optionPriority, captureRequestOptions.a(option2));
            }
            SessionProcessor sessionProcessor = this.f279a;
            builder.a();
            sessionProcessor.h();
            for (DeferrableSurface deferrableSurface : Collections.unmodifiableList(sessionConfig.g.f482a)) {
                if (Objects.equals(deferrableSurface.j, Preview.class) || Objects.equals(deferrableSurface.j, StreamSharing.class)) {
                    SessionProcessor sessionProcessor2 = this.f279a;
                    TagBundle tagBundle = sessionConfig.g.g;
                    sessionProcessor2.e();
                    return;
                }
            }
            this.f279a.a();
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void e(List list) {
        if (list.isEmpty()) {
            return;
        }
        Logger.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.m + ") + state =" + this.i);
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.j == null) {
                this.j = list;
                return;
            } else {
                i(list);
                Logger.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                Logger.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.i);
                i(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptureConfig captureConfig = (CaptureConfig) it.next();
            int i = captureConfig.c;
            if (i == 2 || i == 4) {
                CaptureRequestOptions.Builder builderC = CaptureRequestOptions.Builder.c(captureConfig.b);
                OptionsBundle optionsBundle = captureConfig.b;
                Config.Option option = CaptureConfig.i;
                if (optionsBundle.G.containsKey(option)) {
                    CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
                    builderC.f383a.G(Camera2ImplConfig.U(key), (Integer) optionsBundle.a(option));
                }
                Config.Option option2 = CaptureConfig.j;
                if (optionsBundle.G.containsKey(option2)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
                    builderC.f383a.G(Camera2ImplConfig.U(key2), Byte.valueOf(((Integer) optionsBundle.a(option2)).byteValue()));
                }
                CaptureRequestOptions captureRequestOptionsA = builderC.a();
                this.l = captureRequestOptionsA;
                CaptureRequestOptions captureRequestOptions = this.k;
                Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
                MutableOptionsBundle mutableOptionsBundle = builder.f223a;
                Config.OptionPriority optionPriority = Config.OptionPriority.g;
                for (Config.Option option3 : captureRequestOptions.f()) {
                    mutableOptionsBundle.X(option3, optionPriority, captureRequestOptions.a(option3));
                }
                for (Config.Option option4 : captureRequestOptionsA.f()) {
                    mutableOptionsBundle.X(option4, optionPriority, captureRequestOptionsA.a(option4));
                }
                SessionProcessor sessionProcessor = this.f279a;
                builder.a();
                sessionProcessor.h();
                SessionProcessor sessionProcessor2 = this.f279a;
                captureConfig.a();
                sessionProcessor2.f();
            } else {
                Logger.a("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator it2 = CaptureRequestOptions.Builder.c(captureConfig.b).a().f().iterator();
                while (it2.hasNext()) {
                    CaptureRequest.Key key3 = (CaptureRequest.Key) ((Config.Option) it2.next()).d();
                    if (key3.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key3.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        SessionProcessor sessionProcessor3 = this.f279a;
                        captureConfig.a();
                        sessionProcessor3.getClass();
                        break;
                    }
                }
                i(Arrays.asList(captureConfig));
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final boolean f() {
        return this.d.f();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void g() {
        Logger.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.m + ")");
        if (this.j != null) {
            for (CaptureConfig captureConfig : this.j) {
                Iterator it = captureConfig.e.iterator();
                while (it.hasNext()) {
                    ((CameraCaptureCallback) it.next()).a(captureConfig.a());
                }
            }
            this.j = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final List h() {
        return this.j != null ? this.j : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture release() {
        Logger.a("ProcessingCaptureSession", "release (id=" + this.m + ") mProcessorState=" + this.i);
        ListenableFuture listenableFutureRelease = this.d.release();
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            listenableFutureRelease.addListener(new m(this, 5), CameraXExecutors.a());
        }
        this.i = ProcessorState.h;
        return listenableFutureRelease;
    }
}
