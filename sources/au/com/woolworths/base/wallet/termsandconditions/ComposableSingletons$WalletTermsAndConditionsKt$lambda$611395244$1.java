package au.com.woolworths.base.wallet.termsandconditions;

import androidx.compose.runtime.Composer;
import androidx.navigation.compose.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$WalletTermsAndConditionsKt$lambda$611395244$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$WalletTermsAndConditionsKt$lambda$611395244$1 d = new ComposableSingletons$WalletTermsAndConditionsKt$lambda$611395244$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(8, (byte) 0);
                composer.A(objG);
            }
            composer.l();
            WalletTermsAndConditionsKt.b((Function2) objG, null, null, composer, 54, 28);
        }
        return Unit.f24250a;
    }
}
