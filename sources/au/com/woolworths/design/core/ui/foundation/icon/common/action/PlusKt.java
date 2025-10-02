package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlusKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4915a;

    public static final ImageVector a() {
        ImageVector imageVector = f4915a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-plus", CollectionsKt.Q(new PathData("M12,19a0.97,0.97 0,0 1,-0.713 -0.288A0.97,0.97 0,0 1,11 18v-5H6a0.97,0.97 0,0 1,-0.713 -0.287A0.97,0.97 0,0 1,5 12q0,-0.424 0.287,-0.713A0.97,0.97 0,0 1,6 11h5V6q0,-0.424 0.287,-0.713A0.97,0.97 0,0 1,12 5q0.424,0 0.713,0.287Q13,5.576 13,6v5h5q0.424,0 0.712,0.287 0.288,0.288 0.288,0.713 0,0.424 -0.288,0.713A0.97,0.97 0,0 1,18 13h-5v5q0,0.424 -0.287,0.712A0.97,0.97 0,0 1,12 19", 0)));
        f4915a = imageVectorA;
        return imageVectorA;
    }
}
