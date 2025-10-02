package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.SurfaceKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RatingSubmissionTermsAndConditionsKt$TermsAndConditionsPreview$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionTermsAndConditionsKt$TermsAndConditionsPreview$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) != 2 || !composer.c()) {
                throw null;
            }
            composer.j();
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(PaddingKt.f(Modifier.Companion.d, 16), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-164561130, new AnonymousClass1(), composer), composer, 1572870, 62);
        }
        return Unit.f24250a;
    }
}
