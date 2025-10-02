package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateReaderKt;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/serialization/InternalNavType$DoubleArrayType$1", "Landroidx/navigation/CollectionNavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InternalNavType$DoubleArrayType$1 extends CollectionNavType<double[]> {
    public static double[] i(String value) {
        Intrinsics.h(value, "value");
        return new double[]{((Number) InternalNavType.c.g(value)).doubleValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        double[] doubleArray = bundle.getDoubleArray(str);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.a(str);
        throw null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "double[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        double[] dArr = (double[]) obj;
        if (dArr == null) {
            return i(str);
        }
        double[] dArrI = i(str);
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        System.arraycopy(dArrI, 0, dArrCopyOf, length, 1);
        Intrinsics.e(dArrCopyOf);
        return dArrCopyOf;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return i(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.h(key, "key");
        if (dArr == null) {
            SavedStateWriter.b(bundle, key);
        } else {
            bundle.putDoubleArray(key, dArr);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object g() {
        return new double[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        double[] dArr = (double[]) obj;
        if (dArr == null) {
            return EmptyList.d;
        }
        List listH0 = ArraysKt.h0(dArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }
}
