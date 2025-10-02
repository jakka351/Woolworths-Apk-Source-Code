package au.com.woolworths.shop.graphql.type;

import YU.a;
import au.com.woolworths.shop.graphql.type.AppOS;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ConfigInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfigInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11277a;
    public final String b;

    public ConfigInput(String appVersion, String osVersion) {
        AppOS.Companion companion = AppOS.e;
        Intrinsics.h(appVersion, "appVersion");
        Intrinsics.h(osVersion, "osVersion");
        this.f11277a = appVersion;
        this.b = osVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigInput)) {
            return false;
        }
        ConfigInput configInput = (ConfigInput) obj;
        if (!Intrinsics.c(this.f11277a, configInput.f11277a)) {
            return false;
        }
        AppOS.Companion companion = AppOS.e;
        return Intrinsics.c(this.b, configInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((AppOS.f.hashCode() + (this.f11277a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        AppOS appOS = AppOS.f;
        StringBuilder sb = new StringBuilder("ConfigInput(appVersion=");
        sb.append(this.f11277a);
        sb.append(", platform=");
        sb.append(appOS);
        sb.append(", osVersion=");
        return a.o(sb, this.b, ")");
    }
}
