package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes6.dex */
public class StandardIntegrityException extends ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f14706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i, Throwable th) {
        super(new Status(i, "Standard Integrity API error (" + i + "): " + com.google.android.play.core.integrity.model.b.a(i) + "."));
        Locale locale = Locale.ROOT;
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f14706a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f14706a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
