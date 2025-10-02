package au.com.woolworths.design.core.ui.foundation.icon.common.status;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuccessFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5011a;

    public static final ImageVector a() {
        ImageVector imageVector = f5011a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-status-success-fill", CollectionsKt.Q(new PathData("m10.6,13.8 l-2.15,-2.15a0.95,0.95 0,0 0,-0.7 -0.275,0.95 0.95,0 0,0 -0.7,0.275 0.95,0.95 0,0 0,-0.275 0.7q0,0.425 0.275,0.7L9.9,15.9q0.3,0.3 0.7,0.3t0.7,-0.3l5.65,-5.65a0.95,0.95 0,0 0,0.275 -0.7,0.95 0.95,0 0,0 -0.275,-0.7 0.95,0.95 0,0 0,-0.7 -0.275,0.95 0.95,0 0,0 -0.7,0.275zM12,22a9.7,9.7 0,0 1,-3.9 -0.788,10.1 10.1,0 0,1 -3.175,-2.137q-1.35,-1.35 -2.137,-3.175A9.7,9.7 0,0 1,2 12q0,-2.075 0.788,-3.9a10.1,10.1 0,0 1,2.137 -3.175q1.35,-1.35 3.175,-2.137A9.7,9.7 0,0 1,12 2q2.075,0 3.9,0.788a10.1,10.1 0,0 1,3.175 2.137q1.35,1.35 2.137,3.175A9.7,9.7 0,0 1,22 12a9.7,9.7 0,0 1,-0.788 3.9,10.1 10.1,0 0,1 -2.137,3.175q-1.35,1.35 -3.175,2.137A9.7,9.7 0,0 1,12 22", 0)));
        f5011a = imageVectorA;
        return imageVectorA;
    }
}
