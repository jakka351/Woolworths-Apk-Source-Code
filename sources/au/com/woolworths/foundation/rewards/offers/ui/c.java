package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ Placeable f;
    public final /* synthetic */ int g;

    public /* synthetic */ c(int i, int i2, Placeable placeable, Placeable placeable2) {
        this.d = i2;
        this.e = placeable;
        this.f = placeable2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(layout, "$this$layout");
                Placeable placeable = this.e;
                if (placeable != null) {
                    Placeable.PlacementScope.h(layout, placeable, 0, 0);
                }
                Placeable placeable2 = this.f;
                if (placeable2 != null) {
                    Placeable.PlacementScope.h(layout, placeable2, 0, this.g - (placeable2.e / 2));
                }
                break;
            default:
                Intrinsics.h(layout, "$this$layout");
                Placeable.PlacementScope.g(layout, this.e, 0L);
                layout.e(this.f, this.g, 0, BitmapDescriptorFactory.HUE_RED);
                break;
        }
        return Unit.f24250a;
    }
}
