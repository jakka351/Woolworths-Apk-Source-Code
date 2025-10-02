package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t(Object obj, float f, Object obj2, int i) {
        this.d = i;
        this.g = obj;
        this.e = f;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Function1 function1 = (Function1) this.g;
                MutableFloatState mutableFloatState = (MutableFloatState) this.f;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.h(it, "it");
                mutableFloatState.p(Float.intBitsToFloat((int) (it.G(0L) & 4294967295L)));
                function1.invoke(Float.valueOf(mutableFloatState.a() - this.e));
                break;
            case 1:
                Function3 function3 = (Function3) this.g;
                MutableFloatState mutableFloatState2 = (MutableFloatState) this.f;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Intrinsics.h(layoutCoordinates, "layoutCoordinates");
                long jY = layoutCoordinates.y(0L);
                long jD = IntSizeKt.d(layoutCoordinates.a());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jY & 4294967295L));
                if (fIntBitsToFloat != mutableFloatState2.a()) {
                    function3.invoke(Float.valueOf(fIntBitsToFloat), Float.valueOf(Float.intBitsToFloat((int) (jD & 4294967295L))), Float.valueOf(this.e));
                }
                mutableFloatState2.p(fIntBitsToFloat);
                break;
            default:
                LazyListState lazyListState = (LazyListState) this.g;
                ArrayList arrayList = (ArrayList) this.f;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                int iH = lazyListState.h() + ((int) (lazyListState.i() / this.e));
                if (iH >= 0 && iH < arrayList.size()) {
                    SemanticsPropertiesKt.k(semantics, "Selected " + arrayList.get(iH));
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }
}
