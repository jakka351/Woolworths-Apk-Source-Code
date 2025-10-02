package au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.ResText;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$TwoButtonDialogKt$lambda$1372989101$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ResText resText = new ResText(R.string.shop_lists_aisle_warning_title);
            ResText resText2 = new ResText(R.string.shop_lists_aisle_warning_message);
            ResText resText3 = new ResText(R.string.shop_lists_button_cancel);
            ResText resText4 = new ResText(R.string.shop_lists_change_mode_button);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            TwoButtonDialogKt.a(resText, resText2, resText3, function0, resText4, (Function0) objE, composer, 199680);
        }
        return Unit.f24250a;
    }
}
