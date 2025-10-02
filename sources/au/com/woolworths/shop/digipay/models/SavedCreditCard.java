package au.com.woolworths.shop.digipay.models;

import YU.a;
import androidx.camera.core.impl.b;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/models/SavedCreditCard;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SavedCreditCard {

    /* renamed from: a, reason: collision with root package name */
    public final String f10922a;
    public final String b;
    public final String c;
    public final URL d;
    public final boolean e;
    public final CreditCardImage f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public SavedCreditCard(String str, String str2, String str3, URL url, boolean z, CreditCardImage image, boolean z2, boolean z3, boolean z4) {
        Intrinsics.h(image, "image");
        this.f10922a = str;
        this.b = str2;
        this.c = str3;
        this.d = url;
        this.e = z;
        this.f = image;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static SavedCreditCard a(SavedCreditCard savedCreditCard, boolean z, boolean z2, boolean z3, int i) {
        String str = savedCreditCard.f10922a;
        String str2 = savedCreditCard.b;
        String str3 = savedCreditCard.c;
        URL url = savedCreditCard.d;
        if ((i & 16) != 0) {
            z = savedCreditCard.e;
        }
        boolean z4 = z;
        CreditCardImage image = savedCreditCard.f;
        boolean z5 = savedCreditCard.g;
        if ((i & 128) != 0) {
            z2 = savedCreditCard.h;
        }
        boolean z6 = z2;
        if ((i & 256) != 0) {
            z3 = savedCreditCard.i;
        }
        savedCreditCard.getClass();
        Intrinsics.h(image, "image");
        return new SavedCreditCard(str, str2, str3, url, z4, image, z5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedCreditCard)) {
            return false;
        }
        SavedCreditCard savedCreditCard = (SavedCreditCard) obj;
        return Intrinsics.c(this.f10922a, savedCreditCard.f10922a) && Intrinsics.c(this.b, savedCreditCard.b) && Intrinsics.c(this.c, savedCreditCard.c) && Intrinsics.c(this.d, savedCreditCard.d) && this.e == savedCreditCard.e && this.f == savedCreditCard.f && this.g == savedCreditCard.g && this.h == savedCreditCard.h && this.i == savedCreditCard.i;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f10922a.hashCode() * 31, 31, this.b), 31, this.c);
        URL url = this.d;
        return Boolean.hashCode(this.i) + b.e(b.e((this.f.hashCode() + b.e((iC + (url == null ? 0 : url.hashCode())) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbV = a.v("SavedCreditCard(instrumentId=", this.f10922a, ", cardNumberLabel=", this.b, ", expiryLabel=");
        sbV.append(this.c);
        sbV.append(", cvvStepUpUrl=");
        sbV.append(this.d);
        sbV.append(", isSelected=");
        sbV.append(this.e);
        sbV.append(", image=");
        sbV.append(this.f);
        sbV.append(", isAllowed=");
        au.com.woolworths.android.onesite.a.D(sbV, this.g, ", isCvvStepUpViewLoaded=", this.h, ", isManageCardMode=");
        return a.k(")", sbV, this.i);
    }
}
