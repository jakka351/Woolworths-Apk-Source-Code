package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.checkout.ui.compose.ComposableSingletons$IdVerificationBottomSheetKt$lambda$-985338256$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$IdVerificationBottomSheetKt$lambda$985338256$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IdVerificationBottomSheetKt$lambda$985338256$1 d = new ComposableSingletons$IdVerificationBottomSheetKt$lambda$985338256$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IdVerificationBottomSheetKt.c("We're unable to verify you're 18+", "\"https://uatcdn0.woolworths.media/content/wowproductimages/medium/464845.jpg\"", "+42", "To continue with this order, please retry your online age verification. Alternatively, you can choose Delivery on a different day or Pick up.", "Retry age verification", "Not Now", null, null, composer, 224694, BERTags.PRIVATE);
        }
        return Unit.f24250a;
    }
}
