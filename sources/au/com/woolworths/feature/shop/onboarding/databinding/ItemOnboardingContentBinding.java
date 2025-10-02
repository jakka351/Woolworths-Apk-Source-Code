package au.com.woolworths.feature.shop.onboarding.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData;

/* loaded from: classes3.dex */
public abstract class ItemOnboardingContentBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final TextView A;
    public OnboardingCarouselData B;
    public final TextView y;
    public final ImageView z;

    public ItemOnboardingContentBinding(View view, ImageView imageView, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = textView2;
    }

    public abstract void L(OnboardingCarouselData onboardingCarouselData);
}
