package au.com.woolworths.views.horizontalselector;

import com.airbnb.epoxy.Carousel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HorizontalSelectorView$updateSelectorPadding$1$1 implements Runnable {
    public final /* synthetic */ HorizontalSelectorView d;
    public final /* synthetic */ Carousel e;

    public HorizontalSelectorView$updateSelectorPadding$1$1(HorizontalSelectorView horizontalSelectorView, Carousel carousel) {
        this.d = horizontalSelectorView;
        this.e = carousel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HorizontalSelectorView horizontalSelectorView = this.d;
        int iX4 = horizontalSelectorView.getViewListener().x4();
        HorizontalSelectorViewEpoxyController horizontalSelectorViewEpoxyController = horizontalSelectorView.k;
        if (horizontalSelectorViewEpoxyController == null) {
            Intrinsics.p("controller");
            throw null;
        }
        Carousel carousel = this.e;
        carousel.setController(horizontalSelectorViewEpoxyController);
        HorizontalSelectorViewEpoxyController horizontalSelectorViewEpoxyController2 = horizontalSelectorView.k;
        if (horizontalSelectorViewEpoxyController2 == null) {
            Intrinsics.p("controller");
            throw null;
        }
        horizontalSelectorViewEpoxyController2.updateData(horizontalSelectorView.getDataSet(), horizontalSelectorView.getItemWidthRes());
        carousel.o0(iX4);
        horizontalSelectorView.getViewListener().z2(iX4);
        horizontalSelectorView.h = iX4;
    }
}
