package au.com.woolworths.feature.shop.homepage.presentation.chatentrycard;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ChatEntryCardV2Kt$lambda$885408591$1 implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatEntryCardV2Kt$lambda$885408591$1 d = new ComposableSingletons$ChatEntryCardV2Kt$lambda$885408591$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        String targetText = (String) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.h(targetText, "targetText");
        TextKt.a(targetText, CoreTheme.f(composer).f5120a.c.f5124a, null, CoreTheme.b(composer).d.d.d.b, null, 3, 2, false, 1, null, composer, ((iIntValue >> 3) & 14) | 102236160, 660);
        return Unit.f24250a;
    }
}
