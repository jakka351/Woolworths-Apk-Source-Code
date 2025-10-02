package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.IntOffset;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.account.settings.v2.ui.ComposableSingletons$AccountSettingsScreenKt$lambda$-82692833$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$AccountSettingsScreenKt$lambda$82692833$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$AccountSettingsScreenKt$lambda$82692833$1 d = new ComposableSingletons$AccountSettingsScreenKt$lambda$82692833$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.n(item) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.c()) {
            composer.j();
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 4, ToneColors.i, composer, PaddingKt.j(item.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5)), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13));
        }
        return Unit.f24250a;
    }
}
