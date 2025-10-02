package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModel;
import java.util.UUID;

@KeepForSdk
/* loaded from: classes.dex */
public class SharedPrefManager {
    public static final Component b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15985a;

    static {
        Component.Builder builderB = Component.b(SharedPrefManager.class);
        builderB.a(Dependency.c(MlKitContext.class));
        builderB.a(Dependency.c(Context.class));
        builderB.f = new zzs();
        b = builderB.b();
    }

    public SharedPrefManager(@NonNull Context context) {
        this.f15985a = context;
    }

    public final synchronized String a() {
        String string = c().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        c().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    public final synchronized long b() {
        return c().getLong("downloading_begin_time_" + RemoteModel.a(), 0L);
    }

    public final SharedPreferences c() {
        return this.f15985a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
