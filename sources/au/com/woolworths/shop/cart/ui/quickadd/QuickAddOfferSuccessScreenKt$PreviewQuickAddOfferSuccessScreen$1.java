package au.com.woolworths.shop.cart.ui.quickadd;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class QuickAddOfferSuccessScreenKt$PreviewQuickAddOfferSuccessScreen$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$PreviewQuickAddOfferSuccessScreen$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            new QuickAddOfferContract.Content.Success(null, EmptyMap.d);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ThemeKt.b(6, composer, ComposableLambdaKt.c(2053361788, new AnonymousClass1(), composer));
        }
        return Unit.f24250a;
    }
}
