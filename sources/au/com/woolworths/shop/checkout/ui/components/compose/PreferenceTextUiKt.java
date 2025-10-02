package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.button.g;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.j;
import au.com.woolworths.shop.checkout.domain.model.InputTextLimit;
import au.com.woolworths.shop.checkout.ui.components.compose.TextInputError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError;", "textInputError", "", "newInputTextValue", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PreferenceTextUiKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.shop.checkout.ui.components.compose.TextInputError r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.components.compose.PreferenceTextUiKt.a(au.com.woolworths.shop.checkout.ui.components.compose.TextInputError, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(boolean z, String str, String str2, final String str3, String str4, String str5, Function1 function1, Function1 function12, Composer composer, int i) {
        int i2;
        boolean z2;
        String str6 = str2;
        ComposerImpl composerImplV = composer.v(1581555608);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str6) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(str5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerImplV.I(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function12) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z3 = str4 != null;
            composerImplV.o(-1633490746);
            boolean z4 = ((i2 & 112) == 32) | ((29360128 & i2) == 8388608);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (z4 || objG == obj) {
                objG = new au.com.woolworths.feature.shop.instore.navigation.productfinder.d(str, function12);
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            float f = 8;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, f, BitmapDescriptorFactory.HUE_RED, 9);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            String str7 = str == null ? "" : str;
            KeyboardOptions keyboardOptionsA = KeyboardOptions.a(0, 7, 119);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(function0);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj) {
                objG2 = new e(function0, 2);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            int i4 = i2 >> 15;
            OutlinedTextFieldKt.b(str7, function1, modifierA, z, false, null, ComposableLambdaKt.c(1679891930, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.PreferenceTextUiKt$PreferenceTextRow$1$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str8 = str3;
                        if (str8 == null) {
                            str8 = "";
                        }
                        TextKt.b(str8, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, composer2, 0, 3120, 120830);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, null, z3, null, keyboardOptionsA, new KeyboardActions((Function1) objG2, null, null, 62), false, 0, 0, null, null, null, composerImplV, (i4 & 112) | 1572864 | ((i2 << 9) & 7168), 0, 1035184);
            if (!z || str == null || str.length() <= 0) {
                str6 = str2;
            } else {
                str6 = str2;
                if (z3 || !Intrinsics.c(str6, str)) {
                    z2 = true;
                }
                composerImplV = composerImplV;
                TertiaryButtonKt.a(str5, function0, null, z2, false, null, null, composerImplV, i4 & 14, 116);
                composerImplV.V(true);
            }
            z2 = false;
            composerImplV = composerImplV;
            TertiaryButtonKt.a(str5, function0, null, z2, false, null, null, composerImplV, i4 & 14, 116);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(z, str, str6, str3, str4, str5, function1, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    public static final void c(String str, String str2, boolean z, InputTextLimit inputTextLimit, String str3, String str4, String str5, String buttonText, Function1 onClickButton, Composer composer, int i) {
        String str6;
        int i2;
        long jD;
        long jD2;
        MutableState mutableState;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i3;
        ComposerImpl composerImpl;
        ?? r10;
        MutableState mutableState2;
        ComposerImpl composerImpl2;
        Intrinsics.h(buttonText, "buttonText");
        Intrinsics.h(onClickButton, "onClickButton");
        ComposerImpl composerImplV = composer.v(688258584);
        if ((i & 6) == 0) {
            str6 = str;
            i2 = (composerImplV.n(str6) ? 4 : 2) | i;
        } else {
            str6 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(inputTextLimit) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(str5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.n(buttonText) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerImplV.I(onClickButton) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            if (z) {
                composerImplV.o(-8451169);
                jD = WxTheme.a(composerImplV).c();
            } else {
                composerImplV.o(-8450105);
                jD = WxTheme.a(composerImplV).d();
            }
            composerImplV.V(false);
            if (z) {
                composerImplV.o(-8447288);
                jD2 = WxTheme.a(composerImplV).f();
            } else {
                composerImplV.o(-8445945);
                jD2 = WxTheme.a(composerImplV).d();
            }
            composerImplV.V(false);
            long j = jD2;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = SnapshotStateKt.f(str5 != null ? new TextInputError.Default(str5) : null);
                composerImplV.A(objG);
            }
            MutableState mutableState3 = (MutableState) objG;
            composerImplV.V(false);
            Object[] objArr = new Object[0];
            composerImplV.o(5004770);
            boolean z2 = (i2 & 458752) == 131072;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$12) {
                objG2 = new a(str4, 5);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            int i4 = i2;
            MutableState mutableState4 = (MutableState) RememberSaveableKt.c(objArr, null, (Function0) objG2, composerImplV, 0, 6);
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(str6, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11), jD, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, (i4 & 14) | 48, 0, 65528);
            ComposerImpl composerImpl3 = composerImplV;
            composerImpl3.o(1941075227);
            if (str2 == null) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                r10 = 0;
                mutableState = mutableState4;
                i3 = i4;
                composerImpl = composerImpl3;
            } else {
                mutableState = mutableState4;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i3 = i4;
                TextKt.b(str2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, f, BitmapDescriptorFactory.HUE_RED, 9), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl3).n, composerImpl3, 48, 0, 65528);
                composerImpl = composerImpl3;
                r10 = 0;
            }
            composerImpl.V(r10);
            String str7 = (String) mutableState.getD();
            composerImpl.o(-1224400529);
            int i6 = i3;
            MutableState mutableState5 = mutableState;
            boolean zN = ((i6 & 7168) == 2048 ? true : r10) | ((3670016 & i6) == 1048576 ? true : r10) | composerImpl.n(mutableState5);
            Object objG3 = composerImpl.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                androidx.navigation.internal.c cVar = new androidx.navigation.internal.c(inputTextLimit, str5, mutableState3, mutableState5, 13);
                mutableState2 = mutableState3;
                composerImpl.A(cVar);
                objG3 = cVar;
            } else {
                mutableState2 = mutableState3;
            }
            composerImpl.V(r10);
            int i7 = i6 >> 6;
            int i8 = i6 >> 3;
            b(z, str7, str4, str3, str5, buttonText, (Function1) objG3, onClickButton, composerImpl, (i7 & 458752) | (i7 & 14) | ((i6 >> 9) & 896) | (i8 & 7168) | (57344 & i7) | (29360128 & i8));
            a((TextInputError) mutableState2.getD(), composerImpl, r10);
            composerImpl.V(true);
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(str, str2, z, inputTextLimit, str3, str4, str5, buttonText, onClickButton, i);
        }
    }
}
