package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/ScreenOptions;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4406a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ScreenOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f4406a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenOptions)) {
            return false;
        }
        ScreenOptions screenOptions = (ScreenOptions) obj;
        return this.f4406a == screenOptions.f4406a && this.b == screenOptions.b && this.c == screenOptions.c && this.d == screenOptions.d && this.e == screenOptions.e && this.f == screenOptions.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(Boolean.hashCode(this.f4406a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = androidx.camera.core.impl.b.v("ScreenOptions(showBarcodeScanner=", ", showBuyAgain=", ", showRecentSearches=", this.f4406a, this.b);
        au.com.woolworths.android.onesite.a.D(sbV, this.c, ", showVoiceProductSearch=", this.d, ", isProductFinder=");
        return au.com.woolworths.android.onesite.a.q(sbV, this.e, ", isAlternativeProductSearch=", this.f, ")");
    }
}
