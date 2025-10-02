package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SecurityPreferencesActivity$StandardPage$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesActivity$StandardPage$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
            } else {
                ImageVector imageVectorA = ArrowBackKt.a();
                String strC = StringResources_androidKt.c(composer, R.string.back_button_description);
                composer.o(5004770);
                boolean zI = composer.I(null);
                Object objG = composer.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.rewards.offers.home.ui.a(22);
                    composer.A(objG);
                }
                composer.l();
                IconButtonKt.c(imageVectorA, strC, (Function0) objG, null, false, 0L, composer, 0, 56);
            }
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TopNavBarKt.b(null, null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(2133079821, new AnonymousClass1(), composer), null, composer, 805306368, 0, 1534);
        }
        return Unit.f24250a;
    }
}
