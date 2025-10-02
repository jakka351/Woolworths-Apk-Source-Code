package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes6.dex */
public final class zzbl {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.p002firebaseauthapi.zzah f15202a = com.google.android.gms.internal.p002firebaseauthapi.zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    public static final zzbl b = new zzbl();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.getStatusCode());
        editorEdit.putString("statusMessage", status.getStatusMessage());
        editorEdit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzah zzahVar = f15202a;
        int size = zzahVar.size();
        int i = 0;
        while (i < size) {
            E e = zzahVar.get(i);
            i++;
            editorEdit.remove((String) e);
        }
        editorEdit.commit();
    }
}
