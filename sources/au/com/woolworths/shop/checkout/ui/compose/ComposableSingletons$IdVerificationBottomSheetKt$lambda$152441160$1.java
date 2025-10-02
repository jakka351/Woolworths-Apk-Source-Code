package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.VectorResources_androidKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$IdVerificationBottomSheetKt$lambda$152441160$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$IdVerificationBottomSheetKt$lambda$152441160$1 d = new ComposableSingletons$IdVerificationBottomSheetKt$lambda$152441160$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope ExternalLinkPrimaryButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(ExternalLinkPrimaryButton, "$this$ExternalLinkPrimaryButton");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ImageKt.b(VectorResources_androidKt.b(R.drawable.ic_external_link, 6, composer), null, null, composer, 48, 124);
        }
        return Unit.f24250a;
    }
}
