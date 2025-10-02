package au.com.woolworths.marketing.data;

import YU.a;
import au.com.woolworths.marketing.SwrveUserProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/marketing/data/ShoppingModeSwrveUserProp;", "Lau/com/woolworths/marketing/SwrveUserProperty;", "marketing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShoppingModeSwrveUserProp implements SwrveUserProperty {

    /* renamed from: a, reason: collision with root package name */
    public final String f9051a;

    public ShoppingModeSwrveUserProp(String modeLabel) {
        Intrinsics.h(modeLabel, "modeLabel");
        this.f9051a = modeLabel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingModeSwrveUserProp) && Intrinsics.c(this.f9051a, ((ShoppingModeSwrveUserProp) obj).f9051a);
    }

    @Override // au.com.woolworths.marketing.SwrveUserProperty
    public final String getKey() {
        return "shopping_mode";
    }

    @Override // au.com.woolworths.marketing.SwrveUserProperty
    /* renamed from: getValue, reason: from getter */
    public final String getF9051a() {
        return this.f9051a;
    }

    public final int hashCode() {
        return this.f9051a.hashCode();
    }

    public final String toString() {
        return a.h("ShoppingModeSwrveUserProp(modeLabel=", this.f9051a, ")");
    }
}
