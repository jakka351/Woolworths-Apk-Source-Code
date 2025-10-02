package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.marketplace.ui.facet.ComposableSingletons$FacetItemKt$lambda$-1737188330$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FacetItemKt$lambda$1737188330$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FacetItemKt$lambda$1737188330$1 d = new ComposableSingletons$FacetItemKt$lambda$1737188330$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Sequence values = new LoremIpsum(2).getValues();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d(26);
                composer.A(objG);
            }
            composer.l();
            String strP = SequencesKt.p(values, null, (Function1) objG, 31);
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG2);
            }
            composer.l();
            FacetItemKt.a(3120, 4, composer, null, strP, null, (Function0) objG2);
        }
        return Unit.f24250a;
    }
}
