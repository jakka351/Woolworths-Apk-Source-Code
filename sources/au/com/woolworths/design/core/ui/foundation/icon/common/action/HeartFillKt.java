package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeartFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4907a;

    public static final ImageVector a() {
        ImageVector imageVector = f4907a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-heart-fill", CollectionsKt.Q(new PathData("M12,20.325q-0.349,0 -0.713,-0.125a1.65,1.65 0,0 1,-0.637 -0.4l-1.725,-1.575a68,68 0,0 1,-4.788 -4.813Q2.002,11.026 2,8.15 2,5.8 3.575,4.225T7.5,2.65q1.325,0 2.5,0.562t2,1.538a6,6 0,0 1,2 -1.538,5.7 5.7,0 0,1 2.5,-0.562q2.35,0 3.925,1.575T22,8.15q0,2.875 -2.125,5.275a60,60 0,0 1,-4.825 4.825l-1.7,1.55a1.65,1.65 0,0 1,-0.637 0.4q-0.363,0.125 -0.713,0.125", 0)));
        f4907a = imageVectorA;
        return imageVectorA;
    }
}
