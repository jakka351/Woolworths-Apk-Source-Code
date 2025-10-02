package au.com.woolworths.design.core.ui.foundation.icon.common.tools;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageFileKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5034a;

    public static final ImageVector a() {
        ImageVector imageVector = f5034a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-tools-image-file", CollectionsKt.Q(new PathData("M5,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,3 19L3,5q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,5 3h14q0.824,0 1.413,0.587Q21,4.176 21,5v14q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,19 21zM5,19h14L19,5L5,5zM7,17h10q0.3,0 0.45,-0.275a0.44,0.44 0,0 0,-0.05 -0.525l-2.75,-3.675a0.48,0.48 0,0 0,-0.4 -0.2q-0.25,0 -0.4,0.2L11.25,16 9.4,13.525a0.48,0.48 0,0 0,-0.4 -0.2q-0.25,0 -0.4,0.2l-2,2.675a0.44,0.44 0,0 0,-0.05 0.525Q6.7,17 7,17", 0)));
        f5034a = imageVectorA;
        return imageVectorA;
    }
}
