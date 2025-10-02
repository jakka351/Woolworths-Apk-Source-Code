package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1698a;
    public final MutableScatterMap b;
    public MutableScatterMap c;

    public SaveableStateRegistryImpl(Map map, Function1 function1) {
        MutableScatterMap mutableScatterMap;
        this.f1698a = function1;
        if (map == null || map.isEmpty()) {
            mutableScatterMap = null;
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f1700a;
            mutableScatterMap = new MutableScatterMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                mutableScatterMap.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = mutableScatterMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        return ((Boolean) this.f1698a.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry b(final String str, final Function0 function0) {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f1700a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.c(str.charAt(i))) {
                final MutableScatterMap mutableScatterMap = this.c;
                if (mutableScatterMap == null) {
                    long[] jArr = ScatterMapKt.f699a;
                    mutableScatterMap = new MutableScatterMap();
                    this.c = mutableScatterMap;
                }
                Object objE = mutableScatterMap.e(str);
                if (objE == null) {
                    objE = new ArrayList();
                    mutableScatterMap.m(str, objE);
                }
                ((List) objE).add(function0);
                return new SaveableStateRegistry.Entry(str, function0) { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                    public final /* synthetic */ String b;
                    public final /* synthetic */ Lambda c;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.c = (Lambda) function0;
                    }

                    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                    public final void unregister() {
                        MutableScatterMap mutableScatterMap2 = this.f1699a;
                        String str2 = this.b;
                        List list = (List) mutableScatterMap2.k(str2);
                        if (list != null) {
                            list.remove(this.c);
                        }
                        List list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            return;
                        }
                        mutableScatterMap2.m(str2, list);
                    }
                };
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.c():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object e(String str) {
        MutableScatterMap mutableScatterMap = this.b;
        List list = mutableScatterMap != null ? (List) mutableScatterMap.k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && mutableScatterMap != null) {
            List listSubList = list.subList(1, list.size());
            int i = mutableScatterMap.i(str);
            if (i < 0) {
                i = ~i;
            }
            Object[] objArr = mutableScatterMap.c;
            Object obj = objArr[i];
            mutableScatterMap.b[i] = str;
            objArr[i] = listSubList;
        }
        return list.get(0);
    }
}
