package androidx.credentials.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ClearCredentialException extends Exception {
    public final String d;

    public ClearCredentialException(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        this.d = str;
    }

    /* renamed from: a, reason: from getter */
    public String getD() {
        return this.d;
    }
}
