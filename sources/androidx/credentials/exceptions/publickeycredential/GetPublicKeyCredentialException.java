package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class GetPublicKeyCredentialException extends GetCredentialException {
    public final String e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException$Companion;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialException(CharSequence charSequence, String type) {
        super(charSequence, type);
        Intrinsics.h(type, "type");
        this.e = type;
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }
}
