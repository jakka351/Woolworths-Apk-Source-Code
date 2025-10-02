package androidx.media3.exoplayer.analytics;

import android.content.Context;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import au.com.woolworths.android.onesite.epoxy.CirclePageIndicatorDecoration;
import au.com.woolworths.product.details.epoxy.ProductCardGroup;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.airbnb.epoxy.OnModelBoundListener;
import com.woolworths.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements ListenerSet.Event, OnModelBoundListener {
    public final /* synthetic */ List d;

    public /* synthetic */ k(AnalyticsListener.EventTime eventTime, List list) {
        this.d = list;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        Carousel carousel = (Carousel) obj;
        EpoxyVisibilityTracker epoxyVisibilityTracker = ProductCardGroup.s;
        Intrinsics.e(carousel);
        epoxyVisibilityTracker.a(carousel);
        if (this.d.size() <= 1) {
            return;
        }
        Context context = carousel.getContext();
        Intrinsics.g(context, "getContext(...)");
        CirclePageIndicatorDecoration circlePageIndicatorDecoration = new CirclePageIndicatorDecoration(context, R.dimen.product_image_page_indicator_height, R.dimen.product_image_page_indicator_size);
        carousel.i(circlePageIndicatorDecoration);
        ProductCardGroup.r = circlePageIndicatorDecoration;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).getClass();
    }
}
