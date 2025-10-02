package androidx.compose.material.ripple;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.collection.MutableIntList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adobe.marketing.mobile.Extension;
import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import com.adobe.marketing.mobile.internal.eventhub.EventHubError;
import com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer;
import com.adobe.marketing.mobile.services.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                return;
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj;
                androidComposeView.C0 = false;
                MotionEvent motionEvent = androidComposeView.w0;
                Intrinsics.e(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.a0(motionEvent);
                return;
            case 2:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.P;
                Trace.beginSection("measureAndLayout");
                try {
                    androidComposeViewAccessibilityDelegateCompat.d.a(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        androidComposeViewAccessibilityDelegateCompat.n();
                        Trace.endSection();
                        androidComposeViewAccessibilityDelegateCompat.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 3:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) obj;
                LifecycleRegistry lifecycleRegistry = processLifecycleOwner.i;
                if (processLifecycleOwner.e == 0) {
                    processLifecycleOwner.f = true;
                    lifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
                }
                if (processLifecycleOwner.d == 0 && processLifecycleOwner.f) {
                    lifecycleRegistry.f(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner.g = true;
                    return;
                }
                return;
            case 4:
                Job job = (Job) obj;
                if (job != null) {
                    job.cancel((CancellationException) null);
                    return;
                }
                return;
            case 5:
                ((AtomicBoolean) obj).set(true);
                return;
            case 6:
                Runnable runnable = (Runnable) obj;
                EventHub eventHub = EventHub.m;
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    e.toString();
                    Log.a();
                    return;
                }
            case 7:
                Function1 it = (Function1) obj;
                EventHub eventHub2 = EventHub.m;
                Intrinsics.h(it, "$it");
                it.invoke(EventHubError.e);
                return;
            case 8:
                EventHub this$0 = (EventHub) obj;
                EventHub eventHub3 = EventHub.m;
                Intrinsics.h(this$0, "this$0");
                this$0.h = true;
                this$0.j.d();
                this$0.l();
                Log.c();
                return;
            case 9:
                ExtensionContainer extensionContainer = (ExtensionContainer) obj;
                Extension extension = extensionContainer.f;
                if (extension != null) {
                    try {
                        extension.f();
                    } catch (Exception unused) {
                    }
                }
                extensionContainer.i();
                Log.a();
                return;
            default:
                WorkInitializer workInitializer = (WorkInitializer) obj;
                workInitializer.d.d(new au.com.woolworths.product.details.epoxy.a(workInitializer, 13));
                return;
        }
    }
}
