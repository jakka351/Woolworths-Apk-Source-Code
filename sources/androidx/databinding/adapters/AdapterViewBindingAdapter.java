package androidx.databinding.adapters;

import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingMethods;
import com.dynatrace.android.callback.Callback;

@BindingMethods
@InverseBindingMethods
@RestrictTo
/* loaded from: classes2.dex */
public class AdapterViewBindingAdapter {

    public interface OnItemSelected {
    }

    public static class OnItemSelectedComponentListener implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Callback.l(view);
            try {
            } finally {
                Callback.m();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView adapterView) {
        }
    }

    public interface OnNothingSelected {
    }
}
