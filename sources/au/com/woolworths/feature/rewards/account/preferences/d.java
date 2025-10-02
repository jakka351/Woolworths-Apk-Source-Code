package au.com.woolworths.feature.rewards.account.preferences;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComposeView e;

    public /* synthetic */ d(ComposeView composeView, int i) {
        this.d = i;
        this.e = composeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Context context = this.e.getContext();
                Intrinsics.g(context, "getContext(...)");
                ContextExtKt.f(context);
                break;
            case 1:
                ComposeView composeView = this.e;
                ViewParent parent = composeView.getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(composeView);
                break;
            default:
                ComposeView composeView2 = this.e;
                ViewParent parent2 = composeView2.getParent();
                Intrinsics.f(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(composeView2);
                break;
        }
        return Unit.f24250a;
    }
}
