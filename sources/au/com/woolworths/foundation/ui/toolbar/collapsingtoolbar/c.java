package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TopAppBarScrollBehavior e;

    public /* synthetic */ c(TopAppBarScrollBehavior topAppBarScrollBehavior, int i) {
        this.d = i;
        this.e = topAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                TopAppBarState state = this.e.getState();
                state.c(state.b() + fFloatValue);
                break;
            default:
                TopAppBarScrollBehavior topAppBarScrollBehavior = this.e;
                topAppBarScrollBehavior.getState().c(topAppBarScrollBehavior.getState().b() + fFloatValue);
                break;
        }
        return Unit.f24250a;
    }
}
