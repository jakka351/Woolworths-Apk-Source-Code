package androidx.compose.material3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1 extends Lambda implements Function0<Float> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = BitmapDescriptorFactory.HUE_RED;
        if (BitmapDescriptorFactory.HUE_RED > 0.01f) {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
