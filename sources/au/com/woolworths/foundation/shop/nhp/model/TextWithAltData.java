package au.com.woolworths.foundation.shop.nhp.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/TextWithAltData;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TextWithAltData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8778a;
    public final String b;

    public TextWithAltData(String text, String altText) {
        Intrinsics.h(text, "text");
        Intrinsics.h(altText, "altText");
        this.f8778a = text;
        this.b = altText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithAltData)) {
            return false;
        }
        TextWithAltData textWithAltData = (TextWithAltData) obj;
        return Intrinsics.c(this.f8778a, textWithAltData.f8778a) && Intrinsics.c(this.b, textWithAltData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8778a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("TextWithAltData(text=", this.f8778a, ", altText=", this.b, ")");
    }
}
