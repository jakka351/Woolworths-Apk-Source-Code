package androidx.work;

import android.net.NetworkRequest;
import android.net.Uri;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/Constraints;", "", "Builder", "Companion", "ContentUriTrigger", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Constraints {
    public static final Constraints j = new Constraints();

    /* renamed from: a, reason: collision with root package name */
    public final NetworkType f3893a;
    public final NetworkRequestCompat b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3894a;
        public NetworkRequestCompat b = new NetworkRequestCompat(null);
        public NetworkType c = NetworkType.d;
        public final long d = -1;
        public final long e = -1;
        public final LinkedHashSet f = new LinkedHashSet();

        public final Constraints a() {
            return new Constraints(this.b, this.c, this.f3894a, false, false, false, this.d, this.e, CollectionsKt.L0(this.f));
        }

        public final void b(NetworkType networkType) {
            this.c = networkType;
            this.b = new NetworkRequestCompat(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/Constraints$Companion;", "", "Landroidx/work/Constraints;", "NONE", "Landroidx/work/Constraints;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ContentUriTrigger {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f3895a;
        public final boolean b;

        public ContentUriTrigger(boolean z, Uri uri) {
            this.f3895a = uri;
            this.b = z;
        }

        /* renamed from: a, reason: from getter */
        public final Uri getF3895a() {
            return this.f3895a;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ContentUriTrigger.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.f(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            return Intrinsics.c(this.f3895a, contentUriTrigger.f3895a) && this.b == contentUriTrigger.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f3895a.hashCode() * 31);
        }
    }

    public Constraints() {
        this.b = new NetworkRequestCompat(null);
        this.f3893a = NetworkType.d;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = EmptySet.d;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.f3999a;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Constraints.class.equals(obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.c == constraints.c && this.d == constraints.d && this.e == constraints.e && this.f == constraints.f && this.g == constraints.g && this.h == constraints.h && Intrinsics.c(a(), constraints.a()) && this.f3893a == constraints.f3893a) {
            return Intrinsics.c(this.i, constraints.i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f3893a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f3893a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public Constraints(NetworkRequestCompat requiredNetworkRequestCompat, NetworkType requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set contentUriTriggers) {
        Intrinsics.h(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.h(requiredNetworkType, "requiredNetworkType");
        Intrinsics.h(contentUriTriggers, "contentUriTriggers");
        this.b = requiredNetworkRequestCompat;
        this.f3893a = requiredNetworkType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = contentUriTriggers;
    }

    public Constraints(Constraints other) {
        Intrinsics.h(other, "other");
        this.c = other.c;
        this.d = other.d;
        this.b = other.b;
        this.f3893a = other.f3893a;
        this.e = other.e;
        this.f = other.f;
        this.i = other.i;
        this.g = other.g;
        this.h = other.h;
    }
}
