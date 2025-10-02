package com.scandit.datacapture.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18341a;
    private final SharedPreferences b;

    public L1(Context context) {
        Intrinsics.h(context, "context");
        this.f18341a = context;
        this.b = context.getSharedPreferences("com.scandit.device_id", 0);
    }

    public final String a() {
        String str = null;
        String string = this.b.getString(k.a.p, null);
        if (string != null) {
            return string;
        }
        String string2 = Settings.Secure.getString(this.f18341a.getContentResolver(), nnlllnn.nnlllln.w007700770077www);
        if (string2 != null && string2.length() >= 16) {
            str = string2;
        }
        if (str != null) {
            return str;
        }
        String string3 = UUID.randomUUID().toString();
        Intrinsics.g(string3, "randomUUID().toString()");
        String strConcat = "bad1d000".concat(StringsKt.Q(string3, "-", "", false));
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(k.a.p, strConcat);
        editorEdit.apply();
        return strConcat;
    }
}
