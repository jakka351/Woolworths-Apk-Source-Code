package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.audio.AudioFocusRequestCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.AudioFocusManager;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
final class AudioFocusManager {

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f2992a;
    public final Handler b;
    public PlayerControl c;
    public AudioAttributes d;
    public int f;
    public AudioFocusRequestCompat h;
    public float g = 1.0f;
    public int e = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
    }

    public AudioFocusManager(Context context, Looper looper, PlayerControl playerControl) {
        this.f2992a = Suppliers.a(new c(context, 0));
        this.c = playerControl;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f2992a.get();
        AudioFocusRequestCompat audioFocusRequestCompat = this.h;
        if (Util.f2928a < 26) {
            audioManager.abandonAudioFocus(audioFocusRequestCompat.b);
            return;
        }
        AudioFocusRequest audioFocusRequest = audioFocusRequestCompat.f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        PlayerControl playerControl = this.c;
        if (playerControl != null) {
            ((ExoPlayerImplInternal) playerControl).k.j(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        int iRequestAudioFocus;
        AudioFocusRequestCompat.Builder builder;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        if (!z) {
            int i3 = this.e;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            AudioFocusRequestCompat audioFocusRequestCompat = this.h;
            if (audioFocusRequestCompat == null) {
                if (audioFocusRequestCompat == null) {
                    builder = new AudioFocusRequestCompat.Builder();
                    builder.b = AudioAttributes.b;
                    builder.f2889a = i2;
                } else {
                    AudioFocusRequestCompat.Builder builder2 = new AudioFocusRequestCompat.Builder();
                    builder2.f2889a = audioFocusRequestCompat.f2888a;
                    builder2.b = audioFocusRequestCompat.d;
                    builder2.c = audioFocusRequestCompat.e;
                    builder = builder2;
                }
                AudioAttributes audioAttributes = this.d;
                audioAttributes.getClass();
                builder.b = audioAttributes;
                builder.c = false;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        AudioFocusManager audioFocusManager = this.f3070a;
                        audioFocusManager.getClass();
                        if (i4 == -3 || i4 == -2) {
                            if (i4 != -2) {
                                audioFocusManager.b(4);
                                return;
                            }
                            AudioFocusManager.PlayerControl playerControl = audioFocusManager.c;
                            if (playerControl != null) {
                                ((ExoPlayerImplInternal) playerControl).k.e(33, 0, 0).a();
                            }
                            audioFocusManager.b(3);
                            return;
                        }
                        if (i4 == -1) {
                            AudioFocusManager.PlayerControl playerControl2 = audioFocusManager.c;
                            if (playerControl2 != null) {
                                ((ExoPlayerImplInternal) playerControl2).k.e(33, -1, 0).a();
                            }
                            audioFocusManager.a();
                            audioFocusManager.b(1);
                            return;
                        }
                        if (i4 != 1) {
                            androidx.compose.ui.input.pointer.a.t(i4, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        audioFocusManager.b(2);
                        AudioFocusManager.PlayerControl playerControl3 = audioFocusManager.c;
                        if (playerControl3 != null) {
                            ((ExoPlayerImplInternal) playerControl3).k.e(33, 1, 0).a();
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new AudioFocusRequestCompat(builder.f2889a, onAudioFocusChangeListener, handler, builder.b, builder.c);
            }
            AudioManager audioManager = (AudioManager) this.f2992a.get();
            AudioFocusRequestCompat audioFocusRequestCompat2 = this.h;
            if (Util.f2928a >= 26) {
                AudioFocusRequest audioFocusRequest = audioFocusRequestCompat2.f;
                audioFocusRequest.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = audioFocusRequestCompat2.b;
                audioFocusRequestCompat2.d.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, 3, audioFocusRequestCompat2.f2888a);
            }
            if (iRequestAudioFocus == 1) {
                b(2);
                return 1;
            }
            b(1);
            return -1;
        }
        return 1;
    }
}
