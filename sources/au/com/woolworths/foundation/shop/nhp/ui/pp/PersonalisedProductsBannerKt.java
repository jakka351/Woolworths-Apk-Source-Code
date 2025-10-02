package au.com.woolworths.foundation.shop.nhp.ui.pp;

import android.content.Context;
import android.graphics.Color;
import androidx.camera.core.impl.b;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.TertiaryIconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.foundation.shop.nhp.model.ImageWithAltData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "productCarouselPlaying", "nhp-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PersonalisedProductsBannerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8788a = 380;

    public static final void a(final PersonalisedProductsBannerData data, final Function1 onBannerClick, final Function1 onBannerImpression, final Modifier modifier, Composer composer, int i) {
        Intrinsics.h(data, "data");
        Intrinsics.h(onBannerClick, "onBannerClick");
        Intrinsics.h(onBannerImpression, "onBannerImpression");
        ComposerImpl composerImplV = composer.v(1512835724);
        int i2 = (composerImplV.I(data) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBannerClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onBannerImpression) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(21352936, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    composer2.o(-1633490746);
                    Function1 function1 = onBannerImpression;
                    boolean zN = composer2.n(function1);
                    final PersonalisedProductsBannerData personalisedProductsBannerData = data;
                    boolean zI = zN | composer2.I(personalisedProductsBannerData);
                    Object objG = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zI || objG == composer$Companion$Empty$1) {
                        objG = new a(23, function1, personalisedProductsBannerData);
                        composer2.A(objG);
                    }
                    composer2.l();
                    EffectsKt.c(unit, (Function1) objG, composer2);
                    composer2.o(-1633490746);
                    Function1 function12 = onBannerClick;
                    boolean zN2 = composer2.n(function12) | composer2.I(personalisedProductsBannerData);
                    Object objG2 = composer2.G();
                    if (zN2 || objG2 == composer$Companion$Empty$1) {
                        objG2 = new f(23, function12, personalisedProductsBannerData);
                        composer2.A(objG2);
                    }
                    Function0 function0 = (Function0) objG2;
                    composer2.l();
                    Modifier modifierA = AspectRatioKt.a(SizeKt.w(SizeKt.A(modifier, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false), BitmapDescriptorFactory.HUE_RED, PersonalisedProductsBannerKt.f8788a, 1), 3.2f);
                    RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(4);
                    String str = personalisedProductsBannerData.c;
                    if (str == null) {
                        str = "";
                    }
                    long jB = ColorKt.b(Color.parseColor(str));
                    String str2 = personalisedProductsBannerData.b;
                    SurfaceKt.a(function0, modifierA, false, roundedCornerShapeB, jB, ColorKt.b(Color.parseColor(str2 != null ? str2 : "")), null, null, ComposableLambdaKt.c(1234502017, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1.3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Number) obj4).intValue() & 3;
                            Unit unit2 = Unit.f24250a;
                            if (iIntValue2 == 2 && composer3.c()) {
                                composer3.j();
                                return unit2;
                            }
                            Context context = (Context) composer3.x(AndroidCompositionLocals_androidKt.b);
                            composer3.o(1849434622);
                            Object objG3 = composer3.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                            if (objG3 == composer$Companion$Empty$12) {
                                objG3 = SnapshotStateKt.f(null);
                                composer3.A(objG3);
                            }
                            final MutableState mutableState = (MutableState) objG3;
                            composer3.l();
                            composer3.o(-1633490746);
                            boolean zI2 = composer3.I(context);
                            Object objG4 = composer3.G();
                            if (zI2 || objG4 == composer$Companion$Empty$12) {
                                objG4 = new PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1(context, mutableState, null);
                                composer3.A(objG4);
                            }
                            composer3.l();
                            EffectsKt.e(composer3, unit2, (Function2) objG4);
                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 48);
                            int p = composer3.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                            Modifier.Companion companion = Modifier.Companion.d;
                            Modifier modifierD = ComposedModifierKt.d(composer3, companion);
                            ComposeUiNode.e3.getClass();
                            Function0 function02 = ComposeUiNode.Companion.b;
                            if (composer3.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer3.i();
                            if (composer3.getO()) {
                                composer3.K(function02);
                            } else {
                                composer3.e();
                            }
                            Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                b.z(p, composer3, p, function2);
                            }
                            Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                            SpacerKt.a(composer3, SizeKt.u(companion, 12));
                            PersonalisedProductsBannerData personalisedProductsBannerData2 = personalisedProductsBannerData;
                            ImageWithAltData imageWithAltData = personalisedProductsBannerData2.d;
                            List list = personalisedProductsBannerData2.e;
                            String str3 = imageWithAltData != null ? imageWithAltData.f8777a : null;
                            String str4 = imageWithAltData != null ? imageWithAltData.b : null;
                            Modifier modifierA2 = ClipKt.a(SizeKt.q(companion, 48), RoundedCornerShapeKt.f1100a);
                            composer3.o(536183111);
                            ColorPainter colorPainter = ((Boolean) composer3.x(InspectionModeKt.f1972a)).booleanValue() ? new ColorPainter(CoreTheme.a(composer3).f4774a.b.b) : null;
                            composer3.l();
                            SingletonAsyncImageKt.b(str3, str4, modifierA2, null, colorPainter, null, null, null, null, null, null, null, composer3, 0, 0, 32744);
                            float f = 8;
                            SpacerKt.a(composer3, SizeKt.u(companion, f));
                            String str5 = personalisedProductsBannerData2.f8784a;
                            if (str5 == null) {
                                str5 = "";
                            }
                            TextStyle textStyle = CoreTheme.f(composer3).f5120a.b.c;
                            Modifier modifierH = PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f, 1);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                            TextKt.a(str5, textStyle, rowScopeInstance.a(modifierH, 1.0f, true), 0L, null, 0, 2, false, 3, null, composer3, 102236160, 696);
                            composer3.o(536205888);
                            if (!list.isEmpty()) {
                                SpacerKt.a(composer3, SizeKt.u(companion, f));
                                Boolean bool = (Boolean) mutableState.getD();
                                InlineProductCarouselKt.a(list, bool != null ? bool.booleanValue() : true, null, composer3, 0);
                                SpacerKt.a(composer3, SizeKt.u(companion, f));
                                Boolean bool2 = (Boolean) mutableState.getD();
                                CrossfadeKt.b(Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true), rowScopeInstance.b(companion, Alignment.Companion.j), null, "isPlaying", ComposableLambdaKt.c(972828803, new Function3<Boolean, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                        Composer composer4 = (Composer) obj6;
                                        int iIntValue3 = ((Number) obj7).intValue();
                                        if ((iIntValue3 & 6) == 0) {
                                            iIntValue3 |= composer4.p(zBooleanValue) ? 4 : 2;
                                        }
                                        if ((iIntValue3 & 19) == 18 && composer4.c()) {
                                            composer4.j();
                                        } else {
                                            Composer$Companion$Empty$1 composer$Companion$Empty$13 = Composer.Companion.f1624a;
                                            MutableState mutableState2 = mutableState;
                                            if (zBooleanValue) {
                                                composer4.o(-896381078);
                                                ImageVector imageVector = CoreTheme.e(composer4).f4879a.o;
                                                composer4.o(5004770);
                                                Object objG5 = composer4.G();
                                                if (objG5 == composer$Companion$Empty$13) {
                                                    objG5 = new e(mutableState2, 10);
                                                    composer4.A(objG5);
                                                }
                                                composer4.l();
                                                TertiaryIconButtonKt.a(imageVector, "Pause product animation", (Function0) objG5, null, false, IconButtonSpec.Size.g, composer4, 197040, 24);
                                                composer4.l();
                                            } else {
                                                composer4.o(-895973459);
                                                ImageVector imageVector2 = CoreTheme.e(composer4).f4879a.p;
                                                composer4.o(5004770);
                                                Object objG6 = composer4.G();
                                                if (objG6 == composer$Companion$Empty$13) {
                                                    objG6 = new e(mutableState2, 11);
                                                    composer4.A(objG6);
                                                }
                                                composer4.l();
                                                TertiaryIconButtonKt.a(imageVector2, "Play product animation", (Function0) objG6, null, false, IconButtonSpec.Size.g, composer4, 197040, 24);
                                                composer4.l();
                                            }
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer3), composer3, 27648, 4);
                            }
                            composer3.l();
                            composer3.f();
                            return unit2;
                        }
                    }, composer2), composer2, 452);
                    return unit;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(data, onBannerClick, onBannerImpression, modifier, i, 1);
        }
    }
}
