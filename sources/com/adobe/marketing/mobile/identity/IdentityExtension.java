package com.adobe.marketing.mobile.identity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import au.com.woolworths.feature.product.list.legacy.k;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.Extension;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.MobilePrivacyStatus;
import com.adobe.marketing.mobile.VisitorID;
import com.adobe.marketing.mobile.internal.util.UrlEncoder;
import com.adobe.marketing.mobile.internal.util.VisitorIDSerializer;
import com.adobe.marketing.mobile.services.HitQueuing;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NamedCollection;
import com.adobe.marketing.mobile.services.NetworkRequest;
import com.adobe.marketing.mobile.services.NetworkService;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.util.DataReader;
import com.adobe.marketing.mobile.util.StringUtils;
import com.adobe.marketing.mobile.util.URLBuilder;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.salesforce.marketingcloud.UrlHandler;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class IdentityExtension extends Extension {
    public static final Object p = new Object();
    public HitQueuing b;
    public ConfigurationSharedStateIdentity c;
    public final NamedCollection d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public long j;
    public long k;
    public List l;
    public MobilePrivacyStatus m;
    public boolean n;
    public boolean o;

    public IdentityExtension(@NonNull ExtensionApi extensionApi) {
        this(extensionApi, ServiceProvider.a().d.a("visitorIDServiceDataStore"), null);
    }

    public static String h(String str, String str2, String str3) {
        if (StringUtils.a(str2) || StringUtils.a(str3)) {
            return str;
        }
        String strO = androidx.camera.core.impl.b.o(str2, "=", str3);
        return StringUtils.a(str) ? strO : androidx.camera.core.impl.b.o(str, lllqqql.c0063ccc0063c, strO);
    }

    public static ArrayList j(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (StringUtils.a(((VisitorID) it.next()).b)) {
                    it.remove();
                    Log.c();
                }
            }
        } catch (ClassCastException e) {
            Log.b("Identity", "IdentityExtension", "cleanupVisitorIdentifiers : Caught ClassCastException while iterating through visitor identifiers: %s", e.getLocalizedMessage());
        } catch (NullPointerException e2) {
            Log.b("Identity", "IdentityExtension", "cleanupVisitorIdentifiers : Caught NullPointerException while iterating through visitor identifiers: %s", e2.getLocalizedMessage());
        }
        return arrayList;
    }

    public static String l() {
        UUID uuidRandomUUID = UUID.randomUUID();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        Locale locale = Locale.US;
        if (mostSignificantBits < 0) {
            mostSignificantBits = -mostSignificantBits;
        }
        Long lValueOf = Long.valueOf(mostSignificantBits);
        if (leastSignificantBits < 0) {
            leastSignificantBits = -leastSignificantBits;
        }
        String str = String.format(locale, "%019d%019d", lValueOf, Long.valueOf(leastSignificantBits));
        Log.c();
        return str;
    }

    public static void u(NamedCollection namedCollection, String str, String str2) {
        if (StringUtils.a(str2)) {
            namedCollection.remove(str);
        } else {
            namedCollection.setString(str, str2);
        }
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String a() {
        return "Identity";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String c() {
        return "com.adobe.module.identity";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String d() {
        return "3.0.2";
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128 A[EDGE_INSN: B:88:0x0128->B:46:0x0128 BREAK  A[LOOP:1: B:31:0x0103->B:92:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[LOOP:1: B:31:0x0103->B:92:?, LOOP_END, SYNTHETIC] */
    @Override // com.adobe.marketing.mobile.Extension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.identity.IdentityExtension.e():void");
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final void f() {
        this.b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    @Override // com.adobe.marketing.mobile.Extension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.adobe.marketing.mobile.Event r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.identity.IdentityExtension.g(com.adobe.marketing.mobile.Event):boolean");
    }

    public final void i(boolean z) {
        synchronized (p) {
            try {
                NamedCollection namedCollection = this.d;
                if (namedCollection != null) {
                    namedCollection.setBoolean("ADOBEMOBILE_PUSH_ENABLED", z);
                    "setPushStatus : Push notifications status is now: ".concat(z ? "Enabled" : "Disabled");
                    Log.c();
                } else {
                    Log.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map = new HashMap();
        map.put("a.push.optin", String.valueOf(z));
        HashMap map2 = new HashMap();
        map2.put(UrlHandler.ACTION, "Push");
        map2.put("contextdata", map);
        map2.put("trackinternal", Boolean.TRUE);
        Event.Builder builder = new Event.Builder("AnalyticsForIdentityRequest", "com.adobe.eventType.analytics", "com.adobe.eventSource.requestContent", null);
        builder.d(map2);
        this.f13161a.c(builder.a());
        Log.c();
    }

    public final void k() {
        this.e = null;
        this.f = null;
        this.h = null;
        this.i = null;
        this.l = null;
        this.g = null;
        NamedCollection namedCollection = this.d;
        if (namedCollection != null) {
            namedCollection.remove("ADOBEMOBILE_AID_SYNCED");
            this.d.remove("ADOBEMOBILE_ANALYTICS_PUSH_SYNC");
            synchronized (p) {
                this.d.remove("ADOBEMOBILE_PUSH_ENABLED");
            }
        }
    }

    public final StringBuilder m(ConfigurationSharedStateIdentity configurationSharedStateIdentity, Map map) {
        StringBuilder sb = new StringBuilder();
        String strF = null;
        String strH = h(h(null, "TS", String.valueOf(System.currentTimeMillis() / 1000)), "MCMID", this.e);
        if (map != null) {
            String strF2 = DataReader.f("aid", null, map);
            if (!StringUtils.a(strF2)) {
                strH = h(strH, "MCAID", strF2);
            }
            strF = DataReader.f("vid", null, map);
        }
        String str = configurationSharedStateIdentity.f13166a;
        if (!StringUtils.a(str)) {
            strH = h(strH, "MCORGID", str);
        }
        sb.append("adobe_mc=");
        sb.append(UrlEncoder.a(strH));
        if (!StringUtils.a(strF)) {
            sb.append("&adobe_aa_vid=");
            sb.append(UrlEncoder.a(strF));
        }
        return sb;
    }

    public final void n(String str, HashMap map, Event event) {
        Event eventA;
        if (event == null) {
            Event.Builder builder = new Event.Builder(str, "com.adobe.eventType.identity", "com.adobe.eventSource.responseIdentity", null);
            builder.d(map);
            eventA = builder.a();
        } else {
            Event.Builder builder2 = new Event.Builder(str, "com.adobe.eventType.identity", "com.adobe.eventSource.responseIdentity", null);
            builder2.d(map);
            builder2.c(event);
            eventA = builder2.a();
        }
        this.f13161a.c(eventA);
        eventA.toString();
        Log.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf A[LOOP:4: B:111:0x019b->B:125:0x01cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e A[Catch: Exception -> 0x00fc, TryCatch #3 {Exception -> 0x00fc, blocks: (B:62:0x00e2, B:65:0x00ed, B:67:0x00f3, B:76:0x010e, B:78:0x0114, B:80:0x011c, B:72:0x0100, B:74:0x0106), top: B:238:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(com.adobe.marketing.mobile.Event r19, boolean r20) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.identity.IdentityExtension.o(com.adobe.marketing.mobile.Event, boolean):boolean");
    }

    public final void p(IdentityResponseObject identityResponseObject, Event event) {
        this.j = System.currentTimeMillis() / 1000;
        boolean z = false;
        if (this.m != MobilePrivacyStatus.OPT_OUT) {
            if (identityResponseObject == null) {
                Log.a();
            } else {
                ArrayList arrayList = identityResponseObject.f;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Log.a();
                    HashMap map = new HashMap();
                    map.put("global.privacy", "optedout");
                    HashMap map2 = new HashMap();
                    map2.put("config.update", map);
                    Event.Builder builder = new Event.Builder("Configuration Update From IdentityExtension", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent", null);
                    builder.d(map2);
                    Event eventA = builder.a();
                    this.f13161a.c(eventA);
                    eventA.toString();
                    Log.c();
                }
                if (!StringUtils.a(identityResponseObject.d)) {
                    Log.d();
                    if (this.e == null) {
                        Log.c();
                        this.e = l();
                        z = true;
                    }
                } else if (!StringUtils.a(identityResponseObject.b) && identityResponseObject.b.equals(this.e)) {
                    try {
                        String str = identityResponseObject.f13170a;
                        if ((str != null && !str.equals(this.h)) || (StringUtils.a(identityResponseObject.f13170a) && !StringUtils.a(this.h))) {
                            z = true;
                        }
                        String str2 = identityResponseObject.c;
                        if ((str2 != null && !str2.equals(this.i)) || (StringUtils.a(identityResponseObject.c) && !StringUtils.a(this.i))) {
                            z = true;
                        }
                        this.h = identityResponseObject.f13170a;
                        this.i = identityResponseObject.c;
                        this.k = identityResponseObject.e;
                        Log.a();
                    } catch (Exception unused) {
                        Log.d();
                    }
                }
            }
            s();
        }
        HashMap mapQ = q();
        if (z) {
            mapQ.put("updatesharedstate", Boolean.TRUE);
        }
        n("UPDATED_IDENTITY_RESPONSE", mapQ, null);
        if (event != null) {
            n("UPDATED_IDENTITY_RESPONSE", mapQ, event);
        }
    }

    public final HashMap q() {
        HashMap map = new HashMap();
        if (!StringUtils.a(this.e)) {
            map.put("mid", this.e);
        }
        if (!StringUtils.a(this.f)) {
            map.put("advertisingidentifier", this.f);
        }
        if (!StringUtils.a(this.g)) {
            map.put("pushidentifier", this.g);
        }
        if (!StringUtils.a(this.h)) {
            map.put("blob", this.h);
        }
        if (!StringUtils.a(this.i)) {
            map.put("locationhint", this.i);
        }
        List list = this.l;
        if (list != null && !list.isEmpty()) {
            List list2 = this.l;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(VisitorIDSerializer.a((VisitorID) it.next()));
            }
            map.put("visitoridslist", arrayList);
        }
        map.put("lastsync", Long.valueOf(this.j));
        return map;
    }

    public final boolean r(Map map) {
        if (!StringUtils.a(DataReader.f("experienceCloud.org", null, map))) {
            this.c = new ConfigurationSharedStateIdentity(map);
        }
        ConfigurationSharedStateIdentity configurationSharedStateIdentity = this.c;
        if (configurationSharedStateIdentity != null && !StringUtils.a(configurationSharedStateIdentity.f13166a)) {
            return true;
        }
        Log.a();
        return false;
    }

    public final void s() {
        String string;
        NamedCollection namedCollection = this.d;
        if (namedCollection == null) {
            Log.c();
            return;
        }
        List<VisitorID> list = this.l;
        if (list == null) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (VisitorID visitorID : list) {
                sb.append("&d_cid_ic=");
                sb.append(visitorID.d);
                sb.append("%01");
                String str = visitorID.b;
                if (str != null) {
                    sb.append(str);
                }
                sb.append("%01");
                sb.append(visitorID.f13164a.d);
            }
            string = sb.toString();
        }
        u(namedCollection, "ADOBEMOBILE_VISITORID_IDS", string);
        u(namedCollection, "ADOBEMOBILE_PERSISTED_MID", this.e);
        u(namedCollection, "ADOBEMOBILE_PUSH_IDENTIFIER", this.g);
        u(namedCollection, "ADOBEMOBILE_ADVERTISING_IDENTIFIER", this.f);
        u(namedCollection, "ADOBEMOBILE_PERSISTED_MID_HINT", this.i);
        u(namedCollection, "ADOBEMOBILE_PERSISTED_MID_BLOB", this.h);
        namedCollection.a(this.k, "ADOBEMOBILE_VISITORID_TTL");
        namedCollection.a(this.j, "ADOBEMOBILE_VISITORID_SYNC");
        Log.c();
    }

    public final void t(ConfigurationSharedStateIdentity configurationSharedStateIdentity) throws URISyntaxException {
        String strD;
        String str = configurationSharedStateIdentity.f13166a;
        if (str == null || this.e == null) {
            strD = null;
        } else {
            HashMap mapR = androidx.constraintlayout.core.state.a.r("d_orgid", str);
            mapR.put("d_mid", this.e);
            URLBuilder uRLBuilder = new URLBuilder();
            uRLBuilder.a("demoptout.jpg");
            uRLBuilder.b = configurationSharedStateIdentity.c;
            uRLBuilder.c(mapR);
            strD = uRLBuilder.d();
        }
        if (StringUtils.a(strD)) {
            Log.a();
            return;
        }
        NetworkService networkService = ServiceProvider.a().b;
        if (networkService == null) {
            Log.a();
        } else {
            Log.a();
            networkService.a(new NetworkRequest(strD, null, 2, 2), new k(27));
        }
    }

    public final void v(String str) {
        boolean z;
        this.g = str;
        NamedCollection namedCollection = this.d;
        if (namedCollection == null) {
            Log.c();
        } else {
            String string = namedCollection.getString("ADOBEMOBILE_PUSH_IDENTIFIER");
            boolean z2 = namedCollection.getBoolean("ADOBEMOBILE_ANALYTICS_PUSH_SYNC");
            boolean z3 = (StringUtils.a(str) && string == null) || (string != null && string.equals(str));
            if ((!z3 || StringUtils.a(str)) && (!z3 || !z2)) {
                if (!z2) {
                    namedCollection.setBoolean("ADOBEMOBILE_ANALYTICS_PUSH_SYNC", true);
                }
                if (StringUtils.a(str)) {
                    namedCollection.remove("ADOBEMOBILE_PUSH_IDENTIFIER");
                } else {
                    namedCollection.setString("ADOBEMOBILE_PUSH_IDENTIFIER", str);
                }
                synchronized (p) {
                    try {
                        NamedCollection namedCollection2 = this.d;
                        if (namedCollection2 == null) {
                            Log.c();
                            z = false;
                        } else {
                            z = namedCollection2.getBoolean("ADOBEMOBILE_PUSH_ENABLED");
                        }
                    } finally {
                    }
                }
                if (str == null && !z) {
                    i(false);
                    Log.a();
                    return;
                } else if (str == null) {
                    i(false);
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    i(true);
                    return;
                }
            }
        }
        Log.a();
    }

    @VisibleForTesting
    public IdentityExtension(@NonNull ExtensionApi extensionApi, @Nullable NamedCollection namedCollection, @Nullable HitQueuing hitQueuing) {
        super(extensionApi);
        this.m = MobilePrivacyStatus.UNKNOWN;
        this.n = false;
        this.o = false;
        this.d = namedCollection;
        this.b = hitQueuing;
    }
}
