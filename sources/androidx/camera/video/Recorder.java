package androidx.camera.video;

import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.AutoValue_MediaSpec;
import androidx.camera.video.AutoValue_VideoSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Recorder implements VideoOutput {
    public static final Set C = Collections.unmodifiableSet(EnumSet.of(State.e, State.f));
    public static final Set D = Collections.unmodifiableSet(EnumSet.of(State.d, State.g, State.j, State.i, State.k));
    public static final QualitySelector E;
    public static final VideoSpec F;
    public static final MediaSpec G;
    public static final androidx.camera.core.internal.a H;
    public static final Executor I;
    public static final int J;
    public static final long K;
    public VideoEncoderSession A;
    public SetupVideoTask B;

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateObservable f589a;
    public final MutableStateObservable b;
    public final Executor c;
    public final Executor d;
    public final EncoderFactory e;
    public final EncoderFactory f;
    public final Object g = new Object();
    public final boolean h;
    public State i;
    public State j;
    public int k;
    public boolean l;
    public VideoValidatedEncoderProfilesProxy m;
    public final ArrayList n;
    public SurfaceRequest o;
    public Timebase p;
    public Surface q;
    public Surface r;
    public final MutableStateObservable s;
    public Encoder t;
    public AudioState u;
    public EncodedData v;
    public final ArrayRingBuffer w;
    public VideoOutput.SourceState x;
    public ScheduledFuture y;
    public VideoEncoderSession z;

    /* renamed from: androidx.camera.video.Recorder$2, reason: invalid class name */
    class AnonymousClass2 implements FutureCallback<Void> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* renamed from: androidx.camera.video.Recorder$4, reason: invalid class name */
    class AnonymousClass4 implements AudioSource.AudioSourceCallback {
    }

    /* renamed from: androidx.camera.video.Recorder$5, reason: invalid class name */
    class AnonymousClass5 implements EncoderCallback {
        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void a(EncodeException encodeException) {
            throw null;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void b(androidx.camera.core.internal.a aVar) {
            throw null;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void c() {
            throw null;
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void d(EncodedData encodedData) {
            throw null;
        }
    }

    /* renamed from: androidx.camera.video.Recorder$7, reason: invalid class name */
    class AnonymousClass7 implements Observable.Observer<Boolean> {
        @Override // androidx.camera.core.impl.Observable.Observer
        public final void a(Object obj) {
            throw null;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AudioState {
        public static final AudioState d;
        public static final AudioState e;
        public static final /* synthetic */ AudioState[] f;

        static {
            AudioState audioState = new AudioState("INITIALIZING", 0);
            d = audioState;
            AudioState audioState2 = new AudioState("IDLING", 1);
            AudioState audioState3 = new AudioState("DISABLED", 2);
            AudioState audioState4 = new AudioState("ENABLED", 3);
            e = audioState4;
            f = new AudioState[]{audioState, audioState2, audioState3, audioState4, new AudioState("ERROR_ENCODER", 4), new AudioState("ERROR_SOURCE", 5)};
        }

        public static AudioState valueOf(String str) {
            return (AudioState) Enum.valueOf(AudioState.class, str);
        }

        public static AudioState[] values() {
            return (AudioState[]) f.clone();
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSpec.Builder f592a;
        public final androidx.camera.core.internal.a b;
        public final androidx.camera.core.internal.a c;

        public Builder() {
            androidx.camera.core.internal.a aVar = Recorder.H;
            this.b = aVar;
            this.c = aVar;
            this.f592a = MediaSpec.a();
        }
    }

    @AutoValue
    public static abstract class RecordingRecord implements AutoCloseable {

        /* renamed from: androidx.camera.video.Recorder$RecordingRecord$1, reason: invalid class name */
        class AnonymousClass1 implements AudioSourceSupplier {
        }

        /* renamed from: androidx.camera.video.Recorder$RecordingRecord$2, reason: invalid class name */
        class AnonymousClass2 implements AudioSourceSupplier {
        }

        public interface AudioSourceSupplier {
        }

        public interface MediaMuxerSupplier {
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            Uri uri = Uri.EMPTY;
            throw null;
        }

        public final void finalize() throws Throwable {
            try {
                throw null;
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    public class SetupVideoTask {

        /* renamed from: a, reason: collision with root package name */
        public final SurfaceRequest f593a;
        public final Timebase b;
        public final int c;
        public boolean d = false;
        public int e = 0;
        public ScheduledFuture f = null;

        /* renamed from: androidx.camera.video.Recorder$SetupVideoTask$1, reason: invalid class name */
        class AnonymousClass1 implements FutureCallback<Encoder> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ VideoEncoderSession f594a;

            public AnonymousClass1(VideoEncoderSession videoEncoderSession) {
                this.f594a = videoEncoderSession;
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                Logger.f("Recorder", "VideoEncoder Setup error: " + th, th);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                int i = setupVideoTask.e;
                if (i < setupVideoTask.c) {
                    setupVideoTask.e = i + 1;
                    e eVar = new e(this, 0);
                    setupVideoTask.f = CameraXExecutors.d().schedule(new c(3, Recorder.this.d, eVar), Recorder.K, TimeUnit.MILLISECONDS);
                    return;
                }
                Recorder recorder = Recorder.this;
                synchronized (recorder.g) {
                    try {
                        switch (recorder.i.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                                recorder.r(-1);
                                recorder.q(State.k);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + recorder.i + ": " + th);
                        }
                    } finally {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:19:0x0083, B:20:0x0089, B:55:0x0116, B:22:0x008e, B:25:0x009a, B:28:0x00a0, B:29:0x00a7, B:32:0x00ab, B:33:0x00b2, B:34:0x00c5, B:37:0x00c9, B:39:0x00cf, B:41:0x00d9, B:42:0x00df, B:43:0x00f4, B:44:0x00f5, B:46:0x00fb, B:49:0x0100, B:50:0x0107, B:51:0x0108, B:52:0x010f, B:53:0x0110), top: B:69:0x0083 }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00f5 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:19:0x0083, B:20:0x0089, B:55:0x0116, B:22:0x008e, B:25:0x009a, B:28:0x00a0, B:29:0x00a7, B:32:0x00ab, B:33:0x00b2, B:34:0x00c5, B:37:0x00c9, B:39:0x00cf, B:41:0x00d9, B:42:0x00df, B:43:0x00f4, B:44:0x00f5, B:46:0x00fb, B:49:0x0100, B:50:0x0107, B:51:0x0108, B:52:0x010f, B:53:0x0110), top: B:69:0x0083 }] */
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onSuccess(java.lang.Object r8) {
                /*
                    Method dump skipped, instructions count: 372
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.SetupVideoTask.AnonymousClass1.onSuccess(java.lang.Object):void");
            }
        }

        public SetupVideoTask(SurfaceRequest surfaceRequest, Timebase timebase, int i) {
            this.f593a = surfaceRequest;
            this.b = timebase;
            this.c = i;
        }
    }

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
            State state = new State("CONFIGURING", 0);
            d = state;
            State state2 = new State("PENDING_RECORDING", 1);
            e = state2;
            State state3 = new State("PENDING_PAUSED", 2);
            f = state3;
            State state4 = new State("IDLING", 3);
            g = state4;
            State state5 = new State("RECORDING", 4);
            h = state5;
            State state6 = new State("PAUSED", 5);
            State state7 = new State("STOPPING", 6);
            i = state7;
            State state8 = new State("RESETTING", 7);
            j = state8;
            State state9 = new State("ERROR", 8);
            k = state9;
            l = new State[]{state, state2, state3, state4, state5, state6, state7, state8, state9};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) l.clone();
        }
    }

    static {
        Quality quality = Quality.c;
        QualitySelector qualitySelectorA = QualitySelector.a(Arrays.asList(quality, Quality.b, Quality.f586a), new AutoValue_FallbackStrategy_RuleStrategy(quality, 1));
        E = qualitySelectorA;
        VideoSpec.Builder builderA = VideoSpec.a();
        ((AutoValue_VideoSpec.Builder) builderA).f583a = qualitySelectorA;
        builderA.b(-1);
        VideoSpec videoSpecA = builderA.a();
        F = videoSpecA;
        AutoValue_MediaSpec.Builder builder = (AutoValue_MediaSpec.Builder) MediaSpec.a();
        builder.c = -1;
        builder.f581a = videoSpecA;
        G = builder.a();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        H = new androidx.camera.core.internal.a(2);
        I = CameraXExecutors.f(CameraXExecutors.c());
        J = 3;
        K = 1000L;
    }

    public Recorder(MediaSpec mediaSpec, EncoderFactory encoderFactory, EncoderFactory encoderFactory2) {
        this.h = DeviceQuirks.f614a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.i = State.d;
        this.j = null;
        this.k = 0;
        this.l = false;
        this.m = null;
        this.n = new ArrayList();
        this.q = null;
        this.r = null;
        this.t = null;
        this.u = AudioState.d;
        Uri uri = Uri.EMPTY;
        this.v = null;
        this.w = new ArrayRingBuffer(60, null);
        this.x = VideoOutput.SourceState.f;
        this.y = null;
        this.A = null;
        this.B = null;
        Executor executorC = CameraXExecutors.c();
        this.c = executorC;
        Executor executorF = CameraXExecutors.f(executorC);
        this.d = executorF;
        MediaSpec.Builder builderE = mediaSpec.e();
        if (mediaSpec.d().b() == -1) {
            VideoSpec.Builder builderF = builderE.b().f();
            builderF.b(F.b());
            ((AutoValue_MediaSpec.Builder) builderE).f581a = builderF.a();
        }
        this.s = new MutableStateObservable(builderE.a());
        int i = this.k;
        StreamInfo.StreamState streamStateJ = j(this.i);
        StreamInfo streamInfo = StreamInfo.f595a;
        this.f589a = new MutableStateObservable(new AutoValue_StreamInfo(i, streamStateJ));
        this.b = new MutableStateObservable(Boolean.FALSE);
        this.e = encoderFactory;
        this.f = encoderFactory2;
        this.z = new VideoEncoderSession(encoderFactory, executorF, executorC);
    }

    public static Object i(StateObservable stateObservable) {
        try {
            return stateObservable.b().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public static StreamInfo.StreamState j(State state) {
        return (state == State.h || (state == State.i && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.f614a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo.StreamState.d : StreamInfo.StreamState.e;
    }

    public static void k(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            EncoderImpl encoderImpl = (EncoderImpl) encoder;
            encoderImpl.h.execute(new androidx.camera.video.internal.encoder.c(encoderImpl, 5));
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public final void a(SurfaceRequest surfaceRequest) {
        b(surfaceRequest, Timebase.d);
    }

    @Override // androidx.camera.video.VideoOutput
    public final void b(SurfaceRequest surfaceRequest, Timebase timebase) {
        synchronized (this.g) {
            try {
                Logger.a("Recorder", "Surface is requested in state: " + this.i + ", Current surface: " + this.k);
                if (this.i == State.k) {
                    q(State.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.execute(new d(1, this, surfaceRequest, timebase));
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable c() {
        return this.s;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable d() {
        return this.f589a;
    }

    @Override // androidx.camera.video.VideoOutput
    public final void e(VideoOutput.SourceState sourceState) {
        this.d.execute(new c(0, this, sourceState));
    }

    @Override // androidx.camera.video.VideoOutput
    public final VideoCapabilities f(CameraInfo cameraInfo) {
        return new RecorderVideoCapabilities((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable g() {
        return this.b;
    }

    public final void h(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        Object value;
        Quality quality;
        if (surfaceRequest.g.isDone()) {
            Logger.e("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        androidx.camera.core.internal.a aVar = new androidx.camera.core.internal.a(this, 1);
        Executor executor = this.d;
        surfaceRequest.b(executor, aVar);
        Size size = surfaceRequest.b;
        DynamicRange dynamicRange = surfaceRequest.c;
        RecorderVideoCapabilities recorderVideoCapabilities = new RecorderVideoCapabilities((CameraInfoInternal) surfaceRequest.e.b());
        CapabilitiesByQuality capabilitiesByQualityD = recorderVideoCapabilities.d(dynamicRange);
        if (capabilitiesByQualityD == null) {
            quality = Quality.g;
        } else {
            TreeMap treeMap = capabilitiesByQualityD.b;
            Size size2 = SizeUtil.f543a;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            quality = (Quality) value;
            if (quality == null) {
                quality = Quality.g;
            }
        }
        Logger.a("Recorder", "Using supported quality of " + quality + " for surface size " + size);
        if (quality != Quality.g) {
            CapabilitiesByQuality capabilitiesByQualityD2 = recorderVideoCapabilities.d(dynamicRange);
            VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyA = capabilitiesByQualityD2 == null ? null : capabilitiesByQualityD2.a(quality);
            this.m = videoValidatedEncoderProfilesProxyA;
            if (videoValidatedEncoderProfilesProxyA == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        SetupVideoTask setupVideoTask = this.B;
        int i = 0;
        if (setupVideoTask != null && !setupVideoTask.d) {
            setupVideoTask.d = true;
            ScheduledFuture scheduledFuture = setupVideoTask.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                setupVideoTask.f = null;
            }
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(surfaceRequest, timebase, z ? J : 0);
        this.B = setupVideoTask2;
        o().addListener(new d(i, setupVideoTask2, surfaceRequest, timebase), executor);
    }

    public final void l(IOException iOException, int i) throws Exception {
        boolean z;
        synchronized (this.g) {
            try {
                z = false;
                switch (this.i.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.i);
                    case 4:
                    case 5:
                        q(State.i);
                        z = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            s(-1L, i, iOException);
        }
    }

    public final void m(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.g) {
            try {
                z2 = true;
                z3 = false;
                switch (this.i.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        t(State.j);
                        break;
                    case 4:
                    case 5:
                        Preconditions.f("In-progress recording shouldn't be null when in state " + this.i, false);
                        q(State.j);
                        z3 = true;
                        z2 = false;
                        break;
                    case 6:
                        q(State.j);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                s(-1L, 4, null);
            }
        } else {
            if (z) {
                n();
                return;
            }
            AudioState audioState = AudioState.d;
            Logger.a("Recorder", "Transitioning audio state: " + this.u + " --> " + audioState);
            this.u = audioState;
            n();
        }
    }

    public final void n() {
        if (this.t != null) {
            Logger.a("Recorder", "Releasing video encoder.");
            VideoEncoderSession videoEncoderSession = this.A;
            if (videoEncoderSession != null) {
                Preconditions.f(null, videoEncoderSession.d == this.t);
                Logger.a("Recorder", "Releasing video encoder: " + this.t);
                this.A.b();
                this.A = null;
                this.t = null;
                p(null);
            } else {
                o();
            }
        }
        synchronized (this.g) {
            try {
                switch (this.i.ordinal()) {
                    case 1:
                    case 2:
                        t(State.d);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        q(State.d);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SurfaceRequest surfaceRequest = this.o;
        if (surfaceRequest == null || surfaceRequest.g.isDone()) {
            return;
        }
        h(this.o, this.p, false);
    }

    public final ListenableFuture o() {
        Logger.a("Recorder", "Try to safely release video encoder: " + this.t);
        VideoEncoderSession videoEncoderSession = this.z;
        videoEncoderSession.a();
        return Futures.h(videoEncoderSession.j);
    }

    public final void p(Surface surface) {
        int iHashCode;
        if (this.q == surface) {
            return;
        }
        this.q = surface;
        synchronized (this.g) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            r(iHashCode);
        }
    }

    public final void q(State state) {
        if (this.i == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.a("Recorder", "Transitioning Recorder internal state: " + this.i + " --> " + state);
        Set set = C;
        StreamInfo.StreamState streamStateJ = null;
        if (set.contains(state)) {
            if (!set.contains(this.i)) {
                if (!D.contains(this.i)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.i);
                }
                State state2 = this.i;
                this.j = state2;
                streamStateJ = j(state2);
            }
        } else if (this.j != null) {
            this.j = null;
        }
        this.i = state;
        if (streamStateJ == null) {
            streamStateJ = j(state);
        }
        int i = this.k;
        StreamInfo streamInfo = StreamInfo.f595a;
        this.f589a.e(new AutoValue_StreamInfo(i, streamStateJ));
    }

    public final void r(int i) {
        if (this.k == i) {
            return;
        }
        Logger.a("Recorder", "Transitioning streamId: " + this.k + " --> " + i);
        this.k = i;
        StreamInfo.StreamState streamStateJ = j(this.i);
        StreamInfo streamInfo = StreamInfo.f595a;
        this.f589a.e(new AutoValue_StreamInfo(i, streamStateJ));
    }

    public final void s(long j, int i, Throwable th) throws Exception {
        if (this.l) {
            return;
        }
        this.l = true;
        if (this.u != AudioState.e) {
            EncodedData encodedData = this.v;
            if (encodedData != null) {
                encodedData.close();
                this.v = null;
            }
            if (this.x != VideoOutput.SourceState.e) {
                e eVar = new e(this.t, 2);
                this.y = CameraXExecutors.d().schedule(new c(3, this.d, eVar), 1000L, TimeUnit.MILLISECONDS);
            } else {
                k(this.t);
            }
            this.t.b(j);
            return;
        }
        while (true) {
            ArrayRingBuffer arrayRingBuffer = this.w;
            if (arrayRingBuffer.b()) {
                throw null;
            }
            arrayRingBuffer.a();
        }
    }

    public final void t(State state) {
        if (!C.contains(this.i)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.i);
        }
        if (!D.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        if (this.j != state) {
            this.j = state;
            int i = this.k;
            StreamInfo.StreamState streamStateJ = j(state);
            StreamInfo streamInfo = StreamInfo.f595a;
            this.f589a.e(new AutoValue_StreamInfo(i, streamStateJ));
        }
    }
}
