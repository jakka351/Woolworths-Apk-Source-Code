package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TopAppBarState e;

    public /* synthetic */ b(TopAppBarState topAppBarState, int i) {
        this.d = i;
        this.e = topAppBarState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationScope animateTo = (AnimationScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(animateTo, "$this$animateTo");
                this.e.c(((Number) ((SnapshotMutableStateImpl) animateTo.e).getD()).floatValue());
                break;
            default:
                Intrinsics.h(animateTo, "$this$animateTo");
                this.e.c(((Number) ((SnapshotMutableStateImpl) animateTo.e).getD()).floatValue());
                break;
        }
        return Unit.f24250a;
    }
}
