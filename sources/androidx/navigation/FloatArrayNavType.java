package androidx.navigation;

import android.os.Bundle;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/FloatArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FloatArrayNavType extends CollectionNavType<float[]> {
    public static float[] i(String value) {
        Intrinsics.h(value, "value");
        return new float[]{((Number) NavType.i.g(value)).floatValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        if (!androidx.compose.ui.input.pointer.a.z(bundle, "bundle", str, "key", str) || SavedStateReader.m(bundle, str)) {
            return null;
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.a(str);
        throw null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "float[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return i(str);
        }
        float[] fArrI = i(str);
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrI, 0, fArrCopyOf, length, 1);
        Intrinsics.e(fArrCopyOf);
        return fArrCopyOf;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return i(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.h(key, "key");
        if (fArr != null) {
            bundle.putFloatArray(key, fArr);
        } else {
            SavedStateWriter.b(bundle, key);
        }
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object g() {
        return new float[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List h(Object obj) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return EmptyList.d;
        }
        List listI0 = ArraysKt.i0(fArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listI0, 10));
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }
}
