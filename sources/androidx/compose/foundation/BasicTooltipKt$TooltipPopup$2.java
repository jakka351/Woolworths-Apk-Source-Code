package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BasicTooltipKt$TooltipPopup$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            composer.j();
            return Unit.f24250a;
        }
        final String str = null;
        boolean zN = composer.n(null);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj3;
                    SemanticsPropertiesKt.n(semanticsPropertyReceiver, 1);
                    SemanticsPropertiesKt.o(semanticsPropertyReceiver, str);
                    return Unit.f24250a;
                }
            };
            composer.A(objG);
        }
        SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG);
        throw null;
    }
}
