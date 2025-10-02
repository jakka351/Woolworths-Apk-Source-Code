package au.com.woolworths.android.onesite.modules.deliveryaddress.search.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopSearchBarKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeliveryAddressSearchToolbarKt {
    public static final void a(final boolean z, final String str, final String str2, final String str3, final Function0 onBackClick, final Function0 onSkipClick, final Function1 onAddressSearchTextChange, Composer composer, final int i) {
        Intrinsics.h(onBackClick, "onBackClick");
        Intrinsics.h(onSkipClick, "onSkipClick");
        Intrinsics.h(onAddressSearchTextChange, "onAddressSearchTextChange");
        ComposerImpl composerImplV = composer.v(157189934);
        if (((i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.n(str) ? 32 : 16) | (composerImplV.n(str2) ? 256 : 128) | (composerImplV.n(str3) ? 2048 : 1024) | (composerImplV.I(onBackClick) ? 16384 : 8192) | (composerImplV.I(onSkipClick) ? 131072 : 65536) | (composerImplV.I(onAddressSearchTextChange) ? 1048576 : 524288)) & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final boolean z2 = (str2 == null || str2.length() == 0) && !z;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1031862702, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.ui.DeliveryAddressSearchToolbarKt$DeliveryAddressSearchToolbar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final boolean z3 = z;
                        final Function0 function0 = onSkipClick;
                        final boolean z4 = z2;
                        final String str4 = str;
                        final Function1 function1 = onAddressSearchTextChange;
                        final String str5 = str3;
                        final Function0 function02 = onBackClick;
                        final String str6 = str2;
                        SurfaceKt.b(null, null, 0L, 0L, null, null, ComposableLambdaKt.c(310717334, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.ui.DeliveryAddressSearchToolbarKt$DeliveryAddressSearchToolbar$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                float f;
                                Modifier.Companion companion;
                                Modifier.Companion companion2;
                                int i2;
                                boolean z5;
                                String str7;
                                Modifier.Companion companion3;
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier.Companion companion4 = Modifier.Companion.d;
                                    Modifier modifierD = ComposedModifierKt.d(composer3, companion4);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function03);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, columnMeasurePolicyA, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        b.z(p, composer3, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function24);
                                    Modifier modifierE = SizeKt.e(companion4, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 48);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierE);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function03);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA, function2);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        b.z(p2, composer3, p2, function23);
                                    }
                                    Updater.b(composer3, modifierD2, function24);
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, "Back", function02, null, false, null, CoreTheme.b(composer3).e.c.f4854a, composer3, 48, 56);
                                    composer3.o(-2097197803);
                                    String str8 = str6;
                                    if (str8 == null) {
                                        companion = companion4;
                                        f = 1.0f;
                                    } else {
                                        f = 1.0f;
                                        companion = companion4;
                                        TextKt.a(str8, CoreTheme.f(composer3).e.f5133a.b, null, 0L, null, 0, 0, false, 0, null, composer3, 0, 1020);
                                        composer3 = composer3;
                                    }
                                    composer3.l();
                                    SpacerKt.a(composer3, RowScopeInstance.f974a.a(companion, f, true));
                                    composer3.o(-2097188872);
                                    if (z3) {
                                        TextButtonKt.a(function0, "Skip", null, false, null, null, null, null, composer3, 48, 508);
                                    }
                                    composer3.l();
                                    composer3.o(-2097181658);
                                    boolean z6 = z4;
                                    String str9 = str4;
                                    Function1 function12 = function1;
                                    if (z6) {
                                        Modifier.Companion companion5 = companion;
                                        str7 = str9;
                                        i2 = 16;
                                        z5 = z6;
                                        companion2 = companion5;
                                        TopSearchBarKt.a(str7, PaddingKt.j(companion5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11), false, null, 0L, 0L, null, null, null, function12, composer3, 48, 508);
                                    } else {
                                        companion2 = companion;
                                        i2 = 16;
                                        z5 = z6;
                                        str7 = str9;
                                    }
                                    composer3.l();
                                    composer3.f();
                                    composer3.o(1274877335);
                                    if (z5) {
                                        companion3 = companion2;
                                    } else {
                                        Modifier.Companion companion6 = companion2;
                                        companion3 = companion6;
                                        TopSearchBarKt.a(str7, PaddingKt.h(companion6, i2, BitmapDescriptorFactory.HUE_RED, 2), false, null, 0L, 0L, null, null, null, function12, composer3, 48, 508);
                                    }
                                    composer3.l();
                                    composer3.o(1274887809);
                                    String str10 = str5;
                                    if (str10 != null) {
                                        Composer composer4 = composer3;
                                        TextKt.a(str10, CoreTheme.f(composer3).f5120a.b.f5123a, PaddingKt.f(companion3, i2), CoreTheme.b(composer3).e.d.b, null, 0, 0, false, 0, null, composer4, KyberEngine.KyberPolyBytes, 1008);
                                        composer3 = composer4;
                                    }
                                    composer3.l();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 63);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(z, str, str2, str3, onBackClick, onSkipClick, onAddressSearchTextChange, i) { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.ui.a
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function1 j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    DeliveryAddressSearchToolbarKt.a(this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
