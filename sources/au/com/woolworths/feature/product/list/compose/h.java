package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Rect f;
    public final /* synthetic */ MutableState g;

    public /* synthetic */ h(boolean z, Rect rect, MutableState mutableState, int i) {
        this.d = i;
        this.e = z;
        this.f = rect;
        this.g = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates it = (LayoutCoordinates) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                boolean z = this.e;
                Rect rectB = this.f;
                if (z) {
                    Rect rectD = CoachMarkKt.d(it);
                    float f = rectB.b;
                    float f2 = rectD.b;
                    rectB = Rect.b(rectB, BitmapDescriptorFactory.HUE_RED, f - f2, BitmapDescriptorFactory.HUE_RED, rectB.d - f2, 5);
                }
                this.g.setValue(rectB);
                break;
            default:
                Intrinsics.h(it, "it");
                boolean z2 = this.e;
                Rect rectB2 = this.f;
                if (z2) {
                    Rect rectD2 = au.com.woolworths.feature.product.list.legacy.compose.CoachMarkKt.d(it);
                    float f3 = rectB2.b;
                    float f4 = rectD2.b;
                    rectB2 = Rect.b(rectB2, BitmapDescriptorFactory.HUE_RED, f3 - f4, BitmapDescriptorFactory.HUE_RED, rectB2.d - f4, 5);
                }
                this.g.setValue(rectB2);
                break;
        }
        return Unit.f24250a;
    }
}
