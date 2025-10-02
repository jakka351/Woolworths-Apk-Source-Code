package au.com.woolworths.shop.aem.components.model.corecolor;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/corecolor/CoreForegroundColorsData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreForegroundColorsData {

    /* renamed from: a, reason: collision with root package name */
    public final CompatibleColorData f10153a;
    public final CompatibleColorData b;
    public final CompatibleColorData c;

    public CoreForegroundColorsData(CompatibleColorData compatibleColorData, CompatibleColorData compatibleColorData2, CompatibleColorData compatibleColorData3) {
        this.f10153a = compatibleColorData;
        this.b = compatibleColorData2;
        this.c = compatibleColorData3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreForegroundColorsData)) {
            return false;
        }
        CoreForegroundColorsData coreForegroundColorsData = (CoreForegroundColorsData) obj;
        return Intrinsics.c(this.f10153a, coreForegroundColorsData.f10153a) && Intrinsics.c(this.b, coreForegroundColorsData.b) && Intrinsics.c(this.c, coreForegroundColorsData.c);
    }

    public final int hashCode() {
        return this.c.f10151a.hashCode() + b.c(this.f10153a.f10151a.hashCode() * 31, 31, this.b.f10151a);
    }

    public final String toString() {
        return "CoreForegroundColorsData(primary=" + this.f10153a + ", secondary=" + this.b + ", highlight=" + this.c + ")";
    }
}
