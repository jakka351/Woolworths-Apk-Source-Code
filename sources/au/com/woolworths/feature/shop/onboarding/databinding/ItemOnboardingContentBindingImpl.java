package au.com.woolworths.feature.shop.onboarding.databinding;

import android.util.SparseIntArray;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.onboarding.data.OnboardingCarouselData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ItemOnboardingContentBindingImpl extends ItemOnboardingContentBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.message_start_guideline, 4);
        sparseIntArray.put(R.id.message_end_guideline, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (148 != i) {
            return false;
        }
        L((OnboardingCarouselData) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.onboarding.databinding.ItemOnboardingContentBinding
    public final void L(OnboardingCarouselData onboardingCarouselData) throws Throwable {
        this.B = onboardingCarouselData;
        synchronized (this) {
            this.D |= 1;
        }
        h(148);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int g;
        int i;
        int h;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        OnboardingCarouselData onboardingCarouselData = this.B;
        long j2 = j & 3;
        if (j2 == 0 || onboardingCarouselData == null) {
            g = 0;
            i = 0;
            h = 0;
        } else {
            g = onboardingCarouselData.getG();
            i = onboardingCarouselData.getI();
            h = onboardingCarouselData.getH();
        }
        if (j2 != 0) {
            this.y.setText(i);
            BindingAdaptersKt.m(this.z, g, null);
            this.A.setText(h);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
