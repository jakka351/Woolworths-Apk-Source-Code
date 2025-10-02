package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.layout.Placeable;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;

    public /* synthetic */ h(Placeable placeable, int i) {
        this.d = i;
        this.e = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Placeable placeable = this.e;
        Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                Intrinsics.h(layout, "$this$layout");
                Placeable.PlacementScope.h(layout, placeable, 0, 0);
                break;
            case 1:
                float f = BroadcastBannerKt.f4745a;
                Intrinsics.h(layout, "$this$layout");
                layout.e(placeable, 0, (-placeable.e) / 2, BitmapDescriptorFactory.HUE_RED);
                break;
            case 2:
                Intrinsics.h(layout, "$this$layout");
                layout.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                break;
            case 3:
                Intrinsics.h(layout, "$this$layout");
                layout.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                break;
            default:
                Intrinsics.h(layout, "$this$layout");
                layout.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                break;
        }
        return unit;
    }
}
