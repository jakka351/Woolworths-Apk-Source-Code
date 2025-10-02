package au.com.woolworths.feature.shop.notification.preferences.controller;

import YU.a;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/controller/NotificationBadgeLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationBadgeLabel implements BrandLabel {
    public final String d;
    public final PlainText e;
    public final NotificationLabelType f = new NotificationLabelType();

    public NotificationBadgeLabel(String str) {
        this.d = str;
        this.e = new PlainText(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationBadgeLabel) && Intrinsics.c(this.d, ((NotificationBadgeLabel) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Caption_Medium;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return this.f;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.h("NotificationBadgeLabel(labelText=", this.d, ")");
    }
}
