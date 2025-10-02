package au.com.woolworths.shop.aem.components.ui.bottomsheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$StaticBottomSheetContentKt$lambda$695433342$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$StaticBottomSheetContentKt$lambda$695433342$1 d = new ComposableSingletons$StaticBottomSheetContentKt$lambda$695433342$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        ((Number) obj3).intValue();
        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
        SpacerKt.a(16, (Composer) obj2, 6);
        return Unit.f24250a;
    }
}
