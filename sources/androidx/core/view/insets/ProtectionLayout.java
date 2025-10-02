package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.core.view.insets.Protection;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object f = new Object();
    public final ArrayList d;
    public ProtectionGroup e;

    /* renamed from: androidx.core.view.insets.ProtectionLayout$1, reason: invalid class name */
    class AnonymousClass1 implements Protection.Attributes.Callback {
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.d = new ArrayList();
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            return (SystemBarStateMonitor) tag;
        }
        SystemBarStateMonitor systemBarStateMonitor = new SystemBarStateMonitor(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, systemBarStateMonitor);
        return systemBarStateMonitor;
    }

    public final void a() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.e = new ProtectionGroup(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.e.f2521a.size() <= 0) {
            return;
        }
        Protection protection = (Protection) this.e.f2521a.get(0);
        getContext();
        protection.getClass();
        throw new IllegalArgumentException("Unexpected side: 0");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f) {
            ProtectionGroup protectionGroup = this.e;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.f2521a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.e != null) {
            removeViews(getChildCount() - this.e.f2521a.size(), this.e.f2521a.size());
            if (this.e.f2521a.size() > 0) {
                ((Protection) this.e.f2521a.get(0)).getClass();
                throw null;
            }
            ProtectionGroup protectionGroup = this.e;
            ArrayList arrayList = protectionGroup.f2521a;
            if (!protectionGroup.d) {
                protectionGroup.d = true;
                protectionGroup.b.b.remove(protectionGroup);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Protection) arrayList.get(size)).f2520a = null;
                }
                arrayList.clear();
            }
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            final SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) tag;
            if (systemBarStateMonitor.b.isEmpty()) {
                systemBarStateMonitor.f2522a.post(new Runnable() { // from class: androidx.core.view.insets.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view = systemBarStateMonitor.f2522a;
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(view);
                        }
                    }
                });
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<Protection> list) {
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, 0);
        this.d = new ArrayList();
    }
}
