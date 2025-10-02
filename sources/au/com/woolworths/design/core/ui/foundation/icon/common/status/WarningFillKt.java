package au.com.woolworths.design.core.ui.foundation.icon.common.status;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WarningFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5013a;

    public static final ImageVector a() {
        ImageVector imageVector = f5013a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-status-warning-fill", CollectionsKt.Q(new PathData("M2.725,21a0.97,0.97 0,0 1,-0.85 -0.5,1.1 1.1,0 0,1 -0.138,-0.488 0.9,0.9 0,0 1,0.138 -0.512l9.25,-16q0.15,-0.25 0.387,-0.375T12,3t0.487,0.125a1,1 0,0 1,0.388 0.375l9.25,16q0.15,0.25 0.137,0.512a1.1,1.1 0,0 1,-0.137 0.488,0.97 0.97,0 0,1 -0.85,0.5zM12,18q0.424,0 0.712,-0.288A0.97,0.97 0,0 0,13 17a0.97,0.97 0,0 0,-0.288 -0.712A0.97,0.97 0,0 0,12 16a0.97,0.97 0,0 0,-0.713 0.288A0.97,0.97 0,0 0,11 17q0,0.424 0.287,0.712 0.288,0.288 0.713,0.288m0,-3q0.424,0 0.712,-0.287A0.97,0.97 0,0 0,13 14v-3a0.97,0.97 0,0 0,-0.288 -0.713A0.97,0.97 0,0 0,12 10a0.97,0.97 0,0 0,-0.713 0.287A0.97,0.97 0,0 0,11 11v3q0,0.424 0.287,0.713 0.288,0.287 0.713,0.287", 0)));
        f5013a = imageVectorA;
        return imageVectorA;
    }
}
