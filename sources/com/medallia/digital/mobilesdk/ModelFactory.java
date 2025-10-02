package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import androidx.databinding.ObservableArrayList;
import com.medallia.digital.mobilesdk.h4;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ModelFactory {
    private static ModelFactory modelFactory;

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private boolean validate(b bVar) {
        h4.a aVar;
        if (bVar.c() == null) {
            aVar = h4.a.o;
        } else if (bVar.d() == -1) {
            aVar = h4.a.p;
        } else if (bVar.b() == -1) {
            aVar = h4.a.q;
        } else if (bVar.e() == -1) {
            aVar = h4.a.r;
        } else {
            if (bVar.a() != null) {
                return true;
            }
            aVar = h4.a.s;
        }
        a4.f(aVar.toString());
        return false;
    }

    private void validateConfiguration(ConfigurationContract configurationContract) throws SecurityException {
        if (configurationContract != null) {
            configurationContract.validateFields();
        } else {
            a4.f(h4.a.y.toString());
        }
    }

    private void validateFeedback(a2 a2Var) {
        if (a2Var == null || a2Var.a() == null) {
            a4.f(h4.a.H.toString());
        }
    }

    private void validatePropertyConfiguration(PropertyConfigurationContract propertyConfigurationContract) throws SecurityException {
        if (propertyConfigurationContract != null) {
            propertyConfigurationContract.validateFields();
        } else {
            a4.f(h4.a.y.toString());
        }
    }

    public b createAccessToken(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            } catch (Exception e) {
                a4.c(h4.a.n + e.getMessage());
            }
            str = jSONObject.has("accessToken") ? jSONObject.get("accessToken").toString() : null;
            b bVar = new b(str);
            bVar.a(str);
            if (validate(bVar)) {
                return bVar;
            }
        }
        a4.c(h4.a.n.toString());
        return null;
    }

    public n createApiToken(String str) {
        if (TextUtils.isEmpty(str)) {
            a4.f(h4.a.d.toString());
        } else {
            try {
                n nVar = new n(str);
                nVar.a(str);
                if (validate(nVar)) {
                    return nVar;
                }
                return null;
            } catch (Exception e) {
                a4.c(h4.a.d + e.getMessage());
            }
        }
        return null;
    }

    public ConfigurationContract createConfiguration(String str) {
        try {
            ConfigurationContract configurationContract = new ConfigurationContract(new JSONObject(str));
            validateConfiguration(configurationContract);
            return configurationContract;
        } catch (Exception e) {
            a4.c(h4.a.y + e.getMessage());
            return null;
        }
    }

    public EvaluationResult createEvaluationResult(String str) {
        if (str != null && !str.equals("null")) {
            try {
                return new EvaluationResult(new JSONObject(str));
            } catch (Exception e) {
                a4.f(e.getMessage());
            }
        }
        return null;
    }

    public a2 createFeedback(String str) {
        try {
            a2 a2Var = new a2(new JSONObject(str));
            validateFeedback(a2Var);
            return a2Var;
        } catch (Exception e) {
            a4.c(h4.a.H + e.getMessage());
            return null;
        }
    }

    public b2 createFeedbackContract(String str) {
        try {
            return new b2(new JSONObject(str));
        } catch (Exception e) {
            a4.c(h4.a.L + e.getMessage());
            return null;
        }
    }

    public PropertyConfigurationContract createPropertyConfiguration(String str) {
        try {
            PropertyConfigurationContract propertyConfigurationContract = new PropertyConfigurationContract(new JSONObject(str));
            validatePropertyConfiguration(propertyConfigurationContract);
            return propertyConfigurationContract;
        } catch (Exception e) {
            a4.c(h4.a.y + e.getMessage());
            return null;
        }
    }

    public f6 createQuarantineValidation(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new f6(new JSONObject(str));
        } catch (JSONException e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    public TargetRuleEngineContract createTargetRuleEngine(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new TargetRuleEngineContract(new JSONObject(str));
        } catch (Exception e) {
            a4.f(e.getMessage());
            return null;
        }
    }

    public r7 createThankYouDataObject(String str) {
        r7 r7Var = new r7();
        if (str != null) {
            try {
                return new r7(new JSONObject(str).getJSONObject("settings").getJSONObject("formMobileThankYouPromptSettingsContract"));
            } catch (Exception e) {
                a4.f(e.getMessage());
            }
        }
        return r7Var;
    }

    public c8 createTransitionType(String str) throws JSONException {
        String string;
        if (str != null) {
            try {
                string = new JSONObject(str).getJSONObject("settings").getJSONObject("formBasicSettings").getString("transitionType");
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        } else {
            string = null;
        }
        return c8.a(string);
    }

    public ConfigurationUUID createUUID(String str) {
        try {
            return new ConfigurationUUID(new JSONObject(str));
        } catch (Exception e) {
            a4.c(h4.a.u + e.getMessage());
            return null;
        }
    }

    public String customParameterContractsToJsonString(List<c1> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public JSONArray customParametersToJsonArray(ArrayList<CustomParameter> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<CustomParameter> it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectD = it.next().d();
            if (jSONObjectD != null) {
                jSONArray.put(jSONObjectD);
            }
        }
        return jSONArray;
    }

    public String getAnalyticsAsJsonString(List<k> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public List<AppRatingContract> getAppRatingContractsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new AppRatingContract(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String getAppRatingsAsJsonString(List<AppRatingContract> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public String getCUuid(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("uuid") || jSONObject.isNull("uuid")) {
                return null;
            }
            return jSONObject.getString("uuid");
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    public ArrayList<Component> getComponentsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<Component> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new Component(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public <T> ArrayList<T> getContractArray(String str, JSONArray jSONArray) throws NoSuchMethodException, SecurityException {
        if (jSONArray == null) {
            return null;
        }
        ObservableArrayList observableArrayList = (ArrayList<T>) new ArrayList();
        try {
            Constructor<?> constructor = Class.forName(str).getConstructor(JSONObject.class);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    observableArrayList.add(constructor.newInstance(jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    a4.c(e.getMessage());
                }
            }
            return observableArrayList;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return observableArrayList;
        }
    }

    public <K> String getContractsAsJsonString(List<K> list) {
        if (list == null) {
            return "null";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < list.size(); i++) {
                sb.append(((x0) list.get(i)).toJsonString());
                if (i < list.size() - 1) {
                    sb.append(',');
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "null";
        }
    }

    public ArrayList<CustomParameter> getCustomParameterArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<CustomParameter> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new CustomParameter(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public ArrayList<c1> getCustomParameterContractArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<c1> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new c1(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public List<SDKConfigurationFormContract> getFormContractsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new SDKConfigurationFormContract(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String getFormsAsJsonString(List<SDKConfigurationFormContract> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public ArrayList<t5> getPageArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<t5> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new t5(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String getProvisionsAsJsonString(HashMap<String, Boolean> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":");
                sb.append(map.get(arrayList.get(i)));
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public List<ResourceContract> getResourcesArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new ResourceContract(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String getResourcesAsJsonString(List<ResourceContract> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public ArrayList<p6> getRuleConversionContract(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<p6> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new p6(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String getRuleConversionsAsJsonString(List<p6> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public ArrayList<g6> getRulesArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<g6> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(new g6(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public ArrayList<String> getStringArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String getStringArrayAsJsonString(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(arrayList.get(i));
                sb.append("\"");
            }
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public HashMap<String, Boolean> getStringBooleanMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Boolean> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : Boolean.valueOf(jSONObject.getBoolean(next)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return map;
    }

    public HashMap<String, Long> getStringLongMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Long> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : Long.valueOf(jSONObject.getLong(next)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return map;
    }

    public String getStringLongMapAsJsonString(HashMap<String, Long> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":\"");
                sb.append(map.get(arrayList.get(i)));
                sb.append("\"");
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public HashMap<String, String> getStringMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return map;
    }

    public String getStringMapAsJsonString(HashMap<String, String> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":\"");
                sb.append(map.get(arrayList.get(i)));
                sb.append("\"");
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public HashMap<String, t7> getStringThemeMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, t7> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : new t7(jSONObject.getJSONObject(next)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return map;
    }

    public String getThemesMapAsJsonString(HashMap<String, t7> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":");
                sb.append(map.get(arrayList.get(i)).b());
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public <T> e8<T> getTriggerChildContract(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("left") ? new g8(jSONObject) : new f8(jSONObject);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    public <T> ArrayList<e8<T>> getTriggerChildesContract(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<e8<T>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getJSONObject(i).has("left") ? new g8<>(jSONArray.getJSONObject(i)) : new f8<>(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                a4.c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String rulesAsJsoString(List<g6> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private boolean validate(n nVar) {
        h4.a aVar;
        if (TextUtils.isEmpty(nVar.b())) {
            aVar = h4.a.g;
        } else if (nVar.c() == -1) {
            aVar = h4.a.e;
        } else {
            if (!TextUtils.isEmpty(nVar.a())) {
                return true;
            }
            aVar = h4.a.f;
        }
        a4.f(aVar.toString());
        return false;
    }
}
