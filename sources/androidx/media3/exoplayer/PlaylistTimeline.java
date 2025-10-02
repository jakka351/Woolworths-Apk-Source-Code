package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    public final int e;
    public final int f;
    public final int[] g;
    public final int[] h;
    public final Timeline[] i;
    public final Object[] j;
    public final HashMap k;

    public PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(shuffleOrder);
        int length = timelineArr.length;
        this.i = timelineArr;
        this.g = new int[length];
        this.h = new int[length];
        this.j = objArr;
        this.k = new HashMap();
        int length2 = timelineArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            Timeline timeline = timelineArr[i];
            this.i[i2] = timeline;
            this.h[i2] = iO;
            this.g[i2] = iH;
            iO += timeline.o();
            iH += this.i[i2].h();
            this.k.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.e = iO;
        this.f = iH;
    }

    @Override // androidx.media3.common.Timeline
    public final int h() {
        return this.f;
    }

    @Override // androidx.media3.common.Timeline
    public final int o() {
        return this.e;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int q(Object obj) {
        Integer num = (Integer) this.k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int r(int i) {
        return Util.c(this.g, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int s(int i) {
        return Util.c(this.h, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final Object t(int i) {
        return this.j[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int u(int i) {
        return this.g[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int v(int i) {
        return this.h[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final Timeline x(int i) {
        return this.i[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlaylistTimeline(ArrayList arrayList, ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            timelineArr[i2] = ((MediaSourceInfoHolder) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((MediaSourceInfoHolder) it2.next()).a();
            i++;
        }
        this(timelineArr, objArr, shuffleOrder);
    }
}
