package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/credentials/CredentialManagerImpl;", "Landroidx/credentials/CredentialManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
public final class CredentialManagerImpl implements CredentialManager {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/CredentialManagerImpl$Companion;", "", "", "INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public CredentialManagerImpl(@NotNull Context context) {
        Intrinsics.h(context, "context");
    }
}
