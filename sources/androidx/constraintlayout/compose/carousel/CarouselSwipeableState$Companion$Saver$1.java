package androidx.constraintlayout.compose.carousel;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CarouselSwipeableState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, CarouselSwipeableState<Object>, Object> {
    static {
        new CarouselSwipeableState$Companion$Saver$1(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotMutableStateImpl) ((CarouselSwipeableState) obj2).b).getD();
    }
}
