package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultAudioSink implements AudioSink {
    public static final Object j0 = new Object();
    public static ScheduledExecutorService k0;
    public static int l0;
    public MediaPositionParameters A;
    public MediaPositionParameters B;
    public PlaybackParameters C;
    public boolean D;
    public ByteBuffer E;
    public int F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public float O;
    public ByteBuffer P;
    public int Q;
    public ByteBuffer R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public AuxEffectInfo Y;
    public AudioDeviceInfoApi23 Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3054a;
    public boolean a0;
    public final DefaultAudioProcessorChain b;
    public long b0;
    public final ChannelMappingAudioProcessor c;
    public long c0;
    public final TrimmingAudioProcessor d;
    public boolean d0;
    public final ImmutableList e;
    public boolean e0;
    public final ImmutableList f;
    public Looper f0;
    public final AudioTrackPositionTracker g;
    public long g0;
    public final ArrayDeque h;
    public long h0;
    public final boolean i;
    public Handler i0;
    public int j;
    public StreamEventCallbackV29 k;
    public final PendingExceptionHolder l;
    public final PendingExceptionHolder m;
    public final DefaultAudioTrackBufferSizeProvider n;
    public final DefaultAudioOffloadSupportProvider o;
    public final DefaultAudioTrackProvider p;
    public PlayerId q;
    public AudioSink.Listener r;
    public Configuration s;
    public Configuration t;
    public AudioProcessingPipeline u;
    public AudioTrack v;
    public AudioCapabilities w;
    public AudioCapabilitiesReceiver x;
    public OnRoutingChangedListenerApi24 y;
    public AudioAttributes z;

    @RequiresApi
    public static final class Api23 {
    }

    @RequiresApi
    public static final class Api31 {
    }

    public interface AudioOffloadSupportProvider {
    }

    @Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {

        /* renamed from: a, reason: collision with root package name */
        public static final DefaultAudioTrackBufferSizeProvider f3055a = new DefaultAudioTrackBufferSizeProvider();
    }

    public interface AudioTrackProvider {

        /* renamed from: a, reason: collision with root package name */
        public static final DefaultAudioTrackProvider f3056a = new DefaultAudioTrackProvider();
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3057a;
        public DefaultAudioProcessorChain c;
        public boolean d;
        public DefaultAudioOffloadSupportProvider g;
        public final AudioCapabilities b = AudioCapabilities.c;
        public final DefaultAudioTrackBufferSizeProvider e = AudioTrackBufferSizeProvider.f3055a;
        public final DefaultAudioTrackProvider f = AudioTrackProvider.f3056a;

        public Builder(Context context) {
            this.f3057a = context;
        }
    }

    public static final class Configuration {

        /* renamed from: a, reason: collision with root package name */
        public final Format f3058a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final AudioProcessingPipeline i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public Configuration(Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, AudioProcessingPipeline audioProcessingPipeline, boolean z, boolean z2, boolean z3) {
            this.f3058a = format;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = audioProcessingPipeline;
            this.j = z;
            this.k = z2;
            this.l = z3;
        }

        public final AudioSink.AudioTrackConfig a() {
            return new AudioSink.AudioTrackConfig(this.g, this.e, this.f, this.l, this.c == 1, this.h);
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {

        /* renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f3059a;
        public final SilenceSkippingAudioProcessor b;
        public final SonicAudioProcessor c;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
            sonicAudioProcessor.c = 1.0f;
            sonicAudioProcessor.d = 1.0f;
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.e;
            sonicAudioProcessor.e = audioFormat;
            sonicAudioProcessor.f = audioFormat;
            sonicAudioProcessor.g = audioFormat;
            sonicAudioProcessor.h = audioFormat;
            ByteBuffer byteBuffer = AudioProcessor.f2893a;
            sonicAudioProcessor.k = byteBuffer;
            sonicAudioProcessor.l = byteBuffer.asShortBuffer();
            sonicAudioProcessor.m = byteBuffer;
            sonicAudioProcessor.b = -1;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f3059a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.b = silenceSkippingAudioProcessor;
            this.c = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class MediaPositionParameters {

        /* renamed from: a, reason: collision with root package name */
        public final PlaybackParameters f3060a;
        public final long b;
        public final long c;
        public long d;

        public MediaPositionParameters(PlaybackParameters playbackParameters, long j, long j2) {
            this.f3060a = playbackParameters;
            this.b = j;
            this.c = j2;
        }
    }

    @RequiresApi
    public static final class OnRoutingChangedListenerApi24 {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f3061a;
        public final AudioCapabilitiesReceiver b;
        public j c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.j
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                DefaultAudioSink.OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24 = this.f3069a;
                if (onRoutingChangedListenerApi24.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                onRoutingChangedListenerApi24.b.b(routedDevice);
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.media3.exoplayer.audio.j] */
        public OnRoutingChangedListenerApi24(AudioTrack audioTrack, AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            this.f3061a = audioTrack;
            this.b = audioCapabilitiesReceiver;
            audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        public Exception f3062a;
        public long b = -9223372036854775807L;
        public long c = -9223372036854775807L;

        public final void a(Exception exc) throws Exception {
            boolean z;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f3062a == null) {
                this.f3062a = exc;
            }
            if (this.b == -9223372036854775807L) {
                synchronized (DefaultAudioSink.j0) {
                    z = DefaultAudioSink.l0 > 0;
                }
                if (!z) {
                    this.b = 200 + jElapsedRealtime;
                }
            }
            long j = this.b;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.c = jElapsedRealtime + 50;
                return;
            }
            Exception exc2 = this.f3062a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f3062a;
            this.f3062a = null;
            this.b = -9223372036854775807L;
            this.c = -9223372036854775807L;
            throw exc3;
        }
    }

    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        public PositionTrackerListener() {
        }
    }

    @RequiresApi
    public final class StreamEventCallbackV29 {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f3064a = new Handler(Looper.myLooper());
        public final AudioTrack$StreamEventCallback b = new AudioTrack$StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29.1
            public final void onDataRequest(AudioTrack audioTrack, int i) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.Listener listener;
                if (audioTrack.equals(DefaultAudioSink.this.v) && (listener = (defaultAudioSink = DefaultAudioSink.this).r) != null && defaultAudioSink.V) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).c();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.v)) {
                    DefaultAudioSink.this.U = true;
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.Listener listener;
                if (audioTrack.equals(DefaultAudioSink.this.v) && (listener = (defaultAudioSink = DefaultAudioSink.this).r) != null && defaultAudioSink.V) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).c();
                }
            }
        };

        public StreamEventCallbackV29() {
        }
    }

    public DefaultAudioSink(Builder builder) {
        Context context = builder.f3057a;
        this.f3054a = context;
        this.z = AudioAttributes.b;
        this.w = context != null ? null : builder.b;
        this.b = builder.c;
        int i = Util.f2928a;
        this.i = false;
        this.j = 0;
        this.n = builder.e;
        DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider = builder.g;
        defaultAudioOffloadSupportProvider.getClass();
        this.o = defaultAudioOffloadSupportProvider;
        this.g = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.c = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        trimmingAudioProcessor.m = Util.c;
        this.d = trimmingAudioProcessor;
        ToInt16PcmAudioProcessor toInt16PcmAudioProcessor = new ToInt16PcmAudioProcessor();
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        Object[] objArr = {toInt16PcmAudioProcessor, channelMappingAudioProcessor, trimmingAudioProcessor};
        ObjectArrays.a(3, objArr);
        this.e = ImmutableList.l(3, objArr);
        Object[] objArr2 = {new ToFloatPcmAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor};
        ObjectArrays.a(3, objArr2);
        this.f = ImmutableList.l(3, objArr2);
        this.O = 1.0f;
        this.X = 0;
        this.Y = new AuxEffectInfo();
        PlaybackParameters playbackParameters = PlaybackParameters.d;
        this.B = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.C = playbackParameters;
        this.D = false;
        this.h = new ArrayDeque();
        this.l = new PendingExceptionHolder();
        this.m = new PendingExceptionHolder();
        this.p = builder.f;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Util.f2928a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r10) {
        /*
            r9 = this;
            boolean r0 = r9.z()
            r1 = 0
            androidx.media3.exoplayer.audio.DefaultAudioSink$DefaultAudioProcessorChain r2 = r9.b
            if (r0 != 0) goto L53
            boolean r0 = r9.a0
            if (r0 != 0) goto L4d
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r0 = r9.t
            int r3 = r0.c
            if (r3 != 0) goto L4d
            androidx.media3.common.Format r0 = r0.f3058a
            int r0 = r0.F
            androidx.media3.common.PlaybackParameters r0 = r9.C
            androidx.media3.common.audio.SonicAudioProcessor r3 = r2.c
            float r4 = r0.f2871a
            r3.getClass()
            r5 = 0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r7 = 1
            if (r6 <= 0) goto L28
            r6 = r7
            goto L29
        L28:
            r6 = r1
        L29:
            androidx.media3.common.util.Assertions.b(r6)
            float r6 = r3.c
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L36
            r3.c = r4
            r3.i = r7
        L36:
            float r4 = r0.b
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L3e
            r5 = r7
            goto L3f
        L3e:
            r5 = r1
        L3f:
            androidx.media3.common.util.Assertions.b(r5)
            float r5 = r3.d
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 == 0) goto L4f
            r3.d = r4
            r3.i = r7
            goto L4f
        L4d:
            androidx.media3.common.PlaybackParameters r0 = androidx.media3.common.PlaybackParameters.d
        L4f:
            r9.C = r0
        L51:
            r4 = r0
            goto L56
        L53:
            androidx.media3.common.PlaybackParameters r0 = androidx.media3.common.PlaybackParameters.d
            goto L51
        L56:
            boolean r0 = r9.a0
            if (r0 != 0) goto L6a
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r0 = r9.t
            int r3 = r0.c
            if (r3 != 0) goto L6a
            androidx.media3.common.Format r0 = r0.f3058a
            int r0 = r0.F
            boolean r1 = r9.D
            androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor r0 = r2.b
            r0.o = r1
        L6a:
            r9.D = r1
            androidx.media3.exoplayer.audio.DefaultAudioSink$MediaPositionParameters r3 = new androidx.media3.exoplayer.audio.DefaultAudioSink$MediaPositionParameters
            r0 = 0
            long r5 = java.lang.Math.max(r0, r10)
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r10 = r9.t
            long r0 = r9.k()
            int r10 = r10.e
            long r7 = androidx.media3.common.util.Util.M(r10, r0)
            r3.<init>(r4, r5, r7)
            java.util.ArrayDeque r10 = r9.h
            r10.add(r3)
            androidx.media3.exoplayer.audio.DefaultAudioSink$Configuration r10 = r9.t
            androidx.media3.common.audio.AudioProcessingPipeline r10 = r10.i
            r9.u = r10
            r10.a()
            androidx.media3.exoplayer.audio.AudioSink$Listener r10 = r9.r
            if (r10 == 0) goto Laa
            boolean r11 = r9.D
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer$AudioSinkListener r10 = (androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.AudioSinkListener) r10
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer r10 = androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this
            androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher r10 = r10.G0
            android.os.Handler r0 = r10.f3048a
            if (r0 == 0) goto Laa
            androidx.camera.camera2.interop.b r1 = new androidx.camera.camera2.interop.b
            r2 = 1
            r1.<init>(r10, r11, r2)
            r0.post(r1)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.a(long):void");
    }

    public final AudioTrack b(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i, Format format) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.p.a(audioTrackConfig, audioAttributes, i);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, audioTrackConfig.b, audioTrackConfig.c, audioTrackConfig.f3049a, format, audioTrackConfig.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink.InitializationException(0, audioTrackConfig.b, audioTrackConfig.c, audioTrackConfig.f3049a, format, audioTrackConfig.e, e);
        }
    }

    public final AudioTrack c(Configuration configuration) throws AudioSink.InitializationException {
        try {
            return b(configuration.a(), this.z, this.X, configuration.f3058a);
        } catch (AudioSink.InitializationException e) {
            AudioSink.Listener listener = this.r;
            if (listener != null) {
                ((MediaCodecAudioRenderer.AudioSinkListener) listener).a(e);
            }
            throw e;
        }
    }

    public final void d(Format format, int[] iArr) throws AudioProcessor.UnhandledAudioFormatException, AudioSink.ConfigurationException {
        boolean z;
        int iIntValue;
        int i;
        int iR;
        int iR2;
        AudioProcessingPipeline audioProcessingPipeline;
        boolean z2;
        int i2;
        int i3;
        AudioProcessingPipeline audioProcessingPipeline2;
        int i4;
        q();
        String str = format.n;
        int i5 = format.E;
        int i6 = format.D;
        int i7 = format.F;
        boolean zEquals = "audio/raw".equals(str);
        boolean z3 = this.i;
        if (zEquals) {
            Assertions.b(Util.F(i7));
            iR = Util.r(i7) * i6;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.f(this.e);
            builder.i(this.b.f3059a);
            AudioProcessingPipeline audioProcessingPipeline3 = new AudioProcessingPipeline(builder.j());
            if (audioProcessingPipeline3.equals(this.u)) {
                audioProcessingPipeline3 = this.u;
            }
            int i8 = format.G;
            int i9 = format.H;
            TrimmingAudioProcessor trimmingAudioProcessor = this.d;
            trimmingAudioProcessor.i = i8;
            trimmingAudioProcessor.j = i9;
            this.c.i = iArr;
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(i5, i6, i7);
            try {
                ImmutableList immutableList = audioProcessingPipeline3.f2892a;
                if (audioFormat.equals(AudioProcessor.AudioFormat.e)) {
                    throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
                }
                for (int i10 = 0; i10 < immutableList.size(); i10++) {
                    AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i10);
                    AudioProcessor.AudioFormat audioFormatF = audioProcessor.f(audioFormat);
                    if (audioProcessor.isActive()) {
                        Assertions.f(!audioFormatF.equals(AudioProcessor.AudioFormat.e));
                        audioFormat = audioFormatF;
                    }
                }
                int i11 = audioFormat.b;
                i = audioFormat.c;
                int i12 = audioFormat.f2894a;
                int iQ = Util.q(i11);
                iR2 = Util.r(i) * i11;
                z = z3;
                iIntValue = iQ;
                i5 = i12;
                audioProcessingPipeline = audioProcessingPipeline3;
                z2 = false;
                i2 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, format);
            }
        } else {
            AudioProcessingPipeline audioProcessingPipeline4 = new AudioProcessingPipeline(ImmutableList.t());
            AudioOffloadSupport audioOffloadSupportH = this.j != 0 ? h(format) : AudioOffloadSupport.d;
            if (this.j == 0 || !audioOffloadSupportH.f3046a) {
                Pair pairD = this.w.d(format, this.z);
                if (pairD == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                int iIntValue2 = ((Integer) pairD.first).intValue();
                z = z3;
                iIntValue = ((Integer) pairD.second).intValue();
                i = iIntValue2;
                iR = -1;
                iR2 = -1;
                audioProcessingPipeline = audioProcessingPipeline4;
                z2 = false;
                i2 = 2;
            } else {
                str.getClass();
                int iC = MimeTypes.c(str, format.k);
                int iQ2 = Util.q(i6);
                boolean z4 = audioOffloadSupportH.b;
                i2 = 1;
                iR2 = -1;
                iIntValue = iQ2;
                audioProcessingPipeline = audioProcessingPipeline4;
                z2 = z4;
                i = iC;
                z = true;
                iR = -1;
            }
        }
        if (i == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i2 + ") for: " + format, format);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i2 + ") for: " + format, format);
        }
        int i13 = format.j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i13 == -1) {
            i13 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue, i);
        Assertions.f(minBufferSize != -2);
        int i14 = iR2 != -1 ? iR2 : 1;
        double d = z ? 8.0d : 1.0d;
        this.n.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = i;
                i4 = Ints.b((50000000 * DefaultAudioTrackBufferSizeProvider.a(i3)) / 1000000);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                i3 = i;
                i4 = Ints.b(((i == 5 ? 500000 : i == 8 ? 1000000 : 250000) * (i13 != -1 ? IntMath.c(i13, 8, RoundingMode.CEILING) : DefaultAudioTrackBufferSizeProvider.a(i))) / 1000000);
            }
            audioProcessingPipeline2 = audioProcessingPipeline;
        } else {
            i3 = i;
            audioProcessingPipeline2 = audioProcessingPipeline;
            long j = i5;
            long j2 = 250000 * j;
            long j3 = i14;
            i4 = Util.i(minBufferSize * 4, Ints.b((j2 * j3) / 1000000), Ints.b(((750000 * j) * j3) / 1000000));
        }
        this.d0 = false;
        Configuration configuration = new Configuration(format, iR, i2, iR2, i5, iIntValue, i3, (((Math.max(minBufferSize, (int) (i4 * d)) + i14) - 1) / i14) * i14, audioProcessingPipeline2, z, z2, this.a0);
        if (o()) {
            this.s = configuration;
        } else {
            this.t = configuration;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws java.lang.Exception {
        /*
            r6 = this;
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r6.u
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.R
            if (r0 != 0) goto L44
            goto L43
        L14:
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r6.u
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.d = r4
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r3)
            androidx.media3.common.audio.AudioProcessor r0 = (androidx.media3.common.audio.AudioProcessor) r0
            r0.d()
        L2e:
            r6.t(r1)
            androidx.media3.common.audio.AudioProcessingPipeline r0 = r6.u
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.R
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.f():boolean");
    }

    public final void g() throws IllegalStateException {
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24;
        if (o()) {
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.e0 = false;
            this.K = 0;
            this.B = new MediaPositionParameters(this.C, 0L, 0L);
            this.N = 0L;
            this.A = null;
            this.h.clear();
            this.P = null;
            this.Q = 0;
            this.R = null;
            this.T = false;
            this.S = false;
            this.U = false;
            this.E = null;
            this.F = 0;
            this.d.o = 0L;
            AudioProcessingPipeline audioProcessingPipeline = this.t.i;
            this.u = audioProcessingPipeline;
            audioProcessingPipeline.a();
            AudioTrack audioTrack = this.g.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.v.pause();
            }
            if (p(this.v)) {
                StreamEventCallbackV29 streamEventCallbackV29 = this.k;
                streamEventCallbackV29.getClass();
                this.v.unregisterStreamEventCallback(streamEventCallbackV29.b);
                streamEventCallbackV29.f3064a.removeCallbacksAndMessages(null);
            }
            AudioSink.AudioTrackConfig audioTrackConfigA = this.t.a();
            Configuration configuration = this.s;
            if (configuration != null) {
                this.t = configuration;
                this.s = null;
            }
            AudioTrackPositionTracker audioTrackPositionTracker = this.g;
            audioTrackPositionTracker.e();
            audioTrackPositionTracker.c = null;
            audioTrackPositionTracker.e = null;
            if (Util.f2928a >= 24 && (onRoutingChangedListenerApi24 = this.y) != null) {
                AudioTrack audioTrack2 = onRoutingChangedListenerApi24.f3061a;
                j jVar = onRoutingChangedListenerApi24.c;
                jVar.getClass();
                audioTrack2.removeOnRoutingChangedListener(jVar);
                onRoutingChangedListenerApi24.c = null;
                this.y = null;
            }
            AudioTrack audioTrack3 = this.v;
            AudioSink.Listener listener = this.r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (j0) {
                try {
                    if (k0 == null) {
                        k0 = Executors.newSingleThreadScheduledExecutor(new androidx.media3.common.util.f());
                    }
                    l0++;
                    k0.schedule(new androidx.camera.core.processing.a(audioTrack3, listener, handler, audioTrackConfigA, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v = null;
        }
        PendingExceptionHolder pendingExceptionHolder = this.m;
        pendingExceptionHolder.f3062a = null;
        pendingExceptionHolder.b = -9223372036854775807L;
        pendingExceptionHolder.c = -9223372036854775807L;
        PendingExceptionHolder pendingExceptionHolder2 = this.l;
        pendingExceptionHolder2.f3062a = null;
        pendingExceptionHolder2.b = -9223372036854775807L;
        pendingExceptionHolder2.c = -9223372036854775807L;
        this.g0 = 0L;
        this.h0 = 0L;
        Handler handler2 = this.i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final AudioOffloadSupport h(Format format) {
        boolean zBooleanValue;
        if (this.d0) {
            return AudioOffloadSupport.d;
        }
        AudioAttributes audioAttributes = this.z;
        DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider = this.o;
        defaultAudioOffloadSupportProvider.getClass();
        format.getClass();
        int i = format.E;
        audioAttributes.getClass();
        int i2 = Util.f2928a;
        if (i2 < 29 || i == -1) {
            return AudioOffloadSupport.d;
        }
        Context context = defaultAudioOffloadSupportProvider.f3053a;
        Boolean bool = defaultAudioOffloadSupportProvider.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = AudioManagerCompat.a(context).getParameters("offloadVariableRateSupported");
                defaultAudioOffloadSupportProvider.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                defaultAudioOffloadSupportProvider.b = Boolean.FALSE;
            }
            zBooleanValue = defaultAudioOffloadSupportProvider.b.booleanValue();
        }
        String str = format.n;
        str.getClass();
        int iC = MimeTypes.c(str, format.k);
        if (iC == 0 || i2 < Util.o(iC)) {
            return AudioOffloadSupport.d;
        }
        int iQ = Util.q(format.D);
        if (iQ == 0) {
            return AudioOffloadSupport.d;
        }
        try {
            AudioFormat audioFormatP = Util.p(i, iQ, iC);
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatP, audioAttributes.a().f2846a)) {
                    return AudioOffloadSupport.d;
                }
                AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
                builder.f3047a = true;
                builder.c = zBooleanValue;
                return builder.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatP, audioAttributes.a().f2846a);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.d;
            }
            AudioOffloadSupport.Builder builder2 = new AudioOffloadSupport.Builder();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            builder2.f3047a = true;
            builder2.b = z;
            builder2.c = zBooleanValue;
            return builder2.a();
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.d;
        }
    }

    public final int i(Format format) {
        q();
        String str = format.n;
        int i = format.F;
        if ("audio/raw".equals(str)) {
            if (!Util.F(i)) {
                androidx.compose.ui.input.pointer.a.t(i, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.w.d(format, this.z) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        return this.t.c == 0 ? this.G / r0.b : this.H;
    }

    public final long k() {
        Configuration configuration = this.t;
        if (configuration.c != 0) {
            return this.J;
        }
        long j = this.I;
        long j2 = configuration.d;
        int i = Util.f2928a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x039a, code lost:
    
        if (r13 == 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0114, code lost:
    
        if (r9.b() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (o()) {
            return !(Util.f2928a >= 29 && this.v.isOffloadedPlayback() && this.U) && this.g.d(k());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.n():boolean");
    }

    public final boolean o() {
        return this.v != null;
    }

    public final void q() {
        Context context;
        AudioCapabilities audioCapabilitiesB;
        AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallbackV23;
        if (this.x == null && (context = this.f3054a) != null) {
            this.f0 = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(context, new i(this), this.z, this.Z);
            this.x = audioCapabilitiesReceiver;
            if (audioCapabilitiesReceiver.j) {
                audioCapabilitiesB = audioCapabilitiesReceiver.g;
                audioCapabilitiesB.getClass();
            } else {
                audioCapabilitiesReceiver.j = true;
                AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = audioCapabilitiesReceiver.f;
                if (externalSurroundSoundSettingObserver != null) {
                    externalSurroundSoundSettingObserver.f3043a.registerContentObserver(externalSurroundSoundSettingObserver.b, false, externalSurroundSoundSettingObserver);
                }
                int i = Util.f2928a;
                Handler handler = audioCapabilitiesReceiver.c;
                Context context2 = audioCapabilitiesReceiver.f3041a;
                if (i >= 23 && (audioDeviceCallbackV23 = audioCapabilitiesReceiver.d) != null) {
                    AudioManagerCompat.a(context2).registerAudioDeviceCallback(audioDeviceCallbackV23, handler);
                }
                audioCapabilitiesB = AudioCapabilities.b(context2, context2.registerReceiver(audioCapabilitiesReceiver.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), audioCapabilitiesReceiver.i, audioCapabilitiesReceiver.h);
                audioCapabilitiesReceiver.g = audioCapabilitiesB;
            }
            this.w = audioCapabilitiesB;
        }
        this.w.getClass();
    }

    public final void r() throws IllegalStateException {
        this.V = true;
        if (o()) {
            AudioTrackPositionTracker audioTrackPositionTracker = this.g;
            if (audioTrackPositionTracker.x != -9223372036854775807L) {
                audioTrackPositionTracker.x = Util.I(audioTrackPositionTracker.I.elapsedRealtime());
            }
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.e;
            audioTimestampPoller.getClass();
            audioTimestampPoller.a();
            this.v.play();
        }
    }

    public final void s() throws IllegalStateException {
        if (this.T) {
            return;
        }
        this.T = true;
        long jK = k();
        AudioTrackPositionTracker audioTrackPositionTracker = this.g;
        audioTrackPositionTracker.z = audioTrackPositionTracker.b();
        audioTrackPositionTracker.x = Util.I(audioTrackPositionTracker.I.elapsedRealtime());
        audioTrackPositionTracker.A = jK;
        if (p(this.v)) {
            this.U = false;
        }
        this.v.stop();
        this.F = 0;
    }

    public final void t(long j) throws Exception {
        ByteBuffer byteBuffer;
        e(j);
        if (this.R != null) {
            return;
        }
        if (!this.u.d()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                x(byteBuffer2);
                e(j);
                return;
            }
            return;
        }
        while (!this.u.c()) {
            do {
                AudioProcessingPipeline audioProcessingPipeline = this.u;
                if (audioProcessingPipeline.d()) {
                    ByteBuffer byteBuffer3 = audioProcessingPipeline.c[audioProcessingPipeline.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        audioProcessingPipeline.e(AudioProcessor.f2893a);
                        byteBuffer = audioProcessingPipeline.c[audioProcessingPipeline.b()];
                    }
                } else {
                    byteBuffer = AudioProcessor.f2893a;
                }
                if (byteBuffer.hasRemaining()) {
                    x(byteBuffer);
                    e(j);
                } else {
                    ByteBuffer byteBuffer4 = this.P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    AudioProcessingPipeline audioProcessingPipeline2 = this.u;
                    ByteBuffer byteBuffer5 = this.P;
                    if (audioProcessingPipeline2.d() && !audioProcessingPipeline2.d) {
                        audioProcessingPipeline2.e(byteBuffer5);
                    }
                }
            } while (this.R == null);
            return;
        }
    }

    public final void u() throws IllegalStateException {
        g();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.e.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            ((AudioProcessor) unmodifiableListIteratorListIterator.next()).reset();
        }
        UnmodifiableListIterator unmodifiableListIteratorListIterator2 = this.f.listIterator(0);
        while (unmodifiableListIteratorListIterator2.hasNext()) {
            ((AudioProcessor) unmodifiableListIteratorListIterator2.next()).reset();
        }
        AudioProcessingPipeline audioProcessingPipeline = this.u;
        if (audioProcessingPipeline != null) {
            ImmutableList immutableList = audioProcessingPipeline.f2892a;
            for (int i = 0; i < immutableList.size(); i++) {
                AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i);
                audioProcessor.flush();
                audioProcessor.reset();
            }
            audioProcessingPipeline.c = new ByteBuffer[0];
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.e;
            audioProcessingPipeline.d = false;
        }
        this.V = false;
        this.d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.f2871a).setPitch(this.C.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.h("DefaultAudioSink", "Failed to set playback params", e);
            }
            PlaybackParameters playbackParameters = new PlaybackParameters(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.C = playbackParameters;
            float f = playbackParameters.f2871a;
            AudioTrackPositionTracker audioTrackPositionTracker = this.g;
            audioTrackPositionTracker.i = f;
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.e;
            if (audioTimestampPoller != null) {
                audioTimestampPoller.a();
            }
            audioTrackPositionTracker.e();
        }
    }

    public final void w(int i) {
        Assertions.f(Util.f2928a >= 29);
        this.j = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.x(java.nio.ByteBuffer):void");
    }

    public final boolean y(Format format) {
        return i(format) != 0;
    }

    public final boolean z() {
        Configuration configuration = this.t;
        return configuration != null && configuration.j && Util.f2928a >= 23;
    }
}
