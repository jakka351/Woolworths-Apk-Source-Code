package au.com.woolworths.design.core.ui.foundation.icon.common.action;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThumbsUpKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4927a;

    public static final ImageVector a() {
        ImageVector imageVector = f4927a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-action-thumbs-up", CollectionsKt.Q(new PathData("M7,21V8l6,-5.95q0.375,-0.375 0.887,-0.437 0.513,-0.063 0.988,0.187t0.7,0.7 0.1,0.925L14.55,8H21q0.8,0 1.4,0.6T23,10v2q0,0.176 -0.05,0.375 -0.05,0.2 -0.1,0.375l-3,7.05q-0.225,0.5 -0.75,0.85T18,21zM9,8.85V19h9l3,-7v-2h-9l1.35,-5.5zM4,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,2 19v-9q0,-0.825 0.587,-1.412A1.93,1.93 0,0 1,4 8h3v2H4v9h3v2z", 0)));
        f4927a = imageVectorA;
        return imageVectorA;
    }
}
