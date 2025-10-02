package lib.android.paypal.com.magnessdk;

import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import lib.android.paypal.com.magnessdk.k;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class MagnesSDK {
    public static MagnesSDK i;

    /* renamed from: a, reason: collision with root package name */
    public e f24888a;
    public MagnesSettings b;
    public lib.android.paypal.com.magnessdk.network.base.e c;
    public HandlerThread d;
    public h e;
    public d f;
    public final k g;
    public final l h;

    public MagnesSDK() {
        k kVar;
        l lVar;
        synchronized (k.class) {
            if (k.c == null) {
                k kVar2 = new k();
                new ArrayList();
                synchronized (k.d.class) {
                    if (k.d.f24898a == null) {
                        k.d.f24898a = new k.d();
                    }
                }
                new HashMap();
                k.c = kVar2;
            }
            kVar = k.c;
        }
        this.g = kVar;
        synchronized (l.class) {
            try {
                if (l.c == null) {
                    l lVar2 = new l();
                    new JSONObject();
                    new JSONArray();
                    new JSONArray();
                    new Timer();
                    l.c = lVar2;
                }
                lVar = l.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h = lVar;
    }

    public static synchronized MagnesSDK b() {
        try {
            if (i == null) {
                i = new MagnesSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049a A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b0 A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c4 A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f8 A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x050e A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0520 A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x054c A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0586 A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0595 A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05ad A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05cb A[Catch: Exception -> 0x062e, TryCatch #4 {Exception -> 0x062e, blocks: (B:148:0x048a, B:152:0x049e, B:156:0x04b7, B:160:0x04c8, B:164:0x04fc, B:168:0x0515, B:172:0x0527, B:176:0x0550, B:180:0x058a, B:184:0x0599, B:188:0x05b1, B:192:0x05cf, B:191:0x05cb, B:187:0x05ad, B:183:0x0595, B:179:0x0586, B:175:0x054c, B:171:0x0520, B:167:0x050e, B:163:0x04f8, B:159:0x04c4, B:155:0x04b0, B:151:0x049a), top: B:230:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0642 A[Catch: JSONException -> 0x0671, TryCatch #0 {JSONException -> 0x0671, blocks: (B:197:0x063c, B:199:0x0642, B:201:0x064e, B:203:0x0652, B:204:0x065a, B:206:0x0660, B:209:0x0673, B:210:0x0677), top: B:223:0x063c }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final lib.android.paypal.com.magnessdk.MagnesResult a(android.content.Context r22, java.lang.String r23) throws org.json.JSONException, lib.android.paypal.com.magnessdk.InvalidInputException {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.MagnesSDK.a(android.content.Context, java.lang.String):lib.android.paypal.com.magnessdk.MagnesResult");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(3:4|1e|13)|16|(2:51|17)|(2:19|(8:21|(1:23)|26|38|52|39|43|(2:45|46)(1:54))(2:27|(1:29)))(1:30)|33|47|34|38|52|39|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(3:4|1e|13)|16|51|17|(2:19|(8:21|(1:23)|26|38|52|39|43|(2:45|46)(1:54))(2:27|(1:29)))(1:30)|33|47|34|38|52|39|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        lib.android.paypal.com.magnessdk.log.a.b(r0, lib.android.paypal.com.magnessdk.e.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        lib.android.paypal.com.magnessdk.log.a.b(r0, lib.android.paypal.com.magnessdk.e.class);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(lib.android.paypal.com.magnessdk.MagnesSettings r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.MagnesSDK.c(lib.android.paypal.com.magnessdk.MagnesSettings):void");
    }
}
