package androidx.datastore.preferences;

import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements Function2<Preferences, Continuation<? super Boolean>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ Set q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set set, Continuation continuation) {
        super(2, continuation);
        this.q = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.q, continuation);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.p = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Set setKeySet = ((Preferences) this.p).a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).f2589a);
        }
        LinkedHashSet linkedHashSet = SharedPreferencesMigrationKt.f2585a;
        boolean z = true;
        Set set = this.q;
        if (set != linkedHashSet) {
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
