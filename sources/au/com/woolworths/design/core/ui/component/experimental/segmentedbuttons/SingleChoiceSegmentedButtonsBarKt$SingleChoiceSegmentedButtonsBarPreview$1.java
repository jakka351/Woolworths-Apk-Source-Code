package au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class SingleChoiceSegmentedButtonsBarKt$SingleChoiceSegmentedButtonsBarPreview$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        CollectionsKt.R("One", "Two", "Three");
        composer.o(5004770);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new au.com.woolworths.android.onesite.repository.b(16);
            composer.A(objG);
        }
        composer.l();
        throw null;
    }
}
