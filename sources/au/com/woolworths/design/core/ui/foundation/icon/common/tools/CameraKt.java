package au.com.woolworths.design.core.ui.foundation.icon.common.tools;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5032a;

    public static final ImageVector a() {
        ImageVector imageVector = f5032a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-tools-camera", CollectionsKt.Q(new PathData("M12,17.5q1.875,0 3.188,-1.312Q16.5,14.875 16.5,13t-1.312,-3.187T12,8.5 8.813,9.813Q7.499,11.125 7.5,13q0,1.875 1.313,3.188Q10.125,17.5 12,17.5m0,-2q-1.05,0 -1.775,-0.725T9.5,13t0.725,-1.775T12,10.5t1.775,0.725T14.5,13t-0.725,1.775T12,15.5M4,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,2 19L2,7q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,4 5h3.15L8.4,3.65q0.275,-0.3 0.662,-0.475Q9.45,3 9.876,3h4.25q0.424,0 0.813,0.175 0.387,0.175 0.662,0.475L16.85,5L20,5q0.824,0 1.413,0.588Q22,6.175 22,7v12q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,20 21zM4,19h16L20,7h-4.05l-1.825,-2h-4.25L8.05,7L4,7z", 0)));
        f5032a = imageVectorA;
        return imageVectorA;
    }
}
