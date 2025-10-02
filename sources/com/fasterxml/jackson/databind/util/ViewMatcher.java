package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class ViewMatcher implements Serializable {
    public static final ViewMatcher d = new ViewMatcher();

    public static final class Multi extends ViewMatcher implements Serializable {
    }

    public static final class Single extends ViewMatcher {
    }

    public static ViewMatcher a(Class[] clsArr) {
        int length;
        if (clsArr == null || (length = clsArr.length) == 0) {
            return d;
        }
        if (length != 1) {
            return new Multi();
        }
        Class cls = clsArr[0];
        return new Single();
    }
}
