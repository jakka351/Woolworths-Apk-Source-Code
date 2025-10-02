package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes.dex */
class p7 extends b0 {
    private static final int c = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16637a;
    private String b;

    public p7(String str, String str2) {
        this.b = str;
        this.f16637a = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f16637a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f16637a;
            if (str == null ? p7Var.f16637a != null : !str.equals(p7Var.f16637a)) {
                return false;
            }
            String str2 = this.b;
            String str3 = p7Var.b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.Template;
    }

    public int hashCode() {
        String str = this.f16637a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        this.f16637a = str;
    }
}
