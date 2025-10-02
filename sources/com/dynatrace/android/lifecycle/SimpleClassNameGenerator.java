package com.dynatrace.android.lifecycle;

import com.dynatrace.android.useraction.ActionNameCustomizer;

/* loaded from: classes.dex */
public class SimpleClassNameGenerator implements ActionNameCustomizer {
    public final String a(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
    }
}
