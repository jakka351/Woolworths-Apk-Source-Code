package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/FilterOptionsManager;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterOptionsManager {

    /* renamed from: a, reason: collision with root package name */
    public LinkedHashMap f5354a;
    public LinkedHashMap b;
    public List c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState = ToggleableState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.addFirst(str);
        while (!arrayDeque.isEmpty()) {
            String str2 = (String) arrayDeque.removeFirst();
            LinkedHashMap linkedHashMap = this.f5354a;
            if (linkedHashMap == null) {
                Intrinsics.p("filterParentToChildMap");
                throw null;
            }
            Collection collection = (List) linkedHashMap.get(str2);
            if (collection == null) {
                collection = EmptyList.d;
            }
            Collection collection2 = collection;
            arrayDeque.addAll(collection2);
            arrayList.addAll(collection2);
        }
        return arrayList;
    }

    public final FilterMenuItem b(String str) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = null;
        if (linkedHashMap == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str2 = (String) linkedHashMap.get(str);
        for (FilterOption filterOption : this.c) {
            if (Intrinsics.c(filterOption.d, str2)) {
                Iterator it = filterOption.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.c(((FilterMenuItem) next).k, str)) {
                        obj = next;
                        break;
                    }
                }
                FilterMenuItem filterMenuItem = (FilterMenuItem) obj;
                if (filterMenuItem != null) {
                    return filterMenuItem;
                }
                throw new IllegalStateException(a.h("Filter item with ID `", str, "` not found"));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final List c(String filterKey) {
        Intrinsics.h(filterKey, "filterKey");
        LinkedHashMap linkedHashMap = this.f5354a;
        if (linkedHashMap == null) {
            Intrinsics.p("filterParentToChildMap");
            throw null;
        }
        List list = (List) linkedHashMap.get(filterKey);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return EmptyList.d;
        }
        LinkedHashMap linkedHashMap2 = this.b;
        if (linkedHashMap2 == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = (String) linkedHashMap2.get(filterKey);
        for (FilterOption filterOption : this.c) {
            if (Intrinsics.c(filterOption.d, str)) {
                List list3 = filterOption.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (list.contains(((FilterMenuItem) obj).k)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int d(String str) {
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.addFirst(str);
        int i = 0;
        while (!arrayDeque.isEmpty()) {
            String str2 = (String) arrayDeque.removeFirst();
            LinkedHashMap linkedHashMap = this.f5354a;
            if (linkedHashMap == null) {
                Intrinsics.p("filterParentToChildMap");
                throw null;
            }
            List list = (List) linkedHashMap.get(str2);
            arrayDeque.addAll(list != null ? list : EmptyList.d);
            for (FilterMenuItem filterMenuItem : c(str2)) {
                ToggleableState toggleableState = filterMenuItem.i;
                String str3 = filterMenuItem.k;
                if (toggleableState == ToggleableState.d) {
                    i++;
                    arrayDeque.remove(str3);
                } else if (!filterMenuItem.h) {
                    arrayDeque.remove(str3);
                }
            }
        }
        return i;
    }

    public final List e(List sourceData) {
        Object next;
        Intrinsics.h(sourceData, "sourceData");
        this.c = sourceData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (FilterOption filterOption : this.c) {
            List<FilterMenuItem> list = filterOption.f;
            String str = filterOption.d;
            for (FilterMenuItem filterMenuItem : list) {
                String str2 = filterMenuItem.g;
                String str3 = filterMenuItem.k;
                String str4 = (str2 == null || str2.length() == 0) ? str : filterMenuItem.l;
                List arrayList = (List) linkedHashMap.get(str4);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(str3);
                linkedHashMap.put(str4, arrayList);
                linkedHashMap2.put(str3, str);
            }
            linkedHashMap2.put(str, str);
        }
        this.f5354a = linkedHashMap;
        this.b = linkedHashMap2;
        Iterator it = sourceData.iterator();
        while (it.hasNext()) {
            FilterOption filterOption2 = (FilterOption) it.next();
            filterOption2.g = d(filterOption2.d);
            String str5 = filterOption2.d;
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.addAll(a(str5));
            LinkedHashMap linkedHashMap3 = this.b;
            if (linkedHashMap3 == null) {
                Intrinsics.p("filterDescendantToAncestorMap");
                throw null;
            }
            String str6 = (String) linkedHashMap3.get(str5);
            for (FilterOption filterOption3 : this.c) {
                if (Intrinsics.c(filterOption3.d, str6)) {
                    List list2 = filterOption3.f;
                    while (!arrayDeque.isEmpty()) {
                        String str7 = (String) arrayDeque.removeFirst();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.c(((FilterMenuItem) next).k, str7)) {
                                break;
                            }
                        }
                        FilterMenuItem filterMenuItem2 = (FilterMenuItem) next;
                        if (filterMenuItem2 != null && filterMenuItem2.h) {
                            if (filterMenuItem2.i == ToggleableState.d) {
                                arrayDeque.removeAll(a(str7));
                            } else {
                                int iD = d(str7);
                                if (iD > 0) {
                                    filterMenuItem2.j = iD;
                                    filterMenuItem2.i = ToggleableState.f;
                                } else {
                                    arrayDeque.removeAll(a(str7));
                                }
                            }
                        }
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return this.c;
    }
}
