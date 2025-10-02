package com.google.firebase.crashlytics.internal.model;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* renamed from: a, reason: collision with root package name */
    public final String f15338a;
    public final byte[] b;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15339a;
        public byte[] b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File a() {
            byte[] bArr;
            String str = this.f15339a;
            if (str != null && (bArr = this.b) != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15339a == null) {
                sb.append(" filename");
            }
            if (this.b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f15339a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.f15338a = str;
        this.b = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final byte[] b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final String c() {
        return this.f15338a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f15338a.equals(file.c())) {
            return Arrays.equals(this.b, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).b : file.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15338a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.f15338a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
