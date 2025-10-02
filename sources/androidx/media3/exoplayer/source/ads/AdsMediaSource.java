package androidx.media3.exoplayer.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.h;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    public ComponentListener n;
    public Timeline o;
    public AdPlaybackState p;
    public AdMediaSourceHolder[][] q;

    public static final class AdLoadException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

    public final class AdMediaSourceHolder {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f3149a;
        public final ArrayList b = new ArrayList();
        public Timeline c;

        public AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f3149a = mediaPeriodId;
        }
    }

    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {

        /* renamed from: a, reason: collision with root package name */
        public final MediaItem f3150a;

        public AdPrepareListener(MediaItem mediaItem) {
            this.f3150a = mediaItem;
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public final void a(MediaSource.MediaPeriodId mediaPeriodId) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public final void b(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher(AdsMediaSource.this.f.c, 0, mediaPeriodId);
            long andIncrement = LoadEventInfo.b.getAndIncrement();
            MediaItem.LocalConfiguration localConfiguration = this.f3150a.b;
            localConfiguration.getClass();
            Uri uri = localConfiguration.f2863a;
            Map map = Collections.EMPTY_MAP;
            new DataSpec(uri, 0L, 1, null, map, 0L, -1L, null, 0);
            SystemClock.elapsedRealtime();
            LoadEventInfo loadEventInfo = new LoadEventInfo(andIncrement, map);
            AdLoadException adLoadException = new AdLoadException(iOException);
            long jU = Util.U(-9223372036854775807L);
            eventDispatcher.a(new h(eventDispatcher, loadEventInfo, new MediaLoadData(6, -1, null, 0, jU, jU), adLoadException, true));
            throw null;
        }
    }

    public final class ComponentListener implements AdsLoader.EventListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f3151a = Util.m(null);
    }

    static {
        new MediaSource.MediaPeriodId(new Object());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r1 = r1 + 1;
     */
    @Override // androidx.media3.exoplayer.source.MediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.source.MediaPeriod E(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r8, androidx.media3.exoplayer.upstream.Allocator r9, long r10) {
        /*
            r7 = this;
            androidx.media3.common.AdPlaybackState r0 = r7.p
            r0.getClass()
            int r0 = r0.f2843a
            if (r0 <= 0) goto L82
            boolean r0 = r8.b()
            if (r0 == 0) goto L82
            int r0 = r8.b
            int r1 = r8.c
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = r7.q
            r3 = r2[r0]
            int r4 = r3.length
            if (r4 > r1) goto L24
            int r4 = r1 + 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[] r3 = (androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[]) r3
            r2[r0] = r3
        L24:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r2 = r7.q
            r2 = r2[r0]
            r2 = r2[r1]
            r3 = 0
            if (r2 != 0) goto L65
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder r2 = new androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder
            r2.<init>(r8)
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r4 = r7.q
            r0 = r4[r0]
            r0[r1] = r2
            androidx.media3.common.AdPlaybackState r0 = r7.p
            if (r0 != 0) goto L3d
            goto L65
        L3d:
            r1 = r3
        L3e:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r4 = r7.q
            int r4 = r4.length
            if (r1 >= r4) goto L65
            r4 = r3
        L44:
            androidx.media3.exoplayer.source.ads.AdsMediaSource$AdMediaSourceHolder[][] r5 = r7.q
            r5 = r5[r1]
            int r6 = r5.length
            if (r4 >= r6) goto L62
            r5 = r5[r4]
            androidx.media3.common.AdPlaybackState$AdGroup r6 = r0.a(r1)
            if (r5 == 0) goto L5f
            androidx.media3.common.MediaItem[] r5 = r6.d
            int r6 = r5.length
            if (r4 >= r6) goto L5f
            r5 = r5[r4]
            if (r5 != 0) goto L5d
            goto L5f
        L5d:
            r8 = 0
            throw r8
        L5f:
            int r4 = r4 + 1
            goto L44
        L62:
            int r1 = r1 + 1
            goto L3e
        L65:
            androidx.media3.exoplayer.source.MaskingMediaPeriod r0 = new androidx.media3.exoplayer.source.MaskingMediaPeriod
            r0.<init>(r8, r9, r10)
            java.util.ArrayList r9 = r2.b
            r9.add(r0)
            androidx.media3.common.Timeline r9 = r2.c
            if (r9 == 0) goto L81
            java.lang.Object r9 = r9.l(r3)
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r10 = new androidx.media3.exoplayer.source.MediaSource$MediaPeriodId
            long r1 = r8.d
            r10.<init>(r9, r1)
            r0.a(r10)
        L81:
            return r0
        L82:
            androidx.media3.exoplayer.source.MaskingMediaPeriod r0 = new androidx.media3.exoplayer.source.MaskingMediaPeriod
            r0.<init>(r8, r9, r10)
            r9 = 0
            r0.j(r9)
            r0.a(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.AdsMediaSource.E(androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, androidx.media3.exoplayer.upstream.Allocator, long):androidx.media3.exoplayer.source.MediaPeriod");
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void L(MediaItem mediaItem) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        super.U(transferListener);
        this.n = new ComponentListener();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        super.X();
        ComponentListener componentListener = this.n;
        componentListener.getClass();
        this.n = null;
        componentListener.f3151a.removeCallbacksAndMessages(null);
        this.o = null;
        this.p = null;
        this.q = new AdMediaSourceHolder[0][];
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) obj;
        return mediaPeriodId2.b() ? mediaPeriodId2 : mediaPeriodId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void f0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        Timeline timeline2;
        Timeline.Period period;
        long j;
        MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) obj;
        Timeline.Period period2 = null;
        boolean z = false;
        if (!mediaPeriodId.b()) {
            Assertions.b(timeline.h() == 1);
            this.o = timeline;
            throw null;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.q[mediaPeriodId.b][mediaPeriodId.c];
        adMediaSourceHolder.getClass();
        ArrayList arrayList = adMediaSourceHolder.b;
        Assertions.b(timeline.h() == 1);
        if (adMediaSourceHolder.c == null) {
            Object objL = timeline.l(0);
            for (int i = 0; i < arrayList.size(); i++) {
                MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) arrayList.get(i);
                maskingMediaPeriod.a(new MediaSource.MediaPeriodId(objL, maskingMediaPeriod.d.d));
            }
        }
        adMediaSourceHolder.c = timeline;
        Timeline timeline3 = this.o;
        AdPlaybackState adPlaybackState = this.p;
        if (adPlaybackState != null) {
            int i2 = adPlaybackState.f2843a;
            if (timeline3 != null) {
                if (i2 == 0) {
                    W(timeline3);
                    return;
                }
                int i3 = i2 - 1;
                if (i3 >= 0) {
                    adPlaybackState.b(i3);
                }
                int length = this.q.length;
                long[][] jArr = new long[length][];
                int i4 = 0;
                while (true) {
                    AdMediaSourceHolder[][] adMediaSourceHolderArr = this.q;
                    if (i4 >= adMediaSourceHolderArr.length) {
                        break;
                    }
                    jArr[i4] = new long[adMediaSourceHolderArr[i4].length];
                    int i5 = z ? 1 : 0;
                    ?? r5 = z;
                    while (true) {
                        AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.q[i4];
                        if (i5 < adMediaSourceHolderArr2.length) {
                            AdMediaSourceHolder adMediaSourceHolder2 = adMediaSourceHolderArr2[i5];
                            long[] jArr2 = jArr[i4];
                            if (adMediaSourceHolder2 == null || (timeline2 = adMediaSourceHolder2.c) == 0) {
                                period = period2;
                                j = -9223372036854775807L;
                            } else {
                                period = period2;
                                j = timeline2.f(r5, period2, r5).d;
                            }
                            jArr2[i5] = j;
                            i5++;
                            period2 = period;
                            r5 = 0;
                        }
                    }
                    i4++;
                    z = false;
                }
                Assertions.b(length == i2);
                AdPlaybackState.AdGroup[] adGroupArr = adPlaybackState.b;
                AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.K(adGroupArr.length, adGroupArr);
                for (int i6 = 0; i6 < i2; i6++) {
                    AdPlaybackState.AdGroup adGroup = adGroupArr2[i6];
                    long[] jArrCopyOf = jArr[i6];
                    adGroup.getClass();
                    int length2 = jArrCopyOf.length;
                    MediaItem[] mediaItemArr = adGroup.d;
                    if (length2 < mediaItemArr.length) {
                        int length3 = mediaItemArr.length;
                        int length4 = jArrCopyOf.length;
                        int iMax = Math.max(length3, length4);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, iMax);
                        Arrays.fill(jArrCopyOf, length4, iMax, -9223372036854775807L);
                    } else if (adGroup.f2844a != -1 && jArrCopyOf.length > mediaItemArr.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, mediaItemArr.length);
                    }
                    adGroupArr2[i6] = new AdPlaybackState.AdGroup(adGroup.f2844a, adGroup.b, adGroup.e, adGroup.d, jArrCopyOf, adGroup.g);
                }
                this.p = new AdPlaybackState(adGroupArr2);
                W(new SinglePeriodAdTimeline(timeline3, this.p));
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem o() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.d;
        boolean zB = mediaPeriodId.b();
        int i = mediaPeriodId.c;
        int i2 = mediaPeriodId.b;
        if (!zB) {
            maskingMediaPeriod.h();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.q[i2][i];
        adMediaSourceHolder.getClass();
        ArrayList arrayList = adMediaSourceHolder.b;
        arrayList.remove(maskingMediaPeriod);
        maskingMediaPeriod.h();
        if (arrayList.isEmpty()) {
            this.q[i2][i] = null;
        }
    }
}
