package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    public final ActivityChooserViewAdapter d;
    public final Callbacks e;
    public final View f;
    public final Drawable g;
    public final FrameLayout h;
    public final ImageView i;
    public final FrameLayout j;
    public final int k;
    public ActionProvider l;
    public final DataSetObserver m;
    public final ViewTreeObserver.OnGlobalLayoutListener n;
    public ListPopupWindow o;
    public PopupWindow.OnDismissListener p;
    public boolean q;
    public int r;
    public boolean s;

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$3, reason: invalid class name */
    public class AnonymousClass3 extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    public class ActivityChooserViewAdapter extends BaseAdapter {
        public ActivityChooserModel d;
        public int e = 4;
        public boolean f;
        public boolean g;
        public boolean h;

        public ActivityChooserViewAdapter() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int iD = this.d.d();
            if (!this.f) {
                this.d.e();
            }
            int iMin = Math.min(iD, this.e);
            return this.h ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f) {
                this.d.e();
            }
            this.d.c(i);
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return (this.h && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    view = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                activityChooserView.getContext().getPackageManager();
                getItem(i);
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            if (view != null && view.getId() == 1) {
                return view;
            }
            View viewInflate = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            viewInflate.setId(1);
            ((TextView) viewInflate.findViewById(R.id.title)).setText(activityChooserView.getContext().getString(R.string.abc_activity_chooser_view_see_all));
            return viewInflate;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public Callbacks() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (view == activityChooserView.j) {
                    activityChooserView.a();
                    ActivityChooserView.this.d.d.e();
                    ActivityChooserModel activityChooserModel = ActivityChooserView.this.d.d;
                    synchronized (activityChooserModel.f143a) {
                        activityChooserModel.a();
                        ArrayList arrayList = activityChooserModel.b;
                        if (arrayList.size() > 0) {
                            throw null;
                        }
                    }
                    synchronized (ActivityChooserView.this.d.d.f143a) {
                    }
                } else {
                    if (view != activityChooserView.h) {
                        throw new IllegalArgumentException();
                    }
                    activityChooserView.q = false;
                    activityChooserView.c(activityChooserView.r);
                }
            } finally {
                Callback.h();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            PopupWindow.OnDismissListener onDismissListener = activityChooserView.p;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            ActionProvider actionProvider = activityChooserView.l;
            if (actionProvider == null || (subUiVisibilityListener = actionProvider.f2468a) == null) {
                return;
            }
            ((ActionMenuPresenter) subUiVisibilityListener).q(false);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            Callback.j(view);
            try {
                int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
                if (itemViewType == 0) {
                    activityChooserView.a();
                    if (!activityChooserView.q) {
                        ActivityChooserViewAdapter activityChooserViewAdapter = activityChooserView.d;
                        boolean z = activityChooserViewAdapter.f;
                        synchronized (activityChooserViewAdapter.d.f143a) {
                        }
                    } else if (i > 0) {
                        ActivityChooserModel activityChooserModel = activityChooserView.d.d;
                        synchronized (activityChooserModel.f143a) {
                            try {
                                activityChooserModel.a();
                                ActivityChooserModel.ActivityResolveInfo activityResolveInfo = (ActivityChooserModel.ActivityResolveInfo) activityChooserModel.b.get(i);
                                if (((ActivityChooserModel.ActivityResolveInfo) activityChooserModel.b.get(0)) != null) {
                                    activityResolveInfo.getClass();
                                }
                                throw null;
                            } finally {
                            }
                        }
                    }
                } else {
                    if (itemViewType != 1) {
                        throw new IllegalArgumentException();
                    }
                    activityChooserView.c(Integer.MAX_VALUE);
                }
                Callback.k();
            } catch (Throwable th) {
                Callback.k();
                throw th;
            }
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.j) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.d.getCount() > 0) {
                activityChooserView.q = true;
                activityChooserView.c(activityChooserView.r);
            }
            return true;
        }
    }

    @RestrictTo
    public static class InnerLayout extends LinearLayout {
        public static final int[] d = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, d);
            setBackgroundDrawable(tintTypedArrayE.b(0));
            tintTypedArrayE.g();
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.n);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().C.isShowing();
    }

    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final void c(int i) {
        ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
        ActivityChooserViewAdapter activityChooserViewAdapter = this.d;
        if (activityChooserViewAdapter.d == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.n);
        ?? r1 = this.j.getVisibility() == 0 ? 1 : 0;
        int iD = activityChooserViewAdapter.d.d();
        if (i == Integer.MAX_VALUE || iD <= i + r1) {
            if (activityChooserViewAdapter.h) {
                activityChooserViewAdapter.h = false;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
            if (activityChooserViewAdapter.e != i) {
                activityChooserViewAdapter.e = i;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
        } else {
            if (!activityChooserViewAdapter.h) {
                activityChooserViewAdapter.h = true;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
            int i2 = i - 1;
            if (activityChooserViewAdapter.e != i2) {
                activityChooserViewAdapter.e = i2;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.C.isShowing()) {
            return;
        }
        if (this.q || r1 == 0) {
            if (!activityChooserViewAdapter.f || activityChooserViewAdapter.g != r1) {
                activityChooserViewAdapter.f = true;
                activityChooserViewAdapter.g = r1;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
        } else if (activityChooserViewAdapter.f || activityChooserViewAdapter.g) {
            activityChooserViewAdapter.f = false;
            activityChooserViewAdapter.g = false;
            activityChooserViewAdapter.notifyDataSetChanged();
        }
        int i3 = activityChooserViewAdapter.e;
        activityChooserViewAdapter.e = Integer.MAX_VALUE;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = activityChooserViewAdapter.getCount();
        int iMax = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            view = activityChooserViewAdapter.getView(i4, view, null);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        activityChooserViewAdapter.e = i3;
        listPopupWindow.r(Math.min(iMax, this.k));
        listPopupWindow.a();
        ActionProvider actionProvider = this.l;
        if (actionProvider != null && (subUiVisibilityListener = actionProvider.f2468a) != null) {
            ((ActionMenuPresenter) subUiVisibilityListener).q(true);
        }
        listPopupWindow.f.setContentDescription(getContext().getString(R.string.abc_activitychooserview_choose_application));
        listPopupWindow.f.setSelector(new ColorDrawable(0));
    }

    @RestrictTo
    public ActivityChooserModel getDataModel() {
        return this.d.d;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.o == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.o = listPopupWindow;
            listPopupWindow.o(this.d);
            ListPopupWindow listPopupWindow2 = this.o;
            listPopupWindow2.r = this;
            listPopupWindow2.B = true;
            listPopupWindow2.C.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.o;
            Callbacks callbacks = this.e;
            listPopupWindow3.s = callbacks;
            listPopupWindow3.C.setOnDismissListener(callbacks);
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel activityChooserModel = this.d.d;
        if (activityChooserModel != null) {
            activityChooserModel.registerObserver(this.m);
        }
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel activityChooserModel = this.d.d;
        if (activityChooserModel != null) {
            activityChooserModel.unregisterObserver(this.m);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.n);
        }
        if (b()) {
            a();
        }
        this.s = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.layout(0, 0, i3 - i, i4 - i2);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.j.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.f;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @RestrictTo
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        ActivityChooserViewAdapter activityChooserViewAdapter = this.d;
        ActivityChooserView activityChooserView = ActivityChooserView.this;
        ActivityChooserViewAdapter activityChooserViewAdapter2 = activityChooserView.d;
        DataSetObserver dataSetObserver = activityChooserView.m;
        ActivityChooserModel activityChooserModel2 = activityChooserViewAdapter2.d;
        if (activityChooserModel2 != null && activityChooserView.isShown()) {
            activityChooserModel2.unregisterObserver(dataSetObserver);
        }
        activityChooserViewAdapter.d = activityChooserModel;
        if (activityChooserModel != null && activityChooserView.isShown()) {
            activityChooserModel.registerObserver(dataSetObserver);
        }
        activityChooserViewAdapter.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.s) {
                return;
            }
            this.q = false;
            c(this.r);
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.i.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.i.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.r = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @RestrictTo
    public void setProvider(ActionProvider actionProvider) {
        this.l = actionProvider;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.d.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.d.notifyDataSetInvalidated();
            }
        };
        this.n = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        return;
                    }
                    activityChooserView.getListPopupWindow().a();
                    ActionProvider actionProvider = activityChooserView.l;
                    if (actionProvider == null || (subUiVisibilityListener = actionProvider.f2468a) == null) {
                        return;
                    }
                    ((ActionMenuPresenter) subUiVisibilityListener).q(true);
                }
            }
        };
        this.r = 4;
        int[] iArr = androidx.appcompat.R.styleable.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.z(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        this.r = typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        Callbacks callbacks = new Callbacks();
        this.e = callbacks;
        View viewFindViewById = findViewById(R.id.activity_chooser_view_content);
        this.f = viewFindViewById;
        this.g = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.j = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new AnonymousClass3());
        frameLayout2.setOnTouchListener(new ForwardingListener(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.4
            @Override // androidx.appcompat.widget.ForwardingListener
            public final ShowableListMenu c() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final boolean d() {
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.b() || !activityChooserView.s) {
                    return true;
                }
                activityChooserView.q = false;
                activityChooserView.c(activityChooserView.r);
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final boolean e() {
                ActivityChooserView.this.a();
                return true;
            }
        });
        this.h = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.image);
        this.i = imageView;
        imageView.setImageDrawable(drawable);
        ActivityChooserViewAdapter activityChooserViewAdapter = new ActivityChooserViewAdapter();
        this.d = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                int size;
                super.onChanged();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.d.getCount() > 0) {
                    activityChooserView.h.setEnabled(true);
                } else {
                    activityChooserView.h.setEnabled(false);
                }
                int iD = activityChooserView.d.d.d();
                ActivityChooserModel activityChooserModel = activityChooserView.d.d;
                synchronized (activityChooserModel.f143a) {
                    activityChooserModel.a();
                    size = activityChooserModel.c.size();
                }
                if (iD == 1 || (iD > 1 && size > 0)) {
                    activityChooserView.j.setVisibility(0);
                    activityChooserView.d.d.e();
                    activityChooserView.getContext().getPackageManager();
                    throw null;
                }
                activityChooserView.j.setVisibility(8);
                if (activityChooserView.j.getVisibility() == 0) {
                    activityChooserView.f.setBackgroundDrawable(activityChooserView.g);
                } else {
                    activityChooserView.f.setBackgroundDrawable(null);
                }
            }
        });
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }
}
