package com.salesforce.marketingcloud.events;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f16880a = com.salesforce.marketingcloud.g.a("EventUtilsKt");

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.sfmcsdk.components.events.Event f16881a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.salesforce.marketingcloud.sfmcsdk.components.events.Event event) {
            super(0);
            this.f16881a = event;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "(" + this.f16881a + ") returned null during conversion to Push SDK Event.";
        }
    }

    public static final class b extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(0);
            this.f16882a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return androidx.camera.core.impl.b.n(this.f16882a, "Failed to convert event '", "' to Push SDK Event.");
        }
    }

    public static final class c extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Event f16883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Event event) {
            super(0);
            this.f16883a = event;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "(" + this.f16883a + ") returned null during conversion to SFMC SDK Event.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.d$d, reason: collision with other inner class name */
    public static final class C0358d extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16884a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0358d(Object obj) {
            super(0);
            this.f16884a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return androidx.camera.core.impl.b.n(this.f16884a, "Failed to convert event '", "' to SFMCSdk Event.");
        }
    }

    @RestrictTo
    @NotNull
    public static final Map<String, List<Object>> a(@NotNull Event event) {
        Intrinsics.h(event, "<this>");
        return a(new LinkedHashMap(), event.attributes(), (String) null, 4, (Object) null);
    }

    @Nullable
    public static final com.salesforce.marketingcloud.sfmcsdk.components.events.Event b(@NotNull Event event) {
        Intrinsics.h(event, "<this>");
        return EventManager.Companion.customEvent$default(com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager.INSTANCE, event.name(), event.attributes(), Event.Producer.PUSH, null, 8, null);
    }

    private static final Map<String, List<Object>> a(Map<String, List<Object>> map, Object obj, String str) {
        try {
            if (!(obj instanceof List)) {
                return obj instanceof Map ? a(map, (Map<Object, Object>) TypeIntrinsics.b(obj), str) : map;
            }
            List list = (List) obj;
            if ((list instanceof KMappedMarker) && !(list instanceof KMutableList)) {
                TypeIntrinsics.g(list, "kotlin.collections.MutableList");
                throw null;
            }
            try {
                return a(map, (List<Object>) list, str);
            } catch (ClassCastException e) {
                Intrinsics.l(e, TypeIntrinsics.class.getName());
                throw e;
            }
        } catch (Exception unused) {
            return map;
        }
    }

    @JvmOverloads
    @NotNull
    public static final com.salesforce.marketingcloud.sfmcsdk.components.events.Event[] b(@NotNull Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        return a(objArr, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public static final com.salesforce.marketingcloud.sfmcsdk.components.events.Event[] b(@NotNull Object[] objArr, @NotNull EnumSet<Event.Producer> producers) {
        Intrinsics.h(objArr, "<this>");
        Intrinsics.h(producers, "producers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                try {
                    Event event = (Event) obj;
                    if (producers.contains(event.getProducer())) {
                        com.salesforce.marketingcloud.sfmcsdk.components.events.Event eventB = b(event);
                        if ((eventB != null ? Boolean.valueOf(arrayList.add(eventB)) : null) == null) {
                            com.salesforce.marketingcloud.g.c(com.salesforce.marketingcloud.g.f16896a, f16880a, null, new c(event), 2, null);
                        }
                    }
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f16896a, f16880a, null, new C0358d(obj), 2, null);
                }
            }
        }
        return (com.salesforce.marketingcloud.sfmcsdk.components.events.Event[]) arrayList.toArray(new com.salesforce.marketingcloud.sfmcsdk.components.events.Event[0]);
    }

    public static /* synthetic */ Map a(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = "";
        }
        return a((Map<String, List<Object>>) map, obj, str);
    }

    private static final boolean a(Object obj) {
        if (obj instanceof Map) {
            return true;
        }
        if (obj instanceof List) {
            int i = 0;
            for (Object obj2 : (Iterable) obj) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                if (obj2 != null && a(obj2)) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }

    private static final Map<String, List<Object>> a(Map<String, List<Object>> map, List<Object> list, String str) {
        for (Object obj : list) {
            Locale locale = Locale.getDefault();
            Intrinsics.g(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (obj != null) {
                if (a(obj)) {
                    map.putAll(a(map, obj, str));
                } else {
                    List<Object> list2 = map.get(lowerCase);
                    if (list2 == null || list2.isEmpty()) {
                        map.put(lowerCase, CollectionsKt.Z(obj));
                    } else {
                        List<Object> list3 = map.get(lowerCase);
                        if (list3 != null) {
                            list3.add(obj);
                        }
                    }
                }
            }
        }
        return map;
    }

    private static final Map<String, List<Object>> a(Map<String, List<Object>> map, Map<Object, Object> map2, String str) {
        String str2;
        for (Map.Entry<Object, Object> entry : map2.entrySet()) {
            if (StringsKt.D(str)) {
                Object key = entry.getKey();
                Intrinsics.f(key, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) key;
            } else {
                str2 = str + "." + entry.getKey();
            }
            Locale locale = Locale.getDefault();
            Intrinsics.g(locale, "getDefault(...)");
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (a(entry.getValue())) {
                map.putAll(a(map, entry.getValue(), lowerCase));
            } else {
                List<Object> list = map.get(lowerCase);
                if (list == null || list.isEmpty()) {
                    map.put(lowerCase, CollectionsKt.Z(entry.getValue()));
                } else {
                    List<Object> list2 = map.get(lowerCase);
                    if (list2 != null) {
                        list2.add(entry.getValue());
                    }
                }
            }
        }
        return map;
    }

    @JvmOverloads
    @NotNull
    public static final Event[] a(@NotNull Object[] objArr) {
        Intrinsics.h(objArr, "<this>");
        return a(objArr, (EnumSet) null, (EnumSet) null, 3, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final Event[] a(@NotNull Object[] objArr, @NotNull EnumSet<Event.Producer> producers) {
        Intrinsics.h(objArr, "<this>");
        Intrinsics.h(producers, "producers");
        return a(objArr, producers, (EnumSet) null, 2, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final Event[] a(@NotNull Object[] objArr, @NotNull EnumSet<Event.Producer> producers, @NotNull EnumSet<Event.Category> categories) {
        Intrinsics.h(objArr, "<this>");
        Intrinsics.h(producers, "producers");
        Intrinsics.h(categories, "categories");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                try {
                    com.salesforce.marketingcloud.sfmcsdk.components.events.Event event = (com.salesforce.marketingcloud.sfmcsdk.components.events.Event) obj;
                    if (producers.contains(event.getProducer()) && categories.contains(event.getCategory())) {
                        Event eventA = a(event);
                        if ((eventA != null ? Boolean.valueOf(arrayList.add(eventA)) : null) == null) {
                            com.salesforce.marketingcloud.g.c(com.salesforce.marketingcloud.g.f16896a, f16880a, null, new a(event), 2, null);
                        }
                    }
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.b(com.salesforce.marketingcloud.g.f16896a, f16880a, null, new b(obj), 2, null);
                }
            }
        }
        return (Event[]) arrayList.toArray(new Event[0]);
    }

    public static /* synthetic */ Event[] a(Object[] objArr, EnumSet enumSet, EnumSet enumSet2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumSet = EnumSet.allOf(Event.Producer.class);
            Intrinsics.g(enumSet, "allOf(...)");
        }
        if ((i & 2) != 0) {
            enumSet2 = EnumSet.allOf(Event.Category.class);
            Intrinsics.g(enumSet2, "allOf(...)");
        }
        return a(objArr, (EnumSet<Event.Producer>) enumSet, (EnumSet<Event.Category>) enumSet2);
    }

    @Nullable
    public static final Event a(@NotNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event event) {
        Intrinsics.h(event, "<this>");
        return EventManager.INSTANCE.customEvent(event.getName(), event.attributes(), event.getProducer());
    }

    public static /* synthetic */ com.salesforce.marketingcloud.sfmcsdk.components.events.Event[] a(Object[] objArr, EnumSet enumSet, int i, Object obj) {
        if ((i & 1) != 0) {
            enumSet = EnumSet.allOf(Event.Producer.class);
            Intrinsics.g(enumSet, "allOf(...)");
        }
        return b(objArr, enumSet);
    }
}
