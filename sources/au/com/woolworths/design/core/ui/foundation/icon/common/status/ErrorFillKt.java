package au.com.woolworths.design.core.ui.foundation.icon.common.status;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5002a;

    public static final ImageVector a() {
        ImageVector imageVector = f5002a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-status-error-fill", CollectionsKt.Q(new PathData("M12,17q0.424,0 0.713,-0.288A0.97,0.97 0,0 0,13 16a0.97,0.97 0,0 0,-0.287 -0.713A0.97,0.97 0,0 0,12 15a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,11 16q0,0.424 0.287,0.712 0.288,0.288 0.713,0.288m0,-4q0.424,0 0.713,-0.287A0.97,0.97 0,0 0,13 12V8a0.97,0.97 0,0 0,-0.287 -0.713A0.97,0.97 0,0 0,12 7a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,11 8v4q0,0.424 0.287,0.713 0.288,0.287 0.713,0.287m0,9a9.7,9.7 0,0 1,-3.9 -0.788,10.1 10.1,0 0,1 -3.175,-2.137q-1.35,-1.35 -2.137,-3.175A9.7,9.7 0,0 1,2 12q0,-2.075 0.788,-3.9a10.1,10.1 0,0 1,2.137 -3.175q1.35,-1.35 3.175,-2.137A9.7,9.7 0,0 1,12 2q2.075,0 3.9,0.788a10.1,10.1 0,0 1,3.175 2.137q1.35,1.35 2.137,3.175A9.7,9.7 0,0 1,22 12a9.7,9.7 0,0 1,-0.788 3.9,10.1 10.1,0 0,1 -2.137,3.175q-1.35,1.35 -3.175,2.137A9.7,9.7 0,0 1,12 22", 0)));
        f5002a = imageVectorA;
        return imageVectorA;
    }
}
