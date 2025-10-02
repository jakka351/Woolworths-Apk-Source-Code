package au.com.woolworths.feature.product.list.legacy.generated.callback;

import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public final class Function0 implements kotlin.jvm.functions.Function0 {
    public final ViewDataBinding d;

    public interface Listener {
        void d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Function0(Listener listener) {
        this.d = (ViewDataBinding) listener;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.databinding.ViewDataBinding, au.com.woolworths.feature.product.list.legacy.generated.callback.Function0$Listener] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.d.d();
        return null;
    }
}
