package au.com.woolworths.feature.shop.catalogue.databinding;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public final class ItemCatalogueHomeSpecialsCardBinding implements ViewBinding {
    public final MaterialCardView d;
    public final ProgressBar e;
    public final ImageView f;
    public final TextView g;

    public ItemCatalogueHomeSpecialsCardBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ProgressBar progressBar, ImageView imageView, TextView textView) {
        this.d = materialCardView;
        this.e = progressBar;
        this.f = imageView;
        this.g = textView;
    }
}
