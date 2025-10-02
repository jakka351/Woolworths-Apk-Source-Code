package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomeFillKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4967a;

    public static final ImageVector a() {
        ImageVector imageVector = f4967a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-home-fill", CollectionsKt.Q(new PathData("M5.75,21q-0.79,0 -1.353,-0.587A1.97,1.97 0,0 1,3.833 19v-9q0,-0.476 0.204,-0.9a1.9,1.9 0,0 1,0.563 -0.7l5.75,-4.5q0.264,-0.2 0.551,-0.3t0.6,-0.1 0.598,0.1q0.288,0.1 0.551,0.3l5.75,4.5q0.36,0.275 0.563,0.7 0.204,0.425 0.204,0.9v9q0,0.824 -0.563,1.413A1.8,1.8 0,0 1,17.25 21h-3.833v-7H9.584v7z", 0)));
        f4967a = imageVectorA;
        return imageVectorA;
    }
}
