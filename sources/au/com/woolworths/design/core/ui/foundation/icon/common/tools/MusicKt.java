package au.com.woolworths.design.core.ui.foundation.icon.common.tools;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MusicKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f5035a;

    public static final ImageVector a() {
        ImageVector imageVector = f5035a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-tools-music", CollectionsKt.Q(new PathData("M9.5,20.5q-1.65,0 -2.825,-1.175T5.5,16.5t1.175,-2.825T9.5,12.5q0.575,0 1.063,0.137 0.487,0.138 0.937,0.413V3.5q0,-0.424 0.287,-0.712A0.97,0.97 0,0 1,12.5 2.5h4q0.424,0 0.712,0.288 0.288,0.287 0.288,0.712v2q0,0.424 -0.288,0.713a0.97,0.97 0,0 1,-0.712 0.287h-3v10q0,1.65 -1.175,2.825T9.5,20.5", 0)));
        f5035a = imageVectorA;
        return imageVectorA;
    }
}
