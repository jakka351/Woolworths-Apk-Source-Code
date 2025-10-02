package androidx.credentials.provider;

import android.credentials.CredentialOption;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/credentials/CredentialOption;", "kotlin.jvm.PlatformType", "option", "Landroid/credentials/CredentialOption;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PendingIntentHandler$Companion$retrieveProviderGetCredentialRequest$1 extends Lambda implements Function1<CredentialOption, androidx.credentials.CredentialOption> {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r10) throws androidx.credentials.internal.FrameworkClassParsingException {
        /*
            r9 = this;
            android.credentials.CredentialOption r10 = androidx.credentials.a.d(r10)
            java.lang.String r1 = androidx.credentials.a.p(r10)
            java.lang.String r0 = "option.type"
            kotlin.jvm.internal.Intrinsics.g(r1, r0)
            android.os.Bundle r2 = androidx.credentials.a.h(r10)
            java.lang.String r0 = "option.credentialRetrievalData"
            kotlin.jvm.internal.Intrinsics.g(r2, r0)
            android.os.Bundle r3 = androidx.credentials.a.x(r10)
            java.lang.String r0 = "option.candidateQueryData"
            kotlin.jvm.internal.Intrinsics.g(r3, r0)
            androidx.credentials.a.w(r10)
            java.util.Set r5 = androidx.credentials.a.s(r10)
            java.lang.String r10 = "option.allowedProviders"
            kotlin.jvm.internal.Intrinsics.g(r5, r10)
            java.lang.String r10 = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED"
            r0 = 0
            java.lang.String r4 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r4 = r1.equals(r4)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L9f
            if (r4 == 0) goto L57
            java.lang.String r4 = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS"
            java.util.ArrayList r4 = r2.getStringArrayList(r4)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L9f
            r6 = r2
            androidx.credentials.GetPasswordOption r2 = new androidx.credentials.GetPasswordOption     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            if (r4 == 0) goto L46
            java.util.Set r4 = kotlin.collections.CollectionsKt.L0(r4)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            goto L48
        L46:
            kotlin.collections.EmptySet r4 = kotlin.collections.EmptySet.d     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
        L48:
            boolean r7 = r6.getBoolean(r10, r0)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            r8 = r7
            r7 = r3
            r3 = r4
            r4 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L54
            return r2
        L54:
            r3 = r7
        L55:
            r2 = r0
            goto La1
        L57:
            r6 = r2
            java.lang.String r2 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r2 = r1.equals(r2)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            if (r2 == 0) goto L99
            java.lang.String r2 = "androidx.credentials.BUNDLE_KEY_SUBTYPE"
            java.lang.String r2 = r6.getString(r2)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            if (r2 == 0) goto L93
            int r4 = r2.hashCode()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            r7 = -613058807(0xffffffffdb757709, float:-6.909225E16)
            if (r4 != r7) goto L93
            java.lang.String r4 = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION"
            boolean r2 = r2.equals(r4)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            if (r2 == 0) goto L93
            java.lang.String r2 = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.Exception -> L8d
            java.lang.String r4 = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"
            r6.getByteArray(r4)     // Catch: java.lang.Exception -> L8d
            androidx.credentials.GetPublicKeyCredentialOption r4 = new androidx.credentials.GetPublicKeyCredentialOption     // Catch: java.lang.Exception -> L8d
            kotlin.jvm.internal.Intrinsics.e(r2)     // Catch: java.lang.Exception -> L8d
            r4.<init>(r2, r5, r6, r3)     // Catch: java.lang.Exception -> L8d
            return r4
        L8d:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            throw r2     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
        L93:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            throw r2     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
        L99:
            androidx.credentials.internal.FrameworkClassParsingException r2 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            r2.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
            throw r2     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L55
        L9f:
            r6 = r2
            goto L55
        La1:
            androidx.credentials.GetCustomCredentialOption r0 = new androidx.credentials.GetCustomCredentialOption
            boolean r4 = r6.getBoolean(r10, r2)
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            int r10 = r1.length()
            if (r10 <= 0) goto Lb2
            return r0
        Lb2:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "type should not be empty"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.PendingIntentHandler$Companion$retrieveProviderGetCredentialRequest$1.invoke(java.lang.Object):java.lang.Object");
    }
}
