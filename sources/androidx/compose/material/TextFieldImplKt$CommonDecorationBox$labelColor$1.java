package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "Landroidx/compose/material/InputPhase;", "invoke-XeAY9LY", "(Landroidx/compose/material/InputPhase;Landroidx/compose/runtime/Composer;I)J"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends Lambda implements Function3<InputPhase, Composer, Integer, Color> {
    public final /* synthetic */ TextFieldColors h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ InteractionSource k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(InteractionSource interactionSource, TextFieldColors textFieldColors, boolean z, boolean z2) {
        super(3);
        this.h = textFieldColors;
        this.i = z;
        this.j = z2;
        this.k = interactionSource;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InputPhase inputPhase = (InputPhase) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-1272940975);
        long j = ((Color) this.h.b(this.i, inputPhase == InputPhase.e ? false : this.j, this.k, composer).getD()).f1766a;
        composer.l();
        return new Color(j);
    }
}
