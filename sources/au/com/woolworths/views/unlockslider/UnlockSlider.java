package au.com.woolworths.views.unlockslider;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.ColorInt;
import androidx.camera.camera2.interop.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.UnlockSliderBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.addtolist.utils.a;
import au.com.woolworths.views.unlockslider.UnlockSlider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u001f !B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lau/com/woolworths/views/unlockslider/UnlockSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lau/com/woolworths/views/unlockslider/UnlockSlider$OnUnlockListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnUnlockListener", "(Lau/com/woolworths/views/unlockslider/UnlockSlider$OnUnlockListener;)V", "", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "setAccessibilityText", "setButtonText", "iconUrl", "setButtonIconUrl", "Landroid/graphics/drawable/Drawable;", "drawable", "setButtonIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "tint", "setButtonTint", "(I)V", "width", "setSliderButtonWidth", "OnUnlockListener", "OnProgressChangedListener", "Companion", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UnlockSlider extends ConstraintLayout {
    public final UnlockSliderBinding d;
    public final View e;
    public final ConstraintLayout f;
    public int g;
    public float h;
    public float i;
    public int j;
    public ValueAnimator k;
    public String l;
    public boolean m;
    public OnUnlockListener n;
    public final LinkedHashSet o;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/views/unlockslider/UnlockSlider$Companion;", "", "", "SLIDER_SHRINK_MAX_DURATION", "J", "SLIDER_EXPAND_MAX_DURATION", "", "UNLOCK_THRESHOLD", "F", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/views/unlockslider/UnlockSlider$OnProgressChangedListener;", "", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnProgressChangedListener {
        void L0(float f);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/views/unlockslider/UnlockSlider$OnUnlockListener;", "", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnUnlockListener {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockSlider(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = UnlockSliderBinding.J;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        UnlockSliderBinding unlockSliderBinding = (UnlockSliderBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.unlock_slider, this, true, null);
        Intrinsics.g(unlockSliderBinding, "inflate(...)");
        this.d = unlockSliderBinding;
        View sliderBackground = unlockSliderBinding.A;
        Intrinsics.g(sliderBackground, "sliderBackground");
        this.e = sliderBackground;
        ConstraintLayout sliderButton = unlockSliderBinding.B;
        Intrinsics.g(sliderButton, "sliderButton");
        this.f = sliderButton;
        this.g = -1;
        this.h = -1.0f;
        this.i = -1.0f;
        this.o = new LinkedHashSet();
        setClickable(true);
        setFocusable(true);
        setImportantForAccessibility(1);
    }

    public static void d(UnlockSlider unlockSlider) {
        ValueAnimator valueAnimator = unlockSlider.k;
        UnlockSliderBinding unlockSliderBinding = unlockSlider.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        unlockSlider.setSliderButtonWidth(unlockSlider.m ? unlockSlider.j : unlockSlider.f.getHeight());
        int i = unlockSlider.j;
        Space space = unlockSliderBinding.E;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(i / 2);
        space.setLayoutParams(layoutParams2);
        unlockSliderBinding.D.setVisibility(0);
    }

    public static void e(UnlockSlider unlockSlider, ValueAnimator it) {
        Intrinsics.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        unlockSlider.setSliderButtonWidth(((Integer) animatedValue).intValue());
    }

    private final void setSliderButtonWidth(int width) {
        ConstraintLayout constraintLayout = this.f;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = width;
        constraintLayout.setLayoutParams(layoutParams);
        LinkedHashSet linkedHashSet = this.o;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        float height = (width - constraintLayout.getHeight()) / (this.j - r0);
        if (height < BitmapDescriptorFactory.HUE_RED) {
            height = 0.0f;
        }
        if (height > 1.0f) {
            height = 1.0f;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((OnProgressChangedListener) it.next()).L0(height);
        }
    }

    public final void f(int i, long j) {
        ConstraintLayout constraintLayout = this.f;
        int width = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        long j2 = (long) ((j * (width - height)) / (this.j - height));
        if (j2 < 0) {
            j2 = 0;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, i);
        valueAnimatorOfInt.addUpdateListener(new a(this, 2));
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.start();
        this.k = valueAnimatorOfInt;
    }

    public final void g() {
        this.g = -1;
        ConstraintLayout constraintLayout = this.f;
        constraintLayout.setPressed(false);
        if (!this.m && constraintLayout.getWidth() >= this.j * 0.9f) {
            performClick();
        }
        if (this.m) {
            return;
        }
        f(constraintLayout.getHeight(), 700L);
    }

    public final void k(final boolean z, final boolean z2) {
        OnUnlockListener onUnlockListener;
        this.m = z;
        this.g = -1;
        UnlockSliderBinding unlockSliderBinding = this.d;
        unlockSliderBinding.N(z);
        unlockSliderBinding.l();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: au.com.woolworths.views.unlockslider.UnlockSlider$setUnlocking$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    UnlockSlider.OnUnlockListener onUnlockListener2;
                    view.removeOnLayoutChangeListener(this);
                    UnlockSlider unlockSlider = this.f12956a;
                    ConstraintLayout constraintLayout = unlockSlider.f;
                    constraintLayout.setPressed(false);
                    if (!z) {
                        unlockSlider.f(constraintLayout.getHeight(), 700L);
                        return;
                    }
                    unlockSlider.f(unlockSlider.j, 200L);
                    if (!z2 || (onUnlockListener2 = unlockSlider.n) == null) {
                        return;
                    }
                    onUnlockListener2.a();
                }
            });
            return;
        }
        ConstraintLayout constraintLayout = this.f;
        constraintLayout.setPressed(false);
        if (!z) {
            f(constraintLayout.getHeight(), 700L);
            return;
        }
        f(this.j, 200L);
        if (!z2 || (onUnlockListener = this.n) == null) {
            return;
        }
        onUnlockListener.a();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) throws Resources.NotFoundException {
        Intrinsics.h(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClickable(!this.m);
        String str = this.l;
        if (str == null) {
            str = this.d.F;
        }
        String string = getResources().getString(R.string.unlock_slider_in_progress);
        Intrinsics.g(string, "getString(...)");
        if (this.m) {
            info.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            str = str + ", " + string;
        }
        info.setContentDescription(str);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.f.getLayoutParams();
        Intrinsics.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        this.j = (((i - layoutParams2.getMarginStart()) - layoutParams2.getMarginEnd()) - layoutParams4.getMarginStart()) - layoutParams4.getMarginEnd();
        post(new d(this, 22));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.h(event, "event");
        int action = event.getAction();
        ConstraintLayout constraintLayout = this.f;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (this.m) {
                        this.g = -1;
                        constraintLayout.setPressed(false);
                        return true;
                    }
                    int iFindPointerIndex = event.findPointerIndex(this.g);
                    if (iFindPointerIndex != -1) {
                        float x = event.getX(iFindPointerIndex);
                        float f = (x - this.h) + this.i;
                        this.i = f;
                        this.h = x;
                        setSliderButtonWidth(RangesKt.c((int) ((constraintLayout.getHeight() / 2.0f) + f), constraintLayout.getHeight(), this.j));
                        return true;
                    }
                } else if (action != 3) {
                    if (action == 6 && event.findPointerIndex(this.g) != -1) {
                        g();
                        return true;
                    }
                }
            }
            g();
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.m) {
            int actionIndex = event.getActionIndex();
            Space sliderButtonDragArea = this.d.C;
            Intrinsics.g(sliderButtonDragArea, "sliderButtonDragArea");
            Rect rect = new Rect();
            sliderButtonDragArea.getGlobalVisibleRect(rect);
            if (rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                constraintLayout.setPressed(true);
                this.i = constraintLayout.getWidth() - (constraintLayout.getHeight() / 2.0f);
                this.h = event.getX(actionIndex);
                this.g = event.getPointerId(0);
                ValueAnimator valueAnimator = this.k;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        k(true, true);
        return true;
    }

    public final void setAccessibilityText(@Nullable String text) {
        this.l = text;
    }

    public final void setButtonIcon(@Nullable Drawable drawable) {
        this.d.y.setImageDrawable(drawable);
    }

    public final void setButtonIconUrl(@Nullable String iconUrl) {
        ImageView icon = this.d.y;
        Intrinsics.g(icon, "icon");
        BindingAdaptersKt.i(icon, iconUrl, null, null, null, 96);
    }

    public final void setButtonText(@Nullable String text) {
        UnlockSliderBinding unlockSliderBinding = this.d;
        unlockSliderBinding.L(text);
        unlockSliderBinding.l();
    }

    public final void setButtonTint(@ColorInt int tint) {
        UnlockSliderBinding unlockSliderBinding = this.d;
        unlockSliderBinding.M(tint);
        unlockSliderBinding.l();
    }

    public final void setOnUnlockListener(@Nullable OnUnlockListener listener) {
        this.n = listener;
    }

    public final void setText(@Nullable String text) {
        UnlockSliderBinding unlockSliderBinding = this.d;
        unlockSliderBinding.O(text);
        unlockSliderBinding.l();
    }
}
