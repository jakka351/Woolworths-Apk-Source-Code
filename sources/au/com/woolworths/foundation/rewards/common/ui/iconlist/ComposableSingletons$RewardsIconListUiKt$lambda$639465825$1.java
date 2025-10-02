package au.com.woolworths.foundation.rewards.common.ui.iconlist;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$RewardsIconListUiKt$lambda$639465825$1 implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$RewardsIconListUiKt$lambda$639465825$1 d = new ComposableSingletons$RewardsIconListUiKt$lambda$639465825$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope TopRowContainer = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TopRowContainer, "$this$TopRowContainer");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            BoxKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), composer, 6);
        }
        return Unit.f24250a;
    }
}
