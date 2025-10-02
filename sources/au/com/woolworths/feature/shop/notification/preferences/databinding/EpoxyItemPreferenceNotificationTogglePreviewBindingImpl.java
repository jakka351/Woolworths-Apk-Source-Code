package au.com.woolworths.feature.shop.notification.preferences.databinding;

import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.notification.preferences.controller.NotificationBadgeLabel;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewContentData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewImageItemData;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemPreferenceNotificationTogglePreviewBindingImpl extends EpoxyItemPreferenceNotificationTogglePreviewBinding {
    public static final ViewDataBinding.IncludedLayouts E;
    public long D;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        E = includedLayouts;
        includedLayouts.a(0, new int[]{3}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (104 == i) {
            this.C = (PreviewImageItemData) obj;
            synchronized (this) {
                this.D |= 2;
            }
            h(104);
            y();
            return true;
        }
        if (200 != i) {
            return false;
        }
        this.B = (PreviewContentData) obj;
        synchronized (this) {
            this.D |= 4;
        }
        h(200);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String altText;
        String imageUrl;
        boolean z;
        String str;
        String badge;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        PreviewImageItemData previewImageItemData = this.C;
        PreviewContentData previewContentData = this.B;
        long j2 = 10 & j;
        NotificationBadgeLabel notificationBadgeLabel = null;
        String footer = null;
        if (j2 == 0 || previewImageItemData == null) {
            altText = null;
            imageUrl = null;
        } else {
            imageUrl = previewImageItemData.getImageUrl();
            altText = previewImageItemData.getAltText();
        }
        long j3 = j & 12;
        if (j3 != 0) {
            if (previewContentData != null) {
                footer = previewContentData.getFooter();
                badge = previewContentData.getBadge();
            } else {
                badge = null;
            }
            z = footer != null;
            NotificationBadgeLabel notificationBadgeLabel2 = new NotificationBadgeLabel(badge == null ? "" : badge);
            z = badge != null;
            str = footer;
            notificationBadgeLabel = notificationBadgeLabel2;
        } else {
            z = false;
            str = null;
        }
        if (j3 != 0) {
            BindingAdaptersKt.o(this.y.h, z);
            this.y.L(notificationBadgeLabel);
            TextViewBindingAdapter.b(this.z, str);
            BindingAdaptersKt.o(this.z, z);
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.A.setContentDescription(altText);
            }
            ImageView imageView = this.A;
            BindingAdaptersKt.f(imageView, imageUrl, AppCompatResources.b(R.drawable.ic_notification_preview, imageView.getContext()));
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }
}
