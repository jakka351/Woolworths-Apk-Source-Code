package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* loaded from: classes.dex */
public final class ObjectHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final BiPredicate f24225a = new BiObjectPredicate();

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return ObjectHelper.a(obj, obj2);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
