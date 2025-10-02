package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FragmentTransition {

    /* renamed from: a, reason: collision with root package name */
    public static final FragmentTransitionImpl f2761a = new FragmentTransitionCompat21();
    public static final FragmentTransitionImpl b;

    static {
        FragmentTransitionImpl fragmentTransitionImpl = null;
        try {
            fragmentTransitionImpl = (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = fragmentTransitionImpl;
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean z, ArrayMap arrayMap) {
        Intrinsics.h(inFragment, "inFragment");
        Intrinsics.h(outFragment, "outFragment");
        if ((z ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(arrayMap.size());
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(arrayMap.size());
            Iterator it2 = arrayMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(ArrayMap arrayMap, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (Intrinsics.c(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) CollectionsKt.F(arrayList);
    }

    public static final void c(int i, ArrayList views) {
        Intrinsics.h(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
