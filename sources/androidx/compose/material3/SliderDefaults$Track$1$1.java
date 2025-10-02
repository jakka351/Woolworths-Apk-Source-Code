package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SliderDefaults$Track$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.e;
        long jA = OffsetKt.a(BitmapDescriptorFactory.HUE_RED, Offset.f(drawScope.M0()));
        long jA2 = OffsetKt.a(Size.d(drawScope.h()), Offset.f(drawScope.M0()));
        long j = jA2;
        if (!z) {
            jA2 = jA;
        }
        if (z) {
            j = jA;
        }
        drawScope.T1(SliderDefaults.c);
        drawScope.b1(0L, jA2, j, drawScope.T1(SliderKt.f1498a), (464 & 16) != 0 ? 0 : 1, (464 & 32) != 0 ? null : null, 3);
        Offset.e(jA2);
        Offset.e(j);
        Offset.e(jA2);
        throw null;
    }
}
