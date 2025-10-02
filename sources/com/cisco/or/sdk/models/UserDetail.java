package com.cisco.or.sdk.models;

import android.util.Patterns;
import androidx.camera.core.impl.b;
import com.cisco.or.sdk.exceptions.EmailException;
import com.cisco.or.sdk.exceptions.PhoneNumberException;
import com.cisco.or.sdk.utils.ValidateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/models/UserDetail;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserDetail {

    /* renamed from: a, reason: collision with root package name */
    public final String f14043a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public UserDetail(String str, String str2, String str3, String str4, String str5) throws PhoneNumberException, EmailException {
        this.f14043a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if (str2.length() > 0 && (str2.length() == 0 || !Patterns.PHONE.matcher(str2).matches())) {
            throw new PhoneNumberException("Not a valid Phone Number.");
        }
        if (str3.length() > 0 && !ValidateUtil.a(str3)) {
            throw new EmailException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDetail)) {
            return false;
        }
        UserDetail userDetail = (UserDetail) obj;
        return Intrinsics.c(this.f14043a, userDetail.f14043a) && Intrinsics.c(this.b, userDetail.b) && Intrinsics.c(this.c, userDetail.c) && Intrinsics.c(this.d, userDetail.d) && Intrinsics.c(this.e, userDetail.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(b.c(b.c(this.f14043a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserDetail(name=");
        sb.append(this.f14043a);
        sb.append(", phone=");
        sb.append(this.b);
        sb.append(", email=");
        sb.append(this.c);
        sb.append(", age=");
        sb.append(this.d);
        sb.append(", zipCode=");
        return b.r(sb, this.e, ')');
    }
}
