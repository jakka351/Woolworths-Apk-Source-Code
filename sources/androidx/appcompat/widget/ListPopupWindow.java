package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ListPopupWindow implements ShowableListMenu {
    public static final Method D;
    public static final Method E;
    public Rect A;
    public boolean B;
    public final PopupWindow C;
    public final Context d;
    public ListAdapter e;
    public DropDownListView f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public final int p;
    public DataSetObserver q;
    public View r;
    public AdapterView.OnItemClickListener s;
    public AdapterView.OnItemSelectedListener t;
    public final ResizePopupRunnable u;
    public final PopupTouchInterceptor v;
    public final PopupScrollListener w;
    public final ListSelectorHider x;
    public final Handler y;
    public final Rect z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final /* bridge */ /* synthetic */ ShowableListMenu c() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.C.isShowing()) {
                listPopupWindow.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            ResizePopupRunnable resizePopupRunnable = listPopupWindow.u;
            PopupWindow popupWindow = listPopupWindow.C;
            if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
                return;
            }
            listPopupWindow.y.removeCallbacks(resizePopupRunnable);
            resizePopupRunnable.run();
        }
    }

    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (popupWindow = listPopupWindow.C) != null && popupWindow.isShowing() && x >= 0 && x < listPopupWindow.C.getWidth() && y >= 0 && y < listPopupWindow.C.getHeight()) {
                listPopupWindow.y.postDelayed(listPopupWindow.u, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            listPopupWindow.y.removeCallbacks(listPopupWindow.u);
            return false;
        }
    }

    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            DropDownListView dropDownListView = listPopupWindow.f;
            if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || listPopupWindow.f.getCount() <= listPopupWindow.f.getChildCount() || listPopupWindow.f.getChildCount() > listPopupWindow.p) {
                return;
            }
            listPopupWindow.C.setInputMethodMode(2);
            listPopupWindow.a();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void a() {
        int i;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.f;
        Context context = this.d;
        PopupWindow popupWindow = this.C;
        if (dropDownListView2 == null) {
            DropDownListView dropDownListViewQ = q(context, !this.B);
            this.f = dropDownListViewQ;
            dropDownListViewQ.setAdapter(this.e);
            this.f.setOnItemClickListener(this.s);
            this.f.setFocusable(true);
            this.f.setFocusableInTouchMode(true);
            this.f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
                    Callback.l(view);
                    if (i2 != -1) {
                        try {
                            DropDownListView dropDownListView3 = ListPopupWindow.this.f;
                            if (dropDownListView3 != null) {
                                dropDownListView3.setListSelectionHidden(false);
                            }
                        } catch (Throwable th) {
                            Callback.m();
                            throw th;
                        }
                    }
                    Callback.m();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.f.setOnScrollListener(this.w);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.t;
            if (onItemSelectedListener != null) {
                this.f.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.z;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.l) {
                this.j = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = Api24Impl.a(popupWindow, this.r, this.j, popupWindow.getInputMethodMode() == 2);
        int i3 = this.g;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.h;
            int iA2 = this.f.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f.getPaddingBottom() + this.f.getPaddingTop() + i : 0);
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.k);
        if (popupWindow.isShowing()) {
            if (this.r.isAttachedToWindow()) {
                int width = this.h;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.r.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        popupWindow.setWidth(this.h == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.h == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                int i5 = width;
                View view = this.r;
                int i6 = this.i;
                int i7 = this.j;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                popupWindow.update(view, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.h;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.r.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = D;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.v);
        if (this.n) {
            popupWindow.setOverlapAnchor(this.m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = E;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.A);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            Api29Impl.a(popupWindow, this.A);
        }
        popupWindow.showAsDropDown(this.r, this.i, this.j, this.o);
        this.f.setSelection(-1);
        if ((!this.B || this.f.isInTouchMode()) && (dropDownListView = this.f) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.B) {
            return;
        }
        this.y.post(this.x);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean b() {
        return this.C.isShowing();
    }

    public final Drawable c() {
        return this.C.getBackground();
    }

    public final void d(int i) {
        this.j = i;
        this.l = true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        PopupWindow popupWindow = this.C;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f = null;
        this.y.removeCallbacks(this.u);
    }

    public final int g() {
        if (this.l) {
            return this.j;
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView i() {
        return this.f;
    }

    public final int j() {
        return this.i;
    }

    public final void l(int i) {
        this.i = i;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.q;
        if (dataSetObserver == null) {
            this.q = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.q);
        }
        DropDownListView dropDownListView = this.f;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.e);
        }
    }

    public final void p(Drawable drawable) {
        this.C.setBackgroundDrawable(drawable);
    }

    public DropDownListView q(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    public final void r(int i) {
        Drawable background = this.C.getBackground();
        if (background == null) {
            this.h = i;
            return;
        }
        Rect rect = this.z;
        background.getPadding(rect);
        this.h = rect.left + rect.right + i;
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = -2;
        this.h = -2;
        this.k = 1002;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.u = new ResizePopupRunnable();
        this.v = new PopupTouchInterceptor();
        this.w = new PopupScrollListener();
        this.x = new ListSelectorHider();
        this.z = new Rect();
        this.d = context;
        this.y = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.q, i, i2);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.l = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        appCompatPopupWindow.a(context, attributeSet, i, i2);
        this.C = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
