package io.grpc.util;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ConnectivityState;
import io.grpc.Internal;
import io.grpc.LoadBalancer;
import io.grpc.util.MultiChildLoadBalancer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Internal
/* loaded from: classes7.dex */
public class RoundRobinLoadBalancer extends MultiChildLoadBalancer {
    public final AtomicInteger l;
    public LoadBalancer.SubchannelPicker m;

    @VisibleForTesting
    public static final class EmptyPicker extends LoadBalancer.SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return LoadBalancer.PickResult.e;
        }

        public final boolean equals(Object obj) {
            return obj instanceof EmptyPicker;
        }

        public final int hashCode() {
            return EmptyPicker.class.hashCode();
        }
    }

    @VisibleForTesting
    public static class ReadyPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24183a;
        public final AtomicInteger b;
        public final int c;

        public ReadyPicker(ArrayList arrayList, AtomicInteger atomicInteger) {
            Preconditions.f("empty list", !arrayList.isEmpty());
            this.f24183a = arrayList;
            Preconditions.j(atomicInteger, "index");
            this.b = atomicInteger;
            Iterator it = arrayList.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((LoadBalancer.SubchannelPicker) it.next()).hashCode();
            }
            this.c = iHashCode;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final LoadBalancer.PickResult a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            int andIncrement = this.b.getAndIncrement() & Integer.MAX_VALUE;
            ArrayList arrayList = this.f24183a;
            return ((LoadBalancer.SubchannelPicker) arrayList.get(andIncrement % arrayList.size())).a(pickSubchannelArgs);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ReadyPicker)) {
                return false;
            }
            ReadyPicker readyPicker = (ReadyPicker) obj;
            ArrayList arrayList = readyPicker.f24183a;
            if (readyPicker == this) {
                return true;
            }
            if (this.c != readyPicker.c || this.b != readyPicker.b) {
                return false;
            }
            ArrayList arrayList2 = this.f24183a;
            return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
        }

        public final int hashCode() {
            return this.c;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(ReadyPicker.class.getSimpleName());
            toStringHelper.c(this.f24183a, "subchannelPickers");
            return toStringHelper.toString();
        }
    }

    public RoundRobinLoadBalancer(LoadBalancer.Helper helper) {
        super(helper);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new EmptyPicker();
    }

    @Override // io.grpc.util.MultiChildLoadBalancer
    public final LoadBalancer.SubchannelPicker h() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.util.MultiChildLoadBalancer
    public final void i() {
        ConnectivityState connectivityState;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            connectivityState = ConnectivityState.e;
            if (!zHasNext) {
                break;
            }
            MultiChildLoadBalancer.ChildLbState childLbState = (MultiChildLoadBalancer.ChildLbState) it.next();
            if (!childLbState.f && childLbState.d == connectivityState) {
                arrayList.add(childLbState);
            }
        }
        if (!arrayList.isEmpty()) {
            k(connectivityState, j(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ConnectivityState connectivityState2 = ((MultiChildLoadBalancer.ChildLbState) it2.next()).d;
            ConnectivityState connectivityState3 = ConnectivityState.d;
            if (connectivityState2 == connectivityState3 || connectivityState2 == ConnectivityState.g) {
                k(connectivityState3, new EmptyPicker());
                return;
            }
        }
        k(ConnectivityState.f, j(linkedHashMap.values()));
    }

    public final LoadBalancer.SubchannelPicker j(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((MultiChildLoadBalancer.ChildLbState) it.next()).e);
        }
        return new ReadyPicker(arrayList, this.l);
    }

    public final void k(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
        if (connectivityState == this.j && subchannelPicker.equals(this.m)) {
            return;
        }
        this.g.f(connectivityState, subchannelPicker);
        this.j = connectivityState;
        this.m = subchannelPicker;
    }
}
