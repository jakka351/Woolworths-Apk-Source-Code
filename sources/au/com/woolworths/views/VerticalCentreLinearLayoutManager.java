package au.com.woolworths.views;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/views/VerticalCentreLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VerticalCentreLinearLayoutManager extends LinearLayoutManager {
    public RecyclerView E;
    public int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalCentreLinearLayoutManager(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void c0(RecyclerView recyclerView) {
        this.E = recyclerView;
        this.F = N();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void p0(RecyclerView.State state) {
        super.p0(state);
        RecyclerView recyclerView = this.E;
        if (recyclerView == null || this.v) {
            return;
        }
        int iC1 = c1();
        if (J() <= 0 || iC1 != J() - 1) {
            int i = this.F;
            recyclerView.setPadding(0, i, 0, i);
            return;
        }
        View viewF1 = f1(0, z(), true, false);
        int iO = viewF1 == null ? -1 : RecyclerView.LayoutManager.O(viewF1);
        int iN = N();
        View viewU = u(iC1);
        int bottom = viewU != null ? viewU.getBottom() : 0;
        View viewU2 = u(iO);
        int top = (this.o - (bottom - (viewU2 != null ? viewU2.getTop() : 0))) / 2;
        recyclerView.setPadding(0, top, 0, top);
        int i2 = this.F;
        if (iN != i2 || top == i2) {
            return;
        }
        recyclerView.post(new androidx.core.content.res.a(iO, 2, recyclerView));
    }
}
