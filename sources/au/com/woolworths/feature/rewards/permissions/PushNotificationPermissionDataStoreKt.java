package au.com.woolworths.feature.rewards.permissions;

import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"permissions_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushNotificationPermissionDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f6415a = {Reflection.f24268a.h(new PropertyReference1Impl(PushNotificationPermissionDataStoreKt.class, "pushNotificationPermissionDataStore", "getPushNotificationPermissionDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final PreferenceDataStoreSingletonDelegate b = PreferenceDataStoreDelegateKt.a("pushNotificationPermission", null, null, 14);
}
