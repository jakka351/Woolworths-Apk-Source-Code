package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00028\u0000\"\n\b\u0000\u0010\u0019*\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "Api20Impl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList d;
    public final ArrayList e;
    public View.OnApplyWindowInsetsListener f;
    public boolean g;

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Api20Impl {
        public static WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, FragmentContainerView fragmentContainerView, WindowInsets windowInsets) {
            Intrinsics.h(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(fragmentContainerView, windowInsets);
            Intrinsics.g(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = true;
    }

    public final void a(View view) {
        if (this.e.contains(view)) {
            this.d.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.h(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        Intrinsics.h(insets, "insets");
        WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f;
        WindowInsetsCompat windowInsetsCompatS2 = onApplyWindowInsetsListener != null ? WindowInsetsCompat.s(null, Api20Impl.a(onApplyWindowInsetsListener, this, insets)) : ViewCompat.u(this, windowInsetsCompatS);
        Intrinsics.g(windowInsetsCompatS2, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompatS2.p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.d(getChildAt(i), windowInsetsCompatS2);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        if (this.g) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(child, "child");
        if (this.g) {
            ArrayList arrayList = this.d;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.h(view, "view");
        this.e.remove(view);
        if (this.d.remove(view)) {
            this.g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        FragmentActivity fragmentActivity;
        FragmentManager supportFragmentManager;
        Fragment fragmentH = FragmentManager.H(this);
        if (fragmentH == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fragmentActivity = null;
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!fragmentH.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentH + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragmentH.getChildFragmentManager();
        }
        return (F) supportFragmentManager.F(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.h(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.g(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.h(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        Intrinsics.g(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.h(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View view = getChildAt(i4);
            Intrinsics.g(view, "view");
            a(view);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View view = getChildAt(i4);
            Intrinsics.g(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i2);
    }

    @JvmName
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.g = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Nullable View.OnApplyWindowInsetsListener listener) {
        this.f = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.h(view, "view");
        if (view.getParent() == this) {
            this.e.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.fragment.R.styleable.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, FragmentManager fragmentManager) {
        View view;
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.fragment.R.styleable.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentF = fragmentManager.F(id);
        if (classAttribute != null && fragmentF == null) {
            if (id == -1) {
                throw new IllegalStateException(YU.a.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment fragmentA = fragmentManager.M().a(context.getClassLoader(), classAttribute);
            Intrinsics.g(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.mFragmentId = id;
            fragmentA.mContainerId = id;
            fragmentA.mTag = string;
            fragmentA.mFragmentManager = fragmentManager;
            fragmentA.mHost = fragmentManager.x;
            fragmentA.onInflate(context, attrs, (Bundle) null);
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
            backStackRecord.p = true;
            fragmentA.mContainer = this;
            fragmentA.mInDynamicContainer = true;
            backStackRecord.g(getId(), fragmentA, string, 1);
            if (!backStackRecord.g) {
                backStackRecord.h = false;
                backStackRecord.r.C(backStackRecord, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fragmentManager.c.d().iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
            Fragment fragmentK = fragmentStateManager.k();
            if (fragmentK.mContainerId == getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = this;
                fragmentStateManager.b();
                fragmentStateManager.l();
            }
        }
    }
}
