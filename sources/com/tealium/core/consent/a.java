package com.tealium.core.consent;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/a;", "Lcom/tealium/core/consent/ConsentManagementPolicy;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class a implements ConsentManagementPolicy {

    /* renamed from: a, reason: collision with root package name */
    public UserConsentPreferences f19146a;
    public final ConsentExpiry b;
    public final boolean c;
    public final String d;

    public a(UserConsentPreferences userConsentPreferences) {
        this.f19146a = userConsentPreferences;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.b = new ConsentExpiry(395L);
        this.c = true;
        this.d = "set_dns_state";
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final boolean b() {
        return false;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final void c(UserConsentPreferences userConsentPreferences) {
        this.f19146a = userConsentPreferences;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final boolean d() {
        return false;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    /* renamed from: e, reason: from getter */
    public final ConsentExpiry getB() {
        return this.b;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final Map g() {
        return MapsKt.j(new Pair("policy", "ccpa"), new Pair("do_not_sell", Boolean.valueOf(this.f19146a.f19145a == ConsentStatus.CONSENTED)));
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final String h() {
        return this.f19146a.f19145a == ConsentStatus.CONSENTED ? "grant_full_consent" : "grant_partial_consent";
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    /* renamed from: i, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final boolean j() {
        return false;
    }
}
