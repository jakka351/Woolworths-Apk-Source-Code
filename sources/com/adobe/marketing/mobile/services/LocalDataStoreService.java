package com.adobe.marketing.mobile.services;

import android.content.Context;
import android.content.SharedPreferences;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;

/* loaded from: classes.dex */
class LocalDataStoreService implements DataStoring {
    @Override // com.adobe.marketing.mobile.services.DataStoring
    public final NamedCollection a(String str) {
        if (str.isEmpty()) {
            Log.b("Services", "LocalDataStoreService", YU.a.h("Failed to create an instance of NamedCollection with name - ", str, ": the collection name is null or empty."), new Object[0]);
            return null;
        }
        ServiceProvider.ServiceProviderSingleton.f13239a.getClass();
        Context contextA = App.f13247a.a();
        if (contextA == null) {
            Log.b("Services", "LocalDataStoreService", YU.a.h("Failed to create an instance of NamedCollection with name - ", str, ": the ApplicationContext is null"), new Object[0]);
            return null;
        }
        SharedPreferences sharedPreferences = contextA.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (sharedPreferences != null && editorEdit != null) {
            return new SharedPreferencesNamedCollection(sharedPreferences, editorEdit);
        }
        Log.b("Services", "LocalDataStoreService", "Failed to create a valid SharedPreferences object or SharedPreferences.Editor object", new Object[0]);
        return null;
    }
}
