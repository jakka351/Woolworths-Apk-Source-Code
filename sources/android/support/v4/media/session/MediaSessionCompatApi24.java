package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompatApi23;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class MediaSessionCompatApi24 {

    public interface Callback extends MediaSessionCompatApi23.Callback {
    }

    public static class CallbackProxy<T extends Callback> extends MediaSessionCompatApi23.CallbackProxy<T> {
        @Override // android.media.session.MediaSession.Callback
        public final void onPrepare() {
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }
    }
}
