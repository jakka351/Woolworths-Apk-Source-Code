package androidx.media3.common.audio;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class AudioFocusRequestCompat {

    /* renamed from: a, reason: collision with root package name */
    public final int f2888a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final AudioAttributes d;
    public final boolean e;
    public final AudioFocusRequest f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f2889a;
        public AudioAttributes b;
        public boolean c;
    }

    public static class OnAudioFocusChangeListenerHandlerCompat implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f2890a;
        public final AudioManager.OnAudioFocusChangeListener b;

        public OnAudioFocusChangeListenerHandlerCompat(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.b = onAudioFocusChangeListener;
            Looper looper = handler.getLooper();
            int i = Util.f2928a;
            this.f2890a = new Handler(looper, null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            Util.L(this.f2890a, new Runnable() { // from class: androidx.media3.common.audio.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b.onAudioFocusChange(i);
                }
            });
        }
    }

    public AudioFocusRequestCompat(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributes audioAttributes, boolean z) {
        this.f2888a = i;
        this.c = handler;
        this.d = audioAttributes;
        this.e = z;
        int i2 = Util.f2928a;
        if (i2 < 26) {
            this.b = new OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes.a().f2846a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusRequestCompat)) {
            return false;
        }
        AudioFocusRequestCompat audioFocusRequestCompat = (AudioFocusRequestCompat) obj;
        return this.f2888a == audioFocusRequestCompat.f2888a && this.e == audioFocusRequestCompat.e && Objects.equals(this.b, audioFocusRequestCompat.b) && Objects.equals(this.c, audioFocusRequestCompat.c) && Objects.equals(this.d, audioFocusRequestCompat.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2888a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
