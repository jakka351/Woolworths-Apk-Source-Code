package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForwardKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4965a;

    public static final ImageVector a() {
        ImageVector imageVector = f4965a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-forward", CollectionsKt.Q(new PathData("M13.872,12 L6.828,4.65a1.2,1.2 0,0 1,-0.347 -0.888q0.012,-0.512 0.371,-0.887 0.36,-0.375 0.85,-0.375 0.492,0 0.851,0.375l7.355,7.7q0.288,0.3 0.432,0.675t0.143,0.75a2.08,2.08 0,0 1,-0.575 1.425l-7.379,7.7q-0.36,0.374 -0.838,0.363a1.17,1.17 0,0 1,-0.839 -0.388,1.24 1.24,0 0,1 -0.36,-0.888q0,-0.512 0.36,-0.887z", 0)));
        f4965a = imageVectorA;
        return imageVectorA;
    }
}
