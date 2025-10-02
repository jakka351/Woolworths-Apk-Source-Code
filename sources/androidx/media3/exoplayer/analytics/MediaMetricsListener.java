package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    public int A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3033a;
    public final DefaultPlaybackSessionManager c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public PendingFormatUpdate p;
    public PendingFormatUpdate q;
    public PendingFormatUpdate r;
    public Format s;
    public Format t;
    public Format u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = BackgroundExecutor.a();
    public final Timeline.Window f = new Timeline.Window();
    public final Timeline.Period g = new Timeline.Period();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public static final class ErrorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f3034a;
        public final int b;

        public ErrorInfo(int i, int i2) {
            this.f3034a = i;
            this.b = i2;
        }
    }

    public static final class PendingFormatUpdate {

        /* renamed from: a, reason: collision with root package name */
        public final Format f3035a;
        public final int b;
        public final String c;

        public PendingFormatUpdate(Format format, int i, String str) {
            this.f3035a = format;
            this.b = i;
            this.c = str;
        }
    }

    public MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.f3033a = context.getApplicationContext();
        this.d = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.c = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.d = this;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void D(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.o = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void E(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.y += decoderCounters.g;
        this.z += decoderCounters.e;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
        this.w = mediaLoadData.f3126a;
    }

    public final boolean S(PendingFormatUpdate pendingFormatUpdate) {
        String str;
        if (pendingFormatUpdate == null) {
            return false;
        }
        String str2 = pendingFormatUpdate.c;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.c;
        synchronized (defaultPlaybackSessionManager) {
            str = defaultPlaybackSessionManager.f;
        }
        return str2.equals(str);
    }

    public final void T() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new androidx.camera.core.impl.utils.futures.e(10, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void U(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (mediaPeriodId == null || (iB = timeline.b(mediaPeriodId.f3130a)) == -1) {
            return;
        }
        Timeline.Period period = this.g;
        int i = 0;
        timeline.f(iB, period, false);
        int i2 = period.c;
        Timeline.Window window = this.f;
        timeline.n(i2, window);
        MediaItem.LocalConfiguration localConfiguration = window.c.b;
        if (localConfiguration != null) {
            int iC = Util.C(localConfiguration.f2863a, localConfiguration.b);
            i = iC != 0 ? iC != 1 ? iC != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (window.l != -9223372036854775807L && !window.j && !window.h && !window.a()) {
            builder.setMediaDurationMillis(Util.U(window.l));
        }
        builder.setPlaybackType(window.a() ? 2 : 1);
        this.B = true;
    }

    public final void V(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if ((mediaPeriodId == null || !mediaPeriodId.b()) && str.equals(this.j)) {
            T();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void W(int i, long j, Format format, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = androidx.core.splashscreen.a.g(i).setTimeSinceCreatedMillis(j - this.e);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = format.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = format.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = format.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = format.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = format.D;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = format.E;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = format.d;
            if (str4 != null) {
                int i9 = Util.f2928a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = format.w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new androidx.camera.core.impl.utils.futures.e(7, this, timeSinceCreatedMillis.build()));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void e(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener.EventTime eventTime) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void q(int i, long j, AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            String strC = this.c.c(eventTime.b, mediaPeriodId);
            HashMap map = this.i;
            Long l = (Long) map.get(strC);
            HashMap map2 = this.h;
            Long l2 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void u(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        PendingFormatUpdate pendingFormatUpdate = this.p;
        if (pendingFormatUpdate != null) {
            Format format = pendingFormatUpdate.f3035a;
            if (format.v == -1) {
                Format.Builder builderA = format.a();
                builderA.t = videoSize.f2887a;
                builderA.u = videoSize.b;
                this.p = new PendingFormatUpdate(new Format(builderA), pendingFormatUpdate.b, pendingFormatUpdate.c);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void v(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId == null) {
            return;
        }
        Format format = mediaLoadData.c;
        format.getClass();
        int i = mediaLoadData.d;
        Timeline timeline = eventTime.b;
        mediaPeriodId.getClass();
        PendingFormatUpdate pendingFormatUpdate = new PendingFormatUpdate(format, i, this.c.c(timeline, mediaPeriodId));
        int i2 = mediaLoadData.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = pendingFormatUpdate;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = pendingFormatUpdate;
                return;
            }
        }
        this.p = pendingFormatUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05e4 A[PHI: r2
  0x05e4: PHI (r2v28 int) = (r2v26 int), (r2v25 int) binds: [B:376:0x05fa, B:366:0x05e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.media3.common.Player r28, androidx.media3.exoplayer.analytics.AnalyticsListener.Events r29) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.MediaMetricsListener.w(androidx.media3.common.Player, androidx.media3.exoplayer.analytics.AnalyticsListener$Events):void");
    }
}
