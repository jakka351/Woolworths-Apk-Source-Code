package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.video.e;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public interface PreviewingVideoGraph extends VideoGraph {

    public interface Factory {
        PreviewingVideoGraph a(Context context, ColorInfo colorInfo, VideoGraph.Listener listener, e eVar, VideoCompositorSettings videoCompositorSettings, List list);
    }
}
