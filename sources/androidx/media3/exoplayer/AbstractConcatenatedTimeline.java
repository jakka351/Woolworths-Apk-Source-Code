package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ShuffleOrder;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final ShuffleOrder c;

    public AbstractConcatenatedTimeline(ShuffleOrder shuffleOrder) {
        this.c = shuffleOrder;
        this.b = shuffleOrder.getLength();
    }

    @Override // androidx.media3.common.Timeline
    public final int a(boolean z) {
        if (this.b != 0) {
            int iE = z ? this.c.e() : 0;
            while (x(iE).p()) {
                iE = w(iE, z);
                if (iE == -1) {
                }
            }
            return x(iE).a(z) + v(iE);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iQ = q(obj2);
            if (iQ != -1 && (iB = x(iQ).b(obj3)) != -1) {
                return u(iQ) + iB;
            }
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int c(boolean z) {
        int i = this.b;
        if (i != 0) {
            ShuffleOrder shuffleOrder = this.c;
            int iC = z ? shuffleOrder.c() : i - 1;
            while (x(iC).p()) {
                iC = z ? shuffleOrder.a(iC) : iC > 0 ? iC - 1 : -1;
                if (iC == -1) {
                }
            }
            return x(iC).c(z) + v(iC);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int e(int i, int i2, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        int iE = x(iS).e(i - iV, i2 == 2 ? 0 : i2, z);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z);
        while (iW != -1 && x(iW).p()) {
            iW = w(iW, z);
        }
        if (iW != -1) {
            return x(iW).a(z) + v(iW);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
        int iR = r(i);
        int iV = v(iR);
        x(iR).f(i - u(iR), period, z);
        period.c += iV;
        if (z) {
            Object objT = t(iR);
            Object obj = period.b;
            obj.getClass();
            period.b = Pair.create(objT, obj);
        }
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period g(Object obj, Timeline.Period period) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        x(iQ).g(obj3, period);
        period.c += iV;
        period.b = obj;
        return period;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        r0 = r0 - 1;
     */
    @Override // androidx.media3.common.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            int r0 = r5.s(r6)
            int r1 = r5.v(r0)
            androidx.media3.common.Timeline r2 = r5.x(r0)
            int r6 = r6 - r1
            r3 = 2
            if (r7 != r3) goto L12
            r4 = 0
            goto L13
        L12:
            r4 = r7
        L13:
            int r6 = r2.k(r6, r4, r8)
            r2 = -1
            if (r6 == r2) goto L1c
            int r1 = r1 + r6
            return r1
        L1c:
            androidx.media3.exoplayer.source.ShuffleOrder r6 = r5.c
            if (r8 == 0) goto L25
            int r0 = r6.a(r0)
            goto L2b
        L25:
            if (r0 <= 0) goto L2a
        L27:
            int r0 = r0 + (-1)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == r2) goto L41
            androidx.media3.common.Timeline r1 = r5.x(r0)
            boolean r1 = r1.p()
            if (r1 == 0) goto L41
            if (r8 == 0) goto L3e
            int r0 = r6.a(r0)
            goto L2b
        L3e:
            if (r0 <= 0) goto L2a
            goto L27
        L41:
            if (r0 == r2) goto L51
            int r6 = r5.v(r0)
            androidx.media3.common.Timeline r7 = r5.x(r0)
            int r7 = r7.c(r8)
            int r7 = r7 + r6
            return r7
        L51:
            if (r7 != r3) goto L58
            int r6 = r5.c(r8)
            return r6
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.AbstractConcatenatedTimeline.k(int, int, boolean):int");
    }

    @Override // androidx.media3.common.Timeline
    public final Object l(int i) {
        int iR = r(i);
        return Pair.create(t(iR), x(iR).l(i - u(iR)));
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Window m(int i, Timeline.Window window, long j) {
        int iS = s(i);
        int iV = v(iS);
        int iU = u(iS);
        x(iS).m(i - iV, window, j);
        Object objT = t(iS);
        if (!Timeline.Window.p.equals(window.f2878a)) {
            objT = Pair.create(objT, window.f2878a);
        }
        window.f2878a = objT;
        window.m += iU;
        window.n += iU;
        return window;
    }

    public abstract int q(Object obj);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract Object t(int i);

    public abstract int u(int i);

    public abstract int v(int i);

    public final int w(int i, boolean z) {
        if (z) {
            return this.c.b(i);
        }
        if (i < this.b - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract Timeline x(int i);
}
