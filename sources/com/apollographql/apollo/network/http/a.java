package com.apollographql.apollo.network.http;

import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Call.Factory) ((JvmHttpEngine) this.e).d.invoke();
            default:
                return (OkHttpClient) this.e;
        }
    }
}
