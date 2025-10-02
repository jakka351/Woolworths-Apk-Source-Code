package com.google.android.gms.common.api.internal;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzhhm;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfa;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.recaptcha.internal.zzln;
import com.google.firebase.encoders.FieldDescriptor;
import com.salesforce.marketingcloud.internal.m;
import io.card.payment.i18n.StringKey;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static void A(int i, FieldDescriptor.Builder builder) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i);
        builder.b(zzfaVar.zzb());
        builder.a();
    }

    public static int B(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }

    public static FieldDescriptor C(int i, FieldDescriptor.Builder builder) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        builder.b(zzaeVar.zzb());
        return builder.a();
    }

    public static int a(int i, int i2, int i3) {
        return zzhhm.zzA(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return zzbn.zzt(i) + i2 + i3 + i4;
    }

    public static int c(BigDecimal bigDecimal, int i, int i2) {
        return (bigDecimal.hashCode() + i) * i2;
    }

    public static long d(long j, long j2, long j3, long j4) {
        return ((j * j2) + j3) * j4;
    }

    public static CompiledField e(String str, boolean z, CompiledField.Builder builder, List list) {
        builder.c = CollectionsKt.Q(new CompiledCondition(str, z));
        builder.e(list);
        return builder.c();
    }

    public static FieldDescriptor.Builder f(int i, FieldDescriptor.Builder builder, String str) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.b(zzayVar.zzb());
        builder.a();
        return new FieldDescriptor.Builder(str);
    }

    public static FieldDescriptor g(int i, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.b(zzayVar.zzb());
        return builder.a();
    }

    public static String h(StringKey stringKey, StringBuilder sb, String str, String str2) {
        sb.append(stringKey.toString());
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String i(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(str);
        Intrinsics.g(strOptString, str2);
        return m.b(strOptString);
    }

    public static /* synthetic */ BigDecimal j(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }

    public static /* synthetic */ Set k(String str) {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return Collections.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(b.m(obj, "duplicate element: "));
    }

    public static /* synthetic */ Set l(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(b.m(obj, "duplicate element: "));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static void m(int i, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.b(zzayVar.zzb());
        builder.a();
    }

    public static void n(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void o(AtomicThrowable atomicThrowable, AtomicThrowable atomicThrowable2, Subscriber subscriber) {
        atomicThrowable.getClass();
        subscriber.onError(ExceptionHelper.b(atomicThrowable2));
    }

    public static /* synthetic */ void p(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            } else {
                if (!(obj instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) obj).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void q(String str, String str2, String str3) {
        zzds.zzc(str3, str2.concat(String.valueOf(str)));
    }

    public static void r(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        zzds.zzc(str2, sb.toString());
    }

    public static /* synthetic */ void s(AtomicReference atomicReference, zzbox zzboxVar) {
        while (!atomicReference.compareAndSet(null, zzboxVar) && atomicReference.get() == null) {
        }
    }

    public static /* synthetic */ boolean t(AtomicReference atomicReference, Disposable disposable, Disposable disposable2) {
        while (!atomicReference.compareAndSet(disposable, disposable2)) {
            if (atomicReference.get() != disposable) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean u(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(AtomicReference atomicReference, Throwable th) {
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static int w(int i, int i2, int i3) {
        return zzdn.zzA(i) + i2 + i3;
    }

    public static int x(int i, int i2, int i3, int i4) {
        return zzii.zzg(i) + i2 + i3 + i4;
    }

    public static FieldDescriptor.Builder y(int i, FieldDescriptor.Builder builder, String str) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i);
        builder.b(zzfaVar.zzb());
        builder.a();
        return new FieldDescriptor.Builder(str);
    }

    public static FieldDescriptor z(int i, FieldDescriptor.Builder builder) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i);
        builder.b(zzfaVar.zzb());
        return builder.a();
    }
}
