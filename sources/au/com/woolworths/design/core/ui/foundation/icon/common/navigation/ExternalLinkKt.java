package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExternalLinkKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4964a;

    public static final ImageVector a() {
        ImageVector imageVector = f4964a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-external-link", CollectionsKt.Q(new PathData("M5,21q-0.824,0 -1.412,-0.587A1.93,1.93 0,0 1,3 19V5q0,-0.824 0.587,-1.412A1.93,1.93 0,0 1,5 3h6q0.424,0 0.713,0.288Q12,3.575 12,4q0,0.424 -0.287,0.713A0.97,0.97 0,0 1,11 5H5v14h14v-6q0,-0.424 0.288,-0.713A0.97,0.97 0,0 1,20 12q0.424,0 0.712,0.287 0.288,0.288 0.288,0.713v6q0,0.824 -0.587,1.413A1.93,1.93 0,0 1,19 21zM19,6.4 L10.4,15a0.95,0.95 0,0 1,-0.7 0.275A0.95,0.95 0,0 1,9 15a0.95,0.95 0,0 1,-0.275 -0.7q0,-0.425 0.275,-0.7L17.6,5H15a0.97,0.97 0,0 1,-0.713 -0.287A0.97,0.97 0,0 1,14 4q0,-0.424 0.287,-0.712A0.97,0.97 0,0 1,15 3h6v6q0,0.424 -0.288,0.713A0.97,0.97 0,0 1,20 10a0.97,0.97 0,0 1,-0.712 -0.287A0.97,0.97 0,0 1,19 9z", 0)));
        f4964a = imageVectorA;
        return imageVectorA;
    }
}
