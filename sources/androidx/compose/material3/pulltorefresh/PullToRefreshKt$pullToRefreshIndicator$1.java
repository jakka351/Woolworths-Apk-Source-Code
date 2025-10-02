package androidx.compose.material3.pulltorefresh;

import androidx.camera.core.impl.b;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PullToRefreshKt$pullToRefreshIndicator$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    public static final PullToRefreshKt$pullToRefreshIndicator$1 h = new PullToRefreshKt$pullToRefreshIndicator$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        CanvasDrawScope$drawContext$1 e = contentDrawScope.getE();
        long jD = e.d();
        e.a().save();
        try {
            e.f1798a.b(-3.4028235E38f, BitmapDescriptorFactory.HUE_RED, Float.MAX_VALUE, Float.MAX_VALUE, 1);
            contentDrawScope.Q0();
            b.C(e, jD);
            return Unit.f24250a;
        } catch (Throwable th) {
            b.C(e, jD);
            throw th;
        }
    }
}
