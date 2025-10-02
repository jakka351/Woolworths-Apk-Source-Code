package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableFloatState e;

    public /* synthetic */ m(MutableFloatState mutableFloatState, int i) {
        this.d = i;
        this.e = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                this.e.p(((Float) obj).floatValue());
                break;
            default:
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.h(it, "it");
                this.e.p((int) (it.a() & 4294967295L));
                break;
        }
        return Unit.f24250a;
    }
}
