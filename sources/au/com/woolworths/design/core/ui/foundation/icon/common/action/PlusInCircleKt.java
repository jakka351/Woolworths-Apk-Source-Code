package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlusInCircleKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4914a;

    public static final ImageVector a() {
        ImageVector imageVector = f4914a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-plus-in-circle", CollectionsKt.Q(new PathData("M11,13v3q0,0.424 0.287,0.712 0.288,0.288 0.713,0.288 0.424,0 0.713,-0.288A0.97,0.97 0,0 0,13 16v-3h3q0.424,0 0.712,-0.287A0.97,0.97 0,0 0,17 12a0.97,0.97 0,0 0,-0.288 -0.713A0.97,0.97 0,0 0,16 11h-3L13,8a0.97,0.97 0,0 0,-0.287 -0.713A0.97,0.97 0,0 0,12 7a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,11 8v3L8,11a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,7 12q0,0.424 0.287,0.713Q7.576,13 8,13zM12,22a9.7,9.7 0,0 1,-3.9 -0.788,10.1 10.1,0 0,1 -3.175,-2.137q-1.35,-1.35 -2.137,-3.175A9.7,9.7 0,0 1,2 12q0,-2.075 0.788,-3.9a10.1,10.1 0,0 1,2.137 -3.175q1.35,-1.35 3.175,-2.137A9.7,9.7 0,0 1,12 2q2.075,0 3.9,0.788a10.1,10.1 0,0 1,3.175 2.137q1.35,1.35 2.137,3.175A9.7,9.7 0,0 1,22 12a9.7,9.7 0,0 1,-0.788 3.9,10.1 10.1,0 0,1 -2.137,3.175q-1.35,1.35 -3.175,2.137A9.7,9.7 0,0 1,12 22m0,-2q3.35,0 5.675,-2.325T20,12t-2.325,-5.675T12,4 6.325,6.325 4,12t2.325,5.675T12,20", 0)));
        f4914a = imageVectorA;
        return imageVectorA;
    }
}
