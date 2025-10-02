package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class IgnorePropertiesUtil {

    public static final class Checker implements Serializable {
        public final Set d;
        public final Set e;

        public Checker(Set set, Set set2) {
            this.d = set == null ? Collections.EMPTY_SET : set;
            this.e = set2;
        }

        public final boolean a(Object obj) {
            Set set = this.e;
            return !(set == null || set.contains(obj)) || this.d.contains(obj);
        }
    }

    public static Checker a(Set set, Set set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return new Checker(set, set2);
    }

    public static boolean b(Object obj, Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        return collection2 == null ? collection.contains(obj) : collection == null ? !collection2.contains(obj) : !collection2.contains(obj) || collection.contains(obj);
    }
}
