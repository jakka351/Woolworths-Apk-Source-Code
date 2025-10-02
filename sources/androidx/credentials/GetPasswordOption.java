package androidx.credentials;

import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/GetPasswordOption;", "Landroidx/credentials/CredentialOption;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetPasswordOption extends CredentialOption {
    public final Set b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/GetPasswordOption$Companion;", "", "", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, z, set2);
        this.b = set;
    }
}
