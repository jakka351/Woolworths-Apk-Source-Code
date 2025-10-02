package YU;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class UA {
    public static int d = 6216;
    public static int e = 1999;
    public static final UA f;

    /* renamed from: a, reason: collision with root package name */
    public BaseShopApplication f18a;
    public AtomicReference b;
    public AtomicReference c;

    class AF implements Runnable {
        public AF() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            UA ua = UA.this;
            int i6 = UA.d;
            String strA = CircleProgressBar.a("J`q|B[hJV@c~eLG");
            String strA2 = CircleProgressBar.a("Pkv{DH@BXHNx&GC@B\\");
            if ((UA.e ^ 1999) != 0) {
                do {
                    i2 = UA.e;
                    i3 = i2 + 13;
                    if (i3 == 68) {
                        UA.e = ((i2 * 32) ^ 4325) >> 16;
                        if ((UA.d ^ 6216) != 0) {
                            while (true) {
                                i4 = UA.d;
                                int i7 = i4 + 65;
                                if (i7 != 83) {
                                    if (i7 == 95) {
                                        break;
                                    } else if (i7 == 175) {
                                        UA.d = ((i4 % 24) >> 22) % 20;
                                    }
                                }
                                UA.d = ((UA.d ^ 2557) + i4) * 31;
                            }
                            UA.d = ((i4 ^ 1549) * 45) + i4;
                        }
                    } else if (i3 == 70) {
                        UA.e = ((UA.e * 5) + i2) % 86;
                        break;
                    } else if (i3 != 74) {
                    }
                    UA.e = (UA.e + i2) * 98;
                    UA.e = ((UA.e * 5) + i2) % 86;
                    break;
                } while (i3 != 201);
                do {
                    UA.e = ((UA.e ^ 3441) % 55) + i2;
                } while ((UA.d ^ 6216) == 0);
                do {
                    i5 = UA.d;
                } while (i5 + 78 != 56);
                while (true) {
                    UA.d = (UA.d >> 100) + i5;
                }
            } else {
                O.c(strA, strA2, new Throwable[0]);
                synchronized (ua) {
                    try {
                        BaseShopApplication baseShopApplication = ua.f18a;
                        if (baseShopApplication != null) {
                            SharedPreferences sharedPreferences = baseShopApplication.getSharedPreferences(CircleProgressBar.a("zjr!LBMFCH\u000e}iPOBD\u0017HEK[YIW_SJE"), 0);
                            ua.b.set(sharedPreferences.getString(CircleProgressBar.a("j`q|B[sOCUA"), null));
                            ua.c.set(sharedPreferences.getString(CircleProgressBar.a("jv@|DNBJN"), null));
                            return;
                        }
                        String strA3 = CircleProgressBar.a("J`q|B[hJV@c~eLG");
                        if (UA.e > 1998) {
                            O.e(strA3, CircleProgressBar.a("uj~kiHXJ\u0018\u0001cphPG[^\u0019QD\u000eSIW^"), new Throwable[0]);
                            return;
                        }
                        while (true) {
                            int i8 = UA.e;
                            int i9 = i8 + 26;
                            if (i9 == 22) {
                                while (true) {
                                    UA.e = (UA.e * 4650) >> 111;
                                }
                            } else if (i9 != 156) {
                                if (i9 == 238) {
                                    UA.e = (i8 + i8) % 63;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        do {
                            UA.e = (UA.e % 106) >> 16;
                        } while ((UA.d ^ 6216) == 0);
                        while (true) {
                            i = UA.d;
                            int i10 = i + 65;
                            if (i10 != 27) {
                                if (i10 == 114) {
                                    UA.d = (UA.d + i) % 111;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            UA.d = ((UA.d % 123) + i) ^ 3415;
                            UA.d = (UA.d + i) % 111;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    class Uq implements Runnable {
        public Uq() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            UA ua = UA.this;
            int i = UA.d;
            synchronized (ua) {
                BaseShopApplication baseShopApplication = ua.f18a;
                if (baseShopApplication == null) {
                    O.e(CircleProgressBar.a("J`q|B[hJV@c~eLG"), CircleProgressBar.a("jdijiHXJ\u0018\u0001cphPG[^\u0019QD\u000eSIW^"), new Throwable[0]);
                    return;
                }
                SharedPreferences.Editor editorEdit = baseShopApplication.getSharedPreferences(CircleProgressBar.a("zjr!LBMFCH\u000e}iPOBD\u0017HEK[YIW_SJE"), 0).edit();
                editorEdit.putString(CircleProgressBar.a("j`q|B[sOCUA"), (String) ua.b.get());
                editorEdit.putString(CircleProgressBar.a("jv@|DNBJN"), (String) ua.c.get());
                editorEdit.commit();
            }
        }
    }

    static {
        UA ua = new UA();
        ua.f18a = null;
        ua.b = new AtomicReference();
        ua.c = new AtomicReference();
        f = ua;
    }

    public final synchronized String a() {
        BaseShopApplication baseShopApplication = this.f18a;
        if (baseShopApplication == null) {
            O.e(CircleProgressBar.a("J`q|B[hJV@c~eLG"), CircleProgressBar.a("~`kCLZXxqiAln\u001e\u0002`EWLRVI\u001cRA\u0011^ZZY"), new Throwable[0]);
            return "";
        }
        String string = baseShopApplication.getSharedPreferences(CircleProgressBar.a("zjr!LBMFCH\u000e}iPOBD\u0017HEK[YIW_SJE"), 0).getString(CircleProgressBar.a("jv@gLZD"), null);
        if (string == null) {
            string = "";
        }
        return string;
    }

    public final void b(BaseShopApplication baseShopApplication) {
        this.f18a = baseShopApplication;
        new Thread(new AF()).start();
    }

    public final void c(String str, String str2) {
        this.b.set(str);
        this.c.set(str2);
        new Thread(new Uq()).start();
    }
}
