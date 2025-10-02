package androidx.compose.ui.graphics.colorspace;

import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements DoubleFunction {
    public final /* synthetic */ int d;
    public final /* synthetic */ Rgb e;

    public /* synthetic */ b(Rgb rgb, int i) {
        this.d = i;
        this.e = rgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double d(double d) {
        switch (this.d) {
            case 0:
                return RangesKt.a(this.e.k.d(d), r10.e, r10.f);
            default:
                return this.e.n.d(RangesKt.a(d, r0.e, r0.f));
        }
    }
}
