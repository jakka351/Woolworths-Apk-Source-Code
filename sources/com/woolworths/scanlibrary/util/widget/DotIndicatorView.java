package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ViewDotIndicatorBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\fR*\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/DotIndicatorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "position", "", "setCurrentDot", "(I)V", "value", "e", "I", "getTotalCount", "()I", "setTotalCount", "totalCount", "f", "getCurrentPosition", "setCurrentPosition", "currentPosition", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DotIndicatorView extends FrameLayout {
    public final ViewDotIndicatorBinding d;

    /* renamed from: e, reason: from kotlin metadata */
    public int totalCount;

    /* renamed from: f, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotIndicatorView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int i = ViewDotIndicatorBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        this.d = (ViewDotIndicatorBinding) ViewDataBinding.q((LayoutInflater) systemService, R.layout.view_dot_indicator, this, true, null);
    }

    private final void setCurrentDot(int position) {
        if (this.d == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        if (position > r2.y.getChildCount() - 1) {
            ViewDotIndicatorBinding viewDotIndicatorBinding = this.d;
            if (viewDotIndicatorBinding != null) {
                throw new RuntimeException(androidx.camera.core.impl.b.j(position, viewDotIndicatorBinding.y.getChildCount(), "Index out of bondary: requested ", " while total ", " views"));
            }
            Intrinsics.p("viewBinding");
            throw null;
        }
        ViewDotIndicatorBinding viewDotIndicatorBinding2 = this.d;
        if (viewDotIndicatorBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        int childCount = viewDotIndicatorBinding2.y.getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            ViewDotIndicatorBinding viewDotIndicatorBinding3 = this.d;
            if (viewDotIndicatorBinding3 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            View childAt = viewDotIndicatorBinding3.y.getChildAt(i);
            if (i == position) {
                childAt.setBackgroundResource(R.drawable.sng_dot_indicator_selected);
            } else {
                childAt.setBackgroundResource(R.drawable.sng_dot_indicator_default);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void setCurrentPosition(int i) {
        setCurrentDot(i);
        this.currentPosition = i;
    }

    public final void setTotalCount(int i) {
        ViewDotIndicatorBinding viewDotIndicatorBinding = this.d;
        if (viewDotIndicatorBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        viewDotIndicatorBinding.y.removeAllViews();
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                View view = new View(getContext());
                view.setBackgroundResource(R.drawable.sng_dot_indicator_default);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.sng_indicator_dot_size), getResources().getDimensionPixelSize(R.dimen.sng_indicator_dot_size));
                layoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.sng_small_general_spacing));
                layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.sng_small_general_spacing));
                ViewDotIndicatorBinding viewDotIndicatorBinding2 = this.d;
                if (viewDotIndicatorBinding2 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                viewDotIndicatorBinding2.y.addView(view, layoutParams);
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.totalCount = i;
    }
}
