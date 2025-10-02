package au.com.woolworths.shop.aem.components.ui.editorialbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.InspectionModeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class EditorialBannerKt$PreviewEditorialBannerCarouselNoImageForAllItems$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt$PreviewEditorialBannerCarouselNoImageForAllItems$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            CollectionsKt.s(null, 10);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CompositionLocalKt.a(InspectionModeKt.f1972a.b(Boolean.TRUE), ComposableLambdaKt.c(1530981285, new AnonymousClass1(), composer), composer, 56);
        }
        return Unit.f24250a;
    }
}
