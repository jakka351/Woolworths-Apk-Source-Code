package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class TransitionKt$animateValue$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Object>> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-895531546);
        SpringSpec springSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);
        composer.l();
        return springSpecD;
    }
}
