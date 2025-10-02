package au.com.woolworths.design.core.ui.foundation.icon.common.supporting;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TickKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5029a;

    public static final ImageVector a() {
        ImageVector imageVector = f5029a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-supporting-tick", CollectionsKt.Q(new PathData("M10.263,17.175q-0.2,0 -0.375,-0.062a0.9,0.9 0,0 1,-0.325 -0.213l-4.3,-4.3q-0.274,-0.274 -0.262,-0.713 0.012,-0.437 0.287,-0.712a0.95,0.95 0,0 1,0.7 -0.275q0.425,0 0.7,0.275l3.575,3.575 8.475,-8.475Q19.012,6 19.451,6q0.437,0 0.712,0.275 0.275,0.274 0.275,0.712t-0.275,0.713l-9.2,9.2q-0.15,0.15 -0.325,0.213a1.1,1.1 0,0 1,-0.375 0.062", 0)));
        f5029a = imageVectorA;
        return imageVectorA;
    }
}
