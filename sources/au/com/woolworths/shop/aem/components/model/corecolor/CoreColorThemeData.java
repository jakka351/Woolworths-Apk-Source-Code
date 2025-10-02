package au.com.woolworths.shop.aem.components.model.corecolor;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/corecolor/CoreColorThemeData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreColorThemeData {

    /* renamed from: a, reason: collision with root package name */
    public final CompatibleColorData f10152a;
    public final CoreForegroundColorsData b;

    public CoreColorThemeData(CompatibleColorData compatibleColorData, CoreForegroundColorsData coreForegroundColorsData) {
        this.f10152a = compatibleColorData;
        this.b = coreForegroundColorsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreColorThemeData)) {
            return false;
        }
        CoreColorThemeData coreColorThemeData = (CoreColorThemeData) obj;
        return Intrinsics.c(this.f10152a, coreColorThemeData.f10152a) && Intrinsics.c(this.b, coreColorThemeData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10152a.f10151a.hashCode() * 31);
    }

    public final String toString() {
        return "CoreColorThemeData(background=" + this.f10152a + ", foreground=" + this.b + ")";
    }
}
