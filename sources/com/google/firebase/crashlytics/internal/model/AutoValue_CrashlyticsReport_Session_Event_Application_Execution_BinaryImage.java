package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* renamed from: a, reason: collision with root package name */
    public final long f15352a;
    public final long b;
    public final String c;
    public final String d;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* renamed from: a, reason: collision with root package name */
        public long f15353a;
        public long b;
        public String c;
        public String d;
        public byte e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage a() {
            String str;
            if (this.e == 3 && (str = this.c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(str, this.f15353a, this.b, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.e & 2) == 0) {
                sb.append(" size");
            }
            if (this.c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder b(long j) {
            this.f15353a = j;
            this.e = (byte) (this.e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder d(long j) {
            this.b = j;
            this.e = (byte) (this.e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder e(String str) {
            this.d = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(String str, long j, long j2, String str2) {
        this.f15352a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long b() {
        return this.f15352a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f15352a != binaryImage.b() || this.b != binaryImage.d() || !this.c.equals(binaryImage.c())) {
            return false;
        }
        String str = this.d;
        return str == null ? binaryImage.e() == null : str.equals(binaryImage.e());
    }

    public final int hashCode() {
        long j = this.f15352a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f15352a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return a.o(sb, this.d, "}");
    }
}
