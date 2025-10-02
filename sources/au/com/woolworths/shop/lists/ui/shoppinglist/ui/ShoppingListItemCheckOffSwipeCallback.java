package au.com.woolworths.shop.lists.ui.shoppinglist.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$itemTouchHelper$2$1;
import com.airbnb.epoxy.EpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/ShoppingListItemCheckOffSwipeCallback;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/ShoppingListItemSwipeCallback;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListItemCheckOffSwipeCallback extends ShoppingListItemSwipeCallback {
    public final int k;
    public final int l;
    public final Lazy m;
    public final Lazy n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemCheckOffSwipeCallback(Context context, EpoxyController listController, ShoppingListDetailsActivity$itemTouchHelper$2$1 shoppingListDetailsActivity$itemTouchHelper$2$1) {
        super(context, listController, shoppingListDetailsActivity$itemTouchHelper$2$1);
        Intrinsics.h(listController, "listController");
        this.k = 8;
        this.l = R.color.color_control_highlight;
        this.m = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 10));
        this.n = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 11));
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeCallback
    /* renamed from: A, reason: from getter */
    public final int getK() {
        return this.k;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeCallback
    public final boolean y(float f, View view, Canvas c) {
        Lazy lazy = this.i;
        Rect outRect = this.h;
        Intrinsics.h(view, "view");
        Intrinsics.h(c, "c");
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        int iSave = c.save();
        try {
            Intrinsics.h(outRect, "outRect");
            view.getDrawingRect(outRect);
            ViewParent parent = view.getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).offsetDescendantRectToMyCoords(view, outRect);
            c.drawRect(outRect, (Paint) this.j.getD());
            Drawable drawable = ((MaterialCheckBox) view.findViewById(R.id.checkbox)).isChecked() ? (Drawable) this.n.getD() : (Drawable) this.m.getD();
            if (drawable != null) {
                drawable.setBounds(outRect.left + ((Number) lazy.getD()).intValue(), outRect.centerY() - (drawable.getIntrinsicHeight() / 2), outRect.left + ((Number) lazy.getD()).intValue() + drawable.getIntrinsicWidth(), outRect.centerY() + (drawable.getIntrinsicHeight() / 2));
                drawable.draw(c);
            }
            c.restoreToCount(iSave);
            return true;
        } catch (Throwable th) {
            c.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.ui.ShoppingListItemSwipeCallback
    /* renamed from: z, reason: from getter */
    public final int getL() {
        return this.l;
    }
}
