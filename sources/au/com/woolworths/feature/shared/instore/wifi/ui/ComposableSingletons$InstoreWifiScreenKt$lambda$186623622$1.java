package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.ShopAppSpecificContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreWifiScreenKt$lambda$186623622$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InstoreWifiScreenKt$lambda$186623622$1 d = new ComposableSingletons$InstoreWifiScreenKt$lambda$186623622$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Boolean bool = Boolean.FALSE;
            InstoreWifiContract.ViewState viewState = new InstoreWifiContract.ViewState("0.0.1", false, bool, false, null, null);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composer, 3);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(bool);
                composer.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composer.l();
            ShopAppSpecificContent shopAppSpecificContent = new ShopAppSpecificContent("");
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG2);
            }
            Function0 function0 = (Function0) objG2;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new a(0);
                composer.A(objE);
            }
            Function2 function2 = (Function2) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.feature.shared.force.upgrade.ui.b(29);
                composer.A(objE2);
            }
            Function1 function1 = (Function1) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objE3);
            }
            Function1 function12 = (Function1) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objE4);
            }
            Function1 function13 = (Function1) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new a(28);
                composer.A(objE5);
            }
            Function2 function22 = (Function2) objE5;
            Object objE6 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE6 == composer$Companion$Empty$1) {
                objE6 = new a(29);
                composer.A(objE6);
            }
            Function2 function23 = (Function2) objE6;
            Object objE7 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE7 == composer$Companion$Empty$1) {
                objE7 = new b(0);
                composer.A(objE7);
            }
            Function2 function24 = (Function2) objE7;
            Object objE8 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE8 == composer$Companion$Empty$1) {
                objE8 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE8);
            }
            Function0 function02 = (Function0) objE8;
            Object objE9 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE9 == composer$Companion$Empty$1) {
                objE9 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE9);
            }
            Function0 function03 = (Function0) objE9;
            Object objE10 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE10 == composer$Companion$Empty$1) {
                objE10 = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objE10);
            }
            Function1 function14 = (Function1) objE10;
            composer.l();
            Boolean bool2 = Boolean.TRUE;
            composer.o(1849434622);
            Object objG3 = composer.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objG3);
            }
            composer.l();
            InstoreWifiScreenKt.f(function0, viewState, scaffoldStateD, "", function2, mutableState, function1, function12, function13, function22, function23, function24, function02, function03, function14, bool2, (Function1) objG3, shopAppSpecificContent, null, composer, 920349702, 1797558, 262144);
        }
        return Unit.f24250a;
    }
}
