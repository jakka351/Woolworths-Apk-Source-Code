package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompatApi21;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi
/* loaded from: classes2.dex */
class MediaBrowserCompatApi26 {

    public interface SubscriptionCallback extends MediaBrowserCompatApi21.SubscriptionCallback {
    }

    public static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowserCompatApi21.SubscriptionCallbackProxy<T> {
        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onChildrenLoaded(String str, List list, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onError(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            throw null;
        }
    }
}
