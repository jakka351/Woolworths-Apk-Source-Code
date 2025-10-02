package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import io.branch.referral.Branch;
import io.branch.referral.ServerRequest;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONException;

/* loaded from: classes.dex */
class BranchActivityLifecycleObserver implements Application.ActivityLifecycleCallbacks {
    public int d;
    public HashSet e;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        BranchLogger.e("onActivityCreated, activity = " + activity);
        Branch branchI = Branch.i();
        if (branchI == null) {
            return;
        }
        branchI.g = Branch.INTENT_STATE.d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        BranchLogger.e("onActivityDestroyed, activity = " + activity);
        Branch branchI = Branch.i();
        if (branchI == null) {
            return;
        }
        if (branchI.h() == activity) {
            branchI.i.clear();
        }
        this.e.remove(activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        BranchLogger.e("onActivityPaused, activity = " + activity);
        Branch.i();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws JSONException {
        BranchLogger.e("onActivityResumed, activity = " + activity);
        Branch branchI = Branch.i();
        if (branchI == null) {
            return;
        }
        BranchLogger.e("onIntentReady " + activity + " removing INTENT_PENDING_WAIT_LOCK");
        branchI.g = Branch.INTENT_STATE.e;
        ServerRequestQueue serverRequestQueue = branchI.e;
        serverRequestQueue.m(ServerRequest.PROCESS_WAIT_LOCK.f);
        if (activity.getIntent() != null && branchI.h != Branch.SESSION_STATE.d) {
            branchI.n(activity.getIntent().getData(), activity);
        }
        serverRequestQueue.k("onIntentReady");
        if (branchI.h == Branch.SESSION_STATE.f && !Branch.q) {
            Branch.InitSessionBuilder initSessionBuilderO = Branch.o(activity);
            initSessionBuilderO.b = true;
            initSessionBuilderO.a();
        }
        this.e.add(activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        BranchLogger.e("onActivityStarted, activity = " + activity);
        Branch branchI = Branch.i();
        if (branchI == null) {
            return;
        }
        branchI.i = new WeakReference(activity);
        branchI.g = Branch.INTENT_STATE.d;
        this.d++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        BranchLogger.e("onActivityStopped, activity = " + activity);
        Branch branchI = Branch.i();
        if (branchI == null) {
            return;
        }
        int i = this.d - 1;
        this.d = i;
        if (i < 1) {
            branchI.j = false;
            PrefHelper prefHelper = branchI.b;
            prefHelper.e.f23854a.clear();
            Branch.SESSION_STATE session_state = branchI.h;
            Branch.SESSION_STATE session_state2 = Branch.SESSION_STATE.f;
            if (session_state != session_state2) {
                branchI.h = session_state2;
            }
            prefHelper.p("bnc_session_params", "bnc_no_value");
            prefHelper.p("bnc_external_intent_uri", null);
            TrackingController trackingController = branchI.l;
            Context context = branchI.d;
            trackingController.getClass();
            trackingController.f23868a = PrefHelper.d(context).b("bnc_tracking_state");
        }
    }
}
