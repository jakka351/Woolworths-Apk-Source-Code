package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ClickableKt$combinedClickable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableInteractionSource mutableInteractionSource;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-1534186401);
        Indication indication = (Indication) composer.x(IndicationKt.f838a);
        if (indication instanceof IndicationNodeFactory) {
            composer.o(-1726068379);
            composer.l();
            mutableInteractionSource = null;
        } else {
            composer.o(-1725935761);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = InteractionSourceKt.a();
                composer.A(objG);
            }
            mutableInteractionSource = (MutableInteractionSource) objG;
            composer.l();
        }
        Modifier modifierE = ClickableKt.e(Modifier.Companion.d, mutableInteractionSource, indication, false, false, null);
        composer.l();
        return modifierE;
    }
}
