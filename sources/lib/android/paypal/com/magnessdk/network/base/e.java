package lib.android.paypal.com.magnessdk.network.base;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import lib.android.paypal.com.magnessdk.MagnesSDK;
import lib.android.paypal.com.magnessdk.c;

/* loaded from: classes7.dex */
public final class e extends Handler {
    public static e b;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f24906a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24907a;

        static {
            int[] iArr = new int[c.h.EnumC0415c.values().length];
            f24907a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24907a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24907a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24907a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24907a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24907a[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (((MagnesSDK) this.f24906a.get()) != null) {
            int i = message.what;
            c.h.EnumC0415c enumC0415c = i == 50 ? c.h.EnumC0415c.d : i == 51 ? c.h.EnumC0415c.e : i == 52 ? c.h.EnumC0415c.f : i == 53 ? c.h.EnumC0415c.g : i == 54 ? c.h.EnumC0415c.h : i == 55 ? c.h.EnumC0415c.i : i == -1 ? c.h.EnumC0415c.j : i == 200 ? c.h.EnumC0415c.k : null;
            if (enumC0415c == null) {
                return;
            }
            switch (a.f24907a[enumC0415c.ordinal()]) {
                case 1:
                    lib.android.paypal.com.magnessdk.log.a.a("GET request to https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rac.json", 0, e.class);
                    break;
                case 2:
                    break;
                case 3:
                    lib.android.paypal.com.magnessdk.log.a.a("GET request to " + message.obj + " error.", 3, e.class);
                    return;
                case 4:
                    lib.android.paypal.com.magnessdk.log.a.a("POST request to " + message.obj + " started.", 0, e.class);
                    return;
                case 5:
                    lib.android.paypal.com.magnessdk.log.a.a("POST request to " + message.obj + " successfully.", 0, e.class);
                    return;
                case 6:
                    lib.android.paypal.com.magnessdk.log.a.a("POST request to " + message.obj + " error.", 3, e.class);
                    return;
                default:
                    return;
            }
            lib.android.paypal.com.magnessdk.log.a.a("GET request to " + message.obj + " succeeded", 0, e.class);
        }
    }
}
