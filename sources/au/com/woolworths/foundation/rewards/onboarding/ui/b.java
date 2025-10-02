package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ b(MutableState mutableState, MutableState mutableState2, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        MutableState mutableState = this.f;
        MutableState mutableState2 = this.e;
        switch (i) {
            case 0:
                LayoutCoordinates it = (LayoutCoordinates) obj;
                float f = CoachMarkFrameKt.f8637a;
                Intrinsics.h(it, "it");
                mutableState2.setValue(new Offset(it.y(0L)));
                mutableState.setValue(new IntSize(it.a()));
                break;
            default:
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                Intrinsics.h(it2, "it");
                long jA = it2.a();
                float f2 = CoachMarkFrameKt.f8637a;
                mutableState2.setValue(new IntSize(jA));
                ((MutableFloatState) mutableState).p(Float.intBitsToFloat((int) (it2.y(0L) >> 32)) + (((int) (it2.a() >> 32)) / 2));
                break;
        }
        return unit;
    }
}
