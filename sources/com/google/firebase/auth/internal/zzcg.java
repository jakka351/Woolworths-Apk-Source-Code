package com.google.firebase.auth.internal;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public final class zzcg {
    public static final zzcg b = new zzcg();

    /* renamed from: a, reason: collision with root package name */
    public final zzbl f15210a;

    public zzcg() {
        zzbl zzblVar = zzbl.b;
        if (zzax.b == null) {
            zzax.b = new zzax();
        }
        this.f15210a = zzblVar;
    }

    public static zzcg c() {
        return b;
    }

    public final void a(FragmentActivity fragmentActivity) {
        this.f15210a.getClass();
        Preconditions.checkNotNull(fragmentActivity);
        zzbl.b(fragmentActivity.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.google.firebase.auth.FirebaseAuth r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzcg.b(com.google.firebase.auth.FirebaseAuth):void");
    }
}
