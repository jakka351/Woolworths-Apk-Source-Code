package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.aem.components.model.title.TitleSectionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TitleSectionKt$PreviewListSectionHeader$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Intrinsics.h(null, "headerType");
            TitleSectionKt.a(new TitleSectionData("id", null, "This is a branded shop title"), null, 0, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
