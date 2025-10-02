package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JavaDataStorageKt {
    public static final Object a(MutablePreferences mutablePreferences, Preferences.Key key, Serializable serializable) {
        Intrinsics.h(mutablePreferences, "<this>");
        Intrinsics.h(key, "key");
        Object objB = mutablePreferences.b(key);
        return objB == null ? serializable : objB;
    }
}
