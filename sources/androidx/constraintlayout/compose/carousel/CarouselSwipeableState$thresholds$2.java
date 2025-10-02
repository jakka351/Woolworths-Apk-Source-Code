package androidx.constraintlayout.compose.carousel;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CarouselSwipeableState$thresholds$2 extends Lambda implements Function2<Float, Float, Float> {
    public static final CarouselSwipeableState$thresholds$2 h = new CarouselSwipeableState$thresholds$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
    }
}
