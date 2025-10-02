package androidx.webkit;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes2.dex */
public class WebMessageCompat {

    /* renamed from: a, reason: collision with root package name */
    public final String f3841a;
    public final int b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Type {
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.f3841a = str;
        this.b = 0;
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.f3841a = null;
        this.b = 1;
    }
}
