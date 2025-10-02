package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth;
import java.lang.reflect.Method;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class nnnnlnn extends lllllql {
    private Object x00780078xx00780078;
    private Object x0078x0078x00780078;
    private Object x0078xxx00780078;
    private Object xx00780078x00780078;
    private Object xx0078xx00780078;
    private Object xxx0078x00780078;

    public nnnnlnn(Object obj, String str) {
        super(obj, str);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            this.x0078xxx00780078 = map.get("registerHandler");
            this.xx0078xx00780078 = map.get("deregisterHandler");
            this.x00780078xx00780078 = map.get("stepUpHandler");
            this.xxx0078x00780078 = map.get("attestStrongIdHandler");
            this.x0078x0078x00780078 = map.get("isNativeLibAvailableHandler");
            this.xx00780078x00780078 = map.get("isUserContextRegisteredHandler");
        }
    }

    public TMXStrongAuth.AuthParamResult o006F006F006F006F006Fo(@Nonnull Context context, @Nonnull TMXStrongAuth.AuthMethod authMethod, @Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull byte[] bArr, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback, boolean z, PrivateKey privateKey, long j) {
        ArrayList arrayList = new ArrayList();
        u0075007500750075u0075((Method) this.x00780078xx00780078, false, context, authMethod, str, str2, str3, bArr, strongAuthCallback, Boolean.valueOf(z), privateKey, Long.valueOf(j), arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllllql
    public boolean o006F006Fo006F006Fo() {
        return (this.ppp00700070p0070 == null || this.p0070p00700070p0070 == null || this.p0070ppp00700070 == null || this.pp007000700070p0070 == null || this.p0070007000700070p0070 == null || this.x0078xxx00780078 == null || this.xx0078xx00780078 == null || this.x00780078xx00780078 == null || this.xxx0078x00780078 == null || this.x0078x0078x00780078 == null || this.ppppp00700070 == null || this.xx00780078x00780078 == null) ? false : true;
    }

    public TMXStrongAuth.AuthParamResult o006Fo006F006F006Fo(@Nonnull String str) {
        ArrayList arrayList = new ArrayList();
        u0075007500750075u0075((Method) this.xx00780078x00780078, false, str, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    public lqqllqq o006Foo006F006Fo(String str, String str2, Context context) {
        lqqllqq lqqllqqVar = new lqqllqq();
        HashMap map = new HashMap();
        u0075007500750075u0075((Method) this.xxx0078x00780078, false, str, str2, context, map);
        if (map.containsKey("signature")) {
            lqqllqqVar.gg0067gggg = (String) map.get("signature");
        }
        if (map.containsKey("random")) {
            lqqllqqVar.g00670067gggg = (String) map.get("random");
        }
        if (map.containsKey("type")) {
            lqqllqqVar.g0067g0067ggg = (String) map.get("type");
        }
        if (map.containsKey("date")) {
            lqqllqqVar.gg00670067ggg = (String) map.get("date");
        }
        if (map.containsKey("key")) {
            lqqllqqVar.g006700670067ggg = (String) map.get("key");
        }
        if (map.containsKey("imported")) {
            lqqllqqVar.gggg0067gg = (String) map.get("imported");
        }
        if (map.containsKey("error")) {
            lqqllqqVar.ggg0067ggg = (String) map.get("error");
        }
        return lqqllqqVar;
    }

    public TMXStrongAuth.AuthParamResult oo006F006F006F006Fo(@Nonnull Context context, @Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull byte[] bArr, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback) {
        ArrayList arrayList = new ArrayList();
        u0075007500750075u0075((Method) this.x0078xxx00780078, false, context, str, str2, str3, bArr, strongAuthCallback, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    public TMXStrongAuth.AuthParamResult oo006Fo006F006Fo(@Nonnull String str) {
        ArrayList arrayList = new ArrayList();
        u0075007500750075u0075((Method) this.xx0078xx00780078, false, str, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (TMXStrongAuth.AuthParamResult) arrayList.get(0);
    }

    public boolean ooo006F006F006Fo() {
        ArrayList arrayList = new ArrayList();
        u0075007500750075u0075((Method) this.x0078x0078x00780078, false, arrayList);
        return !arrayList.isEmpty() && ((String) arrayList.get(0)).compareTo("TRUE") == 0;
    }
}
