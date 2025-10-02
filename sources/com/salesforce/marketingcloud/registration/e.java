package com.salesforce.marketingcloud.registration;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationManagerCompat;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class e implements RegistrationManager {

    @RestrictTo
    public static final String w = "Android";

    @VisibleForTesting
    static final String x = "previousRegistrationHash";

    @VisibleForTesting
    static final String y = "lastRegistrationSendTimestamp";

    @VisibleForTesting
    final Set<String> d;
    private final Context e;
    final MarketingCloudConfig f;
    final j g;
    final com.salesforce.marketingcloud.alarms.b h;
    final com.salesforce.marketingcloud.http.c i;
    final l j;
    final SFMCSdkComponents k;
    private final Set<RegistrationManager.RegistrationEventListener> l;
    private final com.salesforce.marketingcloud.registration.f m;
    private ConcurrentHashMap<String, String> n;
    private ConcurrentSkipListSet<String> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private String u;
    private String v;

    public class a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f17036a;

        /* renamed from: com.salesforce.marketingcloud.registration.e$a$a, reason: collision with other inner class name */
        public class CountDownTimerC0376a extends AbstractCountDownTimerC0378e {

            /* renamed from: com.salesforce.marketingcloud.registration.e$a$a$a, reason: collision with other inner class name */
            public class C0377a extends g {
                public C0377a(String str, Object... objArr) {
                    super(str, objArr);
                }

                @Override // com.salesforce.marketingcloud.internal.g
                public void a() {
                    try {
                        SFMCSdkComponents sFMCSdkComponents = e.this.k;
                        String registrationId = sFMCSdkComponents != null ? sFMCSdkComponents.getRegistrationId() : null;
                        Registration registrationL = e.this.g.u().l(e.this.g.b());
                        e eVar = e.this;
                        if (e.a(registrationL, eVar.g, eVar.f.delayRegistrationUntilContactKeyIsSet())) {
                            e.this.h.d(a.EnumC0346a.b);
                            e eVar2 = e.this;
                            eVar2.i.a(com.salesforce.marketingcloud.http.a.o.a(eVar2.f, eVar2.g.c(), com.salesforce.marketingcloud.registration.d.a(registrationL, registrationId)));
                        }
                    } catch (Exception e) {
                        com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "Failed to get our Registration from local storage.", new Object[0]);
                    }
                }
            }

            public CountDownTimerC0376a(int i) {
                super(i);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                e.this.j.b().execute(new C0377a("registration_request", new Object[0]));
            }
        }

        public a(boolean z) {
            this.f17036a = z;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            new CountDownTimerC0376a(this.f17036a ? 1000 : 0).start();
        }
    }

    public class b extends g {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            e.this.g.u().c();
        }
    }

    public class c extends g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            e eVar = e.this;
            if (e.a(eVar.g, eVar.f.delayRegistrationUntilContactKeyIsSet())) {
                e.this.h.b(a.EnumC0346a.b);
            }
        }
    }

    public static class d implements RegistrationManager.Editor, com.salesforce.marketingcloud.registration.c {
        private static final List<String> j;

        /* renamed from: a, reason: collision with root package name */
        private final Object f17038a = new Object();

        @GuardedBy
        private final Map<String, String> b;

        @GuardedBy
        private final Set<String> c;

        @GuardedBy
        private String d;

        @GuardedBy
        private final f e;

        @GuardedBy
        private String f;

        @GuardedBy
        private final Map<String, String> g;

        @GuardedBy
        private boolean h;

        @GuardedBy
        private boolean i;

        static {
            String[] strArr = {"addressId", "alias", "apId", "backgroundRefreshEnabled", "badge", "channel", "contactId", "contactKey", "createdBy", "createdDate", "customObjectKey", "device", "deviceId", "deviceType", "gcmSenderId", "hardwareId", "isHonorDst", "lastAppOpen", "lastMessageOpen", "lastSend", "locationEnabled", "messageOpenCount", "modifiedBy", "modifiedDate", "optInDate", "optInMethodId", "optInStatusId", "optOutDate", "optOutMethodId", "optOutStatusId", k.a.b, "platformVersion", "providerToken", "proximityEnabled", "pushAddressExtensionId", "pushApplicationId", lllqqql.cc006300630063cc, "sendCount", "source", "sourceObjectId", "status", "systemToken", k.a.e, "utcOffset", "signedString", "quietPushEnabled"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 46; i++) {
                arrayList.add(strArr[i].toLowerCase(Locale.ENGLISH));
            }
            j = Collections.unmodifiableList(arrayList);
        }

        public d(f fVar, String str, String str2, ConcurrentHashMap<String, String> concurrentHashMap, ConcurrentSkipListSet<String> concurrentSkipListSet, Set<String> set) {
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            this.b = new TreeMap(comparator);
            this.c = new TreeSet(comparator);
            this.e = fVar;
            this.d = str;
            this.f = str2;
            this.g = new com.salesforce.marketingcloud.registration.b(concurrentHashMap);
            Iterator<String> it = concurrentSkipListSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                this.b.put(next, next);
            }
            this.c.addAll(set);
        }

        @Nullable
        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f17033a, "The attribute you provided was null or empty.", new Object[0]);
                return false;
            }
            String strTrim = str.trim();
            if (TextUtils.isEmpty(strTrim)) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f17033a, "The attribute you provided was blank.", new Object[0]);
                return false;
            }
            if (j.contains(strTrim.toLowerCase(Locale.ENGLISH))) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f17033a, "Attribute key '%s' is invalid and can not be added.  Please see documentation regarding Attributes and Reserved Words.", strTrim);
                return false;
            }
            if (strTrim.length() <= 128) {
                return true;
            }
            com.salesforce.marketingcloud.g.e(RegistrationManager.f17033a, "Your attribute key was %s characters long.  Attribute keys are restricted to %s characters.  Your attribute key will be truncated.", Integer.valueOf(strTrim.length()), 128);
            return false;
        }

        @Nullable
        private boolean b(String str) {
            if (str != null) {
                return true;
            }
            com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, "Attribute value was null and will not be saved.", new Object[0]);
            return false;
        }

        private boolean c(@Nullable String str) {
            return str == null || TextUtils.getTrimmedLength(str) > 0;
        }

        @Nullable
        private String d(String str) {
            if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) != 0) {
                return str.trim();
            }
            com.salesforce.marketingcloud.g.e(RegistrationManager.f17033a, "An empty or NULL ContactKey will not be transmitted to the Marketing Cloud and was NOT updated with the provided value.", new Object[0]);
            return null;
        }

        @Nullable
        private String e(String str) {
            return str != null ? str.trim() : str;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTag(String str) {
            String strE = e(str);
            synchronized (this.f17038a) {
                try {
                    if (!TextUtils.isEmpty(strE) && !strE.equals(this.b.put(strE, strE))) {
                        this.h = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(Iterable<String> iterable) {
            if (iterable != null) {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    addTag(it.next());
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttribute(String str) {
            return !a(str) ? this : setAttribute(str, "");
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(Iterable<String> iterable) {
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                clearAttribute(it.next());
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearTags() {
            synchronized (this.f17038a) {
                try {
                    if (this.b.keySet().retainAll(this.c)) {
                        this.h = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        public boolean commit() {
            f fVar;
            synchronized (this.f17038a) {
                try {
                    if (!this.h || (fVar = this.e) == null) {
                        return false;
                    }
                    fVar.a(this.d, this.f, this.g, this.b.values(), this.i);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTag(String str) {
            if (str == null) {
                return this;
            }
            synchronized (this.f17038a) {
                try {
                    if (!this.c.contains(str) && this.b.remove(str) != null) {
                        this.h = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(Iterable<String> iterable) {
            if (iterable != null) {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    removeTag(it.next());
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        @Deprecated
        public RegistrationManager.Editor setAttribute(@NonNull String str, @NonNull String str2) {
            return a(str, str2, true);
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        @Deprecated
        public RegistrationManager.Editor setContactKey(@NonNull String str) {
            return a(str, true);
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setSignedString(@Nullable @Size String str) {
            synchronized (this.f17038a) {
                try {
                    if (c(str)) {
                        this.d = str;
                        this.h = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull String str, @NonNull String str2, boolean z) {
            synchronized (this.f17038a) {
                try {
                    if (a(str) && b(str2)) {
                        this.g.put(str, str2);
                        this.h = true;
                        this.i = z;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                for (String str : strArr) {
                    addTag(str);
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                for (String str : strArr) {
                    clearAttribute(str);
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                for (String str : strArr) {
                    removeTag(str);
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull String str, boolean z) {
            String strD = d(str);
            if (strD == null) {
                return this;
            }
            synchronized (this.f17038a) {
                this.h = true;
                this.i = z;
                this.f = strD;
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull String str, @NonNull Map<String, String> map, boolean z) {
            a(str, z);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue(), z);
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull Map<String, String> map, boolean z) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue(), z);
            }
            return this;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.registration.e$e, reason: collision with other inner class name */
    public static abstract class AbstractCountDownTimerC0378e extends CountDownTimer {
        public AbstractCountDownTimerC0378e(int i) {
            this(i, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        private AbstractCountDownTimerC0378e(long j, long j2) {
            super(j, j2);
        }
    }

    public interface f {
        default void a(String str, String str2, Map<String, String> map, Collection<String> collection) {
            a(str, str2, map, collection, false);
        }

        void a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z);
    }

    public e(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.registration.f fVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar) {
        this(context, marketingCloudConfig, jVar, fVar, bVar, cVar, pushMessageManager, lVar, null);
    }

    public void a() {
        this.g.f().edit().remove(com.salesforce.marketingcloud.http.a.o.c + "_device").apply();
        a(false);
    }

    public void b() {
        boolean zB = h.b(this.e);
        boolean z = zB && h.c(this.e);
        boolean zAreNotificationsEnabled = new NotificationManagerCompat(this.e).b.areNotificationsEnabled();
        if (zB == this.p && z == this.q && zAreNotificationsEnabled == this.r) {
            return;
        }
        this.p = zB;
        this.q = z;
        this.r = zAreNotificationsEnabled;
        g();
    }

    public void c() {
        this.h.d(a.EnumC0346a.b);
        g();
    }

    public JSONObject d() throws JSONException {
        String strB;
        Registration registrationA = a(0);
        if (registrationA == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("current_registration", com.salesforce.marketingcloud.internal.k.b(registrationA));
            if (a(registrationA, this.g, this.f.delayRegistrationUntilContactKeyIsSet()) && (strB = this.g.c().b(com.salesforce.marketingcloud.storage.c.h, null)) != null) {
                jSONObject.put("last_registration_sent", new JSONObject(strB));
            }
            long j = this.g.f().getLong(y, 0L);
            if (j > 0) {
                jSONObject.put("last_sent_timestamp", com.salesforce.marketingcloud.util.l.a(new Date(j)));
            }
            return jSONObject;
        } catch (JSONException e) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "Failed to build our component state JSONObject.", new Object[0]);
            return jSONObject;
        }
    }

    public void e() {
        a(true);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public RegistrationManager.Editor edit() {
        com.salesforce.marketingcloud.g.a(RegistrationManager.f17033a, "Changes with this editor will not be saved.", new Object[0]);
        return new d(null, this.v, this.t, this.n, this.o, this.d);
    }

    public boolean f() {
        return this.s && new NotificationManagerCompat(this.e).b.areNotificationsEnabled();
    }

    public void g() {
        c(false);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.n);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getContactKey() {
        return this.t;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public String getDeviceId() {
        return this.m.f();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSignedString() {
        return this.v;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSystemToken() {
        return this.u;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Set<String> getTags() {
        return new TreeSet((SortedSet) this.o);
    }

    public void h() {
        g();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void registerForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        if (registrationEventListener == null) {
            return;
        }
        synchronized (this.l) {
            this.l.add(registrationEventListener);
        }
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void unregisterForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        synchronized (this.l) {
            this.l.remove(registrationEventListener);
        }
    }

    public e(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.registration.f fVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar, SFMCSdkComponents sFMCSdkComponents) {
        Registration registrationA;
        boolean z = false;
        this.l = new ArraySet(0);
        this.e = context;
        this.f = marketingCloudConfig;
        this.g = jVar;
        this.m = fVar;
        this.h = bVar;
        this.i = cVar;
        this.j = lVar;
        this.k = sFMCSdkComponents;
        TreeSet treeSet = new TreeSet();
        treeSet.add("ALL");
        treeSet.add("Android");
        if (com.salesforce.marketingcloud.util.l.a(context)) {
            treeSet.add("DEBUG");
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        this.d = setUnmodifiableSet;
        this.s = pushMessageManager.isPushEnabled();
        boolean zB = h.b(context);
        this.p = zB;
        boolean z2 = true;
        this.q = zB && h.c(context);
        this.r = new NotificationManagerCompat(context).b.areNotificationsEnabled();
        this.u = pushMessageManager.getPushToken();
        com.salesforce.marketingcloud.storage.c cVarC = jVar.c();
        try {
            Registration registrationL = jVar.u().l(jVar.b());
            if (registrationL == null) {
                this.v = null;
                this.t = cVarC.b(com.salesforce.marketingcloud.storage.c.d, null);
                this.n = new ConcurrentHashMap<>(com.salesforce.marketingcloud.util.l.c(cVarC.b(com.salesforce.marketingcloud.storage.c.b, "")));
                ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(com.salesforce.marketingcloud.util.l.d(cVarC.b(com.salesforce.marketingcloud.storage.c.c, "")));
                this.o = concurrentSkipListSet.isEmpty() ? new ConcurrentSkipListSet<>(setUnmodifiableSet) : a((ConcurrentSkipListSet<String>) concurrentSkipListSet, setUnmodifiableSet);
                registrationA = a(0);
                z2 = false;
            } else {
                this.v = registrationL.signedString();
                this.t = registrationL.contactKey();
                this.n = new ConcurrentHashMap<>(registrationL.attributes());
                this.o = a((ConcurrentSkipListSet<String>) new ConcurrentSkipListSet(registrationL.tags()), setUnmodifiableSet);
                registrationA = a(com.salesforce.marketingcloud.internal.k.a(registrationL));
            }
            a(jVar, this.t);
            z = z2;
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "Error trying to get, update or add a registration to local storage.", new Object[0]);
            this.o = new ConcurrentSkipListSet<>(this.d);
            this.n = new ConcurrentHashMap<>();
            this.t = null;
            this.v = null;
            registrationA = a(0);
        }
        lVar.b().execute(new com.salesforce.marketingcloud.registration.a(jVar.u(), jVar.b(), registrationA, z));
        if (a(registrationA, jVar, marketingCloudConfig.delayRegistrationUntilContactKeyIsSet())) {
            e();
        }
    }

    private static ConcurrentSkipListSet<String> a(ConcurrentSkipListSet<String> concurrentSkipListSet, Set<String> set) {
        if (!concurrentSkipListSet.containsAll(set)) {
            concurrentSkipListSet.addAll(set);
        }
        return concurrentSkipListSet;
    }

    public void c(boolean z) {
        try {
            Registration registrationA = a(0);
            this.j.b().execute(new com.salesforce.marketingcloud.registration.a(this.g.u(), this.g.b(), registrationA, false));
            a(this.g, registrationA.contactKey());
            if (a(registrationA, this.g, this.f.delayRegistrationUntilContactKeyIsSet())) {
                SFMCSdkComponents sFMCSdkComponents = this.k;
                if (sFMCSdkComponents != null && z) {
                    if (this.t != null) {
                        sFMCSdkComponents.getIdentity().setProfile(this.t, this.n, ModuleIdentifier.PUSH, new ModuleIdentifier[0]);
                    } else {
                        sFMCSdkComponents.getIdentity().setProfileAttributes(this.n, ModuleIdentifier.PUSH);
                    }
                }
                e();
            }
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "An error occurred trying to save our Registration.", new Object[0]);
        }
    }

    public RegistrationManager.Editor a(f fVar) {
        return new d(fVar, this.v, this.t, this.n, this.o, this.d);
    }

    private Registration a(int i) {
        return new Registration(i, this.v, this.m.f(), this.u, this.m.j(), this.m.e(), TimeZone.getDefault().inDaylightTime(new Date()), this.p, this.q, this.m.i(), f(), com.salesforce.marketingcloud.util.l.b(), this.t, this.m.h(), this.m.g(), this.f.applicationId(), Locale.getDefault().toString(), this.o, this.n);
    }

    public void a(boolean z) {
        MarketingCloudSdk.requestSdk(new a(z));
    }

    public void a(@NonNull Registration registration, Map<String, List<String>> map) {
        com.salesforce.marketingcloud.http.a.a(map, this.g.c());
        this.h.c(a.EnumC0346a.b);
        synchronized (this.l) {
            for (RegistrationManager.RegistrationEventListener registrationEventListener : this.l) {
                if (registrationEventListener != null) {
                    try {
                        registrationEventListener.onRegistrationReceived(registration);
                    } catch (Exception e) {
                        com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "%s threw an exception while processing the registration response", registrationEventListener.getClass().getName());
                    }
                }
            }
        }
        String string = com.salesforce.marketingcloud.internal.k.b(registration).toString();
        this.g.c().a(com.salesforce.marketingcloud.storage.c.h, string);
        this.g.f().edit().putLong(y, System.currentTimeMillis()).putString(x, com.salesforce.marketingcloud.util.l.b(string)).apply();
        this.j.b().execute(new b("delete_old_registrations", new Object[0]));
    }

    public com.salesforce.marketingcloud.registration.c b(f fVar) {
        return new d(fVar, this.v, this.t, this.n, this.o, this.d);
    }

    public void a(String str, String str2, Map<String, String> map, Collection<String> collection) throws Exception {
        a(str, str2, map, collection, false);
    }

    public void b(boolean z) {
        this.s = z;
        g();
    }

    public void a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z) throws Exception {
        this.v = str;
        this.t = str2;
        this.n.clear();
        this.n.putAll(map);
        this.o.clear();
        this.o.addAll(collection);
        this.h.c(a.EnumC0346a.b);
        c(z);
    }

    public void a(int i, String str) {
        com.salesforce.marketingcloud.g.a(RegistrationManager.f17033a, "%s: %s", Integer.valueOf(i), str);
        this.j.b().execute(new c("schedule_registration_retry", new Object[0]));
    }

    private void a(@NonNull j jVar, @Nullable String str) {
        jVar.c().a(com.salesforce.marketingcloud.storage.c.d, str);
    }

    public static boolean a(Registration registration, @NonNull j jVar, boolean z) {
        if (registration == null) {
            return false;
        }
        if (registration.contactKey() == null && z) {
            com.salesforce.marketingcloud.g.e(RegistrationManager.f17033a, "You have delayRegistrationUntilContactKeyIsSet set to `true.`  The SDK will not send a registration to the Marketing Cloud until a contact key has been set.", new Object[0]);
            return false;
        }
        String string = jVar.f().getString(x, null);
        return string == null || !com.salesforce.marketingcloud.util.l.b(com.salesforce.marketingcloud.internal.k.b(registration).toString()).equals(string);
    }

    @VisibleForTesting
    @WorkerThread
    public static boolean a(@NonNull j jVar, boolean z) {
        try {
            return a(jVar.u().l(jVar.b()), jVar, z);
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "Failed to get Registration from local storage or we can not determine if this Registration contains any changes.", new Object[0]);
            return false;
        }
    }

    public static void a(j jVar, com.salesforce.marketingcloud.alarms.b bVar, boolean z) {
        if (z) {
            jVar.u().n();
            jVar.c().a(com.salesforce.marketingcloud.storage.c.d);
        }
        bVar.d(a.EnumC0346a.b);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.u)) {
            return;
        }
        this.u = str;
        g();
    }
}
