package au.com.woolworths.feature.shop.bundles.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.corecolortheme.TextColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/TitleTagData;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TitleTagData {

    /* renamed from: a, reason: collision with root package name */
    public final String f6769a;
    public final TextColor b;

    public TitleTagData(String str, TextColor textColor) {
        this.f6769a = str;
        this.b = textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleTagData)) {
            return false;
        }
        TitleTagData titleTagData = (TitleTagData) obj;
        return Intrinsics.c(this.f6769a, titleTagData.f6769a) && Intrinsics.c(this.b, titleTagData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6769a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleTagData(text=" + this.f6769a + ", textColor=" + this.b + ")";
    }
}
