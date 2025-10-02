package au.com.woolworths.android.onesite.modules.onboarding.stepper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeOnboardingStepperViewBinding;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperContract;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/stepper/StepperView;", "Landroid/widget/FrameLayout;", "Lau/com/woolworths/android/onesite/modules/onboarding/stepper/StepperContract$View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "textView", "", "setTextViewSelected", "(Landroid/widget/TextView;)V", "setTextViewNotSelected", "Landroid/widget/ImageView;", "imageView", "setImageViewCompleted", "(Landroid/widget/ImageView;)V", "step", "setStepperStep", "(I)V", "Lau/com/woolworths/android/onesite/modules/onboarding/stepper/StepperContract$Presenter;", "l", "Lau/com/woolworths/android/onesite/modules/onboarding/stepper/StepperContract$Presenter;", "getStepperPresenter", "()Lau/com/woolworths/android/onesite/modules/onboarding/stepper/StepperContract$Presenter;", "setStepperPresenter", "(Lau/com/woolworths/android/onesite/modules/onboarding/stepper/StepperContract$Presenter;)V", "stepperPresenter", "getLayoutId", "()I", "layoutId", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class StepperView extends Hilt_StepperView implements StepperContract.View {
    public ImageView f;
    public ImageView g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;

    /* renamed from: l, reason: from kotlin metadata */
    public StepperContract.Presenter stepperPresenter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepperView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    private final int getLayoutId() {
        return R.layout.include_onboarding_stepper_view;
    }

    private final void setImageViewCompleted(ImageView imageView) {
        Intrinsics.e(imageView);
        imageView.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_completed, null, getResources()));
    }

    private final void setTextViewNotSelected(TextView textView) {
        Intrinsics.e(textView);
        textView.setTextAppearance(new ContextThemeWrapper(getContext(), R.style.WowTheme_Dark), R.style.Body_Stepper);
    }

    private final void setTextViewSelected(TextView textView) {
        Intrinsics.e(textView);
        textView.setTextAppearance(new ContextThemeWrapper(getContext(), R.style.WowTheme_Dark), R.style.Body2_Stepper);
    }

    @Override // au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperContract.View
    public final void H0() {
        setTextViewNotSelected(this.i);
        setTextViewSelected(this.j);
        setTextViewNotSelected(this.k);
        setImageViewCompleted(this.f);
        ImageView imageView = this.g;
        Intrinsics.e(imageView);
        imageView.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_2_selected, null, getResources()));
        ImageView imageView2 = this.h;
        Intrinsics.e(imageView2);
        imageView2.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_3_not_selected, null, getResources()));
    }

    @Override // au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperContract.View
    public final void J1() {
        setTextViewNotSelected(this.i);
        setTextViewNotSelected(this.j);
        setTextViewSelected(this.k);
        setImageViewCompleted(this.f);
        setImageViewCompleted(this.g);
        ImageView imageView = this.h;
        Intrinsics.e(imageView);
        imageView.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_3_selected, null, getResources()));
    }

    @Override // au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperContract.View
    public final void R() {
        setTextViewSelected(this.i);
        setTextViewNotSelected(this.j);
        setTextViewNotSelected(this.k);
        ImageView imageView = this.f;
        Intrinsics.e(imageView);
        imageView.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_1_selected, null, getResources()));
        ImageView imageView2 = this.g;
        Intrinsics.e(imageView2);
        imageView2.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_2_not_selected, null, getResources()));
        ImageView imageView3 = this.h;
        Intrinsics.e(imageView3);
        imageView3.setImageDrawable(VectorDrawableCompat.a(R.drawable.ic_onboarding_step_3_not_selected, null, getResources()));
    }

    @NotNull
    public final StepperContract.Presenter getStepperPresenter() {
        StepperContract.Presenter presenter = this.stepperPresenter;
        if (presenter != null) {
            return presenter;
        }
        Intrinsics.p("stepperPresenter");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int layoutId = getLayoutId();
        View rootView = getRootView();
        Intrinsics.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflaterFrom.inflate(layoutId, (ViewGroup) rootView, false);
        int i = IncludeOnboardingStepperViewBinding.E;
        IncludeOnboardingStepperViewBinding includeOnboardingStepperViewBinding = (IncludeOnboardingStepperViewBinding) DataBindingUtil.f2545a.b(null, viewInflate, R.layout.include_onboarding_stepper_view);
        this.f = includeOnboardingStepperViewBinding.y;
        this.g = includeOnboardingStepperViewBinding.A;
        this.h = includeOnboardingStepperViewBinding.C;
        this.i = includeOnboardingStepperViewBinding.z;
        this.j = includeOnboardingStepperViewBinding.B;
        this.k = includeOnboardingStepperViewBinding.D;
        addView(viewInflate);
    }

    public final void setStepperPresenter(@NotNull StepperContract.Presenter presenter) {
        Intrinsics.h(presenter, "<set-?>");
        this.stepperPresenter = presenter;
    }

    public final void setStepperStep(int step) {
        getStepperPresenter().b(step);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepperView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ StepperView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepperView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        if (isInEditMode() || this.e) {
            return;
        }
        this.e = true;
        ((StepperView_GeneratedInjector) t3()).e(this);
    }
}
