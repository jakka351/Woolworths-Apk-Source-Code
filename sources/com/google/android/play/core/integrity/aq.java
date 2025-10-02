package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f14721a;
    private final y b;

    public aq(String str, y yVar) {
        this.f14721a = str;
        this.b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.b.a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f14721a;
    }
}
