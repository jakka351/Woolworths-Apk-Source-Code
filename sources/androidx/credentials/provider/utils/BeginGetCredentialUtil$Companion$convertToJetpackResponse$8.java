package androidx.credentials.provider.utils;

import androidx.credentials.provider.AuthenticationAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "entry", "Landroidx/credentials/provider/AuthenticationAction;", "invoke", "(Landroidx/credentials/provider/AuthenticationAction;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginGetCredentialUtil$Companion$convertToJetpackResponse$8 extends Lambda implements Function1<AuthenticationAction, Boolean> {
    public static final BeginGetCredentialUtil$Companion$convertToJetpackResponse$8 h = new BeginGetCredentialUtil$Companion$convertToJetpackResponse$8(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((AuthenticationAction) obj) != null);
    }
}
