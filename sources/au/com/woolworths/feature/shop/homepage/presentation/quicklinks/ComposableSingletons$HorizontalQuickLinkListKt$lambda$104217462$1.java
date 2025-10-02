package au.com.woolworths.feature.shop.homepage.presentation.quicklinks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$HorizontalQuickLinkListKt$lambda$104217462$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HorizontalQuickLinkListKt$lambda$104217462$1 d = new ComposableSingletons$HorizontalQuickLinkListKt$lambda$104217462$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            QuickLinkHorizontalListData quickLinkHorizontalListData = HorizontalQuickLinkListKt.f7253a;
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new d(2);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new d(3);
                composer.A(objE);
            }
            composer.l();
            HorizontalQuickLinkListKt.b(quickLinkHorizontalListData, function1, (Function1) objE, null, composer, 432, 8);
        }
        return Unit.f24250a;
    }
}
