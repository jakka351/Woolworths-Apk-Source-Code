package au.com.woolworths.shop.cart.ui.shared;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinkButtonKt {
    public static final void a(int i, Composer composer, final Modifier modifier, final String str, final Function0 onClick) {
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1792705664);
        if ((((composerImplV.n(str) ? 4 : 2) | i | (composerImplV.I(onClick) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(1207347136, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.shared.LinkButtonKt$LinkButton$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 1;
                        Modifier modifierA = SizeKt.a(modifier, f, f);
                        float f2 = 0;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                        composer2.o(5004770);
                        Function0 function0 = onClick;
                        boolean zN = composer2.n(function0);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new f(14, function0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        final String str2 = str;
                        ButtonKt.c((Function0) objG, modifierA, false, null, null, null, null, paddingValuesImpl, ComposableLambdaKt.c(799703267, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.shared.LinkButtonKt$LinkButton$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TextButton = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.n(TextButton) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    TextKt.b(str2, TextButton.a(companion, 1.0f, false), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.c(composer3).l, composer3, 0, 0, 65532);
                                    IconKt.a(PainterResources_androidKt.a(R.drawable.ic_chevron_right, 0, composer3), null, SizeKt.r(PaddingKt.j(TextButton.b(companion, Alignment.Companion.k), 4, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), 5, 8), 0L, composer3, 48, 8);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 252);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, modifier, onClick, i);
        }
    }
}
