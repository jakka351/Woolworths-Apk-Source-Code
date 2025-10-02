package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

/* loaded from: classes.dex */
final class AutoValue_ExperimentIds extends ExperimentIds {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14412a;
    public final byte[] b;

    /* loaded from: classes2.dex */
    public static final class Builder extends ExperimentIds.Builder {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f14413a;
        public byte[] b;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds a() {
            return new AutoValue_ExperimentIds(this.f14413a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds.Builder b(byte[] bArr) {
            this.f14413a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public final ExperimentIds.Builder c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public AutoValue_ExperimentIds(byte[] bArr, byte[] bArr2) {
        this.f14412a = bArr;
        this.b = bArr2;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] b() {
        return this.f14412a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public final byte[] c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        boolean z = experimentIds instanceof AutoValue_ExperimentIds;
        if (Arrays.equals(this.f14412a, z ? ((AutoValue_ExperimentIds) experimentIds).f14412a : experimentIds.b())) {
            return Arrays.equals(this.b, z ? ((AutoValue_ExperimentIds) experimentIds).b : experimentIds.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f14412a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f14412a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
