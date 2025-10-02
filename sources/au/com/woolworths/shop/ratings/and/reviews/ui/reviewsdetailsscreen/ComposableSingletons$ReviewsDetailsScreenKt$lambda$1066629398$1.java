package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReviewsDetailsScreenKt$lambda$1066629398$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ReviewsDetailsScreenKt$lambda$1066629398$1 d = new ComposableSingletons$ReviewsDetailsScreenKt$lambda$1066629398$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composer).e.b.e, composer, PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2));
        }
        return Unit.f24250a;
    }
}
