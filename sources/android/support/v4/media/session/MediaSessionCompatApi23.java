package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompatApi21;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class MediaSessionCompatApi23 {

    public interface Callback extends MediaSessionCompatApi21.Callback {
    }

    public static class CallbackProxy<T extends Callback> extends MediaSessionCompatApi21.CallbackProxy<T> {
        @Override // android.media.session.MediaSession.Callback
        public final void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }
    }
}
