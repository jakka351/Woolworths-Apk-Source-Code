package com.braintreepayments.api;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/BraintreeOptions;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final /* data */ class BraintreeOptions {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13706a;
    public final String b;
    public final Uri c;
    public final String d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BraintreeOptions(@NotNull Context context) {
        this(context, null, 126);
        Intrinsics.h(context, "context");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BraintreeOptions)) {
            return false;
        }
        BraintreeOptions braintreeOptions = (BraintreeOptions) obj;
        return Intrinsics.c(this.f13706a, braintreeOptions.f13706a) && Intrinsics.c(this.b, braintreeOptions.b) && Intrinsics.c(this.c, braintreeOptions.c) && Intrinsics.c(this.d, braintreeOptions.d);
    }

    public final int hashCode() {
        int iHashCode = this.f13706a.hashCode() * 961;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.c;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.d;
        return (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BraintreeOptions(context=");
        sb.append(this.f13706a);
        sb.append(", sessionId=null, returnUrlScheme=");
        sb.append(this.b);
        sb.append(", appLinkReturnUri=");
        sb.append(this.c);
        sb.append(", initialAuthString=");
        return YU.a.o(sb, this.d, ", clientTokenProvider=null, integrationType=null)");
    }

    public BraintreeOptions(Context context, String str, int i) {
        str = (i & 16) != 0 ? null : str;
        Intrinsics.h(context, "context");
        this.f13706a = context;
        this.b = null;
        this.c = null;
        this.d = str;
    }
}
