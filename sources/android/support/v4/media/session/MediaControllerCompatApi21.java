package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi
/* loaded from: classes2.dex */
class MediaControllerCompatApi21 {

    public interface Callback {
    }

    public static class CallbackProxy<T extends Callback> extends MediaController.Callback {
        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001f. Please report as an issue. */
        @Override // android.media.session.MediaController.Callback
        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            int usage;
            playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if ((audioAttributes.getFlags() & 1) != 1 && (audioAttributes.getFlags() & 4) != 4 && (usage = audioAttributes.getUsage()) != 13) {
                switch (usage) {
                }
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List list) {
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionDestroyed() {
            throw null;
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }
    }

    public static class PlaybackInfo {
    }

    public static class TransportControls {
    }
}
