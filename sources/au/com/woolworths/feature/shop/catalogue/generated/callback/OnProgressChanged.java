package au.com.woolworths.feature.shop.catalogue.generated.callback;

import android.widget.SeekBar;
import androidx.databinding.adapters.SeekBarBindingAdapter;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel;

/* loaded from: classes3.dex */
public final class OnProgressChanged implements SeekBarBindingAdapter.OnProgressChanged {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityCatalogueDetailsBindingImpl f6834a;

    public interface Listener {
    }

    public OnProgressChanged(ActivityCatalogueDetailsBindingImpl activityCatalogueDetailsBindingImpl) {
        this.f6834a = activityCatalogueDetailsBindingImpl;
    }

    @Override // androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        CatalogueDetailsViewModel catalogueDetailsViewModel = this.f6834a.F;
        if (catalogueDetailsViewModel != null) {
            catalogueDetailsViewModel.r6(i);
        }
    }
}
