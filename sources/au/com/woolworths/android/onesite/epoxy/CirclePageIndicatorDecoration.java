package au.com.woolworths.android.onesite.epoxy;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.utils.Extensions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/epoxy/CirclePageIndicatorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CirclePageIndicatorDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final int f4248a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final AccelerateDecelerateInterpolator f = new AccelerateDecelerateInterpolator();
    public final Lazy g = LazyKt.b(new h(9));

    public CirclePageIndicatorDecoration(Context context, int i, int i2) {
        this.f4248a = Extensions.a(R.attr.textColorPrimary, context);
        this.b = context.getColor(com.woolworths.R.color.color_black_200);
        this.c = context.getResources().getDimensionPixelSize(i);
        this.d = context.getResources().getDimensionPixelSize(i2);
        this.e = context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.half_default_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void f(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.h(outRect, "outRect");
        Intrinsics.h(view, "view");
        Intrinsics.h(state, "state");
        super.f(outRect, view, recyclerView, state);
        outRect.bottom = this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void h(Canvas c, RecyclerView recyclerView, RecyclerView.State state) {
        int iB1;
        View viewU;
        Intrinsics.h(c, "c");
        Intrinsics.h(state, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int i = adapter != null ? adapter.i() : 0;
        int i2 = this.d;
        int i3 = i2 * i;
        int i4 = i - 1;
        if (i4 <= 0) {
            i4 = 0;
        }
        int i5 = this.e;
        float width = ((recyclerView.getWidth() - ((i4 * i5) + i3)) + i2) / 2.0f;
        float f = i2;
        float f2 = f / 2.0f;
        float height = recyclerView.getHeight() - f2;
        Lazy lazy = this.g;
        ((Paint) lazy.getD()).setColor(this.b);
        int i6 = i2 + i5;
        float f3 = width;
        for (int i7 = 0; i7 < i; i7++) {
            c.drawCircle(f3, height, f2, (Paint) lazy.getD());
            f3 += i6;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iB1 = linearLayoutManager.b1()) == -1 || (viewU = linearLayoutManager.u(iB1)) == null) {
            return;
        }
        float interpolation = this.f.getInterpolation((viewU.getLeft() * (-1)) / viewU.getWidth());
        ((Paint) lazy.getD()).setColor(this.f4248a);
        if (interpolation == BitmapDescriptorFactory.HUE_RED) {
            c.drawCircle(width + (i6 * iB1), height, f2, (Paint) lazy.getD());
        } else {
            c.drawCircle((i5 * interpolation) + (f * interpolation) + width + (i6 * iB1), height, f2, (Paint) lazy.getD());
        }
    }
}
