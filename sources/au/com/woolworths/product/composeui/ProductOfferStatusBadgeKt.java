package au.com.woolworths.product.composeui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextDataKt;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.icon.AnimatedIconKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferDataExtKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductOfferStatusBadgeKt {
    public static final void a(RewardsOfferInfo rewardsOfferInfo, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        final long jH;
        Modifier modifier2;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(1030678273);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.I(rewardsOfferInfo) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.d : modifier;
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            final TintableTextData tintableTextDataB = RewardsOfferDataExtKt.b(rewardsOfferInfo, context);
            if (tintableTextDataB == null) {
                modifier2 = modifier4;
            } else {
                if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                    composerImplV.o(843961195);
                    jH = WxTheme.a(composerImplV).h();
                    composerImplV.V(false);
                } else {
                    composerImplV.o(844024249);
                    composerImplV.o(1849434622);
                    Object objG = composerImplV.G();
                    if (objG == Composer.Companion.f1624a) {
                        int iA = TintableTextDataKt.a(tintableTextDataB, context);
                        Integer numValueOf = Integer.valueOf(iA);
                        if (iA == 0) {
                            numValueOf = null;
                        }
                        objG = numValueOf != null ? new Color(ColorKt.b(numValueOf.intValue())) : null;
                        composerImplV.A(objG);
                    }
                    Color color = (Color) objG;
                    composerImplV.V(false);
                    jH = color == null ? WxTheme.a(composerImplV).h() : color.f1766a;
                    composerImplV.V(false);
                }
                modifier2 = modifier4;
                SurfaceKt.a(modifier2, RoundedCornerShapeKt.b(4), Color.b(jH, 0.1f), 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1146406720, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductOfferStatusBadgeKt$ProductOfferStatusBadge$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier.Companion companion = Modifier.Companion.d;
                            Modifier modifierG = PaddingKt.g(companion, 16, 4);
                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierG);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function0);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            TintableTextData tintableTextData = tintableTextDataB;
                            int i5 = tintableTextData.d;
                            Integer numValueOf2 = Integer.valueOf(i5);
                            if (i5 == 0) {
                                numValueOf2 = null;
                            }
                            composer2.o(1931672723);
                            if (numValueOf2 != null) {
                                AnimatedIconKt.a(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 11), WxTheme.a(composer2).h(), composer2, 432);
                            }
                            composer2.l();
                            int i6 = tintableTextData.c;
                            Integer numValueOf3 = Integer.valueOf(i6);
                            if (i6 == 0) {
                                numValueOf3 = null;
                            }
                            composer2.o(1931693367);
                            if (numValueOf3 != null) {
                                IconKt.a(ForwardingPainterKt.a(PainterResources_androidKt.a(numValueOf3.intValue(), 0, composer2), ColorFilter.Companion.a(TintColors.e), null, 10), null, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 11), 0L, composer2, 432, 8);
                            }
                            composer2.l();
                            String upperCase = tintableTextData.f4322a.toUpperCase(Locale.ROOT);
                            Intrinsics.g(upperCase, "toUpperCase(...)");
                            TextKt.b(upperCase, null, jH, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer2).r, 0L, 0L, FontWeight.k, null, 0L, 0L, null, null, 0, 16777211), composer2, 0, 0, 65530);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i3 >> 3) & 14) | 1572864, 56);
            }
            modifier3 = modifier2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(rewardsOfferInfo, modifier3, i, i2, 1);
        }
    }
}
