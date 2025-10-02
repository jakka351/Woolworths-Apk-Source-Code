package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes6.dex */
class c2 extends b0 {
    private static final int g = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f16390a;
    private final String b;
    private final String c;
    private final FormTriggerType d;
    private final long e;
    private int f;

    public c2(String str, String str2, String str3, FormTriggerType formTriggerType, long j, int i) {
        this.f16390a = str;
        this.b = str2;
        this.c = str3;
        this.d = formTriggerType;
        this.e = j;
        this.f = i;
    }

    public String a() {
        return this.f16390a;
    }

    public String b() {
        return this.b;
    }

    public FormTriggerType c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    public long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c2 c2Var = (c2) obj;
            String str = this.f16390a;
            if (str == null ? c2Var.f16390a != null : !str.equals(c2Var.f16390a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? c2Var.b != null : !str2.equals(c2Var.b)) {
                return false;
            }
            String str3 = this.c;
            if (str3 == null ? c2Var.c != null : !str3.equals(c2Var.c)) {
                return false;
            }
            if (this.e == c2Var.e && this.f == c2Var.f && this.d.ordinal() == c2Var.d.ordinal()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        this.f++;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.Feedback;
    }

    public String getFormId() {
        return this.c;
    }

    public int hashCode() {
        String str = this.c;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16390a;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.b;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.c;
        return this.d.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public void a(String str) {
        this.f16390a = str;
    }
}
