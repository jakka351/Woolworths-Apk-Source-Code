package au.com.woolworths.design.wx.component.searchbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.text.input.TextFieldValue;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.stable.corerow.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.wx.component.searchbar.ComposableSingletons$SearchBarKt$lambda$-1657873840$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SearchBarKt$lambda$1657873840$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TextFieldValue textFieldValue = new TextFieldValue("", 0L, 6);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(11);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            Function0 function0 = (Function0) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new h(20);
                composer.A(objE2);
            }
            composer.l();
            SearchBarKt.a(textFieldValue, true, function1, function0, (Function0) objE2, null, 0L, "hint", ComposableSingletons$SearchBarKt.f5145a, composer, 113274294, 96);
        }
        return Unit.f24250a;
    }
}
