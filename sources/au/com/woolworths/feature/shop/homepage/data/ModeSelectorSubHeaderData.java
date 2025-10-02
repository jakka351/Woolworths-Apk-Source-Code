package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/ModeSelectorSubHeaderData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModeSelectorSubHeaderData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7200a;
    public final HomeModeSelectorContainerData b;
    public final Text c;
    public final Text d;
    public final Text e;
    public final CollectionMode f;
    public final boolean g;

    public ModeSelectorSubHeaderData(boolean z, HomeModeSelectorContainerData homeModeSelectorContainerData, Text text, ResText resText, PlainText plainText, CollectionMode collectionMode) {
        Intrinsics.h(collectionMode, "collectionMode");
        this.f7200a = z;
        this.b = homeModeSelectorContainerData;
        this.c = text;
        this.d = resText;
        this.e = plainText;
        this.f = collectionMode;
        this.g = (homeModeSelectorContainerData == null && text == null && plainText == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeSelectorSubHeaderData)) {
            return false;
        }
        ModeSelectorSubHeaderData modeSelectorSubHeaderData = (ModeSelectorSubHeaderData) obj;
        return this.f7200a == modeSelectorSubHeaderData.f7200a && Intrinsics.c(this.b, modeSelectorSubHeaderData.b) && Intrinsics.c(this.c, modeSelectorSubHeaderData.c) && Intrinsics.c(this.d, modeSelectorSubHeaderData.d) && Intrinsics.c(this.e, modeSelectorSubHeaderData.e) && Intrinsics.c(this.f, modeSelectorSubHeaderData.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f7200a) * 31;
        HomeModeSelectorContainerData homeModeSelectorContainerData = this.b;
        int iHashCode2 = (iHashCode + (homeModeSelectorContainerData == null ? 0 : homeModeSelectorContainerData.hashCode())) * 31;
        Text text = this.c;
        int iHashCode3 = (iHashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        int iHashCode4 = (iHashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (text3 != null ? text3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ModeSelectorSubHeaderData(guestMode=" + this.f7200a + ", containerData=" + this.b + ", modeTitle=" + this.c + ", modeTitlePrefix=" + this.d + ", modeSubtitle=" + this.e + ", collectionMode=" + this.f + ")";
    }
}
