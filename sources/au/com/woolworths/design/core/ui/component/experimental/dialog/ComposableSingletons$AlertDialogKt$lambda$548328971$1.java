package au.com.woolworths.design.core.ui.component.experimental.dialog;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.dialog.ComposableSingletons$AlertDialogKt$lambda$-548328971$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$AlertDialogKt$lambda$548328971$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AlertDialogKt$lambda$548328971$1 d = new ComposableSingletons$AlertDialogKt$lambda$548328971$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            AlertDialogKt.a("Lorem ipsum dolor sit amet. At mollitia possimus quo neque inventore ut porro facilis non blanditiis magni.", "Ok", null, "Lorem ipsum", null, null, (Function0) objG, composer, 1575990, 52);
        }
        return Unit.f24250a;
    }
}
