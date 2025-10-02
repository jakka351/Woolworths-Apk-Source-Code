package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/BraintreeError;", "Landroid/os/Parcelable;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class BraintreeError implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<BraintreeError> CREATOR = new BraintreeError$Companion$CREATOR$1();
    public String d;
    public String e;
    public List f;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/BraintreeError$Companion;", "", "", "CODE_KEY", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/BraintreeError;", "CREATOR", "Landroid/os/Parcelable$Creator;", "FIELD_ERRORS_KEY", "FIELD_KEY", "MESSAGE_KEY", "", "UNKNOWN_CODE", "I", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static void a(List list, JSONObject jSONObject, List list2) {
            BraintreeError braintreeError;
            String str = (String) list.get(0);
            if (list.size() == 1) {
                BraintreeError braintreeError2 = new BraintreeError();
                braintreeError2.d = str;
                braintreeError2.e = jSONObject.getString("message");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extensions");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.optInt("legacyCode", -1);
                }
                braintreeError2.f = new ArrayList();
                if (list2 != null) {
                    list2.add(braintreeError2);
                    return;
                }
                return;
            }
            List listSubList = list.subList(1, list.size());
            if (list2 != null) {
                Iterator it = list2.iterator();
                braintreeError = null;
                while (it.hasNext()) {
                    BraintreeError braintreeError3 = (BraintreeError) it.next();
                    if (Intrinsics.c(braintreeError3.d, str)) {
                        braintreeError = braintreeError3;
                    }
                }
                if (braintreeError == null) {
                    braintreeError = new BraintreeError();
                    braintreeError.d = str;
                    braintreeError.f = new ArrayList();
                    list2.add(braintreeError);
                }
            } else {
                braintreeError = null;
            }
            a(listSubList, jSONObject, braintreeError != null ? braintreeError.f : null);
        }

        public static ArrayList b(JSONArray jSONArray) throws JSONException {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extensions");
                        if (Intrinsics.c(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("errorType") : null, "user_error")) {
                            ArrayList arrayList2 = new ArrayList();
                            JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray("inputPath");
                            int length2 = jSONArray2.length();
                            for (int i2 = 1; i2 < length2; i2++) {
                                arrayList2.add(jSONArray2.getString(i2));
                            }
                            a(arrayList2, jSONObject, arrayList);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            return arrayList;
        }

        public static ArrayList c(JSONArray jSONArray) throws JSONException {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Intrinsics.g(jSONObject, "json.getJSONObject(i)");
                    BraintreeError braintreeError = new BraintreeError();
                    braintreeError.d = Json.a(jSONObject, "field", null);
                    braintreeError.e = Json.a(jSONObject, "message", null);
                    jSONObject.optInt("code", -1);
                    braintreeError.f = c(jSONObject.optJSONArray("fieldErrors"));
                    arrayList.add(braintreeError);
                } catch (JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("BraintreeError for ");
        sb.append(this.d);
        sb.append(": ");
        sb.append(this.e);
        sb.append(" -> ");
        List list = this.f;
        if (list == null || (string = list.toString()) == null) {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeTypedList(this.f);
    }
}
