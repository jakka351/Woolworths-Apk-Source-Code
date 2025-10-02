package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrowRightKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4951a;

    public static final ImageVector a() {
        ImageVector imageVector = f4951a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-arrow-right", CollectionsKt.Q(new PathData("M15.501,12.458H4.791a0.93,0.93 0,0 1,-0.682 -0.275,0.93 0.93,0 0,1 -0.276,-0.683q0,-0.407 0.276,-0.683a0.93,0.93 0,0 1,0.683 -0.275h10.71l-4.697,-4.696a0.88,0.88 0,0 1,-0.275 -0.67,0.96 0.96,0 0,1 0.3,-0.672q0.287,-0.263 0.67,-0.275a0.88,0.88 0,0 1,0.671 0.275l6.325,6.325a0.84,0.84 0,0 1,0.204 0.312q0.06,0.166 0.06,0.36 0,0.19 -0.06,0.359a0.84,0.84 0,0 1,-0.204 0.31l-6.325,6.326a0.9,0.9 0,0 1,-0.659 0.264,0.98 0.98,0 0,1 -0.683,-0.264 0.93,0.93 0,0 1,-0.287 -0.683q0,-0.395 0.287,-0.683z", 0)));
        f4951a = imageVectorA;
        return imageVectorA;
    }
}
