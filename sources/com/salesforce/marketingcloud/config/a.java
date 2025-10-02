package com.salesforce.marketingcloud.config;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.analytics.m;
import com.salesforce.marketingcloud.config.b;
import com.salesforce.marketingcloud.extensions.PushExtensionsKt;
import com.salesforce.marketingcloud.k;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class a extends com.salesforce.marketingcloud.f implements k.e {

    @NotNull
    private static final String A = "invalidConfigurationValue";

    @NotNull
    private static final String B = "event";

    @NotNull
    private static final String C = "activeEvents";

    @NotNull
    private static final String D = "enableEngagementEvents";

    @NotNull
    private static final String E = "enableSystemEvents";

    @NotNull
    private static final String F = "enableAppEvents";

    @NotNull
    private static final String G = "enableIdentityEvents";

    @NotNull
    private static final String H = "enableDebugInfo";

    @NotNull
    private static final String I = "enableTelemetryInfo";

    @NotNull
    private static final String J = "endpoints";

    @NotNull
    private static final String K = "dataTypes";
    private static final int L = 1000;

    @NotNull
    private static final String M = "version";

    @Nullable
    private static a N = null;

    @NotNull
    public static final C0355a d = new C0355a(null);

    @NotNull
    public static final String e = "correlationIds";

    @NotNull
    public static final String f = "gateEventProcessingMs";
    public static final int g = 0;

    @NotNull
    public static final String h = "eventName";

    @NotNull
    public static final String i = "endpoint";

    @NotNull
    public static final String j = "path";

    @NotNull
    public static final String k = "maxBatchSize";

    @NotNull
    private static final EnumSet<k.d> l;

    @NotNull
    private static final Object m;

    @NotNull
    private static final String n = "~!ConfigComponent";
    private static final int o = 1;
    private static final boolean p = true;
    private static final boolean q = false;
    private static final boolean r = false;
    private static final boolean s = false;
    private static final boolean t = false;
    private static final boolean u = false;

    @NotNull
    private static final String v = "items";

    @NotNull
    private static final String w = "inApp";

    @NotNull
    private static final String x = "maxDisplay";

    @NotNull
    private static final String y = "timeBetweenDisplaySec";

    @NotNull
    private static final String z = "invalidConfigurationKey";

    @NotNull
    private final k O;

    @NotNull
    private final com.salesforce.marketingcloud.storage.j P;

    @NotNull
    private final m Q;

    @Nullable
    private Map<String, com.salesforce.marketingcloud.config.b> R;

    @Nullable
    private Boolean S;

    @Nullable
    private Boolean T;

    @Nullable
    private Boolean U;

    @Nullable
    private Boolean V;

    @Nullable
    private Boolean W;

    @Nullable
    private Boolean X;

    @Nullable
    private Map<String, String> Y;

    /* renamed from: com.salesforce.marketingcloud.config.a$a, reason: collision with other inner class name */
    public static final class C0355a {
        private C0355a() {
        }

        @JvmStatic
        public static /* synthetic */ void b() {
        }

        @Nullable
        public final a a() {
            return a.N;
        }

        @NotNull
        public final Object c() {
            return a.m;
        }

        @NotNull
        public final EnumSet<k.d> d() {
            return a.l;
        }

        public /* synthetic */ C0355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@Nullable a aVar) {
            a.N = aVar;
        }
    }

    public static final class b extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16864a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to generate complete SDK state output for component.";
        }
    }

    public static final class c extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f16865a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse [Endpoint Config] sync data.";
        }
    }

    public static final class d extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16866a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse [Event Config] sync data";
        }
    }

    public static final class e extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f16867a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse [InApp Config] sync data";
        }
    }

    public static final class f extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16868a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f16868a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return YU.a.h("Unknown endpoint '", this.f16868a, "' in config.");
        }
    }

    public static final class g extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f16869a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse endpoint from sync response.";
        }
    }

    public static final class h extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f16870a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to handle sync payload due to version mismatch";
        }
    }

    public static final class i extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f16871a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not process [AppConfig Node] from Sync.";
        }
    }

    public static final class j extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f16872a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return YU.a.h("Failed to log analytics for InvalidConfig [", this.f16872a, "]");
        }
    }

    static {
        EnumSet<k.d> enumSetOf = EnumSet.of(k.d.appConfig);
        Intrinsics.g(enumSetOf, "of(...)");
        l = enumSetOf;
        m = new Object();
    }

    public a(@NotNull k syncRouteComponent, @NotNull com.salesforce.marketingcloud.storage.j storage, @NotNull m triggerAnalytics) {
        Intrinsics.h(syncRouteComponent, "syncRouteComponent");
        Intrinsics.h(storage, "storage");
        Intrinsics.h(triggerAnalytics, "triggerAnalytics");
        this.O = syncRouteComponent;
        this.P = storage;
        this.Q = triggerAnalytics;
        N = this;
    }

    @Nullable
    public static final a e() {
        return d.a();
    }

    private final Map<String, String> f() {
        return PushExtensionsKt.toMap(new JSONArray(this.P.f().getString(C, new JSONArray().toString())));
    }

    @Override // com.salesforce.marketingcloud.d
    @NotNull
    public String componentName() {
        return "ConfigComponent";
    }

    @Override // com.salesforce.marketingcloud.d
    @NotNull
    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        synchronized (m) {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(D, this.P.f().getBoolean(D, true));
                    jSONObject2.put(E, this.P.f().getBoolean(E, false));
                    jSONObject2.put(F, this.P.f().getBoolean(F, false));
                    jSONObject2.put(G, this.P.f().getBoolean(G, false));
                    jSONObject2.put(I, this.P.f().getBoolean(I, false));
                    jSONObject2.put(H, this.P.f().getBoolean(H, false));
                    Map<String, String> map = this.Y;
                    if (map == null) {
                        map = EmptyMap.d;
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(h, entry.getKey());
                        String value = entry.getValue();
                        if (value != null) {
                            jSONObject3.put(e, value);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject2.put(C, jSONArray);
                    jSONObject.put(B, jSONObject2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(f, this.P.f().getInt(f, 0));
                    jSONObject4.put(x, this.P.f().getInt(x, Integer.MAX_VALUE));
                    jSONObject4.put(y, this.P.f().getInt(y, 0));
                    jSONObject.put(w, jSONObject4);
                    Map<String, com.salesforce.marketingcloud.config.b> map2 = this.R;
                    if (map2 == null) {
                        map2 = EmptyMap.d;
                    }
                    jSONObject.put(J, PushExtensionsKt.toJSONArray(map2));
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f16896a, n, null, b.f16864a, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.Y;
    }

    @WorkerThread
    public final boolean g() {
        boolean zBooleanValue;
        synchronized (m) {
            try {
                Boolean bool = this.U;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.P.f().getBoolean(F, false);
                    this.U = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean h() {
        boolean zBooleanValue;
        synchronized (m) {
            try {
                Boolean bool = this.X;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.P.f().getBoolean(H, false);
                    this.X = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean i() {
        boolean zBooleanValue;
        synchronized (m) {
            try {
                Boolean bool = this.S;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.P.f().getBoolean(D, true);
                    this.S = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean j() {
        boolean zBooleanValue;
        synchronized (m) {
            try {
                Boolean bool = this.V;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.P.f().getBoolean(G, false);
                    this.V = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean k() {
        boolean zBooleanValue;
        synchronized (m) {
            try {
                Boolean bool = this.T;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.P.f().getBoolean(E, false);
                    this.T = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean l() {
        boolean zBooleanValue;
        synchronized (m) {
            try {
                Boolean bool = this.W;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.P.f().getBoolean(I, false);
                    this.W = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NotNull k.d node, @NotNull JSONObject data) {
        Intrinsics.h(node, "node");
        Intrinsics.h(data, "data");
        if (l.contains(node)) {
            if (data.optInt(M) != 1) {
                com.salesforce.marketingcloud.g.b(com.salesforce.marketingcloud.g.f16896a, n, null, h.f16870a, 2, null);
                return;
            }
            try {
                if (node == k.d.appConfig) {
                    c(data);
                }
            } catch (Throwable th) {
                com.salesforce.marketingcloud.g.f16896a.b(n, th, i.f16871a);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z2) {
        this.O.a(l, (k.e) null);
        N = null;
    }

    private final void b(JSONObject jSONObject) {
        synchronized (m) {
            try {
                try {
                    int iOptInt = jSONObject.optInt(f, 0);
                    int iOptInt2 = jSONObject.optInt(x, Integer.MAX_VALUE);
                    int iOptInt3 = jSONObject.optInt(y, 0);
                    SharedPreferences.Editor editorEdit = this.P.f().edit();
                    Intrinsics.g(editorEdit, "edit(...)");
                    if (iOptInt >= 0) {
                        editorEdit.putInt(com.salesforce.marketingcloud.events.c.r, iOptInt);
                    }
                    if (iOptInt2 >= 0) {
                        editorEdit.putInt(com.salesforce.marketingcloud.events.c.s, iOptInt2);
                    }
                    if (iOptInt3 >= 0) {
                        editorEdit.putInt(com.salesforce.marketingcloud.events.c.t, iOptInt3);
                    }
                    editorEdit.apply();
                    if (iOptInt < 0) {
                        a(f, String.valueOf(iOptInt));
                    }
                    if (iOptInt2 < 0) {
                        a(x, String.valueOf(iOptInt2));
                    }
                    if (iOptInt3 < 0) {
                        a(y, String.valueOf(iOptInt3));
                    }
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.f16896a.b(n, e2, e.f16867a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void c(@NotNull JSONObject data) {
        Intrinsics.h(data, "data");
        JSONObject jSONObjectOptJSONObject = data.optJSONObject(v);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(B);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        a(jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(w);
        if (jSONObjectOptJSONObject3 == null) {
            jSONObjectOptJSONObject3 = new JSONObject();
        }
        b(jSONObjectOptJSONObject3);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(J);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        a(jSONArrayOptJSONArray);
    }

    private final Map<String, com.salesforce.marketingcloud.config.b> b(JSONArray jSONArray) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONArray.length() != 0) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    Object obj = jSONArray.get(i2);
                    Intrinsics.f(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(K);
                    if (jSONArrayOptJSONArray != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            Object obj2 = jSONArrayOptJSONArray.get(i3);
                            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (str.equals("EVENTS")) {
                                b.a aVar = com.salesforce.marketingcloud.config.b.d;
                                String stringOrNull = PushExtensionsKt.getStringOrNull(jSONObject, j);
                                Integer intOrNull = PushExtensionsKt.getIntOrNull(jSONObject, k);
                                linkedHashMap.put(str, aVar.a(str, stringOrNull, Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 1000)));
                            } else {
                                com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f16896a, n, null, new f(str), 2, null);
                            }
                        }
                    }
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.f16896a.e(n, e2, g.f16869a);
                }
            }
        }
        return linkedHashMap;
    }

    @WorkerThread
    @Nullable
    public final com.salesforce.marketingcloud.config.b a(@Nullable com.salesforce.marketingcloud.storage.j jVar, @Nullable String str) {
        com.salesforce.marketingcloud.config.b bVar;
        if (jVar == null || str == null || str.length() == 0) {
            return null;
        }
        synchronized (m) {
            try {
                Map<String, com.salesforce.marketingcloud.config.b> map = this.R;
                if (map == null || (bVar = map.get(str)) == null) {
                    Map<String, com.salesforce.marketingcloud.config.b> mapB = b(new JSONArray(jVar.f().getString(J, new JSONArray().toString())));
                    this.R = mapB;
                    bVar = mapB.get(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @WorkerThread
    @Nullable
    public final String a(@NotNull String eventName) {
        String str;
        Intrinsics.h(eventName, "eventName");
        synchronized (m) {
            try {
                Map<String, String> map = this.Y;
                if (map != null) {
                    String lowerCase = eventName.toLowerCase(Locale.ROOT);
                    Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    str = map.get(lowerCase);
                    if (str == null) {
                        Map<String, String> mapF = f();
                        this.Y = mapF;
                        String lowerCase2 = eventName.toLowerCase(Locale.ROOT);
                        Intrinsics.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        str = mapF.get(lowerCase2);
                    }
                } else {
                    Map<String, String> mapF2 = f();
                    this.Y = mapF2;
                    String lowerCase22 = eventName.toLowerCase(Locale.ROOT);
                    Intrinsics.g(lowerCase22, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    str = mapF2.get(lowerCase22);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private final void a(JSONArray jSONArray) {
        synchronized (m) {
            try {
                this.R = b(jSONArray);
                this.P.f().edit().putString(J, jSONArray.toString()).apply();
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.f16896a.b(n, e2, c.f16865a);
            }
        }
    }

    private final void a(JSONObject jSONObject) {
        synchronized (m) {
            try {
                try {
                    SharedPreferences.Editor editorEdit = this.P.f().edit();
                    Intrinsics.g(editorEdit, "edit(...)");
                    boolean zOptBoolean = jSONObject.optBoolean(D, true);
                    Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                    editorEdit.putBoolean(D, zOptBoolean);
                    this.S = boolValueOf;
                    boolean zOptBoolean2 = jSONObject.optBoolean(E, false);
                    Boolean boolValueOf2 = Boolean.valueOf(zOptBoolean2);
                    editorEdit.putBoolean(E, zOptBoolean2);
                    this.T = boolValueOf2;
                    boolean zOptBoolean3 = jSONObject.optBoolean(F, false);
                    Boolean boolValueOf3 = Boolean.valueOf(zOptBoolean3);
                    editorEdit.putBoolean(F, zOptBoolean3);
                    this.U = boolValueOf3;
                    boolean zOptBoolean4 = jSONObject.optBoolean(G, false);
                    Boolean boolValueOf4 = Boolean.valueOf(zOptBoolean4);
                    editorEdit.putBoolean(G, zOptBoolean4);
                    this.V = boolValueOf4;
                    boolean zOptBoolean5 = jSONObject.optBoolean(H, false);
                    Boolean boolValueOf5 = Boolean.valueOf(zOptBoolean5);
                    editorEdit.putBoolean(H, zOptBoolean5);
                    this.X = boolValueOf5;
                    boolean zOptBoolean6 = jSONObject.optBoolean(I, false);
                    Boolean boolValueOf6 = Boolean.valueOf(zOptBoolean6);
                    editorEdit.putBoolean(I, zOptBoolean6);
                    this.W = boolValueOf6;
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C);
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                    }
                    this.Y = PushExtensionsKt.toMap(jSONArrayOptJSONArray);
                    editorEdit.putString(C, jSONArrayOptJSONArray.toString());
                    editorEdit.apply();
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.f16896a.b(n, e2, d.f16866a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void b(@Nullable a aVar) {
        d.a(aVar);
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NotNull InitializationStatus.a statusBuilder) {
        Intrinsics.h(statusBuilder, "statusBuilder");
        this.O.a(l, this);
    }

    @WorkerThread
    public final boolean b(@NotNull String eventName) {
        String lowerCase;
        boolean zContainsKey;
        Intrinsics.h(eventName, "eventName");
        synchronized (m) {
            try {
                Map<String, String> mapF = this.Y;
                if (mapF != null) {
                    lowerCase = eventName.toLowerCase(Locale.ROOT);
                } else {
                    mapF = f();
                    this.Y = mapF;
                    lowerCase = eventName.toLowerCase(Locale.ROOT);
                }
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                zContainsKey = mapF.containsKey(lowerCase);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    private final void a(String str, String str2) throws JSONException {
        try {
            if (h()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(z, str);
                jSONObject.put(A, str2);
                this.Q.a(jSONObject);
            }
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.f16896a.b(n, e2, new j(str));
        }
    }
}
