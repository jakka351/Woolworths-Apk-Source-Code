package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsPreferenceDetailsContentKt$lambda$1463470953$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$RewardsPreferenceDetailsContentKt$lambda$1463470953$1 d = new ComposableSingletons$RewardsPreferenceDetailsContentKt$lambda$1463470953$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
