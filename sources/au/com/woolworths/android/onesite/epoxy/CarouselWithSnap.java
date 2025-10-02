package au.com.woolworths.android.onesite.epoxy;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.SnapHelper;
import com.airbnb.epoxy.Carousel;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/CarouselWithSnap;", "Lcom/airbnb/epoxy/Carousel;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getSnapHelperFactory", "Lcom/airbnb/epoxy/Carousel$SnapHelperFactory;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselWithSnap extends Carousel {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/epoxy/CarouselWithSnap$getSnapHelperFactory$1", "Lcom/airbnb/epoxy/Carousel$SnapHelperFactory;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.epoxy.CarouselWithSnap$getSnapHelperFactory$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Carousel.SnapHelperFactory {
        @Override // com.airbnb.epoxy.Carousel.SnapHelperFactory
        public final SnapHelper a() {
            return new GravitySnapHelper(8388611);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselWithSnap(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        setNestedScrollingEnabled(false);
    }

    @Override // com.airbnb.epoxy.Carousel
    @NotNull
    public Carousel.SnapHelperFactory getSnapHelperFactory() {
        return new AnonymousClass1();
    }
}
