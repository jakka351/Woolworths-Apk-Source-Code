package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeartKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4908a;

    public static final ImageVector a() {
        ImageVector imageVector = f4908a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-heart", CollectionsKt.Q(new PathData("m10.65,20.15 l-1.725,-1.575a68,68 0,0 1,-4.788 -4.812Q2.002,11.375 2,8.5q0,-2.35 1.575,-3.925T7.5,3q1.325,0 2.5,0.563T12,5.1a6,6 0,0 1,2 -1.537A5.7,5.7 0,0 1,16.5 3q2.35,0 3.925,1.575T22,8.5q0,2.875 -2.125,5.275A60,60 0,0 1,15.05 18.6l-1.7,1.55a1.9,1.9 0,0 1,-1.35 0.55,1.9 1.9,0 0,1 -1.35,-0.55m0.4,-13.05q-0.725,-1.025 -1.55,-1.562T7.5,5Q6,5 5,6T4,8.5q0,1.3 0.925,2.762 0.925,1.463 2.213,2.838a38,38 0,0 0,2.65 2.575q1.362,1.2 2.212,1.975 0.85,-0.775 2.213,-1.975t2.65,-2.575a19,19 0,0 0,2.212 -2.838Q20,9.8 20,8.5 20,7 19,6t-2.5,-1q-1.175,0 -2,0.537 -0.825,0.538 -1.55,1.563a1.14,1.14 0,0 1,-0.95 0.5,1.14 1.14,0 0,1 -0.95,-0.5", 0)));
        f4908a = imageVectorA;
        return imageVectorA;
    }
}
