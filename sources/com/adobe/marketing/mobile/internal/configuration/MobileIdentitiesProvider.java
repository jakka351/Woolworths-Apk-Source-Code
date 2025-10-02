package com.adobe.marketing.mobile.internal.configuration;

import androidx.annotation.VisibleForTesting;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.SharedStateResolution;
import com.adobe.marketing.mobile.SharedStateResult;
import com.adobe.marketing.mobile.SharedStateStatus;
import com.adobe.marketing.mobile.VisitorID;
import com.adobe.marketing.mobile.util.DataReader;
import com.adobe.marketing.mobile.util.DataReaderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider;", "", "ID", "SharedStateKeys", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MobileIdentitiesProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final List f13178a = CollectionsKt.R("com.adobe.module.analytics", "com.adobe.module.audience", "com.adobe.module.configuration", "com.adobe.module.target", "com.adobe.module.identity");

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$ID;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class ID {

        /* renamed from: a, reason: collision with root package name */
        public final String f13179a;
        public final String b;
        public final String c;

        public ID(String namespace, String value, String str) {
            Intrinsics.h(namespace, "namespace");
            Intrinsics.h(value, "value");
            this.f13179a = namespace;
            this.b = value;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ID)) {
                return false;
            }
            ID id = (ID) obj;
            return Intrinsics.c(this.f13179a, id.f13179a) && Intrinsics.c(this.b, id.b) && Intrinsics.c(this.c, id.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f13179a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ID(namespace=");
            sb.append(this.f13179a);
            sb.append(", value=");
            sb.append(this.b);
            sb.append(", type=");
            return androidx.camera.core.impl.b.r(sb, this.c, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys;", "", "Analytics", "Audience", "Configuration", "Identity", "Target", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @VisibleForTesting
    public static final class SharedStateKeys {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Analytics;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Analytics {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Audience;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Audience {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Configuration;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Configuration {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Identity;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Identity {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/MobileIdentitiesProvider$SharedStateKeys$Target;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Target {
        }
    }

    public static String a(Event event, ExtensionApi extensionApi) {
        List<Map> listB;
        String string;
        Intrinsics.h(extensionApi, "extensionApi");
        ArrayList arrayList = new ArrayList();
        SharedStateResolution sharedStateResolution = SharedStateResolution.e;
        SharedStateResult sharedStateResultE = extensionApi.e("com.adobe.module.analytics", event, sharedStateResolution);
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        if (b(sharedStateResultE)) {
            String strF = DataReader.f("aid", null, sharedStateResultE != null ? sharedStateResultE.b : null);
            if (strF != null && strF.length() > 0) {
                arrayList2.add(new ID("AVID", strF, "integrationCode"));
            }
            String strF2 = DataReader.f("vid", null, sharedStateResultE != null ? sharedStateResultE.b : null);
            if (strF2 != null && strF2.length() > 0) {
                arrayList2.add(new ID("vid", strF2, "analytics"));
            }
        }
        arrayList.addAll(arrayList2);
        SharedStateResult sharedStateResultE2 = extensionApi.e("com.adobe.module.audience", event, sharedStateResolution);
        ArrayList arrayList3 = new ArrayList();
        if (b(sharedStateResultE2)) {
            String strF3 = DataReader.f("dpuuid", null, sharedStateResultE2 != null ? sharedStateResultE2.b : null);
            if (strF3 != null && strF3.length() > 0) {
                String dpid = DataReader.f("dpid", "", sharedStateResultE2 != null ? sharedStateResultE2.b : null);
                Intrinsics.g(dpid, "dpid");
                arrayList3.add(new ID(dpid, strF3, "namespaceId"));
            }
            String strF4 = DataReader.f("uuid", null, sharedStateResultE2 != null ? sharedStateResultE2.b : null);
            if (strF4 != null && strF4.length() > 0) {
                arrayList3.add(new ID("0", strF4, "namespaceId"));
            }
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        SharedStateResult sharedStateResultE3 = extensionApi.e("com.adobe.module.identity", event, sharedStateResolution);
        String strF5 = DataReader.f("mid", null, sharedStateResultE3 != null ? sharedStateResultE3.b : null);
        if (strF5 != null) {
            arrayList4.add(new ID("4", strF5, "namespaceId"));
        }
        try {
            listB = DataReader.b(sharedStateResultE3 != null ? sharedStateResultE3.b : null);
        } catch (DataReaderException unused) {
            listB = null;
        }
        if (listB == null) {
            listB = EmptyList.d;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Map map : listB) {
            if (map != null) {
                arrayList5.add(new VisitorID(String.valueOf(map.get("ID_ORIGIN")), String.valueOf(map.get("ID_TYPE")), String.valueOf(map.get("ID")), VisitorID.AuthenticationState.a(Integer.parseInt(String.valueOf(map.get("STATE"))))));
            }
        }
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            VisitorID visitorID = (VisitorID) it.next();
            String str2 = visitorID.b;
            if (str2 != null && str2.length() != 0) {
                String str3 = visitorID.d;
                Intrinsics.g(str3, "visitorID.idType");
                String str4 = visitorID.b;
                Intrinsics.g(str4, "visitorID.id");
                arrayList4.add(new ID(str3, str4, "integrationCode"));
            }
        }
        String strF6 = DataReader.f("pushidentifier", null, sharedStateResultE3 != null ? sharedStateResultE3.b : null);
        if (strF6 != null && strF6.length() > 0) {
            arrayList4.add(new ID("20919", strF6, "integrationCode"));
        }
        arrayList.addAll(arrayList4);
        ArrayList arrayList6 = new ArrayList();
        SharedStateResult sharedStateResultE4 = extensionApi.e("com.adobe.module.target", event, sharedStateResolution);
        if (b(sharedStateResultE4)) {
            String strF7 = DataReader.f("tntid", null, sharedStateResultE4 != null ? sharedStateResultE4.b : null);
            if (strF7 != null && strF7.length() > 0) {
                arrayList6.add(new ID("tntid", strF7, "target"));
            }
            String strF8 = DataReader.f("thirdpartyid", null, sharedStateResultE4 != null ? sharedStateResultE4.b : null);
            if (strF8 != null && strF8.length() > 0) {
                arrayList6.add(new ID("3rdpartyid", strF8, "target"));
            }
        }
        arrayList.addAll(arrayList6);
        ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ID id = (ID) it2.next();
            arrayList7.add(MapsKt.j(new Pair("namespace", id.f13179a), new Pair("value", id.b), new Pair("type", id.c)));
        }
        ArrayList arrayList8 = new ArrayList();
        SharedStateResult sharedStateResultE5 = extensionApi.e("com.adobe.module.configuration", event, sharedStateResolution);
        if (b(sharedStateResultE5)) {
            String strF9 = DataReader.f("experienceCloud.org", null, sharedStateResultE5 != null ? sharedStateResultE5.b : null);
            if (strF9 != null && strF9.length() > 0) {
                str = strF9;
            }
        }
        if (str != null) {
            arrayList8.add(MapsKt.j(new Pair("namespace", "imsOrgID"), new Pair("value", str)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList8.isEmpty()) {
            linkedHashMap.put("companyContexts", arrayList8);
        }
        if (!arrayList7.isEmpty()) {
            linkedHashMap.put("users", CollectionsKt.Q(MapsKt.i(new Pair("userIDs", arrayList7))));
        }
        try {
            string = new JSONObject(linkedHashMap).toString();
        } catch (JSONException unused2) {
            string = new JSONObject().toString();
        }
        Intrinsics.g(string, "try {\n            JSONOb…ct().toString()\n        }");
        return string;
    }

    public static boolean b(SharedStateResult sharedStateResult) {
        return (sharedStateResult != null ? sharedStateResult.f13163a : null) == SharedStateStatus.d;
    }
}
