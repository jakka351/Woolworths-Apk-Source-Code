package com.airbnb.epoxy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

@ModelView
/* loaded from: classes4.dex */
public class Carousel extends EpoxyRecyclerView {
    public static SnapHelperFactory c1 = new AnonymousClass1();
    public static int d1 = 8;
    public float b1;

    /* renamed from: com.airbnb.epoxy.Carousel$1, reason: invalid class name */
    public class AnonymousClass1 extends SnapHelperFactory {
        @Override // com.airbnb.epoxy.Carousel.SnapHelperFactory
        public final SnapHelper a() {
            return new LinearSnapHelper();
        }
    }

    public static class Padding {

        /* renamed from: a, reason: collision with root package name */
        public final int f13307a;
        public final int b;
        public final int c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class PaddingType {
            public static final PaddingType d;
            public static final /* synthetic */ PaddingType[] e;

            /* JADX INFO: Fake field, exist only in values array */
            PaddingType EF0;

            static {
                PaddingType paddingType = new PaddingType("PX", 0);
                PaddingType paddingType2 = new PaddingType("DP", 1);
                PaddingType paddingType3 = new PaddingType("RESOURCE", 2);
                d = paddingType3;
                e = new PaddingType[]{paddingType, paddingType2, paddingType3};
            }

            public static PaddingType valueOf(String str) {
                return (PaddingType) Enum.valueOf(PaddingType.class, str);
            }

            public static PaddingType[] values() {
                return (PaddingType[]) e.clone();
            }
        }

        public Padding(int i, int i2, int i3) {
            this.f13307a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Padding padding = (Padding) obj;
            return this.f13307a == padding.f13307a && this.b == padding.b && this.c == padding.c;
        }

        public final int hashCode() {
            return ((((((1641615666 + this.f13307a) * 31) + com.woolworths.R.dimen.default_padding) * 31) + this.b) * 31) + this.c;
        }
    }

    public static abstract class SnapHelperFactory {
        public abstract SnapHelper a();
    }

    public Carousel(Context context) {
        super(context);
    }

    public static void setDefaultGlobalSnapHelperFactory(@Nullable SnapHelperFactory snapHelperFactory) {
        c1 = snapHelperFactory;
    }

    public static void setDefaultItemSpacingDp(@Dimension int i) {
        d1 = i;
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public final void A0() {
        super.A0();
        int defaultSpacingBetweenItemsDp = getDefaultSpacingBetweenItemsDp();
        if (defaultSpacingBetweenItemsDp >= 0) {
            setItemSpacingDp(defaultSpacingBetweenItemsDp);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
                setPaddingDp(defaultSpacingBetweenItemsDp);
            }
        }
        SnapHelperFactory snapHelperFactory = getSnapHelperFactory();
        if (snapHelperFactory != null) {
            getContext();
            snapHelperFactory.a().b(this);
        }
        setRemoveAdapterWhenDetachedFromWindow(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void Y(View view) {
        int height;
        if (this.b1 > BitmapDescriptorFactory.HUE_RED) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setTag(com.woolworths.R.id.epoxy_recycler_view_child_initial_size_id, Integer.valueOf(layoutParams.width));
            int i = getSpacingDecorator().f13315a;
            int paddingBottom = 0;
            int i2 = i > 0 ? (int) (i * this.b1) : 0;
            boolean zG = getLayoutManager().g();
            if (zG) {
                height = (getWidth() > 0 ? getWidth() : getMeasuredWidth() > 0 ? getMeasuredWidth() : getContext().getResources().getDisplayMetrics().widthPixels) - getPaddingLeft();
                if (getClipToPadding()) {
                    paddingBottom = getPaddingRight();
                }
            } else {
                height = (getHeight() > 0 ? getHeight() : getMeasuredHeight() > 0 ? getMeasuredHeight() : getContext().getResources().getDisplayMetrics().heightPixels) - getPaddingTop();
                if (getClipToPadding()) {
                    paddingBottom = getPaddingBottom();
                }
            }
            int i3 = (int) (((height - paddingBottom) - i2) / this.b1);
            if (zG) {
                layoutParams.width = i3;
            } else {
                layoutParams.height = i3;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void Z(View view) {
        Object tag = view.getTag(com.woolworths.R.id.epoxy_recycler_view_child_initial_size_id);
        if (tag instanceof Integer) {
            view.getLayoutParams().width = ((Integer) tag).intValue();
            view.setTag(com.woolworths.R.id.epoxy_recycler_view_child_initial_size_id, null);
        }
    }

    @Dimension
    public int getDefaultSpacingBetweenItemsDp() {
        return d1;
    }

    public float getNumViewsToShowOnScreen() {
        return this.b1;
    }

    @Nullable
    public SnapHelperFactory getSnapHelperFactory() {
        return c1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @ModelProp
    public void setHasFixedSize(boolean z) {
        super.setHasFixedSize(z);
    }

    @ModelProp
    public void setInitialPrefetchItemCount(int i) {
        if (i < 0) {
            throw new IllegalStateException("numItemsToPrefetch must be greater than 0");
        }
        if (i == 0) {
            i = 2;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).C = i;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    @ModelProp
    public void setModels(@NonNull List<? extends EpoxyModel<?>> list) {
        super.setModels(list);
    }

    @ModelProp
    public void setNumViewsToShowOnScreen(float f) {
        this.b1 = f;
        setInitialPrefetchItemCount((int) Math.ceil(f));
    }

    @ModelProp
    public void setPadding(@Nullable Padding padding) {
        if (padding == null) {
            setPaddingDp(0);
            return;
        }
        int i = padding.c;
        int i2 = padding.b;
        setPadding(B0(com.woolworths.R.dimen.default_padding), B0(padding.f13307a), B0(com.woolworths.R.dimen.default_padding), B0(i2));
        setItemSpacingPx(B0(i));
    }

    @ModelProp
    public void setPaddingDp(@Dimension int i) {
        if (i == -1) {
            i = getDefaultSpacingBetweenItemsDp();
        }
        int iZ0 = z0(i);
        setPadding(iZ0, iZ0, iZ0, iZ0);
        setItemSpacingPx(iZ0);
    }

    @ModelProp
    public void setPaddingRes(@DimenRes int i) {
        int iB0 = B0(i);
        setPadding(iB0, iB0, iB0, iB0);
        setItemSpacingPx(iB0);
    }

    public Carousel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Carousel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
