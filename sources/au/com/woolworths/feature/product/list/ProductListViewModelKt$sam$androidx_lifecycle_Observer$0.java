package au.com.woolworths.feature.product.list;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListViewModelKt$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ g d;

    public ProductListViewModelKt$sam$androidx_lifecycle_Observer$0(g gVar) {
        this.d = gVar;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.d.invoke(obj);
    }
}
