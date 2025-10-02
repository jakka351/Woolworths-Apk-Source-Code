package au.com.woolworths.foundation.rewards.common.ui.iconlist.internal;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.button.ButtonTextKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.trafficdrivers.ui.a;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActionItemUiKt {
    public static final void a(final RewardsIconListModel.Item.Action action, final Function1 function1, final Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(action, "action");
        ComposerImpl composerImplV = composer.v(-594629779);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(action) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(12460077, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.ActionItemUiKt$ActionItemUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierC = OffsetKt.c(modifier, -8, BitmapDescriptorFactory.HUE_RED, 2);
                        PaddingValuesImpl paddingValuesImplA = PaddingKt.a(8, BitmapDescriptorFactory.HUE_RED, 2);
                        composer2.o(-1633490746);
                        Object obj3 = function1;
                        boolean zN = composer2.n(obj3);
                        final RewardsIconListModel.Item.Action action2 = action;
                        boolean zN2 = zN | composer2.n(action2);
                        Object objG = composer2.G();
                        if (zN2 || objG == Composer.Companion.f1624a) {
                            objG = new f(20, obj3, action2);
                            composer2.A(objG);
                        }
                        composer2.l();
                        SecondaryButtonKt.c((Function0) objG, modifierC, false, paddingValuesImplA, ComposableLambdaKt.c(788940572, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.ActionItemUiKt$ActionItemUi$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope SecondaryButton = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(SecondaryButton, "$this$SecondaryButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    RewardsIconListModel.ItemAction itemAction = action2.f8587a;
                                    ButtonTextKt.b("Click Me!", null, 0L, false, null, null, composer3, 0, 62);
                                    float f = 16;
                                    ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_open_in_new, 0, composer3), null, SizeKt.g(SizeKt.u(PaddingKt.j(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), f), f), null, null, BitmapDescriptorFactory.HUE_RED, ColorFilter.Companion.a(WxTheme.a(composer3).h()), composer3, 432, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 27648, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 4, action, function1, modifier, false);
        }
    }
}
