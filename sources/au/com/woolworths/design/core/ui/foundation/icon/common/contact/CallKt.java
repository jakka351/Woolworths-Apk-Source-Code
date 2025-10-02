package au.com.woolworths.design.core.ui.foundation.icon.common.contact;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4932a;

    public static final ImageVector a() {
        ImageVector imageVector = f4932a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-contact-call", CollectionsKt.Q(new PathData("M19.95,21q-3.125,0 -6.175,-1.363t-5.55,-3.862 -3.862,-5.55T3,4.05q0,-0.45 0.3,-0.75t0.75,-0.3H8.1a0.93,0.93 0,0 1,0.625 0.237,0.9 0.9,0 0,1 0.325,0.563l0.65,3.5q0.05,0.4 -0.025,0.675T9.4,8.45L6.975,10.9q0.5,0.926 1.188,1.787 0.687,0.863 1.512,1.663 0.775,0.775 1.625,1.438 0.85,0.661 1.8,1.212l2.35,-2.35a1.4,1.4 0,0 1,0.588 -0.338,1.6 1.6,0 0,1 0.712,-0.062l3.45,0.7q0.35,0.1 0.575,0.363A0.88,0.88 0,0 1,21 15.9v4.05q0,0.45 -0.3,0.75t-0.75,0.3", 0)));
        f4932a = imageVectorA;
        return imageVectorA;
    }
}
