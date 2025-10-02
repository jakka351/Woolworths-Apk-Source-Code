package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shared.force.upgrade.ConfigActionContract;
import au.com.woolworths.feature.shared.force.upgrade.UpdateDialogType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shared.force.upgrade.ui.ComposableSingletons$ConfigActionScreenKt$lambda$-1584723713$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ConfigActionScreenKt$lambda$1584723713$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ConfigActionContract.ViewState.Content content = new ConfigActionContract.ViewState.Content(new UpdateDialogType.OsFlexibleUpdate("Update", "To continue to access the Woolworths app you need the latest Android version. Please update.", "Update", "Not now"));
            ApplicationType applicationType = ApplicationType.e;
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(22);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new a(4);
                composer.A(objE);
            }
            Function2 function2 = (Function2) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new a(5);
                composer.A(objE2);
            }
            Function2 function22 = (Function2) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new a(6);
                composer.A(objE3);
            }
            Function2 function23 = (Function2) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(23);
                composer.A(objE4);
            }
            Function1 function12 = (Function1) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new a(7);
                composer.A(objE5);
            }
            composer.l();
            ConfigActionScreenKt.a(content, applicationType, function1, function2, function22, function23, function12, (Function2) objE5, composer, 14380464);
        }
        return Unit.f24250a;
    }
}
