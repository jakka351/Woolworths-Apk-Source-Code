package au.com.woolworths.base.wallet.digipay.framesview;

import butterknife.internal.DebouncingOnClickListener;
import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                DebouncingOnClickListener.f = true;
                break;
            case 2:
                EventHub eventHub = EventHub.m;
                break;
            case 3:
                int i = AlarmManagerSchedulerBroadcastReceiver.f14470a;
                break;
            default:
                Positioning.a();
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
    }
}
