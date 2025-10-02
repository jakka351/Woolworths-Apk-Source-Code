package au.com.woolworths.design.core.ui.foundation.icon.common.payment;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CouponKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4977a;

    public static final ImageVector a() {
        ImageVector imageVector = f4977a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-payment-coupon", CollectionsKt.Q(new PathData("M14.25,21.4q-0.575,0.575 -1.425,0.575T11.4,21.4l-8.8,-8.8q-0.276,-0.275 -0.437,-0.65a2,2 0,0 1,-0.163 -0.8V4q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,4 2h7.15q0.425,0 0.8,0.163 0.375,0.162 0.65,0.437l8.8,8.825q0.575,0.575 0.575,1.412a1.92,1.92 0,0 1,-0.575 1.413zM12.825,20l7.15,-7.15L11.15,4H4v7.15zM6.5,8q0.624,0 1.063,-0.437Q8,7.125 8,6.5t-0.437,-1.062A1.45,1.45 0,0 0,6.5 5q-0.625,0 -1.062,0.438A1.45,1.45 0,0 0,5 6.5q0,0.624 0.438,1.063Q5.874,8 6.5,8", 0)));
        f4977a = imageVectorA;
        return imageVectorA;
    }
}
