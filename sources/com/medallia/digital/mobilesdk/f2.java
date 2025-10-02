package com.medallia.digital.mobilesdk;

import androidx.annotation.VisibleForTesting;
import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONException;

/* loaded from: classes.dex */
class f2 {
    private static final int b = 90;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<c2> f16462a = new LinkedList();

    /* loaded from: classes6.dex */
    public class a implements n6<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c2 f16463a;
        final /* synthetic */ b b;

        public a(c2 c2Var, b bVar) {
            this.f16463a = c2Var;
            this.b = bVar;
        }

        private void a(c2 c2Var) {
            f2.this.f16462a.remove(c2Var);
            if (f2.this.f16462a.isEmpty()) {
                f2.this.a(null, this.b);
                this.b.onSuccess();
            } else {
                f2 f2Var = f2.this;
                f2Var.a((c2) f2Var.f16462a.poll(), this.b);
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Stored feedback failed to submit. Feedback UUID: " + this.f16463a.b());
            a(this.f16463a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r2) {
            a4.b("Stored feedback was submitted successfully. Feedback UUID: " + this.f16463a.b());
            a(this.f16463a);
        }
    }

    public interface b {
        void a();

        void onSuccess();
    }

    public void a() {
        p4.d().c();
    }

    @VisibleForTesting
    public void a(c2 c2Var, b bVar) {
        if (c2Var == null) {
            return;
        }
        f1.a().a(c2Var);
        c2Var.f();
        s4.f().a(c2Var, new a(c2Var, bVar));
    }

    public void a(b bVar) throws JSONException {
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.Feedback;
        ArrayList<? extends b0> arrayListC = f1VarA.c(aVar, new Object[0]);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        AnalyticsBridge.getInstance().reportFeedbackRetryMechanismEvent(arrayListC.size());
        this.f16462a.addAll(arrayListC);
        a(this.f16462a.poll(), bVar);
        f1.a().a(aVar, Long.valueOf(System.currentTimeMillis() - 7776000000L));
    }
}
