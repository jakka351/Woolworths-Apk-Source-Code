package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.AudioBecomingNoisyManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        this.d = 3;
        this.e = playerMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AudioBecomingNoisyManager audioBecomingNoisyManager = (AudioBecomingNoisyManager) this.e;
                audioBecomingNoisyManager.f2990a.unregisterReceiver(audioBecomingNoisyManager.b);
                return;
            case 1:
                AudioBecomingNoisyManager.AudioBecomingNoisyReceiver audioBecomingNoisyReceiver = (AudioBecomingNoisyManager.AudioBecomingNoisyReceiver) this.e;
                if (audioBecomingNoisyReceiver.c.d) {
                    audioBecomingNoisyReceiver.f2991a.z();
                    return;
                }
                return;
            case 2:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.e;
                BackgroundThreadStateHandler backgroundThreadStateHandler = exoPlayerImpl.F;
                Context context = exoPlayerImpl.e;
                int i = Util.f2928a;
                Integer numValueOf = Integer.valueOf(AudioManagerCompat.a(context).generateAudioSessionId());
                backgroundThreadStateHandler.getClass();
                backgroundThreadStateHandler.b.post(new androidx.media3.common.util.c(2, backgroundThreadStateHandler, numValueOf));
                return;
            default:
                PlayerMessage playerMessage = (PlayerMessage) this.e;
                int i2 = ExoPlayerImplInternal.f0;
                try {
                    synchronized (playerMessage) {
                    }
                    try {
                        playerMessage.f3022a.i(playerMessage.c, playerMessage.d);
                        return;
                    } finally {
                        playerMessage.a(true);
                    }
                } catch (ExoPlaybackException e) {
                    Log.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
        }
    }

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
