package au.com.woolworths.shared.ui.views.generated.callback;

import android.view.View;
import au.com.woolworths.shared.ui.views.databinding.EpoxyItemHorizontalSelectorBindingImpl;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorItemClickListener;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public final class OnClickListener implements View.OnClickListener {
    public final EpoxyItemHorizontalSelectorBindingImpl d;

    public interface Listener {
    }

    public OnClickListener(EpoxyItemHorizontalSelectorBindingImpl epoxyItemHorizontalSelectorBindingImpl) {
        this.d = epoxyItemHorizontalSelectorBindingImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            EpoxyItemHorizontalSelectorBindingImpl epoxyItemHorizontalSelectorBindingImpl = this.d;
            HorizontalSelectorItemClickListener horizontalSelectorItemClickListener = epoxyItemHorizontalSelectorBindingImpl.C;
            Integer num = epoxyItemHorizontalSelectorBindingImpl.A;
            if (horizontalSelectorItemClickListener != null) {
                horizontalSelectorItemClickListener.P3(num.intValue());
            }
        } finally {
            Callback.h();
        }
    }
}
