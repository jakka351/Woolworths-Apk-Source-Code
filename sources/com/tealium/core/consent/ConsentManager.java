package com.tealium.core.consent;

import android.content.SharedPreferences;
import com.tealium.core.Collector;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.TealiumContext;
import com.tealium.core.consent.ConsentCategory;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.messaging.c;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.core.validation.DispatchValidator;
import com.tealium.dispatcher.TealiumEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/consent/ConsentManager;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/validation/DispatchValidator;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ConsentManager implements Collector, DispatchValidator, LibrarySettingsUpdatedListener {

    @NotNull
    public static final String MODULE_VERSION = "1.6.0";

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19141a;
    public final c b;
    public final String c;
    public boolean d;
    public final String e;
    public final b f;
    public final ConsentManagementPolicy g;
    public final ConsentExpiry h;
    public final boolean i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tealium/core/consent/ConsentManager$Companion;", "", "", "MODULE_NAME", "Ljava/lang/String;", "MODULE_VERSION", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19142a;

        static {
            int[] iArr = new int[ConsentStatus.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[0] = 3;
            f19142a = iArr;
        }
    }

    public ConsentManager(TealiumContext tealiumContext, c cVar, LibrarySettings librarySettings) {
        Set setA;
        ConsentManagementPolicy consentManagementPolicyA;
        TealiumConfig tealiumConfig = tealiumContext.f19130a;
        Object obj = tealiumConfig.k.get("consent_manager_policy");
        ConsentPolicy consentPolicy = obj instanceof ConsentPolicy ? (ConsentPolicy) obj : null;
        Intrinsics.h(librarySettings, "librarySettings");
        this.f19141a = tealiumContext;
        this.b = cVar;
        this.c = "ConsentManager";
        LinkedHashMap linkedHashMap = tealiumConfig.k;
        Object obj2 = linkedHashMap.get("consent_manager_enabled");
        Boolean boolValueOf = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (boolValueOf == null) {
            Object obj3 = linkedHashMap.get("consent_manager_policy");
            boolValueOf = Boolean.valueOf((obj3 instanceof ConsentPolicy ? (ConsentPolicy) obj3 : null) != null);
        }
        this.d = boolValueOf.booleanValue();
        Object obj4 = linkedHashMap.get("override_consent_categories_key");
        this.e = obj4 instanceof String ? (String) obj4 : null;
        b bVar = new b(tealiumConfig);
        this.f = bVar;
        if (consentPolicy != null) {
            try {
                ConsentStatus consentStatusA = bVar.a();
                Set<String> stringSet = bVar.f19147a.getStringSet("categories", null);
                if (stringSet != null) {
                    Set set = ConsentCategory.e;
                    setA = ConsentCategory.Companion.a(CollectionsKt.L0(CollectionsKt.B(stringSet)));
                } else {
                    setA = null;
                }
                consentManagementPolicyA = consentPolicy.a(new UserConsentPreferences(consentStatusA, setA));
            } catch (Exception e) {
                Logger.f19124a.h("Tealium-1.6.0", "Error creating ConsentPolicy: " + e.getMessage());
            }
        } else {
            consentManagementPolicyA = null;
        }
        this.g = consentManagementPolicyA;
        Object obj5 = this.f19141a.f19130a.k.get("consent_expiry");
        ConsentExpiry b = obj5 instanceof ConsentExpiry ? (ConsentExpiry) obj5 : null;
        if (b == null) {
            b = consentManagementPolicyA != null ? consentManagementPolicyA.getB() : null;
            if (b == null) {
                TimeUnit timeUnit = TimeUnit.DAYS;
                b = new ConsentExpiry(365L);
            }
        }
        this.h = b;
        E();
        Object obj6 = this.f19141a.f19130a.k.get("consent_manager_logging_enabled");
        Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        this.i = bool != null ? bool.booleanValue() : false;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getE() {
        return this.d;
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
    }

    public final void E() {
        b bVar = this.f;
        long j = bVar.f19147a.getLong("last_updated", 0L);
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConsentExpiry consentExpiry = this.h;
        consentExpiry.getClass();
        if (j < jCurrentTimeMillis - TimeUnit.DAYS.toMillis(consentExpiry.f19140a)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            bVar.getClass();
            bVar.f19147a.edit().putLong("last_updated", jCurrentTimeMillis2).apply();
            int i = WhenMappings.f19142a[0];
            if (i == 1) {
                Set set = ConsentCategory.e;
                F(ConsentCategory.Companion.b());
            } else if (i == 2) {
                F(null);
            } else {
                if (i != 3) {
                    return;
                }
                F(null);
            }
        }
    }

    public final void F(Set set) {
        Set setA;
        b bVar = this.f;
        ConsentStatus consentStatusA = bVar.a();
        SharedPreferences sharedPreferences = bVar.f19147a;
        Unit unit = null;
        ConsentStatus consentStatus = ConsentStatus.UNKNOWN;
        if (consentStatusA == consentStatus) {
            Set<String> stringSet = sharedPreferences.getStringSet("categories", null);
            if (stringSet != null) {
                Set set2 = ConsentCategory.e;
                setA = ConsentCategory.Companion.a(CollectionsKt.L0(CollectionsKt.B(stringSet)));
            } else {
                setA = null;
            }
            if (Intrinsics.c(setA, set)) {
                return;
            }
        }
        bVar.b = consentStatus;
        sharedPreferences.edit().putString("status", bVar.b.d).apply();
        bVar.c = set;
        if (set != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConsentCategory) it.next()).getD());
            }
            editorEdit.putStringSet("categories", CollectionsKt.L0(arrayList)).apply();
            unit = Unit.f24250a;
        }
        if (unit == null) {
            sharedPreferences.edit().remove("categories").apply();
        }
        ConsentManagementPolicy consentManagementPolicy = this.g;
        if (consentManagementPolicy != null) {
            UserConsentPreferences userConsentPreferences = new UserConsentPreferences(consentStatus, set);
            consentManagementPolicy.c(userConsentPreferences);
            this.b.n(userConsentPreferences, consentManagementPolicy);
            if (this.i && consentManagementPolicy.d()) {
                this.f19141a.a(new TealiumEvent(consentManagementPolicy.h(), consentManagementPolicy.g()));
            }
        }
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean b() {
        E();
        ConsentManagementPolicy consentManagementPolicy = this.g;
        if (consentManagementPolicy != null) {
            return consentManagementPolicy.b();
        }
        return false;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName, reason: from getter */
    public final String getD() {
        return this.c;
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        LinkedHashMap linkedHashMap;
        ConsentManagementPolicy consentManagementPolicy;
        b bVar = this.f;
        if (bVar.a() == ConsentStatus.UNKNOWN || (consentManagementPolicy = this.g) == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            Map mapG = consentManagementPolicy.g();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(mapG.size()));
            for (Map.Entry entry : mapG.entrySet()) {
                String str = "consent_categories";
                if (Intrinsics.c(entry.getKey(), "consent_categories")) {
                    String str2 = this.e;
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    str = (String) entry.getKey();
                }
                linkedHashMap2.put(str, entry.getValue());
            }
            linkedHashMap = MapsKt.s(linkedHashMap2);
        }
        linkedHashMap.put("consent_last_updated", new Long(bVar.f19147a.getLong("last_updated", 0L)));
        return linkedHashMap;
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.d = z;
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean y(com.tealium.dispatcher.a aVar) {
        ConsentManagementPolicy consentManagementPolicy = this.g;
        if (consentManagementPolicy != null) {
            return consentManagementPolicy.j();
        }
        return false;
    }
}
