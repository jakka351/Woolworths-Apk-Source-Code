package com.dynatrace.android.callback;

import YU.a;
import com.dynatrace.android.callback.CbConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
abstract class WebReqStateParms {

    /* renamed from: a, reason: collision with root package name */
    public String f14147a;
    public CbConstants.WrMethod b;
    public CbConstants.WrStates c;
    public int d;
    public String e;
    public long f;
    public long g;
    public boolean h;
    public String i;
    public Exception j;
    public HashMap k;
    public HashMap l;

    public abstract String a();

    public abstract String b();

    public final String toString() {
        CbConstants.WrStates wrStates = this.c;
        String strA = a();
        CbConstants.WrMethod wrMethod = this.b;
        String strB = b();
        StringBuilder sb = new StringBuilder();
        sb.append(wrStates);
        sb.append(" of ");
        sb.append(strA);
        sb.append(".");
        sb.append(wrMethod);
        return a.o(sb, " to ", strB);
    }
}
