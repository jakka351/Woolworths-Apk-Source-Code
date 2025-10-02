package com.woolworths.scanlibrary.data.authentication;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/authentication/AuthenticatedUser;", "", "AuthenticatedUserData", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthenticatedUser {
    public static final /* synthetic */ KProperty[] i;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 f21150a;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 b;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 c;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 d;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 e;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 f;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 g;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/authentication/AuthenticatedUser$AuthenticatedUserData;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthenticatedUserData {

        /* renamed from: a, reason: collision with root package name */
        public final String f21151a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final boolean g;
        public final String h;

        public AuthenticatedUserData(boolean z, boolean z2, boolean z3, String firstName, String lastName, String rewardsCardNumber, String emailId, String userType) {
            Intrinsics.h(firstName, "firstName");
            Intrinsics.h(lastName, "lastName");
            Intrinsics.h(rewardsCardNumber, "rewardsCardNumber");
            Intrinsics.h(emailId, "emailId");
            Intrinsics.h(userType, "userType");
            this.f21151a = firstName;
            this.b = lastName;
            this.c = rewardsCardNumber;
            this.d = z;
            this.e = z2;
            this.f = emailId;
            this.g = z3;
            this.h = userType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthenticatedUserData)) {
                return false;
            }
            AuthenticatedUserData authenticatedUserData = (AuthenticatedUserData) obj;
            return Intrinsics.c(this.f21151a, authenticatedUserData.f21151a) && Intrinsics.c(this.b, authenticatedUserData.b) && Intrinsics.c(this.c, authenticatedUserData.c) && this.d == authenticatedUserData.d && this.e == authenticatedUserData.e && Intrinsics.c(this.f, authenticatedUserData.f) && this.g == authenticatedUserData.g && Intrinsics.c(this.h, authenticatedUserData.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + b.e(b.c(b.e(b.e(b.c(b.c(this.f21151a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbV = a.v("AuthenticatedUserData(firstName=", this.f21151a, ", lastName=", this.b, ", rewardsCardNumber=");
            d.A(this.c, ", skippedRewards=", ", acceptedTerms=", sbV, this.d);
            au.com.woolworths.android.onesite.a.y(", emailId=", this.f, ", hasValidCard=", sbV, this.e);
            sbV.append(this.g);
            sbV.append(", userType=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(AuthenticatedUser.class, "firstName", "getFirstName()Ljava/lang/String;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        i = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(AuthenticatedUser.class, "lastName", "getLastName()Ljava/lang/String;", 0, reflectionFactory), b.y(AuthenticatedUser.class, "rewardsCardNumber", "getRewardsCardNumber()Ljava/lang/String;", 0, reflectionFactory), b.y(AuthenticatedUser.class, "skippedRewards", "getSkippedRewards()Z", 0, reflectionFactory), b.y(AuthenticatedUser.class, "acceptedTerms", "getAcceptedTerms()Z", 0, reflectionFactory), b.y(AuthenticatedUser.class, "emailId", "getEmailId()Ljava/lang/String;", 0, reflectionFactory), b.y(AuthenticatedUser.class, "hasValidCard", "getHasValidCard()Z", 0, reflectionFactory), b.y(AuthenticatedUser.class, "userType", "getUserType()Ljava/lang/String;", 0, reflectionFactory)};
    }

    public AuthenticatedUser(SecuredSharedPreference securedSharedPreference) {
        this.f21150a = SharedPreferenceExtKt.c(securedSharedPreference, "", "firstName");
        this.b = SharedPreferenceExtKt.c(securedSharedPreference, "", "lastName");
        this.c = SharedPreferenceExtKt.c(securedSharedPreference, "", "rewardsCardNumber");
        this.d = SharedPreferenceExtKt.b(securedSharedPreference, null, 3);
        this.e = SharedPreferenceExtKt.b(securedSharedPreference, null, 3);
        this.f = SharedPreferenceExtKt.c(securedSharedPreference, "", Scopes.EMAIL);
        this.g = SharedPreferenceExtKt.b(securedSharedPreference, "hasValidCard", 1);
        this.h = SharedPreferenceExtKt.c(securedSharedPreference, "", "userType");
    }

    public final String a() {
        return (String) this.f.getValue(this, i[5]);
    }

    public final String b() {
        return (String) this.f21150a.getValue(this, i[0]);
    }

    public final String c() {
        return (String) this.c.getValue(this, i[2]);
    }

    public final void d(boolean z) {
        this.e.setValue(this, i[4], Boolean.valueOf(z));
    }

    public final void e(AuthenticatedUserData userData) {
        Intrinsics.h(userData, "userData");
        g(userData.f21151a);
        i(userData.b);
        j(userData.c);
        boolean z = userData.d;
        this.d.setValue(this, i[3], Boolean.valueOf(z));
        d(userData.e);
        f(userData.f);
        h(userData.g);
        k(userData.h);
    }

    public final void f(String str) {
        Intrinsics.h(str, "<set-?>");
        this.f.setValue(this, i[5], str);
    }

    public final void g(String str) {
        Intrinsics.h(str, "<set-?>");
        this.f21150a.setValue(this, i[0], str);
    }

    public final void h(boolean z) {
        this.g.setValue(this, i[6], Boolean.valueOf(z));
    }

    public final void i(String str) {
        Intrinsics.h(str, "<set-?>");
        this.b.setValue(this, i[1], str);
    }

    public final void j(String str) {
        Intrinsics.h(str, "<set-?>");
        this.c.setValue(this, i[2], str);
    }

    public final void k(String str) {
        Intrinsics.h(str, "<set-?>");
        this.h.setValue(this, i[7], str);
    }
}
