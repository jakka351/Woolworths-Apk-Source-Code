package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4953a;

    public static final ImageVector a() {
        ImageVector imageVector = f4953a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-back", CollectionsKt.Q(new PathData("m9.152,12 l7.044,7.35q0.36,0.375 0.347,0.875a1.27,1.27 0,0 1,-0.371 0.875q-0.36,0.375 -0.839,0.375 -0.48,0 -0.838,-0.375l-7.38,-7.675A2.08,2.08 0,0 1,6.54 12a2.08,2.08 0,0 1,0.576 -1.425l7.379,-7.7q0.36,-0.375 0.85,-0.362 0.492,0.012 0.85,0.387 0.36,0.375 0.36,0.875t-0.36,0.875z", 0)));
        f4953a = imageVectorA;
        return imageVectorA;
    }
}
