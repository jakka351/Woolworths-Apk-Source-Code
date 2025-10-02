package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface AnalyticsListener {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface EventFlags {
    }

    @UnstableApi
    public static final class EventTime {

        /* renamed from: a, reason: collision with root package name */
        public final long f3028a;
        public final Timeline b;
        public final int c;
        public final MediaSource.MediaPeriodId d;
        public final long e;
        public final Timeline f;
        public final int g;
        public final MediaSource.MediaPeriodId h;
        public final long i;
        public final long j;

        public EventTime(long j, Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId, long j2, Timeline timeline2, int i2, MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.f3028a = j;
            this.b = timeline;
            this.c = i;
            this.d = mediaPeriodId;
            this.e = j2;
            this.f = timeline2;
            this.g = i2;
            this.h = mediaPeriodId2;
            this.i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTime.class == obj.getClass()) {
                EventTime eventTime = (EventTime) obj;
                if (this.f3028a == eventTime.f3028a && this.c == eventTime.c && this.e == eventTime.e && this.g == eventTime.g && this.i == eventTime.i && this.j == eventTime.j && Objects.equals(this.b, eventTime.b) && Objects.equals(this.d, eventTime.d) && Objects.equals(this.f, eventTime.f) && Objects.equals(this.h, eventTime.h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f3028a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    @UnstableApi
    public static final class Events {

        /* renamed from: a, reason: collision with root package name */
        public final FlagSet f3029a;
        public final SparseArray b;

        public Events(FlagSet flagSet, SparseArray sparseArray) {
            this.f3029a = flagSet;
            SparseBooleanArray sparseBooleanArray = flagSet.f2852a;
            SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                int iA = flagSet.a(i);
                EventTime eventTime = (EventTime) sparseArray.get(iA);
                eventTime.getClass();
                sparseArray2.append(iA, eventTime);
            }
            this.b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.f3029a.f2852a.get(i);
        }

        public final EventTime b(int i) {
            EventTime eventTime = (EventTime) this.b.get(i);
            eventTime.getClass();
            return eventTime;
        }
    }

    default void A(EventTime eventTime) {
    }

    default void B(EventTime eventTime, Metadata metadata) {
    }

    default void C(EventTime eventTime, boolean z) {
    }

    default void D(EventTime eventTime, PlaybackException playbackException) {
    }

    default void E(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void F(EventTime eventTime) {
    }

    default void G(EventTime eventTime, Format format) {
    }

    default void H(EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }

    default void I(EventTime eventTime, int i) {
    }

    default void J(EventTime eventTime, float f) {
    }

    default void K(EventTime eventTime, int i, long j, long j2) {
    }

    default void L(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void M(EventTime eventTime, String str) {
    }

    default void N(EventTime eventTime, String str) {
    }

    default void O(EventTime eventTime, int i, int i2, boolean z) {
    }

    default void P(EventTime eventTime) {
    }

    default void Q(EventTime eventTime, int i) {
    }

    default void R(EventTime eventTime, String str) {
    }

    default void a(EventTime eventTime, boolean z) {
    }

    default void b(EventTime eventTime, boolean z, int i) {
    }

    default void c(EventTime eventTime, Format format) {
    }

    default void d(EventTime eventTime) {
    }

    default void e(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, EventTime eventTime) {
    }

    default void f(EventTime eventTime, Exception exc) {
    }

    default void g(EventTime eventTime, int i) {
    }

    default void h(EventTime eventTime, int i, int i2) {
    }

    default void i(EventTime eventTime, int i) {
    }

    default void j(EventTime eventTime, boolean z) {
    }

    default void k(EventTime eventTime, int i) {
    }

    default void l(EventTime eventTime, int i) {
    }

    default void m(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    default void n(EventTime eventTime, String str) {
    }

    default void o(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void p(EventTime eventTime, int i) {
    }

    default void q(int i, long j, EventTime eventTime) {
    }

    default void r(EventTime eventTime, int i) {
    }

    default void s(EventTime eventTime) {
    }

    default void t(EventTime eventTime, Tracks tracks) {
    }

    default void u(EventTime eventTime, VideoSize videoSize) {
    }

    default void v(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void w(Player player, Events events) {
    }

    default void x(EventTime eventTime) {
    }

    default void y(EventTime eventTime, boolean z) {
    }

    default void z(EventTime eventTime, Object obj) {
    }
}
