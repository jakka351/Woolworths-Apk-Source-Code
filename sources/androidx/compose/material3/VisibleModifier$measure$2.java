package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VisibleModifier$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Placeable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisibleModifier$measure$2(Placeable placeable) {
        super(1);
        this.h = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.h, 0, 0, BitmapDescriptorFactory.HUE_RED);
        return Unit.f24250a;
    }
}
