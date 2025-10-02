package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    public static final MediaItem w;
    public final MediaSource[] n;
    public final ArrayList o;
    public final Timeline[] p;
    public final ArrayList q;
    public final DefaultCompositeSequenceableLoaderFactory r;
    public final ListMultimap s;
    public int t;
    public long[][] u;
    public IllegalMergeException v;

    public static final class ClippedTimeline extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            super.f(i, period, z);
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            super.m(i, window, j);
            throw null;
        }
    }

    public static final class IllegalMergeException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }
    }

    public static final class MediaPeriodAndId {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f3134a;
        public final MediaPeriod b;

        public MediaPeriodAndId(MediaSource.MediaPeriodId mediaPeriodId, MediaPeriod mediaPeriod) {
            this.f3134a = mediaPeriodId;
            this.b = mediaPeriod;
        }
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f2858a = "MergingMediaSource";
        w = builder.a();
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        DefaultCompositeSequenceableLoaderFactory defaultCompositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        this.n = mediaSourceArr;
        this.r = defaultCompositeSequenceableLoaderFactory;
        this.q = new ArrayList(Arrays.asList(mediaSourceArr));
        this.t = -1;
        this.o = new ArrayList(mediaSourceArr.length);
        for (int i = 0; i < mediaSourceArr.length; i++) {
            this.o.add(new ArrayList());
        }
        this.p = new Timeline[mediaSourceArr.length];
        this.u = new long[0][];
        new HashMap();
        this.s = MultimapBuilder.a().a().c();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaSource[] mediaSourceArr = this.n;
        int length = mediaSourceArr.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        Timeline[] timelineArr = this.p;
        int iB = timelineArr[0].b(mediaPeriodId.f3130a);
        for (int i = 0; i < length; i++) {
            MediaSource.MediaPeriodId mediaPeriodIdA = mediaPeriodId.a(timelineArr[i].l(iB));
            mediaPeriodArr[i] = mediaSourceArr[i].E(mediaPeriodIdA, allocator, j - this.u[iB][i]);
            ((List) this.o.get(i)).add(new MediaPeriodAndId(mediaPeriodIdA, mediaPeriodArr[i]));
        }
        return new MergingMediaPeriod(this.r, this.u[iB], mediaPeriodArr);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void L(MediaItem mediaItem) {
        this.n[0].L(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        super.U(transferListener);
        int i = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.n;
            if (i >= mediaSourceArr.length) {
                return;
            }
            g0(Integer.valueOf(i), mediaSourceArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        super.X();
        Arrays.fill(this.p, (Object) null);
        this.t = -1;
        this.v = null;
        ArrayList arrayList = this.q;
        arrayList.clear();
        Collections.addAll(arrayList, this.n);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.o;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((MediaPeriodAndId) list.get(i)).f3134a.equals(mediaPeriodId)) {
                return ((MediaPeriodAndId) ((List) arrayList.get(0)).get(i)).f3134a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void f0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        Integer num = (Integer) obj;
        if (this.v != null) {
            return;
        }
        if (this.t == -1) {
            this.t = timeline.h();
        } else if (timeline.h() != this.t) {
            this.v = new IllegalMergeException();
            return;
        }
        int length = this.u.length;
        Timeline[] timelineArr = this.p;
        if (length == 0) {
            this.u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.t, timelineArr.length);
        }
        ArrayList arrayList = this.q;
        arrayList.remove(baseMediaSource);
        timelineArr[num.intValue()] = timeline;
        if (arrayList.isEmpty()) {
            W(timelineArr[0]);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem o() {
        MediaSource[] mediaSourceArr = this.n;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].o() : w;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        int i = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.n;
            if (i >= mediaSourceArr.length) {
                return;
            }
            List list = (List) this.o.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((MediaPeriodAndId) list.get(i2)).b.equals(mediaPeriod)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            MediaSource mediaSource = mediaSourceArr[i];
            MediaPeriod[] mediaPeriodArr = mergingMediaPeriod.d;
            mediaSource.t(mergingMediaPeriod.e[i] ? ((TimeOffsetMediaPeriod) mediaPeriodArr[i]).d : mediaPeriodArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void z() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.v;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.z();
    }
}
