package au.com.woolworths.sdui.legacy.broadcastbanner.designcoreadapter;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import au.com.woolworths.sdui.legacy.banner.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$BroadcastBannerKt$lambda$1739596472$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(10), Alignment.Companion.m, composer, 6);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            if (composer.w() == null) {
                ComposablesKt.b();
                throw null;
            }
            composer.i();
            if (composer.getO()) {
                composer.K(function0);
            } else {
                composer.e();
            }
            Updater.b(composer, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            BroadcastBannerType broadcastBannerType = BroadcastBannerType.NEUTRAL;
            Boolean bool = Boolean.TRUE;
            BroadcastBannerData broadcastBannerData = new BroadcastBannerData("Don't miss out on points", "Link Everyday Rewards card", "com.woolworths.shop://rewards/add", null, "", broadcastBannerType, "https://www.nicepng.com/png/detail/356-3563301_instagram-instagram-circle-icon.png", bool, "bannerID");
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(3);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new c(4);
                composer.A(objE);
            }
            composer.l();
            BroadcastBannerKt.a(broadcastBannerData, function1, (Function1) objE, null, composer, 432, 8);
            BroadcastBannerData broadcastBannerData2 = new BroadcastBannerData("Don't miss out on points", "Link Everyday Rewards card", "com.woolworths.shop://rewards/add", "Get started", "", BroadcastBannerType.PRIMARY, "https://www.nicepng.com/png/detail/356-3563301_instagram-instagram-circle-icon.png", bool, "bannerID");
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new c(5);
                composer.A(objG2);
            }
            Function1 function12 = (Function1) objG2;
            Object objE2 = a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new c(6);
                composer.A(objE2);
            }
            composer.l();
            BroadcastBannerKt.a(broadcastBannerData2, function12, (Function1) objE2, null, composer, 432, 8);
            BroadcastBannerData broadcastBannerData3 = new BroadcastBannerData("Don't miss out on points", "Link Everyday Rewards card", "com.woolworths.shop://rewards/add", "Get started", "", BroadcastBannerType.REWARDS, "https://www.nicepng.com/png/detail/356-3563301_instagram-instagram-circle-icon.png", bool, "bannerID");
            composer.o(1849434622);
            Object objG3 = composer.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new c(7);
                composer.A(objG3);
            }
            Function1 function13 = (Function1) objG3;
            Object objE3 = a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new c(8);
                composer.A(objE3);
            }
            composer.l();
            BroadcastBannerKt.a(broadcastBannerData3, function13, (Function1) objE3, null, composer, 432, 8);
            composer.f();
        }
        return Unit.f24250a;
    }
}
