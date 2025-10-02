package androidx.compose.material3;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DividerKt$VerticalDivider$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float f = 2;
        drawScope.b1(0L, OffsetKt.a(drawScope.T1(BitmapDescriptorFactory.HUE_RED) / f, BitmapDescriptorFactory.HUE_RED), OffsetKt.a(drawScope.T1(BitmapDescriptorFactory.HUE_RED) / f, Size.b(drawScope.h())), drawScope.T1(BitmapDescriptorFactory.HUE_RED), (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
        return Unit.f24250a;
    }
}
