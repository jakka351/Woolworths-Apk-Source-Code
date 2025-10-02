package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CoachMarkFrameKt$CoachMarkFrame$2 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoachMarkFrameKt.a(null, null, "", false, null, null, CoachMarkFrameAlignment.d, null, composer, 0, 0);
        }
        return Unit.f24250a;
    }
}
