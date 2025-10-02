package au.com.woolworths.design.core.ui.foundation.icon.common.location;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NearbyKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4944a;

    public static final ImageVector a() {
        ImageVector imageVector = f4944a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-location-nearby", CollectionsKt.Q(new PathData("m10.05,13.95 l-6.475,-2.625a0.9,0.9 0,0 1,-0.475 -0.387,1.07 1.07,0 0,1 -0.15,-0.538q0,-0.275 0.163,-0.537a0.95,0.95 0,0 1,0.487 -0.388l15.35,-5.7q0.3,-0.125 0.575,-0.05 0.276,0.075 0.475,0.275 0.2,0.2 0.275,0.475a0.87,0.87 0,0 1,-0.05 0.575l-5.7,15.35a0.95,0.95 0,0 1,-0.387 0.488,1 1,0 0,1 -0.538,0.162q-0.275,0 -0.537,-0.15a0.9,0.9 0,0 1,-0.388 -0.475zM13.55,17.3L17.6,6.4 6.7,10.45l4.9,1.95z", 0)));
        f4944a = imageVectorA;
        return imageVectorA;
    }
}
