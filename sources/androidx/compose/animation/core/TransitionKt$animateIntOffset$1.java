package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransitionKt$animateIntOffset$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<IntOffset>> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-1953479610);
        long j = 1;
        SpringSpec springSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new IntOffset((j & 4294967295L) | (j << 32)), 3);
        composer.l();
        return springSpecD;
    }
}
