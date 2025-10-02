package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class ForwardingTimeline extends Timeline {
    public final Timeline b;

    public ForwardingTimeline(Timeline timeline) {
        this.b = timeline;
    }

    @Override // androidx.media3.common.Timeline
    public final int a(boolean z) {
        return this.b.a(z);
    }

    @Override // androidx.media3.common.Timeline
    public int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // androidx.media3.common.Timeline
    public final int c(boolean z) {
        return this.b.c(z);
    }

    @Override // androidx.media3.common.Timeline
    public int e(int i, int i2, boolean z) {
        return this.b.e(i, i2, z);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period f(int i, Timeline.Period period, boolean z) {
        return this.b.f(i, period, z);
    }

    @Override // androidx.media3.common.Timeline
    public final int h() {
        return this.b.h();
    }

    @Override // androidx.media3.common.Timeline
    public int k(int i, int i2, boolean z) {
        return this.b.k(i, i2, z);
    }

    @Override // androidx.media3.common.Timeline
    public Object l(int i) {
        return this.b.l(i);
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Window m(int i, Timeline.Window window, long j) {
        return this.b.m(i, window, j);
    }

    @Override // androidx.media3.common.Timeline
    public final int o() {
        return this.b.o();
    }
}
