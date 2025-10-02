package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes6.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f14748a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.f14748a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(@Nullable String str) {
        this.f14748a = str;
        return this;
    }
}
