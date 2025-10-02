package com.salesforce.marketingcloud;

import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class i extends ModuleIdentity {

    @NotNull
    public static final a b = new a(null);

    @Nullable
    private static ModuleIdentity c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RegistrationManager f16918a;

    public static final class a {
        private a() {
        }

        @JvmStatic
        @Nullable
        public final ModuleIdentity a(@NotNull String applicationId, @NotNull RegistrationManager registrationManager) {
            Intrinsics.h(applicationId, "applicationId");
            Intrinsics.h(registrationManager, "registrationManager");
            if (i.c == null) {
                i.c = new i(applicationId, registrationManager, null);
            }
            return i.c;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private i(String str, RegistrationManager registrationManager) {
        super(ModuleIdentifier.PUSH, str);
        this.f16918a = registrationManager;
        if (registrationManager != null) {
            setProfileId(registrationManager.getContactKey());
            setInstallationId(registrationManager.getDeviceId());
            HashMap map = new HashMap();
            map.put("deviceId", registrationManager.getDeviceId());
            map.put(k.a.h, registrationManager.getAttributes());
            map.put(k.a.g, registrationManager.getTags());
            setCustomProperties(map);
        }
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity
    @NotNull
    public JSONObject customPropertiesToJson(@NotNull Map<String, ? extends Object> customProperties) throws JSONException {
        Intrinsics.h(customProperties, "customProperties");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", customProperties.get("deviceId"));
            Object obj = customProperties.get(k.a.h);
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any?, kotlin.Any?>");
            jSONObject.put(k.a.h, new JSONObject(TypeIntrinsics.b(obj)));
            jSONObject.put(k.a.g, new JSONArray((Collection) this.f16918a.getTags()));
            return jSONObject;
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", e.getMessage());
            return jSONObject2;
        }
    }

    public /* synthetic */ i(String str, RegistrationManager registrationManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, registrationManager);
    }

    @JvmStatic
    @Nullable
    public static final ModuleIdentity a(@NotNull String str, @NotNull RegistrationManager registrationManager) {
        return b.a(str, registrationManager);
    }
}
