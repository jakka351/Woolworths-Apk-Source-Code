package au.com.woolworths.design.core.ui.foundation.icon.common.navigation;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CaretUpKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f4957a;

    public static final ImageVector a() {
        ImageVector imageVector = f4957a;
        if (imageVector != null) {
            return imageVector;
        }
        int i = VectorKt.f1820a;
        ImageVector imageVectorA = IconBuilderKt.a("icon-navigation-caret-up", CollectionsKt.Q(new PathData("M12.53,7.696a0.773,0.773 0,0 0,-1.06 0l-5.69,5.452c-0.472,0.453 -0.138,1.227 0.53,1.227h11.38c0.667,0 1.002,-0.774 0.53,-1.227z", 0)));
        f4957a = imageVectorA;
        return imageVectorA;
    }
}
