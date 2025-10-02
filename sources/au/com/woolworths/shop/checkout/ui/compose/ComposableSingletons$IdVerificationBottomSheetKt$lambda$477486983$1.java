package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.checkout.ui.compose.ComposableSingletons$IdVerificationBottomSheetKt$lambda$-477486983$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$IdVerificationBottomSheetKt$lambda$477486983$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IdVerificationBottomSheetKt$lambda$477486983$1 d = new ComposableSingletons$IdVerificationBottomSheetKt$lambda$477486983$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IdVerificationBottomSheetKt.c("Liquor requires an online age check for same-day delivery", "", "+42", "State liquor laws require you to upload your ID \u2028to confirm that you’re 18+. Verify this only once with our trusted partner, or alternatively, select Pick up or Delivery on a different day.", "Start age verification", "Not Now", null, null, composer, 224694, BERTags.PRIVATE);
        }
        return Unit.f24250a;
    }
}
