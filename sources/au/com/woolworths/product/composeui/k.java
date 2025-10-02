package au.com.woolworths.product.composeui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.accompanist.systemuicontroller.AndroidSystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k(long j, String str, Function0 function0) {
        this.e = j;
        this.f = str;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        switch (this.d) {
            case 0:
                String str = (String) this.f;
                Function0 function0 = (Function0) this.g;
                Modifier optional = (Modifier) obj;
                Intrinsics.h(optional, "$this$optional");
                return PaddingKt.g(ClickableKt.d(SemanticsModifierKt.a(BackgroundKt.b(ClipKt.a(Modifier.Companion.d, RoundedCornerShapeKt.b(16)), this.e, RectangleShapeKt.f1779a), new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(str, 28)), false, null, null, new au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f(3, function0), 7), 4, 5);
            default:
                View view = (View) this.f;
                final SystemUiController systemUiController = (SystemUiController) this.g;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                Context context = view.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                final long jB = (activity == null || (window = activity.getWindow()) == null) ? Color.j : ColorKt.b(window.getStatusBarColor());
                long j = this.e;
                systemUiController.b(j, ColorKt.i(j) > 0.5f, SystemUiControllerKt.b);
                return new DisposableEffectResult() { // from class: au.com.woolworths.shared.ui.compose.FullScreenOverlayKt$FullScreenOverlay_KTwxG1Y$lambda$3$lambda$2$$inlined$onDispose$1
                    /* JADX WARN: Failed to inline method: com.google.accompanist.systemuicontroller.SystemUiController.a(com.google.accompanist.systemuicontroller.SystemUiController, long):void */
                    /* JADX WARN: Not passed register '(r4v1 'j' long)' in method call: com.google.accompanist.systemuicontroller.SystemUiController.a(com.google.accompanist.systemuicontroller.SystemUiController, long):void */
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        SystemUiController.a(systemUiController, jB);
                    }
                };
        }
    }

    public /* synthetic */ k(View view, AndroidSystemUiController androidSystemUiController, long j) {
        this.f = view;
        this.g = androidSystemUiController;
        this.e = j;
    }
}
