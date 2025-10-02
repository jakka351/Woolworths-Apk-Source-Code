package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes6.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f14749a;

    public /* synthetic */ h(String str, g gVar) {
        this.f14749a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    @Nullable
    public final String a() {
        return this.f14749a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f14749a;
        return str == null ? standardIntegrityTokenRequest.a() == null : str.equals(standardIntegrityTokenRequest.a());
    }

    public final int hashCode() {
        String str = this.f14749a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return YU.a.o(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f14749a, "}");
    }
}
