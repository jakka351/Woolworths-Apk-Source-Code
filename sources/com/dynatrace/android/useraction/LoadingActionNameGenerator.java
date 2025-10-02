package com.dynatrace.android.useraction;

import YU.a;

/* loaded from: classes.dex */
public class LoadingActionNameGenerator implements ActionNameCustomizer {
    public final String a(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        return a.A("Loading ", str);
    }
}
