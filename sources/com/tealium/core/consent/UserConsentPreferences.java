package com.tealium.core.consent;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/UserConsentPreferences;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class UserConsentPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final ConsentStatus f19145a;
    public final Set b;

    public UserConsentPreferences(ConsentStatus consentStatus, Set set) {
        this.f19145a = consentStatus;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentPreferences)) {
            return false;
        }
        UserConsentPreferences userConsentPreferences = (UserConsentPreferences) obj;
        return this.f19145a == userConsentPreferences.f19145a && Intrinsics.c(this.b, userConsentPreferences.b);
    }

    public final int hashCode() {
        int iHashCode = this.f19145a.hashCode() * 31;
        Set set = this.b;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        return "UserConsentPreferences(consentStatus=" + this.f19145a + ", consentCategories=" + this.b + ")";
    }
}
