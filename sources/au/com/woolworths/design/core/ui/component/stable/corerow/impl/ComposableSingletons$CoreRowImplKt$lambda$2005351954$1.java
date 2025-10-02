package au.com.woolworths.design.core.ui.component.stable.corerow.impl;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.c;
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
/* renamed from: au.com.woolworths.design.core.ui.component.stable.corerow.impl.ComposableSingletons$CoreRowImplKt$lambda$-2005351954$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CoreRowImplKt$lambda$2005351954$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Sequence values = new LoremIpsum(15).getValues();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(2);
                composer.A(objG);
            }
            composer.l();
            String strP = SequencesKt.p(values, null, (Function1) objG, 31);
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new h(20);
                composer.A(objG2);
            }
            composer.l();
            CoreRowImplKt.a(strP, (Function0) objG2, null, null, null, null, ComposableSingletons$CoreRowImplKt.e, new CoreRowSpec.TrailingDisplay.Text("Edit"), null, composer, 1572912, 316);
        }
        return Unit.f24250a;
    }
}
