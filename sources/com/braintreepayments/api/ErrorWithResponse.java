package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.braintreepayments.api.BraintreeError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/ErrorWithResponse;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroid/os/Parcelable;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class ErrorWithResponse extends Exception implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ErrorWithResponse> CREATOR = new ErrorWithResponse$Companion$CREATOR$1();
    public int d;
    public String e;
    public String f;
    public ArrayList g;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/braintreepayments/api/ErrorWithResponse$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/ErrorWithResponse;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "ERROR_KEY", "Ljava/lang/String;", "FIELD_ERRORS_KEY", "", "GRAPHQL_ERROR_CODE", "I", "MESSAGE_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public ErrorWithResponse(int i, String str) {
        this.d = i;
        this.f = str;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.e = jSONObject.getJSONObject("error").getString("message");
                this.g = BraintreeError.Companion.c(jSONObject.optJSONArray("fieldErrors"));
            } catch (JSONException unused) {
                this.e = "Parsing error response failed";
                this.g = new ArrayList();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return StringsKt.m0("\n            ErrorWithResponse (" + this.d + "): " + this.e + "\n            " + this.g + "\n        ");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeTypedList(this.g);
    }
}
