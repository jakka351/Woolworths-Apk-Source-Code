package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.CheckBoxState;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$CheckboxRowKt$lambda$796905092$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CheckBoxState checkBoxState = CheckBoxState.d;
            CoreRowSpec.DividerType dividerType = CoreRowSpec.DividerType.e;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(1);
                composer.A(objG);
            }
            composer.l();
            CheckboxRowKt.a("Title", checkBoxState, (Function1) objG, null, false, null, "Overline", null, null, null, dividerType, composer, 1573302, 6, 952);
        }
        return Unit.f24250a;
    }
}
