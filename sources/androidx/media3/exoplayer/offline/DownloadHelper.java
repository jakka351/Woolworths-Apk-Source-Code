package androidx.media3.exoplayer.offline;

import android.os.Handler;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class DownloadHelper {

    public interface Callback {
    }

    public static final class DownloadTrackSelection extends BaseTrackSelection {

        public static final class Factory implements ExoTrackSelection.Factory {
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int a() {
            return 0;
        }
    }

    public static final class FakeBandwidthMeter implements BandwidthMeter {
        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public final void a(BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public final void e(Handler handler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public final TransferListener f() {
            return null;
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        public Timeline d;
        public MediaPeriod[] e;

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public final void C(BaseMediaSource baseMediaSource, Timeline timeline) {
            if (this.d != null) {
                return;
            }
            if (timeline.m(0, new Timeline.Window(), 0L).a()) {
                new LiveContentUnsupportedException();
                throw null;
            }
            this.d = timeline;
            int iH = timeline.h();
            MediaPeriod[] mediaPeriodArr = new MediaPeriod[iH];
            this.e = mediaPeriodArr;
            if (iH > 0) {
                timeline.l(0);
                throw null;
            }
            for (int i = 0; i < iH; i++) {
                mediaPeriodArr[i].s(this, 0L);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void g(SequenceableLoader sequenceableLoader) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            throw null;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L28
                r1 = 2
                if (r0 == r1) goto L21
                r1 = 3
                if (r0 == r1) goto L1c
                r4 = 4
                r1 = 0
                if (r0 == r4) goto L11
                return r1
            L11:
                androidx.media3.exoplayer.source.MediaPeriod[] r4 = r3.e
                if (r4 == 0) goto L1b
                int r0 = r4.length
                if (r0 <= 0) goto L1b
                r4 = r4[r1]
                throw r2
            L1b:
                throw r2
            L1c:
                java.lang.Object r4 = r4.obj
                androidx.media3.exoplayer.source.MediaPeriod r4 = (androidx.media3.exoplayer.source.MediaPeriod) r4
                throw r2
            L21:
                androidx.media3.exoplayer.source.MediaPeriod[] r4 = r3.e     // Catch: java.io.IOException -> L27
                if (r4 != 0) goto L26
                throw r2
            L26:
                throw r2
            L27:
                throw r2
            L28:
                int r4 = androidx.media3.exoplayer.analytics.PlayerId.d
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer.handleMessage(android.os.Message):boolean");
        }
    }

    public static final class UnreleaseableRendererCapabilitiesList implements RendererCapabilitiesList {
    }

    static {
        DefaultTrackSelector.Parameters parameters = DefaultTrackSelector.Parameters.F;
        parameters.getClass();
        DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
        builder.s = true;
        builder.z = false;
        new DefaultTrackSelector.Parameters(builder);
    }
}
