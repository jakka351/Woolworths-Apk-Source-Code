package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int f;

    public /* synthetic */ g(int i, int i2, Placeable placeable) {
        this.d = i2;
        this.e = placeable;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(layout, "$this$layout");
                layout.e(this.e, 0, -this.f, BitmapDescriptorFactory.HUE_RED);
                break;
            default:
                Intrinsics.h(layout, "$this$layout");
                Placeable.PlacementScope.h(layout, this.e, this.f, 0);
                break;
        }
        return Unit.f24250a;
    }
}
