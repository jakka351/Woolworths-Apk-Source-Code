package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "it", "invoke-ZezNO4M", "(J)J"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends Lambda implements Function1<Constraints, Constraints> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Constraints(ConstraintsKt.j(0, -MathKt.b(BitmapDescriptorFactory.HUE_RED), 1, Constraints.a(((Constraints) obj).f2197a, 0, 0, 0, 0, 10)));
    }
}
