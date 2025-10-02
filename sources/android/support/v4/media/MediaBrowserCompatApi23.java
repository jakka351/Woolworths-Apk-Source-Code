package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class MediaBrowserCompatApi23 {

    public interface ItemCallback {
    }

    public static class ItemCallbackProxy<T extends ItemCallback> extends MediaBrowser.ItemCallback {
        @Override // android.media.browse.MediaBrowser.ItemCallback
        public final void onError(String str) {
            throw null;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public final void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            mediaItem.getClass();
            mediaItem.writeToParcel(Parcel.obtain(), 0);
            throw null;
        }
    }
}
