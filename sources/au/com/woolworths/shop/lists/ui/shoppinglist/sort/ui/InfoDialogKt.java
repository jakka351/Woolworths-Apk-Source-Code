package au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.account.preferences.d;
import au.com.woolworths.feature.shop.trafficdrivers.ui.a;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.c;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InfoDialogKt {
    public static final void a(ResText resText, ResText resText2, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-482465578);
        int i2 = (composerImplV.I(resText) ? 4 : 2) | i | (composerImplV.I(resText2) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
            String string = resText.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            String string2 = resText2.getText((Context) composerImplV.x(staticProvidableCompositionLocal)).toString();
            String strC = StringResources_androidKt.c(composerImplV, R.string.shop_lists_button_ok);
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new c(2, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            AlertDialogKt.a(string2, strC, null, string, null, null, (Function0) objG, composerImplV, 0, 52);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(resText, resText2, function0, i, 22);
        }
    }

    public static final void b(AppCompatActivity appCompatActivity, final ResText resText, final ResText resText2) {
        Intrinsics.h(appCompatActivity, "<this>");
        final ComposeView composeView = new ComposeView(appCompatActivity, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.InfoDialogKt$showInfoDialog$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ResText resText3 = resText2;
                    final ComposeView composeView2 = composeView;
                    final ResText resText4 = resText;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(925262490, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.sort.ui.InfoDialogKt$showInfoDialog$1.1
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
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new d(composeView3, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                InfoDialogKt.a(resText4, resText3, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1959107778));
        appCompatActivity.addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
    }
}
