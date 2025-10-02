package au.com.woolworths.feature.shop.notification.preferences.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewContentData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewImageItemData;

/* loaded from: classes3.dex */
public abstract class EpoxyItemPreferenceNotificationTogglePreviewBinding extends ViewDataBinding {
    public final ImageView A;
    public PreviewContentData B;
    public PreviewImageItemData C;
    public final IncludeBrandLabelBinding y;
    public final TextView z;

    public EpoxyItemPreferenceNotificationTogglePreviewBinding(DataBindingComponent dataBindingComponent, View view, IncludeBrandLabelBinding includeBrandLabelBinding, TextView textView, ImageView imageView) {
        super(dataBindingComponent, view, 1);
        this.y = includeBrandLabelBinding;
        this.z = textView;
        this.A = imageView;
    }
}
