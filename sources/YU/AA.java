package YU;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* loaded from: classes2.dex */
class AA implements ViewGroup.OnHierarchyChangeListener {
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        try {
            if (view2 instanceof EditText) {
                view2.getContext();
                throw null;
            }
            if (view2 instanceof ViewGroup) {
                view2.getContext();
                throw null;
            }
        } catch (Exception e) {
            UB.a(e);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
