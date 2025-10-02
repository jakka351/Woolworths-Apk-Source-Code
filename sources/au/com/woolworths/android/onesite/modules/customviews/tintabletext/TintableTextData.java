package au.com.woolworths.android.onesite.modules.customviews.tintabletext;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/tintabletext/TintableTextData;", "", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TintableTextData {

    /* renamed from: a, reason: collision with root package name */
    public final String f4322a;
    public final int b;
    public final int c;
    public final int d;

    public TintableTextData(int i, int i2, int i3, String str) {
        this.f4322a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TintableTextData)) {
            return false;
        }
        TintableTextData tintableTextData = (TintableTextData) obj;
        return this.f4322a.equals(tintableTextData.f4322a) && this.b == tintableTextData.b && this.c == tintableTextData.c && this.d == tintableTextData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + b.a(this.d, b.a(this.c, b.a(this.b, b.a(0, this.f4322a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return a.i(this.c, this.d, ", animatedIconRes=", ", isTextAllCaps=false)", b.u("TintableTextData(text=", this.b, this.f4322a, ", colorAttr=0, colorRes=", ", iconRes="));
    }
}
