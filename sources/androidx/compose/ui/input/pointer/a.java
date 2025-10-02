package androidx.compose.ui.input.pointer;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.provider.FontRequest;
import androidx.fragment.app.Fragment;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a implements CacheWriter.ProgressListener {
    public static void A(String str, String str2, String str3) {
        Log.g(str3, str + str2);
    }

    public static int a(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static int b(int i, int i2, ArrayList arrayList) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, List list) {
        return (list.size() * i) + i2;
    }

    public static int d(int i, int i2, byte[] bArr) {
        return (Arrays.hashCode(bArr) + i) * i2;
    }

    public static int e(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static long f(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static ListenableFuture g(final Deferred deferred) {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
                final Deferred deferred2 = deferred;
                ((JobSupport) deferred2).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Throwable th = (Throwable) obj;
                        CallbackToFutureAdapter.Completer completer2 = completer;
                        if (th == null) {
                            completer2.b(deferred2.getCompleted());
                        } else if (th instanceof CancellationException) {
                            completer2.c();
                        } else {
                            completer2.d(th);
                        }
                        return Unit.f24250a;
                    }
                });
                return "Deferred.asListenableFuture";
            }
        });
    }

    public static String h(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String i(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.D());
        return sb.toString();
    }

    public static String k(Boolean bool, String str, String str2) {
        return str + bool + str2;
    }

    public static String l(String str, Fragment fragment2, String str2) {
        return str + fragment2 + str2;
    }

    public static String m(String str, String str2, SpreadBuilder spreadBuilder, String str3) {
        spreadBuilder.a(new Pair(str, str2));
        return String.valueOf(str3);
    }

    public static String n(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String o(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ List p(FontRequest fontRequest) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ List q(FontRequest fontRequest, FontRequest fontRequest2) {
        Object[] objArr = {fontRequest, fontRequest2};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void r(int i, int i2, int i3, int i4, int i5) {
        Util.E(i);
        Util.E(i2);
        Util.E(i3);
        Util.E(i4);
        Util.E(i5);
    }

    public static void s(int i, int i2, int i3, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void t(int i, String str, String str2) {
        Log.g(str2, str + i);
    }

    public static void u(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void v(String str, String str2, String str3) {
        android.util.Log.e(str3, str + str2);
    }

    public static void w(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static /* bridge */ /* synthetic */ boolean y() {
        throw null;
    }

    public static boolean z(Bundle bundle, String str, String str2, String str3, String str4) {
        Intrinsics.h(bundle, str);
        Intrinsics.h(str2, str3);
        return bundle.containsKey(str4);
    }

    public abstract void B(long j, long j2, long j3);
}
