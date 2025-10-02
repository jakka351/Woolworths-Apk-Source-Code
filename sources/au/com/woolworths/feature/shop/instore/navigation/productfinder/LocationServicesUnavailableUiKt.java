package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LocationServicesUnavailableUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProductFinderContract.LocationServicesUnavailableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState = ProductFinderContract.LocationServicesUnavailableState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState2 = ProductFinderContract.LocationServicesUnavailableState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(ProductFinderContract.LocationServicesUnavailableState locationServicesUnavailableState, Function0 onAction, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(locationServicesUnavailableState, "locationServicesUnavailableState");
        Intrinsics.h(onAction, "onAction");
        ComposerImpl composerImplV = composer.v(-311014297);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(locationServicesUnavailableState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onAction) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            int iOrdinal = locationServicesUnavailableState.ordinal();
            Modifier.Companion companion = Modifier.Companion.d;
            if (iOrdinal == 0) {
                composerImplV.o(-1182114618);
                b(StringResources_androidKt.c(composerImplV, R.string.share_location_title), StringResources_androidKt.c(composerImplV, R.string.share_location_description), StringResources_androidKt.c(composerImplV, R.string.share_location_action), onAction, companion, composerImplV, (i3 << 6) & 64512);
                composerImplV.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(-1181645340);
                b(StringResources_androidKt.c(composerImplV, R.string.update_settings_title), StringResources_androidKt.c(composerImplV, R.string.share_location_description), StringResources_androidKt.c(composerImplV, R.string.update_settings_action), onAction, companion, composerImplV, (i3 << 6) & 64512);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw au.com.woolworths.android.onesite.a.w(1762979213, composerImplV, false);
                }
                composerImplV.o(-1181190198);
                composerImplV.V(false);
            }
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(locationServicesUnavailableState, onAction, modifier2, i, 18);
        }
    }

    public static final void b(String str, String str2, String str3, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        final String str4 = str3;
        final Function0 function02 = function0;
        final Modifier modifier2 = modifier;
        ComposerImpl composerImplV = composer.v(-812433180);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier2) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            Modifier modifierF = PaddingKt.f(modifier2, f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f), Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier.Companion companion = Modifier.Companion.d;
            int i4 = i2;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_tracking, 0, composerImplV), null, SizeKt.k(companion, 48), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(6), Alignment.Companion.m, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, i4 & 14, 0, 65534);
            TextKt.b(str2, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, (i4 >> 3) & 14, 0, 65530);
            composerImplV = composerImplV;
            str4 = str3;
            function02 = function0;
            modifier2 = modifier;
            CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(1579963786, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.LocationServicesUnavailableUiKt$LocationServicesUnavailableUi$2$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f2 = 1;
                        Modifier modifierA = SizeKt.a(modifier2, f2, f2);
                        float f3 = 0;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f3, f3, f3, f3);
                        PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.f1248a;
                        ButtonColors buttonColorsD = ButtonDefaults.d(0L, WxTheme.a(composer2).h(), Color.b(WxTheme.a(composer2).h(), 0.25f), composer2, 1);
                        final String str5 = str4;
                        ButtonKt.c(function02, modifierA, false, null, null, null, buttonColorsD, paddingValuesImpl, ComposableLambdaKt.c(618990765, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.productfinder.LocationServicesUnavailableUiKt$LocationServicesUnavailableUi$2$1$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TextButton = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String upperCase = str5.toUpperCase(Locale.ROOT);
                                    Intrinsics.g(upperCase, "toUpperCase(...)");
                                    TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).o, composer3, 0, 0, 65534);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 124);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.coachmark.d(str, str2, str4, function02, modifier2, i, 1);
        }
    }
}
