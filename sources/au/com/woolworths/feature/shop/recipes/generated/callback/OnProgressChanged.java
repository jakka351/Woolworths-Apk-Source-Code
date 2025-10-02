package au.com.woolworths.feature.shop.recipes.generated.callback;

import android.widget.SeekBar;
import androidx.databinding.adapters.SeekBarBindingAdapter;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBindingImpl;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;

/* loaded from: classes3.dex */
public final class OnProgressChanged implements SeekBarBindingAdapter.OnProgressChanged {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityFreshmagContentBindingImpl f8065a;

    public interface Listener {
    }

    public OnProgressChanged(ActivityFreshmagContentBindingImpl activityFreshmagContentBindingImpl) {
        this.f8065a = activityFreshmagContentBindingImpl;
    }

    @Override // androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        FreshMagContentViewModel freshMagContentViewModel = this.f8065a.E;
        if (freshMagContentViewModel != null) {
            freshMagContentViewModel.r6(i);
        }
    }
}
