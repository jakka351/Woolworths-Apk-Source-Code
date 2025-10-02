package androidx.activity;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.core.os.BundleKt;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.os.SavedStateRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.f60a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f60a) {
            case 0:
                return ComponentActivity.L4((ComponentActivity) this.b);
            case 1:
                Map mapC = ((SaveableStateRegistry) this.b).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapC.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                SavedStateHandleImpl savedStateHandleImpl = (SavedStateHandleImpl) this.b;
                for (Map.Entry entry2 : MapsKt.q(savedStateHandleImpl.d).entrySet()) {
                    savedStateHandleImpl.a(((MutableStateFlow) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : MapsKt.q(savedStateHandleImpl.b).entrySet()) {
                    savedStateHandleImpl.a(((SavedStateRegistry.SavedStateProvider) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = savedStateHandleImpl.f2809a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
