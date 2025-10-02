package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableListIterator;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.grpc.Attributes;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.PickFirstLeafLoadBalancer;
import io.grpc.internal.PickFirstLeafLoadBalancer.RequestConnectionPicker;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

@ExperimentalApi
/* loaded from: classes7.dex */
final class PickFirstLeafLoadBalancer extends LoadBalancer {
    public static final Logger o = Logger.getLogger(PickFirstLeafLoadBalancer.class.getName());
    public final LoadBalancer.Helper f;
    public Index h;
    public SynchronizationContext.ScheduledHandle k;
    public ConnectivityState l;
    public ConnectivityState m;
    public final boolean n;
    public final HashMap g = new HashMap();
    public int i = 0;
    public boolean j = true;

    /* renamed from: io.grpc.internal.PickFirstLeafLoadBalancer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24063a;

        static {
            int[] iArr = new int[ConnectivityState.values().length];
            f24063a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24063a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24063a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24063a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24063a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final class HealthListener implements LoadBalancer.SubchannelStateListener {

        /* renamed from: a, reason: collision with root package name */
        public ConnectivityStateInfo f24064a = ConnectivityStateInfo.a(ConnectivityState.g);
        public SubchannelData b;

        public HealthListener() {
        }

        @Override // io.grpc.LoadBalancer.SubchannelStateListener
        public final void a(ConnectivityStateInfo connectivityStateInfo) {
            PickFirstLeafLoadBalancer.o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{connectivityStateInfo, this.b.f24068a});
            this.f24064a = connectivityStateInfo;
            PickFirstLeafLoadBalancer pickFirstLeafLoadBalancer = PickFirstLeafLoadBalancer.this;
            if (pickFirstLeafLoadBalancer.h.c() && ((SubchannelData) pickFirstLeafLoadBalancer.g.get(pickFirstLeafLoadBalancer.h.a())).c == this) {
                pickFirstLeafLoadBalancer.j(this.b);
            }
        }
    }

    @VisibleForTesting
    public static final class Index {

        /* renamed from: a, reason: collision with root package name */
        public List f24065a;
        public int b;
        public int c;

        public final SocketAddress a() {
            if (c()) {
                return (SocketAddress) ((EquivalentAddressGroup) this.f24065a.get(this.b)).f23936a.get(this.c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public final boolean b() {
            if (c()) {
                EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup) this.f24065a.get(this.b);
                int i = this.c + 1;
                this.c = i;
                if (i >= equivalentAddressGroup.f23936a.size()) {
                    int i2 = this.b + 1;
                    this.b = i2;
                    this.c = 0;
                    if (i2 < this.f24065a.size()) {
                    }
                }
                return true;
            }
            return false;
        }

        public final boolean c() {
            return this.b < this.f24065a.size();
        }

        public final boolean d(SocketAddress socketAddress) {
            for (int i = 0; i < this.f24065a.size(); i++) {
                int iIndexOf = ((EquivalentAddressGroup) this.f24065a.get(i)).f23936a.indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.b = i;
                    this.c = iIndexOf;
                    return true;
                }
            }
            return false;
        }
    }

    public static final class PickFirstLeafLoadBalancerConfig {
    }

    public static final class Picker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.PickResult f24066a;

        public Picker(LoadBalancer.PickResult pickResult) {
            Preconditions.j(pickResult, lqlqqlq.m006Dm006Dm006Dm);
            this.f24066a = pickResult;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return this.f24066a;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(Picker.class.getSimpleName());
            toStringHelper.c(this.f24066a, lqlqqlq.m006Dm006Dm006Dm);
            return toStringHelper.toString();
        }
    }

    public final class RequestConnectionPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final PickFirstLeafLoadBalancer f24067a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        public RequestConnectionPicker(PickFirstLeafLoadBalancer pickFirstLeafLoadBalancer) {
            this.f24067a = pickFirstLeafLoadBalancer;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            if (this.b.compareAndSet(false, true)) {
                SynchronizationContext synchronizationContextD = PickFirstLeafLoadBalancer.this.f.d();
                PickFirstLeafLoadBalancer pickFirstLeafLoadBalancer = this.f24067a;
                Objects.requireNonNull(pickFirstLeafLoadBalancer);
                synchronizationContextD.execute(new a(pickFirstLeafLoadBalancer, 1));
            }
            return LoadBalancer.PickResult.e;
        }
    }

    public static final class SubchannelData {

        /* renamed from: a, reason: collision with root package name */
        public final LoadBalancer.Subchannel f24068a;
        public final HealthListener c;
        public boolean d = false;
        public ConnectivityState b = ConnectivityState.g;

        public SubchannelData(LoadBalancer.Subchannel subchannel, HealthListener healthListener) {
            this.f24068a = subchannel;
            this.c = healthListener;
        }

        public static void a(SubchannelData subchannelData, ConnectivityState connectivityState) {
            subchannelData.b = connectivityState;
            if (connectivityState == ConnectivityState.e || connectivityState == ConnectivityState.f) {
                subchannelData.d = true;
            } else if (connectivityState == ConnectivityState.g) {
                subchannelData.d = false;
            }
        }
    }

    public PickFirstLeafLoadBalancer(LoadBalancer.Helper helper) {
        boolean z = false;
        ConnectivityState connectivityState = ConnectivityState.g;
        this.l = connectivityState;
        this.m = connectivityState;
        Logger logger = GrpcUtil.f24015a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!Strings.a(property) && Boolean.parseBoolean(property)) {
            z = true;
        }
        this.n = z;
        this.f = helper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.LoadBalancer
    public final Status a(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        List list;
        ConnectivityState connectivityState;
        if (this.l == ConnectivityState.h) {
            return Status.l.i("Already shut down");
        }
        List list2 = resolvedAddresses.f23954a;
        Attributes attributes = resolvedAddresses.b;
        if (list2.isEmpty()) {
            Status statusI = Status.n.i("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + attributes);
            c(statusI);
            return statusI;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((EquivalentAddressGroup) it.next()) == null) {
                Status statusI2 = Status.n.i("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + attributes);
                c(statusI2);
                return statusI2;
            }
        }
        this.j = true;
        ImmutableList.Builder builderM = ImmutableList.m();
        builderM.f(list2);
        ImmutableList immutableListJ = builderM.j();
        Index index = this.h;
        ConnectivityState connectivityState2 = ConnectivityState.e;
        if (index == null) {
            Index index2 = new Index();
            index2.f24065a = immutableListJ != null ? immutableListJ : Collections.EMPTY_LIST;
            this.h = index2;
        } else if (this.l == connectivityState2) {
            SocketAddress socketAddressA = index.a();
            Index index3 = this.h;
            if (immutableListJ != null) {
                list = immutableListJ;
            } else {
                index3.getClass();
                list = Collections.EMPTY_LIST;
            }
            index3.f24065a = list;
            index3.b = 0;
            index3.c = 0;
            if (this.h.d(socketAddressA)) {
                return Status.e;
            }
            Index index4 = this.h;
            index4.b = 0;
            index4.c = 0;
        } else {
            index.f24065a = immutableListJ != null ? immutableListJ : Collections.EMPTY_LIST;
            index.b = 0;
            index.c = 0;
        }
        HashMap map = this.g;
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = immutableListJ.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            hashSet2.addAll(((EquivalentAddressGroup) unmodifiableListIteratorListIterator.next()).f23936a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it2.next();
            if (!hashSet2.contains(socketAddress)) {
                ((SubchannelData) map.remove(socketAddress)).f24068a.g();
            }
        }
        int size = hashSet.size();
        ConnectivityState connectivityState3 = ConnectivityState.d;
        if (size == 0 || (connectivityState = this.l) == connectivityState3 || connectivityState == connectivityState2) {
            this.l = connectivityState3;
            i(connectivityState3, new Picker(LoadBalancer.PickResult.e));
            g();
            e();
        } else {
            ConnectivityState connectivityState4 = ConnectivityState.g;
            if (connectivityState == connectivityState4) {
                i(connectivityState4, new RequestConnectionPicker(this));
            } else if (connectivityState == ConnectivityState.f) {
                g();
                e();
            }
        }
        return Status.e;
    }

    @Override // io.grpc.LoadBalancer
    public final void c(Status status) {
        HashMap map = this.g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((SubchannelData) it.next()).f24068a.g();
        }
        map.clear();
        i(ConnectivityState.f, new Picker(LoadBalancer.PickResult.a(status)));
    }

    @Override // io.grpc.LoadBalancer
    public final void e() {
        LoadBalancer.Subchannel subchannel;
        Index index = this.h;
        if (index == null || !index.c() || this.l == ConnectivityState.h) {
            return;
        }
        SocketAddress socketAddressA = this.h.a();
        HashMap map = this.g;
        boolean zContainsKey = map.containsKey(socketAddressA);
        Logger logger = o;
        if (zContainsKey) {
            subchannel = ((SubchannelData) map.get(socketAddressA)).f24068a;
        } else {
            HealthListener healthListener = new HealthListener();
            LoadBalancer.CreateSubchannelArgs.Builder builderB = LoadBalancer.CreateSubchannelArgs.b();
            EquivalentAddressGroup[] equivalentAddressGroupArr = {new EquivalentAddressGroup(socketAddressA)};
            ArrayList arrayList = new ArrayList(Lists.a(1));
            Collections.addAll(arrayList, equivalentAddressGroupArr);
            builderB.b(arrayList);
            builderB.a(healthListener);
            final LoadBalancer.Subchannel subchannelA = this.f.a(new LoadBalancer.CreateSubchannelArgs(builderB.f23951a, builderB.b, builderB.c));
            if (subchannelA == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressA);
                throw new IllegalStateException("Can't create subchannel");
            }
            SubchannelData subchannelData = new SubchannelData(subchannelA, healthListener);
            healthListener.b = subchannelData;
            map.put(socketAddressA, subchannelData);
            if (subchannelA.c().f23916a.get(LoadBalancer.d) == null) {
                healthListener.f24064a = ConnectivityStateInfo.a(ConnectivityState.e);
            }
            subchannelA.h(new LoadBalancer.SubchannelStateListener() { // from class: io.grpc.internal.b
                @Override // io.grpc.LoadBalancer.SubchannelStateListener
                public final void a(ConnectivityStateInfo connectivityStateInfo) {
                    LoadBalancer.Subchannel subchannel2;
                    PickFirstLeafLoadBalancer pickFirstLeafLoadBalancer = this.f24115a;
                    LoadBalancer.Helper helper = pickFirstLeafLoadBalancer.f;
                    ConnectivityState connectivityState = connectivityStateInfo.f23930a;
                    HashMap map2 = pickFirstLeafLoadBalancer.g;
                    LoadBalancer.Subchannel subchannel3 = subchannelA;
                    PickFirstLeafLoadBalancer.SubchannelData subchannelData2 = (PickFirstLeafLoadBalancer.SubchannelData) map2.get((SocketAddress) subchannel3.a().f23936a.get(0));
                    if (subchannelData2 == null || (subchannel2 = subchannelData2.f24068a) != subchannel3 || connectivityState == ConnectivityState.h) {
                        return;
                    }
                    ConnectivityState connectivityState2 = ConnectivityState.g;
                    if (connectivityState == connectivityState2) {
                        helper.e();
                    }
                    PickFirstLeafLoadBalancer.SubchannelData.a(subchannelData2, connectivityState);
                    ConnectivityState connectivityState3 = pickFirstLeafLoadBalancer.l;
                    ConnectivityState connectivityState4 = ConnectivityState.d;
                    ConnectivityState connectivityState5 = ConnectivityState.f;
                    if (connectivityState3 == connectivityState5 || pickFirstLeafLoadBalancer.m == connectivityState5) {
                        if (connectivityState == connectivityState4) {
                            return;
                        }
                        if (connectivityState == connectivityState2) {
                            pickFirstLeafLoadBalancer.e();
                            return;
                        }
                    }
                    int iOrdinal = connectivityState.ordinal();
                    if (iOrdinal == 0) {
                        pickFirstLeafLoadBalancer.l = connectivityState4;
                        pickFirstLeafLoadBalancer.i(connectivityState4, new PickFirstLeafLoadBalancer.Picker(LoadBalancer.PickResult.e));
                        return;
                    }
                    if (iOrdinal == 1) {
                        pickFirstLeafLoadBalancer.g();
                        for (PickFirstLeafLoadBalancer.SubchannelData subchannelData3 : map2.values()) {
                            if (!subchannelData3.f24068a.equals(subchannel2)) {
                                subchannelData3.f24068a.g();
                            }
                        }
                        map2.clear();
                        ConnectivityState connectivityState6 = ConnectivityState.e;
                        PickFirstLeafLoadBalancer.SubchannelData.a(subchannelData2, connectivityState6);
                        map2.put((SocketAddress) subchannel2.a().f23936a.get(0), subchannelData2);
                        pickFirstLeafLoadBalancer.h.d((SocketAddress) subchannel3.a().f23936a.get(0));
                        pickFirstLeafLoadBalancer.l = connectivityState6;
                        pickFirstLeafLoadBalancer.j(subchannelData2);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + connectivityState);
                        }
                        PickFirstLeafLoadBalancer.Index index2 = pickFirstLeafLoadBalancer.h;
                        index2.b = 0;
                        index2.c = 0;
                        pickFirstLeafLoadBalancer.l = connectivityState2;
                        pickFirstLeafLoadBalancer.i(connectivityState2, pickFirstLeafLoadBalancer.new RequestConnectionPicker(pickFirstLeafLoadBalancer));
                        return;
                    }
                    if (pickFirstLeafLoadBalancer.h.c() && ((PickFirstLeafLoadBalancer.SubchannelData) map2.get(pickFirstLeafLoadBalancer.h.a())).f24068a == subchannel3 && pickFirstLeafLoadBalancer.h.b()) {
                        pickFirstLeafLoadBalancer.g();
                        pickFirstLeafLoadBalancer.e();
                    }
                    PickFirstLeafLoadBalancer.Index index3 = pickFirstLeafLoadBalancer.h;
                    if (index3 == null || index3.c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = pickFirstLeafLoadBalancer.h.f24065a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((PickFirstLeafLoadBalancer.SubchannelData) it.next()).d) {
                            return;
                        }
                    }
                    pickFirstLeafLoadBalancer.l = connectivityState5;
                    pickFirstLeafLoadBalancer.i(connectivityState5, new PickFirstLeafLoadBalancer.Picker(LoadBalancer.PickResult.a(connectivityStateInfo.b)));
                    int i = pickFirstLeafLoadBalancer.i + 1;
                    pickFirstLeafLoadBalancer.i = i;
                    List list2 = pickFirstLeafLoadBalancer.h.f24065a;
                    if (i >= (list2 != null ? list2.size() : 0) || pickFirstLeafLoadBalancer.j) {
                        pickFirstLeafLoadBalancer.j = false;
                        pickFirstLeafLoadBalancer.i = 0;
                        helper.e();
                    }
                }
            });
            subchannel = subchannelA;
        }
        int iOrdinal = ((SubchannelData) map.get(socketAddressA)).b.ordinal();
        if (iOrdinal == 0) {
            if (this.n) {
                h();
                return;
            } else {
                subchannel.f();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.h.b();
            e();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            subchannel.f();
            SubchannelData.a((SubchannelData) map.get(socketAddressA), ConnectivityState.d);
            h();
        }
    }

    @Override // io.grpc.LoadBalancer
    public final void f() {
        Level level = Level.FINE;
        HashMap map = this.g;
        o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        ConnectivityState connectivityState = ConnectivityState.h;
        this.l = connectivityState;
        this.m = connectivityState;
        g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((SubchannelData) it.next()).f24068a.g();
        }
        map.clear();
    }

    public final void g() {
        SynchronizationContext.ScheduledHandle scheduledHandle = this.k;
        if (scheduledHandle != null) {
            scheduledHandle.a();
            this.k = null;
        }
    }

    public final void h() {
        if (this.n) {
            SynchronizationContext.ScheduledHandle scheduledHandle = this.k;
            if (scheduledHandle == null || !scheduledHandle.b()) {
                LoadBalancer.Helper helper = this.f;
                this.k = helper.d().c(new Runnable() { // from class: io.grpc.internal.PickFirstLeafLoadBalancer.1StartNextConnection
                    @Override // java.lang.Runnable
                    public final void run() {
                        PickFirstLeafLoadBalancer pickFirstLeafLoadBalancer = PickFirstLeafLoadBalancer.this;
                        pickFirstLeafLoadBalancer.k = null;
                        if (pickFirstLeafLoadBalancer.h.b()) {
                            pickFirstLeafLoadBalancer.e();
                        }
                    }
                }, 250L, TimeUnit.MILLISECONDS, helper.c());
            }
        }
    }

    public final void i(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
        if (connectivityState == this.m && (connectivityState == ConnectivityState.g || connectivityState == ConnectivityState.d)) {
            return;
        }
        this.m = connectivityState;
        this.f.f(connectivityState, subchannelPicker);
    }

    public final void j(SubchannelData subchannelData) {
        ConnectivityState connectivityState = subchannelData.b;
        ConnectivityState connectivityState2 = ConnectivityState.e;
        if (connectivityState != connectivityState2) {
            return;
        }
        ConnectivityStateInfo connectivityStateInfo = subchannelData.c.f24064a;
        ConnectivityState connectivityState3 = connectivityStateInfo.f23930a;
        if (connectivityState3 == connectivityState2) {
            i(connectivityState2, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.b(subchannelData.f24068a, null)));
            return;
        }
        ConnectivityState connectivityState4 = ConnectivityState.f;
        if (connectivityState3 == connectivityState4) {
            i(connectivityState4, new Picker(LoadBalancer.PickResult.a(connectivityStateInfo.b)));
        } else if (this.m != connectivityState4) {
            i(connectivityState3, new Picker(LoadBalancer.PickResult.e));
        }
    }
}
