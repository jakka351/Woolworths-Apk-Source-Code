package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
final class PickFirstLoadBalancer extends LoadBalancer {
    public final LoadBalancer.Helper f;
    public LoadBalancer.Subchannel g;
    public ConnectivityState h = ConnectivityState.g;

    /* renamed from: io.grpc.internal.PickFirstLoadBalancer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24070a;

        static {
            int[] iArr = new int[ConnectivityState.values().length];
            f24070a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24070a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24070a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24070a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class PickFirstLoadBalancerConfig {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f24071a;

        public PickFirstLoadBalancerConfig(Boolean bool) {
            this.f24071a = bool;
        }
    }

    public static final class Picker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.PickResult f24072a;

        public Picker(LoadBalancer.PickResult pickResult) {
            Preconditions.j(pickResult, lqlqqlq.m006Dm006Dm006Dm);
            this.f24072a = pickResult;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return this.f24072a;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(Picker.class.getSimpleName());
            toStringHelper.c(this.f24072a, lqlqqlq.m006Dm006Dm006Dm);
            return toStringHelper.toString();
        }
    }

    public final class RequestConnectionPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.Subchannel f24073a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        public RequestConnectionPicker(LoadBalancer.Subchannel subchannel) {
            Preconditions.j(subchannel, "subchannel");
            this.f24073a = subchannel;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            if (this.b.compareAndSet(false, true)) {
                PickFirstLoadBalancer.this.f.d().execute(new Runnable() { // from class: io.grpc.internal.PickFirstLoadBalancer.RequestConnectionPicker.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestConnectionPicker.this.f24073a.f();
                    }
                });
            }
            return LoadBalancer.PickResult.e;
        }
    }

    public PickFirstLoadBalancer(LoadBalancer.Helper helper) {
        this.f = helper;
    }

    @Override // io.grpc.LoadBalancer
    public final Status a(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        Boolean bool;
        List list = resolvedAddresses.f23954a;
        if (list.isEmpty()) {
            Status statusI = Status.n.i("NameResolver returned no usable address. addrs=" + list + ", attrs=" + resolvedAddresses.b);
            c(statusI);
            return statusI;
        }
        Object obj = resolvedAddresses.c;
        if ((obj instanceof PickFirstLoadBalancerConfig) && (bool = ((PickFirstLoadBalancerConfig) obj).f24071a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        LoadBalancer.Subchannel subchannel = this.g;
        if (subchannel == null) {
            LoadBalancer.CreateSubchannelArgs.Builder builderB = LoadBalancer.CreateSubchannelArgs.b();
            builderB.b(list);
            LoadBalancer.CreateSubchannelArgs createSubchannelArgs = new LoadBalancer.CreateSubchannelArgs(builderB.f23951a, builderB.b, builderB.c);
            LoadBalancer.Helper helper = this.f;
            final LoadBalancer.Subchannel subchannelA = helper.a(createSubchannelArgs);
            subchannelA.h(new LoadBalancer.SubchannelStateListener() { // from class: io.grpc.internal.PickFirstLoadBalancer.1
                @Override // io.grpc.LoadBalancer.SubchannelStateListener
                public final void a(ConnectivityStateInfo connectivityStateInfo) {
                    LoadBalancer.SubchannelPicker picker;
                    PickFirstLoadBalancer pickFirstLoadBalancer = PickFirstLoadBalancer.this;
                    LoadBalancer.Helper helper2 = pickFirstLoadBalancer.f;
                    ConnectivityState connectivityState = connectivityStateInfo.f23930a;
                    if (connectivityState == ConnectivityState.h) {
                        return;
                    }
                    ConnectivityState connectivityState2 = ConnectivityState.g;
                    ConnectivityState connectivityState3 = ConnectivityState.f;
                    if (connectivityState == connectivityState3 || connectivityState == connectivityState2) {
                        helper2.e();
                    }
                    if (pickFirstLoadBalancer.h == connectivityState3) {
                        if (connectivityState == ConnectivityState.d) {
                            return;
                        }
                        if (connectivityState == connectivityState2) {
                            pickFirstLoadBalancer.e();
                            return;
                        }
                    }
                    int iOrdinal = connectivityState.ordinal();
                    if (iOrdinal != 0) {
                        LoadBalancer.Subchannel subchannel2 = subchannelA;
                        if (iOrdinal == 1) {
                            picker = new Picker(LoadBalancer.PickResult.b(subchannel2, null));
                        } else if (iOrdinal == 2) {
                            picker = new Picker(LoadBalancer.PickResult.a(connectivityStateInfo.b));
                        } else {
                            if (iOrdinal != 3) {
                                throw new IllegalArgumentException("Unsupported state:" + connectivityState);
                            }
                            picker = pickFirstLoadBalancer.new RequestConnectionPicker(subchannel2);
                        }
                    } else {
                        picker = new Picker(LoadBalancer.PickResult.e);
                    }
                    pickFirstLoadBalancer.h = connectivityState;
                    helper2.f(connectivityState, picker);
                }
            });
            this.g = subchannelA;
            Picker picker = new Picker(LoadBalancer.PickResult.b(subchannelA, null));
            ConnectivityState connectivityState = ConnectivityState.d;
            this.h = connectivityState;
            helper.f(connectivityState, picker);
            subchannelA.f();
        } else {
            subchannel.i(list);
        }
        return Status.e;
    }

    @Override // io.grpc.LoadBalancer
    public final void c(Status status) {
        LoadBalancer.Subchannel subchannel = this.g;
        if (subchannel != null) {
            subchannel.g();
            this.g = null;
        }
        Picker picker = new Picker(LoadBalancer.PickResult.a(status));
        ConnectivityState connectivityState = ConnectivityState.f;
        this.h = connectivityState;
        this.f.f(connectivityState, picker);
    }

    @Override // io.grpc.LoadBalancer
    public final void e() {
        LoadBalancer.Subchannel subchannel = this.g;
        if (subchannel != null) {
            subchannel.f();
        }
    }

    @Override // io.grpc.LoadBalancer
    public final void f() {
        LoadBalancer.Subchannel subchannel = this.g;
        if (subchannel != null) {
            subchannel.g();
        }
    }
}
