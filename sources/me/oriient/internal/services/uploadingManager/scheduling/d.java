package me.oriient.internal.services.uploadingManager.scheduling;

import android.content.Context;
import android.os.BaseBundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public final class d {
    public static Object a(Context context, BaseBundle baseBundle, DataUploadScheduler.WakeUpReason wakeUpReason, SuspendLambda suspendLambda) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String string;
        Unit unit = Unit.f24250a;
        if (baseBundle == null || (string = baseBundle.getString("class_name_key")) == null) {
            me.oriient.internal.services.uploadingManager.temp.a.a("failed to find any class name in 'class_name_key'");
            return unit;
        }
        try {
            Constructor<?>[] constructors = Class.forName(string, false, context.getApplicationContext().getClassLoader()).getConstructors();
            Intrinsics.g(constructors, "getConstructors(...)");
            Object objNewInstance = ((Constructor) ArraysKt.G(constructors)).newInstance(null);
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork");
            DataUploadScheduledWork dataUploadScheduledWork = (DataUploadScheduledWork) objNewInstance;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "getApplicationContext(...)");
            Object objExecute = dataUploadScheduledWork.execute(applicationContext, wakeUpReason, suspendLambda);
            return objExecute == CoroutineSingletons.d ? objExecute : unit;
        } catch (Exception unused) {
            me.oriient.internal.services.uploadingManager.temp.a.a("failed to instantiate " + string + " for scheduled uploading");
            return unit;
        }
    }
}
