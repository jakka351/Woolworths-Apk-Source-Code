package au.com.woolworths.design.core.ui.foundation.icon.common.supporting;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnlockKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5030a;

    public static final ImageVector a() {
        ImageVector imageVector = f5030a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-supporting-unlock", CollectionsKt.Q(new PathData("M6,20h12L18,10L6,10zM12,17q0.825,0 1.412,-0.587Q14,15.825 14,15t-0.588,-1.412A1.93,1.93 0,0 0,12 13q-0.825,0 -1.412,0.588A1.93,1.93 0,0 0,10 15q0,0.824 0.588,1.413Q11.175,17 12,17m-6,5q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,4 20L4,10q0,-0.825 0.588,-1.412A1.93,1.93 0,0 1,6 8h7L13,6q0,-2.075 1.463,-3.537Q15.926,1 18,1q1.775,0 3.1,1.075a5.04,5.04 0,0 1,1.75 2.7q0.126,0.425 -0.163,0.825Q22.4,6 22,6q-0.425,0 -0.7,-0.175t-0.4,-0.575a3.2,3.2 0,0 0,-1.062 -1.6A2.8,2.8 0,0 0,18 3q-1.25,0 -2.125,0.875A2.9,2.9 0,0 0,15 6v2h3q0.824,0 1.413,0.588Q20,9.175 20,10v10q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,18 22z", 0)));
        f5030a = imageVectorA;
        return imageVectorA;
    }
}
