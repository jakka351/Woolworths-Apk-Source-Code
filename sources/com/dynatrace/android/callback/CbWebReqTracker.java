package com.dynatrace.android.callback;

import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.callback.CbConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
final class CbWebReqTracker {
    public static final String l;

    /* renamed from: a, reason: collision with root package name */
    public final Session f14141a;
    public final DTXAutoAction b;
    public boolean c;
    public WebReqTag d;
    public long e;
    public long f;
    public String g;
    public long h = -1;
    public long i = -1;
    public HashMap j = null;
    public HashMap k = null;

    /* renamed from: com.dynatrace.android.callback.CbWebReqTracker$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14142a;

        static {
            int[] iArr = new int[CbConstants.WrStates.values().length];
            f14142a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14142a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14142a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14142a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        boolean z = Global.f14077a;
        l = "dtxCbWebReqTracker";
    }

    public CbWebReqTracker(DTXAutoAction dTXAutoAction, Session session) {
        this.b = dTXAutoAction;
        this.f14141a = session;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.c));
        sb.append("&&");
        sb.append(String.valueOf(this.e));
        sb.append("&&");
        sb.append(String.valueOf(this.f));
        sb.append("&&");
        sb.append(String.valueOf(this.g));
        sb.append("&&");
        WebReqTag webReqTag = this.d;
        if (webReqTag != null) {
            sb.append(webReqTag.toString());
            sb.append("&&");
        } else {
            sb.append("NA&&");
        }
        DTXAutoAction dTXAutoAction = this.b;
        if (dTXAutoAction != null) {
            sb.append(dTXAutoAction.f().toString());
            sb.append("&&");
        } else {
            sb.append("NA&&");
        }
        sb.append("NA");
        return sb.toString();
    }
}
