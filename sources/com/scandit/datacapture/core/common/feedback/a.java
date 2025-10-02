package com.scandit.datacapture.core.common.feedback;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.SoundPoolExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a {
    public static final FeedbackEmitter$Companion j = new FeedbackEmitter$Companion(null);
    private static final HandlerThread k;
    private static final Handler l;

    /* renamed from: a, reason: collision with root package name */
    private final Vibration f18474a;
    private final Sound b;
    private boolean c;
    private boolean d;
    private SoundPool e;
    private int f;
    private final AudioManager g;
    private final Vibrator h;
    private final int i;

    static {
        HandlerThread handlerThread = new HandlerThread("thread-feedback");
        handlerThread.start();
        k = handlerThread;
        l = new Handler(handlerThread.getLooper());
    }

    public a(Vibration vibration, Sound sound, Context context) {
        Intrinsics.h(context, "context");
        this.f18474a = vibration;
        this.b = sound;
        Object systemService = context.getSystemService("audio");
        Vibrator defaultVibrator = null;
        this.g = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService2 = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManagerJ = com.google.android.gms.common.util.a.t(systemService2) ? com.google.android.gms.common.util.a.j(systemService2) : null;
            if (vibratorManagerJ != null) {
                defaultVibrator = vibratorManagerJ.getDefaultVibrator();
            }
        } else {
            Object systemService3 = context.getSystemService("vibrator");
            if (systemService3 instanceof Vibrator) {
                defaultVibrator = (Vibrator) systemService3;
            }
        }
        this.h = defaultVibrator;
        this.i = context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName());
    }

    private static void c() {
        Intrinsics.c(Thread.currentThread(), k);
    }

    private final SoundPool d() {
        final SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(2).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.scandit.datacapture.core.common.feedback.c
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                a.a(this.f18475a, soundPoolBuild, soundPool, i, i2);
            }
        });
        return soundPoolBuild;
    }

    private final void f() {
        AudioManager audioManager;
        SoundPool soundPool;
        AudioManager audioManager2;
        if (this.d && this.c) {
            if (this.f18474a != null && this.h != null && this.i == 0 && ((audioManager2 = this.g) == null || audioManager2.getRingerMode() != 0)) {
                long jAsMillis = this.f18474a.getDuration().asMillis();
                int amplitude = this.f18474a.getAmplitude();
                Vibration vibration = this.f18474a;
                WaveFormVibration waveFormVibration = vibration instanceof WaveFormVibration ? (WaveFormVibration) vibration : null;
                this.h.vibrate(waveFormVibration != null ? waveFormVibration.getAmplitudes() != null ? VibrationEffect.createWaveform(waveFormVibration.getTimings(), waveFormVibration.getAmplitudes(), -1) : VibrationEffect.createWaveform(waveFormVibration.getTimings(), -1) : VibrationEffect.createOneShot(jAsMillis, amplitude));
            }
            if (this.f != 0 && this.e != null && (audioManager = this.g) != null && audioManager.getRingerMode() == 2 && (soundPool = this.e) != null) {
                soundPool.play(this.f, 1.0f, 1.0f, 1, 0, 1.0f);
            }
            this.d = false;
        }
    }

    public final void e() {
        c();
        this.d = true;
        f();
    }

    public final void g() {
        c();
        if (this.c) {
            return;
        }
        if (this.b == null) {
            this.c = true;
            return;
        }
        SoundPool soundPoolD = d();
        this.e = soundPoolD;
        this.f = SoundPoolExtensionsKt.load(soundPoolD, AppAndroidEnvironment.INSTANCE.getApplicationContext(), this.b);
    }

    public final void h() {
        c();
        SoundPool soundPool = this.e;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(null);
        }
        SoundPool soundPool2 = this.e;
        if (soundPool2 != null) {
            soundPool2.release();
        }
        this.e = null;
        this.f = 0;
        this.c = false;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, SoundPool soundPool, SoundPool soundPool2, int i, int i2) {
        Intrinsics.h(this$0, "this$0");
        if (Intrinsics.c(this$0.e, soundPool)) {
            this$0.c = true;
            this$0.f();
        }
    }
}
