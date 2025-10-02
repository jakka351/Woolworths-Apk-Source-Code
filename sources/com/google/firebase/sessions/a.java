package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ a(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return DataStoreFile.a(this.e, "aqs/sessionConfigsDataStore.data");
            default:
                return DataStoreFile.a(this.e, "aqs/sessionDataStore.data");
        }
    }
}
