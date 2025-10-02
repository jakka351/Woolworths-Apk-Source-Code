package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "index", "", "invoke", "(ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class MotionCarouselKt$items$1 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        Composer composer = (Composer) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= composer.r(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) != 18 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
