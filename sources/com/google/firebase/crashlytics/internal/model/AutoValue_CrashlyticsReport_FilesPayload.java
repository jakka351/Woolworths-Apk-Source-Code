package com.google.firebase.crashlytics.internal.model;

import YU.a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* renamed from: a, reason: collision with root package name */
    public final List f15336a;
    public final String b;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* renamed from: a, reason: collision with root package name */
        public List f15337a;
        public String b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload a() {
            List list = this.f15337a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload(list, this.b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f15337a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder c(String str) {
            this.b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload(List list, String str) {
        this.f15336a = list;
        this.b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final List b() {
        return this.f15336a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (!this.f15336a.equals(filesPayload.b())) {
            return false;
        }
        String str = this.b;
        return str == null ? filesPayload.c() == null : str.equals(filesPayload.c());
    }

    public final int hashCode() {
        int iHashCode = (this.f15336a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f15336a);
        sb.append(", orgId=");
        return a.o(sb, this.b, "}");
    }
}
