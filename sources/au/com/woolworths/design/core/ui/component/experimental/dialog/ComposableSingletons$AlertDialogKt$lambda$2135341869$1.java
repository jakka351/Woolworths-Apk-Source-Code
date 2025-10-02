package au.com.woolworths.design.core.ui.component.experimental.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$AlertDialogKt$lambda$2135341869$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AlertDialogKt$lambda$2135341869$1 d = new ComposableSingletons$AlertDialogKt$lambda$2135341869$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            AlertDialogKt.a("Lorem ipsum dolor sit amet. At mollitia possimus quo neque inventore ut porro facilis non blanditiis magni.", "Cancel", null, "Lorem ipsum", "Confirm", function0, (Function0) objE, composer, 1797174, 4);
        }
        return Unit.f24250a;
    }
}
