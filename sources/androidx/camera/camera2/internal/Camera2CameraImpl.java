package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.MutableLiveData;
import androidx.tracing.Trace;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class Camera2CameraImpl implements CameraInternal {
    public MeteringRepeatingSession A;
    public final CaptureSessionRepository B;
    public final SynchronizedCaptureSession.OpenerBuilder C;
    public final HashSet D;
    public CameraConfig E;
    public final Object F;
    public SessionProcessor G;
    public boolean H;
    public final DisplayInfoManager I;
    public final DynamicRangesCompat J;
    public final SupportedSurfaceCombination K;
    public final ErrorTimeoutReopenScheduler L;
    public final UseCaseAttachState d;
    public final CameraManagerCompat e;
    public final Executor f;
    public final ScheduledExecutorService g;
    public volatile InternalState h = InternalState.f;
    public final LiveDataObservable i;
    public final CameraStateMachine j;
    public final Camera2CameraControlImpl k;
    public final StateCallback l;
    public final Camera2CameraInfoImpl m;
    public CameraDevice n;
    public int o;
    public CaptureSessionInterface p;
    public final LinkedHashMap q;
    public int r;
    public final CameraAvailability s;
    public final CameraCoordinator t;
    public final CameraStateRegistry u;
    public final boolean v;
    public final boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$1, reason: invalid class name */
    class AnonymousClass1 implements CamcorderProfileHelper {
        @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
        public final CamcorderProfile a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
        public final boolean b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public final class CameraAvailability extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {

        /* renamed from: a, reason: collision with root package name */
        public final String f234a;
        public boolean b = true;

        public CameraAvailability(String str) {
            this.f234a = str;
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public final void a() {
            if (Camera2CameraImpl.this.h == InternalState.g) {
                Camera2CameraImpl.this.L(false);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            if (this.f234a.equals(str)) {
                this.b = true;
                if (Camera2CameraImpl.this.h == InternalState.g) {
                    Camera2CameraImpl.this.L(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            if (this.f234a.equals(str)) {
                this.b = false;
            }
        }
    }

    public final class CameraConfigureAvailable implements CameraStateRegistry.OnConfigureAvailableListener {
        public CameraConfigureAvailable() {
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public final void a() {
            if (Camera2CameraImpl.this.h == InternalState.l) {
                Camera2CameraImpl.this.D();
            }
        }
    }

    public final class ControlUpdateListenerInternal implements CameraControlInternal.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }
    }

    public class ErrorTimeoutReopenScheduler {

        /* renamed from: a, reason: collision with root package name */
        public ScheduleNode f237a = null;

        public class ScheduleNode {

            /* renamed from: a, reason: collision with root package name */
            public final ScheduledFuture f238a;
            public final AtomicBoolean b = new AtomicBoolean(false);

            public ScheduleNode() {
                this.f238a = Camera2CameraImpl.this.g.schedule(new o(this, 0), 2000L, TimeUnit.MILLISECONDS);
            }
        }

        public ErrorTimeoutReopenScheduler() {
        }

        public final void a() {
            ScheduleNode scheduleNode = this.f237a;
            if (scheduleNode != null) {
                scheduleNode.b.set(true);
                scheduleNode.f238a.cancel(true);
            }
            this.f237a = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InternalState {
        public static final InternalState d;
        public static final InternalState e;
        public static final InternalState f;
        public static final InternalState g;
        public static final InternalState h;
        public static final InternalState i;
        public static final InternalState j;
        public static final InternalState k;
        public static final InternalState l;
        public static final InternalState m;
        public static final /* synthetic */ InternalState[] n;

        static {
            InternalState internalState = new InternalState("RELEASED", 0);
            d = internalState;
            InternalState internalState2 = new InternalState("RELEASING", 1);
            e = internalState2;
            InternalState internalState3 = new InternalState("INITIALIZED", 2);
            f = internalState3;
            InternalState internalState4 = new InternalState("PENDING_OPEN", 3);
            g = internalState4;
            InternalState internalState5 = new InternalState("CLOSING", 4);
            h = internalState5;
            InternalState internalState6 = new InternalState("REOPENING_QUIRK", 5);
            i = internalState6;
            InternalState internalState7 = new InternalState("REOPENING", 6);
            j = internalState7;
            InternalState internalState8 = new InternalState("OPENING", 7);
            k = internalState8;
            InternalState internalState9 = new InternalState("OPENED", 8);
            l = internalState9;
            InternalState internalState10 = new InternalState("CONFIGURED", 9);
            m = internalState10;
            n = new InternalState[]{internalState, internalState2, internalState3, internalState4, internalState5, internalState6, internalState7, internalState8, internalState9, internalState10};
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) n.clone();
        }
    }

    public final class StateCallback extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f239a;
        public final ScheduledExecutorService b;
        public ScheduledReopen c;
        public ScheduledFuture d;
        public final CameraReopenMonitor e;

        public class CameraReopenMonitor {

            /* renamed from: a, reason: collision with root package name */
            public final long f240a;
            public long b = -1;

            public CameraReopenMonitor(long j) {
                this.f240a = j;
            }

            public final int a() {
                if (!StateCallback.this.c()) {
                    return 700;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.b == -1) {
                    this.b = jUptimeMillis;
                }
                long j = jUptimeMillis - this.b;
                if (j <= 120000) {
                    return 1000;
                }
                return j <= 300000 ? 2000 : 4000;
            }

            public final int b() {
                boolean zC = StateCallback.this.c();
                long j = this.f240a;
                if (!zC) {
                    return j > 0 ? Math.min((int) j, ModuleDescriptor.MODULE_VERSION) : ModuleDescriptor.MODULE_VERSION;
                }
                if (j > 0) {
                    return Math.min((int) j, 1800000);
                }
                return 1800000;
            }
        }

        public class ScheduledReopen implements Runnable {
            public final Executor d;
            public boolean e = false;

            public ScheduledReopen(Executor executor) {
                this.d = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.execute(new m(this, 1));
            }
        }

        public StateCallback(Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
            this.f239a = executor;
            this.b = scheduledExecutorService;
            this.e = new CameraReopenMonitor(j);
        }

        public final boolean a() {
            if (this.d == null) {
                return false;
            }
            Camera2CameraImpl.this.v("Cancelling scheduled re-open: " + this.c, null);
            this.c.e = true;
            this.c = null;
            this.d.cancel(false);
            this.d = null;
            return true;
        }

        public final void b() {
            Preconditions.f(null, this.c == null);
            Preconditions.f(null, this.d == null);
            CameraReopenMonitor cameraReopenMonitor = this.e;
            cameraReopenMonitor.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (cameraReopenMonitor.b == -1) {
                cameraReopenMonitor.b = jUptimeMillis;
            }
            long j = jUptimeMillis - cameraReopenMonitor.b;
            long jB = cameraReopenMonitor.b();
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (j >= jB) {
                cameraReopenMonitor.b = -1L;
                Logger.b("Camera2CameraImpl", "Camera reopening attempted for " + cameraReopenMonitor.b() + "ms without success.");
                camera2CameraImpl.H(InternalState.g, null, false);
                return;
            }
            this.c = new ScheduledReopen(this.f239a);
            camera2CameraImpl.v("Attempting camera re-open in " + cameraReopenMonitor.a() + "ms: " + this.c + " activeResuming = " + camera2CameraImpl.H, null);
            this.d = this.b.schedule(this.c, (long) cameraReopenMonitor.a(), TimeUnit.MILLISECONDS);
        }

        public final boolean c() {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (!camera2CameraImpl.H) {
                return false;
            }
            int i = camera2CameraImpl.o;
            return i == 1 || i == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.v("CameraDevice.onClosed()", null);
            Preconditions.f("Unexpected onClose callback on camera device: " + cameraDevice, Camera2CameraImpl.this.n == null);
            int iOrdinal = Camera2CameraImpl.this.h.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                Preconditions.f(null, Camera2CameraImpl.this.q.isEmpty());
                Camera2CameraImpl.this.t();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.h);
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            int i = camera2CameraImpl.o;
            if (i == 0) {
                camera2CameraImpl.L(false);
            } else {
                camera2CameraImpl.v("Camera closed due to error: ".concat(Camera2CameraImpl.x(i)), null);
                b();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Camera2CameraImpl.this.v("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.n = cameraDevice;
            camera2CameraImpl.o = i;
            ErrorTimeoutReopenScheduler errorTimeoutReopenScheduler = camera2CameraImpl.L;
            Camera2CameraImpl.this.v("Camera receive onErrorCallback", null);
            errorTimeoutReopenScheduler.a();
            int iOrdinal = Camera2CameraImpl.this.h.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        String id = cameraDevice.getId();
                        String strX = Camera2CameraImpl.x(i);
                        String strName = Camera2CameraImpl.this.h.name();
                        StringBuilder sbV = YU.a.v("CameraDevice.onError(): ", id, " failed with ", strX, " while in ");
                        sbV.append(strName);
                        sbV.append(" state. Will attempt recovering from error.");
                        Logger.a("Camera2CameraImpl", sbV.toString());
                        InternalState internalState = InternalState.j;
                        Preconditions.f("Attempt to handle open error from non open state: " + Camera2CameraImpl.this.h, Camera2CameraImpl.this.h == InternalState.k || Camera2CameraImpl.this.h == InternalState.l || Camera2CameraImpl.this.h == InternalState.m || Camera2CameraImpl.this.h == internalState || Camera2CameraImpl.this.h == InternalState.i);
                        int i2 = 3;
                        if (i != 1 && i != 2 && i != 4) {
                            Logger.b("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.x(i) + " closing camera.");
                            Camera2CameraImpl.this.H(InternalState.h, CameraState.StateError.a(i == 3 ? 5 : 6), true);
                            Camera2CameraImpl.this.s();
                            return;
                        }
                        Logger.a("Camera2CameraImpl", YU.a.j("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", Camera2CameraImpl.x(i), "]"));
                        Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                        Preconditions.f("Can only reopen camera device after error if the camera device is actually in an error state.", camera2CameraImpl2.o != 0);
                        if (i == 1) {
                            i2 = 2;
                        } else if (i == 2) {
                            i2 = 1;
                        }
                        camera2CameraImpl2.H(internalState, CameraState.StateError.a(i2), true);
                        camera2CameraImpl2.s();
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.h);
                }
            }
            String id2 = cameraDevice.getId();
            String strX2 = Camera2CameraImpl.x(i);
            String strName2 = Camera2CameraImpl.this.h.name();
            StringBuilder sbV2 = YU.a.v("CameraDevice.onError(): ", id2, " failed with ", strX2, " while in ");
            sbV2.append(strName2);
            sbV2.append(" state. Will finish closing camera.");
            Logger.b("Camera2CameraImpl", sbV2.toString());
            Camera2CameraImpl.this.s();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.v("CameraDevice.onOpened()", null);
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.n = cameraDevice;
            camera2CameraImpl.o = 0;
            this.e.b = -1L;
            int iOrdinal = camera2CameraImpl.h.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                Preconditions.f(null, Camera2CameraImpl.this.q.isEmpty());
                Camera2CameraImpl.this.n.close();
                Camera2CameraImpl.this.n = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.h);
                }
                Camera2CameraImpl.this.G(InternalState.l);
                CameraStateRegistry cameraStateRegistry = Camera2CameraImpl.this.u;
                String id = cameraDevice.getId();
                Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                if (cameraStateRegistry.i(id, camera2CameraImpl2.t.a(camera2CameraImpl2.n.getId()))) {
                    Camera2CameraImpl.this.D();
                }
            }
        }
    }

    @AutoValue
    public static abstract class UseCaseInfo {
        public abstract List a();

        public abstract SessionConfig b();

        public abstract StreamSpec c();

        public abstract Size d();

        public abstract UseCaseConfig e();

        public abstract String f();

        public abstract Class g();
    }

    public Camera2CameraImpl(Context context, CameraManagerCompat cameraManagerCompat, String str, Camera2CameraInfoImpl camera2CameraInfoImpl, Camera2CameraCoordinator camera2CameraCoordinator, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler, DisplayInfoManager displayInfoManager, long j) throws CameraUnavailableException {
        LiveDataObservable liveDataObservable = new LiveDataObservable();
        this.i = liveDataObservable;
        this.o = 0;
        new AtomicInteger(0);
        this.q = new LinkedHashMap();
        this.r = 0;
        this.x = false;
        this.y = false;
        this.z = true;
        this.D = new HashSet();
        this.E = CameraConfigs.f473a;
        this.F = new Object();
        this.H = false;
        this.L = new ErrorTimeoutReopenScheduler();
        this.e = cameraManagerCompat;
        this.t = camera2CameraCoordinator;
        this.u = cameraStateRegistry;
        ScheduledExecutorService scheduledExecutorServiceE = CameraXExecutors.e(handler);
        this.g = scheduledExecutorServiceE;
        Executor executorF = CameraXExecutors.f(executor);
        this.f = executorF;
        this.l = new StateCallback(executorF, scheduledExecutorServiceE, j);
        this.d = new UseCaseAttachState(str);
        liveDataObservable.f491a.j(new LiveDataObservable.Result(CameraInternal.State.CLOSED));
        CameraStateMachine cameraStateMachine = new CameraStateMachine(cameraStateRegistry);
        this.j = cameraStateMachine;
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(executorF);
        this.B = captureSessionRepository;
        this.I = displayInfoManager;
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompatB = cameraManagerCompat.b(str);
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraCharacteristicsCompatB, scheduledExecutorServiceE, executorF, new ControlUpdateListenerInternal(), camera2CameraInfoImpl.j);
            this.k = camera2CameraControlImpl;
            this.m = camera2CameraInfoImpl;
            camera2CameraInfoImpl.p(camera2CameraControlImpl);
            camera2CameraInfoImpl.h.p(cameraStateMachine.b);
            this.J = DynamicRangesCompat.a(cameraCharacteristicsCompatB);
            this.p = B();
            this.C = new SynchronizedCaptureSession.OpenerBuilder(handler, captureSessionRepository, camera2CameraInfoImpl.j, DeviceQuirks.f327a, executorF, scheduledExecutorServiceE);
            this.v = camera2CameraInfoImpl.j.a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.w = camera2CameraInfoImpl.j.a(LegacyCameraSurfaceCleanupQuirk.class);
            CameraAvailability cameraAvailability = new CameraAvailability(str);
            this.s = cameraAvailability;
            cameraStateRegistry.f(this, executorF, new CameraConfigureAvailable(), cameraAvailability);
            cameraManagerCompat.f304a.a(executorF, cameraAvailability);
            this.K = new SupportedSurfaceCombination(context, str, cameraManagerCompat, new AnonymousClass1());
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static String x(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String y(MeteringRepeatingSession meteringRepeatingSession) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        meteringRepeatingSession.getClass();
        sb.append(meteringRepeatingSession.hashCode());
        return sb.toString();
    }

    public static String z(UseCase useCase) {
        return useCase.f() + useCase.hashCode();
    }

    public final boolean A() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.F) {
            try {
                i = this.t.b() == 2 ? 1 : 0;
            } finally {
            }
        }
        UseCaseAttachState useCaseAttachState = this.d;
        useCaseAttachState.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
            if (((UseCaseAttachState.UseCaseAttachInfo) entry.getValue()).e) {
                arrayList2.add((UseCaseAttachState.UseCaseAttachInfo) entry.getValue());
            }
        }
        for (UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo : Collections.unmodifiableCollection(arrayList2)) {
            List list = useCaseAttachInfo.d;
            if (list == null || list.get(0) != UseCaseConfigFactory.CaptureType.i) {
                if (useCaseAttachInfo.c == null || useCaseAttachInfo.d == null) {
                    Logger.e("Camera2CameraImpl", "Invalid stream spec or capture types in " + useCaseAttachInfo);
                    return false;
                }
                SessionConfig sessionConfig = useCaseAttachInfo.f506a;
                UseCaseConfig useCaseConfig = useCaseAttachInfo.b;
                for (DeferrableSurface deferrableSurface : sessionConfig.b()) {
                    SupportedSurfaceCombination supportedSurfaceCombination = this.K;
                    int iJ = useCaseConfig.j();
                    arrayList.add(AttachedSurfaceInfo.a(SurfaceConfig.g(i, iJ, deferrableSurface.h, supportedSurfaceCombination.i(iJ)), useCaseConfig.j(), deferrableSurface.h, useCaseAttachInfo.c.b(), useCaseAttachInfo.d, useCaseAttachInfo.c.d(), useCaseConfig.L(null)));
                }
            }
        }
        this.A.getClass();
        HashMap map = new HashMap();
        MeteringRepeatingSession meteringRepeatingSession = this.A;
        map.put(meteringRepeatingSession.c, Collections.singletonList(meteringRepeatingSession.d));
        try {
            this.K.g(i, arrayList, map, false, false);
            v("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e) {
            v("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    public final CaptureSessionInterface B() {
        synchronized (this.F) {
            try {
                if (this.G == null) {
                    return new CaptureSession(this.J, this.m.j, false);
                }
                return new ProcessingCaptureSession(this.G, this.m, this.J, this.f, this.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InternalState internalState = InternalState.k;
        if (!z) {
            this.l.e.b = -1L;
        }
        this.l.a();
        this.L.a();
        v("Opening camera.", null);
        G(internalState);
        try {
            this.e.f304a.b(this.m.f241a, this.f, u());
        } catch (CameraAccessExceptionCompat e) {
            v("Unable to open camera due to " + e.getMessage(), null);
            if (e.d == 10001) {
                H(InternalState.f, CameraState.StateError.b(7, e), true);
                return;
            }
            ErrorTimeoutReopenScheduler errorTimeoutReopenScheduler = this.L;
            if (Camera2CameraImpl.this.h != internalState) {
                Camera2CameraImpl.this.v("Don't need the onError timeout handler.", null);
                return;
            }
            Camera2CameraImpl.this.v("Camera waiting for onError.", null);
            errorTimeoutReopenScheduler.a();
            errorTimeoutReopenScheduler.f237a = errorTimeoutReopenScheduler.new ScheduleNode();
        } catch (SecurityException e2) {
            v("Unable to open camera due to " + e2.getMessage(), null);
            G(InternalState.j);
            this.l.b();
        }
    }

    public final void D() {
        Preconditions.f(null, this.h == InternalState.l);
        SessionConfig.ValidatingBuilder validatingBuilderA = this.d.a();
        if (!validatingBuilderA.k || !validatingBuilderA.j) {
            v("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.u.i(this.n.getId(), this.t.a(this.n.getId()))) {
            v("Unable to create capture session in camera operating mode = " + this.t.b(), null);
            return;
        }
        HashMap map = new HashMap();
        Collection<SessionConfig> collectionB = this.d.b();
        Collection collectionC = this.d.c();
        Config.Option option = StreamUseCaseUtil.f281a;
        ArrayList arrayList = new ArrayList(collectionC);
        Iterator it = collectionB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SessionConfig sessionConfig = (SessionConfig) it.next();
            if (sessionConfig.g.b.G.containsKey(option) && sessionConfig.b().size() != 1) {
                Logger.b("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(sessionConfig.b().size())));
                break;
            }
            if (sessionConfig.g.b.G.containsKey(option)) {
                int i = 0;
                for (SessionConfig sessionConfig2 : collectionB) {
                    if (((UseCaseConfig) arrayList.get(i)).Q() == UseCaseConfigFactory.CaptureType.i) {
                        Preconditions.f("MeteringRepeating should contain a surface", !sessionConfig2.b().isEmpty());
                        map.put((DeferrableSurface) sessionConfig2.b().get(0), 1L);
                    } else if (sessionConfig2.g.b.G.containsKey(option) && !sessionConfig2.b().isEmpty()) {
                        map.put((DeferrableSurface) sessionConfig2.b().get(0), (Long) sessionConfig2.g.b.a(option));
                    }
                    i++;
                }
            }
        }
        this.p.b(map);
        final CaptureSessionInterface captureSessionInterface = this.p;
        SessionConfig sessionConfigB = validatingBuilderA.b();
        CameraDevice cameraDevice = this.n;
        cameraDevice.getClass();
        SynchronizedCaptureSession.OpenerBuilder openerBuilder = this.C;
        Futures.a(captureSessionInterface.a(sessionConfigB, cameraDevice, new SynchronizedCaptureSessionImpl(openerBuilder.c, openerBuilder.d, openerBuilder.e, openerBuilder.f, openerBuilder.f283a, openerBuilder.b)), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.4
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                SessionConfig sessionConfig3 = null;
                if (!(th instanceof DeferrableSurface.SurfaceClosedException)) {
                    if (th instanceof CancellationException) {
                        Camera2CameraImpl.this.v("Unable to configure camera cancelled", null);
                        return;
                    }
                    InternalState internalState = Camera2CameraImpl.this.h;
                    InternalState internalState2 = InternalState.l;
                    if (internalState == internalState2) {
                        Camera2CameraImpl.this.H(internalState2, CameraState.StateError.b(4, th), true);
                    }
                    Logger.c("Camera2CameraImpl", "Unable to configure camera " + Camera2CameraImpl.this, th);
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.p == captureSessionInterface) {
                        camera2CameraImpl.F();
                        return;
                    }
                    return;
                }
                Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) th).d;
                Iterator it2 = camera2CameraImpl2.d.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SessionConfig sessionConfig4 = (SessionConfig) it2.next();
                    if (sessionConfig4.b().contains(deferrableSurface)) {
                        sessionConfig3 = sessionConfig4;
                        break;
                    }
                }
                if (sessionConfig3 != null) {
                    Camera2CameraImpl camera2CameraImpl3 = Camera2CameraImpl.this;
                    ScheduledExecutorService scheduledExecutorServiceD = CameraXExecutors.d();
                    SessionConfig.ErrorListener errorListener = sessionConfig3.f;
                    if (errorListener != null) {
                        camera2CameraImpl3.v("Posting surface closed", new Throwable());
                        scheduledExecutorServiceD.execute(new b(9, errorListener, sessionConfig3));
                    }
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                if (Camera2CameraImpl.this.t.b() == 2 && Camera2CameraImpl.this.h == InternalState.l) {
                    Camera2CameraImpl.this.G(InternalState.m);
                }
            }
        }, this.f);
    }

    public final void E() {
        if (this.A != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.A.getClass();
            sb.append(this.A.hashCode());
            String string = sb.toString();
            UseCaseAttachState useCaseAttachState = this.d;
            LinkedHashMap linkedHashMap = useCaseAttachState.b;
            if (linkedHashMap.containsKey(string)) {
                UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap.get(string);
                useCaseAttachInfo.e = false;
                if (!useCaseAttachInfo.f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.A.getClass();
            sb2.append(this.A.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = useCaseAttachState.b;
            if (linkedHashMap2.containsKey(string2)) {
                UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap2.get(string2);
                useCaseAttachInfo2.f = false;
                if (!useCaseAttachInfo2.e) {
                    linkedHashMap2.remove(string2);
                }
            }
            MeteringRepeatingSession meteringRepeatingSession = this.A;
            meteringRepeatingSession.getClass();
            Logger.a("MeteringRepeating", "MeteringRepeating clear!");
            ImmediateSurface immediateSurface = meteringRepeatingSession.f277a;
            if (immediateSurface != null) {
                immediateSurface.a();
            }
            meteringRepeatingSession.f277a = null;
            this.A = null;
        }
    }

    public final void F() {
        Preconditions.f(null, this.p != null);
        v("Resetting Capture Session", null);
        final CaptureSessionInterface captureSessionInterface = this.p;
        SessionConfig sessionConfigC = captureSessionInterface.c();
        List listH = captureSessionInterface.h();
        CaptureSessionInterface captureSessionInterfaceB = B();
        this.p = captureSessionInterfaceB;
        captureSessionInterfaceB.d(sessionConfigC);
        this.p.e(listH);
        if (this.h.ordinal() != 8) {
            v("Skipping Capture Session state check due to current camera state: " + this.h + " and previous session status: " + captureSessionInterface.f(), null);
        } else if (this.v && captureSessionInterface.f()) {
            v("Close camera before creating new session", null);
            G(InternalState.i);
        }
        if (this.w && captureSessionInterface.f()) {
            v("ConfigAndClose is required when close the camera.", null);
            this.x = true;
        }
        captureSessionInterface.close();
        ListenableFuture listenableFutureRelease = captureSessionInterface.release();
        v("Releasing session in state " + this.h.name(), null);
        this.q.put(captureSessionInterface, listenableFutureRelease);
        Futures.a(listenableFutureRelease, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                Camera2CameraImpl.this.q.remove(captureSessionInterface);
                int iOrdinal = Camera2CameraImpl.this.h.ordinal();
                if (iOrdinal != 1 && iOrdinal != 4) {
                    if (iOrdinal != 5 && (iOrdinal != 6 || Camera2CameraImpl.this.o == 0)) {
                        return;
                    } else {
                        Camera2CameraImpl.this.v("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    }
                }
                if (Camera2CameraImpl.this.q.isEmpty()) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.n != null) {
                        camera2CameraImpl.v("closing camera", null);
                        Camera2CameraImpl.this.n.close();
                        Camera2CameraImpl.this.n = null;
                    }
                }
            }
        }, CameraXExecutors.a());
    }

    public final void G(InternalState internalState) {
        H(internalState, null, true);
    }

    public final void H(InternalState internalState, CameraState.StateError stateError, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CameraInternal.State state;
        CameraState cameraStateB;
        v("Transitioning camera internal state: " + this.h + " --> " + internalState, null);
        if (Trace.d()) {
            Trace.e(internalState.ordinal(), "CX:C2State[" + this + "]");
            if (stateError != null) {
                this.r++;
            }
            if (this.r > 0) {
                Trace.e(stateError != null ? stateError.d() : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.h = internalState;
        switch (internalState.ordinal()) {
            case 0:
                state = CameraInternal.State.RELEASED;
                break;
            case 1:
                state = CameraInternal.State.RELEASING;
                break;
            case 2:
                state = CameraInternal.State.CLOSED;
                break;
            case 3:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 4:
            case 5:
                state = CameraInternal.State.CLOSING;
                break;
            case 6:
            case 7:
                state = CameraInternal.State.OPENING;
                break;
            case 8:
                state = CameraInternal.State.OPEN;
                break;
            case 9:
                state = CameraInternal.State.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.u.d(this, state, z);
        this.i.f491a.j(new LiveDataObservable.Result(state));
        CameraStateMachine cameraStateMachine = this.j;
        MutableLiveData mutableLiveData = cameraStateMachine.b;
        CameraState.Type type = CameraState.Type.e;
        switch (state) {
            case RELEASED:
            case CLOSED:
                cameraStateB = CameraState.b(CameraState.Type.h, stateError);
                break;
            case RELEASING:
            case CLOSING:
                cameraStateB = CameraState.b(CameraState.Type.g, stateError);
                break;
            case PENDING_OPEN:
                if (!cameraStateMachine.f260a.c()) {
                    cameraStateB = CameraState.a(CameraState.Type.d);
                    break;
                } else {
                    cameraStateB = CameraState.a(type);
                    break;
                }
            case OPENING:
                cameraStateB = CameraState.b(type, stateError);
                break;
            case OPEN:
            case CONFIGURED:
                cameraStateB = CameraState.b(CameraState.Type.f, stateError);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + state);
        }
        Logger.a("CameraStateMachine", "New public camera state " + cameraStateB + " from " + state + " and " + stateError);
        if (Objects.equals((CameraState) mutableLiveData.e(), cameraStateB)) {
            return;
        }
        Logger.a("CameraStateMachine", "Publishing new public camera state " + cameraStateB);
        mutableLiveData.j(cameraStateB);
    }

    public final ArrayList I(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            boolean z = this.z;
            String strZ = z(useCase);
            Class<?> cls = useCase.getClass();
            SessionConfig sessionConfig = z ? useCase.n : useCase.o;
            UseCaseConfig useCaseConfig = useCase.f;
            StreamSpec streamSpec = useCase.g;
            arrayList2.add(new AutoValue_Camera2CameraImpl_UseCaseInfo(strZ, cls, sessionConfig, useCaseConfig, streamSpec != null ? streamSpec.e() : null, useCase.g, useCase.b() != null ? StreamSharing.I(useCase) : null));
        }
        return arrayList2;
    }

    public final void J(ArrayList arrayList) {
        Size sizeD;
        boolean zIsEmpty = this.d.b().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UseCaseInfo useCaseInfo = (UseCaseInfo) it.next();
            if (!this.d.d(useCaseInfo.f())) {
                UseCaseAttachState useCaseAttachState = this.d;
                String strF = useCaseInfo.f();
                SessionConfig sessionConfigB = useCaseInfo.b();
                UseCaseConfig useCaseConfigE = useCaseInfo.e();
                StreamSpec streamSpecC = useCaseInfo.c();
                List listA = useCaseInfo.a();
                LinkedHashMap linkedHashMap = useCaseAttachState.b;
                UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap.get(strF);
                if (useCaseAttachInfo == null) {
                    useCaseAttachInfo = new UseCaseAttachState.UseCaseAttachInfo(sessionConfigB, useCaseConfigE, streamSpecC, listA);
                    linkedHashMap.put(strF, useCaseAttachInfo);
                }
                useCaseAttachInfo.e = true;
                useCaseAttachState.e(strF, sessionConfigB, useCaseConfigE, streamSpecC, listA);
                arrayList2.add(useCaseInfo.f());
                if (useCaseInfo.g() == Preview.class && (sizeD = useCaseInfo.d()) != null) {
                    rational = new Rational(sizeD.getWidth(), sizeD.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        v("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (zIsEmpty) {
            this.k.y(true);
            Camera2CameraControlImpl camera2CameraControlImpl = this.k;
            synchronized (camera2CameraControlImpl.d) {
                camera2CameraControlImpl.p++;
            }
        }
        r();
        N();
        M();
        F();
        InternalState internalState = this.h;
        InternalState internalState2 = InternalState.l;
        if (internalState == internalState2) {
            D();
        } else {
            int iOrdinal = this.h.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3) {
                K(false);
            } else if (iOrdinal != 4) {
                v("open() ignored due to being in state: " + this.h, null);
            } else {
                G(InternalState.j);
                if (!this.q.isEmpty() && !this.y && this.o == 0) {
                    Preconditions.f("Camera Device should be open if session close is not complete", this.n != null);
                    G(internalState2);
                    D();
                }
            }
        }
        if (rational != null) {
            this.k.h.e = rational;
        }
    }

    public final void K(boolean z) {
        v("Attempting to force open the camera.", null);
        if (this.u.h(this)) {
            C(z);
        } else {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            G(InternalState.g);
        }
    }

    public final void L(boolean z) {
        v("Attempting to open the camera.", null);
        if (this.s.b && this.u.h(this)) {
            C(z);
        } else {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            G(InternalState.g);
        }
    }

    public final void M() {
        UseCaseAttachState useCaseAttachState = this.d;
        useCaseAttachState.getClass();
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) entry.getValue();
            if (useCaseAttachInfo.f && useCaseAttachInfo.e) {
                String str = (String) entry.getKey();
                validatingBuilder.a(useCaseAttachInfo.f506a);
                arrayList.add(str);
            }
        }
        Logger.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + useCaseAttachState.f505a);
        boolean z = validatingBuilder.k;
        Camera2CameraControlImpl camera2CameraControlImpl = this.k;
        if (!z || !validatingBuilder.j) {
            camera2CameraControlImpl.x = 1;
            camera2CameraControlImpl.h.n = 1;
            camera2CameraControlImpl.n.h = 1;
            this.p.d(camera2CameraControlImpl.s());
            return;
        }
        int i = validatingBuilder.b().g.c;
        camera2CameraControlImpl.x = i;
        camera2CameraControlImpl.h.n = i;
        camera2CameraControlImpl.n.h = i;
        validatingBuilder.a(camera2CameraControlImpl.s());
        this.p.d(validatingBuilder.b());
    }

    public final void N() {
        Iterator it = this.d.c().iterator();
        boolean zR = false;
        while (it.hasNext()) {
            zR |= ((UseCaseConfig) it.next()).r();
        }
        this.k.l.c = zR;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void c(UseCase useCase) {
        this.f.execute(new i(this, z(useCase), this.z ? useCase.n : useCase.o, useCase.f, useCase.g, useCase.b() == null ? null : StreamSharing.I(useCase), 1));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal d() {
        return this.m;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void f(CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.f473a;
        }
        SessionProcessor sessionProcessorK = cameraConfig.K();
        this.E = cameraConfig;
        synchronized (this.F) {
            this.G = sessionProcessorK;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable g() {
        return this.i;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(I(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            String strZ = z(useCase);
            HashSet hashSet = this.D;
            if (hashSet.contains(strZ)) {
                useCase.v();
                hashSet.remove(strZ);
            }
        }
        this.f.execute(new n(this, arrayList3, 1));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void i(boolean z) {
        this.z = z;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void j(UseCase useCase) {
        this.f.execute(new i(this, z(useCase), this.z ? useCase.n : useCase.o, useCase.f, useCase.g, useCase.b() == null ? null : StreamSharing.I(useCase), 2));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal k() {
        return this.k;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraConfig l() {
        return this.E;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void m(final boolean z) {
        this.f.execute(new Runnable() { // from class: androidx.camera.camera2.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = this.d;
                boolean z2 = z;
                camera2CameraImpl.H = z2;
                if (z2 && camera2CameraImpl.h == Camera2CameraImpl.InternalState.g) {
                    camera2CameraImpl.K(false);
                }
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void n(UseCase useCase) {
        this.f.execute(new i(this, z(useCase), this.z ? useCase.n : useCase.o, useCase.f, useCase.g, useCase.b() == null ? null : StreamSharing.I(useCase), 0));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void o(ArrayList arrayList) {
        Camera2CameraControlImpl camera2CameraControlImpl = this.k;
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        synchronized (camera2CameraControlImpl.d) {
            camera2CameraControlImpl.p++;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet = this.D;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            String strZ = z(useCase);
            if (!hashSet.contains(strZ)) {
                hashSet.add(strZ);
                useCase.u();
                useCase.s();
            }
        }
        try {
            this.f.execute(new n(this, new ArrayList(I(arrayList2)), 0));
        } catch (RejectedExecutionException e) {
            v("Unable to attach use cases.", e);
            camera2CameraControlImpl.q();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void q(UseCase useCase) {
        this.f.execute(new b(3, this, z(useCase)));
    }

    public final void r() {
        UseCaseAttachState useCaseAttachState = this.d;
        SessionConfig sessionConfigB = useCaseAttachState.a().b();
        CaptureConfig captureConfig = sessionConfigB.g;
        int size = Collections.unmodifiableList(captureConfig.f482a).size();
        int size2 = sessionConfigB.b().size();
        if (sessionConfigB.b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(captureConfig.f482a).isEmpty()) {
            if (size2 == 1 && size == 1) {
                E();
                return;
            }
            if (size >= 2) {
                E();
                return;
            }
            if (this.A != null && !A()) {
                E();
                return;
            }
            Logger.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            return;
        }
        if (this.A == null) {
            this.A = new MeteringRepeatingSession(this.m.b, this.I, new k(this, 1));
        }
        if (!A()) {
            Logger.b("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        MeteringRepeatingSession meteringRepeatingSession = this.A;
        if (meteringRepeatingSession != null) {
            String strY = y(meteringRepeatingSession);
            MeteringRepeatingSession meteringRepeatingSession2 = this.A;
            SessionConfig sessionConfig = meteringRepeatingSession2.b;
            MeteringRepeatingSession.MeteringRepeatingConfig meteringRepeatingConfig = meteringRepeatingSession2.c;
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.i;
            List listSingletonList = Collections.singletonList(captureType);
            LinkedHashMap linkedHashMap = useCaseAttachState.b;
            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap.get(strY);
            if (useCaseAttachInfo == null) {
                useCaseAttachInfo = new UseCaseAttachState.UseCaseAttachInfo(sessionConfig, meteringRepeatingConfig, null, listSingletonList);
                linkedHashMap.put(strY, useCaseAttachInfo);
            }
            useCaseAttachInfo.e = true;
            useCaseAttachState.e(strY, sessionConfig, meteringRepeatingConfig, null, listSingletonList);
            MeteringRepeatingSession meteringRepeatingSession3 = this.A;
            SessionConfig sessionConfig2 = meteringRepeatingSession3.b;
            MeteringRepeatingSession.MeteringRepeatingConfig meteringRepeatingConfig2 = meteringRepeatingSession3.c;
            List listSingletonList2 = Collections.singletonList(captureType);
            LinkedHashMap linkedHashMap2 = useCaseAttachState.b;
            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = (UseCaseAttachState.UseCaseAttachInfo) linkedHashMap2.get(strY);
            if (useCaseAttachInfo2 == null) {
                useCaseAttachInfo2 = new UseCaseAttachState.UseCaseAttachInfo(sessionConfig2, meteringRepeatingConfig2, null, listSingletonList2);
                linkedHashMap2.put(strY, useCaseAttachInfo2);
            }
            useCaseAttachInfo2.f = true;
        }
    }

    public final void s() {
        Preconditions.f("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.h + " (error: " + x(this.o) + ")", this.h == InternalState.h || this.h == InternalState.e || (this.h == InternalState.j && this.o != 0));
        F();
        this.p.g();
    }

    public final void t() {
        Preconditions.f(null, this.h == InternalState.e || this.h == InternalState.h);
        Preconditions.f(null, this.q.isEmpty());
        if (!this.x) {
            w();
            return;
        }
        if (this.y) {
            v("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.s.b) {
            this.x = false;
            w();
            v("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            v("Open camera to configAndClose", null);
            ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new k(this, 0));
            this.y = true;
            listenableFutureA.addListener(new m(this, 0), this.f);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.m.f241a);
    }

    public final CameraDevice.StateCallback u() {
        ArrayList arrayList = new ArrayList(this.d.a().b().c);
        arrayList.add(this.B.f);
        arrayList.add(this.l);
        return CameraDeviceStateCallbacks.a(arrayList);
    }

    public final void v(String str, Throwable th) {
        String strI = YU.a.i("{", toString(), "} ", str);
        if (Logger.d(3, "Camera2CameraImpl")) {
            Log.d("Camera2CameraImpl", strI, th);
        }
    }

    public final void w() {
        InternalState internalState = InternalState.h;
        Preconditions.f(null, this.h == InternalState.e || this.h == internalState);
        Preconditions.f(null, this.q.isEmpty());
        this.n = null;
        if (this.h == internalState) {
            G(InternalState.f);
            return;
        }
        this.e.f304a.f(this.s);
        G(InternalState.d);
    }
}
