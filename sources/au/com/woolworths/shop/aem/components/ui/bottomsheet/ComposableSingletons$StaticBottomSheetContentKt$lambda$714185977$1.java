package au.com.woolworths.shop.aem.components.ui.bottomsheet;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.aem.components.model.bottomsheet.StaticBottomSheetData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemData;
import au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.aem.components.ui.bottomsheet.ComposableSingletons$StaticBottomSheetContentKt$lambda$-714185977$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$StaticBottomSheetContentKt$lambda$714185977$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            StaticBottomSheetData staticBottomSheetData = new StaticBottomSheetData("test-id1", "With Type BODY", CollectionsKt.R(new ParagraphTextItemData(null, "#Elevate Easter celebrations\n\n**Bold**", ParagraphTextItemType.d), new ParagraphTextItemData(null, "#Elevate Easter celebrations\n\n**Bold** [content](www.google.com)", ParagraphTextItemType.e)));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            StaticBottomSheetContentKt.a(staticBottomSheetData, (Function0) objG, null, composer, 432, 8);
        }
        return Unit.f24250a;
    }
}
