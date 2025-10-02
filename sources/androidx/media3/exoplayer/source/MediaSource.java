package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;

/* loaded from: classes2.dex */
public interface MediaSource {

    public interface Factory {

        /* renamed from: a, reason: collision with root package name */
        public static final Factory f3129a = MediaSourceFactory.b;

        default void a(boolean z) {
        }

        MediaSource b(MediaItem mediaItem);

        default void c() {
        }

        default void d(DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        }
    }

    @UnstableApi
    public static final class MediaPeriodId {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3130a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public MediaPeriodId(Object obj) {
            this(obj, -1L);
        }

        public final MediaPeriodId a(Object obj) {
            if (this.f3130a.equals(obj)) {
                return this;
            }
            return new MediaPeriodId(obj, this.b, this.c, this.d, this.e);
        }

        public final boolean b() {
            return this.b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodId)) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            return this.f3130a.equals(mediaPeriodId.f3130a) && this.b == mediaPeriodId.b && this.c == mediaPeriodId.c && this.d == mediaPeriodId.d && this.e == mediaPeriodId.e;
        }

        public final int hashCode() {
            return ((((((android.support.v4.media.session.a.e(527, 31, this.f3130a) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public MediaPeriodId(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public MediaPeriodId(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public MediaPeriodId(Object obj, int i, int i2, long j, int i3) {
            this.f3130a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }
    }

    @UnstableApi
    public interface MediaSourceCaller {
        void C(BaseMediaSource baseMediaSource, Timeline timeline);
    }

    default Timeline B() {
        return null;
    }

    void D(MediaSourceEventListener mediaSourceEventListener);

    MediaPeriod E(MediaPeriodId mediaPeriodId, Allocator allocator, long j);

    void G(DrmSessionEventListener drmSessionEventListener);

    void I(MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId);

    void K(MediaSourceCaller mediaSourceCaller);

    default void L(MediaItem mediaItem) {
    }

    void N(MediaSourceCaller mediaSourceCaller);

    default boolean O() {
        return !(this instanceof ConcatenatingMediaSource);
    }

    void a(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    MediaItem o();

    void q(Handler handler, DrmSessionEventListener drmSessionEventListener);

    void t(MediaPeriod mediaPeriod);

    void u(MediaSourceCaller mediaSourceCaller);

    void z();
}
