package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaia {
    private List<zzaib> zza;

    public zzaia() {
        this.zza = new ArrayList();
    }

    public static zzaia zza(@Nullable JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaia(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject == null ? new zzaib() : new zzaib(Strings.emptyToNull(jSONObject.optString("federatedId")), Strings.emptyToNull(jSONObject.optString("displayName")), Strings.emptyToNull(jSONObject.optString("photoUrl")), Strings.emptyToNull(jSONObject.optString("providerId")), null, Strings.emptyToNull(jSONObject.optString("phoneNumber")), Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL))));
        }
        return new zzaia(arrayList);
    }

    private zzaia(List<zzaib> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.EMPTY_LIST;
        }
    }

    public final List<zzaib> zza() {
        return this.zza;
    }
}
