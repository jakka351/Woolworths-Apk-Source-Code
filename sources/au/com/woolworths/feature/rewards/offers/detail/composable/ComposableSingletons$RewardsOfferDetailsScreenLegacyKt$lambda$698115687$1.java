package au.com.woolworths.feature.rewards.offers.detail.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.offers.detail.composable.ComposableSingletons$RewardsOfferDetailsScreenLegacyKt$lambda$-698115687$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsOfferDetailsScreenLegacyKt$lambda$698115687$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsOfferDetailsContractLegacy.ViewState viewState = new RewardsOfferDetailsContractLegacy.ViewState(RewardsOfferMockDataLegacyKt.f6334a, null, 24);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(17);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(18);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new h(20);
                composer.A(objE2);
            }
            Function0 function0 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new h(20);
                composer.A(objE3);
            }
            Function0 function02 = (Function0) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new h(20);
                composer.A(objE4);
            }
            Function0 function03 = (Function0) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new a0(16);
                composer.A(objE5);
            }
            composer.l();
            RewardsOfferDetailsScreenLegacyKt.f(viewState, function1, function12, function0, function02, function03, (Function2) objE5, null, null, composer, 1797552, KyberEngine.KyberPolyBytes);
        }
        return Unit.f24250a;
    }
}
