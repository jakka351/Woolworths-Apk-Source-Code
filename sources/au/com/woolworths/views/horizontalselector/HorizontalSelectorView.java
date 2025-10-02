package au.com.woolworths.views.horizontalselector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DimenRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.shared.ui.views.databinding.LayoutHorizontalSelectorBinding;
import com.airbnb.epoxy.Carousel;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002/0B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\rR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lau/com/woolworths/views/horizontalselector/HorizontalSelectorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/github/rubensousa/gravitysnaphelper/GravitySnapHelper$SnapListener;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorItemClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getItemWidthRes", "()I", "", "", "d", "Ljava/util/List;", "getDataSet", "()Ljava/util/List;", "setDataSet", "(Ljava/util/List;)V", "dataSet", "", "e", "Z", "getWideItems", "()Z", "setWideItems", "(Z)V", "wideItems", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "f", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "getViewListener", "()Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "setViewListener", "(Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;)V", "viewListener", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewAnalyticsListener;", "g", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewAnalyticsListener;", "getAnalyticsListener", "()Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewAnalyticsListener;", "setAnalyticsListener", "(Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewAnalyticsListener;)V", "analyticsListener", "RVAccessibilityDelegate", "Companion", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HorizontalSelectorView extends ConstraintLayout implements GravitySnapHelper.SnapListener, HorizontalSelectorItemClickListener {

    /* renamed from: d, reason: from kotlin metadata */
    public List dataSet;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean wideItems;

    /* renamed from: f, reason: from kotlin metadata */
    public HorizontalSelectorViewListener viewListener;

    /* renamed from: g, reason: from kotlin metadata */
    public HorizontalSelectorViewAnalyticsListener analyticsListener;
    public int h;
    public boolean i;
    public final LayoutHorizontalSelectorBinding j;
    public HorizontalSelectorViewEpoxyController k;
    public final HorizontalSelectorView$carouselScrollListener$1 l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/views/horizontalselector/HorizontalSelectorView$Companion;", "", "", "VIBRATE_DURATION", "J", "", "VIBRATE_AMPLITUDE", "I", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/views/horizontalselector/HorizontalSelectorView$RVAccessibilityDelegate;", "Landroidx/recyclerview/widget/RecyclerViewAccessibilityDelegate;", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RVAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public final /* synthetic */ HorizontalSelectorView f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RVAccessibilityDelegate(HorizontalSelectorView horizontalSelectorView, RecyclerView recyclerView) {
            super(recyclerView);
            Intrinsics.h(recyclerView, "recyclerView");
            this.f = horizontalSelectorView;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup host, View child, AccessibilityEvent event) {
            HorizontalSelectorView horizontalSelectorView;
            Context context;
            Intrinsics.h(host, "host");
            Intrinsics.h(child, "child");
            Intrinsics.h(event, "event");
            if ((host instanceof RecyclerView) && (context = (horizontalSelectorView = this.f).getContext()) != null && ContextExtKt.d(context)) {
                RecyclerView recyclerView = (RecyclerView) host;
                Intrinsics.e(recyclerView.getLayoutManager());
                int iO = RecyclerView.LayoutManager.O(child);
                int eventType = event.getEventType();
                if (eventType == 1) {
                    horizontalSelectorView.getViewListener().s4();
                } else if (eventType == 32768) {
                    recyclerView.s0(iO);
                    horizontalSelectorView.getViewListener().z2(iO);
                }
            }
            return this.f2466a.onRequestSendAccessibilityEvent(host, child, event);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HorizontalSelectorView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DimenRes
    public final int getItemWidthRes() {
        return this.wideItems ? R.dimen.horizontal_selector_item_wide_width : R.dimen.horizontal_selector_item_width;
    }

    @Override // com.github.rubensousa.gravitysnaphelper.GravitySnapHelper.SnapListener
    public final void H0(int i) {
        getViewListener().z2(i);
        if (this.i) {
            this.i = false;
            return;
        }
        HorizontalSelectorViewAnalyticsListener horizontalSelectorViewAnalyticsListener = this.analyticsListener;
        if (horizontalSelectorViewAnalyticsListener != null) {
            horizontalSelectorViewAnalyticsListener.d5();
        }
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorItemClickListener
    public final void P3(int i) {
        getViewListener().z2(i);
        this.j.z.s0(i);
        this.i = true;
        HorizontalSelectorViewAnalyticsListener horizontalSelectorViewAnalyticsListener = this.analyticsListener;
        if (horizontalSelectorViewAnalyticsListener != null) {
            horizontalSelectorViewAnalyticsListener.Q5();
        }
    }

    public final void e(List newDataSet, boolean z) {
        Intrinsics.h(newDataSet, "newDataSet");
        setDataSet(newDataSet);
        this.wideItems = z;
        HorizontalSelectorViewEpoxyController horizontalSelectorViewEpoxyController = this.k;
        if (horizontalSelectorViewEpoxyController != null) {
            horizontalSelectorViewEpoxyController.updateData(getDataSet(), getItemWidthRes());
        }
    }

    @Nullable
    public final HorizontalSelectorViewAnalyticsListener getAnalyticsListener() {
        return this.analyticsListener;
    }

    @NotNull
    public final List<String> getDataSet() {
        List<String> list = this.dataSet;
        if (list != null) {
            return list;
        }
        Intrinsics.p("dataSet");
        throw null;
    }

    @NotNull
    public final HorizontalSelectorViewListener getViewListener() {
        HorizontalSelectorViewListener horizontalSelectorViewListener = this.viewListener;
        if (horizontalSelectorViewListener != null) {
            return horizontalSelectorViewListener;
        }
        Intrinsics.p("viewListener");
        throw null;
    }

    public final boolean getWideItems() {
        return this.wideItems;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Carousel selectorCarousel = this.j.z;
        Intrinsics.g(selectorCarousel, "selectorCarousel");
        new GravitySnapHelper(17, true, this).b(selectorCarousel);
        selectorCarousel.k(this.l);
        selectorCarousel.setItemSpacingDp(0);
        if (!selectorCarousel.isLaidOut() || selectorCarousel.isLayoutRequested()) {
            selectorCarousel.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: au.com.woolworths.views.horizontalselector.HorizontalSelectorView$updateSelectorPadding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    int measuredWidth = view.getMeasuredWidth();
                    HorizontalSelectorView horizontalSelectorView = this.f12954a;
                    int dimensionPixelSize = (measuredWidth - horizontalSelectorView.getResources().getDimensionPixelSize(horizontalSelectorView.getItemWidthRes())) / 2;
                    view.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
                    horizontalSelectorView.k = new HorizontalSelectorViewEpoxyController(horizontalSelectorView.getViewListener(), horizontalSelectorView);
                    Carousel carousel = selectorCarousel;
                    carousel.post(new HorizontalSelectorView$updateSelectorPadding$1$1(horizontalSelectorView, carousel));
                }
            });
        } else {
            int measuredWidth = (selectorCarousel.getMeasuredWidth() - getResources().getDimensionPixelSize(getItemWidthRes())) / 2;
            selectorCarousel.setPaddingRelative(measuredWidth, 0, measuredWidth, 0);
            this.k = new HorizontalSelectorViewEpoxyController(getViewListener(), this);
            selectorCarousel.post(new HorizontalSelectorView$updateSelectorPadding$1$1(this, selectorCarousel));
        }
        selectorCarousel.setAccessibilityDelegateCompat(new RVAccessibilityDelegate(this, selectorCarousel));
    }

    public final void setAnalyticsListener(@Nullable HorizontalSelectorViewAnalyticsListener horizontalSelectorViewAnalyticsListener) {
        this.analyticsListener = horizontalSelectorViewAnalyticsListener;
    }

    public final void setDataSet(@NotNull List<String> list) {
        Intrinsics.h(list, "<set-?>");
        this.dataSet = list;
    }

    public final void setViewListener(@NotNull HorizontalSelectorViewListener horizontalSelectorViewListener) {
        Intrinsics.h(horizontalSelectorViewListener, "<set-?>");
        this.viewListener = horizontalSelectorViewListener;
    }

    public final void setWideItems(boolean z) {
        this.wideItems = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HorizontalSelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ HorizontalSelectorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [au.com.woolworths.views.horizontalselector.HorizontalSelectorView$carouselScrollListener$1] */
    @JvmOverloads
    public HorizontalSelectorView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = LayoutHorizontalSelectorBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        LayoutHorizontalSelectorBinding layoutHorizontalSelectorBinding = (LayoutHorizontalSelectorBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.layout_horizontal_selector, this, true, null);
        Intrinsics.g(layoutHorizontalSelectorBinding, "inflate(...)");
        this.j = layoutHorizontalSelectorBinding;
        this.l = new RecyclerView.OnScrollListener() { // from class: au.com.woolworths.views.horizontalselector.HorizontalSelectorView$carouselScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void d(RecyclerView recyclerView, int i3, int i4) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iD1 = i3 < 0 ? linearLayoutManager.d1() : linearLayoutManager.b1();
                HorizontalSelectorView horizontalSelectorView = this.f12955a;
                if (horizontalSelectorView.h != iD1) {
                    horizontalSelectorView.h = iD1;
                    ContextExtKt.k(context, 50L, 30);
                }
            }
        };
    }
}
