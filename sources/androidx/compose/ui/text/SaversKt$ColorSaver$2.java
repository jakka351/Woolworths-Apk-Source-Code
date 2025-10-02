package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "", "invoke-ijrfgN4"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$ColorSaver$2 extends Lambda implements Function1<Object, Color> {
    public static final SaversKt$ColorSaver$2 h = new SaversKt$ColorSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.c(obj, Boolean.FALSE)) {
            return new Color(Color.k);
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Int");
        return new Color(ColorKt.b(((Integer) obj).intValue()));
    }
}
