package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class MediaDrmCallbackException extends IOException {
    public final Map d;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.d = map;
    }
}
