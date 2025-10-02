package au.com.woolworths.android.onesite.epoxy;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.CarouselModel_;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/CarouselWithSnapEpoxyModel;", "Lcom/airbnb/epoxy/CarouselModel_;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselWithSnapEpoxyModel extends CarouselModel_ {
    @Override // com.airbnb.epoxy.CarouselModel_, com.airbnb.epoxy.EpoxyModel
    /* renamed from: D */
    public final Carousel j(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        CarouselWithSnap carouselWithSnap = new CarouselWithSnap(context);
        carouselWithSnap.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return carouselWithSnap;
    }
}
