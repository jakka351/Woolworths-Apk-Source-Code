package com.xwray.groupie;

import android.os.AsyncTask;
import androidx.recyclerview.widget.DiffUtil;

/* loaded from: classes7.dex */
class DiffTask extends AsyncTask<Void, Void, DiffUtil.DiffResult> {

    /* renamed from: a, reason: collision with root package name */
    public Exception f23757a;

    @Override // android.os.AsyncTask
    public final DiffUtil.DiffResult doInBackground(Void[] voidArr) {
        try {
            DiffUtil.a(null, false);
            throw null;
        } catch (Exception e) {
            this.f23757a = e;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(DiffUtil.DiffResult diffResult) {
        this.f23757a.getClass();
        throw new RuntimeException(this.f23757a);
    }
}
