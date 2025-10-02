package au.com.woolworths.feature.product.list.compose.productfinder;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FrameLayout e;

    public /* synthetic */ h(FrameLayout frameLayout, int i) {
        this.d = i;
        this.e = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(it, "it");
                break;
            default:
                Intrinsics.h(it, "it");
                break;
        }
        return this.e;
    }
}
