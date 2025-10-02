package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.TintTypedArray;
import com.dynatrace.android.callback.Callback;

@RestrictTo
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener {
    public static final int[] e = {R.attr.background, R.attr.divider};
    public MenuBuilder d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void a(MenuBuilder menuBuilder) {
        this.d = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public final boolean d(MenuItemImpl menuItemImpl) {
        return this.d.r(menuItemImpl, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Callback.j(view);
        try {
            d((MenuItemImpl) getAdapter().getItem(i));
        } finally {
            Callback.k();
        }
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, e, i, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(tintTypedArrayF.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(tintTypedArrayF.b(1));
        }
        tintTypedArrayF.g();
    }
}
