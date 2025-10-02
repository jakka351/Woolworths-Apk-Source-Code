package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductCardButtonsKt$lambda$-2019906275$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductCardButtonsKt$lambda$2019906275$1 implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductCardButtonsKt$lambda$2019906275$1 d = new ComposableSingletons$ProductCardButtonsKt$lambda$2019906275$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope Button = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_tick_round, 6, composer), "", null, WxTheme.a(composer).h(), composer, 48, 4);
            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            String upperCase = StringResources_androidKt.c(composer, R.string.in_stock).toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, modifierJ, WxTheme.a(composer).f(), 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, WxTheme.b(composer).q, composer, 48, 432, 59384);
        }
        return Unit.f24250a;
    }
}
