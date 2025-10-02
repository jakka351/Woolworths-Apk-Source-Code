package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SearchTilesSectionKt$AnimatedTextListSwitcher$3 implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        String text = (String) obj2;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.h(text, "text");
        SearchTilesSectionKt.g((iIntValue >> 3) & 14, 0, (Composer) obj3, Modifier.Companion.d, text);
        return Unit.f24250a;
    }
}
