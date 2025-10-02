package com.google.firebase.auth.internal;

import YU.a;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import io.jsonwebtoken.JwtParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class zzbh {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f15200a = new Logger("JSONParser", new String[0]);

    public static ArrayMap a(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayMap.put(next, objA);
        }
        return arrayMap;
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objA = jSONArray.get(i);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    public static Map c(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = com.google.android.gms.internal.p002firebaseauthapi.zzt.zza(JwtParser.SEPARATOR_CHAR).zza((CharSequence) str);
        int size = listZza.size();
        Logger logger = f15200a;
        if (size < 2) {
            logger.e(a.A("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            ArrayMap arrayMapD = d(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
            return arrayMapD == null ? new HashMap() : arrayMapD;
        } catch (UnsupportedEncodingException e) {
            logger.e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    public static ArrayMap d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e);
        }
    }
}
