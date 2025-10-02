package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.modeselector.ui.ComposableSingletons$ModeSelectorScreenKt$lambda$-1296017287$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModeSelectorScreenKt$lambda$1296017287$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ResText resText = new ResText(R.string.mode_selector_error_response_pickup_dialog_title);
            ResText resText2 = new ResText(R.string.mode_selector_error_response_delivery_dialog_button_text);
            ResText resText3 = new ResText(R.string.mode_selector_error_response_dialog_cancel);
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
            ModeSelectorContract.ViewState viewState = new ModeSelectorContract.ViewState(false, new ModeSelectorContract.DialogModel(resText, "The selected store or pick up option is no longer available", resText2, resText3, function0, (Function0) objE), null, null, null, null, 2042);
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new h(20);
                composer.A(objG2);
            }
            Function0 function02 = (Function0) objG2;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new h(20);
                composer.A(objE2);
            }
            Function0 function03 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(10);
                composer.A(objE3);
            }
            Function1 function1 = (Function1) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.feature.shared.instore.wifi.ui.b(27);
                composer.A(objE4);
            }
            Function2 function2 = (Function2) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(11);
                composer.A(objE5);
            }
            Function1 function12 = (Function1) objE5;
            Object objE6 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE6 == composer$Companion$Empty$1) {
                objE6 = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(12);
                composer.A(objE6);
            }
            composer.l();
            ModeSelectorScreenKt.a(viewState, function02, function03, function1, function2, function12, (Function1) objE6, null, composer, 1797552, 128);
        }
        return Unit.f24250a;
    }
}
