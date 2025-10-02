package au.com.woolworths.feature.shop.homepage.presentation.modeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/modeselector/MockPreviewData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MockPreviewData {

    /* renamed from: a, reason: collision with root package name */
    public final HomeModeSelectorContainerData f7250a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final CollectionMode f;

    public MockPreviewData(HomeModeSelectorContainerData homeModeSelectorContainerData, String str, String str2, CollectionMode collectionMode, int i) {
        boolean z = (i & 2) == 0;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        collectionMode = (i & 32) != 0 ? CollectionMode.PickUp.d : collectionMode;
        Intrinsics.h(collectionMode, "collectionMode");
        this.f7250a = homeModeSelectorContainerData;
        this.b = z;
        this.c = str;
        this.d = null;
        this.e = str2;
        this.f = collectionMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MockPreviewData)) {
            return false;
        }
        MockPreviewData mockPreviewData = (MockPreviewData) obj;
        return Intrinsics.c(this.f7250a, mockPreviewData.f7250a) && this.b == mockPreviewData.b && Intrinsics.c(this.c, mockPreviewData.c) && Intrinsics.c(this.d, mockPreviewData.d) && Intrinsics.c(this.e, mockPreviewData.e) && Intrinsics.c(this.f, mockPreviewData.f);
    }

    public final int hashCode() {
        HomeModeSelectorContainerData homeModeSelectorContainerData = this.f7250a;
        int iE = androidx.camera.core.impl.b.e((homeModeSelectorContainerData == null ? 0 : homeModeSelectorContainerData.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MockPreviewData(data=");
        sb.append(this.f7250a);
        sb.append(", guestMode=");
        sb.append(this.b);
        sb.append(", modeTitle=");
        androidx.constraintlayout.core.state.a.B(sb, this.c, ", modeTitlePrefix=", this.d, ", modeSubtitle=");
        sb.append(this.e);
        sb.append(", collectionMode=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
