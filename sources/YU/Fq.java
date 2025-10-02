package YU;

import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CircleProgressBar;

/* loaded from: classes.dex */
public class Fq {
    public static String l = CircleProgressBar.a("Z\\Y\\TZXNOhNyiiCMK^]E");
    public static String m = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&CGWd\\OsKKUXWx^IY");
    public static String n = CircleProgressBar.a("}`ynXEX\u0006KOFp");
    public static String o = CircleProgressBar.a("44");
    public static String p = CircleProgressBar.a("473<\u0001\u0004\u0019\u001b\u000e\f\u0013/7");

    /* renamed from: a, reason: collision with root package name */
    public final Y f9a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;

    class Fc implements Runnable {
        public static String f = CircleProgressBar.a("]`ifNLeEDN\r?uPCQ^\\\\");
        public static String g = CircleProgressBar.a("tv");
        public static String h = CircleProgressBar.a("Z\\Y\\TZXNOhNyiiCMK^]E");
        public static String i = CircleProgressBar.a("]`ifNLeEDN\rKoIG\u0019\n");
        public final /* synthetic */ BaseShopApplication d;

        public Fc(BaseShopApplication baseShopApplication) {
            this.d = baseShopApplication;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x01ac A[Catch: Exception -> 0x01c2, LOOP:1: B:46:0x01a6->B:48:0x01ac, LOOP_END, TryCatch #7 {Exception -> 0x01c2, blocks: (B:45:0x0187, B:46:0x01a6, B:48:0x01ac, B:51:0x01c4), top: B:78:0x0187 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x020d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
            /*
                Method dump skipped, instructions count: 567
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: YU.Fq.Fc.run():void");
        }
    }

    public Fq() {
        String str = o;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.k = n;
        this.f9a = new Y();
    }

    public final void a(BaseShopApplication baseShopApplication) {
        try {
            new Thread(new Fc(baseShopApplication)).start();
        } catch (Exception unused) {
        }
    }
}
