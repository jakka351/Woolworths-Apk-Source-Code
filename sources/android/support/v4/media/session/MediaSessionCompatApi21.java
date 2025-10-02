package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class MediaSessionCompatApi21 {

    public interface Callback {
    }

    public static class CallbackProxy<T extends Callback> extends MediaSession.Callback {
        @Override // android.media.session.MediaSession.Callback
        public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onFastForward() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final boolean onMediaButtonEvent(Intent intent) {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPause() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlay() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onRewind() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSeekTo(long j) {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSetRating(Rating rating) {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSkipToNext() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSkipToPrevious() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSkipToQueueItem(long j) {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onStop() {
            throw null;
        }
    }

    public static class QueueItem {
    }
}
