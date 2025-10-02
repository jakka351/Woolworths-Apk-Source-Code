package com.tealium.core.consent;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/ConsentPolicy;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class ConsentPolicy {
    public static final /* synthetic */ ConsentPolicy[] d = {new ConsentPolicy() { // from class: com.tealium.core.consent.ConsentPolicy.c
        @Override // com.tealium.core.consent.ConsentPolicy
        public final ConsentManagementPolicy a(UserConsentPreferences userConsentPreferences) {
            return new GdprConsentManagementPolicy(userConsentPreferences);
        }
    }, new ConsentPolicy() { // from class: com.tealium.core.consent.ConsentPolicy.a
        @Override // com.tealium.core.consent.ConsentPolicy
        public final ConsentManagementPolicy a(UserConsentPreferences userConsentPreferences) {
            return new com.tealium.core.consent.a(userConsentPreferences);
        }
    }, new ConsentPolicy() { // from class: com.tealium.core.consent.ConsentPolicy.b
        @Override // com.tealium.core.consent.ConsentPolicy
        public final ConsentManagementPolicy a(UserConsentPreferences userConsentPreferences) throws Exception {
            throw new Exception("Custom policy must have a ConsentManagementPolicy assigned. Ensure you have set one using setCustomPolicy(..)");
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    ConsentPolicy EF2;

    public static ConsentPolicy valueOf(String str) {
        return (ConsentPolicy) Enum.valueOf(ConsentPolicy.class, str);
    }

    public static ConsentPolicy[] values() {
        return (ConsentPolicy[]) d.clone();
    }

    public abstract ConsentManagementPolicy a(UserConsentPreferences userConsentPreferences);
}
