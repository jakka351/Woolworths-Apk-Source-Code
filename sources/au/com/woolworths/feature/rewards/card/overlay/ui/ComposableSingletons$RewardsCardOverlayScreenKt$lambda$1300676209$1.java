package au.com.woolworths.feature.rewards.card.overlay.ui;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$RewardsCardOverlayScreenKt$lambda$1300676209$1 implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$RewardsCardOverlayScreenKt$lambda$1300676209$1 d = new ComposableSingletons$RewardsCardOverlayScreenKt$lambda$1300676209$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData data = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(data, "data");
        SnackbarKt.b(data, null, null, WxTheme.a(composer).a(), WxTheme.a(composer).c(), WxTheme.a(composer).h(), BitmapDescriptorFactory.HUE_RED, composer, iIntValue & 14, 142);
        return Unit.f24250a;
    }
}
