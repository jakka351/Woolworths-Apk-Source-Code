package io.branch.referral;

import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class BranchLinkData extends JSONObject {

    /* renamed from: a, reason: collision with root package name */
    public Collection f23852a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public JSONObject g;
    public int h;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BranchLinkData branchLinkData = (BranchLinkData) obj;
        String str = this.b;
        if (str == null) {
            if (branchLinkData.b != null) {
                return false;
            }
        } else if (!str.equals(branchLinkData.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (branchLinkData.c != null) {
                return false;
            }
        } else if (!str2.equals(branchLinkData.c)) {
            return false;
        }
        String str3 = this.d;
        if (str3 == null) {
            if (branchLinkData.d != null) {
                return false;
            }
        } else if (!str3.equals(branchLinkData.d)) {
            return false;
        }
        String str4 = this.e;
        if (str4 == null) {
            if (branchLinkData.e != null) {
                return false;
            }
        } else if (!str4.equals(branchLinkData.e)) {
            return false;
        }
        String str5 = this.f;
        if (str5 == null) {
            if (branchLinkData.f != null) {
                return false;
            }
        } else if (!str5.equals(branchLinkData.f)) {
            return false;
        }
        if (this.h != branchLinkData.h) {
            return false;
        }
        Collection collection = this.f23852a;
        if (collection != null) {
            String string = collection.toString();
            Collection collection2 = branchLinkData.f23852a;
            if (!string.equals(collection2 != null ? collection2.toString() : null)) {
                return false;
            }
        } else if (branchLinkData.f23852a != null) {
            return false;
        }
        JSONObject jSONObject = this.g;
        if (jSONObject == null) {
            return branchLinkData.g == null;
        }
        String string2 = jSONObject.toString();
        JSONObject jSONObject2 = branchLinkData.g;
        return string2.equals(jSONObject2 != null ? jSONObject2.toString() : null);
    }

    public final JSONObject f() {
        return this.g;
    }

    public final String g() {
        return this.e;
    }

    public final Collection h() {
        return this.f23852a;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (361 + (str == null ? 0 : str.toLowerCase().hashCode())) * 19;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.toLowerCase().hashCode())) * 19;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.toLowerCase().hashCode())) * 19;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.toLowerCase().hashCode())) * 19;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.toLowerCase().hashCode())) * 19;
        JSONObject jSONObject = this.g;
        int iHashCode6 = ((iHashCode5 + (jSONObject != null ? jSONObject.toString().toLowerCase().hashCode() : 0)) * 19) + this.h;
        Collection collection = this.f23852a;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                iHashCode6 = (iHashCode6 * 19) + ((String) it.next()).toLowerCase().hashCode();
            }
        }
        return iHashCode6;
    }

    public final void i(String str) throws JSONException {
        if (str != null) {
            this.b = str;
            put("alias", str);
        }
    }

    public final void j(String str) throws JSONException {
        if (str != null) {
            this.f = str;
            put(NotificationResult.Notification.CAMPAIGN, str);
        }
    }

    public final void k(String str) throws JSONException {
        if (str != null) {
            this.c = str;
            put("channel", str);
        }
    }

    public final void l(int i) throws JSONException {
        if (i > 0) {
            this.h = i;
            put("duration", i);
        }
    }

    public final void m(String str) throws JSONException {
        if (str != null) {
            this.d = str;
            put("feature", str);
        }
    }

    public final void n(JSONObject jSONObject) throws JSONException {
        this.g = jSONObject;
        put("data", jSONObject);
    }

    public final void o() throws JSONException {
        put("source", "android");
    }

    public final void p(String str) throws JSONException {
        if (str != null) {
            this.e = str;
            put("stage", str);
        }
    }

    public final void q(Collection collection) throws JSONException {
        if (collection != null) {
            this.f23852a = collection;
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            put(k.a.g, jSONArray);
        }
    }
}
