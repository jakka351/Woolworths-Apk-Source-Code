package com.adobe.mobile;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.compose.ui.input.pointer.a;
import com.adobe.mobile.Messages;
import com.adobe.mobile.StaticMethods;
import com.google.android.gms.common.internal.ImagesContract;
import com.salesforce.marketingcloud.messages.iam.j;
import com.salesforce.marketingcloud.storage.db.m;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
abstract class Message {
    public static final Map m;
    public static HashMap n;
    public static final Object o;
    public static final boolean[] p;
    public static final Map q;

    /* renamed from: a, reason: collision with root package name */
    public String f13268a;
    public Messages.MessageShowRule b;
    public Date c;
    public Date d;
    public boolean e;
    public boolean f;
    public int g;
    public ArrayList h;
    public final SecureRandom i = new SecureRandom();
    public ArrayList j;
    public ArrayList k;
    public HashMap l;

    /* renamed from: com.adobe.mobile.Message$1, reason: invalid class name */
    public static class AnonymousClass1 extends HashMap<String, Class> {
    }

    /* renamed from: com.adobe.mobile.Message$2, reason: invalid class name */
    public static class AnonymousClass2 extends HashMap<String, Messages.MessageShowRule> {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put(ImagesContract.LOCAL, MessageLocalNotification.class);
        anonymousClass1.put("alert", MessageAlert.class);
        anonymousClass1.put("fullscreen", MessageFullScreen.class);
        anonymousClass1.put("callback", MessageTemplateCallback.class);
        anonymousClass1.put("pii", MessageTemplatePii.class);
        anonymousClass1.put("openUrl", MessageOpenURL.class);
        m = anonymousClass1;
        o = new Object();
        p = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put(j.h, Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNKNOWN);
        anonymousClass2.put("always", Messages.MessageShowRule.MESSAGE_SHOW_RULE_ALWAYS);
        anonymousClass2.put("once", Messages.MessageShowRule.MESSAGE_SHOW_RULE_ONCE);
        anonymousClass2.put("untilClick", Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNTIL_CLICK);
        q = anonymousClass2;
    }

    public static ArrayList e(String str) throws UnsupportedEncodingException {
        if (str == null || str.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(32);
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) == '{') {
                int i2 = i + 1;
                while (i2 < length && str.charAt(i2) != '}') {
                    i2++;
                }
                if (i2 == length) {
                    break;
                }
                String strSubstring = str.substring(i, i2 + 1);
                try {
                    byte[] bytes = a.h(1, 1, strSubstring).getBytes("UTF-8");
                    int length2 = bytes.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            arrayList.add(strSubstring);
                            i = i2;
                            break;
                        }
                        if (!p[bytes[i3] & 255]) {
                            break;
                        }
                        i3++;
                    }
                } catch (UnsupportedEncodingException e) {
                    StaticMethods.J("Data Callback - Unable to validate token (%s)", e.getLocalizedMessage());
                }
            }
            i++;
        }
        return arrayList;
    }

    public static HashMap h() {
        try {
            String string = StaticMethods.B().getString("messagesBlackList", null);
            return string == null ? new HashMap() : i(string);
        } catch (StaticMethods.NullContextException e) {
            StaticMethods.I("Messaging - Unable to get shared preferences while loading blacklist. (%s)", e.getMessage());
            return new HashMap();
        }
    }

    public static HashMap i(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, Integer.valueOf(jSONObject.getInt(next)));
            }
            return map;
        } catch (JSONException e) {
            StaticMethods.J("Messages- Unable to deserialize blacklist(%s)", e.getMessage());
            return map;
        }
    }

    public static Message k(JSONObject jSONObject) {
        String string = "";
        try {
            string = jSONObject.getString("template");
            Message message = (Message) ((Class) ((HashMap) m).get(string)).newInstance();
            if (message.f(jSONObject)) {
                return message;
            }
            return null;
        } catch (IllegalAccessException e) {
            StaticMethods.K("Messages - unable to create instance of message (%s)", e.getMessage());
            return null;
        } catch (InstantiationException e2) {
            StaticMethods.K("Messages - unable to create instance of message (%s)", e2.getMessage());
            return null;
        } catch (NullPointerException unused) {
            StaticMethods.K("Messages - invalid template specified for message (%s)", string);
            return null;
        } catch (JSONException unused2) {
            StaticMethods.K("Messages - template is required for in-app message", new Object[0]);
            return null;
        }
    }

    public final void a() {
        synchronized (o) {
            try {
                if (n == null) {
                    n = h();
                }
                n.put(this.f13268a, Integer.valueOf(this.b.d));
                StaticMethods.I("Messages - adding message \"%s\" to blacklist", this.f13268a);
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.putString("messagesBlackList", new JSONObject(n).toString());
                    editorC.commit();
                } catch (StaticMethods.NullContextException e) {
                    StaticMethods.J("Messages - Error persisting blacklist map (%s).", e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashMap b(ArrayList arrayList, boolean z) throws UnsupportedEncodingException {
        if (arrayList == null || arrayList.isEmpty()) {
            return new HashMap();
        }
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = this.l.get(str.substring(1, str.length() - 1).toLowerCase());
            String string = obj == null ? "" : obj.toString();
            if (z) {
                string = StaticMethods.a(string);
            }
            map.put(str, string);
        }
        return map;
    }

    public final void c() {
        HashMap map = new HashMap();
        map.put("a.message.id", this.f13268a);
        map.put("a.message.clicked", 1);
        AnalyticsTrackInternal.a("In-App Message", map, StaticMethods.E());
        if (this.b == Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNTIL_CLICK) {
            a();
        }
        Messages.c(null);
    }

    public final String d() {
        return "Message ID: " + this.f13268a + "; Show Rule: " + this.b.toString() + "; Blacklisted: " + g();
    }

    public boolean f(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                String string = jSONObject.getString("messageId");
                this.f13268a = string;
                if (string.length() <= 0) {
                    StaticMethods.K("Messages - Unable to create message, messageId is empty", new Object[0]);
                    return false;
                }
                try {
                    String string2 = jSONObject.getString("showRule");
                    Messages.MessageShowRule messageShowRule = (Messages.MessageShowRule) ((HashMap) q).get(string2);
                    this.b = messageShowRule;
                    if (messageShowRule == null || messageShowRule == Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNKNOWN) {
                        StaticMethods.K("Messages - Unable to create message \"%s\", showRule not valid (%s)", this.f13268a, string2);
                        return false;
                    }
                    try {
                        this.c = new Date(jSONObject.getLong("startDate") * 1000);
                    } catch (JSONException unused) {
                        StaticMethods.I("Messages - Tried to read startDate from message \"%s\" but none found. Using default value", this.f13268a);
                        this.c = new Date(0L);
                    }
                    try {
                        this.d = new Date(jSONObject.getLong("endDate") * 1000);
                    } catch (JSONException unused2) {
                        StaticMethods.I("Messages - Tried to read endDate from message \"%s\" but none found. Using default value", this.f13268a);
                    }
                    try {
                        this.e = jSONObject.getBoolean("showOffline");
                    } catch (JSONException unused3) {
                        StaticMethods.I("Messages - Tried to read showOffline from message \"%s\" but none found. Using default value", this.f13268a);
                        this.e = false;
                    }
                    this.j = new ArrayList();
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("audiences");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            this.j.add(MessageMatcher.c(jSONArray.getJSONObject(i)));
                        }
                    } catch (JSONException e) {
                        StaticMethods.I("Messages - failed to read audience for message \"%s\", error: %s", this.f13268a, e.getMessage());
                    }
                    this.k = new ArrayList();
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(m.g);
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            this.k.add(MessageMatcher.c(jSONArray2.getJSONObject(i2)));
                        }
                    } catch (JSONException e2) {
                        StaticMethods.I("Messages - failed to read trigger for message \"%s\", error: %s", this.f13268a, e2.getMessage());
                    }
                    if (this.k.size() <= 0) {
                        StaticMethods.K("Messages - Unable to load message \"%s\" - at least one valid trigger is required for a message", this.f13268a);
                        return false;
                    }
                    this.f = false;
                    return true;
                } catch (JSONException unused4) {
                    StaticMethods.K("Messages - Unable to create message \"%s\", showRule is required", this.f13268a);
                    return false;
                }
            } catch (JSONException unused5) {
                StaticMethods.K("Messages - Unable to create message, messageId is required", new Object[0]);
            }
        }
        return false;
    }

    public final boolean g() {
        boolean z;
        synchronized (o) {
            try {
                if (n == null) {
                    n = h();
                }
                z = n.get(this.f13268a) != null;
            } finally {
            }
        }
        return z;
    }

    public final void j() {
        HashMap map = new HashMap();
        map.put("a.message.id", this.f13268a);
        map.put("a.message.triggered", 1);
        AnalyticsTrackInternal.a("In-App Message", map, StaticMethods.E());
    }

    public final void l() {
        if (g()) {
            synchronized (o) {
                n.remove(this.f13268a);
                StaticMethods.I("Messages - removing message \"%s\" from blacklist", this.f13268a);
                try {
                    SharedPreferences.Editor editorC = StaticMethods.C();
                    editorC.putString("messagesBlackList", new JSONObject(n).toString());
                    editorC.commit();
                } catch (StaticMethods.NullContextException e) {
                    StaticMethods.J("Messages - Error persisting blacklist map (%s).", e.getMessage());
                }
            }
        }
    }

    public final boolean m(HashMap map, HashMap map2, Map map3) throws UnsupportedEncodingException {
        Message message;
        Locale locale;
        Date date;
        Configuration configuration;
        if (this.f && this.g != StaticMethods.r() && (this instanceof MessageAlert)) {
            return true;
        }
        synchronized (Messages.f) {
            message = Messages.e;
        }
        if (message == null || (this instanceof MessageLocalNotification) || (this instanceof MessageTemplateCallback)) {
            HashMap map4 = map2 != null ? new HashMap(map2) : new HashMap();
            if (map != null) {
                map4.putAll(map);
            }
            if (map4.size() > 0) {
                HashMap map5 = new HashMap(9);
                map5.put("%sdkver%", "4.17.9-AN");
                map5.put("%cachebust%", String.valueOf(this.i.nextInt(100000000)));
                StaticMethods.h();
                map5.put("%adid%", null);
                map5.put("%timestampu%", String.valueOf(StaticMethods.E()));
                Date date2 = new Date();
                try {
                    Resources resources = StaticMethods.A().getResources();
                    if (resources == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null) {
                        locale = Locale.US;
                    }
                } catch (StaticMethods.NullContextException e) {
                    StaticMethods.J("Config - Error getting application resources for device locale. (%s)", e.getMessage());
                    locale = Locale.US;
                }
                map5.put("%timestampz%", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", locale).format(date2));
                synchronized (StaticMethods.u) {
                }
                map5.put("%pushid%", null);
                map5.put("%mcid%", VisitorIDService.i().g() != null ? VisitorIDService.i().g() : "");
                ArrayList arrayList = new ArrayList();
                HashMap map6 = new HashMap();
                for (Map.Entry entry : map4.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String string = value == null ? "" : value.toString();
                        arrayList.add(StaticMethods.a(str) + "=" + StaticMethods.a(string));
                        map6.put(str, string);
                    }
                }
                map5.put("%all_url%", TextUtils.join("&", arrayList));
                try {
                    String string2 = new JSONObject(map6).toString();
                    if (string2.length() > 0) {
                        map5.put("%all_json%", string2);
                    }
                } catch (NullPointerException e2) {
                    StaticMethods.I("Data Callback - unable to create json string for vars:  (%s)", e2.getLocalizedMessage());
                }
                map4.putAll(map5);
                if (map3 != null) {
                    map4.putAll(map3);
                }
                this.l = new HashMap(map4);
                if (!g() && (MobileConfig.b().n() || !MobileConfig.b().b || this.e)) {
                    Date date3 = new Date(StaticMethods.E() * 1000);
                    if (!date3.before(this.c) && ((date = this.d) == null || !date3.after(date))) {
                        Iterator it = this.j.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                HashMap mapD = StaticMethods.d(map2);
                                Iterator it2 = this.k.iterator();
                                while (it2.hasNext()) {
                                    if (!((MessageMatcher) it2.next()).b(map, mapD)) {
                                    }
                                }
                                return true;
                            }
                            if (!((MessageMatcher) it.next()).b(map3)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void n() {
        this.g = StaticMethods.r();
        if (this.b == Messages.MessageShowRule.MESSAGE_SHOW_RULE_ONCE) {
            a();
        }
        if ((this instanceof MessageAlert) || (this instanceof MessageFullScreen)) {
            Messages.c(this);
        }
    }

    public final void o() {
        HashMap map = new HashMap();
        map.put("a.message.id", this.f13268a);
        map.put("a.message.viewed", 1);
        AnalyticsTrackInternal.a("In-App Message", map, StaticMethods.E());
        Messages.c(null);
    }
}
