package au.com.woolworths.shop.rewards.priming.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.rewards.priming.data.CvpItem;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.rewards.priming.ui.ComposableSingletons$PrimingCvpTileUiKt$lambda$-1623240591$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PrimingCvpTileUiKt$lambda$1623240591$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PrimingCvpTileUiKt.a(new CvpItem(R.drawable.ic_edr_member_price, R.string.priming_cvp_generic_3), PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 8), composer, 48);
        }
        return Unit.f24250a;
    }
}
