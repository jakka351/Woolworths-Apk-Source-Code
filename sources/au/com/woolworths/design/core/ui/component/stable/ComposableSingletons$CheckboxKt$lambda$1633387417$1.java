package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$CheckboxKt$lambda$1633387417$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CheckBoxState checkBoxState = CheckBoxState.e;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.repository.b(18);
                composer.A(objG);
            }
            composer.l();
            CheckboxKt.b(checkBoxState, (Function1) objG, null, true, composer, 3126, 4);
        }
        return Unit.f24250a;
    }
}
