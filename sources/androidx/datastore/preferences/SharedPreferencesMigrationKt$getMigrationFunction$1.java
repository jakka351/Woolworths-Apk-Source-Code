package androidx.datastore.preferences;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "sharedPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
    public /* synthetic */ SharedPreferencesView p;
    public /* synthetic */ Preferences q;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(3, (Continuation) obj3);
        sharedPreferencesMigrationKt$getMigrationFunction$1.p = (SharedPreferencesView) obj;
        sharedPreferencesMigrationKt$getMigrationFunction$1.q = (Preferences) obj2;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        SharedPreferencesView sharedPreferencesView = this.p;
        Preferences preferences = this.q;
        Set setKeySet = preferences.a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).f2589a);
        }
        LinkedHashMap linkedHashMapA = sharedPreferencesView.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferences = new MutablePreferences(MapsKt.s(preferences.a()), false);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String name = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferences.f(PreferencesKeys.a(name), value);
            } else if (value instanceof Float) {
                Intrinsics.h(name, "name");
                mutablePreferences.f(new Preferences.Key(name), value);
            } else if (value instanceof Integer) {
                Intrinsics.h(name, "name");
                mutablePreferences.f(new Preferences.Key(name), value);
            } else if (value instanceof Long) {
                mutablePreferences.f(PreferencesKeys.b(name), value);
            } else if (value instanceof String) {
                mutablePreferences.f(PreferencesKeys.c(name), value);
            } else if (value instanceof Set) {
                mutablePreferences.f(PreferencesKeys.d(name), (Set) value);
            }
        }
        return new MutablePreferences(MapsKt.s(mutablePreferences.a()), true);
    }
}
