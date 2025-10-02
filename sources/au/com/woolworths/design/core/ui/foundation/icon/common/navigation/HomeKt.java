package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomeKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4968a;

    public static final ImageVector a() {
        ImageVector imageVector = f4968a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-home", CollectionsKt.Q(new PathData("M6,19h3v-6h6v6h3v-9l-6,-4.5L6,10zM6,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,4 19v-9a1.99,1.99 0,0 1,0.8 -1.6l6,-4.5a2.1,2.1 0,0 1,0.575 -0.3q0.3,-0.1 0.625,-0.1t0.625,0.1 0.575,0.3l6,4.5q0.375,0.275 0.588,0.7T20,10v9q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,18 21h-5v-6h-2v6z", 0)));
        f4968a = imageVectorA;
        return imageVectorA;
    }
}
