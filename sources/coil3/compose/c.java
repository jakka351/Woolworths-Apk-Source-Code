package coil3.compose;

import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;

    public /* synthetic */ c(Placeable placeable, int i) {
        this.d = i;
        this.e = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Placeable placeable = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                break;
            default:
                Placeable.PlacementScope.h(placementScope, placeable, 0, 0);
                break;
        }
        return unit;
    }
}
