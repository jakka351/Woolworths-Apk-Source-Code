package com.swrve.sdk;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.model.WorkSpec;
import com.swrve.sdk.localstorage.SQLiteLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class SwrveBackgroundEventSender {

    /* renamed from: a, reason: collision with root package name */
    public final SwrveBase f19042a;
    public final Context b;
    public String c;

    public SwrveBackgroundEventSender(SwrveBase swrveBase, Context context) {
        this.f19042a = swrveBase;
        this.b = context;
    }

    public static OneTimeWorkRequest a(String str, ArrayList arrayList) throws IOException {
        Constraints.Builder builder = new Constraints.Builder();
        builder.b(NetworkType.e);
        Constraints constraintsA = builder.a();
        Data.Builder builder2 = new Data.Builder();
        builder2.d("userId", str);
        String[] value = (String[]) arrayList.toArray(new String[arrayList.size()]);
        Intrinsics.h(value, "value");
        builder2.f3897a.put("events", value);
        Data dataA = builder2.a();
        OneTimeWorkRequest.Builder builder3 = new OneTimeWorkRequest.Builder(SwrveBackgroundEventSenderWorker.class);
        WorkSpec workSpec = builder3.c;
        workSpec.j = constraintsA;
        workSpec.e = dataA;
        return (OneTimeWorkRequest) builder3.a();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void b(Data data) {
        Object[] objArr;
        String strB = data.b("userId");
        this.c = strB;
        if (SwrveHelper.p(strB)) {
            SwrveSDKBase.a();
            this.c = SwrveSDKBase.f19075a.getUserId();
        }
        final Object obj = data.f3896a.get("events");
        if (obj instanceof Object[]) {
            int length = ((Object[]) obj).length;
            Function1<Integer, String> function1 = new Function1<Integer, String>(obj) { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
                public final /* synthetic */ Object[] h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.h = (Object[]) obj;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Object obj3 = this.h[((Number) obj2).intValue()];
                    if (obj3 != null) {
                        return (String) obj3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            };
            objArr = new String[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = function1.invoke(Integer.valueOf(i));
            }
        } else {
            objArr = null;
        }
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        List listAsList = Arrays.asList(objArr);
        SwrveBase swrveBase = this.f19042a;
        swrveBase.l.getClass();
        swrveBase.l.getClass();
        SQLiteLocalStorage sQLiteLocalStorage = new SQLiteLocalStorage(this.b);
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = new SwrveMultiLayerLocalStorage(sQLiteLocalStorage);
        if (!SwrveHelper.o(this.c)) {
            SwrveLogger.e("SwrveBackgroundEventSender: no user to save events log events against.", new Object[0]);
            return;
        }
        String str = this.c;
        String strA = SwrveLocalStorageUtil.a(swrveMultiLayerLocalStorage);
        SwrveLogger.e(YU.a.d(new SwrveEventsManagerImp(this.b, swrveBase.l, swrveBase.t, str, swrveBase.g, SwrveHelper.e(swrveBase.h, swrveBase.i, str), strA).c(listAsList, sQLiteLocalStorage), "SwrveBackgroundEventSender: eventsSent: "), new Object[0]);
    }

    public final void c(String str, ArrayList arrayList) {
        try {
            OneTimeWorkRequest oneTimeWorkRequestA = a(str, arrayList);
            synchronized (this) {
                WorkManager.Companion.a(this.b).a(oneTimeWorkRequestA);
            }
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Error trying to queue events to be sent in the background worker.", e, new Object[0]);
        }
    }
}
