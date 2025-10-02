package au.com.woolworths.design.core.ui.foundation.icon.common.user;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccountFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5044a;

    public static final ImageVector a() {
        ImageVector imageVector = f5044a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-user-account-fill", CollectionsKt.Q(new PathData("M11.5,11.5q-1.58,0 -2.707,-1.126T7.667,7.667q0,-1.582 1.126,-2.708Q9.919,3.834 11.5,3.833q1.582,0 2.707,1.126 1.127,1.126 1.127,2.708 0,1.58 -1.126,2.707Q13.08,11.5 11.5,11.5m-5.75,7.667q-0.79,0 -1.353,-0.563a1.85,1.85 0,0 1,-0.564 -1.354v-0.767q0,-0.814 0.42,-1.497 0.419,-0.683 1.114,-1.042 1.485,-0.744 3.019,-1.114a13.2,13.2 0,0 1,3.114 -0.372q1.58,0 3.115,0.372 1.533,0.37 3.019,1.114 0.694,0.36 1.114,1.042 0.42,0.683 0.419,1.497v0.767q0,0.79 -0.563,1.354a1.85,1.85 0,0 1,-1.354 0.563z", 0)));
        f5044a = imageVectorA;
        return imageVectorA;
    }
}
