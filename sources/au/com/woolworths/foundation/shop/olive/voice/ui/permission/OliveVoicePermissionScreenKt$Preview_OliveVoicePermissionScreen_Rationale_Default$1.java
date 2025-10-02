package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.foundation.shop.nhp.ui.edr.c;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class OliveVoicePermissionScreenKt$Preview_OliveVoicePermissionScreen_Rationale_Default$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            final PermissionStatus.Denied denied = new PermissionStatus.Denied(true);
            PermissionState permissionState = new PermissionState(denied) { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.permission.OliveVoicePermissionScreenKt$Preview_OliveVoicePermissionScreen_Rationale_Default$PreviewPermissionState

                /* renamed from: a, reason: collision with root package name */
                public final PermissionStatus.Denied f8859a;

                {
                    this.f8859a = denied;
                }

                @Override // com.google.accompanist.permissions.PermissionState
                public final void a() {
                }

                @Override // com.google.accompanist.permissions.PermissionState
                /* renamed from: b */
                public final String getF14364a() {
                    return "";
                }

                @Override // com.google.accompanist.permissions.PermissionState
                public final PermissionStatus getStatus() {
                    return this.f8859a;
                }
            };
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shared.instore.wifi.ui.a(0);
                composer.A(objG);
            }
            Function2 function2 = (Function2) objG;
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
            Function0 function02 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new h(20);
                composer.A(objE3);
            }
            Function0 function03 = (Function0) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new c(10);
                composer.A(objE4);
            }
            composer.l();
            OliveVoicePermissionScreenKt.a(permissionState, function2, function0, function02, function03, (Function1) objE4, null, composer, 224688, 64);
        }
        return Unit.f24250a;
    }
}
