package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class DynamicPageScreenKt$PreviewDynamicPageScreen$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DynamicPageContract.ViewState viewState = new DynamicPageContract.ViewState(null, null, 25);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new androidx.navigation.compose.h(20, (byte) 0);
                composer.A(objG);
            }
            Function2 function2 = (Function2) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE);
            }
            Function0 function0 = (Function0) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE2);
            }
            Function0 function02 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE3);
            }
            Function0 function03 = (Function0) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE4);
            }
            Function0 function04 = (Function0) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE5);
            }
            Function0 function05 = (Function0) objE5;
            Object objE6 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE6 == composer$Companion$Empty$1) {
                objE6 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE6);
            }
            composer.l();
            DynamicPageScreenKt.b(viewState, function2, function0, function02, function03, function04, function05, null, (Function0) objE6, composer, 102460848, 128);
        }
        return Unit.f24250a;
    }
}
