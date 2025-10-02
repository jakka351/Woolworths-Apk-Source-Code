package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SkipKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4922a;

    public static final ImageVector a() {
        ImageVector imageVector = f4922a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-skip", CollectionsKt.Q(new PathData("M17,18a0.97,0.97 0,0 1,-0.712 -0.288A0.97,0.97 0,0 1,16 17V7q0,-0.424 0.288,-0.713A0.97,0.97 0,0 1,17 6q0.424,0 0.712,0.287Q18,6.576 18,7v10q0,0.424 -0.288,0.712A0.97,0.97 0,0 1,17 18M6.55,16.975q-0.5,0.35 -1.025,0.05a0.97,0.97 0,0 1,-0.525 -0.9v-8.25q0,-0.6 0.525,-0.888a0.94,0.94 0,0 1,1.025 0.038l6.2,4.15q0.45,0.3 0.45,0.825t-0.45,0.825z", 0)));
        f4922a = imageVectorA;
        return imageVectorA;
    }
}
