package au.com.woolworths.android.onesite.modules.bindings;

import android.view.View;
import android.widget.AdapterView;
import com.dynatrace.android.callback.Callback;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/bindings/SpinnerViewBindingKt$setItemSelectedListener$1", "Landroid/widget/AdapterView$OnItemSelectedListener;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnerViewBindingKt$setItemSelectedListener$1 implements AdapterView.OnItemSelectedListener {
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
