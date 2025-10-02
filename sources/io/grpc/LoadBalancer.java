package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.storage.db.k;
import io.grpc.Attributes;
import io.grpc.ClientStreamTracer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@NotThreadSafe
/* loaded from: classes7.dex */
public abstract class LoadBalancer {
    public static final Attributes.Key b = new Attributes.Key("internal:health-checking-config");
    public static final CreateSubchannelArgs.Key c = new CreateSubchannelArgs.Key();
    public static final Attributes.Key d = new Attributes.Key("internal:has-health-check-producer-listener");
    public static final Attributes.Key e = new Attributes.Key("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f23949a;

    /* renamed from: io.grpc.LoadBalancer$1, reason: invalid class name */
    public class AnonymousClass1 extends SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final PickResult a(PickSubchannelArgs pickSubchannelArgs) {
            return PickResult.e;
        }

        public final String toString() {
            return "EMPTY_PICKER";
        }
    }

    @ExperimentalApi
    public static final class CreateSubchannelArgs {

        /* renamed from: a, reason: collision with root package name */
        public final List f23950a;
        public final Attributes b;
        public final Object[][] c;

        @ExperimentalApi
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public List f23951a;
            public Attributes b;
            public Object[][] c;

            public final void a(SubchannelStateListener subchannelStateListener) {
                Key key;
                int length = 0;
                while (true) {
                    Object[][] objArr = this.c;
                    int length2 = objArr.length;
                    key = LoadBalancer.c;
                    if (length >= length2) {
                        length = -1;
                        break;
                    } else if (key.equals(objArr[length][0])) {
                        break;
                    } else {
                        length++;
                    }
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.c.length + 1, 2);
                    Object[][] objArr3 = this.c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.c = objArr2;
                    length = objArr2.length - 1;
                }
                this.c[length] = new Object[]{key, subchannelStateListener};
            }

            public final void b(List list) {
                Preconditions.f("addrs is empty", !list.isEmpty());
                this.f23951a = Collections.unmodifiableList(new ArrayList(list));
            }
        }

        @ExperimentalApi
        public static final class Key<T> {
            public final String toString() {
                return "internal:health-check-consumer-listener";
            }
        }

        public CreateSubchannelArgs(List list, Attributes attributes, Object[][] objArr) {
            Preconditions.j(list, "addresses are not set");
            this.f23950a = list;
            Preconditions.j(attributes, "attrs");
            this.b = attributes;
            Preconditions.j(objArr, "customOptions");
            this.c = objArr;
        }

        public static Builder b() {
            Builder builder = new Builder();
            builder.b = Attributes.b;
            builder.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
            return builder;
        }

        public final Object a() {
            int i = 0;
            while (true) {
                Object[][] objArr = this.c;
                if (i >= objArr.length) {
                    return null;
                }
                if (LoadBalancer.c.equals(objArr[i][0])) {
                    return objArr[i][1];
                }
                i++;
            }
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f23950a, "addrs");
            toStringHelperB.c(this.b, "attrs");
            toStringHelperB.c(Arrays.deepToString(this.c), "customOptions");
            return toStringHelperB.toString();
        }
    }

    @Deprecated
    public static final class ErrorPicker extends SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final PickResult a(PickSubchannelArgs pickSubchannelArgs) {
            PickResult.a(null);
            throw null;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(null, "error");
            return toStringHelperB.toString();
        }
    }

    @ExperimentalApi
    @ThreadSafe
    public static abstract class Factory {
        public abstract LoadBalancer a(Helper helper);
    }

    public static final class FixedResultPicker extends SubchannelPicker {

        /* renamed from: a, reason: collision with root package name */
        public final PickResult f23952a;

        public FixedResultPicker(PickResult pickResult) {
            Preconditions.j(pickResult, lqlqqlq.m006Dm006Dm006Dm);
            this.f23952a = pickResult;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public final PickResult a(PickSubchannelArgs pickSubchannelArgs) {
            return this.f23952a;
        }

        public final String toString() {
            return "FixedResultPicker(" + this.f23952a + ")";
        }
    }

    @ExperimentalApi
    @ThreadSafe
    public static abstract class Helper {
        public Subchannel a(CreateSubchannelArgs createSubchannelArgs) {
            throw new UnsupportedOperationException();
        }

        public ChannelLogger b() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService c() {
            throw new UnsupportedOperationException();
        }

        public SynchronizationContext d() {
            throw new UnsupportedOperationException();
        }

        public void e() {
            throw new UnsupportedOperationException();
        }

        public abstract void f(ConnectivityState connectivityState, SubchannelPicker subchannelPicker);
    }

    @ExperimentalApi
    @Immutable
    public static final class PickResult {
        public static final PickResult e = new PickResult(null, null, Status.e, false);

        /* renamed from: a, reason: collision with root package name */
        public final Subchannel f23953a;
        public final ClientStreamTracer.Factory b;
        public final Status c;
        public final boolean d;

        public PickResult(Subchannel subchannel, ClientStreamTracer.Factory factory, Status status, boolean z) {
            this.f23953a = subchannel;
            this.b = factory;
            Preconditions.j(status, "status");
            this.c = status;
            this.d = z;
        }

        public static PickResult a(Status status) {
            Preconditions.f("error status shouldn't be OK", !status.f());
            return new PickResult(null, null, status, false);
        }

        public static PickResult b(Subchannel subchannel, ClientStreamTracer.Factory factory) {
            Preconditions.j(subchannel, "subchannel");
            return new PickResult(subchannel, factory, Status.e, false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PickResult)) {
                return false;
            }
            PickResult pickResult = (PickResult) obj;
            return Objects.a(this.f23953a, pickResult.f23953a) && Objects.a(this.c, pickResult.c) && Objects.a(this.b, pickResult.b) && this.d == pickResult.d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f23953a, this.c, this.b, Boolean.valueOf(this.d)});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f23953a, "subchannel");
            toStringHelperB.c(this.b, "streamTracerFactory");
            toStringHelperB.c(this.c, "status");
            toStringHelperB.d("drop", this.d);
            return toStringHelperB.toString();
        }
    }

    @ExperimentalApi
    public static abstract class PickSubchannelArgs {
    }

    @ExperimentalApi
    public static final class ResolvedAddresses {

        /* renamed from: a, reason: collision with root package name */
        public final List f23954a;
        public final Attributes b;
        public final Object c;

        @ExperimentalApi
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public List f23955a;
            public Attributes b;
            public Object c;

            public final ResolvedAddresses a() {
                return new ResolvedAddresses(this.f23955a, this.b, this.c);
            }
        }

        public ResolvedAddresses(List list, Attributes attributes, Object obj) {
            Preconditions.j(list, "addresses");
            this.f23954a = Collections.unmodifiableList(new ArrayList(list));
            Preconditions.j(attributes, k.a.h);
            this.b = attributes;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ResolvedAddresses)) {
                return false;
            }
            ResolvedAddresses resolvedAddresses = (ResolvedAddresses) obj;
            return Objects.a(this.f23954a, resolvedAddresses.f23954a) && Objects.a(this.b, resolvedAddresses.b) && Objects.a(this.c, resolvedAddresses.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f23954a, this.b, this.c});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f23954a, "addresses");
            toStringHelperB.c(this.b, k.a.h);
            toStringHelperB.c(this.c, "loadBalancingPolicyConfig");
            return toStringHelperB.toString();
        }
    }

    @ExperimentalApi
    public static abstract class Subchannel {
        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.grpc.EquivalentAddressGroup a() {
            /*
                r4 = this;
                java.util.List r0 = r4.b()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = r1
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                com.google.common.base.Preconditions.p(r2, r0, r3)
                java.lang.Object r0 = r0.get(r1)
                io.grpc.EquivalentAddressGroup r0 = (io.grpc.EquivalentAddressGroup) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.LoadBalancer.Subchannel.a():io.grpc.EquivalentAddressGroup");
        }

        public List b() {
            throw new UnsupportedOperationException();
        }

        public abstract Attributes c();

        public ChannelLogger d() {
            throw new UnsupportedOperationException();
        }

        public Object e() {
            throw new UnsupportedOperationException();
        }

        public abstract void f();

        public abstract void g();

        public void h(SubchannelStateListener subchannelStateListener) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void i(List list) {
            throw new UnsupportedOperationException();
        }
    }

    @ExperimentalApi
    @ThreadSafe
    public static abstract class SubchannelPicker {
        public abstract PickResult a(PickSubchannelArgs pickSubchannelArgs);
    }

    public interface SubchannelStateListener {
        void a(ConnectivityStateInfo connectivityStateInfo);
    }

    public Status a(ResolvedAddresses resolvedAddresses) {
        List list = resolvedAddresses.f23954a;
        if (!list.isEmpty() || b()) {
            int i = this.f23949a;
            this.f23949a = i + 1;
            if (i == 0) {
                d(resolvedAddresses);
            }
            this.f23949a = 0;
            return Status.e;
        }
        Status statusI = Status.n.i("NameResolver returned no usable address. addrs=" + list + ", attrs=" + resolvedAddresses.b);
        c(statusI);
        return statusI;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(Status status);

    public void d(ResolvedAddresses resolvedAddresses) {
        int i = this.f23949a;
        this.f23949a = i + 1;
        if (i == 0) {
            a(resolvedAddresses);
        }
        this.f23949a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
