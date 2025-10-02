package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioSink;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class AudioCapabilitiesReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3041a;
    public final i b;
    public final Handler c;
    public final AudioDeviceCallbackV23 d;
    public final BroadcastReceiver e;
    public final ExternalSurroundSoundSettingObserver f;
    public AudioCapabilities g;
    public AudioDeviceInfoApi23 h;
    public AudioAttributes i;
    public boolean j;

    @RequiresApi
    public static final class Api23 {
    }

    @RequiresApi
    public final class AudioDeviceCallbackV23 extends AudioDeviceCallback {
        public AudioDeviceCallbackV23() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f3041a, audioCapabilitiesReceiver.i, audioCapabilitiesReceiver.h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            AudioDeviceInfoApi23 audioDeviceInfoApi23 = audioCapabilitiesReceiver.h;
            int i = Util.f2928a;
            int length = audioDeviceInfoArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (Objects.equals(audioDeviceInfoArr[i2], audioDeviceInfoApi23)) {
                    audioCapabilitiesReceiver.h = null;
                    break;
                }
                i2++;
            }
            audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f3041a, audioCapabilitiesReceiver.i, audioCapabilitiesReceiver.h));
        }
    }

    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f3043a;
        public final Uri b;

        public ExternalSurroundSoundSettingObserver(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f3043a = contentResolver;
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f3041a, audioCapabilitiesReceiver.i, audioCapabilitiesReceiver.h));
        }
    }

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(AudioCapabilities.b(context, intent, audioCapabilitiesReceiver.i, audioCapabilitiesReceiver.h));
        }
    }

    public interface Listener {
    }

    public AudioCapabilitiesReceiver(Context context, i iVar, AudioAttributes audioAttributes, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        Context applicationContext = context.getApplicationContext();
        this.f3041a = applicationContext;
        this.b = iVar;
        this.i = audioAttributes;
        this.h = audioDeviceInfoApi23;
        int i = Util.f2928a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.c = handler;
        this.d = Util.f2928a >= 23 ? new AudioDeviceCallbackV23() : null;
        this.e = new HdmiAudioPlugBroadcastReceiver();
        AudioCapabilities audioCapabilities = AudioCapabilities.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new ExternalSurroundSoundSettingObserver(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(AudioCapabilities audioCapabilities) {
        RendererCapabilities.Listener listener;
        if (!this.j || audioCapabilities.equals(this.g)) {
            return;
        }
        this.g = audioCapabilities;
        DefaultAudioSink defaultAudioSink = this.b.f3068a;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = defaultAudioSink.f0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(YU.a.j("Current looper (", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        AudioCapabilities audioCapabilities2 = defaultAudioSink.w;
        if (audioCapabilities2 == null || audioCapabilities.equals(audioCapabilities2)) {
            return;
        }
        defaultAudioSink.w = audioCapabilities;
        AudioSink.Listener listener2 = defaultAudioSink.r;
        if (listener2 != null) {
            MediaCodecAudioRenderer mediaCodecAudioRenderer = MediaCodecAudioRenderer.this;
            synchronized (mediaCodecAudioRenderer.d) {
                listener = mediaCodecAudioRenderer.t;
            }
            if (listener != null) {
                listener.a(mediaCodecAudioRenderer);
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.h;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.f3045a)) {
            return;
        }
        AudioDeviceInfoApi23 audioDeviceInfoApi232 = audioDeviceInfo != null ? new AudioDeviceInfoApi23(audioDeviceInfo) : null;
        this.h = audioDeviceInfoApi232;
        a(AudioCapabilities.c(this.f3041a, this.i, audioDeviceInfoApi232));
    }
}
