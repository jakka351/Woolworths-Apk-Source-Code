package au.com.woolworths.feature.shop.weblink.model;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/model/WebLink;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WebLink {

    /* renamed from: a, reason: collision with root package name */
    public final String f8260a;
    public final String b;
    public final Map c;
    public final List d;

    public WebLink(String str, String str2, Map map, List list) {
        this.f8260a = str;
        this.b = str2;
        this.c = map;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static WebLink a(WebLink webLink, LinkedHashMap linkedHashMap, ListBuilder listBuilder, int i) {
        String str = webLink.f8260a;
        String str2 = webLink.b;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i & 4) != 0) {
            linkedHashMap2 = webLink.c;
        }
        ListBuilder cookies = listBuilder;
        if ((i & 8) != 0) {
            cookies = webLink.d;
        }
        Intrinsics.h(cookies, "cookies");
        return new WebLink(str, str2, linkedHashMap2, cookies);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebLink)) {
            return false;
        }
        WebLink webLink = (WebLink) obj;
        return Intrinsics.c(this.f8260a, webLink.f8260a) && Intrinsics.c(this.b, webLink.b) && Intrinsics.c(this.c, webLink.c) && Intrinsics.c(this.d, webLink.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.d(this.c, b.c(this.f8260a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("WebLink(title=", this.f8260a, ", url=", this.b, ", headers=");
        sbV.append(this.c);
        sbV.append(", cookies=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
