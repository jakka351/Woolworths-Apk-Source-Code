package au.com.woolworths.feature.product.list.compose;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;

    public /* synthetic */ f(float f, int i, int i2) {
        this.d = i2;
        this.e = i;
        this.f = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Density offset = (Density) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(offset, "$this$offset");
                return new IntOffset(((this.e - (((int) offset.T1(this.f)) / 2)) << 32) | (0 & 4294967295L));
            default:
                Intrinsics.h(offset, "$this$offset");
                return new IntOffset(((this.e - (((int) offset.T1(this.f)) / 2)) << 32) | (0 & 4294967295L));
        }
    }
}
