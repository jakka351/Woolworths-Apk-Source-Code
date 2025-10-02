package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.common.utils.SdkExecutors;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* loaded from: classes8.dex */
public final class L4 implements IPSCancelable {

    /* renamed from: a, reason: collision with root package name */
    public final K4 f25971a;
    public boolean b = false;
    public boolean c = false;
    public IPSCancelable d;
    public O2 e;
    public ScheduledFuture f;
    public final int g;

    public L4(int i, K4 k4) {
        this.f25971a = k4;
        this.g = i;
    }

    public final /* synthetic */ void a(int i, IPSError iPSError) {
        this.d = null;
        c(i);
    }

    public final void b(int i) {
        IPSCancelable iPSCancelable = this.d;
        if (iPSCancelable != null) {
            iPSCancelable.cancel();
        }
        this.d = this.f25971a.a(new au.com.woolworths.android.onesite.modules.checkout.digitalpay.m(this, i));
    }

    public final void c(final int i) {
        O2 o2 = this.e;
        if (o2 != null) {
            CoreLogic.INSTANCE.removeNetworkStateListener(o2);
        }
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if (i >= this.g) {
            return;
        }
        if (((Boolean) ((NetworkManager) JavaDi.get(NetworkManager.class)).isConnected().getValue()).booleanValue()) {
            this.f = SdkExecutors.schedule(new androidx.core.content.res.a(i, 5, this), Math.min((long) Math.pow(2.0d, i - 1), 30L), TimeUnit.SECONDS);
        } else {
            O2 o22 = new O2() { // from class: me.oriient.ipssdk.realtime.ofs.a5
                @Override // me.oriient.ipssdk.realtime.ofs.O2
                public final void a(boolean z) {
                    this.f26044a.a(i, z);
                }
            };
            this.e = o22;
            CoreLogic.INSTANCE.addNetworkStateListener(o22);
        }
    }

    @Override // me.oriient.ipssdk.api.models.IPSCancelable
    public final synchronized void cancel() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            IPSCancelable iPSCancelable = this.d;
            if (iPSCancelable != null) {
                iPSCancelable.cancel();
            }
            O2 o2 = this.e;
            if (o2 != null) {
                CoreLogic.INSTANCE.removeNetworkStateListener(o2);
            }
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // me.oriient.ipssdk.api.models.IPSCancelable
    public final boolean isCanceled() {
        return this.c;
    }

    public final void a(int i, boolean z) {
        if (z) {
            O2 o2 = this.e;
            if (o2 != null) {
                CoreLogic.INSTANCE.removeNetworkStateListener(o2);
            }
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            b(i + 1);
        }
    }

    public final /* synthetic */ void a(int i) {
        b(i + 1);
    }
}
