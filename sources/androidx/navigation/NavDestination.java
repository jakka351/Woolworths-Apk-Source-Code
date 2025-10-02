package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.SparseArrayKt$valueIterator$1;
import androidx.core.os.BundleKt;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.internal.g;
import androidx.navigation.internal.h;
import androidx.os.SavedStateReader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination;", "", "ClassType", "DeepLinkMatch", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavDestination {
    public static final /* synthetic */ int i = 0;
    public final String d;
    public final NavDestinationImpl e;
    public NavGraph f;
    public CharSequence g;
    public final SparseArrayCompat h;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "Lkotlin/reflect/KClass;", "value", "<init>", "(Lkotlin/reflect/KClass;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    public @interface ClassType {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(NavContext context, int i) {
            Intrinsics.h(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                Context context2 = context.f3509a;
                Intrinsics.e(context2);
                String resourceName = context2.getResources().getResourceName(i);
                Intrinsics.e(resourceName);
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }

        public static Sequence b(NavDestination navDestination) {
            Intrinsics.h(navDestination, "<this>");
            return SequencesKt.m(navDestination, new a(5));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @RestrictTo
    @SourceDebugExtension
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        public final NavDestination d;
        public final Bundle e;
        public final boolean f;
        public final int g;
        public final boolean h;
        public final int i;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            this.d = navDestination;
            this.e = bundle;
            this.f = z;
            this.g = i;
            this.h = z2;
            this.i = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(DeepLinkMatch other) {
            Intrinsics.h(other, "other");
            boolean z = other.h;
            boolean z2 = other.f;
            Bundle bundle = other.e;
            boolean z3 = this.f;
            if (z3 && !z2) {
                return 1;
            }
            if (!z3 && z2) {
                return -1;
            }
            int i = this.g - other.g;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle source = this.e;
            if (source != null && bundle == null) {
                return 1;
            }
            if (source == null && bundle != null) {
                return -1;
            }
            if (source != null) {
                Intrinsics.h(source, "source");
                int size = source.size();
                Intrinsics.e(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z4 = this.h;
            if (z4 && !z) {
                return 1;
            }
            if (z4 || !z) {
                return this.i - other.i;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public NavDestination(String str) {
        this.d = str;
        this.e = new NavDestinationImpl(this);
        this.h = new SparseArrayCompat(0);
    }

    public final void b(NavDeepLink navDeepLink) {
        Intrinsics.h(navDeepLink, "navDeepLink");
        NavDestinationImpl navDestinationImpl = this.e;
        navDestinationImpl.getClass();
        ArrayList arrayListA = NavArgumentKt.a(navDestinationImpl.d, new g(navDeepLink, 0));
        if (arrayListA.isEmpty()) {
            navDestinationImpl.c.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f3478a + " can't be used to open destination " + navDestinationImpl.f3511a + ".\nFollowing required arguments are missing: " + arrayListA).toString());
    }

    public final Bundle d(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.e.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            NavArgument navArgument = (NavArgument) entry.getValue();
            navArgument.getClass();
            Intrinsics.h(name, "name");
            if (navArgument.c && (obj = navArgument.e) != null) {
                navArgument.f3472a.e(bundleA, name, obj);
            }
        }
        if (bundle != null) {
            bundleA.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                NavArgument navArgument2 = (NavArgument) entry2.getValue();
                boolean z = navArgument2.d;
                NavType navType = navArgument2.f3472a;
                if (!z) {
                    Intrinsics.h(name2, "name");
                    if (navArgument2.b || !bundleA.containsKey(name2) || !SavedStateReader.m(bundleA, name2)) {
                        try {
                            navType.a(bundleA, name2);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    StringBuilder sbU = YU.a.u("Wrong argument type for '", name2, "' in argument savedState. ");
                    sbU.append(navType.b());
                    sbU.append(" expected.");
                    throw new IllegalArgumentException(sbU.toString().toString());
                }
            }
        }
        return bundleA;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Lcb
        L5:
            r1 = 0
            if (r11 == 0) goto Lcc
            boolean r2 = r11 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Le
            goto Lcc
        Le:
            androidx.navigation.internal.NavDestinationImpl r2 = r10.e
            java.util.ArrayList r3 = r2.c
            androidx.navigation.NavDestination r11 = (androidx.navigation.NavDestination) r11
            androidx.collection.SparseArrayCompat r4 = r11.h
            androidx.navigation.internal.NavDestinationImpl r5 = r11.e
            java.util.ArrayList r6 = r5.c
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r6)
            androidx.collection.SparseArrayCompat r6 = r10.h
            int r7 = r6.e()
            int r8 = r4.e()
            if (r7 != r8) goto L5a
            androidx.collection.SparseArrayKt$keyIterator$1 r7 = new androidx.collection.SparseArrayKt$keyIterator$1
            r7.<init>()
            kotlin.sequences.Sequence r7 = kotlin.sequences.SequencesKt.b(r7)
            kotlin.sequences.ConstrainedOnceSequence r7 = (kotlin.sequences.ConstrainedOnceSequence) r7
            java.util.Iterator r7 = r7.getF24664a()
        L39:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L58
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = androidx.collection.SparseArrayCompatKt.b(r6, r8)
            java.lang.Object r8 = androidx.collection.SparseArrayCompatKt.b(r4, r8)
            boolean r8 = kotlin.jvm.internal.Intrinsics.c(r9, r8)
            if (r8 != 0) goto L39
            goto L5a
        L58:
            r4 = r0
            goto L5b
        L5a:
            r4 = r1
        L5b:
            java.util.Map r6 = r10.i()
            int r6 = r6.size()
            java.util.Map r7 = r11.i()
            int r7 = r7.size()
            if (r6 != r7) goto Lb4
            java.util.Map r6 = r10.i()
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 r6 = kotlin.collections.CollectionsKt.n(r6)
            java.lang.Iterable r6 = r6.f24253a
            java.util.Iterator r6 = r6.iterator()
        L81:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb2
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.Map r8 = r11.i()
            java.lang.Object r9 = r7.getKey()
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto Lb4
            java.util.Map r8 = r11.i()
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r8, r7)
            if (r7 == 0) goto Lb4
            goto L81
        Lb2:
            r11 = r0
            goto Lb5
        Lb4:
            r11 = r1
        Lb5:
            int r6 = r2.e
            int r7 = r5.e
            if (r6 != r7) goto Lcc
            java.lang.String r2 = r2.f
            java.lang.String r5 = r5.f
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r5)
            if (r2 == 0) goto Lcc
            if (r3 == 0) goto Lcc
            if (r4 == 0) goto Lcc
            if (r11 == 0) goto Lcc
        Lcb:
            return r0
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] g(androidx.navigation.NavDestination r7) {
        /*
            r6 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r6
        L6:
            androidx.navigation.internal.NavDestinationImpl r2 = r1.e
            androidx.navigation.NavGraph r3 = r1.f
            if (r7 == 0) goto Lf
            androidx.navigation.NavGraph r4 = r7.f
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L25
            androidx.navigation.NavGraph r4 = r7.f
            kotlin.jvm.internal.Intrinsics.e(r4)
            int r5 = r2.e
            androidx.navigation.internal.NavGraphImpl r4 = r4.j
            androidx.navigation.NavDestination r4 = r4.b(r5)
            if (r4 != r1) goto L25
            r0.addFirst(r1)
            goto L3b
        L25:
            if (r3 == 0) goto L2f
            androidx.navigation.internal.NavGraphImpl r4 = r3.j
            int r4 = r4.c
            int r2 = r2.e
            if (r4 == r2) goto L32
        L2f:
            r0.addFirst(r1)
        L32:
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r3, r7)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            if (r3 != 0) goto L6d
        L3b:
            java.util.List r7 = kotlin.collections.CollectionsKt.G0(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L50:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r7.next()
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            androidx.navigation.internal.NavDestinationImpl r1 = r1.e
            int r1 = r1.e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L50
        L68:
            int[] r7 = kotlin.collections.CollectionsKt.F0(r0)
            return r7
        L6d:
            r1 = r3
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.g(androidx.navigation.NavDestination):int[]");
    }

    public final NavAction h(int i2) {
        NavAction navAction;
        SparseArrayCompat sparseArrayCompat = this.h;
        if (sparseArrayCompat.e() == 0) {
            navAction = null;
        } else {
            sparseArrayCompat.getClass();
            navAction = (NavAction) SparseArrayCompatKt.b(sparseArrayCompat, i2);
        }
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.f;
        if (navGraph != null) {
            return navGraph.h(i2);
        }
        return null;
    }

    public int hashCode() {
        NavDestinationImpl navDestinationImpl = this.e;
        int i2 = navDestinationImpl.e * 31;
        String str = navDestinationImpl.f;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        Iterator it = navDestinationImpl.c.iterator();
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            int i3 = iHashCode * 31;
            String str2 = navDeepLink.f3478a;
            int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = navDeepLink.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = navDeepLink.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        SparseArrayCompat sparseArrayCompat = this.h;
        Intrinsics.h(sparseArrayCompat, "<this>");
        SparseArrayKt$valueIterator$1 sparseArrayKt$valueIterator$1 = new SparseArrayKt$valueIterator$1(sparseArrayCompat);
        while (sparseArrayKt$valueIterator$1.hasNext()) {
            NavAction navAction = (NavAction) sparseArrayKt$valueIterator$1.next();
            int i4 = ((iHashCode * 31) + navAction.f3470a) * 31;
            NavOptions navOptions = navAction.b;
            iHashCode = i4 + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle bundle = navAction.c;
            if (bundle != null) {
                iHashCode = SavedStateReader.b(bundle) + (iHashCode * 31);
            }
        }
        for (String str5 : i().keySet()) {
            int iC = androidx.camera.core.impl.b.c(iHashCode * 31, 31, str5);
            Object obj = i().get(str5);
            iHashCode = iC + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Map i() {
        return MapsKt.q(this.e.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.navigation.NavDestination.DeepLinkMatch j(androidx.navigation.NavDeepLinkRequest r24) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.j(androidx.navigation.NavDeepLinkRequest):androidx.navigation.NavDestination$DeepLinkMatch");
    }

    public void k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.e);
        Intrinsics.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        m(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            NavDestinationImpl navDestinationImpl = this.e;
            navDestinationImpl.e = resourceId;
            navDestinationImpl.b = null;
            navDestinationImpl.b = Companion.a(new NavContext(context), navDestinationImpl.e);
        }
        this.g = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public final void l(int i2, NavAction action) {
        Intrinsics.h(action, "action");
        if (!(this instanceof ActivityNavigator.Destination)) {
            if (i2 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.h.d(i2, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void m(String str) {
        NavDestinationImpl navDestinationImpl = this.e;
        if (str == null) {
            navDestinationImpl.e = 0;
            navDestinationImpl.b = null;
        } else {
            navDestinationImpl.getClass();
            if (StringsKt.D(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            NavDeepLink.Builder builder = new NavDeepLink.Builder();
            Intrinsics.h(uriPattern, "uriPattern");
            builder.f3479a = uriPattern;
            ArrayList arrayListA = NavArgumentKt.a(navDestinationImpl.d, new g(new NavDeepLink(builder.f3479a, builder.b, builder.c), 1));
            if (!arrayListA.isEmpty()) {
                StringBuilder sbU = YU.a.u("Cannot set route \"", str, "\" for destination ");
                sbU.append(navDestinationImpl.f3511a);
                sbU.append(". Following required arguments are missing: ");
                sbU.append(arrayListA);
                throw new IllegalArgumentException(sbU.toString().toString());
            }
            navDestinationImpl.g = LazyKt.b(new h(uriPattern, 0));
            navDestinationImpl.e = uriPattern.hashCode();
            navDestinationImpl.b = null;
        }
        navDestinationImpl.f = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        NavDestinationImpl navDestinationImpl = this.e;
        String str = navDestinationImpl.b;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(navDestinationImpl.e));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = navDestinationImpl.f;
        if (str2 != null && !StringsKt.D(str2)) {
            sb.append(" route=");
            sb.append(navDestinationImpl.f);
        }
        if (this.g != null) {
            sb.append(" label=");
            sb.append(this.g);
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator navigator) {
        this(NavigatorProvider.Companion.a(navigator.getClass()));
        Intrinsics.h(navigator, "navigator");
        LinkedHashMap linkedHashMap = NavigatorProvider.b;
    }
}
