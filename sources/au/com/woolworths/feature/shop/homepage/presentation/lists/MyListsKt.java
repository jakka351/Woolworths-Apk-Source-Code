package au.com.woolworths.feature.shop.homepage.presentation.lists;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListItemData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MyListsKt {
    public static final void a(final MyShoppingListsData data, Function1 onMyShoppingListsActionClick, Function1 onMyShoppingListItemClick, Function0 onBuyAgainClick, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z;
        final Function1 function1;
        final Function0 function0;
        ComposerImpl composerImpl;
        Intrinsics.h(data, "data");
        Intrinsics.h(onMyShoppingListsActionClick, "onMyShoppingListsActionClick");
        Intrinsics.h(onMyShoppingListItemClick, "onMyShoppingListItemClick");
        Intrinsics.h(onBuyAgainClick, "onBuyAgainClick");
        ComposerImpl composerImplV = composer.v(-1175159200);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onMyShoppingListsActionClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onMyShoppingListItemClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onBuyAgainClick) ? 2048 : 1024;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            function1 = onMyShoppingListItemClick;
            function0 = onBuyAgainClick;
        } else {
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            int i4 = i2;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, 6), 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.b(data.f7202a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).y, composerImplV, 0, 0, 65534);
            ComposerImpl composerImpl2 = composerImplV;
            String str = data.b;
            composerImpl2.o(-1858418826);
            if (str != null) {
                TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImpl2).r, composerImpl2, 0, 3120, 55294);
                composerImpl2 = composerImpl2;
            }
            composerImpl2.V(false);
            composerImpl2.V(true);
            final String str2 = data.c;
            composerImpl2.o(-42907433);
            if (str2 == null) {
                z = true;
            } else {
                composerImpl2.o(-1633490746);
                boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
                Object objG = composerImpl2.G();
                if (z2 || objG == Composer.Companion.f1624a) {
                    objG = new n(9, onMyShoppingListsActionClick, data);
                    composerImpl2.A(objG);
                }
                composerImpl2.V(false);
                z = true;
                ComposerImpl composerImpl3 = composerImpl2;
                ButtonKt.b((Function0) objG, null, false, null, null, null, null, new PaddingValuesImpl(f, f, f, f), ComposableLambdaKt.c(657859830, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.lists.MyListsKt$MyLists$1$1$2$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        RowScope OutlinedButton = (RowScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(OutlinedButton, "$this$OutlinedButton");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            String upperCase = str2.toUpperCase(Locale.ROOT);
                            Intrinsics.g(upperCase, "toUpperCase(...)");
                            TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer2).q, 0L, 0L, null, null, TextUnitKt.c(0), 0L, null, null, 0, 16777087), composer2, 0, 0, 65534);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl2), composerImpl3, 907542528, 190);
                composerImpl2 = composerImpl3;
            }
            composerImpl2.V(false);
            composerImpl2.V(z);
            Modifier modifierH = PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2);
            function1 = onMyShoppingListItemClick;
            function0 = onBuyAgainClick;
            ComposerImpl composerImpl4 = composerImpl2;
            CardKt.a(modifierH, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(954891303, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.lists.MyListsKt$MyLists$1$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    Composer$Companion$Empty$1 composer$Companion$Empty$1;
                    boolean z3;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        float f2 = 1.0f;
                        Modifier modifierZ = SizeKt.z(SizeKt.e(companion2, 1.0f), Alignment.Companion.e, 2);
                        ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierZ);
                        ComposeUiNode.e3.getClass();
                        Function0 function03 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA3, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function25 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function25);
                        }
                        Updater.b(composer2, modifierD4, ComposeUiNode.Companion.d);
                        int i7 = 0;
                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_shopping_list, 0, composer2);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (painterA.getJ() >> 32)) / ((Context) composer2.x(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().scaledDensity;
                        MyShoppingListsData myShoppingListsData = data;
                        boolean z4 = myShoppingListsData.f;
                        List list = myShoppingListsData.e;
                        composer2.o(-1141911132);
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (list != null) {
                            int i8 = 0;
                            composer2 = composer2;
                            for (Object obj3 : list) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                MyShoppingListItemData myShoppingListItemData = (MyShoppingListItemData) obj3;
                                composer2.o(-1633490746);
                                Function1 function12 = function1;
                                boolean zN = composer2.n(function12) | composer2.n(myShoppingListItemData);
                                Object objG2 = composer2.G();
                                Object obj4 = objG2;
                                if (zN || objG2 == composer$Companion$Empty$12) {
                                    n nVar = new n(10, function12, myShoppingListItemData);
                                    composer2.A(nVar);
                                    obj4 = nVar;
                                }
                                composer2.l();
                                BiasAlignment.Vertical vertical2 = vertical;
                                Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$12;
                                int i10 = i8;
                                Modifier.Companion companion3 = companion2;
                                Modifier modifierE2 = SizeKt.e(PaddingKt.f(ClickableKt.d(companion2, false, null, null, (Function0) obj4, 7), 16), f2);
                                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.g, vertical2, composer2, 54);
                                int p2 = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                                Modifier modifierD5 = ComposedModifierKt.d(composer2, modifierE2);
                                ComposeUiNode.e3.getClass();
                                Function0 function04 = ComposeUiNode.Companion.b;
                                if (composer2.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer2.i();
                                if (composer2.getO()) {
                                    composer2.K(function04);
                                } else {
                                    composer2.e();
                                }
                                Updater.b(composer2, rowMeasurePolicyA2, ComposeUiNode.Companion.g);
                                Updater.b(composer2, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                Function2 function26 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                    androidx.camera.core.impl.b.z(p2, composer2, p2, function26);
                                }
                                Updater.b(composer2, modifierD5, ComposeUiNode.Companion.d);
                                List list2 = list;
                                long j = myShoppingListItemData.d;
                                boolean z5 = z4;
                                String str3 = myShoppingListItemData.b;
                                Resources resources = ((Context) composer2.x(AndroidCompositionLocals_androidKt.b)).getResources();
                                int i11 = myShoppingListItemData.c;
                                String quantityString = resources.getQuantityString(R.plurals.my_lists_item_count, i11, Integer.valueOf(i11));
                                Intrinsics.g(quantityString, "getQuantityString(...)");
                                MyListsKt.b(painterA, j, str3, quantityString, null, composer2, 0);
                                Painter painter = painterA;
                                composer2.f();
                                composer2.o(-1141875934);
                                if (i10 < list2.size() - (!z5 ? 1 : 0)) {
                                    composer2.o(1849434622);
                                    Object objG3 = composer2.G();
                                    if (objG3 == composer$Companion$Empty$13) {
                                        Dp dp = new Dp(32 + fIntBitsToFloat);
                                        composer2.A(dp);
                                        objG3 = dp;
                                    }
                                    float f3 = ((Dp) objG3).d;
                                    composer2.l();
                                    companion2 = companion3;
                                    z3 = 32;
                                    Composer composer3 = composer2;
                                    composer$Companion$Empty$1 = composer$Companion$Empty$13;
                                    DividerKt.a((float) 0.5d, 390, 2, 0L, composer3, PaddingKt.j(companion2, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                    composer2 = composer3;
                                } else {
                                    companion2 = companion3;
                                    composer$Companion$Empty$1 = composer$Companion$Empty$13;
                                    z3 = 32;
                                }
                                composer2.l();
                                composer$Companion$Empty$12 = composer$Companion$Empty$1;
                                i7 = 0;
                                vertical = vertical2;
                                i8 = i9;
                                z4 = z5 ? 1 : 0;
                                list = list2;
                                painterA = painter;
                                f2 = 1.0f;
                                composer2 = composer2;
                            }
                        }
                        int i12 = i7;
                        boolean z6 = z4;
                        BiasAlignment.Vertical vertical3 = vertical;
                        Composer$Companion$Empty$1 composer$Companion$Empty$14 = composer$Companion$Empty$12;
                        composer2.l();
                        composer2.o(-1141865346);
                        if (z6) {
                            Painter painterA2 = PainterResources_androidKt.a(R.drawable.ic_buy_again_my_lists_in_homepage, i12, composer2);
                            composer2.o(5004770);
                            Function0 function05 = function0;
                            boolean zN2 = composer2.n(function05);
                            Object objG4 = composer2.G();
                            Object obj5 = objG4;
                            if (zN2 || objG4 == composer$Companion$Empty$14) {
                                b bVar = new b(0, function05);
                                composer2.A(bVar);
                                obj5 = bVar;
                            }
                            composer2.l();
                            Modifier modifierE3 = SizeKt.e(PaddingKt.f(ClickableKt.d(companion2, false, null, null, (Function0) obj5, 7), 16), 1.0f);
                            RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(Arrangement.g, vertical3, composer2, 54);
                            int p3 = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                            Modifier modifierD6 = ComposedModifierKt.d(composer2, modifierE3);
                            ComposeUiNode.e3.getClass();
                            Function0 function06 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function06);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, rowMeasurePolicyA3, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD3, ComposeUiNode.Companion.f);
                            Function2 function27 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                                androidx.camera.core.impl.b.z(p3, composer2, p3, function27);
                            }
                            Updater.b(composer2, modifierD6, ComposeUiNode.Companion.d);
                            MyListsKt.b(painterA2, WxTheme.a(composer2).h(), StringResources_androidKt.c(composer2, R.string.buy_again_entry_point_title), StringResources_androidKt.c(composer2, R.string.buy_again_entry_point_subtitle), null, composer2, 0);
                            composer2.f();
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImpl2), composerImpl4, 1572870, 62);
            composerImpl = composerImpl4;
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(data, onMyShoppingListsActionClick, function1, function0, modifier, i, 9);
        }
    }

    public static final void b(final Painter painter, final long j, final String str, final String str2, Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImpl;
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1245306621);
        int i2 = i | (composerImplV.I(painter) ? 4 : 2) | (composerImplV.s(j) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.n(str2) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
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
            IconKt.a(painter, null, null, j, composerImplV, ((i2 << 6) & 7168) | (i2 & 14) | 48, 4);
            Modifier modifierH = PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImpl = composerImplV;
            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).j, composerImpl, (i2 >> 6) & 14, 3120, 55294);
            TextKt.b(str2, null, WxTheme.a(composerImpl).f(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImpl).r, composerImpl, (i2 >> 9) & 14, 3120, 55290);
            composerImpl.V(true);
            composerImpl.V(true);
            String upperCase = StringResources_androidKt.c(composerImpl, R.string.my_lists_item_use).toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, SizeKt.z(companion, null, 3), WxTheme.a(composerImpl).h(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).q, composerImpl, 48, 0, 65528);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(j, str, str2, modifier2, i) { // from class: au.com.woolworths.feature.shop.homepage.presentation.lists.a
                public final /* synthetic */ long e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ Modifier h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    MyListsKt.b(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
