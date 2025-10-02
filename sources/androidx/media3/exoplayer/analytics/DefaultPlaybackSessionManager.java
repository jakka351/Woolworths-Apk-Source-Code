package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.HashMap;
import java.util.Random;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final androidx.media3.datasource.a h = new androidx.media3.datasource.a(1);
    public static final Random i = new Random();
    public MediaMetricsListener d;
    public String f;

    /* renamed from: a, reason: collision with root package name */
    public final Timeline.Window f3031a = new Timeline.Window();
    public final Timeline.Period b = new Timeline.Period();
    public final HashMap c = new HashMap();
    public Timeline e = Timeline.f2876a;
    public long g = -1;

    public final class SessionDescriptor {

        /* renamed from: a, reason: collision with root package name */
        public final String f3032a;
        public int b;
        public long c;
        public final MediaSource.MediaPeriodId d;
        public boolean e;
        public boolean f;

        public SessionDescriptor(String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f3032a = str;
            this.b = i;
            this.c = mediaPeriodId == null ? -1L : mediaPeriodId.d;
            if (mediaPeriodId == null || !mediaPeriodId.b()) {
                return;
            }
            this.d = mediaPeriodId;
        }

        public final boolean a(AnalyticsListener.EventTime eventTime) {
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
            Timeline timeline = eventTime.b;
            if (mediaPeriodId == null) {
                return this.b != eventTime.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (mediaPeriodId.d > j) {
                return true;
            }
            MediaSource.MediaPeriodId mediaPeriodId2 = this.d;
            if (mediaPeriodId2 == null) {
                return false;
            }
            int i = mediaPeriodId2.b;
            int iB = timeline.b(mediaPeriodId.f3130a);
            int iB2 = timeline.b(mediaPeriodId2.f3130a);
            if (mediaPeriodId.d < mediaPeriodId2.d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!mediaPeriodId.b()) {
                int i2 = mediaPeriodId.e;
                return i2 == -1 || i2 > i;
            }
            int i3 = mediaPeriodId.b;
            int i4 = mediaPeriodId.c;
            if (i3 <= i) {
                return i3 == i && i4 > mediaPeriodId2.c;
            }
            return true;
        }

        public final boolean b(Timeline timeline, Timeline timeline2) {
            MediaSource.MediaPeriodId mediaPeriodId;
            int i = this.b;
            if (i < timeline.o()) {
                DefaultPlaybackSessionManager defaultPlaybackSessionManager = DefaultPlaybackSessionManager.this;
                Timeline.Window window = defaultPlaybackSessionManager.f3031a;
                timeline.n(i, window);
                for (int i2 = window.m; i2 <= window.n; i2++) {
                    int iB = timeline2.b(timeline.l(i2));
                    if (iB != -1) {
                        i = timeline2.f(iB, defaultPlaybackSessionManager.b, false).c;
                        break;
                    }
                }
                i = -1;
            } else if (i >= timeline2.o()) {
                i = -1;
            }
            this.b = i;
            return i != -1 && ((mediaPeriodId = this.d) == null || timeline2.b(mediaPeriodId.f3130a) != -1);
        }
    }

    public final void a(SessionDescriptor sessionDescriptor) {
        long j = sessionDescriptor.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor b(int r19, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$SessionDescriptor r8 = (androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r8
            long r9 = r8.c
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.d
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager r14 = androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this
            java.util.HashMap r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$SessionDescriptor r12 = (androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r12
            if (r12 == 0) goto L4b
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            int r9 = androidx.media3.common.util.Util.f2928a
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        L9b:
            r5 = r8
            r6 = r9
            goto L16
        L9f:
            if (r5 != 0) goto Lb1
            androidx.media3.datasource.a r4 = androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$SessionDescriptor r5 = new androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$SessionDescriptor
            r5.<init>(r4, r1, r2)
            r3.put(r4, r5)
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.b(int, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager$SessionDescriptor");
    }

    public final synchronized String c(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return b(timeline.g(mediaPeriodId.f3130a, this.b).c, mediaPeriodId).f3032a;
    }

    public final void d(AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId;
        Timeline timeline = eventTime.b;
        int i2 = eventTime.c;
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.d;
        boolean zP = timeline.p();
        HashMap map = this.c;
        if (zP) {
            String str = this.f;
            if (str != null) {
                SessionDescriptor sessionDescriptor = (SessionDescriptor) map.get(str);
                sessionDescriptor.getClass();
                a(sessionDescriptor);
                return;
            }
            return;
        }
        SessionDescriptor sessionDescriptor2 = (SessionDescriptor) map.get(this.f);
        this.f = b(i2, mediaPeriodId2).f3032a;
        e(eventTime);
        if (mediaPeriodId2 != null) {
            long j = mediaPeriodId2.d;
            if (mediaPeriodId2.b()) {
                if (sessionDescriptor2 != null && sessionDescriptor2.c == j && (mediaPeriodId = sessionDescriptor2.d) != null && mediaPeriodId.b == mediaPeriodId2.b && mediaPeriodId.c == mediaPeriodId2.c) {
                    return;
                }
                b(i2, new MediaSource.MediaPeriodId(mediaPeriodId2.f3130a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.e(androidx.media3.exoplayer.analytics.AnalyticsListener$EventTime):void");
    }
}
