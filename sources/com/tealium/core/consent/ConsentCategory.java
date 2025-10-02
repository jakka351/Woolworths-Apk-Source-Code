package com.tealium.core.consent;

import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/consent/ConsentCategory;", "", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public enum ConsentCategory {
    AFFILIATES("affiliates"),
    ANALYTICS("analytics"),
    BIG_DATA("big_data"),
    CDP("cdp"),
    COOKIEMATCH("cookiematch"),
    CRM("crm"),
    DISPLAY_ADS("display_ads"),
    EMAIL(Scopes.EMAIL),
    ENGAGEMENT("engagement"),
    MOBILE("mobile"),
    MONITORING("monitoring"),
    PERSONALIZATION("personalization"),
    SEARCH("search"),
    SOCIAL("social"),
    MISC("misc");

    public static final Set e = ArraysKt.r0(values());
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/ConsentCategory$Companion;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static Set a(Set set) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String category = (String) it.next();
                Set set2 = ConsentCategory.e;
                Intrinsics.h(category, "category");
                Locale locale = Locale.ROOT;
                String strM = androidx.constraintlayout.core.state.a.m(locale, "ROOT", category, locale, "this as java.lang.String).toLowerCase(locale)");
                ConsentCategory consentCategory = ConsentCategory.AFFILIATES;
                String lowerCase = "affiliates".toLowerCase(locale);
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!strM.equals(lowerCase)) {
                    consentCategory = ConsentCategory.ANALYTICS;
                    String lowerCase2 = "analytics".toLowerCase(locale);
                    Intrinsics.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    if (!strM.equals(lowerCase2)) {
                        consentCategory = ConsentCategory.BIG_DATA;
                        String lowerCase3 = "big_data".toLowerCase(locale);
                        Intrinsics.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                        if (!strM.equals(lowerCase3)) {
                            consentCategory = ConsentCategory.CDP;
                            String lowerCase4 = "cdp".toLowerCase(locale);
                            Intrinsics.g(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                            if (!strM.equals(lowerCase4)) {
                                consentCategory = ConsentCategory.COOKIEMATCH;
                                String lowerCase5 = "cookiematch".toLowerCase(locale);
                                Intrinsics.g(lowerCase5, "this as java.lang.String).toLowerCase(locale)");
                                if (!strM.equals(lowerCase5)) {
                                    consentCategory = ConsentCategory.CRM;
                                    String lowerCase6 = "crm".toLowerCase(locale);
                                    Intrinsics.g(lowerCase6, "this as java.lang.String).toLowerCase(locale)");
                                    if (!strM.equals(lowerCase6)) {
                                        consentCategory = ConsentCategory.DISPLAY_ADS;
                                        String lowerCase7 = "display_ads".toLowerCase(locale);
                                        Intrinsics.g(lowerCase7, "this as java.lang.String).toLowerCase(locale)");
                                        if (!strM.equals(lowerCase7)) {
                                            consentCategory = ConsentCategory.EMAIL;
                                            String lowerCase8 = Scopes.EMAIL.toLowerCase(locale);
                                            Intrinsics.g(lowerCase8, "this as java.lang.String).toLowerCase(locale)");
                                            if (!strM.equals(lowerCase8)) {
                                                consentCategory = ConsentCategory.ENGAGEMENT;
                                                String lowerCase9 = "engagement".toLowerCase(locale);
                                                Intrinsics.g(lowerCase9, "this as java.lang.String).toLowerCase(locale)");
                                                if (!strM.equals(lowerCase9)) {
                                                    consentCategory = ConsentCategory.MOBILE;
                                                    String lowerCase10 = "mobile".toLowerCase(locale);
                                                    Intrinsics.g(lowerCase10, "this as java.lang.String).toLowerCase(locale)");
                                                    if (!strM.equals(lowerCase10)) {
                                                        consentCategory = ConsentCategory.MONITORING;
                                                        String lowerCase11 = "monitoring".toLowerCase(locale);
                                                        Intrinsics.g(lowerCase11, "this as java.lang.String).toLowerCase(locale)");
                                                        if (!strM.equals(lowerCase11)) {
                                                            consentCategory = ConsentCategory.PERSONALIZATION;
                                                            String lowerCase12 = "personalization".toLowerCase(locale);
                                                            Intrinsics.g(lowerCase12, "this as java.lang.String).toLowerCase(locale)");
                                                            if (!strM.equals(lowerCase12)) {
                                                                consentCategory = ConsentCategory.SEARCH;
                                                                String lowerCase13 = "search".toLowerCase(locale);
                                                                Intrinsics.g(lowerCase13, "this as java.lang.String).toLowerCase(locale)");
                                                                if (!strM.equals(lowerCase13)) {
                                                                    consentCategory = ConsentCategory.SOCIAL;
                                                                    String lowerCase14 = "social".toLowerCase(locale);
                                                                    Intrinsics.g(lowerCase14, "this as java.lang.String).toLowerCase(locale)");
                                                                    if (!strM.equals(lowerCase14)) {
                                                                        consentCategory = ConsentCategory.MISC;
                                                                        String lowerCase15 = "misc".toLowerCase(locale);
                                                                        Intrinsics.g(lowerCase15, "this as java.lang.String).toLowerCase(locale)");
                                                                        if (!strM.equals(lowerCase15)) {
                                                                            consentCategory = null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (consentCategory != null) {
                    arrayList.add(consentCategory);
                }
            }
            return CollectionsKt.L0(arrayList);
        }

        public static Set b() {
            return ConsentCategory.e;
        }
    }

    ConsentCategory(String str) {
        this.d = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
