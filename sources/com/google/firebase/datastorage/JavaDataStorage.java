package com.google.firebase.datastorage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JavaDataStorage {
    public static final /* synthetic */ KProperty[] d = {Reflection.f24268a.i(new PropertyReference2Impl(JavaDataStorage.class))};

    /* renamed from: a, reason: collision with root package name */
    public final String f15407a;
    public final ThreadLocal b;
    public final DataStore c;

    public JavaDataStorage(Context context, String name) {
        Intrinsics.h(context, "context");
        Intrinsics.h(name, "name");
        this.f15407a = name;
        this.b = new ThreadLocal();
        this.c = (DataStore) PreferenceDataStoreDelegateKt.a(name, null, new d(this, 5), 10).getValue(context, d[0]);
    }

    public final void a(Function1 function1) {
    }

    public final Map b() {
        return (Map) BuildersKt.d(EmptyCoroutineContext.d, new JavaDataStorage$getAllSync$1(this, null));
    }

    public final Object c(Preferences.Key key) {
        Intrinsics.h(key, "key");
        return BuildersKt.d(EmptyCoroutineContext.d, new JavaDataStorage$getSync$1(this, key, null));
    }

    public final void d(Preferences.Key key, Long l) {
        Intrinsics.h(key, "key");
    }
}
