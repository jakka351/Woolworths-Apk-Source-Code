package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@SuppressLint
/* loaded from: classes2.dex */
class GhostViewHolder extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public ViewGroup d;
    public boolean e;

    @RequiresApi
    public static class Api21Impl {
    }

    public static void a(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.e) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        ViewGroup viewGroup = this.d;
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            viewGroup.setTag(com.woolworths.R.id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.e = false;
        }
    }
}
