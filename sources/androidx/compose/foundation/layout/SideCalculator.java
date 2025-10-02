package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
interface SideCalculator {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f975a = Companion.f976a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f976a = new Companion();
        public static final SideCalculator$Companion$LeftSideCalculator$1 b = new SideCalculator$Companion$LeftSideCalculator$1();
        public static final SideCalculator$Companion$RightSideCalculator$1 c = new SideCalculator$Companion$RightSideCalculator$1();
        public static final SideCalculator$Companion$BottomSideCalculator$1 d = new SideCalculator$Companion$BottomSideCalculator$1();
    }

    default float a(float f, float f2) {
        float fD = d(f, f2);
        return fD < BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : fD;
    }

    default float b(float f, float f2) {
        float fD = d(f, f2);
        return fD > BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : fD;
    }

    long c(long j);

    float d(float f, float f2);

    Insets e(Insets insets, int i);

    int f(Insets insets);

    long g(long j, float f);
}
