package com.salesforce.marketingcloud.registration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.http.c;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.registration.e;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.h;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class d implements com.salesforce.marketingcloud.e, RegistrationManager, com.salesforce.marketingcloud.behaviors.b, b.InterfaceC0348b, c.InterfaceC0362c, e.f, EventSubscriber {
    private static final EnumSet<com.salesforce.marketingcloud.behaviors.a> o = EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_TIME_ZONE_CHANGED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_TOKEN_REFRESHED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED);
    private final Context d;
    private final MarketingCloudConfig e;
    private final j f;
    private final com.salesforce.marketingcloud.behaviors.c g;
    private final com.salesforce.marketingcloud.alarms.b h;
    private final com.salesforce.marketingcloud.http.c i;
    private final PushMessageManager j;
    private final l k;

    @Nullable
    private final SFMCSdkComponents l;
    private final f m;
    private e n;

    public class a implements com.salesforce.marketingcloud.storage.c {
        @Override // com.salesforce.marketingcloud.storage.c
        public void a() {
        }

        @Override // com.salesforce.marketingcloud.storage.c
        @Nullable
        public String b(String str, String str2) {
            return str2;
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public void a(String str) {
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public void a(String str, @NonNull String str2) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17035a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[a.EnumC0346a.values().length];
            b = iArr;
            try {
                iArr[a.EnumC0346a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f17035a = iArr2;
            try {
                iArr2[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_TIME_ZONE_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17035a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_TOKEN_REFRESHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class c implements RegistrationManager.Editor {
        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTag(String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(Iterable<String> iterable) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttribute(String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(Iterable<String> iterable) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearTags() {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        public boolean commit() {
            return false;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTag(String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(Iterable<String> iterable) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setAttribute(@NonNull String str, @NonNull String str2) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setContactKey(@NonNull String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setSignedString(@NonNull String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(String... strArr) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(String... strArr) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(String... strArr) {
            return this;
        }
    }

    public d(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull f fVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar) {
        this(context, marketingCloudConfig, jVar, fVar, cVar, bVar, cVar2, pushMessageManager, lVar, (SFMCSdkComponents) null);
    }

    @Nullable
    public static String a(@NonNull j jVar) {
        return jVar.c().b(com.salesforce.marketingcloud.storage.c.d, null);
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "RegistrationManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        e eVar = this.n;
        return eVar != null ? eVar.d() : new JSONObject();
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i) {
        if (!com.salesforce.marketingcloud.b.a(i, 2)) {
            if (this.n == null) {
                a((InitializationStatus.a) null);
                this.n.g();
                return;
            }
            return;
        }
        this.n = null;
        e.a(this.f, this.h, com.salesforce.marketingcloud.b.c(i, 2));
        this.g.a(this);
        a();
        this.h.e(a.EnumC0346a.b);
        this.i.a(com.salesforce.marketingcloud.http.a.o);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public RegistrationManager.Editor edit() {
        e eVar = this.n;
        return eVar != null ? eVar.a(this) : new c();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Map<String, String> getAttributes() {
        e eVar = this.n;
        return eVar != null ? eVar.getAttributes() : Collections.EMPTY_MAP;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getContactKey() {
        e eVar = this.n;
        if (eVar != null) {
            return eVar.getContactKey();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public String getDeviceId() {
        e eVar = this.n;
        return eVar != null ? eVar.getDeviceId() : "";
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSignedString() {
        e eVar = this.n;
        if (eVar != null) {
            return eVar.getSignedString();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSystemToken() {
        e eVar = this.n;
        if (eVar != null) {
            return eVar.getSystemToken();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Set<String> getTags() {
        e eVar = this.n;
        return eVar != null ? eVar.getTags() : Collections.EMPTY_SET;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i) {
        if (com.salesforce.marketingcloud.b.b(i, 2)) {
            a(aVar);
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public final void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        if (this.n != null) {
            switch (b.f17035a[aVar.ordinal()]) {
                case 1:
                    this.n.c();
                    break;
                case 2:
                    this.n.h();
                    break;
                case 3:
                    this.n.b(bundle.getBoolean(PushMessageManager.h));
                    break;
                case 4:
                case 5:
                case 6:
                    this.n.b();
                    break;
                case 7:
                    this.n.a();
                    break;
                case 8:
                    this.n.a(bundle.getString(PushMessageManager.i, ""));
                    break;
                default:
                    g.a(RegistrationManager.f17033a, "Unhandled behavior: %s", aVar);
                    break;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber
    public void onEventPublished(@NonNull Event... eventArr) throws JSONException {
        for (com.salesforce.marketingcloud.events.Event event : com.salesforce.marketingcloud.events.d.a(eventArr, (EnumSet<Event.Producer>) EnumSet.of(Event.Producer.SFMC_SDK), (EnumSet<Event.Category>) EnumSet.of(Event.Category.IDENTITY))) {
            try {
                Object obj = event.attributes().get("moduleIdentities");
                Objects.requireNonNull(obj);
                JSONObject jSONObject = (JSONObject) ((JSONObject) obj).get(ModuleIdentifier.PUSH.name().toLowerCase());
                JSONObject jSONObject2 = jSONObject.getJSONObject("customProperties").getJSONObject(k.a.h);
                Iterator<String> itKeys = jSONObject2.keys();
                HashMap map = new HashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, (String) jSONObject2.get(next));
                }
                String strOptString = jSONObject.optString("profileId", null);
                (strOptString != null ? this.n.b(this).a(strOptString, (Map<String, String>) map, false) : this.n.b(this).a((Map<String, String>) map, false)).commit();
            } catch (Exception e) {
                g.e(RegistrationManager.f17033a, e, "Failed to parse event for identity update.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void registerForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        e eVar = this.n;
        if (eVar != null) {
            eVar.registerForRegistrationEvents(registrationEventListener);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        com.salesforce.marketingcloud.alarms.b bVar = this.h;
        a.EnumC0346a enumC0346a = a.EnumC0346a.b;
        bVar.d(enumC0346a);
        this.h.e(enumC0346a);
        this.g.a(this);
        a();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void unregisterForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        e eVar = this.n;
        if (eVar != null) {
            eVar.unregisterForRegistrationEvents(registrationEventListener);
        }
    }

    public d(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull f fVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar, @Nullable SFMCSdkComponents sFMCSdkComponents) {
        this.d = context;
        this.e = marketingCloudConfig;
        this.f = jVar;
        this.m = fVar;
        this.g = cVar;
        this.h = bVar;
        this.i = cVar2;
        this.j = pushMessageManager;
        this.k = lVar;
        this.l = sFMCSdkComponents;
    }

    private void a(InitializationStatus.a aVar) {
        this.g.a(this, o);
        this.h.a(this, a.EnumC0346a.b);
        this.i.a(com.salesforce.marketingcloud.http.a.o, this);
        SFMCSdkComponents sFMCSdkComponents = this.l;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().subscribe(this);
        }
        try {
            this.n = new e(this.d, this.e, this.f, this.m, this.h, this.i, this.j, this.k, this.l);
        } catch (Exception e) {
            if (aVar != null) {
                aVar.a(e);
            }
        }
    }

    @VisibleForTesting
    public d(e eVar, Context context, MarketingCloudConfig marketingCloudConfig, j jVar, f fVar, com.salesforce.marketingcloud.behaviors.c cVar, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.http.c cVar2, PushMessageManager pushMessageManager, l lVar) {
        this.n = eVar;
        this.d = context;
        this.e = marketingCloudConfig;
        this.f = jVar;
        this.m = fVar;
        this.g = cVar;
        this.h = bVar;
        this.i = cVar2;
        this.j = pushMessageManager;
        this.k = lVar;
        this.l = null;
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    public final void a(@NonNull a.EnumC0346a enumC0346a) {
        e eVar;
        if (b.b[enumC0346a.ordinal()] == 1 && (eVar = this.n) != null) {
            eVar.e();
        }
    }

    @Override // com.salesforce.marketingcloud.registration.e.f
    public void a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z) {
        e eVar = this.n;
        if (eVar != null) {
            try {
                eVar.a(str, str2, map, collection, z);
            } catch (Exception e) {
                g.b(RegistrationManager.f17033a, e, "Error encountered while saving registration", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (this.n != null) {
            if (!dVar.g()) {
                this.n.a(dVar.b(), dVar.e());
                return;
            }
            try {
                this.n.a(com.salesforce.marketingcloud.internal.k.a(new JSONObject(bVar.o())), dVar.d());
            } catch (Exception unused) {
                this.n.a(-1, "Failed to convert our Response Body into a Registration.");
            }
        }
    }

    public static com.salesforce.marketingcloud.http.d a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull Context context, @NonNull @Size String str, @Nullable String str2) {
        String sdkVersionName = MarketingCloudSdk.getSdkVersionName();
        String strA = h.a(context);
        boolean zInDaylightTime = TimeZone.getDefault().inDaylightTime(new Date());
        String str3 = Build.VERSION.RELEASE;
        int iB = com.salesforce.marketingcloud.util.l.b();
        Locale locale = Locale.ENGLISH;
        return com.salesforce.marketingcloud.http.a.o.a(marketingCloudConfig, new a(), a(new Registration(0, null, str, null, sdkVersionName, strA, zInDaylightTime, false, false, str3, false, iB, null, "Android", androidx.camera.core.impl.b.o(Build.MANUFACTURER, " ", Build.MODEL), marketingCloudConfig.applicationId(), Locale.getDefault().toString(), Collections.EMPTY_SET, Collections.EMPTY_MAP), str2)).j();
    }

    public static String a(Registration registration, @Nullable String str) {
        try {
            return com.salesforce.marketingcloud.internal.k.b(registration).put("registrationDateUtc", com.salesforce.marketingcloud.util.l.a(new Date())).put("quietPushEnabled", false).putOpt("registrationId", str).toString();
        } catch (Exception e) {
            g.b(RegistrationManager.f17033a, e, "Unable to create registration request payload", new Object[0]);
            return null;
        }
    }

    private void a() {
        SFMCSdkComponents sFMCSdkComponents = this.l;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().unsubscribe(this);
        }
    }
}
