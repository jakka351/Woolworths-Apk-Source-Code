package io.grpc.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.ClientStreamTracer;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.Internal;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.ServiceConfigUtil;
import io.grpc.internal.TimeProvider;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Internal
/* loaded from: classes7.dex */
public final class OutlierDetectionLoadBalancer extends LoadBalancer {
    public static final Attributes.Key n = new Attributes.Key("addressTrackerKey");
    public final AddressTrackerMap f;
    public final SynchronizationContext g;
    public final GracefulSwitchLoadBalancer h;
    public final TimeProvider i;
    public final ScheduledExecutorService j;
    public SynchronizationContext.ScheduledHandle k;
    public Long l;
    public final ChannelLogger m;

    public static class AddressTracker {

        /* renamed from: a, reason: collision with root package name */
        public OutlierDetectionLoadBalancerConfig f24168a;
        public Long d;
        public int e;
        public volatile CallCounter b = new CallCounter();
        public CallCounter c = new CallCounter();
        public final HashSet f = new HashSet();

        public static class CallCounter {

            /* renamed from: a, reason: collision with root package name */
            public final AtomicLong f24169a = new AtomicLong();
            public final AtomicLong b = new AtomicLong();
        }

        public AddressTracker(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig) {
            this.f24168a = outlierDetectionLoadBalancerConfig;
        }

        public final void a(OutlierDetectionSubchannel outlierDetectionSubchannel) {
            if (d() && !outlierDetectionSubchannel.c) {
                outlierDetectionSubchannel.k();
            } else if (!d() && outlierDetectionSubchannel.c) {
                outlierDetectionSubchannel.c = false;
                ConnectivityStateInfo connectivityStateInfo = outlierDetectionSubchannel.d;
                if (connectivityStateInfo != null) {
                    outlierDetectionSubchannel.e.a(connectivityStateInfo);
                    outlierDetectionSubchannel.f.b(ChannelLogger.ChannelLogLevel.e, "Subchannel unejected: {0}", outlierDetectionSubchannel);
                }
            }
            outlierDetectionSubchannel.b = this;
            this.f.add(outlierDetectionSubchannel);
        }

        public final void b(long j) {
            this.d = Long.valueOf(j);
            this.e++;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((OutlierDetectionSubchannel) it.next()).k();
            }
        }

        public final long c() {
            return this.c.b.get() + this.c.f24169a.get();
        }

        public final boolean d() {
            return this.d != null;
        }

        public final void e() {
            Preconditions.q("not currently ejected", this.d != null);
            this.d = null;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                OutlierDetectionSubchannel outlierDetectionSubchannel = (OutlierDetectionSubchannel) it.next();
                outlierDetectionSubchannel.c = false;
                ConnectivityStateInfo connectivityStateInfo = outlierDetectionSubchannel.d;
                if (connectivityStateInfo != null) {
                    outlierDetectionSubchannel.e.a(connectivityStateInfo);
                    outlierDetectionSubchannel.f.b(ChannelLogger.ChannelLogLevel.e, "Subchannel unejected: {0}", outlierDetectionSubchannel);
                }
            }
        }

        public final String toString() {
            return "AddressTracker{subchannels=" + this.f + '}';
        }
    }

    public static class AddressTrackerMap extends ForwardingMap<SocketAddress, AddressTracker> {
        public final HashMap d = new HashMap();

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: R1 */
        public final Map P1() {
            return this.d;
        }

        public final double Y1() {
            HashMap map = this.d;
            if (map.isEmpty()) {
                return 0.0d;
            }
            Iterator it = map.values().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i2++;
                if (((AddressTracker) it.next()).d()) {
                    i++;
                }
            }
            return (i / i2) * 100.0d;
        }
    }

    public class ChildHelper extends ForwardingLoadBalancerHelper {

        /* renamed from: a, reason: collision with root package name */
        public final HealthProducerHelper f24170a;

        public ChildHelper(LoadBalancer.Helper helper) {
            this.f24170a = new HealthProducerHelper(helper);
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        public final LoadBalancer.Subchannel a(LoadBalancer.CreateSubchannelArgs createSubchannelArgs) {
            OutlierDetectionLoadBalancer outlierDetectionLoadBalancer = OutlierDetectionLoadBalancer.this;
            AddressTrackerMap addressTrackerMap = outlierDetectionLoadBalancer.f;
            OutlierDetectionSubchannel outlierDetectionSubchannel = outlierDetectionLoadBalancer.new OutlierDetectionSubchannel(createSubchannelArgs, this.f24170a);
            List list = createSubchannelArgs.f23950a;
            if (OutlierDetectionLoadBalancer.g(list) && addressTrackerMap.containsKey(((EquivalentAddressGroup) list.get(0)).f23936a.get(0))) {
                AddressTracker addressTracker = (AddressTracker) addressTrackerMap.get(((EquivalentAddressGroup) list.get(0)).f23936a.get(0));
                addressTracker.a(outlierDetectionSubchannel);
                if (addressTracker.d != null) {
                    outlierDetectionSubchannel.k();
                }
            }
            return outlierDetectionSubchannel;
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        public final void f(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
            this.f24170a.f(connectivityState, new OutlierDetectionPicker(subchannelPicker));
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper
        public final LoadBalancer.Helper g() {
            return this.f24170a;
        }
    }

    public class DetectionTimer implements Runnable {
        public final OutlierDetectionLoadBalancerConfig d;
        public final ChannelLogger e;

        public DetectionTimer(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            this.d = outlierDetectionLoadBalancerConfig;
            this.e = channelLogger;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OutlierDetectionLoadBalancer outlierDetectionLoadBalancer = OutlierDetectionLoadBalancer.this;
            outlierDetectionLoadBalancer.l = Long.valueOf(outlierDetectionLoadBalancer.i.a());
            for (AddressTracker addressTracker : OutlierDetectionLoadBalancer.this.f.d.values()) {
                AddressTracker.CallCounter callCounter = addressTracker.c;
                callCounter.f24169a.set(0L);
                callCounter.b.set(0L);
                AddressTracker.CallCounter callCounter2 = addressTracker.b;
                addressTracker.b = addressTracker.c;
                addressTracker.c = callCounter2;
            }
            OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig = this.d;
            ChannelLogger channelLogger = this.e;
            ImmutableList.Builder builderM = ImmutableList.m();
            if (outlierDetectionLoadBalancerConfig.e != null) {
                builderM.h(new SuccessRateOutlierEjectionAlgorithm(outlierDetectionLoadBalancerConfig, channelLogger));
            }
            if (outlierDetectionLoadBalancerConfig.f != null) {
                builderM.h(new FailurePercentageOutlierEjectionAlgorithm(outlierDetectionLoadBalancerConfig, channelLogger));
            }
            UnmodifiableListIterator unmodifiableListIteratorListIterator = builderM.j().listIterator(0);
            while (unmodifiableListIteratorListIterator.hasNext()) {
                OutlierEjectionAlgorithm outlierEjectionAlgorithm = (OutlierEjectionAlgorithm) unmodifiableListIteratorListIterator.next();
                OutlierDetectionLoadBalancer outlierDetectionLoadBalancer2 = OutlierDetectionLoadBalancer.this;
                outlierEjectionAlgorithm.a(outlierDetectionLoadBalancer2.f, outlierDetectionLoadBalancer2.l.longValue());
            }
            OutlierDetectionLoadBalancer outlierDetectionLoadBalancer3 = OutlierDetectionLoadBalancer.this;
            AddressTrackerMap addressTrackerMap = outlierDetectionLoadBalancer3.f;
            Long l = outlierDetectionLoadBalancer3.l;
            for (AddressTracker addressTracker2 : addressTrackerMap.d.values()) {
                if (!addressTracker2.d()) {
                    int i = addressTracker2.e;
                    addressTracker2.e = i == 0 ? 0 : i - 1;
                }
                if (addressTracker2.d()) {
                    if (l.longValue() > Math.min(addressTracker2.f24168a.b.longValue() * addressTracker2.e, Math.max(addressTracker2.f24168a.b.longValue(), addressTracker2.f24168a.c.longValue())) + addressTracker2.d.longValue()) {
                        addressTracker2.e();
                    }
                }
            }
        }
    }

    public static class FailurePercentageOutlierEjectionAlgorithm implements OutlierEjectionAlgorithm {

        /* renamed from: a, reason: collision with root package name */
        public final OutlierDetectionLoadBalancerConfig f24171a;
        public final ChannelLogger b;

        public FailurePercentageOutlierEjectionAlgorithm(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            this.f24171a = outlierDetectionLoadBalancerConfig;
            this.b = channelLogger;
        }

        @Override // io.grpc.util.OutlierDetectionLoadBalancer.OutlierEjectionAlgorithm
        public final void a(AddressTrackerMap addressTrackerMap, long j) {
            OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig = this.f24171a;
            ArrayList arrayListH = OutlierDetectionLoadBalancer.h(addressTrackerMap, outlierDetectionLoadBalancerConfig.f.d.intValue());
            int size = arrayListH.size();
            OutlierDetectionLoadBalancerConfig.FailurePercentageEjection failurePercentageEjection = outlierDetectionLoadBalancerConfig.f;
            if (size < failurePercentageEjection.c.intValue() || arrayListH.size() == 0) {
                return;
            }
            Iterator it = arrayListH.iterator();
            while (it.hasNext()) {
                AddressTracker addressTracker = (AddressTracker) it.next();
                if (addressTrackerMap.Y1() >= outlierDetectionLoadBalancerConfig.d.intValue()) {
                    return;
                }
                if (addressTracker.c() >= failurePercentageEjection.d.intValue()) {
                    if (addressTracker.c.b.get() / addressTracker.c() > failurePercentageEjection.f24174a.intValue() / 100.0d) {
                        this.b.b(ChannelLogger.ChannelLogLevel.d, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", addressTracker, Double.valueOf(addressTracker.c.b.get() / addressTracker.c()));
                        if (new Random().nextInt(100) < failurePercentageEjection.b.intValue()) {
                            addressTracker.b(j);
                        }
                    }
                }
            }
        }
    }

    public static final class OutlierDetectionLoadBalancerConfig {

        /* renamed from: a, reason: collision with root package name */
        public final Long f24172a;
        public final Long b;
        public final Long c;
        public final Integer d;
        public final SuccessRateEjection e;
        public final FailurePercentageEjection f;
        public final ServiceConfigUtil.PolicySelection g;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public Long f24173a;
            public Long b;
            public Long c;
            public Integer d;
            public SuccessRateEjection e;
            public FailurePercentageEjection f;
            public ServiceConfigUtil.PolicySelection g;
        }

        public static class FailurePercentageEjection {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f24174a;
            public final Integer b;
            public final Integer c;
            public final Integer d;

            public static class Builder {

                /* renamed from: a, reason: collision with root package name */
                public Integer f24175a;
                public Integer b;
                public Integer c;
                public Integer d;
            }

            public FailurePercentageEjection(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f24174a = num;
                this.b = num2;
                this.c = num3;
                this.d = num4;
            }
        }

        public static class SuccessRateEjection {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f24176a;
            public final Integer b;
            public final Integer c;
            public final Integer d;

            public static final class Builder {

                /* renamed from: a, reason: collision with root package name */
                public Integer f24177a;
                public Integer b;
                public Integer c;
                public Integer d;
            }

            public SuccessRateEjection(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f24176a = num;
                this.b = num2;
                this.c = num3;
                this.d = num4;
            }
        }

        public OutlierDetectionLoadBalancerConfig(Long l, Long l2, Long l3, Integer num, SuccessRateEjection successRateEjection, FailurePercentageEjection failurePercentageEjection, ServiceConfigUtil.PolicySelection policySelection) {
            this.f24172a = l;
            this.b = l2;
            this.c = l3;
            this.d = num;
            this.e = successRateEjection;
            this.f = failurePercentageEjection;
            this.g = policySelection;
        }
    }

    public class OutlierDetectionPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.SubchannelPicker f24178a;

        public class ResultCountingClientStreamTracerFactory extends ClientStreamTracer.Factory {

            /* renamed from: a, reason: collision with root package name */
            public final AddressTracker f24179a;
            public final ClientStreamTracer.Factory b;

            public ResultCountingClientStreamTracerFactory(AddressTracker addressTracker, ClientStreamTracer.Factory factory) {
                this.f24179a = addressTracker;
                this.b = factory;
            }

            @Override // io.grpc.ClientStreamTracer.Factory
            public final ClientStreamTracer a(ClientStreamTracer.StreamInfo streamInfo, Metadata metadata) {
                ClientStreamTracer.Factory factory = this.b;
                if (factory == null) {
                    return new ClientStreamTracer() { // from class: io.grpc.util.OutlierDetectionLoadBalancer.OutlierDetectionPicker.ResultCountingClientStreamTracerFactory.2
                        @Override // io.grpc.StreamTracer
                        public final void i(Status status) {
                            AddressTracker addressTracker = ResultCountingClientStreamTracerFactory.this.f24179a;
                            boolean zF = status.f();
                            OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig = addressTracker.f24168a;
                            if (outlierDetectionLoadBalancerConfig.e == null && outlierDetectionLoadBalancerConfig.f == null) {
                                return;
                            }
                            if (zF) {
                                addressTracker.b.f24169a.getAndIncrement();
                            } else {
                                addressTracker.b.b.getAndIncrement();
                            }
                        }
                    };
                }
                final ClientStreamTracer clientStreamTracerA = factory.a(streamInfo, metadata);
                return new ForwardingClientStreamTracer() { // from class: io.grpc.util.OutlierDetectionLoadBalancer.OutlierDetectionPicker.ResultCountingClientStreamTracerFactory.1
                    @Override // io.grpc.util.ForwardingClientStreamTracer, io.grpc.StreamTracer
                    public final void i(Status status) {
                        AddressTracker addressTracker = ResultCountingClientStreamTracerFactory.this.f24179a;
                        boolean zF = status.f();
                        OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig = addressTracker.f24168a;
                        if (outlierDetectionLoadBalancerConfig.e != null || outlierDetectionLoadBalancerConfig.f != null) {
                            if (zF) {
                                addressTracker.b.f24169a.getAndIncrement();
                            } else {
                                addressTracker.b.b.getAndIncrement();
                            }
                        }
                        clientStreamTracerA.i(status);
                    }

                    @Override // io.grpc.util.ForwardingClientStreamTracer
                    public final ClientStreamTracer o() {
                        return clientStreamTracerA;
                    }
                };
            }
        }

        public OutlierDetectionPicker(LoadBalancer.SubchannelPicker subchannelPicker) {
            this.f24178a = subchannelPicker;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            LoadBalancer.PickResult pickResultA = this.f24178a.a(pickSubchannelArgs);
            LoadBalancer.Subchannel subchannel = pickResultA.f23953a;
            if (subchannel == null) {
                return pickResultA;
            }
            Attributes attributesC = subchannel.c();
            return LoadBalancer.PickResult.b(subchannel, new ResultCountingClientStreamTracerFactory((AddressTracker) attributesC.f23916a.get(OutlierDetectionLoadBalancer.n), pickResultA.b));
        }
    }

    public class OutlierDetectionSubchannel extends ForwardingSubchannel {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.Subchannel f24180a;
        public AddressTracker b;
        public boolean c;
        public ConnectivityStateInfo d;
        public LoadBalancer.SubchannelStateListener e;
        public final ChannelLogger f;

        public class OutlierDetectionSubchannelStateListener implements LoadBalancer.SubchannelStateListener {

            /* renamed from: a, reason: collision with root package name */
            public final LoadBalancer.SubchannelStateListener f24181a;

            public OutlierDetectionSubchannelStateListener(LoadBalancer.SubchannelStateListener subchannelStateListener) {
                this.f24181a = subchannelStateListener;
            }

            @Override // io.grpc.LoadBalancer.SubchannelStateListener
            public final void a(ConnectivityStateInfo connectivityStateInfo) {
                OutlierDetectionSubchannel outlierDetectionSubchannel = OutlierDetectionSubchannel.this;
                outlierDetectionSubchannel.d = connectivityStateInfo;
                if (outlierDetectionSubchannel.c) {
                    return;
                }
                this.f24181a.a(connectivityStateInfo);
            }
        }

        public OutlierDetectionSubchannel(LoadBalancer.CreateSubchannelArgs createSubchannelArgs, HealthProducerHelper healthProducerHelper) {
            LoadBalancer.SubchannelStateListener subchannelStateListener = (LoadBalancer.SubchannelStateListener) createSubchannelArgs.a();
            if (subchannelStateListener != null) {
                this.e = subchannelStateListener;
                OutlierDetectionSubchannelStateListener outlierDetectionSubchannelStateListener = new OutlierDetectionSubchannelStateListener(subchannelStateListener);
                LoadBalancer.CreateSubchannelArgs.Builder builderB = LoadBalancer.CreateSubchannelArgs.b();
                builderB.b(createSubchannelArgs.f23950a);
                Attributes attributes = createSubchannelArgs.b;
                Preconditions.j(attributes, "attrs");
                builderB.b = attributes;
                Object[][] objArr = createSubchannelArgs.c;
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                builderB.c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                builderB.a(outlierDetectionSubchannelStateListener);
                this.f24180a = healthProducerHelper.a(new LoadBalancer.CreateSubchannelArgs(builderB.f23951a, builderB.b, builderB.c));
            } else {
                this.f24180a = healthProducerHelper.a(createSubchannelArgs);
            }
            this.f = this.f24180a.d();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public final Attributes c() {
            AddressTracker addressTracker = this.b;
            LoadBalancer.Subchannel subchannel = this.f24180a;
            if (addressTracker == null) {
                return subchannel.c();
            }
            Attributes attributesC = subchannel.c();
            attributesC.getClass();
            Attributes.Builder builder = new Attributes.Builder(attributesC);
            builder.b(OutlierDetectionLoadBalancer.n, this.b);
            return builder.a();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public final void g() {
            AddressTracker addressTracker = this.b;
            if (addressTracker != null) {
                this.b = null;
                addressTracker.f.remove(this);
            }
            super.g();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public final void h(LoadBalancer.SubchannelStateListener subchannelStateListener) {
            if (this.e != null) {
                super.h(subchannelStateListener);
            } else {
                this.e = subchannelStateListener;
                super.h(new OutlierDetectionSubchannelStateListener(subchannelStateListener));
            }
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public final void i(List list) {
            OutlierDetectionLoadBalancer outlierDetectionLoadBalancer = OutlierDetectionLoadBalancer.this;
            if (OutlierDetectionLoadBalancer.g(b()) && OutlierDetectionLoadBalancer.g(list)) {
                if (outlierDetectionLoadBalancer.f.containsValue(this.b)) {
                    AddressTracker addressTracker = this.b;
                    addressTracker.getClass();
                    this.b = null;
                    addressTracker.f.remove(this);
                }
                SocketAddress socketAddress = (SocketAddress) ((EquivalentAddressGroup) list.get(0)).f23936a.get(0);
                if (outlierDetectionLoadBalancer.f.containsKey(socketAddress)) {
                    ((AddressTracker) outlierDetectionLoadBalancer.f.get(socketAddress)).a(this);
                }
            } else if (!OutlierDetectionLoadBalancer.g(b()) || OutlierDetectionLoadBalancer.g(list)) {
                if (!OutlierDetectionLoadBalancer.g(b()) && OutlierDetectionLoadBalancer.g(list)) {
                    SocketAddress socketAddress2 = (SocketAddress) ((EquivalentAddressGroup) list.get(0)).f23936a.get(0);
                    if (outlierDetectionLoadBalancer.f.containsKey(socketAddress2)) {
                        ((AddressTracker) outlierDetectionLoadBalancer.f.get(socketAddress2)).a(this);
                    }
                }
            } else if (outlierDetectionLoadBalancer.f.containsKey(a().f23936a.get(0))) {
                AddressTracker addressTracker2 = (AddressTracker) outlierDetectionLoadBalancer.f.get(a().f23936a.get(0));
                addressTracker2.getClass();
                this.b = null;
                addressTracker2.f.remove(this);
                AddressTracker.CallCounter callCounter = addressTracker2.b;
                callCounter.f24169a.set(0L);
                callCounter.b.set(0L);
                AddressTracker.CallCounter callCounter2 = addressTracker2.c;
                callCounter2.f24169a.set(0L);
                callCounter2.b.set(0L);
            }
            this.f24180a.i(list);
        }

        @Override // io.grpc.util.ForwardingSubchannel
        public final LoadBalancer.Subchannel j() {
            return this.f24180a;
        }

        public final void k() {
            this.c = true;
            LoadBalancer.SubchannelStateListener subchannelStateListener = this.e;
            Status status = Status.n;
            Preconditions.f("The error status must not be OK", true ^ status.f());
            subchannelStateListener.a(new ConnectivityStateInfo(ConnectivityState.f, status));
            this.f.b(ChannelLogger.ChannelLogLevel.e, "Subchannel ejected: {0}", this);
        }

        @Override // io.grpc.util.ForwardingSubchannel
        public final String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f24180a.b() + '}';
        }
    }

    public interface OutlierEjectionAlgorithm {
        void a(AddressTrackerMap addressTrackerMap, long j);
    }

    public static class SuccessRateOutlierEjectionAlgorithm implements OutlierEjectionAlgorithm {

        /* renamed from: a, reason: collision with root package name */
        public final OutlierDetectionLoadBalancerConfig f24182a;
        public final ChannelLogger b;

        public SuccessRateOutlierEjectionAlgorithm(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            Preconditions.f("success rate ejection config is null", outlierDetectionLoadBalancerConfig.e != null);
            this.f24182a = outlierDetectionLoadBalancerConfig;
            this.b = channelLogger;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
        @Override // io.grpc.util.OutlierDetectionLoadBalancer.OutlierEjectionAlgorithm
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(io.grpc.util.OutlierDetectionLoadBalancer.AddressTrackerMap r18, long r19) {
            /*
                Method dump skipped, instructions count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.util.OutlierDetectionLoadBalancer.SuccessRateOutlierEjectionAlgorithm.a(io.grpc.util.OutlierDetectionLoadBalancer$AddressTrackerMap, long):void");
        }
    }

    public OutlierDetectionLoadBalancer(LoadBalancer.Helper helper) {
        ChannelLogger channelLoggerB = helper.b();
        this.m = channelLoggerB;
        this.h = new GracefulSwitchLoadBalancer(new ChildHelper(helper));
        this.f = new AddressTrackerMap();
        SynchronizationContext synchronizationContextD = helper.d();
        Preconditions.j(synchronizationContextD, "syncContext");
        this.g = synchronizationContextD;
        ScheduledExecutorService scheduledExecutorServiceC = helper.c();
        Preconditions.j(scheduledExecutorServiceC, "timeService");
        this.j = scheduledExecutorServiceC;
        this.i = TimeProvider.f24111a;
        channelLoggerB.a(ChannelLogger.ChannelLogLevel.d, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((EquivalentAddressGroup) it.next()).f23936a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(AddressTrackerMap addressTrackerMap, int i) {
        ArrayList arrayList = new ArrayList();
        for (AddressTracker addressTracker : addressTrackerMap.values()) {
            if (addressTracker.c() >= i) {
                arrayList.add(addressTracker);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.LoadBalancer
    public final Status a(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        GracefulSwitchLoadBalancer gracefulSwitchLoadBalancer = this.h;
        AddressTrackerMap addressTrackerMap = this.f;
        ChannelLogger channelLogger = this.m;
        channelLogger.b(ChannelLogger.ChannelLogLevel.d, "Received resolution result: {0}", resolvedAddresses);
        OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig = (OutlierDetectionLoadBalancerConfig) resolvedAddresses.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = resolvedAddresses.f23954a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((EquivalentAddressGroup) it.next()).f23936a);
        }
        addressTrackerMap.keySet().retainAll(arrayList);
        Iterator it2 = addressTrackerMap.d.values().iterator();
        while (it2.hasNext()) {
            ((AddressTracker) it2.next()).f24168a = outlierDetectionLoadBalancerConfig;
        }
        HashMap map = addressTrackerMap.d;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new AddressTracker(outlierDetectionLoadBalancerConfig));
            }
        }
        ServiceConfigUtil.PolicySelection policySelection = outlierDetectionLoadBalancerConfig.g;
        Long l = outlierDetectionLoadBalancerConfig.f24172a;
        gracefulSwitchLoadBalancer.i(policySelection.f24103a);
        if (outlierDetectionLoadBalancerConfig.e == null && outlierDetectionLoadBalancerConfig.f == null) {
            SynchronizationContext.ScheduledHandle scheduledHandle = this.k;
            if (scheduledHandle != null) {
                scheduledHandle.a();
                this.l = null;
                for (AddressTracker addressTracker : addressTrackerMap.d.values()) {
                    if (addressTracker.d()) {
                        addressTracker.e();
                    }
                    addressTracker.e = 0;
                }
            }
        } else {
            Long lValueOf = this.l == null ? l : Long.valueOf(Math.max(0L, l.longValue() - (this.i.a() - this.l.longValue())));
            SynchronizationContext.ScheduledHandle scheduledHandle2 = this.k;
            if (scheduledHandle2 != null) {
                scheduledHandle2.a();
                for (AddressTracker addressTracker2 : addressTrackerMap.d.values()) {
                    AddressTracker.CallCounter callCounter = addressTracker2.b;
                    callCounter.f24169a.set(0L);
                    callCounter.b.set(0L);
                    AddressTracker.CallCounter callCounter2 = addressTracker2.c;
                    callCounter2.f24169a.set(0L);
                    callCounter2.b.set(0L);
                }
            }
            SynchronizationContext synchronizationContext = this.g;
            DetectionTimer detectionTimer = new DetectionTimer(outlierDetectionLoadBalancerConfig, channelLogger);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            this.k = synchronizationContext.d(detectionTimer, jLongValue, jLongValue2, this.j);
        }
        LoadBalancer.ResolvedAddresses.Builder builder = new LoadBalancer.ResolvedAddresses.Builder();
        Attributes attributes = Attributes.b;
        builder.f23955a = resolvedAddresses.f23954a;
        builder.b = resolvedAddresses.b;
        builder.c = resolvedAddresses.c;
        builder.c = outlierDetectionLoadBalancerConfig.g.b;
        gracefulSwitchLoadBalancer.d(builder.a());
        return Status.e;
    }

    @Override // io.grpc.LoadBalancer
    public final void c(Status status) {
        this.h.c(status);
    }

    @Override // io.grpc.LoadBalancer
    public final void f() {
        this.h.f();
    }
}
