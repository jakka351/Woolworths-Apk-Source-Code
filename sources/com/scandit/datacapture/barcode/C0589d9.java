package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertySubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.d9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0589d9 extends NativePropertyBehaviorSubject {

    /* renamed from: a, reason: collision with root package name */
    private final String f17596a;
    private ArrayList b;
    private JSONObject c;

    public C0589d9(String keyName) throws JSONException {
        Intrinsics.h(keyName, "keyName");
        this.f17596a = keyName;
        this.b = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", keyName);
        jSONObject.put("value", (Object) null);
        this.c = jSONObject;
    }

    public final String a() {
        return this.f17596a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject
    public final void addSubscriber(NativePropertySubscriber nativePropertySubscriber) {
        ArrayList arrayList = this.b;
        Intrinsics.h(arrayList, "<this>");
        if (nativePropertySubscriber != null) {
            arrayList.add(nativePropertySubscriber);
        }
        if (nativePropertySubscriber != null) {
            List listQ = CollectionsKt.Q(nativePropertySubscriber);
            JSONObject jsonObject = this.c;
            Intrinsics.h(jsonObject, "jsonObject");
            String string = jsonObject.toString();
            Intrinsics.g(string, "jsonObject.toString()");
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                ((NativePropertySubscriber) it.next()).onPropertyChanged(new JSONObject(string));
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject
    public final void removeSubscriber(NativePropertySubscriber nativePropertySubscriber) {
        ArrayList arrayList = this.b;
        Intrinsics.h(arrayList, "<this>");
        if (nativePropertySubscriber != null) {
            arrayList.remove(nativePropertySubscriber);
        }
    }

    public final void a(JSONObject newValue) {
        Intrinsics.h(newValue, "newValue");
        if (newValue.equals(this.c)) {
            return;
        }
        ArrayList arrayList = this.b;
        Intrinsics.h(arrayList, "<this>");
        String string = newValue.toString();
        Intrinsics.g(string, "jsonObject.toString()");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NativePropertySubscriber) it.next()).onPropertyChanged(new JSONObject(string));
        }
        this.c = newValue;
    }
}
