package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferCarouselViewKt$lambda$956969972$1 implements Function4<AnimatedContentScope, String, Composer, Integer, Unit> {
    public static final ComposableSingletons$OfferCarouselViewKt$lambda$956969972$1 d = new ComposableSingletons$OfferCarouselViewKt$lambda$956969972$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        String title = (String) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.h(title, "title");
        float f = 16;
        TextKt.b(title, PaddingKt.j(Modifier.Companion.d, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 6), WxTheme.a(composer).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).n, composer, ((iIntValue >> 3) & 14) | 48, 0, 65528);
        return Unit.f24250a;
    }
}
