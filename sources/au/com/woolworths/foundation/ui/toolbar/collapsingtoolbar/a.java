package au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Ref.FloatRef e;
    public final /* synthetic */ TopAppBarState f;
    public final /* synthetic */ Ref.FloatRef g;

    public /* synthetic */ a(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2, int i) {
        this.d = i;
        this.e = floatRef;
        this.f = topAppBarState;
        this.g = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationScope animateDecay = (AnimationScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(animateDecay, "$this$animateDecay");
                SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) animateDecay.e;
                float fFloatValue = ((Number) snapshotMutableStateImpl.getD()).floatValue();
                Ref.FloatRef floatRef = this.e;
                float f = fFloatValue - floatRef.d;
                TopAppBarState topAppBarState = this.f;
                float fB = topAppBarState.b();
                topAppBarState.c(fB + f);
                float fAbs = Math.abs(fB - topAppBarState.b());
                floatRef.d = ((Number) snapshotMutableStateImpl.getD()).floatValue();
                this.g.d = ((Number) animateDecay.f()).floatValue();
                if (Math.abs(f - fAbs) > 0.5f) {
                    animateDecay.a();
                }
                break;
            default:
                Intrinsics.h(animateDecay, "$this$animateDecay");
                SnapshotMutableStateImpl snapshotMutableStateImpl2 = (SnapshotMutableStateImpl) animateDecay.e;
                float fFloatValue2 = ((Number) snapshotMutableStateImpl2.getD()).floatValue();
                Ref.FloatRef floatRef2 = this.e;
                float f2 = fFloatValue2 - floatRef2.d;
                TopAppBarState topAppBarState2 = this.f;
                float fB2 = topAppBarState2.b();
                topAppBarState2.c(fB2 + f2);
                float fAbs2 = Math.abs(fB2 - topAppBarState2.b());
                floatRef2.d = ((Number) snapshotMutableStateImpl2.getD()).floatValue();
                this.g.d = ((Number) animateDecay.f()).floatValue();
                if (Math.abs(f2 - fAbs2) > 0.5f) {
                    animateDecay.a();
                }
                break;
        }
        return Unit.f24250a;
    }
}
