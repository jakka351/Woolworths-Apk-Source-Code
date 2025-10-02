package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0019\u001a\u00020\u001a2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH&J\u0006\u0010\u001c\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR@\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/ModuleIdentity;", "", "moduleName", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "applicationId", "", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "value", "", "customProperties", "getCustomProperties", "()Ljava/util/Map;", "setCustomProperties", "(Ljava/util/Map;)V", "installationId", "getInstallationId", "setInstallationId", "(Ljava/lang/String;)V", "getModuleName", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "profileId", "getProfileId", "setProfileId", "customPropertiesToJson", "Lorg/json/JSONObject;", "", "toJson", "toString", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ModuleIdentity {

    @NotNull
    private final String applicationId;

    @NotNull
    private Map<String, Object> customProperties;

    @Nullable
    private String installationId;

    @NotNull
    private final ModuleIdentifier moduleName;

    @Nullable
    private String profileId;

    public ModuleIdentity(@NotNull ModuleIdentifier moduleName, @NotNull String applicationId) {
        Intrinsics.h(moduleName, "moduleName");
        Intrinsics.h(applicationId, "applicationId");
        this.moduleName = moduleName;
        this.applicationId = applicationId;
        this.customProperties = new LinkedHashMap();
    }

    @NotNull
    public abstract JSONObject customPropertiesToJson(@NotNull Map<String, ? extends Object> customProperties);

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final Map<String, Object> getCustomProperties() {
        return this.customProperties;
    }

    @Nullable
    public final String getInstallationId() {
        return this.installationId;
    }

    @NotNull
    public final ModuleIdentifier getModuleName() {
        return this.moduleName;
    }

    @Nullable
    public final String getProfileId() {
        return this.profileId;
    }

    public final void setCustomProperties(@NotNull Map<String, Object> value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.customProperties)) {
            return;
        }
        this.customProperties = value;
    }

    public final void setInstallationId(@Nullable String str) {
        if (Intrinsics.c(str, this.installationId)) {
            return;
        }
        this.installationId = str;
    }

    public final void setProfileId(@Nullable String str) {
        if (Intrinsics.c(str, this.profileId)) {
            return;
        }
        this.profileId = str;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("profileId", this.profileId);
        jSONObject.put("applicationId", this.applicationId);
        jSONObject.put("installationId", this.installationId);
        jSONObject.put("customProperties", customPropertiesToJson(this.customProperties));
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String string = toJson().toString();
        Intrinsics.g(string, "toJson().toString()");
        return string;
    }
}
