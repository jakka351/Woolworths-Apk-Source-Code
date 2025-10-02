package com.tealium.core.consent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/GdprConsentManagementPolicy;", "Lcom/tealium/core/consent/ConsentManagementPolicy;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class GdprConsentManagementPolicy implements ConsentManagementPolicy {

    /* renamed from: a, reason: collision with root package name */
    public UserConsentPreferences f19143a;
    public final ConsentExpiry b;
    public final boolean c;
    public final String d;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19144a;

        static {
            int[] iArr = new int[ConsentStatus.values().length];
            iArr[1] = 1;
            f19144a = iArr;
        }
    }

    public GdprConsentManagementPolicy(UserConsentPreferences userConsentPreferences) {
        this.f19143a = userConsentPreferences;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.b = new ConsentExpiry(365L);
        this.c = true;
        this.d = "update_consent_cookie";
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final boolean b() {
        return this.f19143a.f19145a == ConsentStatus.UNKNOWN;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final void c(UserConsentPreferences userConsentPreferences) {
        this.f19143a = userConsentPreferences;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final boolean d() {
        return true;
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
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("policy", "gdpr"), new Pair("consent_status", this.f19143a.f19145a.d));
        Set set = this.f19143a.b;
        if (set != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.s(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConsentCategory) it.next()).d);
            }
            linkedHashMapL.put("consent_categories", arrayList);
        }
        return linkedHashMapL;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final String h() {
        if (WhenMappings.f19144a[this.f19143a.f19145a.ordinal()] != 1) {
            return "decline_consent";
        }
        Set set = this.f19143a.b;
        if (set != null) {
            int size = set.size();
            Set set2 = ConsentCategory.e;
            if (size == ConsentCategory.e.size()) {
                return "grant_full_consent";
            }
        }
        return "grant_partial_consent";
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    /* renamed from: i, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // com.tealium.core.consent.ConsentManagementPolicy
    public final boolean j() {
        return this.f19143a.f19145a == ConsentStatus.NOT_CONSENTED;
    }
}
