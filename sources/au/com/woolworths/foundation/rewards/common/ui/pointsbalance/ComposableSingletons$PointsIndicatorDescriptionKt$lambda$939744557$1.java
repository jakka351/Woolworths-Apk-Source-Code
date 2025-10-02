package au.com.woolworths.foundation.rewards.common.ui.pointsbalance;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$PointsIndicatorDescriptionKt$lambda$939744557$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PointsIndicatorDescriptionKt.a("Collect {0} more points to reach {1}", PaddingKt.f(Modifier.Companion.d, 8), CollectionsKt.R("300", "2000"), false, false, composer, 25014, 8);
        }
        return Unit.f24250a;
    }
}
