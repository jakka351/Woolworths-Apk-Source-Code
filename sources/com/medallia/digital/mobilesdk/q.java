package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes6.dex */
class q implements Serializable {
    private static final int g = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16639a;
    private InviteData b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;

    public q(AppRatingContract appRatingContract) {
        this.f16639a = appRatingContract.getAppRatingId();
        this.b = appRatingContract.getInviteData();
        this.c = appRatingContract.getAppRatingUrl();
        this.d = appRatingContract.getAppRatingLanguage();
        this.e = appRatingContract.isDarkModeEnabled();
        this.f = appRatingContract.isAppRatingDirectApi();
    }

    public String a() {
        return this.f16639a;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public InviteData d() {
        return this.b;
    }

    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            String str = this.f16639a;
            if (str == null ? qVar.f16639a != null : !str.equals(qVar.f16639a)) {
                return false;
            }
            InviteData inviteData = this.b;
            if (inviteData == null ? qVar.b != null : !inviteData.equals(qVar.b)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null ? qVar.d != null : !str2.equals(qVar.d)) {
                return false;
            }
            if (this.e != qVar.e) {
                return false;
            }
            String str3 = this.c;
            String str4 = qVar.c;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public int hashCode() {
        String str = this.f16639a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InviteData inviteData = this.b;
        int iHashCode2 = (iHashCode + (inviteData != null ? inviteData.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return Boolean.valueOf(this.e).hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public void a(AppRatingContract appRatingContract) {
        if (appRatingContract == null) {
            return;
        }
        this.f16639a = appRatingContract.getAppRatingId();
        this.b = appRatingContract.getInviteData();
        this.c = appRatingContract.getAppRatingUrl();
        this.d = appRatingContract.getAppRatingLanguage();
        this.e = appRatingContract.isDarkModeEnabled();
        this.f = appRatingContract.isAppRatingDirectApi();
    }
}
