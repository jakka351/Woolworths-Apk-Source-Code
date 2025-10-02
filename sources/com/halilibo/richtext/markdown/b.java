package com.halilibo.richtext.markdown;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.shop.ratingsandreviews.data.CtaLinkAction;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionSection;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionWriteReview;
import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.e;
                BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) this.f;
                Density density = (Density) this.g;
                Painter f12969a = ((AsyncImagePainter.State) ((SnapshotMutableStateImpl) asyncImagePainter.u).getD()).getF12969a();
                Size size = f12969a != null ? new Size(f12969a.getJ()) : null;
                Modifier.Companion companion = Modifier.Companion.d;
                if (size != null) {
                    long j = size.f1754a;
                    if (j != 9205357640488583168L) {
                        int i = (int) (j >> 32);
                        if (Float.intBitsToFloat(i) != Float.POSITIVE_INFINITY) {
                            int i2 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i2) != Float.POSITIVE_INFINITY) {
                                float fIntBitsToFloat = Float.intBitsToFloat(i);
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                                float fH = fIntBitsToFloat > ((float) Constraints.h(boxWithConstraintsScope.getB())) ? Constraints.h(boxWithConstraintsScope.getB()) / fIntBitsToFloat : 1.0f;
                                return SizeKt.r(companion, density.C(fIntBitsToFloat * fH), density.C(fIntBitsToFloat2 * fH));
                            }
                        }
                    }
                }
                return SizeKt.q(companion, MarkdownImageKt.f16245a);
            default:
                ((Function2) this.e).invoke(((CtaLinkAction) this.f).e, ((RatingsDistributionWriteReview) ((RatingsDistributionSection) this.g)).d.e);
                return Unit.f24250a;
        }
    }
}
