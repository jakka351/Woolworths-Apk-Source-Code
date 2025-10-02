package au.com.woolworths.feature.shop.editorder.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.editorder.databinding.ActivityEditOrderErrorBindingImpl;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorViewModel;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ActivityEditOrderErrorBindingImpl d;

    public interface Listener {
    }

    public OnClickListener(ActivityEditOrderErrorBindingImpl activityEditOrderErrorBindingImpl) {
        this.d = activityEditOrderErrorBindingImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            EditOrderErrorViewModel editOrderErrorViewModel = this.d.C;
            if (editOrderErrorViewModel != null) {
                editOrderErrorViewModel.p6();
            }
        } finally {
            Callback.h();
        }
    }
}
