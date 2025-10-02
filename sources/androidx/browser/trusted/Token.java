package androidx.browser.trusted;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.browser.trusted.PackageIdentityUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class Token {

    /* renamed from: a, reason: collision with root package name */
    public final TokenContents f213a;

    public Token(TokenContents tokenContents) {
        this.f213a = tokenContents;
    }

    public static Token a(PackageManager packageManager, String str) {
        List listA;
        try {
            listA = new PackageIdentityUtils.Api28Implementation().a(packageManager, str);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("PackageIdentity", "Could not get fingerprint for package.", e);
            listA = null;
        }
        if (listA == null) {
            return null;
        }
        try {
            return new Token(TokenContents.a(str, (ArrayList) listA));
        } catch (IOException e2) {
            Log.e("Token", "Exception when creating token.", e2);
            return null;
        }
    }

    public final byte[] b() {
        byte[] bArr = this.f213a.f214a;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
