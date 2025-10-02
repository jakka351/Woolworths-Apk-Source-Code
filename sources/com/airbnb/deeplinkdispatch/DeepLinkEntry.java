package com.airbnb.deeplinkdispatch;

import androidx.camera.core.impl.b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "", "ActivityDeeplinkEntry", "Companion", "HandlerDeepLinkEntry", "MethodDeeplinkEntry", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$ActivityDeeplinkEntry;", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$HandlerDeepLinkEntry;", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$MethodDeeplinkEntry;", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DeepLinkEntry implements Comparable<DeepLinkEntry> {
    public static final Regex k = new Regex("\\{.*?\\}");
    public final String d;
    public final String e;
    public final Lazy f = LazyKt.b(new Function0<Class<?>>() { // from class: com.airbnb.deeplinkdispatch.DeepLinkEntry$clazz$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DeepLinkEntry deepLinkEntry = this.h;
            try {
                return Class.forName(deepLinkEntry.getE());
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Deeplink class " + deepLinkEntry.getE() + " not found. If you are using Proguard/R8/Dexguard please consult README.md for correct configuration.", e);
            }
        }
    });
    public final Lazy g = LazyKt.b(new Function0<String>() { // from class: com.airbnb.deeplinkdispatch.DeepLinkEntry$uriTemplateWithoutPlaceholders$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeepLinkEntry.k.g(this.h.getD(), "");
        }
    });
    public final Lazy h = LazyKt.b(new Function0<Integer>() { // from class: com.airbnb.deeplinkdispatch.DeepLinkEntry$firstConfigurablePathSegmentIndex$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(StringsKt.B(this.h.getD(), '<', 0, 6));
        }
    });
    public final Lazy i = LazyKt.b(new Function0<Integer>() { // from class: com.airbnb.deeplinkdispatch.DeepLinkEntry$firstPlaceholderIndex$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(StringsKt.B(this.h.getD(), '{', 0, 6));
        }
    });
    public final Lazy j = LazyKt.b(new Function0<Integer>() { // from class: com.airbnb.deeplinkdispatch.DeepLinkEntry$firstNonConcreteIndex$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DeepLinkEntry deepLinkEntry = this.h;
            Lazy lazy = deepLinkEntry.h;
            Lazy lazy2 = deepLinkEntry.i;
            return Integer.valueOf((((Number) lazy2.getD()).intValue() == -1 && ((Number) lazy.getD()).intValue() == -1) ? -1 : ((Number) lazy.getD()).intValue() == -1 ? ((Number) lazy2.getD()).intValue() : ((Number) lazy2.getD()).intValue() == -1 ? ((Number) lazy.getD()).intValue() : Math.min(((Number) lazy.getD()).intValue(), ((Number) lazy2.getD()).intValue()));
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$ActivityDeeplinkEntry;", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ActivityDeeplinkEntry extends DeepLinkEntry {
        public final String l;
        public final String m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityDeeplinkEntry(String uriTemplate, String className) {
            super(uriTemplate, className);
            Intrinsics.h(uriTemplate, "uriTemplate");
            Intrinsics.h(className, "className");
            this.l = uriTemplate;
            this.m = className;
        }

        @Override // com.airbnb.deeplinkdispatch.DeepLinkEntry
        /* renamed from: b, reason: from getter */
        public final String getE() {
            return this.m;
        }

        @Override // com.airbnb.deeplinkdispatch.DeepLinkEntry
        /* renamed from: e, reason: from getter */
        public final String getD() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityDeeplinkEntry)) {
                return false;
            }
            ActivityDeeplinkEntry activityDeeplinkEntry = (ActivityDeeplinkEntry) obj;
            return Intrinsics.c(this.l, activityDeeplinkEntry.l) && Intrinsics.c(this.m, activityDeeplinkEntry.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + (this.l.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivityDeeplinkEntry(uriTemplate=");
            sb.append(this.l);
            sb.append(", className=");
            return b.r(sb, this.m, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$Companion;", "", "Lkotlin/text/Regex;", "placeholderRegex", "Lkotlin/text/Regex;", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$HandlerDeepLinkEntry;", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HandlerDeepLinkEntry extends DeepLinkEntry {
        public final String l;
        public final String m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerDeepLinkEntry(String uriTemplate, String className) {
            super(uriTemplate, className);
            Intrinsics.h(uriTemplate, "uriTemplate");
            Intrinsics.h(className, "className");
            this.l = uriTemplate;
            this.m = className;
        }

        @Override // com.airbnb.deeplinkdispatch.DeepLinkEntry
        /* renamed from: b, reason: from getter */
        public final String getE() {
            return this.m;
        }

        @Override // com.airbnb.deeplinkdispatch.DeepLinkEntry
        /* renamed from: e, reason: from getter */
        public final String getD() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandlerDeepLinkEntry)) {
                return false;
            }
            HandlerDeepLinkEntry handlerDeepLinkEntry = (HandlerDeepLinkEntry) obj;
            return Intrinsics.c(this.l, handlerDeepLinkEntry.l) && Intrinsics.c(this.m, handlerDeepLinkEntry.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + (this.l.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandlerDeepLinkEntry(uriTemplate=");
            sb.append(this.l);
            sb.append(", className=");
            return b.r(sb, this.m, ')');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkEntry$MethodDeeplinkEntry;", "Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MethodDeeplinkEntry extends DeepLinkEntry {
        public final String l;
        public final String m;
        public final String n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MethodDeeplinkEntry(String uriTemplate, String className, String method) {
            super(uriTemplate, className);
            Intrinsics.h(uriTemplate, "uriTemplate");
            Intrinsics.h(className, "className");
            Intrinsics.h(method, "method");
            this.l = uriTemplate;
            this.m = className;
            this.n = method;
        }

        @Override // com.airbnb.deeplinkdispatch.DeepLinkEntry
        /* renamed from: b, reason: from getter */
        public final String getE() {
            return this.m;
        }

        @Override // com.airbnb.deeplinkdispatch.DeepLinkEntry
        /* renamed from: e, reason: from getter */
        public final String getD() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodDeeplinkEntry)) {
                return false;
            }
            MethodDeeplinkEntry methodDeeplinkEntry = (MethodDeeplinkEntry) obj;
            return Intrinsics.c(this.l, methodDeeplinkEntry.l) && Intrinsics.c(this.m, methodDeeplinkEntry.m) && Intrinsics.c(this.n, methodDeeplinkEntry.n);
        }

        public final int hashCode() {
            return this.n.hashCode() + b.c(this.l.hashCode() * 31, 31, this.m);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MethodDeeplinkEntry(uriTemplate=");
            sb.append(this.l);
            sb.append(", className=");
            sb.append(this.m);
            sb.append(", method=");
            return b.r(sb, this.n, ')');
        }
    }

    public DeepLinkEntry(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(DeepLinkEntry other) {
        Intrinsics.h(other, "other");
        if (d() >= 0 || d() == other.d()) {
            if ((other.d() < 0 && other.d() != d()) || d() < other.d()) {
                return 1;
            }
            if (d() == other.d()) {
                if (d() == -1 || getD().charAt(d()) == other.getD().charAt(d())) {
                    return 0;
                }
                if (getD().charAt(d()) != '<') {
                    return 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b, reason: from getter */
    public String getE() {
        return this.e;
    }

    public final Class c() {
        Object d = this.f.getD();
        Intrinsics.g(d, "<get-clazz>(...)");
        return (Class) d;
    }

    public final int d() {
        return ((Number) this.j.getD()).intValue();
    }

    /* renamed from: e, reason: from getter */
    public String getD() {
        return this.d;
    }
}
