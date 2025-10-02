package androidx.media3.exoplayer.source;

import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final OutputConsumerAdapterV30 f3127a;
    public final InputReaderAdapterV30 b;
    public final MediaParser c;
    public String d;

    public static final class Factory implements ProgressiveMediaExtractor.Factory {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f3128a = new HashMap();

        @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public final ProgressiveMediaExtractor a(PlayerId playerId) {
            return new MediaParserExtractorAdapter(playerId, f3128a);
        }
    }

    public MediaParserExtractorAdapter(PlayerId playerId, Map map) {
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        this.f3127a = outputConsumerAdapterV30;
        this.b = new InputReaderAdapterV30();
        MediaParser mediaParserCreate = MediaParser.create(outputConsumerAdapterV30, new String[0]);
        this.c = mediaParserCreate;
        mediaParserCreate.setParameter("android.media.mediaparser.eagerlyExposeTrackType", Boolean.TRUE);
        mediaParserCreate.setParameter("android.media.mediaparser.inBandCryptoInfo", Boolean.TRUE);
        mediaParserCreate.setParameter("android.media.mediaparser.includeSupplementalData", Boolean.TRUE);
        for (Map.Entry entry : map.entrySet()) {
            this.c.setParameter((String) entry.getKey(), entry.getValue());
        }
        this.d = "android.media.mediaparser.UNKNOWN";
        if (Util.f2928a >= 31) {
            MediaParser mediaParser = this.c;
            LogSessionId logSessionIdA = playerId.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionIdA);
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void a(long j, long j2) {
        this.b.c = j;
        MediaParser.SeekMap seekMap = this.f3127a.g;
        Pair seekPoints = seekMap != null ? seekMap.getSeekPoints(j2) : OutputConsumerAdapterV30.n;
        this.c.seek(f.l(f.l(seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final long b() {
        return this.b.c;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void c(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = this.f3127a;
        outputConsumerAdapterV30.f = extractorOutput;
        InputReaderAdapterV30 inputReaderAdapterV30 = this.b;
        inputReaderAdapterV30.f3154a = dataSource;
        inputReaderAdapterV30.b = j2;
        inputReaderAdapterV30.d = -1L;
        inputReaderAdapterV30.c = j;
        String parserName = this.c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.c.advance(inputReaderAdapterV30);
            String parserName2 = this.c.getParserName();
            this.d = parserName2;
            outputConsumerAdapterV30.c(parserName2);
            return;
        }
        if (parserName.equals(this.d)) {
            return;
        }
        String parserName3 = this.c.getParserName();
        this.d = parserName3;
        outputConsumerAdapterV30.c(parserName3);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void d() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.d)) {
            this.f3127a.m = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final int e(PositionHolder positionHolder) throws IOException {
        MediaParser mediaParser = this.c;
        InputReaderAdapterV30 inputReaderAdapterV30 = this.b;
        boolean zAdvance = mediaParser.advance(inputReaderAdapterV30);
        long j = inputReaderAdapterV30.d;
        inputReaderAdapterV30.d = -1L;
        positionHolder.f3248a = j;
        if (zAdvance) {
            return j != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void release() {
        this.c.release();
    }
}
