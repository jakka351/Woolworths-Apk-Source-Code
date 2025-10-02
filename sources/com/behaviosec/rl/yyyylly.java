package com.behaviosec.rl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.android.LogBridge;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class yyyylly {
    private static final String h0068h006800680068h;
    public static int r0072rr0072r0072r = 0;
    public static int rr0072r0072r0072r = 1;
    public static int rrr00720072r0072r = 2;
    public static int rrrr0072r0072r = 45;

    public static class yllylly {
        public static int r00720072r007200720072r = 1;
        public static int r0072rr007200720072r = 30;
        public static int rr0072r007200720072r = 0;
        public static int rrr0072007200720072r = 2;
        private static final String hhh0068hh0068 = uuxuuuu.pp0070p0070ppp(" +\u000b)*0\"\"", (char) (yllylll.r007200720072r00720072() ^ (-1146716803)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741399)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790)));
        private static final String h0068h0068hh0068 = uuxuuuu.pp0070p0070ppp("\u0007\u001dPLy\u001a:\u00034Q", (char) (yyyllll.rrrr007200720072() ^ 383822009), (char) (ylyylll.r0072rrr00720072() ^ (-1691741236)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));

        private yllylly() {
        }

        public static boolean b0062bb006200620062(Context context) {
            Object objB00620062b006200620062;
            Boolean bool;
            Class clsBb0062b006200620062 = yyyylly.bb0062b006200620062(yyyllly.ROOT_BEER);
            if (clsBb0062b006200620062 == null || (objB00620062b006200620062 = yyyylly.b00620062b006200620062(clsBb0062b006200620062, new Class[]{Context.class}, new Object[]{context})) == null) {
                return false;
            }
            Method methodBbb0062006200620062 = yyyylly.bbb0062006200620062(clsBb0062b006200620062, uuxuuuu.pppp0070ppp("\bx\u0007]\u007fvuvzr", (char) (yylylll.r0072r0072r00720072() ^ (-1349847272)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), Boolean.TYPE);
            if (methodBbb0062006200620062 != null) {
                int i = r0072rr007200720072r;
                if (((r00720072r007200720072r + i) * i) % rrr0072007200720072r != rr0072r007200720072r) {
                    r0072rr007200720072r = r0072r0072007200720072r();
                    rr0072r007200720072r = r0072r0072007200720072r();
                }
                yyyylly.b0062b0062006200620062(objB00620062b006200620062, methodBbb0062006200620062, Boolean.valueOf(LogBridge.getInfoLog()));
            }
            Method methodBbb00620062006200622 = yyyylly.bbb0062006200620062(clsBb0062b006200620062, uuxuuuu.pppp0070ppp("{\u0007f\u0005\u0006\f}}", (char) (yyyllll.rrrr007200720072() ^ 383821987), (char) (yllylll.r007200720072r00720072() ^ (-1146716799))), new Class[0]);
            if (methodBbb00620062006200622 == null || (bool = (Boolean) yyyylly.b0062b0062006200620062(objB00620062b006200620062, methodBbb00620062006200622, new Object[0])) == null) {
                return false;
            }
            return bool.booleanValue();
        }

        public static int r0072r0072007200720072r() {
            return 1;
        }

        public static int rr00720072007200720072r() {
            return 1;
        }
    }

    public static class ylyylly {
        private static final Class<?> h00680068006800680068h;
        private static final String hh0068006800680068h = uuxuuuu.pppp0070ppp("yx\tY{\u000e\u0002|\u007f\u007f}\u0012\u007f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
        private static final boolean hhhhhh0068;
        public static int r0072007200720072r0072r = 0;
        public static int r0072rrr00720072r = 2;
        public static int rr007200720072r0072r = 3;
        public static int rrrrr00720072r = 1;

        static {
            int iRr0072rr00720072r = rr0072rr00720072r();
            if (((rrrrr00720072r + iRr0072rr00720072r) * iRr0072rr00720072r) % r0072rrr00720072r != 0) {
                rr007200720072r0072r = rr0072rr00720072r();
                r0072007200720072r0072r = 56;
            }
            Class<?> clsBb0062b006200620062 = yyyylly.bb0062b006200620062(yyyllly.DEVICE_SDK);
            h00680068006800680068h = clsBb0062b006200620062;
            hhhhhh0068 = clsBb0062b006200620062 != null;
        }

        private ylyylly() {
        }

        public static JSONObject b006200620062b00620062(Context context, int i) {
            Method methodBbb0062006200620062;
            if (hhhhhh0068 && (methodBbb0062006200620062 = yyyylly.bbb0062006200620062(h00680068006800680068h, uuxuuuu.pp0070p0070ppp("NM].PbVQTTRfT", (char) (yllylll.r007200720072r00720072() ^ (-1146716718)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741411)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), Context.class, Integer.TYPE)) != null) {
                Object objB0062b0062006200620062 = yyyylly.b0062b0062006200620062(null, methodBbb0062006200620062, context, Integer.valueOf(i));
                return !(objB0062b0062006200620062 instanceof JSONObject) ? new JSONObject() : (JSONObject) objB0062b0062006200620062;
            }
            return new JSONObject();
        }

        public static int rr0072rr00720072r() {
            return 82;
        }
    }

    public static class yylylly {
        private static final boolean h00680068hhh0068;
        private static final String h0068hhhh0068 = uuxuuuu.pp0070p0070ppp("y\u0005\u0001\u007fwt\u0005T\u0007\u0002~lNj|h", (char) (yllylll.r007200720072r00720072() ^ (-1146716744)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741394)), (char) (yyyllll.rrrr007200720072() ^ 383821870));
        private static final Class<?> hh0068hhh0068;
        public static int r007200720072r00720072r = 0;
        public static int r00720072rr00720072r = 45;
        public static int rrr0072r00720072r = 1;
        public static int rrrr007200720072r = 2;

        static {
            Class<?> clsBb0062b006200620062 = yyyylly.bb0062b006200620062(yyyllly.EXTRA_DATA);
            hh0068hhh0068 = clsBb0062b006200620062;
            int i = r00720072rr00720072r;
            if (((rrr0072r00720072r + i) * i) % rrrr007200720072r != r007200720072r00720072r) {
                r00720072rr00720072r = 65;
                r007200720072r00720072r = rr00720072r00720072r();
            }
            h00680068hhh0068 = clsBb0062b006200620062 != null;
        }

        private yylylly() {
        }

        public static JSONArray bbbb006200620062(Context context) {
            Method methodBbb0062006200620062;
            if (h00680068hhh0068 && (methodBbb0062006200620062 = yyyylly.bbb0062006200620062(hh0068hhh0068, uuxuuuu.pp0070p0070ppp("]jhicbtFzwvfJh|j", (char) (yyyllll.rrrr007200720072() ^ 383821981), (char) (ylyylll.r0072rrr00720072() ^ (-1691741356)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), Context.class)) != null) {
                int i = r00720072rr00720072r;
                if (((rrr0072r00720072r + i) * i) % r0072r0072r00720072r() != 0) {
                    r00720072rr00720072r = rr00720072r00720072r();
                    rrr0072r00720072r = rr00720072r00720072r();
                }
                Object objB0062b0062006200620062 = yyyylly.b0062b0062006200620062(null, methodBbb0062006200620062, context);
                return !(objB0062b0062006200620062 instanceof JSONArray) ? new JSONArray() : (JSONArray) objB0062b0062006200620062;
            }
            return new JSONArray();
        }

        public static int r0072r0072r00720072r() {
            return 2;
        }

        public static int rr00720072r00720072r() {
            return 34;
        }
    }

    public enum yyyllly {
        ROOT_BEER(uuxuuuu.pppp0070ppp("dqp2xiv|}\u0004ln;\u0001~\u007f\u0006txy\bDi\b\t\u000f]\u0002\u0003\u0011", (char) (yyyllll.rrrr007200720072() ^ 383822036), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331)))),
        EXTRA_DATA(uuxuuuu.pp0070p0070ppp("fcX\u0010;-'\u0017#\u0005\u0002|eR\u0014QBr\u001d!\u000e\u000b~oa\u001a(\u001e\u0014", (char) (yyyllll.rrrr007200720072() ^ 383821911), (char) (yllylll.r007200720072r00720072() ^ (-1146716802)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054)))),
        DEVICE_SDK(uuxuuuu.pp0070p0070ppp("g\u001b2\u0005l%'&{\u000f|sE:?4l\u0017E\u000e\u0005GOzY\u007f\bqh", (char) (yllylll.r007200720072r00720072() ^ (-1146716787)), (char) (yllylll.r007200720072r00720072() ^ (-1146716827)), (char) (yyyllll.rrrr007200720072() ^ 383821865)));

        public final String hh00680068hh0068;

        static {
            int iR007200720072007200720072r = (r007200720072007200720072r() * (rrrrrrr0072() + r007200720072007200720072r())) % r0072rrrrr0072();
            rr0072rrrr0072();
        }

        yyyllly(String str) {
            this.hh00680068hh0068 = str;
        }

        public static int r007200720072007200720072r() {
            return 28;
        }

        public static int r0072rrrrr0072() {
            return 2;
        }

        public static int rr0072rrrr0072() {
            return 0;
        }

        public static int rrrrrrr0072() {
            return 1;
        }

        public static yyyllly valueOf(String str) {
            return (yyyllly) odooooo.j006Ajjj006A006A(yyyllly.class, str);
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static yyyllly[] valuesCustom() {
            yyyllly[] yyylllyVarArr = (yyyllly[]) values().clone();
            int iR007200720072007200720072r = r007200720072007200720072r();
            int iRrrrrrr0072 = ((rrrrrrr0072() + iR007200720072007200720072r) * iR007200720072007200720072r) % r0072rrrrr0072();
            return yyylllyVarArr;
        }
    }

    static {
        int i = rrrr0072r0072r;
        if (((rr0072r0072r0072r + i) * i) % rrr00720072r0072r != 0) {
            rrrr0072r0072r = 85;
            r0072rr0072r0072r = 98;
        }
        h0068h006800680068h = uuxuuuu.pppp0070ppp(":IOO.MYZTb", (char) (yylylll.r0072r0072r00720072() ^ (-1349847273)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787)));
    }

    @Nullable
    public static Object b00620062b006200620062(@Nullable Class cls, @Nullable Class[] clsArr, @Nullable Object[] objArr) {
        if (cls == null) {
            return null;
        }
        if ((clsArr != null && objArr == null) || (clsArr == null && objArr != null)) {
            return null;
        }
        if (clsArr != null && clsArr.length != objArr.length) {
            return null;
        }
        try {
            Object objNewInstance = cls.getConstructor(clsArr).newInstance(objArr);
            int i = rrrr0072r0072r;
            if (((rr0072r0072r0072r + i) * i) % rrr00720072r0072r != r0072rr0072r0072r) {
                rrrr0072r0072r = 16;
                r0072rr0072r0072r = 35;
            }
            return objNewInstance;
        } catch (Throwable unused) {
            LogBridge.e(uuxuuuu.pp0070p0070ppp("9HNN-LXYSa", (char) (yylylll.r0072r0072r00720072() ^ (-1349847210)), (char) (yyyllll.rrrr007200720072() ^ 383821844), (char) (yylylll.r0072r0072r00720072() ^ (-1349847053))), uuxuuuu.pp0070p0070ppp("'DP\bT~AOA<N>w8Dt=AEE1=12k:0h</+d'/#43^", (char) (yylylll.r0072r0072r00720072() ^ (-1349847213)), (char) (yllylll.r007200720072r00720072() ^ (-1146716916)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))) + cls.getName());
            return null;
        }
    }

    @Nullable
    public static <T> T b0062b0062006200620062(Object obj, @Nullable Method method, Object... objArr) {
        boolean z;
        T t;
        if (method != null) {
            try {
                t = (T) method.invoke(obj, objArr);
                z = false;
            } catch (Throwable unused) {
                String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u0007M@\u001cQ2]u3\u0011", (char) (yylylll.r0072r0072r00720072() ^ (-1349847232)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055)));
                StringBuilder sb = new StringBuilder();
                char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716829));
                if ((r0072r00720072r0072r() * (r0072r00720072r0072r() + rr0072r0072r0072r)) % rrr00720072r0072r != r0072rr0072r0072r) {
                    rrrr0072r0072r = 39;
                    r0072rr0072r0072r = r0072r00720072r0072r();
                }
                sb.append(uuxuuuu.pppp0070ppp("Wt\u00018\u0005/w{\u0003zun({nj$pguhnb\u001d", cR007200720072r00720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
                sb.append(method.getName());
                LogBridge.e(strPppp0070ppp, sb.toString());
                z = true;
                t = null;
            }
            if (!z) {
                return t;
            }
        }
        return null;
    }

    @Nullable
    public static Class bb0062b006200620062(@NonNull yyyllly yyylllyVar) {
        try {
            return Class.forName(yyylllyVar.hh00680068hh0068);
        } catch (Throwable unused) {
            LogBridge.d(uuxuuuu.pppp0070ppp("7DHF#@JIAM", (char) (ylyylll.r0072rrr00720072() ^ (-1691741337)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), uuxuuuu.pp0070p0070ppp("m{]\u001eQ,b\u0007y4\u0016YF$", (char) (yylylll.r0072r0072r00720072() ^ (-1349847188)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741189)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))) + yyylllyVar);
            return null;
        }
    }

    @Nullable
    public static Method bbb0062006200620062(@Nullable Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            String strPppp0070ppp = uuxuuuu.pppp0070ppp("r\u007f\u0004\u0002^{\u0006\u0005|\t", (char) (ylyylll.r0072rrr00720072() ^ (-1691741258)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786)));
            StringBuilder sb = new StringBuilder();
            String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("l\u000f@\u0015\u0018\u0007\rE\u0014\r\u001d\u0012\u001a\u0010fM\u001c\u0015%\u001a\"\u0018T$\u0018%\u001eY", (char) (yylylll.r0072r0072r00720072() ^ (-1349847270)), (char) (yllylll.r007200720072r00720072() ^ (-1146716861)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336)));
            if (((rrrr0072r0072r + rr0072r0072r0072r) * rrrr0072r0072r) % rrr00720072r0072r != r0072rr0072r0072r) {
                rrrr0072r0072r = 82;
                r0072rr0072r0072r = 28;
            }
            sb.append(strPp0070p0070ppp);
            sb.append(str);
            sb.append(uuxuuuu.pppp0070ppp("W\u001a\"\u0016'&Q\u001f\u0011\u001c\u0013L", (char) (ylyylll.r0072rrr00720072() ^ (-1691741407)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
            sb.append(cls.getName());
            LogBridge.e(strPppp0070ppp, sb.toString());
            return null;
        }
    }

    public static int r00720072r0072r0072r() {
        return 2;
    }

    public static int r0072r00720072r0072r() {
        return 90;
    }
}
