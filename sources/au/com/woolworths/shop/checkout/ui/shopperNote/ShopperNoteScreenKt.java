package au.com.woolworths.shop.checkout.ui.shopperNote;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.work.impl.utils.c;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.PrimaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.cart.ui.cart.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.q2;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "textState", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopperNoteScreenKt {
    public static final void a(Flow flow, String title, final String buttonText, String str, final Integer num, final Function0 onBackButtonPressed, final Function1 onSaveClick, Composer composer, int i) {
        Object shopperNoteScreenKt$ShopperNoteScreen$1$1;
        final SnackbarHostState snackbarHostState;
        ComposerImpl composerImpl;
        Flow actionFlow = flow;
        Intrinsics.h(actionFlow, "actionFlow");
        Intrinsics.h(title, "title");
        Intrinsics.h(buttonText, "buttonText");
        Intrinsics.h(onBackButtonPressed, "onBackButtonPressed");
        Intrinsics.h(onSaveClick, "onSaveClick");
        ComposerImpl composerImplV = composer.v(565707949);
        int i2 = (composerImplV.I(actionFlow) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(buttonText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onBackButtonPressed) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onSaveClick) ? 1048576 : 524288;
        }
        if ((599171 & i2) == 599170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(str == null ? "" : str);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            Object objD = a.d(1849434622, composerImplV, false);
            if (objD == obj) {
                objD = new SnackbarHostState();
                composerImplV.A(objD);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objD;
            composerImplV.V(false);
            String strC = StringResources_androidKt.c(composerImplV, R.string.shoppernote_saving_error_message);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG2);
            }
            final MutableState mutableState2 = (MutableState) objG2;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 458752) == 131072) | composerImplV.I(actionFlow) | composerImplV.n(strC);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == obj) {
                snackbarHostState = snackbarHostState2;
                actionFlow = flow;
                shopperNoteScreenKt$ShopperNoteScreen$1$1 = new ShopperNoteScreenKt$ShopperNoteScreen$1$1(actionFlow, mutableState2, onBackButtonPressed, snackbarHostState, strC, null);
                composerImplV.A(shopperNoteScreenKt$ShopperNoteScreen$1$1);
            } else {
                shopperNoteScreenKt$ShopperNoteScreen$1$1 = objG3;
                snackbarHostState = snackbarHostState2;
                actionFlow = flow;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, actionFlow, (Function2) shopperNoteScreenKt$ShopperNoteScreen$1$1);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-786346639, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC2 = StringResources_androidKt.c(composer2, R.string.shoppernote_screen_title);
                        final Function0 function0 = onBackButtonPressed;
                        TopNavBarKt.a(strC2, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-1771801373, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), "Back", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(1406167154, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierF = PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16);
                        MutableState mutableState3 = mutableState2;
                        boolean zBooleanValue = ((Boolean) mutableState3.getD()).booleanValue();
                        composer2.o(-1746271574);
                        Function1 function1 = onSaveClick;
                        boolean zN = composer2.n(function1);
                        Object objG4 = composer2.G();
                        if (zN || objG4 == Composer.Companion.f1624a) {
                            objG4 = new c(25, mutableState3, function1, mutableState);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        PrimaryLoadingButtonKt.a(buttonText, (Function0) objG4, zBooleanValue, modifierF, null, null, null, composer2, 3072, 496);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-696286349, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, composer2, 6, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 0L, null, ComposableLambdaKt.c(123798842, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteScreenKt$ShopperNoteScreen$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    PaddingValues paddingValues = (PaddingValues) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier modifierH = PaddingKt.h(PaddingKt.e(BackgroundKt.b(SizeKt.c, CoreTheme.b(composer2).e.f4848a.d, RectangleShapeKt.f1779a), paddingValues), f, BitmapDescriptorFactory.HUE_RED, 2);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        MutableState mutableState3 = mutableState;
                        String str2 = (String) mutableState3.getD();
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f1339a;
                        TextFieldColors textFieldColorsG = TextFieldDefaults.g(0L, CoreTheme.b(composer2).e.f4848a.d, 0L, CoreTheme.b(composer2).d.b.b, CoreTheme.b(composer2).d.b.b, 0L, CoreTheme.b(composer2).d.d.c, CoreTheme.b(composer2).d.d.f4845a, composer2, 1998747);
                        composer2.o(-1633490746);
                        Integer num2 = num;
                        boolean zN = composer2.n(num2);
                        Object objG4 = composer2.G();
                        if (zN || objG4 == Composer.Companion.f1624a) {
                            objG4 = new l(11, num2, mutableState3);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        TextFieldKt.b(str2, (Function1) objG4, modifierJ, false, false, null, ComposableSingletons$ShopperNoteScreenKt.f10809a, null, null, null, false, null, null, null, false, 5, 0, null, null, textFieldColorsG, composer2, 1573248, 221184, 475064);
                        TextKt.b(((String) mutableState3.getD()).length() + q2.c + num2, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer2).d.d.e.b, 0L, null, 0L, null, new TextAlign(6), 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.c.f5124a, composer2, 48, 0, 65016);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12586422, 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.a(actionFlow, title, buttonText, str, num, onBackButtonPressed, onSaveClick, i);
        }
    }
}
