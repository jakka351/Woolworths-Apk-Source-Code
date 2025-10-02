package au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.d;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.checkout.ui.details.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TwoButtonDialogKt {
    public static final void a(Text text, ResText resText, ResText resText2, Function0 function0, Text text2, Function0 function02, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(548009220);
        int i2 = (composerImplV.I(text) ? 4 : 2) | i | (composerImplV.I(resText) ? 32 : 16) | (composerImplV.I(resText2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        int i3 = i2 | (composerImplV.I(text2) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(function02) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
            String string = text.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            String string2 = resText.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            String string3 = resText2.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            composerImplV.o(-1644097985);
            String string4 = (text2 == null || function02 == null) ? null : text2.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(text2) | ((i3 & 458752) == 131072);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new c(15, text2, function02);
                composerImplV.A(objG);
            }
            Function0 function03 = (Function0) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean z = (i3 & 7168) == 2048;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(4, function0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            AlertDialogKt.a(string2, string3, null, string, string4, function03, (Function0) objG2, composerImplV, 0, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(text, resText, resText2, function0, text2, function02, i, 17);
        }
    }

    public static final void b(AppCompatActivity appCompatActivity, final Text text, final ResText resText, final ResText resText2, final ResText resText3, final Function0 function0) {
        Intrinsics.h(appCompatActivity, "<this>");
        final ComposeView composeView = new ComposeView(appCompatActivity, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.TwoButtonDialogKt$showTwoButtonDialog$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ResText resText4 = resText3;
                    final Function0 function02 = function0;
                    final Text text2 = text;
                    final ResText resText5 = resText;
                    final ResText resText6 = resText2;
                    final ComposeView composeView2 = composeView;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1947435144, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.TwoButtonDialogKt$showTwoButtonDialog$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                ComposeView composeView3 = composeView2;
                                boolean zI = composer2.I(composeView3);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new au.com.woolworths.feature.rewards.account.preferences.d(composeView3, 2);
                                    composer2.A(objG);
                                }
                                Function0 function03 = (Function0) objG;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI2 = composer2.I(composeView3);
                                Object obj6 = function02;
                                boolean zN = zI2 | composer2.n(obj6);
                                Object objG2 = composer2.G();
                                if (zN || objG2 == obj5) {
                                    objG2 = new c(16, composeView3, obj6);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                TwoButtonDialogKt.a(text2, resText5, resText6, function03, resText4, (Function0) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -767047124));
        appCompatActivity.addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
    }
}
