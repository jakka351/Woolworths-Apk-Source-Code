package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.login.SignInUC;
import io.reactivex.Single;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ListenerSet.Event, OnCompleteListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g(Object obj, boolean z, int i) {
        this.d = i;
        this.e = obj;
        this.f = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.d) {
            case 0:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.e;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.getClass();
                analyticsListener.y(eventTime, this.f);
                break;
            case 1:
                ((AnalyticsListener) obj).a((AnalyticsListener.EventTime) this.e, this.f);
                break;
            case 2:
                ((AnalyticsListener) obj).j((AnalyticsListener.EventTime) this.e, this.f);
                break;
            default:
                ((AnalyticsListener) obj).C((AnalyticsListener.EventTime) this.e, this.f);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        SignInUC signInUC = (SignInUC) this.e;
        Intrinsics.h(task, "task");
        if (!task.isSuccessful()) {
            Timber.f27013a.p(task.getException());
            return;
        }
        String str = (String) task.getResult();
        if (str == null || (!(!str.equals(signInUC.f.a())) && !this.f)) {
            return;
        }
        DeviceRegistrationUC.RequestValues requestValues = new DeviceRegistrationUC.RequestValues();
        requestValues.f21179a = str;
        Single singleB = signInUC.g.b(requestValues);
        com.google.common.net.a aVar = new com.google.common.net.a(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(21), 19);
        com.google.common.net.a aVar2 = new com.google.common.net.a(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(22), 20);
        singleB.getClass();
        singleB.a(new ConsumerSingleObserver(aVar, aVar2));
    }
}
