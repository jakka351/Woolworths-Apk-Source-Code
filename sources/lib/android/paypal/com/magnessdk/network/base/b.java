package lib.android.paypal.com.magnessdk.network.base;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class b implements MagnesNetworking {
    public byte[] b;
    public Uri d;
    public String c = null;

    /* renamed from: a, reason: collision with root package name */
    public final f f24904a = f.a();
    public Map e = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(byte[] r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.base.b.a(byte[]):int");
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final byte[] b() {
        return this.b;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final String c() {
        return this.c;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final void d(HashMap map) {
        this.e = map;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final void e(Uri uri) {
        this.d = uri;
    }
}
