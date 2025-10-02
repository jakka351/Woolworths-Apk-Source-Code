package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.d;
        ComparisonChain comparisonChain = ComparisonChain.f14880a;
        switch (i) {
            case 0:
                return Integer.compare(((DefaultTrackSelector.ImageTrackInfo) ((List) obj).get(0)).i, ((DefaultTrackSelector.ImageTrackInfo) ((List) obj2).get(0)).i);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 4;
                ComparisonChain comparisonChainA = comparisonChain.c((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new b(i2)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new b(i2)), new b(i2)).a(list.size(), list2.size());
                int i3 = 5;
                return comparisonChainA.c((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new b(i3)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new b(i3)), new b(i3)).f();
            case 2:
                return ((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj)).c((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj2));
            case 3:
                return ((DefaultTrackSelector.TextTrackInfo) ((List) obj).get(0)).c((DefaultTrackSelector.TextTrackInfo) ((List) obj2).get(0));
            case 4:
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo = (DefaultTrackSelector.VideoTrackInfo) obj;
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo2 = (DefaultTrackSelector.VideoTrackInfo) obj2;
                ComparisonChain comparisonChainC = comparisonChain.d(videoTrackInfo.k, videoTrackInfo2.k).c(Integer.valueOf(videoTrackInfo.p), Integer.valueOf(videoTrackInfo2.p), Ordering.c().g()).a(videoTrackInfo.q, videoTrackInfo2.q).a(videoTrackInfo.r, videoTrackInfo2.r).d(videoTrackInfo.s, videoTrackInfo2.s).a(videoTrackInfo.t, videoTrackInfo2.t).d(videoTrackInfo.l, videoTrackInfo2.l).d(videoTrackInfo.h, videoTrackInfo2.h).d(videoTrackInfo.j, videoTrackInfo2.j).c(Integer.valueOf(videoTrackInfo.o), Integer.valueOf(videoTrackInfo2.o), Ordering.c().g());
                boolean z = videoTrackInfo.w;
                ComparisonChain comparisonChainD = comparisonChainC.d(z, videoTrackInfo2.w);
                boolean z2 = videoTrackInfo.x;
                ComparisonChain comparisonChainD2 = comparisonChainD.d(z2, videoTrackInfo2.x);
                if (z && z2) {
                    comparisonChainD2 = comparisonChainD2.a(videoTrackInfo.y, videoTrackInfo2.y);
                }
                return comparisonChainD2.f();
            case 5:
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo3 = (DefaultTrackSelector.VideoTrackInfo) obj;
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo4 = (DefaultTrackSelector.VideoTrackInfo) obj2;
                boolean z3 = videoTrackInfo3.h;
                int i4 = videoTrackInfo3.m;
                Ordering orderingG = (z3 && videoTrackInfo3.k) ? DefaultTrackSelector.i : DefaultTrackSelector.i.g();
                videoTrackInfo3.i.getClass();
                return comparisonChain.c(Integer.valueOf(videoTrackInfo3.n), Integer.valueOf(videoTrackInfo4.n), orderingG).c(Integer.valueOf(i4), Integer.valueOf(videoTrackInfo4.m), orderingG).f();
            case 6:
                return ((Format) obj2).j - ((Format) obj).j;
            default:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ordering ordering = DefaultTrackSelector.i;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
        }
    }
}
