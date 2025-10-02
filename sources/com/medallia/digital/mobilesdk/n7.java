package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.x7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
class n7 implements LifeCycle.h, m8, x7.b<u1.b>, j7 {
    protected boolean c;
    protected boolean d;
    protected l7 e;
    protected boolean f;
    protected boolean g;
    private Long i;
    private Long j;
    protected x7 b = new x7(500, this);
    private final ArrayList<t1> h = new ArrayList<>();
    private final Handler k = new Handler(Looper.getMainLooper());
    private final v4 l = new a();
    private final v4 m = new b();
    private final BroadcastReceiver n = new c();

    /* renamed from: a, reason: collision with root package name */
    private final o7 f16611a = new o7();

    public class a extends v4 {

        /* renamed from: com.medallia.digital.mobilesdk.n7$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C0341a extends v4 {
            public C0341a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                n7.this.a(u1.b.evaluationTimerFG);
            }
        }

        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C0341a());
        }
    }

    public class b extends v4 {

        /* loaded from: classes6.dex */
        public class a extends v4 {
            public a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                n7.this.a(u1.b.evaluationTimerBG);
            }
        }

        public b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new a());
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.EvaluateReceiverInitiator")) {
                        u1.b bVar = (u1.b) intent.getSerializableExtra("com.medallia.digital.mobilesdk.EvaluateReceiverInitiator");
                        a4.b("Evaluate Receiver initiator: " + bVar);
                        n7.this.a(bVar);
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16617a;

        static {
            int[] iArr = new int[u1.d.values().length];
            f16617a = iArr;
            try {
                iArr[u1.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16617a[u1.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void c(u1.d dVar) {
        a4.b("Evaluation timer stopped for type " + dVar.toString());
        int i = d.f16617a[dVar.ordinal()];
        if (i == 1) {
            this.k.removeCallbacks(this.m);
        } else if (i != 2) {
            return;
        }
        this.k.removeCallbacks(this.l);
    }

    private void d() throws JSONException {
        List<EvaluationResult> list;
        EvaluationResult evaluationResult;
        l7 l7Var = this.e;
        HashMap<u1.c, List<EvaluationResult>> mapA = l7Var != null ? this.f16611a.a(l7Var) : null;
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.LocalNotification;
        if (f1VarA.c(aVar) > 0) {
            f1.a().a(aVar);
        }
        if (mapA == null || mapA.isEmpty()) {
            return;
        }
        v3.f().i();
        u1.c cVar = u1.c.TRIGGER_RULES;
        if (!mapA.containsKey(cVar)) {
            u1.c cVar2 = u1.c.NEXT_EVALUATION;
            if (!mapA.containsKey(cVar2) || (list = mapA.get(cVar2)) == null || list.isEmpty() || (evaluationResult = list.get(0)) == null) {
                return;
            }
            Long nextEvaluationTime = evaluationResult.getNextEvaluationTime();
            this.j = nextEvaluationTime;
            if (nextEvaluationTime.longValue() > 0) {
                a(u1.d.BACKGROUND);
                return;
            }
            return;
        }
        List<EvaluationResult> list2 = mapA.get(cVar);
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator<EvaluationResult> it = list2.iterator();
        while (it.hasNext()) {
            j2 j2VarC = r2.e().c(it.next().getEngagementId());
            if (j2VarC != null && j2VarC.getInviteData() != null && j2VarC.getInviteData().getLocalNotificationData() != null) {
                t3 localNotificationData = j2VarC.getInviteData().getLocalNotificationData();
                if (localNotificationData == null) {
                    a4.c("Local Notification Data is null");
                    return;
                }
                f1.a().b(localNotificationData);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public i7 a() {
        return i7.V2;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public ArrayList<t1> b() {
        return this.h;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        f();
    }

    public void e() {
        try {
            q4.a(i4.c().b()).a(this.n, new IntentFilter("com.medallia.digital.mobilesdk.EvaluateReceiverFilter"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void f() {
        try {
            q4.a(i4.c().b()).a(this.n);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        c(u1.d.FOREGROUND);
        c(u1.d.BACKGROUND);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        if (this.i != null) {
            this.i = Long.valueOf((CollectorsInfrastructure.getInstance() == null || CollectorsInfrastructure.getInstance().getTimeInBackground() == null || this.i.longValue() <= CollectorsInfrastructure.getInstance().getTimeInBackground().longValue()) ? 1000L : this.i.longValue() - CollectorsInfrastructure.getInstance().getTimeInBackground().longValue());
        }
        a(u1.d.FOREGROUND);
    }

    private void a(long j, u1.b bVar) throws JSONException {
        if (!this.c) {
            a4.b("Intercept is not enabled, FG evaluate won't run");
            return;
        }
        if (this.g && this.f) {
            a4.b("Skip FG evaluation intercept was already shown in session");
            return;
        }
        EvaluationResult evaluationResultB = this.f16611a.b(this.e);
        a4.b("End of FG evaluation: " + evaluationResultB.toJsonString());
        this.i = evaluationResultB.getNextEvaluationTime();
        if (evaluationResultB.getEngagementId() != null) {
            this.f = true;
            c3.d().b(evaluationResultB.getEngagementId(), evaluationResultB.getEngagementType(), System.currentTimeMillis());
        } else if (this.i != null) {
            a(u1.d.FOREGROUND);
        }
        a(evaluationResultB.getEngagementId(), evaluationResultB.toJsonString(), j, bVar);
    }

    @Override // com.medallia.digital.mobilesdk.x7.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(u1.b bVar) throws JSONException {
        ArrayList<u1.d> arrayListA = u1.a(bVar);
        if (this.d) {
            a4.e("Evaluate can’t be trigger because of stop sdk");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a4.b("Start evaluation");
        this.f16611a.a();
        if (arrayListA.contains(u1.d.FOREGROUND)) {
            a(jCurrentTimeMillis, bVar);
        }
        if (arrayListA.contains(u1.d.BACKGROUND)) {
            d();
        }
        a4.b("End of evaluation");
    }

    public void c(boolean z) {
        boolean z2 = this.c;
        if (z2 == z) {
            a4.e("Intercept already ".concat(z2 ? "enabled" : "disabled"));
            return;
        }
        this.c = z;
        if (z) {
            a4.e("Intercept enabled");
            CollectorsInfrastructure.getInstance().interceptEnabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportEnableInterceptEvent();
        } else {
            a4.e("Intercept disabled");
            CollectorsInfrastructure.getInstance().interceptDisabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportDisableInterceptEvent();
        }
        if (!z2 || this.c) {
            a(u1.b.enableIntercept);
        } else {
            c(u1.d.FOREGROUND);
        }
    }

    private void b(u1.d dVar) {
        int i = d.f16617a[dVar.ordinal()];
        if (i == 1) {
            Long l = this.j;
            if (l != null && l.longValue() > 0) {
                this.k.postDelayed(this.m, this.j.longValue());
            }
        } else if (i != 2) {
            return;
        }
        Long l2 = this.i;
        if (l2 != null) {
            this.k.postDelayed(this.l, l2.longValue());
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(ConfigurationContract configurationContract) throws JSONException {
        AnalyticsBridge.getInstance().setTreResourceReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
        if (configurationContract == null || configurationContract.getTargetEvaluatorContract() == null) {
            return;
        }
        this.f = false;
        if (configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.g = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isCanBlockAfterOneSuccess();
        }
        this.e = configurationContract.getTargetEvaluatorContract();
        a(u1.b.updateConfiguration);
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public boolean c() {
        return this.c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.medallia.digital.mobilesdk.j7
    public void a(u1.b bVar) {
        ArrayList<u1.d> arrayListA = u1.a(bVar);
        if (arrayListA != null && arrayListA.size() == 1 && arrayListA.contains(u1.d.FOREGROUND)) {
            if (!this.c) {
                a4.b("Intercept is not enabled, evaluate won't run");
                return;
            } else if (this.g && this.f) {
                a4.b("Skip evaluation intercept was already shown in session");
                return;
            }
        }
        if (this.e == null) {
            a4.c("Target evaluator json is missing");
            return;
        }
        x7 x7Var = this.b;
        if (x7Var == null) {
            a4.c("Throttle is null");
        } else {
            x7Var.a((x7) bVar);
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void b(boolean z) {
        c(z);
    }

    private void a(u1.d dVar) {
        c(dVar);
        b(dVar);
    }

    private void a(String str, String str2, long j, u1.b bVar) throws JSONException {
        j2 j2VarC = r2.e().c(str);
        AnalyticsBridge.getInstance().reportNativeTargetEvaluatorEvent(j, System.currentTimeMillis(), j2VarC != null ? str : null, j2VarC != null ? j2VarC.c() : null, str2, bVar.name());
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z) {
        this.d = z;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        e();
    }
}
