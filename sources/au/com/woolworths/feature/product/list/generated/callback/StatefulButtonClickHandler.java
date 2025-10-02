package au.com.woolworths.feature.product.list.generated.callback;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;

/* loaded from: classes3.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final ViewDataBinding d;
    public final int e;

    public interface Listener {
        void b(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatefulButtonClickHandler(Listener listener, int i) {
        this.d = (ViewDataBinding) listener;
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.databinding.ViewDataBinding, au.com.woolworths.feature.product.list.generated.callback.StatefulButtonClickHandler$Listener] */
    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        this.d.b(this.e);
    }
}
