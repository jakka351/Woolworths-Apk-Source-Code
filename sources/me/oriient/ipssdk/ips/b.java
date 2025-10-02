package me.oriient.ipssdk.ips;

import android.view.View;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f25789a;

    public b(c cVar) {
        this.f25789a = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            this.f25789a.g.cancelCalibration();
        } finally {
            Callback.h();
        }
    }
}
