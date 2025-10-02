package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public interface ProgressiveMediaExtractor {

    public interface Factory {
        ProgressiveMediaExtractor a(PlayerId playerId);
    }

    void a(long j, long j2);

    long b();

    void c(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput);

    void d();

    int e(PositionHolder positionHolder);

    void release();
}
