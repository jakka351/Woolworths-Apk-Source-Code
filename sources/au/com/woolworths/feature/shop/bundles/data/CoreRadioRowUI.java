package au.com.woolworths.feature.shop.bundles.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/CoreRadioRowUI;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CoreRadioRowUI {

    /* renamed from: a, reason: collision with root package name */
    public final String f6768a;
    public final String b;
    public final boolean c;

    public CoreRadioRowUI(String str, String str2, boolean z) {
        this.f6768a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreRadioRowUI)) {
            return false;
        }
        CoreRadioRowUI coreRadioRowUI = (CoreRadioRowUI) obj;
        return Intrinsics.c(this.f6768a, coreRadioRowUI.f6768a) && Intrinsics.c(this.b, coreRadioRowUI.b) && this.c == coreRadioRowUI.c;
    }

    public final int hashCode() {
        String str = this.f6768a;
        return Boolean.hashCode(this.c) + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return a.k(")", a.v("CoreRadioRowUI(description=", this.f6768a, ", label=", this.b, ", isSelected="), this.c);
    }
}
