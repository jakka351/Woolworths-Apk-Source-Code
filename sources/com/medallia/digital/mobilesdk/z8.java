package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes6.dex */
class z8 extends b0 {
    private static final int c = 31;

    /* renamed from: a, reason: collision with root package name */
    private final String f16794a;
    private final String b;

    public z8(String str, String str2) {
        this.f16794a = str;
        this.b = str2;
    }

    public String a() {
        return this.f16794a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            z8 z8Var = (z8) obj;
            String str = this.b;
            if (str == null ? z8Var.b != null : !str.equals(z8Var.f16794a)) {
                return false;
            }
            String str2 = this.f16794a;
            String str3 = z8Var.f16794a;
            if (str2 == null ? str3 != null : !str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    public b0.a getDataTableObjectType() {
        return b0.a.WorkerManager;
    }

    public int hashCode() {
        String str = this.f16794a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + l3.c(this.f16794a) + "\"requestId\":" + l3.c(this.b) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
