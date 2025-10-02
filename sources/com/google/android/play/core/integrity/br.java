package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes6.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a, reason: collision with root package name */
    private final String f14742a;
    private final y b;

    public br(String str, y yVar) {
        this.f14742a = str;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.b.a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f14742a;
    }
}
