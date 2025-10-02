package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.audio.SonicAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    public final Context F0;
    public final AudioRendererEventListener.EventDispatcher G0;
    public final DefaultAudioSink H0;
    public final LoudnessCodecController I0;
    public int J0;
    public boolean K0;
    public boolean L0;
    public Format M0;
    public Format N0;
    public long O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public int S0;

    @RequiresApi
    public static final class Api23 {
    }

    public final class AudioSinkListener implements AudioSink.Listener {
        public AudioSinkListener() {
        }

        public final void a(Exception exc) {
            Log.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.G0;
            Handler handler = eventDispatcher.f3048a;
            if (handler != null) {
                handler.post(new d(eventDispatcher, exc, 1));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public final void b(AudioSink.AudioTrackConfig audioTrackConfig) {
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.G0;
            Handler handler = eventDispatcher.f3048a;
            if (handler != null) {
                handler.post(new c(eventDispatcher, audioTrackConfig, 1));
            }
        }

        public final void c() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.I;
            if (wakeupListener != null) {
                wakeupListener.b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.d dVar, Handler handler, AudioRendererEventListener audioRendererEventListener, DefaultAudioSink defaultAudioSink) {
        super(1, factory, dVar, 44100.0f);
        LoudnessCodecController loudnessCodecController = Util.f2928a >= 35 ? new LoudnessCodecController() : null;
        this.F0 = context.getApplicationContext();
        this.H0 = defaultAudioSink;
        this.I0 = loudnessCodecController;
        this.S0 = -1000;
        this.G0 = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        defaultAudioSink.r = new AudioSinkListener();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long A() {
        if (this.k == 2) {
            M0();
        }
        return this.O0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void E() {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G0;
        this.Q0 = true;
        this.M0 = null;
        try {
            this.H0.g();
            try {
                super.E();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.E();
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void F(boolean z, boolean z2) throws IllegalStateException {
        super.F(z, z2);
        DecoderCounters decoderCounters = this.A0;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G0;
        Handler handler = eventDispatcher.f3048a;
        if (handler != null) {
            handler.post(new b(eventDispatcher, decoderCounters, 0));
        }
        RendererConfiguration rendererConfiguration = this.g;
        rendererConfiguration.getClass();
        boolean z3 = rendererConfiguration.b;
        DefaultAudioSink defaultAudioSink = this.H0;
        if (z3) {
            Assertions.f(defaultAudioSink.W);
            if (!defaultAudioSink.a0) {
                defaultAudioSink.a0 = true;
                defaultAudioSink.g();
            }
        } else if (defaultAudioSink.a0) {
            defaultAudioSink.a0 = false;
            defaultAudioSink.g();
        }
        PlayerId playerId = this.i;
        playerId.getClass();
        defaultAudioSink.q = playerId;
        Clock clock = this.j;
        clock.getClass();
        defaultAudioSink.g.I = clock;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean F0(Format format) {
        RendererConfiguration rendererConfiguration = this.g;
        rendererConfiguration.getClass();
        if (rendererConfiguration.f3023a != 0) {
            int iK0 = K0(format);
            if ((iK0 & 512) != 0) {
                RendererConfiguration rendererConfiguration2 = this.g;
                rendererConfiguration2.getClass();
                if (rendererConfiguration2.f3023a == 2 || (iK0 & 1024) != 0) {
                    return true;
                }
                if (format.G == 0 && format.H == 0) {
                    return true;
                }
            }
        }
        return this.H0.y(format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) throws IllegalStateException {
        super.G(j, z);
        this.H0.g();
        this.O0 = j;
        this.R0 = false;
        this.P0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int G0(androidx.media3.exoplayer.mediacodec.MediaCodecSelector r19, androidx.media3.common.Format r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.G0(androidx.media3.exoplayer.mediacodec.MediaCodecSelector, androidx.media3.common.Format):int");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void H() {
        LoudnessCodecController loudnessCodecController;
        AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallbackV23;
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.H0.x;
        if (audioCapabilitiesReceiver != null) {
            Context context = audioCapabilitiesReceiver.f3041a;
            if (audioCapabilitiesReceiver.j) {
                audioCapabilitiesReceiver.g = null;
                if (Util.f2928a >= 23 && (audioDeviceCallbackV23 = audioCapabilitiesReceiver.d) != null) {
                    AudioManagerCompat.a(context).unregisterAudioDeviceCallback(audioDeviceCallbackV23);
                }
                context.unregisterReceiver(audioCapabilitiesReceiver.e);
                AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = audioCapabilitiesReceiver.f;
                if (externalSurroundSoundSettingObserver != null) {
                    externalSurroundSoundSettingObserver.f3043a.unregisterContentObserver(externalSurroundSoundSettingObserver);
                }
                audioCapabilitiesReceiver.j = false;
            }
        }
        if (Util.f2928a < 35 || (loudnessCodecController = this.I0) == null) {
            return;
        }
        loudnessCodecController.f3102a.clear();
        android.media.LoudnessCodecController loudnessCodecController2 = loudnessCodecController.c;
        if (loudnessCodecController2 != null) {
            loudnessCodecController2.close();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void I() throws IllegalStateException {
        DefaultAudioSink defaultAudioSink = this.H0;
        this.R0 = false;
        try {
            super.I();
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                defaultAudioSink.u();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void J() throws IllegalStateException {
        this.H0.r();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void K() throws IllegalStateException {
        M0();
        DefaultAudioSink defaultAudioSink = this.H0;
        defaultAudioSink.V = false;
        if (defaultAudioSink.o()) {
            AudioTrackPositionTracker audioTrackPositionTracker = defaultAudioSink.g;
            audioTrackPositionTracker.e();
            if (audioTrackPositionTracker.x == -9223372036854775807L) {
                AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.e;
                audioTimestampPoller.getClass();
                audioTimestampPoller.a();
            } else {
                audioTrackPositionTracker.z = audioTrackPositionTracker.b();
                if (!DefaultAudioSink.p(defaultAudioSink.v)) {
                    return;
                }
            }
            defaultAudioSink.v.pause();
        }
    }

    public final int K0(Format format) {
        AudioOffloadSupport audioOffloadSupportH = this.H0.h(format);
        if (!audioOffloadSupportH.f3046a) {
            return 0;
        }
        int i = audioOffloadSupportH.b ? 1536 : 512;
        return audioOffloadSupportH.c ? i | 2048 : i;
    }

    public final int L0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.f3106a) || (i = Util.f2928a) >= 24 || (i == 23 && Util.H(this.F0))) {
            return format.o;
        }
        return -1;
    }

    public final void M0() {
        long jMax;
        long j;
        b();
        final DefaultAudioSink defaultAudioSink = this.H0;
        DefaultAudioSink.DefaultAudioProcessorChain defaultAudioProcessorChain = defaultAudioSink.b;
        if (!defaultAudioSink.o() || defaultAudioSink.M) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(defaultAudioSink.g.a(), Util.M(defaultAudioSink.t.e, defaultAudioSink.k()));
            ArrayDeque arrayDeque = defaultAudioSink.h;
            while (!arrayDeque.isEmpty() && jMin >= ((DefaultAudioSink.MediaPositionParameters) arrayDeque.getFirst()).c) {
                defaultAudioSink.B = (DefaultAudioSink.MediaPositionParameters) arrayDeque.remove();
            }
            DefaultAudioSink.MediaPositionParameters mediaPositionParameters = defaultAudioSink.B;
            long jA = jMin - mediaPositionParameters.c;
            long jV = Util.v(jA, mediaPositionParameters.f3060a.f2871a);
            if (arrayDeque.isEmpty()) {
                SonicAudioProcessor sonicAudioProcessor = defaultAudioProcessorChain.c;
                if (sonicAudioProcessor.isActive()) {
                    jA = sonicAudioProcessor.a(jA);
                }
                DefaultAudioSink.MediaPositionParameters mediaPositionParameters2 = defaultAudioSink.B;
                j = mediaPositionParameters2.b + jA;
                mediaPositionParameters2.d = jA - jV;
            } else {
                DefaultAudioSink.MediaPositionParameters mediaPositionParameters3 = defaultAudioSink.B;
                j = mediaPositionParameters3.b + jV + mediaPositionParameters3.d;
            }
            long j2 = defaultAudioProcessorChain.b.q;
            jMax = Util.M(defaultAudioSink.t.e, j2) + j;
            long j3 = defaultAudioSink.g0;
            if (j2 > j3) {
                long jM = Util.M(defaultAudioSink.t.e, j2 - j3);
                defaultAudioSink.g0 = j2;
                defaultAudioSink.h0 += jM;
                if (defaultAudioSink.i0 == null) {
                    defaultAudioSink.i0 = new Handler(Looper.myLooper());
                }
                defaultAudioSink.i0.removeCallbacksAndMessages(null);
                defaultAudioSink.i0.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink defaultAudioSink2 = defaultAudioSink;
                        if (defaultAudioSink2.h0 >= 300000) {
                            MediaCodecAudioRenderer.this.R0 = true;
                            defaultAudioSink2.h0 = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.P0) {
                jMax = Math.max(this.O0, jMax);
            }
            this.O0 = jMax;
            this.P0 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation O(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = mediaCodecInfo.b(format, format2);
        int i = decoderReuseEvaluationB.e;
        if (this.H == null && F0(format2)) {
            i |= 32768;
        }
        if (L0(mediaCodecInfo, format2) > this.J0) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.f3106a, format, format2, i2 != 0 ? 0 : decoderReuseEvaluationB.d, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float Z(float f, Format[] formatArr) {
        int iMax = -1;
        for (Format format : formatArr) {
            int i = format.E;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a0(androidx.media3.exoplayer.mediacodec.MediaCodecSelector r4, androidx.media3.common.Format r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.n
            if (r0 != 0) goto L9
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.t()
            goto L31
        L9:
            androidx.media3.exoplayer.audio.DefaultAudioSink r0 = r3.H0
            boolean r0 = r0.y(r5)
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L20
            r0 = 0
            goto L26
        L20:
            java.lang.Object r0 = r0.get(r1)
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo r0 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r0
        L26:
            if (r0 == 0) goto L2d
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.w(r0)
            goto L31
        L2d:
            java.util.List r4 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.g(r4, r5, r6, r1)
        L31:
            java.util.HashMap r6 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f3110a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            androidx.media3.exoplayer.mediacodec.e r4 = new androidx.media3.exoplayer.mediacodec.e
            r4.<init>(r5)
            androidx.media3.exoplayer.mediacodec.f r5 = new androidx.media3.exoplayer.mediacodec.f
            r5.<init>(r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.a0(androidx.media3.exoplayer.mediacodec.MediaCodecSelector, androidx.media3.common.Format, boolean):java.util.ArrayList");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        if (!this.w0) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.H0;
        if (defaultAudioSink.o()) {
            return defaultAudioSink.S && !defaultAudioSink.m();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration b0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r13, androidx.media3.common.Format r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.b0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, androidx.media3.common.Format, android.media.MediaCrypto, float):androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Configuration");
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        DefaultAudioSink defaultAudioSink = this.H0;
        defaultAudioSink.getClass();
        defaultAudioSink.C = new PlaybackParameters(Util.h(playbackParameters.f2871a, 0.1f, 8.0f), Util.h(playbackParameters.b, 0.1f, 8.0f));
        if (defaultAudioSink.z()) {
            defaultAudioSink.v();
            return;
        }
        DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new DefaultAudioSink.MediaPositionParameters(playbackParameters, -9223372036854775807L, -9223372036854775807L);
        if (defaultAudioSink.o()) {
            defaultAudioSink.A = mediaPositionParameters;
        } else {
            defaultAudioSink.B = mediaPositionParameters;
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters d() {
        return this.H0.C;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void e0(DecoderInputBuffer decoderInputBuffer) {
        Format format;
        DefaultAudioSink.Configuration configuration;
        if (Util.f2928a < 29 || (format = decoderInputBuffer.e) == null || !Objects.equals(format.n, "audio/opus") || !this.j0) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.j;
        byteBuffer.getClass();
        Format format2 = decoderInputBuffer.e;
        format2.getClass();
        int i = format2.G;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            DefaultAudioSink defaultAudioSink = this.H0;
            AudioTrack audioTrack = defaultAudioSink.v;
            if (audioTrack == null || !DefaultAudioSink.p(audioTrack) || (configuration = defaultAudioSink.t) == null || !configuration.k) {
                return;
            }
            defaultAudioSink.v.setOffloadDelayPadding(i, i2);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean h() {
        boolean z = this.R0;
        this.R0 = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) throws IllegalStateException {
        AudioDeviceInfoApi23 audioDeviceInfoApi23;
        LoudnessCodecController loudnessCodecController;
        DefaultAudioSink defaultAudioSink = this.H0;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (defaultAudioSink.O != fFloatValue) {
                defaultAudioSink.O = fFloatValue;
                if (defaultAudioSink.o()) {
                    defaultAudioSink.v.setVolume(defaultAudioSink.O);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            audioAttributes.getClass();
            if (defaultAudioSink.z.equals(audioAttributes)) {
                return;
            }
            defaultAudioSink.z = audioAttributes;
            if (defaultAudioSink.a0) {
                return;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = defaultAudioSink.x;
            if (audioCapabilitiesReceiver != null) {
                audioCapabilitiesReceiver.i = audioAttributes;
                audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f3041a, audioAttributes, audioCapabilitiesReceiver.h));
            }
            defaultAudioSink.g();
            return;
        }
        if (i == 6) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            auxEffectInfo.getClass();
            if (defaultAudioSink.Y.equals(auxEffectInfo)) {
                return;
            }
            if (defaultAudioSink.v != null) {
                defaultAudioSink.Y.getClass();
            }
            defaultAudioSink.Y = auxEffectInfo;
            return;
        }
        if (i == 12) {
            if (Util.f2928a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    audioDeviceInfoApi23 = null;
                } else {
                    defaultAudioSink.getClass();
                    audioDeviceInfoApi23 = new AudioDeviceInfoApi23(audioDeviceInfo);
                }
                defaultAudioSink.Z = audioDeviceInfoApi23;
                AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = defaultAudioSink.x;
                if (audioCapabilitiesReceiver2 != null) {
                    audioCapabilitiesReceiver2.b(audioDeviceInfo);
                }
                AudioTrack audioTrack = defaultAudioSink.v;
                if (audioTrack != null) {
                    AudioDeviceInfoApi23 audioDeviceInfoApi232 = defaultAudioSink.Z;
                    audioTrack.setPreferredDevice(audioDeviceInfoApi232 != null ? audioDeviceInfoApi232.f3045a : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.S0 = ((Integer) obj).intValue();
            MediaCodecAdapter mediaCodecAdapter = this.N;
            if (mediaCodecAdapter != null && Util.f2928a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.S0));
                mediaCodecAdapter.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            defaultAudioSink.D = ((Boolean) obj).booleanValue();
            DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new DefaultAudioSink.MediaPositionParameters(defaultAudioSink.z() ? PlaybackParameters.d : defaultAudioSink.C, -9223372036854775807L, -9223372036854775807L);
            if (defaultAudioSink.o()) {
                defaultAudioSink.A = mediaPositionParameters;
                return;
            } else {
                defaultAudioSink.B = mediaPositionParameters;
                return;
            }
        }
        if (i != 10) {
            super.i(i, obj);
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (defaultAudioSink.X != iIntValue) {
            defaultAudioSink.X = iIntValue;
            defaultAudioSink.W = iIntValue != 0;
            defaultAudioSink.g();
        }
        if (Util.f2928a < 35 || (loudnessCodecController = this.I0) == null) {
            return;
        }
        loudnessCodecController.b(iIntValue);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return this.H0.m() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void k0(Exception exc) {
        Log.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G0;
        Handler handler = eventDispatcher.f3048a;
        if (handler != null) {
            handler.post(new d(eventDispatcher, exc, 0));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0(long j, long j2, String str) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G0;
        Handler handler = eventDispatcher.f3048a;
        if (handler != null) {
            handler.post(new e(eventDispatcher, str, j, j2, 0));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0(String str) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G0;
        Handler handler = eventDispatcher.f3048a;
        if (handler != null) {
            handler.post(new androidx.camera.core.impl.utils.futures.e(12, eventDispatcher, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation n0(FormatHolder formatHolder) {
        Format format = formatHolder.b;
        format.getClass();
        this.M0 = format;
        DecoderReuseEvaluation decoderReuseEvaluationN0 = super.n0(formatHolder);
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G0;
        Handler handler = eventDispatcher.f3048a;
        if (handler != null) {
            handler.post(new androidx.camera.core.processing.g(3, eventDispatcher, format, decoderReuseEvaluationN0));
        }
        return decoderReuseEvaluationN0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9 A[Catch: ConfigurationException -> 0x00f7, TryCatch #0 {ConfigurationException -> 0x00f7, blocks: (B:44:0x00d7, B:47:0x00df, B:49:0x00e3, B:51:0x00ec, B:54:0x00f9, B:55:0x00fc), top: B:59:0x00d7 }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(androidx.media3.common.Format r8, android.media.MediaFormat r9) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException, androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.o0(androidx.media3.common.Format, android.media.MediaFormat):void");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void p0(long j) {
        this.H0.getClass();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final MediaClock q() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void r0() {
        this.H0.L = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v0(long r1, long r3, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, androidx.media3.common.Format r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            androidx.media3.common.Format r1 = r0.N0
            r2 = 1
            if (r1 == 0) goto L13
            r1 = r8 & 2
            if (r1 == 0) goto L13
            r5.getClass()
            r5.e(r7)
            return r2
        L13:
            androidx.media3.exoplayer.audio.DefaultAudioSink r1 = r0.H0
            if (r12 == 0) goto L26
            if (r5 == 0) goto L1c
            r5.e(r7)
        L1c:
            androidx.media3.exoplayer.DecoderCounters r3 = r0.A0
            int r4 = r3.f
            int r4 = r4 + r9
            r3.f = r4
            r1.L = r2
            return r2
        L26:
            boolean r1 = r1.l(r6, r10, r9)     // Catch: androidx.media3.exoplayer.audio.AudioSink.WriteException -> L3b androidx.media3.exoplayer.audio.AudioSink.InitializationException -> L55
            if (r1 == 0) goto L39
            if (r5 == 0) goto L31
            r5.e(r7)
        L31:
            androidx.media3.exoplayer.DecoderCounters r1 = r0.A0
            int r3 = r1.e
            int r3 = r3 + r9
            r1.e = r3
            return r2
        L39:
            r1 = 0
            return r1
        L3b:
            r1 = move-exception
            boolean r2 = r0.j0
            if (r2 == 0) goto L4c
            androidx.media3.exoplayer.RendererConfiguration r2 = r0.g
            r2.getClass()
            int r2 = r2.f3023a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.e
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.D(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            androidx.media3.common.Format r2 = r0.M0
            boolean r3 = r0.j0
            if (r3 == 0) goto L68
            androidx.media3.exoplayer.RendererConfiguration r3 = r0.g
            r3.getClass()
            int r3 = r3.f3023a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.e
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.D(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.v0(long, long, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, androidx.media3.common.Format):boolean");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void y0() throws IllegalStateException, ExoPlaybackException {
        try {
            DefaultAudioSink defaultAudioSink = this.H0;
            if (!defaultAudioSink.S && defaultAudioSink.o() && defaultAudioSink.f()) {
                defaultAudioSink.s();
                defaultAudioSink.S = true;
            }
        } catch (AudioSink.WriteException e) {
            throw D(e, e.f, e.e, this.j0 ? 5003 : 5002);
        }
    }
}
