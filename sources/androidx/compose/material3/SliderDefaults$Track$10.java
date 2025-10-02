package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderDefaults$Track$10 extends Lambda implements Function3<DrawScope, Offset, Color, Unit> {
    public static final SliderDefaults$Track$10 h = new SliderDefaults$Track$10(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SliderDefaults.d((DrawScope) obj, ((Offset) obj2).f1751a, SliderDefaults.c, ((Color) obj3).f1766a);
        return Unit.f24250a;
    }
}
