package au.com.woolworths.feature.product.list.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.ui.FilterOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0017\u001a\u00020\u0006J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\u0006\u0010%\u001a\u00020\u0014J\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005J \u0010'\u001a\u00020\u000e2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0017\u001a\u00020\u0006J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\"R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lau/com/woolworths/feature/product/list/data/FilterOptionsManager;", "", "<init>", "()V", "filterParentToChildMap", "", "", "", "filterDescendantToAncestorMap", "allFiltersData", "Lau/com/woolworths/feature/product/list/ui/FilterOption;", "setData", "sourceData", "buildFilterHierarchyFrom", "", "filterList", "buildFilterRelationshipMaps", "setAllDescendantStatesOf", "id", "getSelectedDescendantsCountFor", "", "getAllDescendantIdsOf", "setAllAscendantStatesOf", "filterKey", "setAllDescendantsStatesOf", "newState", "Landroidx/compose/ui/state/ToggleableState;", "getFilter", "Lau/com/woolworths/feature/product/list/ui/FilterMenuItem;", "getFilterAndItsAscendants", "filterId", "setFilterStateOf", "filterMenuItem", "areAllChildrenChecked", "", "getAllAscendantIdsOf", "removeAllAppliedFilters", "getAppliedFiltersCount", "getAppliedFilters", "setAppliedFilters", "appliedFilters", "getInsetBannerForFilter", "Lau/com/woolworths/feature/product/list/data/FilterInsetBannerData;", "getImmediateChildrenOf", "getPageTitleOf", "getLogicalParentKey", "useNormalised", "hasAppliedFilters", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FilterOptionsManager {
    public static final int $stable = 8;

    @NotNull
    private List<FilterOption> allFiltersData = EmptyList.d;
    private Map<String, String> filterDescendantToAncestorMap;
    private Map<String, ? extends List<String>> filterParentToChildMap;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                ToggleableState toggleableState = ToggleableState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState2 = ToggleableState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean areAllChildrenChecked(String filterKey) {
        List<FilterMenuItem> immediateChildrenOf = getImmediateChildrenOf(filterKey);
        if ((immediateChildrenOf instanceof Collection) && immediateChildrenOf.isEmpty()) {
            return true;
        }
        Iterator<T> it = immediateChildrenOf.iterator();
        while (it.hasNext()) {
            if (((FilterMenuItem) it.next()).i != ToggleableState.d) {
                return false;
            }
        }
        return true;
    }

    private final void buildFilterHierarchyFrom(List<FilterOption> filterList) {
        buildFilterRelationshipMaps();
        for (FilterOption filterOption : filterList) {
            filterOption.g = getSelectedDescendantsCountFor(filterOption.d);
            setAllDescendantStatesOf(filterOption.d);
        }
    }

    private final void buildFilterRelationshipMaps() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (FilterOption filterOption : this.allFiltersData) {
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
        this.filterParentToChildMap = linkedHashMap;
        this.filterDescendantToAncestorMap = linkedHashMap2;
    }

    private final List<String> getAllAscendantIdsOf(String filterId) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(filterId);
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.addLast(filterId);
        while (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.removeFirst();
            Map<String, ? extends List<String>> map = this.filterParentToChildMap;
            if (map == null) {
                Intrinsics.p("filterParentToChildMap");
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                if (entry.getValue().contains(str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            String str2 = (String) CollectionsKt.E(linkedHashMap.keySet());
            if (str2 != null) {
                arrayList.add(str2);
                arrayDeque.addLast(str2);
            }
        }
        return arrayList;
    }

    private final List<String> getAllDescendantIdsOf(String id) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.addFirst(id);
        while (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.removeFirst();
            Map<String, ? extends List<String>> map = this.filterParentToChildMap;
            if (map == null) {
                Intrinsics.p("filterParentToChildMap");
                throw null;
            }
            List<String> list = map.get(str);
            if (list == null) {
                list = EmptyList.d;
            }
            List<String> list2 = list;
            arrayDeque.addAll(list2);
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private final FilterMenuItem getFilter(String filterKey) {
        Map<String, String> map = this.filterDescendantToAncestorMap;
        Object obj = null;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(filterKey);
        for (FilterOption filterOption : this.allFiltersData) {
            if (Intrinsics.c(filterOption.d, str)) {
                Iterator it = filterOption.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.c(((FilterMenuItem) next).k, filterKey)) {
                        obj = next;
                        break;
                    }
                }
                FilterMenuItem filterMenuItem = (FilterMenuItem) obj;
                if (filterMenuItem != null) {
                    return filterMenuItem;
                }
                throw new IllegalStateException(a.h("Filter item with ID `", filterKey, "` not found"));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final List<FilterMenuItem> getFilterAndItsAscendants(String filterId) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(filterId);
        arrayList.addAll(getAllAscendantIdsOf(filterId));
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(filterId);
        for (FilterOption filterOption : this.allFiltersData) {
            if (Intrinsics.c(filterOption.d, str)) {
                List list = filterOption.f;
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : arrayList) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (Intrinsics.c(str2, ((FilterMenuItem) obj).k)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList2.addAll(arrayList3);
                }
                return arrayList2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int getSelectedDescendantsCountFor(String id) {
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.addFirst(id);
        int i = 0;
        while (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.removeFirst();
            Map<String, ? extends List<String>> map = this.filterParentToChildMap;
            if (map == null) {
                Intrinsics.p("filterParentToChildMap");
                throw null;
            }
            List<String> list = map.get(str);
            arrayDeque.addAll(list != null ? list : EmptyList.d);
            for (FilterMenuItem filterMenuItem : getImmediateChildrenOf(str)) {
                ToggleableState toggleableState = filterMenuItem.i;
                String str2 = filterMenuItem.k;
                if (toggleableState == ToggleableState.d) {
                    i++;
                    arrayDeque.remove(str2);
                } else if (!filterMenuItem.h) {
                    arrayDeque.remove(str2);
                }
            }
        }
        return i;
    }

    private final void setAllDescendantStatesOf(String id) {
        Object next;
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.addAll(getAllDescendantIdsOf(id));
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(id);
        for (FilterOption filterOption : this.allFiltersData) {
            if (Intrinsics.c(filterOption.d, str)) {
                List list = filterOption.f;
                while (!arrayDeque.isEmpty()) {
                    String str2 = (String) arrayDeque.removeFirst();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.c(((FilterMenuItem) next).k, str2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    FilterMenuItem filterMenuItem = (FilterMenuItem) next;
                    if (filterMenuItem != null && filterMenuItem.h) {
                        if (filterMenuItem.i == ToggleableState.d) {
                            arrayDeque.removeAll(getAllDescendantIdsOf(str2));
                        } else {
                            int selectedDescendantsCountFor = getSelectedDescendantsCountFor(str2);
                            if (selectedDescendantsCountFor > 0) {
                                filterMenuItem.j = selectedDescendantsCountFor;
                                filterMenuItem.i = ToggleableState.f;
                            } else {
                                arrayDeque.removeAll(getAllDescendantIdsOf(str2));
                            }
                        }
                    }
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void setFilterStateOf(FilterMenuItem filterMenuItem) {
        int selectedDescendantsCountFor;
        boolean z = filterMenuItem.h;
        String str = filterMenuItem.k;
        ToggleableState toggleableState = !z ? filterMenuItem.i : areAllChildrenChecked(str) ? ToggleableState.d : ToggleableState.e;
        if (toggleableState == ToggleableState.d || !filterMenuItem.h) {
            selectedDescendantsCountFor = 0;
        } else {
            selectedDescendantsCountFor = getSelectedDescendantsCountFor(str);
            if (selectedDescendantsCountFor > 0) {
                toggleableState = ToggleableState.f;
            }
        }
        Intrinsics.h(toggleableState, "<set-?>");
        filterMenuItem.i = toggleableState;
        filterMenuItem.j = selectedDescendantsCountFor;
    }

    @NotNull
    public final Map<String, List<String>> getAppliedFilters() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FilterOption filterOption : this.allFiltersData) {
            List list = filterOption.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((FilterMenuItem) obj).i == ToggleableState.d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FilterMenuItem) it.next()).d);
            }
            if (!arrayList2.isEmpty()) {
                linkedHashMap.put(filterOption.d, arrayList2);
            }
        }
        return linkedHashMap;
    }

    public final int getAppliedFiltersCount() {
        Iterator<T> it = this.allFiltersData.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((FilterOption) it.next()).g;
        }
        return i;
    }

    @NotNull
    public final List<FilterMenuItem> getImmediateChildrenOf(@NotNull String filterKey) {
        Intrinsics.h(filterKey, "filterKey");
        Map<String, ? extends List<String>> map = this.filterParentToChildMap;
        if (map == null) {
            Intrinsics.p("filterParentToChildMap");
            throw null;
        }
        List<String> list = map.get(filterKey);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return EmptyList.d;
        }
        Map<String, String> map2 = this.filterDescendantToAncestorMap;
        if (map2 == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map2.get(filterKey);
        for (FilterOption filterOption : this.allFiltersData) {
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

    @Nullable
    public final FilterInsetBannerData getInsetBannerForFilter(@NotNull String filterKey) {
        Object next;
        Intrinsics.h(filterKey, "filterKey");
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(filterKey);
        Iterator<T> it = this.allFiltersData.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((FilterOption) next).d, str)) {
                break;
            }
        }
        FilterOption filterOption = (FilterOption) next;
        FilterInsetBannerData filterInsetBannerData = filterOption != null ? filterOption.h : null;
        if (filterInsetBannerData != null) {
            filterInsetBannerData.setFilterPageKey(StringsKt.N(filterKey, "_" + str));
        }
        return filterInsetBannerData;
    }

    @NotNull
    public final String getLogicalParentKey(@NotNull String filterKey, boolean useNormalised) {
        Intrinsics.h(filterKey, "filterKey");
        FilterMenuItem filter = getFilter(filterKey);
        if (filter.g.length() != 0) {
            return useNormalised ? filter.l : filter.g;
        }
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map != null) {
            String str = map.get(filter.k);
            return str == null ? "" : str;
        }
        Intrinsics.p("filterDescendantToAncestorMap");
        throw null;
    }

    @Nullable
    public final String getPageTitleOf(@NotNull String filterKey) {
        Object next;
        Object next2;
        Intrinsics.h(filterKey, "filterKey");
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(filterKey);
        Iterator<T> it = this.allFiltersData.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((FilterOption) next).d, str)) {
                break;
            }
        }
        FilterOption filterOption = (FilterOption) next;
        if (filterOption == null) {
            Timber.f27013a.e(a.i("No descendants found for filter key: ", filterKey, ", ancestor id: ", str), new Object[0]);
            return null;
        }
        if (Intrinsics.c(str, filterKey)) {
            return filterOption.e;
        }
        Iterator it2 = filterOption.f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.c(((FilterMenuItem) next2).k, filterKey)) {
                break;
            }
        }
        FilterMenuItem filterMenuItem = (FilterMenuItem) next2;
        if (filterMenuItem != null) {
            return filterMenuItem.e;
        }
        return null;
    }

    public final boolean hasAppliedFilters() {
        Iterator<T> it = this.allFiltersData.iterator();
        while (it.hasNext()) {
            List list = ((FilterOption) it.next()).f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ToggleableState toggleableState = ((FilterMenuItem) it2.next()).i;
                    if (toggleableState == ToggleableState.f || toggleableState == ToggleableState.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public final List<FilterOption> removeAllAppliedFilters() {
        for (FilterOption filterOption : this.allFiltersData) {
            List<FilterMenuItem> list = filterOption.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (FilterMenuItem filterMenuItem : list) {
                ToggleableState toggleableState = ToggleableState.e;
                filterMenuItem.getClass();
                filterMenuItem.i = toggleableState;
                filterMenuItem.j = 0;
                arrayList.add(Unit.f24250a);
            }
            filterOption.g = 0;
        }
        return this.allFiltersData;
    }

    @NotNull
    public final List<FilterOption> setAllAscendantStatesOf(@NotNull String filterKey) {
        Intrinsics.h(filterKey, "filterKey");
        FilterMenuItem filter = getFilter(filterKey);
        if (filter.g.length() > 0) {
            Iterator<T> it = getFilterAndItsAscendants(filter.l).iterator();
            while (it.hasNext()) {
                setFilterStateOf((FilterMenuItem) it.next());
            }
        }
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(filter.k);
        for (FilterOption filterOption : this.allFiltersData) {
            if (Intrinsics.c(filterOption.d, str)) {
                filterOption.g = getSelectedDescendantsCountFor(filterOption.d);
                return this.allFiltersData;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public final List<FilterOption> setAllDescendantsStatesOf(@NotNull String filterKey, @NotNull ToggleableState newState) {
        Intrinsics.h(filterKey, "filterKey");
        Intrinsics.h(newState, "newState");
        ArrayList arrayList = new ArrayList();
        arrayList.add(filterKey);
        FilterMenuItem filter = getFilter(filterKey);
        if (filter.h) {
            arrayList.addAll(getAllDescendantIdsOf(filter.k));
        }
        Map<String, String> map = this.filterDescendantToAncestorMap;
        if (map == null) {
            Intrinsics.p("filterDescendantToAncestorMap");
            throw null;
        }
        String str = map.get(filterKey);
        for (FilterOption filterOption : this.allFiltersData) {
            if (Intrinsics.c(filterOption.d, str)) {
                List list = filterOption.f;
                ArrayList<FilterMenuItem> arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (arrayList.contains(((FilterMenuItem) obj).k)) {
                        arrayList2.add(obj);
                    }
                }
                int i = WhenMappings.$EnumSwitchMapping$0[newState.ordinal()];
                if (i == 1 || i == 2) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                    for (FilterMenuItem filterMenuItem : arrayList2) {
                        if (filterMenuItem.i != newState) {
                            filterMenuItem.i = newState;
                            filterMenuItem.j = 0;
                        }
                        arrayList3.add(Unit.f24250a);
                    }
                }
                return this.allFiltersData;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void setAppliedFilters(@NotNull Map<String, ? extends List<String>> appliedFilters) {
        Intrinsics.h(appliedFilters, "appliedFilters");
        for (FilterOption filterOption : this.allFiltersData) {
            List<String> list = appliedFilters.get(filterOption.d);
            if (list == null) {
                list = EmptyList.d;
            }
            for (FilterMenuItem filterMenuItem : filterOption.f) {
                filterMenuItem.i = list.contains(filterMenuItem.d) ? ToggleableState.d : ToggleableState.e;
            }
        }
    }

    @NotNull
    public final List<FilterOption> setData(@NotNull List<FilterOption> sourceData) {
        Intrinsics.h(sourceData, "sourceData");
        this.allFiltersData = sourceData;
        buildFilterHierarchyFrom(sourceData);
        return this.allFiltersData;
    }
}
