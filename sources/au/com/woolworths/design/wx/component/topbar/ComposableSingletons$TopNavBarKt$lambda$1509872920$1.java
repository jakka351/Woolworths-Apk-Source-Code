package au.com.woolworths.design.wx.component.topbar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposableSingletons$TopNavBarKt$lambda$1509872920$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$TopNavBarKt$lambda$1509872920$1 d = new ComposableSingletons$TopNavBarKt$lambda$1509872920$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TopNavBar = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TopNavBar, "$this$TopNavBar");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ImageVector imageVectorA = AddKt.a();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(23);
                composer.A(objG);
            }
            composer.l();
            IconButtonKt.c(imageVectorA, "Add", (Function0) objG, null, false, 0L, composer, 432, 56);
        }
        return Unit.f24250a;
    }
}
