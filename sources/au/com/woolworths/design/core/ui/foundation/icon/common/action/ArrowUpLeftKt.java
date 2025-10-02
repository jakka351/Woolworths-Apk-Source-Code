package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrowUpLeftKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4897a;

    public static final ImageVector a() {
        ImageVector imageVector = f4897a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-arrow-up-left", CollectionsKt.Q(new PathData("M8,9.4V17q0,0.424 -0.287,0.712A0.97,0.97 0,0 1,7 18a0.97,0.97 0,0 1,-0.713 -0.288A0.97,0.97 0,0 1,6 17V7q0,-0.424 0.287,-0.713A0.97,0.97 0,0 1,7 6h10q0.424,0 0.712,0.287Q18,6.576 18,7t-0.288,0.713A0.97,0.97 0,0 1,17 8H9.4l8.9,8.9a0.95,0.95 0,0 1,0.275 0.7,0.95 0.95,0 0,1 -0.275,0.7 0.95,0.95 0,0 1,-0.7 0.275,0.95 0.95,0 0,1 -0.7,-0.275z", 0)));
        f4897a = imageVectorA;
        return imageVectorA;
    }
}
