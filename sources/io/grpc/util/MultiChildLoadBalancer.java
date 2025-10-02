package io.grpc.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import io.grpc.Attributes;
import io.grpc.ConnectivityState;
import io.grpc.EquivalentAddressGroup;
import io.grpc.Internal;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.Status;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Internal
/* loaded from: classes7.dex */
public abstract class MultiChildLoadBalancer extends LoadBalancer {
    public static final Logger k = Logger.getLogger(MultiChildLoadBalancer.class.getName());
    public final LoadBalancer.Helper g;
    public boolean h;
    public ConnectivityState j;
    public final LinkedHashMap f = new LinkedHashMap();
    public final PickFirstLoadBalancerProvider i = new PickFirstLoadBalancerProvider();

    public static class AcceptResolvedAddressRetVal {

        /* renamed from: a, reason: collision with root package name */
        public final Status f24164a;
        public final List b;

        public AcceptResolvedAddressRetVal(Status status, ArrayList arrayList) {
            this.f24164a = status;
            this.b = arrayList;
        }
    }

    public class ChildLbState {

        /* renamed from: a, reason: collision with root package name */
        public final Endpoint f24165a;
        public final GracefulSwitchLoadBalancer b;
        public final LoadBalancerProvider c;
        public ConnectivityState d;
        public LoadBalancer.SubchannelPicker e;
        public boolean f = false;

        public final class ChildLbStateHelper extends ForwardingLoadBalancerHelper {
            public ChildLbStateHelper() {
            }

            @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
            public final void f(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
                ChildLbState childLbState = ChildLbState.this;
                MultiChildLoadBalancer multiChildLoadBalancer = MultiChildLoadBalancer.this;
                if (multiChildLoadBalancer.f.containsKey(childLbState.f24165a)) {
                    childLbState.d = connectivityState;
                    childLbState.e = subchannelPicker;
                    if (childLbState.f || multiChildLoadBalancer.h) {
                        return;
                    }
                    if (connectivityState == ConnectivityState.g) {
                        childLbState.b.e();
                    }
                    multiChildLoadBalancer.i();
                }
            }

            @Override // io.grpc.util.ForwardingLoadBalancerHelper
            public final LoadBalancer.Helper g() {
                return MultiChildLoadBalancer.this.g;
            }
        }

        public ChildLbState(Endpoint endpoint, PickFirstLoadBalancerProvider pickFirstLoadBalancerProvider, LoadBalancer.FixedResultPicker fixedResultPicker) {
            this.f24165a = endpoint;
            this.c = pickFirstLoadBalancerProvider;
            this.e = fixedResultPicker;
            GracefulSwitchLoadBalancer gracefulSwitchLoadBalancer = new GracefulSwitchLoadBalancer(new ChildLbStateHelper());
            this.b = gracefulSwitchLoadBalancer;
            this.d = ConnectivityState.d;
            gracefulSwitchLoadBalancer.i(pickFirstLoadBalancerProvider);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Address = ");
            sb.append(this.f24165a);
            sb.append(", state = ");
            sb.append(this.d);
            sb.append(", picker type: ");
            sb.append(this.e.getClass());
            sb.append(", lb: ");
            sb.append(this.b.g().getClass());
            sb.append(this.f ? ", deactivated" : "");
            return sb.toString();
        }
    }

    public static class Endpoint {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f24167a;
        public final int b;

        public Endpoint(EquivalentAddressGroup equivalentAddressGroup) {
            Preconditions.j(equivalentAddressGroup, "eag");
            List list = equivalentAddressGroup.f23936a;
            this.f24167a = new String[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f24167a[i] = ((SocketAddress) it.next()).toString();
                i++;
            }
            Arrays.sort(this.f24167a);
            this.b = Arrays.hashCode(this.f24167a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Endpoint)) {
                return false;
            }
            Endpoint endpoint = (Endpoint) obj;
            if (endpoint.b == this.b) {
                String[] strArr = endpoint.f24167a;
                int length = strArr.length;
                String[] strArr2 = this.f24167a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b;
        }

        public final String toString() {
            return Arrays.toString(this.f24167a);
        }
    }

    public MultiChildLoadBalancer(LoadBalancer.Helper helper) {
        this.g = helper;
        k.log(Level.FINE, "Created");
    }

    @Override // io.grpc.LoadBalancer
    public final Status a(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        try {
            this.h = true;
            AcceptResolvedAddressRetVal acceptResolvedAddressRetValG = g(resolvedAddresses);
            Status status = acceptResolvedAddressRetValG.f24164a;
            if (!status.f()) {
                return status;
            }
            i();
            for (ChildLbState childLbState : acceptResolvedAddressRetValG.b) {
                childLbState.b.f();
                childLbState.d = ConnectivityState.h;
                k.log(Level.FINE, "Child balancer {0} deleted", childLbState.f24165a);
            }
            return status;
        } finally {
            this.h = false;
        }
    }

    @Override // io.grpc.LoadBalancer
    public final void c(Status status) {
        if (this.j != ConnectivityState.e) {
            this.g.f(ConnectivityState.f, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.a(status)));
        }
    }

    @Override // io.grpc.LoadBalancer
    public final void f() {
        Level level = Level.FINE;
        Logger logger = k;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f;
        for (ChildLbState childLbState : linkedHashMap.values()) {
            childLbState.b.f();
            childLbState.d = ConnectivityState.h;
            logger.log(Level.FINE, "Child balancer {0} deleted", childLbState.f24165a);
        }
        linkedHashMap.clear();
    }

    public final AcceptResolvedAddressRetVal g(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        LinkedHashMap linkedHashMap;
        Endpoint endpoint;
        EquivalentAddressGroup equivalentAddressGroup;
        Level level = Level.FINE;
        Logger logger = k;
        logger.log(level, "Received resolution result: {0}", resolvedAddresses);
        HashMap map = new HashMap();
        List list = resolvedAddresses.f23954a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f;
            if (!zHasNext) {
                break;
            }
            Endpoint endpoint2 = new Endpoint((EquivalentAddressGroup) it.next());
            ChildLbState childLbState = (ChildLbState) linkedHashMap.get(endpoint2);
            if (childLbState != null) {
                map.put(endpoint2, childLbState);
            } else {
                map.put(endpoint2, new ChildLbState(endpoint2, this.i, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.e)));
            }
        }
        if (map.isEmpty()) {
            Status statusI = Status.n.i("NameResolver returned no usable address. " + resolvedAddresses);
            c(statusI);
            return new AcceptResolvedAddressRetVal(statusI, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            LoadBalancerProvider loadBalancerProvider = ((ChildLbState) entry.getValue()).c;
            ((ChildLbState) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                ChildLbState childLbState2 = (ChildLbState) linkedHashMap.get(key);
                if (childLbState2.f) {
                    childLbState2.f = false;
                }
            } else {
                linkedHashMap.put(key, (ChildLbState) entry.getValue());
            }
            ChildLbState childLbState3 = (ChildLbState) linkedHashMap.get(key);
            if (key instanceof EquivalentAddressGroup) {
                endpoint = new Endpoint((EquivalentAddressGroup) key);
            } else {
                Preconditions.f("key is wrong type", key instanceof Endpoint);
                endpoint = (Endpoint) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    equivalentAddressGroup = null;
                    break;
                }
                equivalentAddressGroup = (EquivalentAddressGroup) it2.next();
                if (endpoint.equals(new Endpoint(equivalentAddressGroup))) {
                    break;
                }
            }
            Preconditions.j(equivalentAddressGroup, key + " no longer present in load balancer children");
            LoadBalancer.ResolvedAddresses.Builder builder = new LoadBalancer.ResolvedAddresses.Builder();
            Attributes attributes = Attributes.b;
            builder.f23955a = list;
            builder.b = resolvedAddresses.b;
            builder.c = resolvedAddresses.c;
            builder.f23955a = Collections.singletonList(equivalentAddressGroup);
            Attributes.Builder builder2 = new Attributes.Builder(Attributes.b);
            builder2.b(LoadBalancer.e, Boolean.TRUE);
            builder.b = builder2.a();
            builder.c = null;
            LoadBalancer.ResolvedAddresses resolvedAddressesA = builder.a();
            ((ChildLbState) linkedHashMap.get(key)).getClass();
            if (!childLbState3.f) {
                childLbState3.b.d(resolvedAddressesA);
            }
        }
        ArrayList arrayList = new ArrayList();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = ImmutableList.o(linkedHashMap.keySet()).listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            Object next = unmodifiableListIteratorListIterator.next();
            if (!map.containsKey(next)) {
                ChildLbState childLbState4 = (ChildLbState) linkedHashMap.get(next);
                Endpoint endpoint3 = childLbState4.f24165a;
                if (!childLbState4.f) {
                    MultiChildLoadBalancer.this.f.remove(endpoint3);
                    childLbState4.f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", endpoint3);
                }
                arrayList.add(childLbState4);
            }
        }
        return new AcceptResolvedAddressRetVal(Status.e, arrayList);
    }

    public abstract LoadBalancer.SubchannelPicker h();

    public void i() {
        HashMap map = new HashMap();
        ConnectivityState connectivityState = null;
        for (ChildLbState childLbState : this.f.values()) {
            if (!childLbState.f) {
                map.put(childLbState.f24165a, childLbState.e);
                ConnectivityState connectivityState2 = childLbState.d;
                if (connectivityState == null) {
                    connectivityState = connectivityState2;
                } else {
                    ConnectivityState connectivityState3 = ConnectivityState.e;
                    if (connectivityState == connectivityState3 || connectivityState2 == connectivityState3 || connectivityState == (connectivityState3 = ConnectivityState.d) || connectivityState2 == connectivityState3 || connectivityState == (connectivityState3 = ConnectivityState.g) || connectivityState2 == connectivityState3) {
                        connectivityState = connectivityState3;
                    }
                }
            }
        }
        if (connectivityState == null) {
            return;
        }
        h();
        throw null;
    }
}
