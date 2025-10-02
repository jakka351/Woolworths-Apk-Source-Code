package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RefreshKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4917a;

    public static final ImageVector a() {
        ImageVector imageVector = f4917a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-refresh", CollectionsKt.Q(new PathData("M12,22q1.874,0 3.512,-0.712a9.2,9.2 0,0 0,2.85 -1.925,9.2 9.2,0 0,0 1.926,-2.85A8.7,8.7 0,0 0,21 13a0.97,0.97 0,0 0,-0.288 -0.713A0.97,0.97 0,0 0,20 12a0.97,0.97 0,0 0,-0.712 0.287A0.97,0.97 0,0 0,19 13q0,2.925 -2.038,4.962T12,20t-4.962,-2.038T5,13t2.037,-4.962T12,6h0.15l-0.85,0.85q-0.3,0.3 -0.288,0.7 0.014,0.4 0.288,0.7 0.3,0.3 0.712,0.313a0.93,0.93 0,0 0,0.713 -0.288L15.3,5.7q0.3,-0.3 0.3,-0.7t-0.3,-0.7l-2.575,-2.575a0.93,0.93 0,0 0,-0.713 -0.287,1.02 1.02,0 0,0 -0.712,0.312q-0.275,0.3 -0.288,0.7t0.288,0.7l0.85,0.85H12q-1.874,0 -3.512,0.713a9.2,9.2 0,0 0,-2.85 1.925,9.2 9.2,0 0,0 -1.925,2.85A8.7,8.7 0,0 0,3 13q0,1.874 0.712,3.512a9.2,9.2 0,0 0,1.926 2.85,9.2 9.2,0 0,0 2.85,1.926A8.7,8.7 0,0 0,12 22", 0)));
        f4917a = imageVectorA;
        return imageVectorA;
    }
}
