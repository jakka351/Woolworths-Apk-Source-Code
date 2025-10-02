package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.VideoTimebaseConverter;
import androidx.camera.video.l;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class EncoderImpl implements Encoder {
    public static final Range E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public ScheduledFuture D;

    /* renamed from: a, reason: collision with root package name */
    public final String f625a;
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final Encoder.EncoderInput f;
    public final EncoderInfoImpl g;
    public final Executor h;
    public final ListenableFuture i;
    public final CallbackToFutureAdapter.Completer j;
    public final Timebase p;
    public InternalState t;
    public final Object b = new Object();
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final SystemTimeProvider q = new SystemTimeProvider();
    public EncoderCallback r = EncoderCallback.f624a;
    public Executor s = CameraXExecutors.a();
    public Range u = E;
    public long v = 0;
    public boolean w = false;
    public Long x = null;
    public ScheduledFuture y = null;
    public MediaCodecCallback z = null;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;

    @RequiresApi
    public static class Api23Impl {
    }

    public class ByteBufferInput implements Encoder.ByteBufferInput {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f628a = new LinkedHashMap();
        public BufferProvider.State b = BufferProvider.State.e;
        public final ArrayList c = new ArrayList();

        public ByteBufferInput() {
        }

        @Override // androidx.camera.core.impl.Observable
        public final ListenableFuture b() {
            return CallbackToFutureAdapter.a(new a(this, 4));
        }

        @Override // androidx.camera.core.impl.Observable
        public final void c(Executor executor, Observable.Observer observer) {
            EncoderImpl.this.h.execute(new e(1, this, observer, executor));
        }

        @Override // androidx.camera.core.impl.Observable
        public final void d(Observable.Observer observer) {
            EncoderImpl.this.h.execute(new d(3, this, observer));
        }

        public final void e(boolean z) {
            BufferProvider.State state = BufferProvider.State.e;
            BufferProvider.State state2 = z ? BufferProvider.State.d : state;
            if (this.b == state2) {
                return;
            }
            this.b = state2;
            if (state2 == state) {
                ArrayList arrayList = this.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.f628a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new d(8, entry, state2));
                } catch (RejectedExecutionException e) {
                    Logger.c(EncoderImpl.this.f625a, "Unable to post to the supplied executor.", e);
                }
            }
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
        public static final /* synthetic */ InternalState[] m;

        static {
            InternalState internalState = new InternalState("CONFIGURED", 0);
            d = internalState;
            InternalState internalState2 = new InternalState("STARTED", 1);
            e = internalState2;
            InternalState internalState3 = new InternalState("PAUSED", 2);
            f = internalState3;
            InternalState internalState4 = new InternalState("STOPPING", 3);
            g = internalState4;
            InternalState internalState5 = new InternalState("PENDING_START", 4);
            h = internalState5;
            InternalState internalState6 = new InternalState("PENDING_START_PAUSED", 5);
            i = internalState6;
            InternalState internalState7 = new InternalState("PENDING_RELEASE", 6);
            j = internalState7;
            InternalState internalState8 = new InternalState("ERROR", 7);
            k = internalState8;
            InternalState internalState9 = new InternalState("RELEASED", 8);
            l = internalState9;
            m = new InternalState[]{internalState, internalState2, internalState3, internalState4, internalState5, internalState6, internalState7, internalState8, internalState9};
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) m.clone();
        }
    }

    public class MediaCodecCallback extends MediaCodec.Callback {
        public static final /* synthetic */ int l = 0;

        /* renamed from: a, reason: collision with root package name */
        public final VideoTimebaseConverter f629a;
        public final boolean b;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public long f = 0;
        public long g = 0;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;

        public MediaCodecCallback() {
            this.b = true;
            if (EncoderImpl.this.c) {
                this.f629a = new VideoTimebaseConverter(EncoderImpl.this.q, EncoderImpl.this.p, (CameraUseInconsistentTimebaseQuirk) DeviceQuirks.f614a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f629a = null;
            }
            if (((CodecStuckOnFlushQuirk) DeviceQuirks.f614a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(EncoderImpl.this.d.getString("mime"))) {
                return;
            }
            this.b = false;
        }

        public final void a() {
            EncoderImpl encoderImpl;
            EncoderCallback encoderCallback;
            Executor executor;
            if (this.e) {
                return;
            }
            this.e = true;
            ScheduledFuture scheduledFuture = EncoderImpl.this.D;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                EncoderImpl.this.D = null;
            }
            synchronized (EncoderImpl.this.b) {
                encoderImpl = EncoderImpl.this;
                encoderCallback = encoderImpl.r;
                executor = encoderImpl.s;
            }
            encoderImpl.o(new e(2, this, executor, encoderCallback));
        }

        public final void b(final EncodedDataImpl encodedDataImpl, EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            encoderImpl.n.add(encodedDataImpl);
            Futures.a(Futures.h(encodedDataImpl.g), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onFailure(Throwable th) {
                    EncoderImpl encoderImpl2 = EncoderImpl.this;
                    encoderImpl2.n.remove(encodedDataImpl);
                    if (!(th instanceof MediaCodec.CodecException)) {
                        encoderImpl2.g(0, th.getMessage(), th);
                    } else {
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                        encoderImpl2.g(1, codecException.getMessage(), codecException);
                    }
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public final void onSuccess(Object obj) {
                    EncoderImpl.this.n.remove(encodedDataImpl);
                }
            }, encoderImpl.h);
            try {
                executor.execute(new d(6, encoderCallback, encodedDataImpl));
            } catch (RejectedExecutionException e) {
                Logger.c(encoderImpl.f625a, "Unable to post to the supplied executor.", e);
                encodedDataImpl.close();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            EncoderImpl.this.h.execute(new d(this, codecException, 4));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            EncoderImpl.this.h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.g
                @Override // java.lang.Runnable
                public final void run() throws MediaCodec.CryptoException {
                    EncoderImpl.MediaCodecCallback mediaCodecCallback = this.d;
                    EncoderImpl encoderImpl = EncoderImpl.this;
                    if (mediaCodecCallback.j) {
                        Logger.e(encoderImpl.f625a, "Receives input frame after codec is reset.");
                        return;
                    }
                    switch (encoderImpl.t.ordinal()) {
                        case 0:
                        case 7:
                        case 8:
                            return;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            encoderImpl.k.offer(Integer.valueOf(i));
                            encoderImpl.h();
                            return;
                        default:
                            throw new IllegalStateException("Unknown state: " + encoderImpl.t);
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.h.execute(new h(this, bufferInfo, mediaCodec, i));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            EncoderImpl.this.h.execute(new d(this, mediaFormat, 5));
        }
    }

    public class SurfaceInput implements Encoder.SurfaceInput {
        public Surface b;
        public l d;
        public Executor e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f631a = new Object();
        public final HashSet c = new HashSet();

        public SurfaceInput() {
        }

        @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput
        public final void a(Executor executor, l lVar) {
            Surface surface;
            synchronized (this.f631a) {
                this.d = lVar;
                executor.getClass();
                this.e = executor;
                surface = this.b;
            }
            if (surface != null) {
                try {
                    executor.execute(new d(10, lVar, surface));
                } catch (RejectedExecutionException e) {
                    Logger.c(EncoderImpl.this.f625a, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    public EncoderImpl(Executor executor, EncoderConfig encoderConfig) throws InvalidConfigException, IOException {
        executor.getClass();
        encoderConfig.getClass();
        LruCache lruCache = CodecUtil.f636a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(encoderConfig.a());
            this.e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.h = CameraXExecutors.f(executor);
            MediaFormat mediaFormatC = encoderConfig.c();
            this.d = mediaFormatC;
            Timebase timebaseB = encoderConfig.b();
            this.p = timebaseB;
            if (encoderConfig instanceof AudioEncoderConfig) {
                this.f625a = "AudioEncoder";
                this.c = false;
                this.f = new ByteBufferInput();
                AudioEncoderInfoImpl audioEncoderInfoImpl = new AudioEncoderInfoImpl(codecInfo, encoderConfig.a());
                Objects.requireNonNull(audioEncoderInfoImpl.f632a.getAudioCapabilities());
                this.g = audioEncoderInfoImpl;
            } else {
                if (!(encoderConfig instanceof VideoEncoderConfig)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                this.f625a = "VideoEncoder";
                this.c = true;
                this.f = new SurfaceInput();
                VideoEncoderInfoImpl videoEncoderInfoImpl = new VideoEncoderInfoImpl(codecInfo, encoderConfig.a());
                if (mediaFormatC.containsKey("bitrate")) {
                    int integer = mediaFormatC.getInteger("bitrate");
                    int iIntValue = ((Integer) videoEncoderInfoImpl.b.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatC.setInteger("bitrate", iIntValue);
                        Logger.a("VideoEncoder", "updated bitrate from " + integer + " to " + iIntValue);
                    }
                }
                this.g = videoEncoderInfoImpl;
            }
            Logger.a(this.f625a, "mInputTimebase = " + timebaseB);
            Logger.a(this.f625a, "mMediaFormat = " + mediaFormatC);
            try {
                l();
                AtomicReference atomicReference = new AtomicReference();
                this.i = Futures.h(CallbackToFutureAdapter.a(new a(atomicReference, 2)));
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
                completer.getClass();
                this.j = completer;
                m(InternalState.d);
            } catch (MediaCodec.CodecException e) {
                throw new InvalidConfigException(e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            throw new InvalidConfigException(e2);
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void a(EncoderCallback encoderCallback, Executor executor) {
        synchronized (this.b) {
            this.r = encoderCallback;
            this.s = executor;
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void b(final long j) {
        final long jB = this.q.b();
        this.h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.f
            @Override // java.lang.Runnable
            public final void run() {
                EncoderImpl encoderImpl = this.d;
                String str = encoderImpl.f625a;
                switch (encoderImpl.t.ordinal()) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        EncoderImpl.InternalState internalState = encoderImpl.t;
                        encoderImpl.m(EncoderImpl.InternalState.g);
                        Long l = (Long) encoderImpl.u.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j2 = j;
                        if (j2 == -1) {
                            j2 = jB;
                        } else if (j2 < jLongValue) {
                            Logger.e(str, "The expected stop time is less than the start time. Use current time as stop time.");
                            j2 = jB;
                        }
                        if (j2 < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        encoderImpl.u = Range.create(l, Long.valueOf(j2));
                        Logger.a(str, "Stop on ".concat(DebugUtils.a(j2)));
                        if (internalState == EncoderImpl.InternalState.f && encoderImpl.x != null) {
                            encoderImpl.n();
                            return;
                        } else {
                            encoderImpl.w = true;
                            encoderImpl.y = CameraXExecutors.d().schedule(new c(encoderImpl, 3), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        encoderImpl.m(EncoderImpl.InternalState.d);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.t);
                }
            }
        });
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final EncoderInfoImpl c() {
        return this.g;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final ListenableFuture d() {
        return this.i;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void e() {
        this.h.execute(new c(this, 1));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final int f() {
        MediaFormat mediaFormat = this.d;
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    public final void g(int i, String str, Throwable th) {
        switch (this.t.ordinal()) {
            case 0:
                i(i, str, th);
                l();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m(InternalState.k);
                o(new h(this, i, str, th));
                break;
            case 7:
                Logger.f(this.f625a, android.support.v4.media.session.a.p("Get more than one error: ", i, str, "(", ")"), th);
                break;
        }
    }

    public final void h() throws MediaCodec.CryptoException {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) arrayDeque.poll();
            Objects.requireNonNull(completer);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                InputBufferImpl inputBufferImpl = new InputBufferImpl(this.e, num.intValue());
                if (completer.b(inputBufferImpl)) {
                    this.m.add(inputBufferImpl);
                    Futures.h(inputBufferImpl.d).addListener(new d(1, this, inputBufferImpl), this.h);
                } else {
                    inputBufferImpl.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                g(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void i(int i, String str, Throwable th) {
        EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.b) {
            encoderCallback = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new e(encoderCallback, i, str, th));
        } catch (RejectedExecutionException e) {
            Logger.c(this.f625a, "Unable to post to the supplied executor.", e);
        }
    }

    public final void j() {
        Surface surface;
        HashSet hashSet;
        if (this.A) {
            this.e.stop();
            this.A = false;
        }
        this.e.release();
        Encoder.EncoderInput encoderInput = this.f;
        if (encoderInput instanceof SurfaceInput) {
            SurfaceInput surfaceInput = (SurfaceInput) encoderInput;
            synchronized (surfaceInput.f631a) {
                surface = surfaceInput.b;
                surfaceInput.b = null;
                hashSet = new HashSet(surfaceInput.c);
                surfaceInput.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        m(InternalState.l);
        this.j.b(null);
    }

    public final void k() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.e.setParameters(bundle);
    }

    public final void l() {
        l lVar;
        Executor executor;
        this.u = E;
        this.v = 0L;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((CallbackToFutureAdapter.Completer) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.A = false;
        this.B = false;
        this.C = false;
        this.w = false;
        ScheduledFuture scheduledFuture = this.y;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.y = null;
        }
        ScheduledFuture scheduledFuture2 = this.D;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.D = null;
        }
        MediaCodecCallback mediaCodecCallback = this.z;
        if (mediaCodecCallback != null) {
            mediaCodecCallback.j = true;
        }
        MediaCodecCallback mediaCodecCallback2 = new MediaCodecCallback();
        this.z = mediaCodecCallback2;
        this.e.setCallback(mediaCodecCallback2);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.f;
        if (encoderInput instanceof SurfaceInput) {
            SurfaceInput surfaceInput = (SurfaceInput) encoderInput;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.f614a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (surfaceInput.f631a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (surfaceInput.b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            surfaceInput.b = surfaceCreateInputSurface;
                        }
                        EncoderImpl.this.e.setInputSurface(surfaceInput.b);
                    } else {
                        Surface surface = surfaceInput.b;
                        if (surface != null) {
                            surfaceInput.c.add(surface);
                        }
                        surfaceCreateInputSurface = EncoderImpl.this.e.createInputSurface();
                        surfaceInput.b = surfaceCreateInputSurface;
                    }
                    lVar = surfaceInput.d;
                    executor = surfaceInput.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || lVar == null || executor == null) {
                return;
            }
            try {
                executor.execute(new d(10, lVar, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e) {
                Logger.c(EncoderImpl.this.f625a, "Unable to post to the supplied executor.", e);
            }
        }
    }

    public final void m(InternalState internalState) {
        if (this.t == internalState) {
            return;
        }
        Logger.a(this.f625a, "Transitioning encoder internal state: " + this.t + " --> " + internalState);
        this.t = internalState;
    }

    public final void n() {
        Logger.a(this.f625a, "signalCodecStop");
        Encoder.EncoderInput encoderInput = this.f;
        if (encoderInput instanceof ByteBufferInput) {
            ((ByteBufferInput) encoderInput).e(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(((InputBuffer) it.next()).b());
            }
            Futures.k(arrayList).addListener(new c(this, 0), this.h);
            return;
        }
        if (encoderInput instanceof SurfaceInput) {
            try {
                if (DeviceQuirks.f614a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    MediaCodecCallback mediaCodecCallback = this.z;
                    Executor executor = this.h;
                    ScheduledFuture scheduledFuture = this.D;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.D = CameraXExecutors.d().schedule(new d(0, executor, mediaCodecCallback), 1000L, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.C = true;
            } catch (MediaCodec.CodecException e) {
                g(1, e.getMessage(), e);
            }
        }
    }

    public final void o(Runnable runnable) {
        String str = this.f625a;
        Logger.a(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.h(((EncodedDataImpl) it.next()).g));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InputBuffer) it2.next()).b());
        }
        if (!arrayList.isEmpty()) {
            Logger.a(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        Futures.k(arrayList).addListener(new e(0, this, arrayList, runnable), this.h);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void pause() {
        this.h.execute(new b(this, this.q.b(), 0));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void release() {
        this.h.execute(new c(this, 2));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void start() {
        this.h.execute(new b(this, this.q.b(), 1));
    }
}
