package lib.android.paypal.com.magnessdk.network.base;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import lib.android.paypal.com.magnessdk.c;

/* loaded from: classes7.dex */
public final class MagnesNetworkingFactoryImpl implements MagnesNetworkingFactory {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24902a;

        static {
            int[] iArr = new int[c.h.b.values().length];
            f24902a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24902a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static MagnesNetworking a(c.h.b bVar) throws NoSuchAlgorithmException, KeyManagementException {
        int i = a.f24902a[bVar.ordinal()];
        if (i != 1) {
            return i != 2 ? new b() : new b();
        }
        lib.android.paypal.com.magnessdk.network.base.a aVar = new lib.android.paypal.com.magnessdk.network.base.a();
        aVar.b = null;
        f.a();
        aVar.d = new HashMap();
        return aVar;
    }
}
