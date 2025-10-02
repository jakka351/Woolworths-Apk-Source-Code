package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Timestamp$Companion$CREATOR$1();
    public final long d;
    public final int e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "CREATOR", "Landroid/os/Parcelable$Creator;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final void a(int i, long j) {
            if (i < 0 || i >= 1000000000) {
                throw new IllegalArgumentException(YU.a.d(i, "Timestamp nanoseconds out of range: ").toString());
            }
            if (-62135596800L > j || j >= 253402300800L) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.k(j, "Timestamp seconds out of range: ").toString());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.google.firebase.Timestamp$compareTo$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends PropertyReference1Impl {
        public static final AnonymousClass1 d = new AnonymousClass1(Timestamp.class, "seconds", "getSeconds()J", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return Long.valueOf(((Timestamp) obj).d);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.google.firebase.Timestamp$compareTo$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends PropertyReference1Impl {
        public static final AnonymousClass2 d = new AnonymousClass2(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return Integer.valueOf(((Timestamp) obj).e);
        }
    }

    public Timestamp(long j, int i) {
        Companion.a(i, j);
        this.d = j;
        this.e = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Timestamp other) {
        Intrinsics.h(other, "other");
        Function1[] function1Arr = {AnonymousClass1.d, AnonymousClass2.d};
        for (int i = 0; i < 2; i++) {
            Function1 function1 = function1Arr[i];
            int iA = ComparisonsKt.a((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.d;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.d);
        sb.append(", nanoseconds=");
        return YU.a.l(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeLong(this.d);
        dest.writeInt(this.e);
    }

    public Timestamp(Date date) {
        Pair pair;
        long j = 1000;
        long time = date.getTime() / j;
        int time2 = (int) ((date.getTime() % j) * 1000000);
        if (time2 < 0) {
            pair = new Pair(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000));
        } else {
            pair = new Pair(Long.valueOf(time), Integer.valueOf(time2));
        }
        long jLongValue = ((Number) pair.d).longValue();
        int iIntValue = ((Number) pair.e).intValue();
        Companion.a(iIntValue, jLongValue);
        this.d = jLongValue;
        this.e = iIntValue;
    }
}
