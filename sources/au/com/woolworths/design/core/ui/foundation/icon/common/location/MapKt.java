package au.com.woolworths.design.core.ui.foundation.icon.common.location;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4941a;

    public static final ImageVector a() {
        ImageVector imageVector = f4941a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-location-map", CollectionsKt.Q(new PathData("M14.35,20.775 L9,18.9l-4.65,1.8a0.9,0.9 0,0 1,-0.925 -0.113A0.99,0.99 0,0 1,3 19.75v-14q0,-0.325 0.188,-0.575A1.13,1.13 0,0 1,3.7 4.8l4.65,-1.575q0.325,-0.1 0.65,-0.113t0.65,0.113L15,5.1l4.65,-1.8a0.9,0.9 0,0 1,0.925 0.112,0.99 0.99,0 0,1 0.425,0.838v14a0.93,0.93 0,0 1,-0.187 0.575,1.13 1.13,0 0,1 -0.513,0.375l-4.65,1.575a2.5,2.5 0,0 1,-0.65 0.113,1.6 1.6,0 0,1 -0.65,-0.113M14,18.55L14,6.85l-4,-1.4v11.7zM16,18.55 L19,17.55L19,5.7l-3,1.15zM5,18.3l3,-1.15L8,5.45l-3,1z", 0)));
        f4941a = imageVectorA;
        return imageVectorA;
    }
}
