package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DynamicPageInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DynamicPageInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11363a;
    public final java.util.List b;
    public final java.util.List c;

    public DynamicPageInput(String pageId, java.util.List supportedLinks, java.util.List supportedActions) {
        Intrinsics.h(pageId, "pageId");
        Intrinsics.h(supportedLinks, "supportedLinks");
        Intrinsics.h(supportedActions, "supportedActions");
        this.f11363a = pageId;
        this.b = supportedLinks;
        this.c = supportedActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPageInput)) {
            return false;
        }
        DynamicPageInput dynamicPageInput = (DynamicPageInput) obj;
        return Intrinsics.c(this.f11363a, dynamicPageInput.f11363a) && Intrinsics.c(this.b, dynamicPageInput.b) && Intrinsics.c(this.c, dynamicPageInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.d(this.f11363a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.t(au.com.woolworths.android.onesite.a.s("DynamicPageInput(pageId=", this.f11363a, ", supportedLinks=", ", supportedActions=", this.b), this.c, ")");
    }
}
