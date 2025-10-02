package androidx.compose.material3;

import androidx.compose.animation.core.KeyframesSpec;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {
    public static final ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1 h = new ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        keyframesSpecConfig.f765a = 1800;
        keyframesSpecConfig.a(1267, Float.valueOf(BitmapDescriptorFactory.HUE_RED)).b = ProgressIndicatorKt.i;
        keyframesSpecConfig.a(1800, Float.valueOf(1.0f));
        return Unit.f24250a;
    }
}
