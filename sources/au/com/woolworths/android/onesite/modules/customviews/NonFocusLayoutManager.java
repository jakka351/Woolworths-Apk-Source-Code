package au.com.woolworths.android.onesite.modules.customviews;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class NonFocusLayoutManager extends LinearLayoutManager {
    public NonFocusLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean q0(RecyclerView recyclerView, RecyclerView.State state, View view, View view2) {
        if (recyclerView.getScrollState() == 0) {
            return super.q0(recyclerView, state, view, view2);
        }
        return true;
    }
}
