package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4920a;

    public static final ImageVector a() {
        ImageVector imageVector = f4920a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-send", CollectionsKt.Q(new PathData("M21.354,12.986 L5.446,19.913a1,1 0,0 1,-0.981 -0.094Q4,19.513 4,18.927V5.073q0,-0.585 0.465,-0.892a1,1 0,0 1,0.981 -0.094l15.908,6.927Q22,11.307 22,12q0,0.692 -0.646,0.986M6.066,17.328 L18.307,12 6.066,6.672v3.73L12.264,12l-6.198,1.598z", 0)));
        f4920a = imageVectorA;
        return imageVectorA;
    }
}
