package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes2.dex */
class NavItemSelectedListener implements AdapterView.OnItemSelectedListener {
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
