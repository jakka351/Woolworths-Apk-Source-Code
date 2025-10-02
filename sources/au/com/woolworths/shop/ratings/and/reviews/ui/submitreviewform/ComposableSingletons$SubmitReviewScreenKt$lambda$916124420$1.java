package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.ComposableSingletons$SubmitReviewScreenKt$lambda$-916124420$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SubmitReviewScreenKt$lambda$916124420$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$SubmitReviewScreenKt$lambda$916124420$1 d = new ComposableSingletons$SubmitReviewScreenKt$lambda$916124420$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope PrimaryButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(PrimaryButton, "$this$PrimaryButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        }
        return Unit.f24250a;
    }
}
