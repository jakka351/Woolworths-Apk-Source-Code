package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.service.credentials.CredentialEntry;
import androidx.credentials.provider.CustomCredentialEntry;
import androidx.credentials.provider.PasswordCredentialEntry;
import androidx.credentials.provider.PublicKeyCredentialEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/credentials/provider/CredentialEntry;", "entry", "Landroid/service/credentials/CredentialEntry;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginGetCredentialUtil$Companion$convertToJetpackResponse$1 extends Lambda implements Function1<CredentialEntry, androidx.credentials.provider.CredentialEntry> {
    public static final BeginGetCredentialUtil$Companion$convertToJetpackResponse$1 h = new BeginGetCredentialUtil$Companion$convertToJetpackResponse$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Slice slice = d.m(obj).getSlice();
        Intrinsics.g(slice, "entry.slice");
        try {
            SliceSpec spec = slice.getSpec();
            String type = spec != null ? spec.getType() : null;
            if (Intrinsics.c(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                PasswordCredentialEntry passwordCredentialEntryA = PasswordCredentialEntry.Companion.a(slice);
                Intrinsics.e(passwordCredentialEntryA);
                return passwordCredentialEntryA;
            }
            if (Intrinsics.c(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                PublicKeyCredentialEntry publicKeyCredentialEntryA = PublicKeyCredentialEntry.Companion.a(slice);
                Intrinsics.e(publicKeyCredentialEntryA);
                return publicKeyCredentialEntryA;
            }
            CustomCredentialEntry customCredentialEntryA = CustomCredentialEntry.Companion.a(slice);
            Intrinsics.e(customCredentialEntryA);
            return customCredentialEntryA;
        } catch (Exception unused) {
            return CustomCredentialEntry.Companion.a(slice);
        }
    }
}
