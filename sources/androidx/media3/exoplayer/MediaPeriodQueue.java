package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class MediaPeriodQueue {
    public final AnalyticsCollector c;
    public final HandlerWrapper d;
    public final f e;
    public long f;
    public int g;
    public boolean h;
    public ExoPlayer.PreloadConfiguration i;
    public MediaPeriodHolder j;
    public MediaPeriodHolder k;
    public MediaPeriodHolder l;
    public MediaPeriodHolder m;
    public MediaPeriodHolder n;
    public int o;
    public Object p;
    public long q;

    /* renamed from: a, reason: collision with root package name */
    public final Timeline.Period f3015a = new Timeline.Period();
    public final Timeline.Window b = new Timeline.Window();
    public ArrayList r = new ArrayList();

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, f fVar, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.c = analyticsCollector;
        this.d = handlerWrapper;
        this.e = fVar;
        this.i = preloadConfiguration;
    }

    public static MediaSource.MediaPeriodId p(Timeline timeline, Object obj, long j, long j2, Timeline.Window window, Timeline.Period period) {
        timeline.g(obj, period);
        timeline.n(period.c, window);
        timeline.b(obj);
        int i = period.g.f2843a;
        if (i != 0) {
            if (i == 1) {
                period.f(0);
            }
            period.g.getClass();
            period.g(0);
        }
        timeline.g(obj, period);
        int iC = period.c(j);
        return iC == -1 ? new MediaSource.MediaPeriodId(obj, j2, period.b(j)) : new MediaSource.MediaPeriodId(obj, iC, period.e(iC), j2, -1);
    }

    public final MediaPeriodHolder a() {
        MediaPeriodHolder mediaPeriodHolder = this.j;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.k) {
            this.k = mediaPeriodHolder.m;
        }
        if (mediaPeriodHolder == this.l) {
            this.l = mediaPeriodHolder.m;
        }
        mediaPeriodHolder.i();
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.m = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.j;
            this.p = mediaPeriodHolder2.b;
            this.q = mediaPeriodHolder2.g.f3014a.d;
        }
        this.j = this.j.m;
        l();
        return this.j;
    }

    public final void b() {
        if (this.o == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = this.j;
        Assertions.g(mediaPeriodHolder);
        this.p = mediaPeriodHolder.b;
        this.q = mediaPeriodHolder.g.f3014a.d;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.i();
            mediaPeriodHolder = mediaPeriodHolder.m;
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        l();
    }

    public final MediaPeriodInfo c(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j) {
        long j2;
        Timeline.Period period;
        Timeline timeline2;
        Object obj;
        long j3;
        long j4;
        long j5;
        long jR;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.g;
        long j6 = (mediaPeriodHolder.p + mediaPeriodInfo.e) - j;
        if (!mediaPeriodInfo.h) {
            MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f3014a;
            Object obj2 = mediaPeriodId.f3130a;
            int i = mediaPeriodId.e;
            Timeline.Period period2 = this.f3015a;
            timeline.g(obj2, period2);
            boolean z = mediaPeriodInfo.g;
            if (!mediaPeriodId.b()) {
                if (i != -1) {
                    period2.f(i);
                }
                int iE = period2.e(i);
                period2.g(i);
                if (iE != period2.g.a(i).f2844a) {
                    return e(timeline, mediaPeriodId.f3130a, mediaPeriodId.e, iE, mediaPeriodInfo.e, mediaPeriodId.d, z);
                }
                timeline.g(obj2, period2);
                period2.d(i);
                period2.g.a(i).getClass();
                return f(timeline, mediaPeriodId.f3130a, 0L, mediaPeriodInfo.e, mediaPeriodId.d, false);
            }
            int i2 = mediaPeriodId.b;
            int i3 = period2.g.a(i2).f2844a;
            if (i3 == -1) {
                return null;
            }
            int iA = period2.g.a(i2).a(mediaPeriodId.c);
            if (iA < i3) {
                return e(timeline, mediaPeriodId.f3130a, i2, iA, mediaPeriodInfo.c, mediaPeriodId.d, z);
            }
            long jLongValue = mediaPeriodInfo.c;
            if (jLongValue == -9223372036854775807L) {
                int i4 = period2.c;
                long jMax = Math.max(0L, j6);
                j2 = 0;
                Pair pairJ = timeline.j(this.b, period2, i4, -9223372036854775807L, jMax);
                period = period2;
                timeline2 = timeline;
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                j2 = 0;
                period = period2;
                timeline2 = timeline;
            }
            int i5 = mediaPeriodId.b;
            timeline2.g(obj2, period);
            period.d(i5);
            period.g.a(i5).getClass();
            return f(timeline, mediaPeriodId.f3130a, Math.max(j2, jLongValue), mediaPeriodInfo.c, mediaPeriodId.d, z);
        }
        MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.g;
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodInfo2.f3014a;
        long j7 = mediaPeriodInfo2.c;
        int iD = timeline.d(timeline.b(mediaPeriodId2.f3130a), this.f3015a, this.b, this.g, this.h);
        if (iD != -1) {
            Timeline.Period period3 = this.f3015a;
            int i6 = timeline.f(iD, period3, true).c;
            Object obj3 = period3.b;
            obj3.getClass();
            long j8 = mediaPeriodId2.d;
            if (timeline.m(i6, this.b, 0L).m == iD) {
                Pair pairJ2 = timeline.j(this.b, this.f3015a, i6, -9223372036854775807L, Math.max(0L, j6));
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder.m;
                    if (mediaPeriodHolder2 == null || !mediaPeriodHolder2.b.equals(obj4)) {
                        jR = r(obj4);
                        if (jR == -1) {
                            jR = this.f;
                            this.f = 1 + jR;
                        }
                    } else {
                        jR = mediaPeriodHolder2.g.f3014a.d;
                    }
                    obj = obj4;
                    j3 = jLongValue2;
                    j5 = jR;
                    j4 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j3 = 0;
                j4 = 0;
                j5 = j8;
            }
            MediaSource.MediaPeriodId mediaPeriodIdP = p(timeline, obj, j3, j5, this.b, this.f3015a);
            if (j4 != -9223372036854775807L && j7 != -9223372036854775807L) {
                int i7 = timeline.g(mediaPeriodId2.f3130a, period3).g.f2843a;
                period3.g.getClass();
                if (i7 > 0) {
                    period3.g(0);
                }
            }
            return d(timeline, mediaPeriodIdP, j4, j3);
        }
        return null;
    }

    public final MediaPeriodInfo d(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        timeline.g(mediaPeriodId.f3130a, this.f3015a);
        return mediaPeriodId.b() ? e(timeline, mediaPeriodId.f3130a, mediaPeriodId.b, mediaPeriodId.c, j, mediaPeriodId.d, false) : f(timeline, mediaPeriodId.f3130a, j2, j, mediaPeriodId.d, false);
    }

    public final MediaPeriodInfo e(Timeline timeline, Object obj, int i, int i2, long j, long j2, boolean z) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i, i2, j2, -1);
        Timeline.Period period = this.f3015a;
        long jA = timeline.g(obj, period).a(i, i2);
        if (i2 == period.e(i)) {
            period.g.getClass();
        }
        period.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, jMax, j, -9223372036854775807L, jA, z, false, false, false, false);
    }

    public final MediaPeriodInfo f(Timeline timeline, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        Timeline.Period period = this.f3015a;
        timeline.g(obj, period);
        int iB = period.b(j);
        if (iB != -1) {
            period.f(iB);
        }
        boolean z2 = false;
        if (iB != -1) {
            period.g(iB);
        } else if (period.g.f2843a > 0) {
            period.g(0);
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j3, iB);
        if (!mediaPeriodId.b() && iB == -1) {
            z2 = true;
        }
        boolean zJ = j(timeline, mediaPeriodId);
        boolean zI = i(timeline, mediaPeriodId, z2);
        if (iB != -1) {
            period.g(iB);
        }
        if (iB != -1) {
            period.d(iB);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? period.d : j4;
        return new MediaPeriodInfo(mediaPeriodId, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, z, false, z2, zJ, zI);
    }

    public final MediaPeriodHolder g() {
        return this.l;
    }

    public final MediaPeriodInfo h(Timeline timeline, MediaPeriodInfo mediaPeriodInfo) {
        long j;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f3014a;
        boolean zB = mediaPeriodId.b();
        int i = mediaPeriodId.e;
        boolean z = !zB && i == -1;
        int i2 = mediaPeriodId.b;
        boolean zJ = j(timeline, mediaPeriodId);
        boolean zI = i(timeline, mediaPeriodId, z);
        Object obj = mediaPeriodId.f3130a;
        Timeline.Period period = this.f3015a;
        timeline.g(obj, period);
        if (mediaPeriodId.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            period.d(i);
            j = 0;
        }
        long jA = mediaPeriodId.b() ? period.a(i2, mediaPeriodId.c) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? period.d : j;
        if (mediaPeriodId.b()) {
            period.g(i2);
        } else if (i != -1) {
            period.g(i);
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.b, mediaPeriodInfo.c, j, jA, mediaPeriodInfo.f, false, z, zJ, zI);
    }

    public final boolean i(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int iB = timeline.b(mediaPeriodId.f3130a);
        if (!timeline.m(timeline.f(iB, this.f3015a, false).c, this.b, 0L).h) {
            if (timeline.d(iB, this.f3015a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        boolean z = !mediaPeriodId.b() && mediaPeriodId.e == -1;
        Object obj = mediaPeriodId.f3130a;
        if (z) {
            if (timeline.m(timeline.g(obj, this.f3015a).c, this.b, 0L).n == timeline.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        MediaPeriodHolder mediaPeriodHolder = this.n;
        if (mediaPeriodHolder == null || mediaPeriodHolder.h()) {
            this.n = null;
            for (int i = 0; i < this.r.size(); i++) {
                MediaPeriodHolder mediaPeriodHolder2 = (MediaPeriodHolder) this.r.get(i);
                if (!mediaPeriodHolder2.h()) {
                    this.n = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public final void l() {
        ImmutableList.Builder builderM = ImmutableList.m();
        for (MediaPeriodHolder mediaPeriodHolder = this.j; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.m) {
            builderM.h(mediaPeriodHolder.g.f3014a);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.k;
        this.d.post(new s(0, this, builderM, mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.g.f3014a));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void m(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.m;
        if (mediaPeriodHolder != null) {
            Assertions.f(mediaPeriodHolder.m == null);
            if (mediaPeriodHolder.e) {
                mediaPeriodHolder.f3013a.l(j - mediaPeriodHolder.p);
            }
        }
    }

    public final void n(ArrayList arrayList) {
        for (int i = 0; i < this.r.size(); i++) {
            ((MediaPeriodHolder) this.r.get(i)).i();
        }
        this.r = arrayList;
        this.n = null;
        k();
    }

    public final int o(MediaPeriodHolder mediaPeriodHolder) {
        Assertions.g(mediaPeriodHolder);
        int i = 0;
        if (mediaPeriodHolder.equals(this.m)) {
            return 0;
        }
        this.m = mediaPeriodHolder;
        while (true) {
            mediaPeriodHolder = mediaPeriodHolder.m;
            if (mediaPeriodHolder == null) {
                break;
            }
            if (mediaPeriodHolder == this.k) {
                MediaPeriodHolder mediaPeriodHolder2 = this.j;
                this.k = mediaPeriodHolder2;
                this.l = mediaPeriodHolder2;
                i = 3;
            }
            if (mediaPeriodHolder == this.l) {
                this.l = this.k;
                i |= 2;
            }
            mediaPeriodHolder.i();
            this.o--;
        }
        MediaPeriodHolder mediaPeriodHolder3 = this.m;
        mediaPeriodHolder3.getClass();
        if (mediaPeriodHolder3.m != null) {
            mediaPeriodHolder3.b();
            mediaPeriodHolder3.m = null;
            mediaPeriodHolder3.c();
        }
        l();
        return i;
    }

    public final MediaSource.MediaPeriodId q(Timeline timeline, Object obj, long j) {
        long jR;
        int iB;
        Object obj2 = obj;
        Timeline.Period period = this.f3015a;
        int i = timeline.g(obj2, period).c;
        Object obj3 = this.p;
        if (obj3 == null || (iB = timeline.b(obj3)) == -1 || timeline.f(iB, period, false).c != i) {
            MediaPeriodHolder mediaPeriodHolder = this.j;
            while (true) {
                if (mediaPeriodHolder == null) {
                    MediaPeriodHolder mediaPeriodHolder2 = this.j;
                    while (true) {
                        if (mediaPeriodHolder2 != null) {
                            int iB2 = timeline.b(mediaPeriodHolder2.b);
                            if (iB2 != -1 && timeline.f(iB2, period, false).c == i) {
                                jR = mediaPeriodHolder2.g.f3014a.d;
                                break;
                            }
                            mediaPeriodHolder2 = mediaPeriodHolder2.m;
                        } else {
                            jR = r(obj2);
                            if (jR == -1) {
                                jR = this.f;
                                this.f = 1 + jR;
                                if (this.j == null) {
                                    this.p = obj2;
                                    this.q = jR;
                                }
                            }
                        }
                    }
                } else {
                    if (mediaPeriodHolder.b.equals(obj2)) {
                        jR = mediaPeriodHolder.g.f3014a.d;
                        break;
                    }
                    mediaPeriodHolder = mediaPeriodHolder.m;
                }
            }
        } else {
            jR = this.q;
        }
        timeline.g(obj2, period);
        int i2 = period.c;
        Timeline.Window window = this.b;
        timeline.n(i2, window);
        boolean z = false;
        for (int iB3 = timeline.b(obj); iB3 >= window.m; iB3--) {
            timeline.f(iB3, period, true);
            boolean z2 = period.g.f2843a > 0;
            z |= z2;
            if (period.c(period.d) != -1) {
                obj2 = period.b;
                obj2.getClass();
            }
            if (z && (!z2 || period.d != 0)) {
                break;
            }
        }
        return p(timeline, obj2, j, jR, this.b, this.f3015a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.r.size(); i++) {
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) this.r.get(i);
            if (mediaPeriodHolder.b.equals(obj)) {
                return mediaPeriodHolder.g.f3014a.d;
            }
        }
        return -1L;
    }

    public final int s(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodHolder mediaPeriodHolder2 = this.j;
        if (mediaPeriodHolder2 == null) {
            return 0;
        }
        int iB = timeline.b(mediaPeriodHolder2.b);
        while (true) {
            timeline2 = timeline;
            iB = timeline2.d(iB, this.f3015a, this.b, this.g, this.h);
            while (true) {
                mediaPeriodHolder = mediaPeriodHolder2.m;
                if (mediaPeriodHolder == null || mediaPeriodHolder2.g.h) {
                    break;
                }
                mediaPeriodHolder2 = mediaPeriodHolder;
            }
            if (iB == -1 || mediaPeriodHolder == null || timeline2.b(mediaPeriodHolder.b) != iB) {
                break;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            timeline = timeline2;
        }
        int iO = o(mediaPeriodHolder2);
        mediaPeriodHolder2.g = h(timeline2, mediaPeriodHolder2.g);
        return iO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        return o(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(androidx.media3.common.Timeline r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            androidx.media3.exoplayer.MediaPeriodHolder r0 = r13.j
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L91
            androidx.media3.exoplayer.MediaPeriodInfo r3 = r0.g
            if (r1 != 0) goto L10
            androidx.media3.exoplayer.MediaPeriodInfo r1 = r13.h(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            androidx.media3.exoplayer.MediaPeriodInfo r6 = r13.c(r14, r1, r4)
            if (r6 == 0) goto L8c
            long r7 = r3.b
            long r9 = r6.b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L8c
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r7 = r3.f3014a
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r8 = r6.f3014a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8c
            r1 = r6
        L2a:
            long r6 = r1.e
            long r8 = r3.c
            androidx.media3.exoplayer.MediaPeriodInfo r1 = r1.a(r8)
            r0.g = r1
            long r8 = r3.e
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L85
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L44
            goto L85
        L44:
            r0.k()
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 != 0) goto L51
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L54
        L51:
            long r3 = r0.p
            long r3 = r3 + r6
        L54:
            androidx.media3.exoplayer.MediaPeriodHolder r14 = r13.k
            r1 = 1
            r5 = -9223372036854775808
            if (r0 != r14) goto L6b
            androidx.media3.exoplayer.MediaPeriodInfo r14 = r0.g
            boolean r14 = r14.g
            if (r14 != 0) goto L6b
            int r14 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r14 == 0) goto L69
            int r14 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r14 < 0) goto L6b
        L69:
            r14 = r1
            goto L6c
        L6b:
            r14 = r2
        L6c:
            androidx.media3.exoplayer.MediaPeriodHolder r7 = r13.l
            if (r0 != r7) goto L79
            int r5 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r5 == 0) goto L78
            int r3 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r3 < 0) goto L79
        L78:
            r2 = r1
        L79:
            int r0 = r13.o(r0)
            if (r0 == 0) goto L80
            return r0
        L80:
            if (r2 == 0) goto L84
            r14 = r14 | 2
        L84:
            return r14
        L85:
            androidx.media3.exoplayer.MediaPeriodHolder r1 = r0.m
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L8c:
            int r14 = r13.o(r1)
            return r14
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaPeriodQueue.t(androidx.media3.common.Timeline, long, long, long):int");
    }
}
