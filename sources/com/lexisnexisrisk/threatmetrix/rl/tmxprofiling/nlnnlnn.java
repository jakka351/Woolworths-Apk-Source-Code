package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.app.Activity;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class nlnnlnn extends lllllql {
    private Object x007800780078x00780078;
    private Object x00780078x007800780078;
    private Object x0078x0078007800780078;
    private Object x0078xx007800780078;
    private Object xx0078x007800780078;
    private Object xxx0078007800780078;
    private Object xxxx007800780078;

    public nlnnlnn(Object obj, String str) {
        super(obj, str);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            this.x007800780078x00780078 = map.get("sendDataHandler");
            this.xxxx007800780078 = map.get("setPageNameHandler");
            this.x0078xx007800780078 = map.get("clearRegistrationsHandler");
            this.xx0078x007800780078 = map.get("registerKeyboardTargetHandler");
            this.x00780078x007800780078 = map.get("keyboardTargetTextChangedHandler");
            this.xxx0078007800780078 = map.get("setCurrentKeyboardTargetHandler");
            this.x0078x0078007800780078 = map.get("clearCurrentKeyboardTargetHandler");
        }
    }

    public static boolean oo006Fooo006F(lllllql lllllqlVar) {
        return (lllllqlVar instanceof nlnnlnn) && lllllqlVar.o006F006Fo006F006Fo() && lllllqlVar.uuuuu00750075() && lllllqlVar.u0075uuu00750075();
    }

    public void o006F006F006Foo006F(Activity activity, String str) {
        u0075007500750075u0075((Method) this.xxxx007800780078, false, activity, str);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllllql
    public boolean o006F006Fo006F006Fo() {
        return super.o006F006Fo006F006Fo() && uu0075uu00750075(this.x007800780078x00780078) && uu0075uu00750075(this.xxxx007800780078) && uu0075uu00750075(this.x0078xx007800780078) && uu0075uu00750075(this.xx0078x007800780078) && uu0075uu00750075(this.x00780078x007800780078) && uu0075uu00750075(this.xxx0078007800780078) && uu0075uu00750075(this.x0078x0078007800780078);
    }

    public void o006F006Fooo006F(@Nonnull String str, String str2, String str3, @Nonnull Activity activity) {
        u0075007500750075u0075((Method) this.x00780078x007800780078, false, str, str2, str3, activity);
    }

    public void o006Fo006Foo006F() {
        u0075007500750075u0075((Method) this.x007800780078x00780078, false, new Object[0]);
    }

    public void o006Foooo006F(Activity activity) {
        u0075007500750075u0075((Method) this.x0078xx007800780078, false, activity);
    }

    public void oo006F006Foo006F(@Nonnull String str, String str2, @Nonnull Activity activity) {
        u0075007500750075u0075((Method) this.xxx0078007800780078, false, str, str2, activity);
    }

    public void ooo006Foo006F(@Nonnull String str, boolean z, @Nonnull Activity activity) {
        u0075007500750075u0075((Method) this.xx0078x007800780078, false, str, Boolean.valueOf(z), activity);
    }

    public void oooooo006F(@Nonnull String str, String str2, @Nonnull Activity activity) {
        u0075007500750075u0075((Method) this.x0078x0078007800780078, false, str, str2, activity);
    }
}
